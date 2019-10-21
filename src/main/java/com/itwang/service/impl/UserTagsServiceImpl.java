package com.itwang.service.impl;

import com.itwang.mapper.*;
import com.itwang.pojo.*;
import com.itwang.service.IDCardInfoService;
import com.itwang.service.UserTagsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @ProjectName: SchoolBigDataAnalysisWeb
 * @Package: com.itwang.service
 * @ClassName: GenerateUserTagsServiceImpl
 * @Author: hadoop
 * @Description:
 * @Date: 2019-04-10 11:29
 * @Version: 1.0
 */
@Service
public class UserTagsServiceImpl implements UserTagsService {
    Logger logger = LoggerFactory.getLogger(UserTagsServiceImpl.class);
    @Autowired
    private MBaseCustomerscardMapper mBaseCustomerscardMapper;
    @Autowired
    private UserTagMapper userTagMapper;
    @Autowired
    private StudyKmeansMapper studyKmeansMapper;
    @Autowired
    private ProvinceMapper provinceMapper;
    @Autowired
    private BookborrowMapper bookborrowMapper;
    @Autowired
    private ConsumeFreqKmeansMapper consumeFreqKmeansMapper;
    @Autowired
    private ConsumeTotalKmeansMapper consumeTotalKmeansMapper;
    @Autowired
    private IDCardInfoService idCardInfoService;
    @Autowired
    private UserbooktagsMapper userbooktagsMapper;
    @Override
    public void generateBaseTag() {
        logger.info("获取用户的基本画像");
        //首先查询出13级到18级的所有学生基本人口信息
        List<String> list = new ArrayList<>();
        list.add("2013");
        list.add("2014");
        list.add("2015");
        list.add("2016");
        list.add("2017");
        list.add("2018");
        List<MBaseCustomerscard> mBaseCustomerscards = mBaseCustomerscardMapper.selectByOutidLike(list);
        Iterator<MBaseCustomerscard> iterator = mBaseCustomerscards.iterator();
        UserTag userTag;
        while (iterator.hasNext()) {
            MBaseCustomerscard next = iterator.next();
            logger.info(next.toString());
            //学生号
            String outid = next.getOutid();
            //学院信息
            String[] deptInfos = next.getDpfullname().split("/");
            for (String deptInfo : deptInfos) {
                userTag = new UserTag();
                userTag.setOutid(outid);
                userTag.setTagName(deptInfo);
                userTag.setTagVale(23);
                updateUserTags(userTag);
            }
            //姓名
            String name = next.getName();
            userTag = new UserTag();
            userTag.setOutid(outid);
            userTag.setTagName(name);
            userTag.setTagVale(22);
            updateUserTags(userTag);


            //身份证号码
            String idcardno = next.getIdcardno();
            //获取性别
            Integer i = Integer.parseInt(idcardno.substring(16, 17));
            String gender = "";
            if (i % 2 == 0) {
                gender = "女";
            } else {
                gender = "男";
            }
            userTag = new UserTag();
            userTag.setOutid(outid);
            userTag.setTagName(gender);
            userTag.setTagVale(23);
            updateUserTags(userTag);
            //从身份证号获取学生所在地区和星座信息
            String provincestr = idCardInfoService.getUserProvinceInfoFromIDCard(idcardno);
            if (provincestr != null) {
                userTag = new UserTag();
                userTag.setOutid(outid);
                userTag.setTagName(provincestr);
                userTag.setTagVale(24);
                updateUserTags(userTag);
            }

            String constellation = idCardInfoService.getUserConstellationFromIDCard(idcardno);
            if (constellation != null) {
                userTag = new UserTag();
                userTag.setOutid(outid);
                userTag.setTagName(constellation);
                userTag.setTagVale(25);
                updateUserTags(userTag);
            }
        }
        logger.info("生成用户基本画像成功！");
    }

