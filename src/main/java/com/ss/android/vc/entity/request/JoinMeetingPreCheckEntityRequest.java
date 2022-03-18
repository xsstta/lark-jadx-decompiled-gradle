package com.ss.android.vc.entity.request;

public class JoinMeetingPreCheckEntityRequest {

    public enum JoinMeetingCheckIDType {
        UNKNOWN(0),
        MEETINGID(1),
        UNIQUEID(2),
        GROUPID(3),
        MEETINGNO(4),
        INTERVIEWUID(5),
        CALL_TARGET_USER(6),
        RESERVATION_ID(7);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static JoinMeetingCheckIDType fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return MEETINGID;
                case 2:
                    return UNIQUEID;
                case 3:
                    return GROUPID;
                case 4:
                    return MEETINGNO;
                case 5:
                    return INTERVIEWUID;
                case 6:
                    return CALL_TARGET_USER;
                case 7:
                    return RESERVATION_ID;
                default:
                    return null;
            }
        }

        private JoinMeetingCheckIDType(int i) {
            this.value = i;
        }
    }
}
