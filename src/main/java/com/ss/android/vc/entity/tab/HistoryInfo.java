package com.ss.android.vc.entity.tab;

import com.ss.android.vc.entity.ParticipantType;
import java.io.Serializable;

public class HistoryInfo implements Serializable {
    long callStarTime;
    CallStatus callStatus;
    private HistoryInfoType historyInfoType;
    HistoryType historyType;
    String interacterUserId;
    ParticipantType interacterUserType;
    boolean isInLobby;
    long joinTime;
    long leaveTime;

    public enum CallStatus {
        UNKNOWN(0),
        ACCEPTED(1),
        CANCELED(2);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static CallStatus valueOf(int i) {
            return forNumber(i);
        }

        public static CallStatus forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return ACCEPTED;
            }
            if (i != 2) {
                return null;
            }
            return CANCELED;
        }

        private CallStatus(int i) {
            this.value = i;
        }
    }

    public enum HistoryInfoType {
        UNKNOWN(0),
        VIDEO_CONFERENCE(1),
        ENTERPRISE_PHONE(2);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static HistoryInfoType valueOf(int i) {
            return forNumber(i);
        }

        public static HistoryInfoType forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return VIDEO_CONFERENCE;
            }
            if (i != 2) {
                return null;
            }
            return ENTERPRISE_PHONE;
        }

        private HistoryInfoType(int i) {
            this.value = i;
        }
    }

    public enum HistoryType {
        UNKNOWN(0),
        JOIN(1),
        CALL(2),
        BE_CALLED(3),
        LEAVE(4);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static HistoryType valueOf(int i) {
            return forNumber(i);
        }

        public static HistoryType forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return JOIN;
            }
            if (i == 2) {
                return CALL;
            }
            if (i == 3) {
                return BE_CALLED;
            }
            if (i != 4) {
                return null;
            }
            return LEAVE;
        }

        private HistoryType(int i) {
            this.value = i;
        }
    }

    public HistoryInfo() {
    }

    public long getCallStarTime() {
        return this.callStarTime;
    }

    public CallStatus getCallStatus() {
        return this.callStatus;
    }

    public HistoryInfoType getHistoryInfoType() {
        return this.historyInfoType;
    }

    public HistoryType getHistoryType() {
        return this.historyType;
    }

    public String getInteracterUserId() {
        return this.interacterUserId;
    }

    public ParticipantType getInteracterUserType() {
        return this.interacterUserType;
    }

    public long getJoinTime() {
        return this.joinTime;
    }

    public long getLeaveTime() {
        return this.leaveTime;
    }

    public boolean isInLobby() {
        return this.isInLobby;
    }

    public String toString() {
        return "HistroyInfo{historyType=" + this.historyType + ", callStatus=" + this.callStatus + ", interacterUserId='" + this.interacterUserId + '\'' + ", interacterUserType=" + this.interacterUserType + ", callStarTime=" + this.callStarTime + ", joinTime=" + this.joinTime + ", leaveTime=" + this.leaveTime + '}';
    }

    public void setCallStarTime(long j) {
        this.callStarTime = j;
    }

    public void setCallStatus(CallStatus callStatus2) {
        this.callStatus = callStatus2;
    }

    public void setHistoryInfoType(HistoryInfoType historyInfoType2) {
        this.historyInfoType = historyInfoType2;
    }

    public void setHistoryType(HistoryType historyType2) {
        this.historyType = historyType2;
    }

    public void setInLobby(boolean z) {
        this.isInLobby = z;
    }

    public void setInteracterUserId(String str) {
        this.interacterUserId = str;
    }

    public void setInteracterUserType(ParticipantType participantType) {
        this.interacterUserType = participantType;
    }

    public void setJoinTime(long j) {
        this.joinTime = j;
    }

    public void setLeaveTime(long j) {
        this.leaveTime = j;
    }

    public HistoryInfo(HistoryType historyType2, CallStatus callStatus2, String str, ParticipantType participantType, long j, long j2, long j3) {
        this.historyType = historyType2;
        this.callStatus = callStatus2;
        this.interacterUserId = str;
        this.interacterUserType = participantType;
        this.callStarTime = j;
        this.joinTime = j2;
        this.leaveTime = j3;
    }
}
