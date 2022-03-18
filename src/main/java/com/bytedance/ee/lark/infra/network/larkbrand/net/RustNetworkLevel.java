package com.bytedance.ee.lark.infra.network.larkbrand.net;

public enum RustNetworkLevel {
    EXCELLENT("excellent"),
    EVALUATING("evaluating"),
    WEAK("weak"),
    NET_UNAVAILABLE("netUnavailable"),
    SERVICE_UNAVAILABLE("serviceUnavailable"),
    OFFLINE("offline"),
    UNKNOWN("unknown");
    
    private String status;

    public String getValue() {
        return this.status;
    }

    public static RustNetworkLevel forNumber(int i) {
        switch (i) {
            case 1:
                return EXCELLENT;
            case 2:
                return EVALUATING;
            case 3:
                return WEAK;
            case 4:
                return NET_UNAVAILABLE;
            case 5:
                return SERVICE_UNAVAILABLE;
            case 6:
                return OFFLINE;
            default:
                return UNKNOWN;
        }
    }

    private RustNetworkLevel(String str) {
        this.status = str;
    }
}
