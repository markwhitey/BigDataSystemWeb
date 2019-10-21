package com.itwang.mapper;

import com.itwang.pojo.ConsumeFreqKmeans;
import com.itwang.pojo.ConsumeFreqKmeansExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ConsumeFreqKmeansMapper {
    int countByExample(ConsumeFreqKmeansExample example);

    int deleteByExample(ConsumeFreqKmeansExample example);

    int deleteByPrimaryKey(String outid);

    int insert(ConsumeFreqKmeans record);

    int insertSelective(ConsumeFreqKmeans record);

    List<ConsumeFreqKmeans> selectByExample(ConsumeFreqKmeansExample example);

    ConsumeFreqKmeans selectByPrimaryKey(String outid);

    int updateByExampleSelective(@Param("record") ConsumeFreqKmeans record, @Param("example") ConsumeFreqKmeansExample example);

    int updateByExample(@Param("record") ConsumeFreqKmeans record, @Param("example") ConsumeFreqKmeansExample example);

    int updateByPrimaryKeySelective(ConsumeFreqKmeans record);

    int updateByPrimaryKey(ConsumeFreqKmeans record);
    List<ConsumeFreqKmeans> selectPercent(@Param("grade") String grade, @Param("interest") String interest);
    List<ConsumeFreqKmeans> selectByOutidLike(List list);
}