package com.itwang.pojo;

public class Bookborrow {
    private String xh;

    private String type;

    private String xbmc;

    private String dwmc;

    private String tsmc;

    private String tslb;

    private String flh1;

    private String jhsj;

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh == null ? null : xh.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getXbmc() {
        return xbmc;
    }

    public void setXbmc(String xbmc) {
        this.xbmc = xbmc == null ? null : xbmc.trim();
    }

    public String getDwmc() {
        return dwmc;
    }

    public void setDwmc(String dwmc) {
        this.dwmc = dwmc == null ? null : dwmc.trim();
    }

    public String getTsmc() {
        return tsmc;
    }

    public void setTsmc(String tsmc) {
        this.tsmc = tsmc == null ? null : tsmc.trim();
    }

    public String getTslb() {
        return tslb;
    }

    public void setTslb(String tslb) {
        this.tslb = tslb == null ? null : tslb.trim();
    }

    public String getFlh1() {
        return flh1;
    }

    public void setFlh1(String flh1) {
        this.flh1 = flh1 == null ? null : flh1.trim();
    }

    public String getJhsj() {
        return jhsj;
    }

    public void setJhsj(String jhsj) {
        this.jhsj = jhsj == null ? null : jhsj.trim();
    }

    @Override
    public String toString() {
        return "Bookborrow{" +
                "xh='" + xh + '\'' +
                ", type='" + type + '\'' +
                ", xbmc='" + xbmc + '\'' +
                ", dwmc='" + dwmc + '\'' +
                ", tsmc='" + tsmc + '\'' +
                ", tslb='" + tslb + '\'' +
                ", flh1='" + flh1 + '\'' +
                ", jhsj='" + jhsj + '\'' +
                '}';
    }
}