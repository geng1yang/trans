package com.xcy.pojo;

public class Truck {
    private int id;
    private String startCity;
    private String endCity;
    private String truckType;
    private String size;
    private String length;
    private int truckNum;
    private String truckPhone;
    private String startTime;
    private int userId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getStartCity() {
        return startCity;
    }

    public void setStartCity(String startCity) {
        this.startCity = startCity;
    }

    public String getEndCity() {
        return endCity;
    }

    public void setEndCity(String endCity) {
        this.endCity = endCity;
    }

    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getTruckNum() {
        return truckNum;
    }

    public void setTruckNum(int truckNum) {
        this.truckNum = truckNum;
    }

    public String getTruckPhone() {
        return truckPhone;
    }

    public void setTruckPhone(String truckPhone) {
        this.truckPhone = truckPhone;
    }



    @Override
    public String toString() {
        return "Truck{" +
                "startCity='" + startCity + '\'' +
                ", endCity='" + endCity + '\'' +
                ", truckType='" + truckType + '\'' +
                ", size='" + size + '\'' +
                ", truckNum=" + truckNum +
                ", truckPhone='" + truckPhone + '\'' +
                ", startTime=" + startTime +
                '}';
    }
}
