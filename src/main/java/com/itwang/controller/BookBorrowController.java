package com.itwang.controller;

import com.itwang.pojo.*;
import com.itwang.service.BookBorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: SchoolBigDataAnalysisWeb
 * @Package: com.itwang.controller
 * @ClassName: BookBorrowService
 * @Author: hadoop
 * @Description:
 * @Date: 2019-04-16 13:48
 * @Version: 1.0
 */
@Controller
@RequestMapping("/bookborrow")
public class BookBorrowController {
    @Autowired
    private BookBorrowService bookBorrowService;

    //星座借书排行榜
    @RequestMapping("/getXingZuoRank")
    @ResponseBody
    public List<XingZuoRank> getXingZuoRank(String grade){
        return bookBorrowService.getXingZuoRank(grade);
    }
    //学院借书排行榜
    @RequestMapping("/getInstitutionRank")
    @ResponseBody
    public List<InstitutionBookRank> getInstitutionRank(String grade){
        return bookBorrowService.getInstitutionRank(grade);
    }
    //获取个人排行榜
    @RequestMapping("/getPersonBookBorrowRank")
    @ResponseBody
    public List<PersonBookBorrowRank> getPersonBookBorrowRank(String grade,String xueyuan){
        return bookBorrowService.getPersonBookBorrowRank(grade,xueyuan);
    }
    //根据学号获取个人排行榜
    @RequestMapping("/getPersonBookBorrowRankByOutid")
    @ResponseBody
    public Map<String,Object> getPersonBookBorrowRankByOutid(String grade,String xueyuan,String outid){
        if (outid != null && !"".equals(outid)){
            return bookBorrowService.getPersonBookBorrowRankByOutid(grade,xueyuan,outid);
        }else{
            return null;
        }
    }

    //个人总借阅
    @RequestMapping("/getPersonTotalBookBorrow")
    @ResponseBody
    public BookborrowTotalResult getPersonTotalBookBorrow(String outid){
        return bookBorrowService.getPersonTotalBookBorrow(outid);
    }
    //个人所有借书记录详情
    @RequestMapping("/getPersonDetailBorrow")
    @ResponseBody
    public List<OnceItemsViewWithBLOBs> getPersonDetailBorrow(String outid){
        return bookBorrowService.getPersonDetailBorrow(outid);
    }

    //获取书籍畅销榜
    @RequestMapping("/getBookBorrowRank")
    @ResponseBody
    public List<BookBorrowRank> getBookBorrowRank(String grade,String xueyuan){
        return bookBorrowService.getBookBorrowRank(grade, xueyuan);
    }

    //根据学习强度聚类结果，对每个结果的百分比进行统计
    @RequestMapping("/getKmeansPercent")
    @ResponseBody
    public Map<String, Integer> getKmeansPercent(String grade){
        return bookBorrowService.getKmeansPercent(grade);
    }
}
