package com.itwang.mapper;

import com.itwang.pojo.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookborrowTotalResultMapper {
    int countByExample(BookborrowTotalResultExample example);

    int deleteByExample(BookborrowTotalResultExample example);

    int insert(BookborrowTotalResult record);

    int insertSelective(BookborrowTotalResult record);

    List<BookborrowTotalResult> selectByExample(BookborrowTotalResultExample example);

    int updateByExampleSelective(@Param("record") BookborrowTotalResult record, @Param("example") BookborrowTotalResultExample example);

    int updateByExample(@Param("record") BookborrowTotalResult record, @Param("example") BookborrowTotalResultExample example);

    //根据outid的学号多个like模糊查询
    List<BookborrowTotalResult> selectByOutidLike(List list);

    List<XingZuoRank> selectXingZuoRank(@Param("grade") String grade);

    List<PersonBookBorrowRank> getPersonBookBorrowRank(@Param("grade") String grade, @Param("xueyuan") String xueyuan);
    List<PersonBookBorrowRank> getPersonBookBorrowRankByOutid(@Param("grade") String grade, @Param("xueyuan") String xueyuan);
    List<InstitutionBookRank> selectInstitutionRank(@Param("grade") String grade);
}