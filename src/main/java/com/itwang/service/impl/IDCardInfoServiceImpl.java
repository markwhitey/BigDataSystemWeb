package com.itwang.service.impl;

import com.itwang.mapper.MBaseCustomerscardMapper;
import com.itwang.mapper.ProvinceMapper;
import com.itwang.pojo.MBaseCustomerscard;
import com.itwang.pojo.MBaseCustomerscardExample;
import com.itwang.pojo.Province;
import com.itwang.pojo.ProvinceExample;
import com.itwang.service.IDCardInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: SchoolBigDataAnalysisWeb
 * @Package: com.itwang.common
 * @ClassName: IDCardInfo
 * @Author: hadoop
 * @Description:
 * @Date: 2019-04-10 11:19
 * @Version: 1.0
 */
@Service
public class IDCardInfoServiceImpl implements IDCardInfoService {
    Logger logger = LoggerFactory.getLogger(IDCardInfoServiceImpl.class);
    @Autowired
    private ProvinceMapper provinceMapper;
    @Autowired
    private MBaseCustomerscardMapper mBaseCustomerscardMapper;

    //根据学号判断该学生属于哪个学院
    public String getUserInstitution(String outid) {
        MBaseCustomerscardExample example = new MBaseCustomerscardExample();
        MBaseCustomerscardExample.Criteria criteria = example.createCriteria();
        criteria.andOutidEqualTo(outid);
        List<MBaseCustomerscard> mBaseCustomerscards = mBaseCustomerscardMapper.selectByExample(example);
        if (mBaseCustomerscards != null && mBaseCustomerscards.size() > 0){
            return mBaseCustomerscards.get(0).getDpfullname().split("/")[0];
        }
        return null;
    }

    //根据身份证的前4为获取学生所在市
    public String getUserProvinceInfoFromIDCard(String idCardNo) {
        logger.info("获取市"+idCardNo);
        if (idCardNo != null && !"".equals(idCardNo) && idCardNo.length() > 14){
            String province = idCardNo.substring(0, 4) + "00";
            ProvinceExample provinceExample = new ProvinceExample();
            ProvinceExample.Criteria criteria = provinceExample.createCriteria();
            criteria.andIdEqualTo(province);
            List<Province> provinces = provinceMapper.selectByExampleWithBLOBs(provinceExample);
            if (provinces != null && provinces.size() > 0){
                String shi = provinces.get(0).getProvince();
                //对市进行分割
                if (shi.endsWith("市") && shi.length() > 1) {
                    return shi.split("市")[0];
                }else{
                    return shi;
                }
            }
        }
        return null;
    }

    //根据身份证的前2为获取学生所在省
    public String getUserProvinceInfoFromIDCard2(String idCardNo) {
        logger.info("获取省"+ idCardNo);
        if (idCardNo != null && !"".equals(idCardNo) && idCardNo.length() > 14){
            String province = idCardNo.substring(0, 2) + "0000";

            ProvinceExample provinceExample = new ProvinceExample();
            ProvinceExample.Criteria criteria = provinceExample.createCriteria();
            criteria.andIdEqualTo(province);
            List<Province> provinces = provinceMapper.selectByExampleWithBLOBs(provinceExample);
            if (provinces != null && provinces.size() > 0){
                String sheng = provinces.get(0).getProvince();
                //将省份进行分割
                if (sheng.endsWith("省") && sheng.length() > 1) {
                    return sheng.split("省")[0];
                }else if(sheng.equals("宁夏回族自治区")){
                    return "宁夏";
                }else if(sheng.equals("内蒙古自治区")){
                    return "内蒙古";
                }else if(sheng.equals("广西壮族自治区")){
                    return "广西";
                }else if(sheng.equals("新疆维吾尔自治区")){
                    return "新疆";
                }else if(sheng.equals("西藏自治区")){
                    return "西藏";
                }else if(sheng.endsWith("市") && sheng.length() > 1){
                   return sheng.split("市")[0];
                }else{
                    return sheng;
                }
            }
        }
        return null;
    }

    //根据学生的出生年月，得出星座
    public String getUserConstellationFromIDCard(String idCardNo) {
        if (idCardNo != null && !"".equals(idCardNo) && idCardNo.length() > 14){
            String birthday = idCardNo.substring(10, 14);
            String constellation = "";
            if (birthday.compareTo("0120") >= 0 && birthday.compareTo("0218") <= 0) {
                constellation = "水瓶座";
            } else if (birthday.compareTo("0219") >= 0 && birthday.compareTo("0320") <= 0) {
                constellation = "双鱼座";
            } else if (birthday.compareTo("0321") >= 0 && birthday.compareTo("0419") <= 0) {
                constellation = "白羊座";
            } else if (birthday.compareTo("0420") >= 0 && birthday.compareTo("0520") <= 0) {
                constellation = "金牛座";
            } else if (birthday.compareTo("0521") >= 0 && birthday.compareTo("0621") <= 0) {
                constellation = "双子座";
            } else if (birthday.compareTo("0622") >= 0 && birthday.compareTo("0722") <= 0) {
                constellation = "巨蟹座";
            } else if (birthday.compareTo("0723") >= 0 && birthday.compareTo("0822") <= 0) {
                constellation = "狮子座";
            } else if (birthday.compareTo("0823") >= 0 && birthday.compareTo("0922") <= 0) {
                constellation = "处女座";
            } else if (birthday.compareTo("0923") >= 0 && birthday.compareTo("1023") <= 0) {
                constellation = "天秤座";
            } else if (birthday.compareTo("1024") >= 0 && birthday.compareTo("1122") <= 0) {
                constellation = "天蝎座";
            } else if (birthday.compareTo("1123") >= 0 && birthday.compareTo("1221") <= 0) {
                constellation = "射手座";
            } else {
                constellation = "摩羯座";
            }
            return constellation;
        }
        return null;
    }

    public static void main(String[] args) {
        IDCardInfoServiceImpl idCardInfoService = new IDCardInfoServiceImpl();
        String userConstellationFromIDCard = idCardInfoService.getUserConstellationFromIDCard("412823199506011610");
        System.out.println(userConstellationFromIDCard);
    }
}
