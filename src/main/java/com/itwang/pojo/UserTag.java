package com.itwang.pojo;

public class UserTag {
    private String outid;

    private String tagName;

    private Integer tagVale;

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

    public Integer getTagVale() {
        return tagVale;
    }

    public void setTagVale(Integer tagVale) {
        this.tagVale = tagVale;
    }

    @Override
    public String toString() {
        return "UserTag{" +
                "outid='" + outid + '\'' +
                ", tagName='" + tagName + '\'' +
                ", tagVale=" + tagVale +
                '}';
    }
}