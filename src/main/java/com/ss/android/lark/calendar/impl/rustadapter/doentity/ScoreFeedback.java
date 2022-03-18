package com.ss.android.lark.calendar.impl.rustadapter.doentity;

public enum ScoreFeedback {
    LOW(1),
    PROPER(2),
    HIGH(3);
    
    int value;

    public final int getValue() {
        return this.value;
    }

    public static ScoreFeedback forValue(int i) {
        if (i == 1) {
            return LOW;
        }
        if (i == 2) {
            return LOW;
        }
        if (i != 3) {
            return null;
        }
        return HIGH;
    }

    private ScoreFeedback(int i) {
        this.value = i;
    }
}
