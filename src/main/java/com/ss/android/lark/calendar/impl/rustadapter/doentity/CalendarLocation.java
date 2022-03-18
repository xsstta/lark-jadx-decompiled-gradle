package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import java.io.Serializable;

public class CalendarLocation implements Serializable {
    private static final long serialVersionUID = 1;
    private String address = "";
    private double latitude = 360.0d;
    private double longitude = 360.0d;
    private String mLocation = "";

    public String getAddress() {
        return this.address;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public String getLocation() {
        return this.mLocation;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setLatitude(float f) {
        this.latitude = (double) f;
    }

    public void setLocation(String str) {
        this.mLocation = str;
    }

    public void setLongitude(float f) {
        this.longitude = (double) f;
    }
}
