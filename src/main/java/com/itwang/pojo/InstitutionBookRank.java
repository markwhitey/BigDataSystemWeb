package com.itwang.pojo;

/**
 * @ProjectName: SchoolBigDataAnalysisWeb
 * @Package: com.itwang.pojo
 * @ClassName: InstitutionBookRank
 * @Author: hadoop
 * @Description:
 * @Date: 2019-04-20 15:50
 * @Version: 1.0
 */
//学院借书排名
public class InstitutionBookRank implements Comparable<InstitutionBookRank>{
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
    public int compareTo(InstitutionBookRank o) {
        if (this.total > o.total)
            return 1;
        else if(this.total == o.total)
            return 0;
        else
            return -1;
    }

    @Override
    public String toString() {
        return "InstitutionBookRank{" +
                "institution='" + institution + '\'' +
                ", total=" + total +
                '}';
    }
}
