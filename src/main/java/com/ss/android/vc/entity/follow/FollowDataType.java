package com.ss.android.vc.entity.follow;

public enum FollowDataType {
    FOLLOW_DATA_UNKNOWN(0),
    FOLLOW_WEB_DATA(1);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static FollowDataType valueOf(int i) {
        return forNumber(i);
    }

    public static FollowDataType forNumber(int i) {
        if (i == 0) {
            return FOLLOW_DATA_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return FOLLOW_WEB_DATA;
    }

    private FollowDataType(int i) {
        this.value = i;
    }
}
