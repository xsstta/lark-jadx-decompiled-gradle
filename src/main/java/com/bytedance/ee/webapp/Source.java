package com.bytedance.ee.webapp;

public enum Source {
    UNKNOWN(0),
    APP(1),
    SPLASH(2),
    THIRD(3),
    MULTI_TASK(4),
    APP_CHAT(5),
    APP_CARD_SINGLE(8),
    APP_CARD_GROUP(9),
    APP_CARD_LINK_SINGLE(10),
    APP_CARD_LINK_GROUP(11);
    
    private int value;

    public int getValue() {
        return this.value;
    }

    public static Source getSource(int i) {
        Source[] values = values();
        for (Source source : values) {
            if (source.getValue() == i) {
                return source;
            }
        }
        return UNKNOWN;
    }

    private Source(int i) {
        this.value = i;
    }
}
