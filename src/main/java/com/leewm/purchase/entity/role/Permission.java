package com.leewm.purchase.entity.role;

public class Permission {
    private Integer id;

    private String name;

    private String persissonUrl;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPersissonUrl() {
        return persissonUrl;
    }

    public void setPersissonUrl(String persissonUrl) {
        this.persissonUrl = persissonUrl == null ? null : persissonUrl.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}