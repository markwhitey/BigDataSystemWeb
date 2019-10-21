package com.itwang.mapper;

import com.itwang.pojo.MBaseCustomerscard;
import com.itwang.pojo.MBaseCustomerscardExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface MBaseCustomerscardMapper {
    int countByExample(MBaseCustomerscardExample example);

    int deleteByExample(MBaseCustomerscardExample example);

    int insert(MBaseCustomerscard record);

    int insertSelective(MBaseCustomerscard record);

    List<MBaseCustomerscard> selectByExample(MBaseCustomerscardExample example);

    int updateByExampleSelective(@Param("record") MBaseCustomerscard record, @Param("example") MBaseCustomerscardExample example);

    int updateByExample(@Param("record") MBaseCustomerscard record, @Param("example") MBaseCustomerscardExample example);

    //根据outid的学号多个like模糊查询
    List<MBaseCustomerscard> selectByOutidLike(List list);

}