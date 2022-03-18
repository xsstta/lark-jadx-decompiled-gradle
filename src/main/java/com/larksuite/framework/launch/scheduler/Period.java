package com.larksuite.framework.launch.scheduler;

public enum Period {
    APP_ATTACHBASE2SUPER(0),
    APP_SUPER2ATTACHBASEEND(1),
    APP_ONCREATE2SUPER(2),
    APP_SUPER2ONCREATEEND(3);
    
    private int value;

    public int getValue() {
        return this.value;
    }

    private Period(int i) {
        this.value = i;
    }
}
