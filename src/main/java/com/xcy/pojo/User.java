package com.xcy.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;

public class User {

    private int userId;
    private String userPhone;
    private String userPassword;
    private String userRealName;
    private String userIdCard;
    private String userEmail;
    private String userCity;
    private String userTelNum;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }

    public String getUserIdCard() {
        return userIdCard;
    }

    public void setUserIdCard(String userIdCard) {
        this.userIdCard = userIdCard;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public String getUserTelNum() {
        return userTelNum;
    }

    public void setUserTelNum(String userTelNum) {
        this.userTelNum = userTelNum;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userPhone='" + userPhone + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userRealName='" + userRealName + '\'' +
                ", userIdCard='" + userIdCard + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userCity='" + userCity + '\'' +
                ", userTelNum='" + userTelNum + '\'' +
                '}';
    }
}
