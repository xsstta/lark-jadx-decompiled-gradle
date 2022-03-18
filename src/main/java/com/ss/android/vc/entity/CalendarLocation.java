package com.ss.android.vc.entity;

import java.io.Serializable;

public class CalendarLocation implements Serializable {
    private String address;
    private String name;

    public String getAddress() {
        return this.address;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "CalendarLocation{name='" + this.name + '\'' + ", address='" + this.address + '\'' + '}';
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setName(String str) {
        this.name = str;
    }
}
