package com.ss.android.lark.chat.service.impl;

public enum ThreadRecommendScene {
    FIRST_SCREEN(1, "First screen"),
    NEXT_PAGE(2, "Next page"),
    REFRESH(3, "Refresh");
    
    private String desc;
    private final int value;

    public String getDesc() {
        return this.desc;
    }

    public int getValue() {
        return this.value;
    }

    public static ThreadRecommendScene fromValue(int i) {
        if (i == 1) {
            return FIRST_SCREEN;
        }
        if (i == 2) {
            return NEXT_PAGE;
        }
        if (i != 3) {
            return FIRST_SCREEN;
        }
        return REFRESH;
    }

    private ThreadRecommendScene(int i, String str) {
        this.value = i;
        this.desc = str;
    }
}
