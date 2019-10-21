package com.itwang.mapper;

import com.itwang.pojo.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ConsumeTotalResultMapper {
    int countByExample(ConsumeTotalResultExample example);

    int deleteByExample(ConsumeTotalResultExample example);

    int deleteByPrimaryKey(String outid);

    int insert(ConsumeTotalResult record);

    int insertSelective(ConsumeTotalResult record);

    List<ConsumeTotalResult> selectByExample(ConsumeTotalResultExample example);

    ConsumeTotalResult selectByPrimaryKey(String outid);

    int updateByExampleSelective(@Param("record") ConsumeTotalResult record, @Param("example") ConsumeTotalResultExample example);

    int updateByExample(@Param("record") ConsumeTotalResult record, @Param("example") ConsumeTotalResultExample example);

    int updateByPrimaryKeySelective(ConsumeTotalResult record);

    int updateByPrimaryKey(ConsumeTotalResult record);

    //根据outid的学号多个like模糊查询
    List<ConsumeTotalResult> selectByOutidLike(List list);

    List<ProvinceConsumeRank> selectByProvince(@Param("grade") String grade);
    List<InstitutionConsumeRank> selectInstitutionRank(@Param("grade") String grade);
    List<XingZuoRank> selectByXingZuo(@Param("grade") String grade);

}