package com.itwang.controller;

import com.itwang.pojo.PersonUserTags;
import com.itwang.pojo.UserTag;
import com.itwang.service.UserTagsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: SchoolBigDataAnalysisWeb
 * @Package: com.itwang.common
 * @ClassName: GenerateUserTags
 * @Author: hadoop
 * @Description:
 * @Date: 2019-04-09 20:30
 * @Version: 1.0
 */
@Controller
public class UserTagsControler {
    Logger logger = LoggerFactory.getLogger(UserTagsControler.class);
    @Autowired
    private UserTagsService userTagsService;
    @RequestMapping("/generateUserBaseTag")
    @ResponseBody
    public String generateBaseTag(){
        logger.info("generateBaseTag开始");
        userTagsService.generateBaseTag();
        logger.info("generateBaseTag结束");
        return "success";
    }
    @RequestMapping("/generateStudyTag")
    @ResponseBody
    public String generateStudyTag(){
        logger.info("generateStudyTag开始");
        userTagsService.generateStudyTag();
        logger.info("generateStudyTag结束");
        return "success";
    }
    @RequestMapping("/generateBookTag")
    @ResponseBody
    public String generateBookTag(){
        logger.info("generateBookTag开始");
        userTagsService.generateBookTag();
        logger.info("generateBookTag结束");
        return "success";
    }
    @RequestMapping("/generateConsumeTotalTag")
    @ResponseBody
    public String generateConsumeTotalTag(){
        logger.info("generateConsumeTotalTag开始");
        userTagsService.generateConsumeTotalTag();
        logger.info("generateConsumeTotalTag结束");
        return "success";
    }
    @RequestMapping("/generateConsumeFreqTag")
    @ResponseBody
    public String generateConsumeFreqTag(){
        logger.info("generateConsumeFreqTag开始");
        userTagsService.generateConsumeFreqTag();
        logger.info("generateConsumeFreqTag结束");
        return "success";
    }
    @RequestMapping("/showUserTagsByOutid")
    @ResponseBody
    public Map<String, Object> showUserTagsByOutid(String outid){
        Map<String,Object> map = new HashMap<>();
        if (outid != null && !"".equals(outid)) {
            List<PersonUserTags> userTags = userTagsService.GetUserTagsByOutid(outid);
            for (PersonUserTags u : userTags){
                if (u.getName().equals("男")){
                    map.put("pic", "/resources/man3.png");
                    map.put("data",userTags);
                    return map;
                }
                if (u.getName().equals("女")){
                    map.put("pic","/resources/girl.png");
                    map.put("data",userTags);
                    return map;
                }
            }
            return null;
        }else{
            return null;
        }
    }
    @RequestMapping("/getUserBookTagsByOutid")
    @ResponseBody
    public Map<String, Object> getUserBookTagsByOutid(String outid){
        Map<String,Object> map = new HashMap<>();
        if (outid != null && !"".equals(outid)) {
            List<PersonUserTags> userTags = userTagsService.getUserBookTagsByOutid(outid);
            for (PersonUserTags u : userTags){
                map.put("pic","/resources/girl.png");
                map.put("data",userTags);
                return map;
            }
            return null;
        }else{
            return null;
        }
    }

}
