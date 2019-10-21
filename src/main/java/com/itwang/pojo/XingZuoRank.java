package com.itwang.pojo;

/**
 * @ProjectName: SchoolBigDataAnalysisWeb
 * @Package: com.itwang.pojo
 * @ClassName: XingZuoRank
 * @Author: hadoop
 * @Description:
 * @Date: 2019-04-16 19:02
 * @Version: 1.0
 */
public class XingZuoRank implements Comparable<XingZuoRank>{
    private String name;//星座名称
    private Long count;//借书量

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public int compareTo(XingZuoRank o) {
        if(this.count > o.count)
            return 1;
        else if(this.count < o.count)
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "XingZuoRank{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
