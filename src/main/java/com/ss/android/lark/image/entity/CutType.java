package com.ss.android.lark.image.entity;

public enum CutType {
    TOP(1),
    BOTTOM(2),
    LEFT(3),
    RIGHT(4),
    CENTER(5),
    FACE(6);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static CutType valueOf(int i) {
        return forNumber(i);
    }

    public static CutType forNumber(int i) {
        switch (i) {
            case 1:
                return TOP;
            case 2:
                return BOTTOM;
            case 3:
                return LEFT;
            case 4:
                return RIGHT;
            case 5:
                return CENTER;
            case 6:
                return FACE;
            default:
                return CENTER;
        }
    }

    private CutType(int i) {
        this.value = i;
    }
}
