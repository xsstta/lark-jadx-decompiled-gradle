package com.tt.refer.common.service.net.entity;

public enum TTNetNetworkQualityLevel {
    FAKE(-1),
    UNKNOWN(0),
    OFFLINE(1),
    SLOW_2G(2),
    TYPE_2G(3),
    TYPE_3G(4),
    SLOW_4G(5),
    MODERATE_4G(6),
    GOOD_4G(7),
    EXCELLENT_4G(8);
    
    private int networkQualityLevel;

    public int getValue() {
        return this.networkQualityLevel;
    }

    public static TTNetNetworkQualityLevel forNumber(int i) {
        switch (i) {
            case -1:
                return FAKE;
            case 0:
                return UNKNOWN;
            case 1:
                return OFFLINE;
            case 2:
                return SLOW_2G;
            case 3:
                return TYPE_2G;
            case 4:
                return TYPE_3G;
            case 5:
                return SLOW_4G;
            case 6:
                return MODERATE_4G;
            case 7:
                return GOOD_4G;
            case 8:
                return EXCELLENT_4G;
            default:
                return UNKNOWN;
        }
    }

    private TTNetNetworkQualityLevel(int i) {
        this.networkQualityLevel = i;
    }
}
