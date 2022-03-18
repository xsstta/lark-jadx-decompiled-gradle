package com.bytedance.ee.eenet.util;

public enum ComplexConnect {
    TRUE("true"),
    FALSE("false");
    
    private String value;

    public String toString() {
        return this.value;
    }

    private ComplexConnect(String str) {
        this.value = str;
    }
}
