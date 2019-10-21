package com.itwang.controller;

import com.itwang.mapper.*;
import com.itwang.pojo.*;
import com.itwang.service.IDCardInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @ProjectName: SchoolBigDataAnalysisWeb
 * @Package: com.itwang.controller
 * @ClassName: GenerateUserTagTest
 * @Author: hadoop
 * @Description:
 * @Date: 2019-04-09 20:14
 * @Version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:spring/applicationContext-*.xml"})
public class GenerateUserTagTest {
    @Autowired
    private BaseinfoMapper baseinfoMapper;
    @Autowired
    private MBaseCustomerscardMapper mBaseCustomerscardMapper;
    @Autowired
    private IDCardInfoService idCardInfoService;
    @Test
    public void updateBaseInfoTest(){
        BaseinfoExample example = new BaseinfoExample();
        List<Baseinfo> baseinfos = baseinfoMapper.selectByExample(example);
        for (Baseinfo b : baseinfos) {
            String sheng = b.getSheng();
            String shi = b.getShi();
            //将省份进行分割
            if (sheng.endsWith("省") && sheng.length() > 1) {
                b.setSheng(sheng.split("省")[0]);
            }else if(sheng.equals("宁夏回族自治区")){
                b.setSheng("宁夏");
            }else if(sheng.equals("内蒙古自治区")){
                b.setSheng("内蒙古");
            }else if(sheng.equals("广西壮族自治区")){
                b.setSheng("广西");
            }else if(sheng.equals("新疆维吾尔自治区")){
                b.setSheng("新疆");
            }else if(sheng.equals("西藏自治区")){
                b.setSheng("西藏");
            }else if(sheng.endsWith("市")){
                b.setSheng(sheng.split("市")[0]);
            }
            //对市进行分割
            if (shi.endsWith("市") && shi.length() > 1) {
                b.setShi(shi.split("市")[0]);
            }
            baseinfoMapper.updateByPrimaryKey(b);
        }
    }
    //获取基本信息
    @Test
    public void getBaseInfo(){
        List<String> list = new ArrayList<>();
        list.add("2013");
        list.add("2014");
        list.add("2015");
        list.add("2016");
        list.add("2017");
        list.add("2018");
        List<MBaseCustomerscard> mBaseCustomerscards = mBaseCustomerscardMapper.selectByOutidLike(list);
        for (MBaseCustomerscard mBaseCustomerscard : mBaseCustomerscards) {
            String outid = mBaseCustomerscard.getOutid();
            String idcardno = mBaseCustomerscard.getIdcardno();
            String xueyuan = mBaseCustomerscard.getDpfullname().split("/")[0];
            String name = mBaseCustomerscard.getName();
            String xingzuo = idCardInfoService.getUserConstellationFromIDCard(idcardno);
            String provinceshi = idCardInfoService.getUserProvinceInfoFromIDCard(idcardno);
            String province = idCardInfoService.getUserProvinceInfoFromIDCard2(idcardno);

            if (xingzuo != null && province != null && provinceshi != null){
                Baseinfo baseinfo = new Baseinfo();
                baseinfo.setOuid(outid);
                baseinfo.setName(name);
                baseinfo.setDept(xueyuan);
                baseinfo.setIdcard(idcardno);
                baseinfo.setXingzuo(xingzuo);
                baseinfo.setSheng(province);
                baseinfo.setShi(provinceshi);
                int insert = baseinfoMapper.insert(baseinfo);
                System.out.println(insert);
            }
        }
    }
}