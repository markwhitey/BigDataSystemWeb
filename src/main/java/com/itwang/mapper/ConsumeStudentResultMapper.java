package com.itwang.mapper;

import com.itwang.pojo.ConsumeStudentResult;
import com.itwang.pojo.ConsumeStudentResultExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ConsumeStudentResultMapper {
    int countByExample(ConsumeStudentResultExample example);

    int deleteByExample(ConsumeStudentResultExample example);

    int insert(ConsumeStudentResult record);

    int insertSelective(ConsumeStudentResult record);

    List<ConsumeStudentResult> selectByExample(ConsumeStudentResultExample example);

    int updateByExampleSelective(@Param("record") ConsumeStudentResult record, @Param("example") ConsumeStudentResultExample example);

    int updateByExample(@Param("record") ConsumeStudentResult record, @Param("example") ConsumeStudentResultExample example);
}