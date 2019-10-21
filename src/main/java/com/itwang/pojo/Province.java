package com.itwang.pojo;

public class Province {
    private String id;

    private String province;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    @Override
    public String toString() {
        return "Province{" +
                "id='" + id + '\'' +
                ", province='" + province + '\'' +
                '}';
    }
}