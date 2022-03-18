package com.bytedance.ee.lark.infra.network.larkbrand.net;

public enum MiniEnvType {
    RELEASE("online"),
    STAGING("staging"),
    PRE_RELEASE("pre_release"),
    UNKNOWN("unknown");
    
    private String status;

    public String getValue() {
        return this.status;
    }

    public static MiniEnvType forNumber(int i) {
        if (i == 1) {
            return RELEASE;
        }
        if (i == 2) {
            return STAGING;
        }
        if (i != 3) {
            return UNKNOWN;
        }
        return PRE_RELEASE;
    }

    private MiniEnvType(String str) {
        this.status = str;
    }
}
