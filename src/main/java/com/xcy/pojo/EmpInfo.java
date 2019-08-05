package com.xcy.pojo;

public class EmpInfo {
    private Integer eiId;

    private String eiPost;

    private String eiCompanyName;

    private String eiSalary;

    private String eiCompanyAddress;

    private String eiAge;

    private String eiTel;

    private String eiDetail;

    private int uid;

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }

    private String userRealName;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public Integer getEiId() {
        return eiId;
    }

    public void setEiId(Integer eiId) {
        this.eiId = eiId;
    }

    public String getEiPost() {
        return eiPost;
    }

    public void setEiPost(String eiPost) {
        this.eiPost = eiPost;
    }

    public String getEiCompanyName() {
        return eiCompanyName;
    }

    public void setEiCompanyName(String eiCompanyName) {
        this.eiCompanyName = eiCompanyName;
    }

    public String getEiSalary() {
        return eiSalary;
    }

    public void setEiSalary(String eiSalary) {
        this.eiSalary = eiSalary;
    }

    public String getEiCompanyAddress() {
        return eiCompanyAddress;
    }

    public void setEiCompanyAddress(String eiCompanyAddress) {
        this.eiCompanyAddress = eiCompanyAddress;
    }

    public String getEiAge() {
        return eiAge;
    }

    public void setEiAge(String eiAge) {
        this.eiAge = eiAge;
    }

    public String getEiTel() {
        return eiTel;
    }

    public void setEiTel(String eiTel) {
        this.eiTel = eiTel;
    }

    public String getEiDetail() {
        return eiDetail;
    }

    public void setEiDetail(String eiDetail) {
        this.eiDetail = eiDetail;
    }

    @Override
    public String toString() {
        return "EmpInfo{" +
                "eiId=" + eiId +
                ", eiPost='" + eiPost + '\'' +
                ", eiCompanyName='" + eiCompanyName + '\'' +
                ", eiSalary='" + eiSalary + '\'' +
                ", eiCompanyAddress='" + eiCompanyAddress + '\'' +
                ", eiAge='" + eiAge + '\'' +
                ", eiTel='" + eiTel + '\'' +
                ", eiDetail='" + eiDetail + '\'' +
                ", uid=" + uid +
                '}';
    }
}