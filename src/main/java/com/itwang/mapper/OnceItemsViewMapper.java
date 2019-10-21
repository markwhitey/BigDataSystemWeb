package com.itwang.mapper;

import com.itwang.pojo.OnceItemsView;
import com.itwang.pojo.OnceItemsViewExample;
import com.itwang.pojo.OnceItemsViewWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OnceItemsViewMapper {
    int countByExample(OnceItemsViewExample example);

    int deleteByExample(OnceItemsViewExample example);

    int insert(OnceItemsViewWithBLOBs record);

    int insertSelective(OnceItemsViewWithBLOBs record);

    List<OnceItemsViewWithBLOBs> selectByExampleWithBLOBs(OnceItemsViewExample example);

    List<OnceItemsView> selectByExample(OnceItemsViewExample example);

    int updateByExampleSelective(@Param("record") OnceItemsViewWithBLOBs record, @Param("example") OnceItemsViewExample example);

    int updateByExampleWithBLOBs(@Param("record") OnceItemsViewWithBLOBs record, @Param("example") OnceItemsViewExample example);

    int updateByExample(@Param("record") OnceItemsView record, @Param("example") OnceItemsViewExample example);
}