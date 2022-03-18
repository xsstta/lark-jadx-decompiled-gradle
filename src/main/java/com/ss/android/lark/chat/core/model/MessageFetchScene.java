package com.ss.android.lark.chat.core.model;

public enum MessageFetchScene {
    FIRST_SCREEN(1, "首屏"),
    SPECIFIED_POSITION(2, "指定位置"),
    PREVIOUS_PAGE(3, "上一页"),
    NEXT_PAGE(4, "下一页");
    
    private String desc;
    private final int value;

    public String getDesc() {
        return this.desc;
    }

    public int getNumber() {
        return this.value;
    }

    public static MessageFetchScene fromValue(int i) {
        if (i == 1) {
            return FIRST_SCREEN;
        }
        if (i == 2) {
            return SPECIFIED_POSITION;
        }
        if (i == 3) {
            return PREVIOUS_PAGE;
        }
        if (i != 4) {
            return FIRST_SCREEN;
        }
        return NEXT_PAGE;
    }

    private MessageFetchScene(int i, String str) {
        this.value = i;
        this.desc = str;
    }
}
