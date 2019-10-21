package com.itwang.service.impl;

import com.itwang.mapper.BaseinfoMapper;
import com.itwang.mapper.MBaseCustomerscardMapper;
import com.itwang.pojo.Baseinfo;
import com.itwang.pojo.MBaseCustomerscard;
import com.itwang.service.BaseInfoService;
import com.itwang.service.IDCardInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: SchoolBigDataAnalysisWeb
 * @Package: com.itwang.service.impl
 * @ClassName: BaseInfoServiceImpl
 * @Author: hadoop
 * @Description:
 * @Date: 2019-04-20 15:59
 * @Version: 1.0
 */
@Service
public class BaseInfoServiceImpl implements BaseInfoService {
    Logger logger = LoggerFactory.getLogger(BaseInfoServiceImpl.class);
    @Autowired
    private BaseinfoMapper baseinfoMapper;
    @Autowired
    private MBaseCustomerscardMapper mBaseCustomerscardMapper;
    @Autowired
    private IDCardInfoService idCardInfoService;

    @Override
    public List<String> getAllInstitution() {
        List<String> strings = baseinfoMapper.selectAllInstitution();
        return strings;
    }

    @Override
    public void getBaseInfo() {
        List<String> lists = new ArrayList<>();
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

            if (xingzuo != null && province != null && provinceshi != null) {
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
            }else{
                lists.add(idcardno);
            }
        }
        for (String s: lists){
            System.out.println(s);
        }
    }
}
