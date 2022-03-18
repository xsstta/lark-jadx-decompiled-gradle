package com.ss.android.lark.mm.module.highlight.timeline;

public enum HighlightTimeLineItemType {
    FIND(1),
    COMMENT(2),
    REACTION(3),
    UNKNOWN(-1);
    
    private final int value;

    public int getValue() {
        return this.value;
    }

    public static HighlightTimeLineItemType fromValue(int i) {
        if (i == 1) {
            return FIND;
        }
        if (i == 2) {
            return COMMENT;
        }
        if (i != 3) {
            return UNKNOWN;
        }
        return REACTION;
    }

    private HighlightTimeLineItemType(int i) {
        this.value = i;
    }
}
