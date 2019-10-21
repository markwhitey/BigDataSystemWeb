package com.itwang.mapper;

import com.itwang.pojo.ConsumeTotalKmeans;
import com.itwang.pojo.ConsumeTotalKmeansExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ConsumeTotalKmeansMapper {
    int countByExample(ConsumeTotalKmeansExample example);

    int deleteByExample(ConsumeTotalKmeansExample example);

    int deleteByPrimaryKey(String outid);

    int insert(ConsumeTotalKmeans record);

    int insertSelective(ConsumeTotalKmeans record);

    List<ConsumeTotalKmeans> selectByExample(ConsumeTotalKmeansExample example);

    ConsumeTotalKmeans selectByPrimaryKey(String outid);

    int updateByExampleSelective(@Param("record") ConsumeTotalKmeans record, @Param("example") ConsumeTotalKmeansExample example);

    int updateByExample(@Param("record") ConsumeTotalKmeans record, @Param("example") ConsumeTotalKmeansExample example);

    int updateByPrimaryKeySelective(ConsumeTotalKmeans record);

    int updateByPrimaryKey(ConsumeTotalKmeans record);

    List<ConsumeTotalKmeans> selectPercent(@Param("grade") String grade, @Param("interest") String interest);
    List<ConsumeTotalKmeans> selectByOutidLike(List list);
}