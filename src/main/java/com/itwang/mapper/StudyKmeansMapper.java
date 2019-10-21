package com.itwang.mapper;

import com.itwang.pojo.StudyKmeans;
import com.itwang.pojo.StudyKmeansExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudyKmeansMapper {
    int countByExample(StudyKmeansExample example);

    int deleteByExample(StudyKmeansExample example);

    int insert(StudyKmeans record);

    int insertSelective(StudyKmeans record);

    List<StudyKmeans> selectByExample(StudyKmeansExample example);

    int updateByExampleSelective(@Param("record") StudyKmeans record, @Param("example") StudyKmeansExample example);

    int updateByExample(@Param("record") StudyKmeans record, @Param("example") StudyKmeansExample example);

    List<StudyKmeans> selectPercent(@Param("grade") String grade, @Param("interest") String interest);
    List<StudyKmeans> selectByOutidLike(List list);
}