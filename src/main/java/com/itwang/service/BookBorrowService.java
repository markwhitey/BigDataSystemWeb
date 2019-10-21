package com.itwang.service;

import com.itwang.pojo.*;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: SchoolBigDataAnalysisWeb
 * @Package: com.itwang.service
 * @ClassName: BookBorrowService
 * @Author: hadoop
 * @Description:
 * @Date: 2019-04-16 11:18
 * @Version: 1.0
 */
public interface BookBorrowService {

    //星座借书排行榜
    public List<XingZuoRank> getXingZuoRank(String grade);
    //学院借书榜
    public List<InstitutionBookRank> getInstitutionRank(String grade);
    //获取个人排行榜
    public List<PersonBookBorrowRank> getPersonBookBorrowRank(String grade,String xueyuan);

    public Map<String,Object> getPersonBookBorrowRankByOutid(String grade,String xueyuan,String outid);
    public BookborrowTotalResult getPersonTotalBookBorrow(String outid);
    //个人所有借书记录详情
    public List<OnceItemsViewWithBLOBs> getPersonDetailBorrow(String outid);

    //获取书籍畅销榜
    public List<BookBorrowRank> getBookBorrowRank(String grade,String xueyuan);

    //推荐关联图书
    // TODO: 2019-04-19

    //根据学习强度聚类结果，对每个结果的百分比进行统计
    public Map<String, Integer> getKmeansPercent(String grade);
}
