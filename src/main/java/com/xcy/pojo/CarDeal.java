package com.xcy.pojo;



public class CarDeal {
    private Integer cdId;

    private Integer uid;

    private String cdMM;

    private String cdCarType;

    private String cdCity;

    private String cdTime;

    private String cdCarLength;

    private String cdTel;

    private String cdDetail;

    private String cdImg;

    private String userRealName;

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getCdTime() {
        return cdTime;
    }

    public void setCdTime(String cdTime) {
        this.cdTime = cdTime;
    }

    public String getCdMM() {
        return cdMM;
    }

    public void setCdMM(String cdMM) {
        this.cdMM = cdMM;
    }

    public Integer getCdId() {
        return cdId;
    }

    public void setCdId(Integer cdId) {
        this.cdId = cdId;
    }

    public String getCdCarType() {
        return cdCarType;
    }

    public void setCdCarType(String cdCarType) {
        this.cdCarType = cdCarType;
    }

    public String getCdCity() {
        return cdCity;
    }

    public void setCdCity(String cdCity) {
        this.cdCity = cdCity;
    }

    public String getCdCarLength() {
        return cdCarLength;
    }

    public void setCdCarLength(String cdCarLength) {
        this.cdCarLength = cdCarLength;
    }

    public String getCdTel() {
        return cdTel;
    }

    public void setCdTel(String cdTel) {
        this.cdTel = cdTel;
    }

    public String getCdDetail() {
        return cdDetail;
    }

    public void setCdDetail(String cdDetail) {
        this.cdDetail = cdDetail;
    }

    public String getCdImg() {
        return cdImg;
    }

    public void setCdImg(String cdImg) {
        this.cdImg = cdImg;
    }

    @Override
    public String toString() {
        return "CarDeal{" +
                "cdId=" + cdId +
                ", uid=" + uid +
                ", cdMM='" + cdMM + '\'' +
                ", cdCarType='" + cdCarType + '\'' +
                ", cdCity='" + cdCity + '\'' +
                ", cdTime='" + cdTime + '\'' +
                ", cdCarLength='" + cdCarLength + '\'' +
                ", cdTel='" + cdTel + '\'' +
                ", cdDetail='" + cdDetail + '\'' +
                ", cdImg='" + cdImg + '\'' +
                ", userRealName='" + userRealName + '\'' +
                '}';
    }
}