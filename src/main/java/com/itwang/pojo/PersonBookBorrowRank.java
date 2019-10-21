package com.itwang.pojo;

/**
 * @ProjectName: SchoolBigDataAnalysisWeb
 * @Package: com.itwang.pojo
 * @ClassName: BookBorrowRank
 * @Author: hadoop
 * @Description:
 * @Date: 2019-04-16 20:44
 * @Version: 1.0
 */
public class PersonBookBorrowRank implements Comparable<PersonBookBorrowRank>{
    private String outid;//学号
    private String name;//姓名
    private String dept;//学院
    private Long count;//数量

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getOutid() {
        return outid;
    }

    public void setOutid(String outid) {
        this.outid = outid;
    }

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
    public int compareTo(PersonBookBorrowRank o) {
        if (this.count > o.count)
            return 1;
        else if(this.count < o.count)
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "PersonBookBorrowRank{" +
                "outid='" + outid + '\'' +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", count=" + count +
                '}';
    }
}