    @Override
    public void generateStudyTag() {
        logger.info("开始生成学习画像");
        StudyKmeansExample studyKmeansExample = new StudyKmeansExample();
        List<StudyKmeans> studyKmeans = studyKmeansMapper.selectByExample(studyKmeansExample);
//        List<String> likeList = new ArrayList<>();
//        likeList.add("2015");
//        List<StudyKmeans> studyKmeans = studyKmeansMapper.selectByOutidLike(likeList);


        Set<String> tags = null;
        for (StudyKmeans kmeans : studyKmeans) {
            logger.info(kmeans.toString());
            tags = new HashSet<String>();
            String outid = kmeans.getOutid();
            Integer cluster = kmeans.getInterest();
            if (cluster == 0) {
                tags.add("借阅狂人");
                tags.add("热爱学习");
                tags.add("阅读爱好者");
                tags.add("自制力强");
                tags.add("学习勤奋");
                tags.add("阅读狂人");
                tags.add("学阅双高");
                tags.add("图书馆");
                tags.add("考研");
            } else if (cluster == 1) {
                tags.add("学习勤奋");
                tags.add("热爱学习");
                tags.add("阅读爱好者");
                tags.add("图书馆");
                tags.add("自制力强");
                tags.add("考研");
            } else if (cluster == 2) {
                tags.add("不爱阅读");
                tags.add("不爱去图书馆");
                tags.add("自制力弱");
                tags.add("不爱学习");
                tags.add("宿舍");
                tags.add("学阅双低");
                tags.add("游戏");
            } else if (cluster == 3) {
                tags.add("阅读爱好者");
                tags.add("热爱学习");
                tags.add("图书馆");
                tags.add("自制力强");
                tags.add("学习勤奋");
            }
            UserTag userTag;
            for (String tag : tags) {
                userTag = new UserTag();
                userTag.setOutid(outid);
                userTag.setTagName(tag);
                userTag.setTagVale(37);
                updateUserTags(userTag);
            }
        }
        logger.info("生成用户学习画像完成");

    }

    @Override
    public void generateBookTag() {
        logger.info("生成学院借阅画像开始");
        List<String> list = new ArrayList<>();
        list.add("2013");
        list.add("2014");
        list.add("2015");
        list.add("2016");
        list.add("2017");
        list.add("2018");
        //将所有图书13级到18级学生的借阅图书信息查询出打标签
        List<Bookborrow> bookborrows = bookborrowMapper.selectByOutidLike(list);
        for (Bookborrow bookborrow : bookborrows) {
            logger.info(bookborrow.toString());
            //首先需要将查询到的分类标签查询用户标签库，如果没有，则插入，否则，将权值加1
            String outid = bookborrow.getXh();
            String title = bookborrow.getTsmc();
            String topic = bookborrow.getTslb();
            String category = bookborrow.getFlh1();
            //将书籍所属topic加入用户画像中
            if (topic != null) {
                String topics = topic.replaceAll("-", "").replaceAll("[,;-]", "\t");
                String[] tags = topics.split("\t");
                for (String tag : tags) {
                    Userbooktags userbooktags = new Userbooktags();
                    userbooktags.setOutid(outid);
                    userbooktags.setTagName(tag);
                    userbooktags.setTagValue(40);
                    //更新用户标签画像
                    updateUserBookTags(userbooktags);
                }

            }
        }
        logger.info("生成借阅画像完成");
    }

    @Override
    public void generateConsumeTotalTag() {
        logger.info("生成消费水平画像开始");
        ConsumeTotalKmeansExample example = new ConsumeTotalKmeansExample();
        List<ConsumeTotalKmeans> totalKmeans = consumeTotalKmeansMapper.selectByExample(example);

//        List<String> likeList = new ArrayList<>();
//        likeList.add("2015");
//        List<ConsumeTotalKmeans> totalKmeans = consumeTotalKmeansMapper.selectByOutidLike(likeList);

        Set<String> tags = null;
        for (ConsumeTotalKmeans kmeans : totalKmeans) {
            logger.info(kmeans.toString());
            tags = new HashSet<String>();
            String outid = kmeans.getOutid();
            Integer cluster = kmeans.getCluster();
            if (cluster == 0) {
                tags.add("低消费");
                tags.add("消费稳定");
            } else if (cluster == 1) {
                tags.add("高消费");
                tags.add("消费稳定");
            } else if (cluster == 2) {
                tags.add("偏低消费");
                tags.add("校外消费");
                tags.add("校外居住");
            } else if (cluster == 3) {
                tags.add("中等消费");
                tags.add("消费稳定");
            }
            UserTag userTag;
            for (String tag : tags) {
                userTag = new UserTag();
                userTag.setOutid(outid);
                userTag.setTagName(tag);
                userTag.setTagVale(35);
                updateUserTags(userTag);
            }
        }
        logger.info("生成消费水平画像成功");
    }

