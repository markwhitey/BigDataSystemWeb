package com.itwang.service.impl;

import com.itwang.mapper.*;
import com.itwang.pojo.*;
import com.itwang.service.ConsumeService;
import com.itwang.service.IDCardInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: SchoolBigDataAnalysisWeb
 * @Package: com.itwang.service.impl
 * @ClassName: ConsumeServiceImpl
 * @Author: hadoop
 * @Description:
 * @Date: 2019-04-16 13:47
 * @Version: 1.0
 */
@Service
public class ConsumeServiceImpl implements ConsumeService {
    @Autowired
    private ConsumeTotalKmeansMapper consumeTotalKmeansMapper;
    @Autowired
    private MBaseCustomerscardMapper mBaseCustomerscardMapper;
    @Autowired
    private ConsumeTotalResultMapper consumeTotalResultMapper;
    @Autowired
    private ConsumeStudentResultMapper consumeStudentResultMapper;
    @Autowired
    private ConsumeFreqKmeansMapper consumeFreqKmeansMapper;
    @Autowired
    private IDCardInfoService idCardInfoService;

    @Override
    //全校在13 - 18年内的省份消费
    public List<ProvinceConsumeRank> getEachProvinceConsume(String grade) {
        List<ProvinceConsumeRank> provinceConsumeRanks = null;
        if (grade != null && !"".equals(grade)) {
            provinceConsumeRanks = consumeTotalResultMapper.selectByProvince(grade);
        } else {
            provinceConsumeRanks = consumeTotalResultMapper.selectByProvince(null);
        }

        return provinceConsumeRanks;
    }

    @Override
    public List<XingZuoRank> getEachXingZuoConsume(String grade) {
        List<XingZuoRank> list = null;
        if (grade != null && !"".equals(grade)) {
            list = consumeTotalResultMapper.selectByXingZuo(grade);
        } else {
            list = consumeTotalResultMapper.selectByXingZuo(null);
        }
        return list;
    }


    @Override
    public List<InstitutionConsumeRank> getAllInstitutionRank(String grade) {
        List<InstitutionConsumeRank> institutionConsumeRanks = null;
        if (grade != null && !"".equals(grade)) {
            institutionConsumeRanks = consumeTotalResultMapper.selectInstitutionRank(grade);
        } else {
            institutionConsumeRanks = consumeTotalResultMapper.selectInstitutionRank(null);
        }
        return institutionConsumeRanks;
    }

    @Override
    public ConsumeTotalResult getPersonConsumeTotal(String outid) {
        if (outid != null && !"".equals(outid)){
            ConsumeTotalResult consumeTotalResult = consumeTotalResultMapper.selectByPrimaryKey(outid);
            String double_str = String.format("%.2f", consumeTotalResult.getTotal());
            consumeTotalResult.setTotal(Double.valueOf(double_str));
            return consumeTotalResult;
        }else{
            return null;
        }
    }

    @Override
    public List<ConsumeStudentResult> getPersonConsumeFreq(String outid) {
        if (outid != null && !"".equals(outid)){
            ConsumeStudentResultExample example = new ConsumeStudentResultExample();
            ConsumeStudentResultExample.Criteria criteria = example.createCriteria();
            criteria.andOutidEqualTo(outid);
            List<ConsumeStudentResult> consumeStudentResults = consumeStudentResultMapper.selectByExample(example);
            return consumeStudentResults;
        }else{
            return null;
        }
    }

