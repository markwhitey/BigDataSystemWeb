package com.itwang.service;

import com.itwang.pojo.*;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: SchoolBigDataAnalysisWeb
 * @Package: com.itwang.service
 * @ClassName: ConsumeService
 * @Author: hadoop
 * @Description:
 * @Date: 2019-04-16 11:19
 * @Version: 1.0
 */
public interface ConsumeService {
    //统计各个省份消费
    public List<ProvinceConsumeRank> getEachProvinceConsume(String grade);
    //统计各个星座的消费排行
    public List<XingZuoRank> getEachXingZuoConsume(String grade);
    //全校各个学院消费排行榜
    public List<InstitutionConsumeRank> getAllInstitutionRank(String grade);

    //个人消费13-18平均消费总计和消费频次
    public ConsumeTotalResult getPersonConsumeTotal(String outid);
    //个人早餐、午餐、晚餐等总消费频次展示
    public List<ConsumeStudentResult> getPersonConsumeFreq(String outid);
    //建议

    //统计出学生总消费水平聚类百分比
    public Map<String, Integer> getConsumeTotalPercent(String grade);
    //统计出学生消费规律百分比
    public Map<String, Integer> getConsumeFrequencyPercent(String grade);
}
