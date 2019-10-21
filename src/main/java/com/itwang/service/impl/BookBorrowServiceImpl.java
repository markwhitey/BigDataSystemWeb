package com.itwang.service.impl;

import com.itwang.mapper.*;
import com.itwang.pojo.*;
import com.itwang.service.BookBorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: SchoolBigDataAnalysisWeb
 * @Package: com.itwang.service.impl
 * @ClassName: BookBorrowServiceImpl
 * @Author: hadoop
 * @Description:
 * @Date: 2019-04-16 13:49
 * @Version: 1.0
 */
@Service
public class BookBorrowServiceImpl implements BookBorrowService {
    @Autowired
    private OnceItemsViewMapper onceItemsViewMapper;
    @Autowired
    private BookborrowTotalResultMapper bookborrowTotalResultMapper;
    @Autowired
    private MBaseCustomerscardMapper mBaseCustomerscardMapper;
    @Autowired
    private BookborrowMapper bookborrowMapper;
    @Autowired
    private StudyKmeansMapper studyKmeansMapper;

    @Override
    public List<XingZuoRank> getXingZuoRank(String grade) {
        List<XingZuoRank> list = null;
        if (grade != null && !"".equals(grade)) {
            list = bookborrowTotalResultMapper.selectXingZuoRank(grade);
        } else {
            list = bookborrowTotalResultMapper.selectXingZuoRank(null);
        }
        return list;
    }

    @Override
    public List<InstitutionBookRank> getInstitutionRank(String grade) {
        List<InstitutionBookRank> list = null;
        if (grade != null) {
            list = bookborrowTotalResultMapper.selectInstitutionRank(grade);
        } else {
            list = bookborrowTotalResultMapper.selectInstitutionRank(null);
        }
        return list;
    }

    @Override
    public List<PersonBookBorrowRank> getPersonBookBorrowRank(String grade, String xueyuan) {
        List<PersonBookBorrowRank> list = null;
        if (grade != null && xueyuan != null && !"".equals(grade) && !"".equals(xueyuan)) {
            //获取某个年级某个学院学生排行榜
            list = bookborrowTotalResultMapper.getPersonBookBorrowRank(grade, xueyuan);
        } else if (grade != null && xueyuan == null && !"".equals(grade)) {
            //获取某个年级总排行榜
            list = bookborrowTotalResultMapper.getPersonBookBorrowRank(grade, null);
        } else if (grade == null && xueyuan != null && !"".equals(xueyuan)) {
            //获取所有年级的某个学院排行榜
            list = bookborrowTotalResultMapper.getPersonBookBorrowRank(null, xueyuan);
        } else if (grade == null && xueyuan == null) {
            //获取所有年级的所有学院排行榜
            list = bookborrowTotalResultMapper.getPersonBookBorrowRank(null, null);
        }
        return list;
    }

    @Override
    public Map<String, Object> getPersonBookBorrowRankByOutid(String grade, String xueyuan, String outid) {
        Map<String, Object> map = new HashMap<String, Object>();
        List<PersonBookBorrowRank> list = null;
        if (grade != null && xueyuan != null && !"".equals(grade) && !"".equals(xueyuan)) {
            //获取某个年级某个学院学生排行榜
            list = bookborrowTotalResultMapper.getPersonBookBorrowRankByOutid(grade, xueyuan);
        } else if (grade != null && xueyuan == null && !"".equals(grade)) {
            //获取某个年级总排行榜
            list = bookborrowTotalResultMapper.getPersonBookBorrowRankByOutid(grade, null);
        } else if (grade == null && xueyuan != null && !"".equals(xueyuan)) {
            //获取所有年级的某个学院排行榜
            list = bookborrowTotalResultMapper.getPersonBookBorrowRankByOutid(null, xueyuan);
        } else if (grade == null && xueyuan == null) {
            //获取所有年级的所有学院排行榜
            list = bookborrowTotalResultMapper.getPersonBookBorrowRankByOutid(null, null);
        }
        int i = 1;
        for (PersonBookBorrowRank p : list) {
            if (outid.equals(p.getOutid())) {
                map.put("rank", i);
                map.put("person", p);
                return map;
            }
            i++;
        }
        return map;
    }