    @Override
    public Map<String, Integer> getConsumeTotalPercent(String grade) {
        Map<String, Integer> map = new HashMap<>();
        if (grade != null && !"".equals(grade)) {
            //指定某个年级的学生聚类结果
            List<ConsumeTotalKmeans> studyKmeans = consumeTotalKmeansMapper.selectPercent(grade, null);
            int size = studyKmeans.size();
            List<ConsumeTotalKmeans> studyKmeans1 = consumeTotalKmeansMapper.selectPercent(grade, "0");
            List<ConsumeTotalKmeans> studyKmeans2 = consumeTotalKmeansMapper.selectPercent(grade, "1");
            List<ConsumeTotalKmeans> studyKmeans3 = consumeTotalKmeansMapper.selectPercent(grade, "2");
            List<ConsumeTotalKmeans> studyKmeans4 = consumeTotalKmeansMapper.selectPercent(grade, "3");
            int size1 = studyKmeans1.size();
            int size2 = studyKmeans2.size();
            int size3 = studyKmeans3.size();
            int size4 = studyKmeans4.size();
            map.put("one", size1);
            map.put("two", size2);
            map.put("three", size3);
            map.put("four", size4);
        } else {
            //指定某个年级的学生聚类结果
            List<ConsumeTotalKmeans> studyKmeans = consumeTotalKmeansMapper.selectPercent(null, null);
            int size = studyKmeans.size();
            List<ConsumeTotalKmeans> studyKmeans1 = consumeTotalKmeansMapper.selectPercent(null, "0");
            List<ConsumeTotalKmeans> studyKmeans2 = consumeTotalKmeansMapper.selectPercent(null, "1");
            List<ConsumeTotalKmeans> studyKmeans3 = consumeTotalKmeansMapper.selectPercent(null, "2");
            List<ConsumeTotalKmeans> studyKmeans4 = consumeTotalKmeansMapper.selectPercent(null, "3");
            int size1 = studyKmeans1.size();
            int size2 = studyKmeans2.size();
            int size3 = studyKmeans3.size();
            int size4 = studyKmeans4.size();
            map.put("one", size1);
            map.put("two", size2);
            map.put("three", size3);
            map.put("four", size4);
        }
        return map;
    }

    @Override
    public Map<String, Integer> getConsumeFrequencyPercent(String grade) {
        Map<String, Integer> map = new HashMap<>();
        if (grade != null && !"".equals(grade)) {
            //指定某个年级的学生聚类结果
            List<ConsumeFreqKmeans> studyKmeans = consumeFreqKmeansMapper.selectPercent(grade, null);
            int size = studyKmeans.size();
            List<ConsumeFreqKmeans> studyKmeans1 = consumeFreqKmeansMapper.selectPercent(grade, "0");
            List<ConsumeFreqKmeans> studyKmeans2 = consumeFreqKmeansMapper.selectPercent(grade, "1");
            List<ConsumeFreqKmeans> studyKmeans3 = consumeFreqKmeansMapper.selectPercent(grade, "2");
            List<ConsumeFreqKmeans> studyKmeans4 = consumeFreqKmeansMapper.selectPercent(grade, "3");
            int size1 = studyKmeans1.size();
            int size2 = studyKmeans2.size();
            int size3 = studyKmeans3.size();
            int size4 = studyKmeans4.size();
            map.put("one", size1);
            map.put("two", size2);
            map.put("three", size3);
            map.put("four", size4);
        } else {
            //指定某个年级的学生聚类结果
            List<ConsumeFreqKmeans> studyKmeans = consumeFreqKmeansMapper.selectPercent(null, null);
            int size = studyKmeans.size();
            List<ConsumeFreqKmeans> studyKmeans1 = consumeFreqKmeansMapper.selectPercent(null, "0");
            List<ConsumeFreqKmeans> studyKmeans2 = consumeFreqKmeansMapper.selectPercent(null, "1");
            List<ConsumeFreqKmeans> studyKmeans3 = consumeFreqKmeansMapper.selectPercent(null, "2");
            List<ConsumeFreqKmeans> studyKmeans4 = consumeFreqKmeansMapper.selectPercent(null, "3");
            int size1 = studyKmeans1.size();
            int size2 = studyKmeans2.size();
            int size3 = studyKmeans3.size();
            int size4 = studyKmeans4.size();
            map.put("one", size1);
            map.put("two", size2);
            map.put("three", size3);
            map.put("four", size4);
        }
        return map;
    }

}
