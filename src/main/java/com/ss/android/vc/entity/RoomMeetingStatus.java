package com.ss.android.vc.entity;

public enum RoomMeetingStatus {
    VIEW_ROOM_UNKNOWN(0),
    VIEW_ROOM_IDLE(1),
    VIEW_ROOM_BUSY(2),
    VIEW_ROOM_IN_MEETING(3);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static RoomMeetingStatus valueOf(int i) {
        return forNumber(i);
    }

    public static RoomMeetingStatus forNumber(int i) {
        if (i == 0) {
            return VIEW_ROOM_UNKNOWN;
        }
        if (i == 1) {
            return VIEW_ROOM_IDLE;
        }
        if (i == 2) {
            return VIEW_ROOM_BUSY;
        }
        if (i != 3) {
            return null;
        }
        return VIEW_ROOM_IN_MEETING;
    }

    private RoomMeetingStatus(int i) {
        this.value = i;
    }
}
