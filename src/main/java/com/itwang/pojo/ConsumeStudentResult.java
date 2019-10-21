package com.itwang.pojo;

public class ConsumeStudentResult {
    private String outid;

    private String dscrp;

    private Double total;

    private Long frequency;

    public String getOutid() {
        return outid;
    }

    public void setOutid(String outid) {
        this.outid = outid == null ? null : outid.trim();
    }

    public String getDscrp() {
        return dscrp;
    }

    public void setDscrp(String dscrp) {
        this.dscrp = dscrp == null ? null : dscrp.trim();
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Long getFrequency() {
        return frequency;
    }

    public void setFrequency(Long frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "ConsumeStudentResult{" +
                "outid='" + outid + '\'' +
                ", dscrp='" + dscrp + '\'' +
                ", total=" + total +
                ", frequency=" + frequency +
                '}';
    }
}