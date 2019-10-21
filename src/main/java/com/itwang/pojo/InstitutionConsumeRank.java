package com.itwang.pojo;

/**
 * @ProjectName: SchoolBigDataAnalysisWeb
 * @Package: com.itwang.pojo
 * @ClassName: InstitutionConsumeRank
 * @Author: hadoop
 * @Description:
 * @Date: 2019-04-16 16:52
 * @Version: 1.0
 */
public class InstitutionConsumeRank implements Comparable<InstitutionConsumeRank>{
    String institution;//学院
    Double total; //学院一卡通总消费


    public String getInstitution() {
        return institution;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    @Override
    public int compareTo(InstitutionConsumeRank o) {
        if (this.total > o.total)
            return 1;
        else if(this.total == o.total)
            return 0;
        else
            return -1;
    }

    @Override
    public String toString() {
        return "InstitutionConsumeRank{" +
                "institution='" + institution + '\'' +
                ", total=" + total +
                '}';
    }
}
