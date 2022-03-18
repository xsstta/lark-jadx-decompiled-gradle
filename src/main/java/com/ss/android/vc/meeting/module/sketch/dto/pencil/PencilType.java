package com.ss.android.vc.meeting.module.sketch.dto.pencil;

public enum PencilType {
    DEFAULT(1),
    MARKER(2);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static PencilType valueOf(int i) {
        if (i != 2) {
            return DEFAULT;
        }
        return MARKER;
    }

    private PencilType(int i) {
        this.value = i;
    }
}
