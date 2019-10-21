package com.itwang.mapper;

import com.itwang.pojo.BookcatApriori;
import com.itwang.pojo.BookcatAprioriExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookcatAprioriMapper {
    int countByExample(BookcatAprioriExample example);

    int deleteByExample(BookcatAprioriExample example);

    int insert(BookcatApriori record);

    int insertSelective(BookcatApriori record);

    List<BookcatApriori> selectByExampleWithBLOBs(BookcatAprioriExample example);

    List<BookcatApriori> selectByExample(BookcatAprioriExample example);

    int updateByExampleSelective(@Param("record") BookcatApriori record, @Param("example") BookcatAprioriExample example);

    int updateByExampleWithBLOBs(@Param("record") BookcatApriori record, @Param("example") BookcatAprioriExample example);

    int updateByExample(@Param("record") BookcatApriori record, @Param("example") BookcatAprioriExample example);
}