package com.xcy.pojo;

import javax.xml.crypto.Data;

public class Driveknowledge {
    private int dkId;
    private String dkTotal;
    private Data dkCreateTime;

    public int getDkId() {
        return dkId;
    }

    public void setDkId(int dkId) {
        this.dkId = dkId;
    }

    public String getDkTotal() {
        return dkTotal;
    }

    public void setDkTotal(String dkTotal) {
        this.dkTotal = dkTotal;
    }

    public Data getDkCreateTime() {
        return dkCreateTime;
    }

    public void setDkCreateTime(Data dkCreateTime) {
        this.dkCreateTime = dkCreateTime;
    }

}
