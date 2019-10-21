package com.itwang.pojo;

import java.util.Date;

public class OnceItemsView {
    private String outid;

    private Date jssj;

    public String getOutid() {
        return outid;
    }

    public void setOutid(String outid) {
        this.outid = outid == null ? null : outid.trim();
    }

    public Date getJssj() {
        return jssj;
    }

    public void setJssj(Date jssj) {
        this.jssj = jssj;
    }

    @Override
    public String toString() {
        return "OnceItemsView{" +
                "outid='" + outid + '\'' +
                ", jssj=" + jssj +
                '}';
    }
}