    @Override
    public BookborrowTotalResult getPersonTotalBookBorrow(String outid) {
        if (outid != null && !"".equals(outid)){
            BookborrowTotalResultExample example = new BookborrowTotalResultExample();
            BookborrowTotalResultExample.Criteria criteria = example.createCriteria();
            criteria.andOutidEqualTo(outid);
            return bookborrowTotalResultMapper.selectByExample(example).get(0);
        }
        return null;
    }


    @Override
    public List<OnceItemsViewWithBLOBs> getPersonDetailBorrow(String outid) {
        List<OnceItemsViewWithBLOBs> list = null;
        if (outid != null && !"".equals(outid)) {
            OnceItemsViewExample example = new OnceItemsViewExample();
            OnceItemsViewExample.Criteria criteria = example.createCriteria();
            criteria.andOutidEqualTo(outid);
            list = onceItemsViewMapper.selectByExampleWithBLOBs(example);
        }
        return list;
    }

    @Override
    public List<BookBorrowRank> getBookBorrowRank(String grade, String xueyuan) {
        List<BookBorrowRank> list = null;
        if (grade != null && xueyuan != null && !"".equals(grade) && !"".equals(xueyuan)) {
            //获取某个年级某个学院书籍畅销榜
            list = bookborrowMapper.getBookBorrowRank(grade, xueyuan);
        } else if (grade != null && xueyuan == null && !"".equals(grade)) {
            //获取某个年级书籍畅销榜
            list = bookborrowMapper.getBookBorrowRank(grade, null);
        } else if (grade == null && xueyuan != null && !"".equals(xueyuan)) {
            //获取所有年级的某个学院书籍畅销榜
            list = bookborrowMapper.getBookBorrowRank(null, xueyuan);
        } else if (grade == null && xueyuan == null) {
            //获取所有年级的所有学院书籍畅销榜
            list = bookborrowMapper.getBookBorrowRank(null, null);
        }
        return list;
    }


    @Override
    public Map<String, Integer> getKmeansPercent(String grade) {
        Map<String, Integer> map = new HashMap<>();
        if (grade != null) {
            //指定某个年级的学生聚类结果
            List<StudyKmeans> studyKmeans = studyKmeansMapper.selectPercent(grade, null);
            int size = studyKmeans.size();
            List<StudyKmeans> studyKmeans1 = studyKmeansMapper.selectPercent(grade, "0");
            List<StudyKmeans> studyKmeans2 = studyKmeansMapper.selectPercent(grade, "1");
            List<StudyKmeans> studyKmeans3 = studyKmeansMapper.selectPercent(grade, "2");
            List<StudyKmeans> studyKmeans4 = studyKmeansMapper.selectPercent(grade, "3");
            int size1 = studyKmeans1.size();
            int size2 = studyKmeans2.size();
            int size3 = studyKmeans3.size();
            int size4 = studyKmeans4.size();
            map.put("one", size1);
            map.put("two", size2);
            map.put("three", size3);
            map.put("four", size4);
        } else {
            //指定某个年级的学生聚类结果
            List<StudyKmeans> studyKmeans = studyKmeansMapper.selectPercent(new String(), new String());
            int size = studyKmeans.size();
            List<StudyKmeans> studyKmeans1 = studyKmeansMapper.selectPercent(new String(), "0");
            List<StudyKmeans> studyKmeans2 = studyKmeansMapper.selectPercent(new String(), "1");
            List<StudyKmeans> studyKmeans3 = studyKmeansMapper.selectPercent(new String(), "2");
            List<StudyKmeans> studyKmeans4 = studyKmeansMapper.selectPercent(new String(), "3");
            int size1 = studyKmeans1.size();
            int size2 = studyKmeans2.size();
            int size3 = studyKmeans3.size();
            int size4 = studyKmeans4.size();
            map.put("one", size1);
            map.put("two", size2);
            map.put("three", size3);
            map.put("four", size4);
        }
        return map;
    }
}
