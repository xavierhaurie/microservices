package com._minutes.microservices.limits_service.bean;

public class Limits {

    private int mimimum;
    private int maximum;

    public Limits() {}

    public Limits(int mimimum, int maximum) {
        this.mimimum = mimimum;
        this.maximum = maximum;
    }

    public int getMimimum() {
        return mimimum;
    }

    public void setMimimum(int mimimum) {
        this.mimimum = mimimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }
}
