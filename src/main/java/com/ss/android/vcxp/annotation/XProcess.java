package com.ss.android.vcxp.annotation;

public enum XProcess {
    Unspecified(" "),
    Main(""),
    VC("p0"),
    Original("_");
    
    private final String value;

    public String value() {
        return this.value;
    }

    private XProcess(String str) {
        this.value = str;
    }
}