    @Override
    public void generateConsumeFreqTag() {
        logger.info("生成消费规律画像开始");
        ConsumeFreqKmeansExample example = new ConsumeFreqKmeansExample();
        List<ConsumeFreqKmeans> freqKmeans = consumeFreqKmeansMapper.selectByExample(example);

//        List<String> likeList = new ArrayList<>();
//        likeList.add("2015");
//        List<ConsumeFreqKmeans> freqKmeans = consumeFreqKmeansMapper.selectByOutidLike(likeList);

        Set<String> tags = null;
        for (ConsumeFreqKmeans kmeans : freqKmeans) {
            tags = new HashSet<String>();
            String outid = kmeans.getOutid();
            Integer cluster = kmeans.getCluster();
            if (cluster == 0) {
                tags.add("生活不规律");
                tags.add("早餐不规律");
                tags.add("晚餐不规律");
                tags.add("宿舍");
                tags.add("晚餐不规律");
                tags.add("校外消费");
            } else if (cluster == 1) {
                tags.add("生活不规律");
                tags.add("喜欢购物");
                tags.add("校内消费");
                tags.add("不爱吃早餐");
                tags.add("早餐不规律 ");
            } else if (cluster == 2) {
                tags.add("生活不规律");
                tags.add("打水少");
                tags.add("校外消费");
                tags.add("不爱吃早餐");
                tags.add("校外居住");
            } else if (cluster == 3) {
                tags.add("生活规律");
                tags.add("标准消费群体");
                tags.add("校内消费");
                tags.add("不懒床");
            }
            UserTag userTag;
            for (String tag : tags) {
                userTag = new UserTag();
                userTag.setOutid(outid);
                userTag.setTagName(tag);
                userTag.setTagVale(36);
                updateUserTags(userTag);
            }
        }
        logger.info("生成消费规律画像成功");
    }
    //更新用户基本信息和聚类画像信息
    public Integer updateUserTags(UserTag userTag) {
        String outid = userTag.getOutid();
        String tag = userTag.getTagName();
        UserTagExample example = new UserTagExample();
        UserTagExample.Criteria criteria = example.createCriteria();
        criteria.andOutidEqualTo(outid);
        criteria.andTagNameEqualTo(tag);
        //查询判断此用户是否有此标签
        List<UserTag> userTags = userTagMapper.selectByExample(example);
        //如果此用户已经有了这个标签，对这个标签的权值进行递增
        if (userTags != null && userTags.size() > 0) {
            userTag.setTagVale(userTags.get(0).getTagVale() + 1);
            int update = userTagMapper.updateByExample(userTag, example);
            return update;
        } else {
            //如果此用户没有这个标签，直接插入
            int insert = userTagMapper.insert(userTag);
            return insert;
        }
    }
    //更新用户借阅图书画像
    public Integer updateUserBookTags(Userbooktags userTag) {
        String outid = userTag.getOutid();
        String tag = userTag.getTagName();
        UserbooktagsExample example = new UserbooktagsExample();
        UserbooktagsExample.Criteria criteria = example.createCriteria();
        criteria.andOutidEqualTo(outid);
        criteria.andTagNameEqualTo(tag);
        //查询判断此用户是否有此标签
        List<Userbooktags> userTags = userbooktagsMapper.selectByExample(example);
        //如果此用户已经有了这个标签，对这个标签的权值进行递增
        if (userTags != null && userTags.size() > 0) {
            userTag.setTagValue(userTags.get(0).getTagValue() + 1);
            int update = userbooktagsMapper.updateByExample(userTag, example);
            return update;
        } else {
            //如果此用户没有这个标签，直接插入
            int insert = userbooktagsMapper.insert(userTag);
            return insert;
        }
    }

    @Override
    public List<PersonUserTags> GetUserTagsByOutid(String outid) {
        logger.info("通过学号得到用户聚类和基本画像" + outid);
        List<PersonUserTags> userTagsByOutid = userTagMapper.getUserTagsByOutid(outid);
        return userTagsByOutid;
    }

    @Override
    public List<PersonUserTags> getUserBookTagsByOutid(String outid) {
        logger.info("通过学号得到用户借阅画像" + outid);
        return userbooktagsMapper.getUserBookTagsByOutid(outid);
    }

}
