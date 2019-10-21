package com.itwang.service;

/**
 * @ProjectName: SchoolBigDataAnalysisWeb
 * @Package: com.itwang.service
 * @ClassName: IDCardInfoService
 * @Author: hadoop
 * @Description:
 * @Date: 2019-04-18 21:08
 * @Version: 1.0
 */
public interface IDCardInfoService {
    public String getUserInstitution(String outid);
    public String getUserProvinceInfoFromIDCard(String idCardNo);
    public String getUserProvinceInfoFromIDCard2(String idCardNo);
    public String getUserConstellationFromIDCard(String idCardNo);
}
