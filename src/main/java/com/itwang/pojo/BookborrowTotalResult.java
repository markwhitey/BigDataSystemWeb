package com.itwang.pojo;

public class BookborrowTotalResult {
    private String outid;

    private Long total;

    private Long frequency;

    public String getOutid() {
        return outid;
    }

    public void setOutid(String outid) {
        this.outid = outid == null ? null : outid.trim();
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
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
        return "BookborrowTotalResult{" +
                "outid='" + outid + '\'' +
                ", total=" + total +
                ", frequency=" + frequency +
                '}';
    }
}