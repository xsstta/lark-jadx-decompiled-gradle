package com.bytedance.ee.eenet.util;

public enum RequestPriority {
    HIGH(0),
    MEDIUM(1),
    LOW(2);
    
    private int level;

    public int getLevel() {
        return this.level;
    }

    private RequestPriority(int i) {
        this.level = i;
    }
}
