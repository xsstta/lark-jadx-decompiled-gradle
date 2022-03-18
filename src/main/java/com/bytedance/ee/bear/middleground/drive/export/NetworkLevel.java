package com.bytedance.ee.bear.middleground.drive.export;

public enum NetworkLevel {
    UNKNOWN(-1),
    EXCELLENT(1),
    EVALUATING(2),
    WEAK(3),
    NET_UNAVAILABLE(4),
    SERVICE_UNAVAILABLE(5),
    OFFLINE(6);
    
    private int status;

    public int getValue() {
        return this.status;
    }

    public static NetworkLevel forNumber(int i) {
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

    private NetworkLevel(int i) {
        this.status = i;
    }
}
