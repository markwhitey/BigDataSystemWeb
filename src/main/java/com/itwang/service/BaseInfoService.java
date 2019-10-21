package com.itwang.service;

import java.util.List;

/**
 * @ProjectName: SchoolBigDataAnalysisWeb
 * @Package: com.itwang.service
 * @ClassName: BaseInfoService
 * @Author: hadoop
 * @Description:
 * @Date: 2019-04-20 15:58
 * @Version: 1.0
 */
public interface BaseInfoService {
    //获取所有的学院
    public List<String> getAllInstitution();
    public void getBaseInfo();
}
