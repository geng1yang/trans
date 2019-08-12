package com.xcy.pojo;

public class Goods {
    private int id;
    private String startCity;
    private String detailedStartAdress;
    private String endCity;
    private String detailEndAdress;
    private String goodsName;
    private String size;
    private String truckType;
    private String length;
    private int truckNum;
    private String price;
    private String sendGoodsPhone;
    private String getGoodsPhone;
    private String createTime;
    private int userId;
    private String userRealName;

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStartCity() {
        return startCity;
    }

    public void setStartCity(String startCity) {
        this.startCity = startCity;
    }

    public String getDetailedStartAdress() {
        return detailedStartAdress;
    }

    public void setDetailedStartAdress(String detailedStartAdress) {
        this.detailedStartAdress = detailedStartAdress;
    }

    public String getEndCity() {
        return endCity;
    }

    public void setEndCity(String endCity) {
        this.endCity = endCity;
    }

    public String getDetailEndAdress() {
        return detailEndAdress;
    }

    public void setDetailEndAdress(String detailEndAdress) {
        this.detailEndAdress = detailEndAdress;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public int getTruckNum() {
        return truckNum;
    }

    public void setTruckNum(int truckNum) {
        this.truckNum = truckNum;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSendGoodsPhone() {
        return sendGoodsPhone;
    }

    public void setSendGoodsPhone(String sendGoodsPhone) {
        this.sendGoodsPhone = sendGoodsPhone;
    }

    public String getGetGoodsPhone() {
        return getGoodsPhone;
    }

    public void setGetGoodsPhone(String getGoodsPhone) {
        this.getGoodsPhone = getGoodsPhone;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "startCity='" + startCity + '\'' +
                ", detailedStartAdress='" + detailedStartAdress + '\'' +
                ", endCity='" + endCity + '\'' +
                ", detailedEndAdress='" + detailEndAdress + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", size='" + size + '\'' +
                ", truckType='" + truckType + '\'' +
                ", length='" + length + '\'' +
                ", truckNum=" + truckNum +
                ", price='" + price + '\'' +
                ", sendGoodsPhone='" + sendGoodsPhone + '\'' +
                ", getGoodsPhone='" + getGoodsPhone + '\'' +
                ", createTime='" + createTime + '\'' +
                ", userId=" + userId +
                '}';
    }
}
