package com.ss.android.vc.entity.tab;

import com.ss.android.vc.entity.ParticipantType;
import java.io.Serializable;

public class VCHistoryAbbrInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private long callCount;
    private CallStatus callStatus;
    private HistoryType historyType;
    private String interacterUserId;
    private ParticipantType participantType;

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

    public enum HistoryType {
        UNKNOWN(0),
        JOIN(1),
        CALL(2),
        BE_CALLED(3);
        
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
            if (i != 3) {
                return null;
            }
            return BE_CALLED;
        }

        private HistoryType(int i) {
            this.value = i;
        }
    }

    public long getCallCount() {
        return this.callCount;
    }

    public CallStatus getCallStatus() {
        return this.callStatus;
    }

    public HistoryType getHistoryType() {
        return this.historyType;
    }

    public String getInteracterUserId() {
        return this.interacterUserId;
    }

    public ParticipantType getParticipantType() {
        return this.participantType;
    }

    public String toString() {
        return " callCount= " + this.callCount + " historyType= " + this.historyType + " callStatus= " + this.callStatus + " interactId= " + this.interacterUserId;
    }

    public void setCallCount(long j) {
        this.callCount = j;
    }

    public void setCallStatus(CallStatus callStatus2) {
        this.callStatus = callStatus2;
    }

    public void setHistoryType(HistoryType historyType2) {
        this.historyType = historyType2;
    }

    public void setInteracterUserId(String str) {
        this.interacterUserId = str;
    }

    public void setParticipantType(ParticipantType participantType2) {
        this.participantType = participantType2;
    }
}
