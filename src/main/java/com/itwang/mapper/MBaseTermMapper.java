package com.itwang.mapper;

import com.itwang.pojo.MBaseTerm;
import com.itwang.pojo.MBaseTermExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MBaseTermMapper {
    int countByExample(MBaseTermExample example);

    int deleteByExample(MBaseTermExample example);

    int insert(MBaseTerm record);

    int insertSelective(MBaseTerm record);

    List<MBaseTerm> selectByExample(MBaseTermExample example);

    int updateByExampleSelective(@Param("record") MBaseTerm record, @Param("example") MBaseTermExample example);

    int updateByExample(@Param("record") MBaseTerm record, @Param("example") MBaseTermExample example);
}