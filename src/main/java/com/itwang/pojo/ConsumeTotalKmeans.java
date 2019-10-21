package com.itwang.pojo;

public class ConsumeTotalKmeans {
    private String outid;

    private Double totalAmount;

    private Double totalFrequency;

    private Integer cluster;

    public String getOutid() {
        return outid;
    }

    public void setOutid(String outid) {
        this.outid = outid == null ? null : outid.trim();
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getTotalFrequency() {
        return totalFrequency;
    }

    public void setTotalFrequency(Double totalFrequency) {
        this.totalFrequency = totalFrequency;
    }

    public Integer getCluster() {
        return cluster;
    }

    public void setCluster(Integer cluster) {
        this.cluster = cluster;
    }

    @Override
    public String toString() {
        return "ConsumeTotalKmeans{" +
                "outid='" + outid + '\'' +
                ", totalAmount=" + totalAmount +
                ", totalFrequency=" + totalFrequency +
                ", cluster=" + cluster +
                '}';
    }
}