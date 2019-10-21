package com.itwang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ProjectName: SchoolBigDataAnalysisWeb
 * @Package: com.itwang.controller
 * @ClassName: IndexController
 * @Author: hadoop
 * @Description:
 * @Date: 2019-04-11 9:38
 * @Version: 1.0
 */
@Controller
public class IndexController {
    //词云实例
    @RequestMapping("/toWordCloud")
    public String toWordCloud(){
        return "wordcloud";
    }
    //学生消费大数据平台
    @RequestMapping("/toConsumeInspection")
    public String toConsumeInspection(){
        return "consumeinspection";
    }
    //图书借阅门禁大数据平台
    @RequestMapping("/toStudyInspection")
    public String toStudyInspection(){
        return "studyinspection";
    }
    //图书借阅排行榜
    @RequestMapping("/toBookBorrowRankIndex")
    public String toBookBorrowRankIndex(){
        return "bookborrowrank";
    }
    //书籍畅销榜
    @RequestMapping("/toBookRankIndex")
    public String toBookRankIndex(){
        return "bookrank";
    }
    //图书借阅星座榜
    @RequestMapping("/toBookBorrowXingZuoRankIndex")
    public String toBookBorrowXingZuoRankIndex(){
        return "bookborrowxingzuorank";
    }
    //图书借阅学院榜
    @RequestMapping("/toBookBorrowInstitutionRankIndex")
    public String toBookBorrowInstitutionRankIndex(){
        return "bookborrowinstitutionrank";
    }
    //一卡通消费学院榜
    @RequestMapping("/toConsumeInstitutionRankIndex")
    public String toConsumeInstitutionRankIndex(){
        return "consumeinstitutionrank";
    }
    //一卡通消费星座榜
    @RequestMapping("/toConsumeXingZuoRankIndex")
    public String toConsumeXingZuoRankIndex(){
        return "consumexingzuorank";
    }
    //一卡通省份消费榜
    @RequestMapping("/toConsumeProvicneRankIndex")
    public String toConsumeProvicneRankIndex(){
        return "consumeprovincerank";
    }

}

