package com.itwang.mapper;

import com.itwang.pojo.PersonUserTags;
import com.itwang.pojo.Userbooktags;
import com.itwang.pojo.UserbooktagsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserbooktagsMapper {
    int countByExample(UserbooktagsExample example);

    int deleteByExample(UserbooktagsExample example);

    int insert(Userbooktags record);

    int insertSelective(Userbooktags record);

    List<Userbooktags> selectByExample(UserbooktagsExample example);

    int updateByExampleSelective(@Param("record") Userbooktags record, @Param("example") UserbooktagsExample example);

    int updateByExample(@Param("record") Userbooktags record, @Param("example") UserbooktagsExample example);
    List<PersonUserTags> getUserBookTagsByOutid(@Param("outid") String outid);
}