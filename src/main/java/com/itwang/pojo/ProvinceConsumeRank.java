package com.itwang.pojo;

/**
 * @ProjectName: SchoolBigDataAnalysisWeb
 * @Package: com.itwang.pojo
 * @ClassName: ProvinceConsumeRank
 * @Author: hadoop
 * @Description:
 * @Date: 2019-04-16 17:39
 * @Version: 1.0
 */
public class ProvinceConsumeRank implements Comparable<ProvinceConsumeRank>{
    private String name;//省份
    private Double value;

    public ProvinceConsumeRank() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public int compareTo(ProvinceConsumeRank o) {
        if (this.value > o.value)
            return 1;
        else if(this.value < o.value)
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "ProvinceConsumeRank{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
