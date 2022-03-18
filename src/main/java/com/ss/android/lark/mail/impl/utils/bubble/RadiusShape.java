package com.ss.android.lark.mail.impl.utils.bubble;

public enum RadiusShape {
    RECTANGLE(0),
    OVAL(1);
    
    private int value;

    public int getValue() {
        return this.value;
    }

    public static RadiusShape fromInt(int i) {
        RadiusShape[] values = values();
        for (RadiusShape radiusShape : values) {
            if (i == radiusShape.getValue()) {
                return radiusShape;
            }
        }
        return RECTANGLE;
    }

    private RadiusShape(int i) {
        this.value = i;
    }
}
