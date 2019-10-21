package com.itwang.pojo;

public class ConsumeTotalResult {
    private String outid;

    private Double total;

    private Double frequency;

    public String getOutid() {
        return outid;
    }

    public void setOutid(String outid) {
        this.outid = outid == null ? null : outid.trim();
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getFrequency() {
        return frequency;
    }

    public void setFrequency(Double frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "ConsumeTotalResult{" +
                "outid='" + outid + '\'' +
                ", total=" + total +
                ", frequency=" + frequency +
                '}';
    }
}