package com.itwang.pojo;

public class Userbooktags {
    private String outid;

    private String tagName;

    private Integer tagValue;

    public String getOutid() {
        return outid;
    }

    public void setOutid(String outid) {
        this.outid = outid == null ? null : outid.trim();
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName == null ? null : tagName.trim();
    }

    public Integer getTagValue() {
        return tagValue;
    }

    public void setTagValue(Integer tagValue) {
        this.tagValue = tagValue;
    }

    @Override
    public String toString() {
        return "Userbooktags{" +
                "outid='" + outid + '\'' +
                ", tagName='" + tagName + '\'' +
                ", tagValue=" + tagValue +
                '}';
    }
}