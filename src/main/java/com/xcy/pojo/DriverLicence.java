package com.xcy.pojo;

public class DriverLicence {
    private Integer dlId;

    private String dlName;

    private String dlType;

    private String dlCity;

    private String dlPoint;

    private String dlTel;

    private Integer uid;

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

    public Integer getDlId() {
        return dlId;
    }

    public void setDlId(Integer dlId) {
        this.dlId = dlId;
    }

    public String getDlName() {
        return dlName;
    }

    public void setDlName(String dlName) {
        this.dlName = dlName;
    }

    public String getDlType() {
        return dlType;
    }

    public void setDlType(String dlType) {
        this.dlType = dlType;
    }

    public String getDlCity() {
        return dlCity;
    }

    public void setDlCity(String dlCity) {
        this.dlCity = dlCity;
    }

    public String getDlPoint() {
        return dlPoint;
    }

    public void setDlPoint(String dlPoint) {
        this.dlPoint = dlPoint;
    }

    public String getDlTel() {
        return dlTel;
    }

    public void setDlTel(String dlTel) {
        this.dlTel = dlTel;
    }

    @Override
    public String toString() {
        return "DriverLicence{" +
                "dlId=" + dlId +
                ", dlName='" + dlName + '\'' +
                ", dlType='" + dlType + '\'' +
                ", dlCity='" + dlCity + '\'' +
                ", dlPoint='" + dlPoint + '\'' +
                ", dlTel='" + dlTel + '\'' +
                ", uid=" + uid +
                ", userRealName='" + userRealName + '\'' +
                '}';
    }
}