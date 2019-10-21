package com.itwang.pojo;

/**
 * @ProjectName: SchoolBigDataAnalysisWeb
 * @Package: com.itwang.pojo
 * @ClassName: PersonUserTags
 * @Author: hadoop
 * @Description:
 * @Date: 2019-04-21 10:02
 * @Version: 1.0
 */
public class PersonUserTags {
    private String name;
    private Integer value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "PersonUserTags{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
