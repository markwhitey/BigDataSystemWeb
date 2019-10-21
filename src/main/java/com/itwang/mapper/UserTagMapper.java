package com.itwang.mapper;

import com.itwang.pojo.PersonUserTags;
import com.itwang.pojo.UserTag;
import com.itwang.pojo.UserTagExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserTagMapper {
    int countByExample(UserTagExample example);

    int deleteByExample(UserTagExample example);

    int insert(UserTag record);

    int insertSelective(UserTag record);

    List<UserTag> selectByExample(UserTagExample example);

    int updateByExampleSelective(@Param("record") UserTag record, @Param("example") UserTagExample example);

    int updateByExample(@Param("record") UserTag record, @Param("example") UserTagExample example);
    List<PersonUserTags> getUserTagsByOutid(@Param("outid") String outid);
}