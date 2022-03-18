package com.ss.android.vc.entity.response;

public enum GrootChannelEntity {
    MEETING_SPACE(1),
    SKETCH(2),
    REMOTE_CONTROL(3),
    WHITEBOARD(4),
    FOLLOW(5),
    VC_TAB_USER_CHANNEL(7),
    VC_TAB_MEETING_CHANNEL(8),
    VC_TAB_LIST_CHANNEL(9),
    BREAKOUT_ROOM_CHANNEL(10);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static GrootChannelEntity fromValue(int i) {
        switch (i) {
            case 1:
                return MEETING_SPACE;
            case 2:
                return SKETCH;
            case 3:
                return REMOTE_CONTROL;
            case 4:
                return WHITEBOARD;
            case 5:
                return FOLLOW;
            case 6:
            default:
                return null;
            case 7:
                return VC_TAB_USER_CHANNEL;
            case 8:
                return VC_TAB_MEETING_CHANNEL;
            case 9:
                return VC_TAB_LIST_CHANNEL;
            case 10:
                return BREAKOUT_ROOM_CHANNEL;
        }
    }

    private GrootChannelEntity(int i) {
        this.value = i;
    }
}
