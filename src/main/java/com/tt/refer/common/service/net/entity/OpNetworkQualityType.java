package com.tt.refer.common.service.net.entity;

public enum OpNetworkQualityType {
    UNAVAILABLE("unavailable"),
    WEAK("weak"),
    MODERATE("moderate"),
    EXCELLENT("excellent"),
    UNKNOWN("unknown");
    
    private String networkQuality;

    public String getNetworkQuality() {
        return this.networkQuality;
    }

    private OpNetworkQualityType(String str) {
        this.networkQuality = str;
    }
}
