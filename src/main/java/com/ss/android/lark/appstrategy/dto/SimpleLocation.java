package com.ss.android.lark.appstrategy.dto;

import java.io.Serializable;

public class SimpleLocation implements Serializable {
    private double accuracy;
    private double latitude;
    private double longitude;

    public SimpleLocation() {
    }

    public double getAccuracy() {
        return this.accuracy;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public void setAccuracy(double d) {
        this.accuracy = d;
    }

    public void setLatitude(double d) {
        this.latitude = d;
    }

    public void setLongitude(double d) {
        this.longitude = d;
    }

    public SimpleLocation(double d, double d2) {
        this.latitude = d;
        this.longitude = d2;
    }

    public SimpleLocation(double d, double d2, double d3) {
        this.latitude = d;
        this.longitude = d2;
        this.accuracy = d3;
    }
}
