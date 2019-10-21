package com.itwang.pojo;

public class StudyKmeans {
    private String outid;

    private Double totalBook;

    private Double frequencyBook;

    private Double frequencyMenjin;

    private Integer interest;

    public String getOutid() {
        return outid;
    }

    public void setOutid(String outid) {
        this.outid = outid == null ? null : outid.trim();
    }

    public Double getTotalBook() {
        return totalBook;
    }

    public void setTotalBook(Double totalBook) {
        this.totalBook = totalBook;
    }

    public Double getFrequencyBook() {
        return frequencyBook;
    }

    public void setFrequencyBook(Double frequencyBook) {
        this.frequencyBook = frequencyBook;
    }

    public Double getFrequencyMenjin() {
        return frequencyMenjin;
    }

    public void setFrequencyMenjin(Double frequencyMenjin) {
        this.frequencyMenjin = frequencyMenjin;
    }

    public Integer getInterest() {
        return interest;
    }

    public void setInterest(Integer interest) {
        this.interest = interest;
    }

    @Override
    public String toString() {
        return "StudyKmeans{" +
                "outid='" + outid + '\'' +
                ", totalBook=" + totalBook +
                ", frequencyBook=" + frequencyBook +
                ", frequencyMenjin=" + frequencyMenjin +
                ", interest=" + interest +
                '}';
    }
}