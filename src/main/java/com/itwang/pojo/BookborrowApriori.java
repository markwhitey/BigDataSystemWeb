package com.itwang.pojo;

public class BookborrowApriori {
    private Double confidence;

    private String preItems;

    private String latterItems;

    public Double getConfidence() {
        return confidence;
    }

    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }

    public String getPreItems() {
        return preItems;
    }

    public void setPreItems(String preItems) {
        this.preItems = preItems == null ? null : preItems.trim();
    }

    public String getLatterItems() {
        return latterItems;
    }

    public void setLatterItems(String latterItems) {
        this.latterItems = latterItems == null ? null : latterItems.trim();
    }

    @Override
    public String toString() {
        return "BookborrowApriori{" +
                "confidence=" + confidence +
                ", preItems='" + preItems + '\'' +
                ", latterItems='" + latterItems + '\'' +
                '}';
    }
}