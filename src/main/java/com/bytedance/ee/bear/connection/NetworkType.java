package com.bytedance.ee.bear.connection;

public enum NetworkType {
    NETWORK_UNKNOWN("Unknown"),
    NETWORK_WIFI("WiFi"),
    NETWORK_4G("4G"),
    NETWORK_3G("3G"),
    NETWORK_2G("2G"),
    NETWORK_MOBILE("MOBILE"),
    NETWORK_NO("No network");
    
    private String desc;

    public String toString() {
        return this.desc;
    }

    private NetworkType(String str) {
        this.desc = str;
    }
}
