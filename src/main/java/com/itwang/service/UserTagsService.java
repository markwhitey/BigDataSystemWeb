package com.itwang.service;

import com.itwang.pojo.PersonUserTags;
import com.itwang.pojo.UserTag;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: SchoolBigDataAnalysisWeb
 * @Package: com.itwang.service
 * @ClassName: GenerateUserTagsService
 * @Author: hadoop
 * @Description:
 * @Date: 2019-04-10 11:29
 * @Version: 1.0
 */
public interface UserTagsService {
    //产生学生的基本画像信息
    public void generateBaseTag();
    //产生学生学习强度画像
    public void generateStudyTag();
    //产生学生借阅画像
    public void generateBookTag();
    //产生学生消费总计画像
    public void generateConsumeTotalTag();
    //产生学生消费频次画像
    public void generateConsumeFreqTag();
    //获取所有学生的基本和聚类画像信息
    public List<PersonUserTags> GetUserTagsByOutid(String outid);
    //虎丘所有学生的借阅图书列表画像信息
    public List<PersonUserTags> getUserBookTagsByOutid(String outid);
}
