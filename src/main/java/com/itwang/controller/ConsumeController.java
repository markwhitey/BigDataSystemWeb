package com.itwang.controller;

import com.itwang.pojo.*;
import com.itwang.service.ConsumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: SchoolBigDataAnalysisWeb
 * @Package: com.itwang.controller
 * @ClassName: ConsumeController
 * @Author: hadoop
 * @Description:
 * @Date: 2019-04-16 13:48
 * @Version: 1.0
 */
@Controller
@RequestMapping("/consume")
public class ConsumeController {
    @Autowired
    private ConsumeService consumeService;

    //统计各个省份消费
    @RequestMapping("/getEachProvinceConsume")
    @ResponseBody
    public List<ProvinceConsumeRank> getEachProvinceConsume(String grade){
        return consumeService.getEachProvinceConsume(grade);
    }
    //统计各个星座的消费排行
    @RequestMapping("/getEachXingZuoConsume")
    @ResponseBody
    public List<XingZuoRank> getEachXingZuoConsume(String grade){
        return consumeService.getEachXingZuoConsume(grade);
    }
    //全校各个学院消费排行榜
    @RequestMapping("/getAllInstitutionRank")
    @ResponseBody
    public List<InstitutionConsumeRank> getAllInstitutionRank(String grade){
        return consumeService.getAllInstitutionRank(grade);
    }

    //个人消费13-18平均消费总计和消费频次
    @RequestMapping("/getPersonConsumeDetail")
    @ResponseBody
    public Map<String,Object> getPersonConsumeDetail(String outid){
        Map<String,Object> map = new HashMap<>();
        ConsumeTotalResult personConsumeTotal = consumeService.getPersonConsumeTotal(outid);
        List<ConsumeStudentResult> personConsumeFreq = consumeService.getPersonConsumeFreq(outid);
        map.put("total",personConsumeTotal);
        map.put("items", personConsumeFreq);
        return map;
    }
    //统计出学生总消费水平聚类百分比
    @RequestMapping("/getConsumeTotalPercent")
    @ResponseBody
    public Map<String, Integer> getConsumeTotalPercent(String grade){
        return consumeService.getConsumeTotalPercent(grade);
    }
    //统计出学生消费规律百分比
    @RequestMapping("/getConsumeFrequencyPercent")
    @ResponseBody
    public Map<String, Integer> getConsumeFrequencyPercent(String grade){
        return consumeService.getConsumeFrequencyPercent(grade);
    }
}
