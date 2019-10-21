package com.itwang.service.impl;

import com.itwang.service.UserTagsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @ProjectName: SchoolBigDataAnalysisWeb
 * @Package: com.itwang.service.impl
 * @ClassName: UserTagsServiceImplTest
 * @Author: hadoop
 * @Description:
 * @Date: 2019-04-18 17:02
 * @Version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:spring/applicationContext-*.xml"})
public class UserTagsServiceImplTest {
    @Autowired
    private UserTagsService userTagsService;
    @Test
    public void generateBaseTag() {
        userTagsService.generateBaseTag();
    }

    @Test
    public void generateStudyTag() {
        userTagsService.generateStudyTag();
    }

    @Test
    public void generateBookTag() {
        userTagsService.generateBookTag();
    }

    @Test
    public void generateConsumeTotalTag() {
        userTagsService.generateConsumeTotalTag();
    }

    @Test
    public void generateConsumeFreqTag() {
        userTagsService.generateConsumeFreqTag();
    }


    @Test
    public void getUserTagsByOutid() {
    }
}