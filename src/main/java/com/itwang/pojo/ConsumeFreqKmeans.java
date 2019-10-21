package com.itwang.pojo;

public class ConsumeFreqKmeans {
    private String outid;

    private Double breakfastFre;

    private Double lunchFre;

    private Double dinnerFre;

    private Double waterFre;

    private Double shoppingFre;

    private Integer cluster;

    public String getOutid() {
        return outid;
    }

    public void setOutid(String outid) {
        this.outid = outid == null ? null : outid.trim();
    }

    public Double getBreakfastFre() {
        return breakfastFre;
    }

    public void setBreakfastFre(Double breakfastFre) {
        this.breakfastFre = breakfastFre;
    }

    public Double getLunchFre() {
        return lunchFre;
    }

    public void setLunchFre(Double lunchFre) {
        this.lunchFre = lunchFre;
    }

    public Double getDinnerFre() {
        return dinnerFre;
    }

    public void setDinnerFre(Double dinnerFre) {
        this.dinnerFre = dinnerFre;
    }

    public Double getWaterFre() {
        return waterFre;
    }

    public void setWaterFre(Double waterFre) {
        this.waterFre = waterFre;
    }

    public Double getShoppingFre() {
        return shoppingFre;
    }

    public void setShoppingFre(Double shoppingFre) {
        this.shoppingFre = shoppingFre;
    }

    public Integer getCluster() {
        return cluster;
    }

    public void setCluster(Integer cluster) {
        this.cluster = cluster;
    }

    @Override
    public String toString() {
        return "ConsumeFreqKmeans{" +
                "outid='" + outid + '\'' +
                ", breakfastFre=" + breakfastFre +
                ", lunchFre=" + lunchFre +
                ", dinnerFre=" + dinnerFre +
                ", waterFre=" + waterFre +
                ", shoppingFre=" + shoppingFre +
                ", cluster=" + cluster +
                '}';
    }
}