package com.ss.android.vc.entity.tab;

import com.ss.android.vc.entity.VCParticipantAbbrInfo;
import java.io.Serializable;
import java.util.List;

public class VCTabMeetingChangeInfo implements Serializable {
    private ChangeType changeType;
    private VCTabHistoryCommonInfo historyCommonInfo;
    private List<VCParticipantAbbrInfo> participants;

    public enum ChangeType {
        PARTICIPANT(0),
        MEETING(1);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static ChangeType valueOf(int i) {
            return forNumber(i);
        }

        public static ChangeType forNumber(int i) {
            if (i == 0) {
                return PARTICIPANT;
            }
            if (i != 1) {
                return null;
            }
            return MEETING;
        }

        private ChangeType(int i) {
            this.value = i;
        }
    }

    public ChangeType getChangeType() {
        return this.changeType;
    }

    public VCTabHistoryCommonInfo getHistoryCommonInfo() {
        return this.historyCommonInfo;
    }

    public List<VCParticipantAbbrInfo> getParticipants() {
        return this.participants;
    }

    public String toString() {
        return "VCTabMeetingChangeInfo{changeType=" + this.changeType + ", participants=" + this.participants + ", historyCommonInfo=" + this.historyCommonInfo + '}';
    }

    public void setChangeType(ChangeType changeType2) {
        this.changeType = changeType2;
    }

    public void setHistoryCommonInfo(VCTabHistoryCommonInfo cVar) {
        this.historyCommonInfo = cVar;
    }

    public void setParticipants(List<VCParticipantAbbrInfo> list) {
        this.participants = list;
    }
}
