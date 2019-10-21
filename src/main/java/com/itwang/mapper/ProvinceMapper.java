package com.itwang.mapper;

import com.itwang.pojo.Province;
import com.itwang.pojo.ProvinceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProvinceMapper {
    int countByExample(ProvinceExample example);

    int deleteByExample(ProvinceExample example);

    int insert(Province record);

    int insertSelective(Province record);

    List<Province> selectByExampleWithBLOBs(ProvinceExample example);

    List<Province> selectByExample(ProvinceExample example);

    int updateByExampleSelective(@Param("record") Province record, @Param("example") ProvinceExample example);

    int updateByExampleWithBLOBs(@Param("record") Province record, @Param("example") ProvinceExample example);

    int updateByExample(@Param("record") Province record, @Param("example") ProvinceExample example);
}