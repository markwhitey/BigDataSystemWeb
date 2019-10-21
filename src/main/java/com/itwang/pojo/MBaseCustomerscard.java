package com.itwang.pojo;

public class MBaseCustomerscard {
    private String id;

    private String customerid;

    private String outid;

    private String cardsn;

    private String scardsnr;

    private String status;

    private String asn;

    private String name;

    private String oddfare;

    private String suboddfare;

    private String onlineoddfare;

    private String cardtype;

    private String idcardno;

    private String custdept;

    private String dpfullname;

    private String cardtypename;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid == null ? null : customerid.trim();
    }

    public String getOutid() {
        return outid;
    }

    public void setOutid(String outid) {
        this.outid = outid == null ? null : outid.trim();
    }

    public String getCardsn() {
        return cardsn;
    }

    public void setCardsn(String cardsn) {
        this.cardsn = cardsn == null ? null : cardsn.trim();
    }

    public String getScardsnr() {
        return scardsnr;
    }

    public void setScardsnr(String scardsnr) {
        this.scardsnr = scardsnr == null ? null : scardsnr.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getAsn() {
        return asn;
    }

    public void setAsn(String asn) {
        this.asn = asn == null ? null : asn.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getOddfare() {
        return oddfare;
    }

    public void setOddfare(String oddfare) {
        this.oddfare = oddfare == null ? null : oddfare.trim();
    }

    public String getSuboddfare() {
        return suboddfare;
    }

    public void setSuboddfare(String suboddfare) {
        this.suboddfare = suboddfare == null ? null : suboddfare.trim();
    }

    public String getOnlineoddfare() {
        return onlineoddfare;
    }

    public void setOnlineoddfare(String onlineoddfare) {
        this.onlineoddfare = onlineoddfare == null ? null : onlineoddfare.trim();
    }

    public String getCardtype() {
        return cardtype;
    }

    public void setCardtype(String cardtype) {
        this.cardtype = cardtype == null ? null : cardtype.trim();
    }

    public String getIdcardno() {
        return idcardno;
    }

    public void setIdcardno(String idcardno) {
        this.idcardno = idcardno == null ? null : idcardno.trim();
    }

    public String getCustdept() {
        return custdept;
    }

    public void setCustdept(String custdept) {
        this.custdept = custdept == null ? null : custdept.trim();
    }

    public String getDpfullname() {
        return dpfullname;
    }

    public void setDpfullname(String dpfullname) {
        this.dpfullname = dpfullname == null ? null : dpfullname.trim();
    }

    public String getCardtypename() {
        return cardtypename;
    }

    public void setCardtypename(String cardtypename) {
        this.cardtypename = cardtypename == null ? null : cardtypename.trim();
    }

    @Override
    public String toString() {
        return "MBaseCustomerscard{" +
                "id='" + id + '\'' +
                ", customerid='" + customerid + '\'' +
                ", outid='" + outid + '\'' +
                ", cardsn='" + cardsn + '\'' +
                ", scardsnr='" + scardsnr + '\'' +
                ", status='" + status + '\'' +
                ", asn='" + asn + '\'' +
                ", name='" + name + '\'' +
                ", oddfare='" + oddfare + '\'' +
                ", suboddfare='" + suboddfare + '\'' +
                ", onlineoddfare='" + onlineoddfare + '\'' +
                ", cardtype='" + cardtype + '\'' +
                ", idcardno='" + idcardno + '\'' +
                ", custdept='" + custdept + '\'' +
                ", dpfullname='" + dpfullname + '\'' +
                ", cardtypename='" + cardtypename + '\'' +
                '}';
    }
}