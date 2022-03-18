package com.ss.android.vc.entity;

import com.ss.android.vc.entity.livestream.LiveExtraInfo;
import java.io.Serializable;
import java.util.List;

public class VideoChatExtraInfo implements Serializable {
    private static final long serialVersionUID = 1;
    public ActionTime actionTime;
    public List<InMeetingData> inMeetingDatas;
    public LiveExtraInfo mLiveExtraInfo;
    public MeetingSubtitleData mMeetingSubtitleData;
    public RingingReceivedData ringingReceivedData;
    public Type type;
    public String version;

    public enum Type {
        UNKNOWN(0),
        RINGING_RECEIVED(1),
        IN_MEETING_CHANGED(2),
        SUBTITLE(3),
        UPDATE_LIVE_EXTRA_INFO(4);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Type valueOf(int i) {
            return forNumber(i);
        }

        public static Type forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return RINGING_RECEIVED;
            }
            if (i == 2) {
                return IN_MEETING_CHANGED;
            }
            if (i == 3) {
                return SUBTITLE;
            }
            if (i != 4) {
                return null;
            }
            return UPDATE_LIVE_EXTRA_INFO;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public static class RingingReceivedData implements Serializable {
        public String meetingId;
        public Participant participant;

        public String toString() {
            return "RingingReceivedData{meetingId='" + this.meetingId + '\'' + ", participant=" + this.participant + '}';
        }
    }

    public String toString() {
        return "VideoChatExtraInfo{type=" + this.type + ", ringingReceivedData=" + this.ringingReceivedData + ", actionTime=" + this.actionTime + ", inMeetingDatas=" + this.inMeetingDatas + ", version='" + this.version + '\'' + ", mMeetingSubtitleData=" + this.mMeetingSubtitleData + ", mLiveExtraInfo=" + this.mLiveExtraInfo + '}';
    }
}
