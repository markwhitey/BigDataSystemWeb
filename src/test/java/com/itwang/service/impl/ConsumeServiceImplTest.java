package com.itwang.service.impl;

import com.itwang.pojo.*;
import com.itwang.service.ConsumeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: SchoolBigDataAnalysisWeb
 * @Package: com.itwang.service.impl
 * @ClassName: ConsumeServiceImplTest
 * @Author: hadoop
 * @Description:
 * @Date: 2019-04-18 17:05
 * @Version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/applicationContext-*.xml"})
public class ConsumeServiceImplTest {
    @Autowired
    private ConsumeService consumeService;

    @Test
    public void getEachXingZuoConsume(){
        List<XingZuoRank> eachXingZuoConsume = consumeService.getEachXingZuoConsume("2015");
        List<XingZuoRank> eachXingZuoConsume1 = consumeService.getEachXingZuoConsume(null);
    }

    @Test
    public void getEachProvinceConsume() {
        List<ProvinceConsumeRank> eachProvinceConsume = consumeService.getEachProvinceConsume("2015");
    }

    @Test
    public void getAllInstitutionRank() {
        List<InstitutionConsumeRank> allInstitutionRank = consumeService.getAllInstitutionRank(null);
    }

    @Test
    public void getPersonConsumeTotal() {
        ConsumeTotalResult personConsumeTotal = consumeService.getPersonConsumeTotal("201508040134");
    }

    @Test
    public void getPersonConsumeFreq() {
        List<ConsumeStudentResult> personConsumeFreq = consumeService.getPersonConsumeFreq("201508040134");
    }

    @Test
    public void getConsumeTotalPercent() {
        Map<String, Integer> consumeTotalPercent = consumeService.getConsumeTotalPercent("2015");
        for (Map.Entry<String,Integer> s : consumeTotalPercent.entrySet()){
            System.out.println(s.getKey() + "\t" + s.getValue());
        }
    }

    @Test
    public void getConsumeFrequencyPercent() {
        Map<String, Integer> consumeFrequencyPercent = consumeService.getConsumeFrequencyPercent("2015");
        for (Map.Entry<String,Integer> s : consumeFrequencyPercent.entrySet()){
            System.out.println(s.getKey() + "\t" + s.getValue());
        }
    }
}