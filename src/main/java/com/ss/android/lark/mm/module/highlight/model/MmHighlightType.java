package com.ss.android.lark.mm.module.highlight.model;

public enum MmHighlightType {
    HIGHLIGHT(1),
    COMMENT(2),
    MINUTES(3);
    
    private final int type;

    public int getType() {
        return this.type;
    }

    static MmHighlightType fromValue(int i) {
        if (i == 1) {
            return HIGHLIGHT;
        }
        if (i == 2) {
            return COMMENT;
        }
        if (i != 3) {
            return HIGHLIGHT;
        }
        return MINUTES;
    }

    private MmHighlightType(int i) {
        this.type = i;
    }
}
