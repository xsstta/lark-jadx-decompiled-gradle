package org.webrtc;

public enum FilterType {
    Origin(9),
    Bilinear(10),
    Bicubic(11);
    
    private final int value;

    public int toInt() {
        return this.value;
    }

    public static FilterType fromValue(int i) {
        if (i == 10) {
            return Bilinear;
        }
        if (i != 11) {
            return Origin;
        }
        return Bicubic;
    }

    private FilterType(int i) {
        this.value = i;
    }
}
