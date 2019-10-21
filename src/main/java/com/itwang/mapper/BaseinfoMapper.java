package com.itwang.mapper;

import com.itwang.pojo.Baseinfo;
import com.itwang.pojo.BaseinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaseinfoMapper {
    int countByExample(BaseinfoExample example);

    int deleteByExample(BaseinfoExample example);

    int deleteByPrimaryKey(String ouid);

    int insert(Baseinfo record);

    int insertSelective(Baseinfo record);

    List<Baseinfo> selectByExample(BaseinfoExample example);

    Baseinfo selectByPrimaryKey(String ouid);

    int updateByExampleSelective(@Param("record") Baseinfo record, @Param("example") BaseinfoExample example);

    int updateByExample(@Param("record") Baseinfo record, @Param("example") BaseinfoExample example);

    int updateByPrimaryKeySelective(Baseinfo record);

    int updateByPrimaryKey(Baseinfo record);

    List<String> selectAllInstitution();
}