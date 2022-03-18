package com.bytedance.ee.eenet.util;

public enum RequestAlias {
    UNKNOWN(0),
    API(1),
    FILE(2),
    OAPI(3),
    DRIVE(4),
    DOCS(5),
    MINA(6),
    OPEN(7),
    DOCS_API(8),
    PASSPORT(9);
    
    private int value;

    public int getValue() {
        return this.value;
    }

    private RequestAlias(int i) {
        this.value = i;
    }
}
