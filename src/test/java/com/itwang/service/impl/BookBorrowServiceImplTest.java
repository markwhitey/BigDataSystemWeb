package com.itwang.service.impl;

import com.itwang.pojo.BookBorrowRank;
import com.itwang.pojo.OnceItemsViewWithBLOBs;
import com.itwang.pojo.PersonBookBorrowRank;
import com.itwang.pojo.XingZuoRank;
import com.itwang.service.BookBorrowService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * @ProjectName: SchoolBigDataAnalysisWeb
 * @Package: com.itwang.service.impl
 * @ClassName: BookBorrowServiceImplTest
 * @Author: hadoop
 * @Description:
 * @Date: 2019-04-18 17:05
 * @Version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:spring/applicationContext-*.xml"})
public class BookBorrowServiceImplTest {
    @Autowired
    private BookBorrowService bookBorrowService;

    @Test
    public void getXingZuoRank() {
        List<XingZuoRank> xingZuoRank = bookBorrowService.getXingZuoRank(null);
    }

    @Test
    public void getBookBorrowRank(){
        List<BookBorrowRank> bookBorrowRank = bookBorrowService.getBookBorrowRank(null,null);
    }

    @Test
    public void getPersonBookBorrowRank(){
        List<PersonBookBorrowRank> personBookBorrowRank = bookBorrowService.getPersonBookBorrowRank(null, null);

    }

    @Test
    public void getKmeansPercent() {
        Map<String, Integer> kmeansPercent =
                bookBorrowService.getKmeansPercent("2015");
        for (Map.Entry<String,Integer> s : kmeansPercent.entrySet()){
            System.out.println(s.getKey() + "\t" + s.getValue());
        }
    }
}