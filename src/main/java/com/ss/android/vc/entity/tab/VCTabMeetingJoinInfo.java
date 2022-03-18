package com.ss.android.vc.entity.tab;

import java.io.Serializable;

public class VCTabMeetingJoinInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private JoinStatus joinStatus;
    private String meetingId;

    public enum JoinStatus {
        UNKNOWN(0),
        JOINED(1),
        WAITING(2),
        JOINABLE(3),
        END(4);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static JoinStatus valueOf(int i) {
            return forNumber(i);
        }

        public static JoinStatus forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return JOINED;
            }
            if (i == 2) {
                return WAITING;
            }
            if (i != 3) {
                return null;
            }
            return JOINABLE;
        }

        private JoinStatus(int i) {
            this.value = i;
        }
    }

    public JoinStatus getJoinStatus() {
        return this.joinStatus;
    }

    public String getMeetingId() {
        return this.meetingId;
    }

    public String toString() {
        return "VCTabMeetingJoinInfo{meetingId='" + this.meetingId + '\'' + ", joinStatus=" + this.joinStatus + '}';
    }

    public void setJoinStatus(JoinStatus joinStatus2) {
        this.joinStatus = joinStatus2;
    }

    public void setMeetingId(String str) {
        this.meetingId = str;
    }
}
