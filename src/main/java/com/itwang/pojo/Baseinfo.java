package com.itwang.pojo;

public class Baseinfo {
    private String ouid;

    private String name;

    private String dept;

    private String idcard;

    private String xingzuo;

    private String sheng;

    private String shi;

    public String getOuid() {
        return ouid;
    }

    public void setOuid(String ouid) {
        this.ouid = ouid == null ? null : ouid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept == null ? null : dept.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getXingzuo() {
        return xingzuo;
    }

    public void setXingzuo(String xingzuo) {
        this.xingzuo = xingzuo == null ? null : xingzuo.trim();
    }

    public String getSheng() {
        return sheng;
    }

    public void setSheng(String sheng) {
        this.sheng = sheng == null ? null : sheng.trim();
    }

    public String getShi() {
        return shi;
    }

    public void setShi(String shi) {
        this.shi = shi == null ? null : shi.trim();
    }

    @Override
    public String toString() {
        return "Baseinfo{" +
                "ouid='" + ouid + '\'' +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", idcard='" + idcard + '\'' +
                ", xingzuo='" + xingzuo + '\'' +
                ", sheng='" + sheng + '\'' +
                ", shi='" + shi + '\'' +
                '}';
    }
}