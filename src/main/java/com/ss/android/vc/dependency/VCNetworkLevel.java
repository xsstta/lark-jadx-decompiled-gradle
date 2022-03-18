package com.ss.android.vc.dependency;

public enum VCNetworkLevel {
    EXCELLENT(1),
    EVALUATING(2),
    WEAK(3),
    NET_UNAVAILABLE(4),
    SERVICE_UNAVAILABLE(5);
    
    private int status;

    public int getValue() {
        return this.status;
    }

    public static VCNetworkLevel forNumber(int i) {
        if (i == 1) {
            return EXCELLENT;
        }
        if (i == 2) {
            return EVALUATING;
        }
        if (i == 3) {
            return WEAK;
        }
        if (i == 4) {
            return NET_UNAVAILABLE;
        }
        if (i != 5) {
            return EXCELLENT;
        }
        return SERVICE_UNAVAILABLE;
    }

    private VCNetworkLevel(int i) {
        this.status = i;
    }
}
