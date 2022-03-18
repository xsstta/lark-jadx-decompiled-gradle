package com.ss.android.lark.mail.impl.utils.bubble;

public enum ArrowDirection {
    LEFT(0),
    RIGHT(1),
    TOP(2),
    BOTTOM(3),
    LEFT_CENTER(4),
    RIGHT_CENTER(5),
    TOP_CENTER(6),
    BOTTOM_CENTER(7),
    VERTICAL_AUTO(8);
    
    private int value;

    public int getValue() {
        return this.value;
    }

    public static ArrowDirection fromInt(int i) {
        ArrowDirection[] values = values();
        for (ArrowDirection arrowDirection : values) {
            if (i == arrowDirection.getValue()) {
                return arrowDirection;
            }
        }
        return LEFT;
    }

    private ArrowDirection(int i) {
        this.value = i;
    }
}
