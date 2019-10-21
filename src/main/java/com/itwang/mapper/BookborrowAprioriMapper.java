package com.itwang.mapper;

import com.itwang.pojo.BookborrowApriori;
import com.itwang.pojo.BookborrowAprioriExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookborrowAprioriMapper {
    int countByExample(BookborrowAprioriExample example);

    int deleteByExample(BookborrowAprioriExample example);

    int insert(BookborrowApriori record);

    int insertSelective(BookborrowApriori record);

    List<BookborrowApriori> selectByExampleWithBLOBs(BookborrowAprioriExample example);

    List<BookborrowApriori> selectByExample(BookborrowAprioriExample example);

    int updateByExampleSelective(@Param("record") BookborrowApriori record, @Param("example") BookborrowAprioriExample example);

    int updateByExampleWithBLOBs(@Param("record") BookborrowApriori record, @Param("example") BookborrowAprioriExample example);

    int updateByExample(@Param("record") BookborrowApriori record, @Param("example") BookborrowAprioriExample example);
}