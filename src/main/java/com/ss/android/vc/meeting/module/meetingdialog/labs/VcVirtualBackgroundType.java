package com.ss.android.vc.meeting.module.meetingdialog.labs;

public enum VcVirtualBackgroundType {
    UNKNOWN(0),
    TYPE_DISABLE(1),
    TYPE_VIRTUAL(2),
    TYPE_UPLOAD(3),
    TYPE_CUSTOMIZE(4),
    TYPE_BACKGROUND(5);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static int getNumber(VcVirtualBackgroundType vcVirtualBackgroundType) {
        if (vcVirtualBackgroundType == null) {
            return -1;
        }
        return vcVirtualBackgroundType.getNumber();
    }

    public static VcVirtualBackgroundType forNumber(int i) {
        if (i == 1) {
            return TYPE_DISABLE;
        }
        if (i == 2) {
            return TYPE_VIRTUAL;
        }
        if (i == 3) {
            return TYPE_UPLOAD;
        }
        if (i == 4) {
            return TYPE_CUSTOMIZE;
        }
        if (i != 5) {
            return UNKNOWN;
        }
        return TYPE_BACKGROUND;
    }

    private VcVirtualBackgroundType(int i) {
        this.value = i;
    }
}
