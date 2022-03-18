package com.ss.android.vc.entity;

import java.io.Serializable;

public class H323Access implements Serializable {
    String country;
    String ip;

    public String getCountry() {
        return this.country;
    }

    public String getIp() {
        return this.ip;
    }

    public String toString() {
        return "H323Access{ip='" + this.ip + '\'' + ", country='" + this.country + '\'' + '}';
    }

    public void setCountry(String str) {
        this.country = str;
    }

    public void setIp(String str) {
        this.ip = str;
    }
}
