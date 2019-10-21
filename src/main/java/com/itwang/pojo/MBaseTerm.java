package com.itwang.pojo;

public class MBaseTerm {
    private String termid;

    private String termname;

    private String termaddr;

    private String dptcode;

    private String acccode;

    private String dscrp;

    public String getTermid() {
        return termid;
    }

    public void setTermid(String termid) {
        this.termid = termid == null ? null : termid.trim();
    }

    public String getTermname() {
        return termname;
    }

    public void setTermname(String termname) {
        this.termname = termname == null ? null : termname.trim();
    }

    public String getTermaddr() {
        return termaddr;
    }

    public void setTermaddr(String termaddr) {
        this.termaddr = termaddr == null ? null : termaddr.trim();
    }

    public String getDptcode() {
        return dptcode;
    }

    public void setDptcode(String dptcode) {
        this.dptcode = dptcode == null ? null : dptcode.trim();
    }

    public String getAcccode() {
        return acccode;
    }

    public void setAcccode(String acccode) {
        this.acccode = acccode == null ? null : acccode.trim();
    }

    public String getDscrp() {
        return dscrp;
    }

    public void setDscrp(String dscrp) {
        this.dscrp = dscrp == null ? null : dscrp.trim();
    }

    @Override
    public String toString() {
        return "MBaseTerm{" +
                "termid='" + termid + '\'' +
                ", termname='" + termname + '\'' +
                ", termaddr='" + termaddr + '\'' +
                ", dptcode='" + dptcode + '\'' +
                ", acccode='" + acccode + '\'' +
                ", dscrp='" + dscrp + '\'' +
                '}';
    }
}