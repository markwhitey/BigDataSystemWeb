package com.itwang.controller;

import com.itwang.service.BaseInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ProjectName: SchoolBigDataAnalysisWeb
 * @Package: com.itwang.controller
 * @ClassName: BaseInfoController
 * @Author: hadoop
 * @Description:
 * @Date: 2019-04-20 16:06
 * @Version: 1.0
 */
@Controller
public class BaseInfoController {
    Logger logger = LoggerFactory.getLogger(BaseInfoController.class);
    @Autowired
    private BaseInfoService baseInfoService;

    @RequestMapping("/getAllInstitution")
    @ResponseBody
    public List<String> getAllInstitution(){
        List<String> allInstitution = baseInfoService.getAllInstitution();
        return allInstitution;
    }
    @RequestMapping("/getBaseInfo")
    @ResponseBody
    public String getBaseInfo(){
        logger.info("getBaseInfo开始");
        baseInfoService.getBaseInfo();
        logger.info("getBaseInfo结束");
        return "success";
    }
}
