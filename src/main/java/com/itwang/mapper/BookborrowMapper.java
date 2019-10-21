package com.itwang.mapper;

import com.itwang.pojo.BookBorrowRank;
import com.itwang.pojo.Bookborrow;
import com.itwang.pojo.BookborrowExample;
import org.apache.ibatis.annotations.Param;

import java.awt.print.Book;
import java.util.List;

public interface BookborrowMapper {
    int countByExample(BookborrowExample example);

    int deleteByExample(BookborrowExample example);

    int insert(Bookborrow record);

    int insertSelective(Bookborrow record);

    List<Bookborrow> selectByExample(BookborrowExample example);

    int updateByExampleSelective(@Param("record") Bookborrow record, @Param("example") BookborrowExample example);

    int updateByExample(@Param("record") Bookborrow record, @Param("example") BookborrowExample example);

    //根据分组查询出所有借阅图书中的排行榜
    List<BookBorrowRank> selectBookRank(@Param("list") List list,@Param("category") String category);

    List<Bookborrow> selectByOutidLike(List list);

    List<BookBorrowRank> getBookBorrowRank(@Param("grade") String grade, @Param("xueyuan") String xueyuan);
}