package com.ss.android.vc.meeting.module.lobby.pb;

import com.ss.android.vc.meeting.module.VCBreakoutRoomCountdownInfo;

public class VCManageResult {

    /* renamed from: a */
    public String f156103a;

    /* renamed from: b */
    public Type f156104b;

    /* renamed from: c */
    public Action f156105c;

    /* renamed from: d */
    public VCBreakoutRoomCountdownInfo f156106d;

    public enum Action {
        UNKNOWN(0),
        HOSTREJECT(1),
        MEETINGEND(2),
        HOSTALLOWED(3),
        LEAVEVCLOBBY(4),
        ENTERVCLOBBY(5),
        VC_MEETING_NOT_SUPPORT(6),
        MEETING_START(7);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public int getValue() {
            return this.value;
        }

        public static Action fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return HOSTREJECT;
                case 2:
                    return MEETINGEND;
                case 3:
                    return HOSTALLOWED;
                case 4:
                    return LEAVEVCLOBBY;
                case 5:
                    return ENTERVCLOBBY;
                case 6:
                    return VC_MEETING_NOT_SUPPORT;
                case 7:
                    return MEETING_START;
                default:
                    return null;
            }
        }

        private Action(int i) {
            this.value = i;
        }
    }

    public enum Type {
        TYPEUNKNOWN(0),
        MEETINGLOBBY(1),
        MEETINGPRELOBBY(2),
        BREAKOUT_ROOM_NEED_HELP(3),
        BREAKOUT_ROOM_COUNT_DOWN(4);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 0) {
                return TYPEUNKNOWN;
            }
            if (i == 1) {
                return MEETINGLOBBY;
            }
            if (i == 2) {
                return MEETINGPRELOBBY;
            }
            if (i == 3) {
                return BREAKOUT_ROOM_NEED_HELP;
            }
            if (i != 4) {
                return null;
            }
            return BREAKOUT_ROOM_COUNT_DOWN;
        }

        private Type(int i) {
            this.value = i;
        }
    }
}
