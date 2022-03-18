package com.ss.android.lark.preload;

public enum PreloadTarget {
    DOC(1),
    MINI_APP(2),
    MAIL(3);
    
    private int value;

    public int getValue() {
        return this.value;
    }

    private PreloadTarget(int i) {
        this.value = i;
    }
}
