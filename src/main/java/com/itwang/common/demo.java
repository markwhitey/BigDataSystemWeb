package com.itwang.common;

/**
 * @ProjectName: SchoolBigDataAnalysisWeb
 * @Package: com.itwang.common
 * @ClassName: demo
 * @Author: hadoop
 * @Description:
 * @Date: 2019-04-10 18:49
 * @Version: 1.0
 */
public class demo {
    public static void main(String[] args) {
//        String topic = "建筑设计;计算机辅助设计;应用软件;After Effects,数字信号--信号处理--计算机辅助计算--软件包";
//        String s = topic.replaceAll("-","").replaceAll("[,;-]","\t");
//        System.out.println(s);
//        String[] split = s.split("\t");
//        for (String s1: split){
//            System.out.println(s1);
//        }
        String s = "电子信息学院/2009/测控091";
        String[] splits = s.split("/");
        for (String item:splits){
            System.out.println(item);
        }
    }
}
