package com.ss.android.lark.larkconfig.larksetting.handler.customnav;

public enum NavDataSource {
    V1(""),
    V2("_V2"),
    LEAN_MODE("_lean");
    
    private String mSuffix;

    public String getSuffix() {
        return this.mSuffix;
    }

    private NavDataSource(String str) {
        this.mSuffix = str;
    }
}
