package com.ss.android.vc.dto;

import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantType;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

public class VideoChatContent extends Content {
    public MeetingCard meetingCard;
    public int type;

    @Retention(RetentionPolicy.SOURCE)
    public @interface MeetingSource {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface MeetingStatus {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    public static class MeetingCard implements Serializable {
        public String calendarId;
        public long endTime;
        public String forwarderId;
        public String hostId;
        public ParticipantType hostType;
        public boolean isExternal;
        private boolean isLobbyOpen;
        private boolean isLocked;
        public int maxParticipantCount;
        public String meetNumber;
        public String meetingId;
        public int meetingSource;
        public int meetingStatus;
        public ParticipantType ownerType;
        public String ownerUserId;
        public ArrayList<Participant> participants = new ArrayList<>();
        public String sponsorId;
        public long startTime;
        public ArrayList<Long> tenantIds;
        public String topic;
        public long totalParticipantNum;

        public boolean isLocked() {
            if (this.isLobbyOpen || !this.isLocked) {
                return false;
            }
            return true;
        }

        public String toString() {
            Object obj;
            StringBuilder sb = new StringBuilder();
            sb.append("MeetingCard{meetingId='");
            sb.append(this.meetingId);
            sb.append('\'');
            sb.append(", meetingStatus=");
            sb.append(this.meetingStatus);
            sb.append(", meetingSource=");
            sb.append(this.meetingSource);
            sb.append(", topic='");
            sb.append(this.topic);
            sb.append(", sponsorId='");
            sb.append(this.sponsorId);
            sb.append(", meetNumber='");
            sb.append(this.meetNumber);
            sb.append(", calendarId='");
            sb.append(this.calendarId);
            sb.append(", isLocked=");
            sb.append(this.isLocked);
            sb.append(", isLobbyOpen=");
            sb.append(this.isLobbyOpen);
            sb.append(", participant size=");
            ArrayList<Participant> arrayList = this.participants;
            if (arrayList == null) {
                obj = "0";
            } else {
                obj = Integer.valueOf(arrayList.size());
            }
            sb.append(obj);
            sb.append(", maxParticipantCount=");
            sb.append(this.maxParticipantCount);
            sb.append(", hostType=");
            sb.append(this.hostType);
            sb.append(", isExternal=");
            sb.append(this.isExternal);
            sb.append(", ownerUserId='");
            sb.append(this.ownerUserId);
            sb.append(", totalParticipantNum=");
            sb.append(this.totalParticipantNum);
            sb.append(", tenantIds=");
            sb.append(this.tenantIds);
            sb.append('}');
            return sb.toString();
        }

        public void setIsLocked(boolean z) {
            this.isLocked = z;
        }

        public void setLobbyOpen(boolean z) {
            this.isLobbyOpen = z;
        }

        public boolean isSameAs(MeetingCard meetingCard) {
            String str;
            String str2;
            String str3;
            ArrayList<Participant> arrayList;
            ArrayList<Long> arrayList2;
            if (meetingCard != null && (str = this.meetingId) != null && str.equals(meetingCard.meetingId) && this.meetingStatus == meetingCard.meetingStatus && (str2 = this.topic) != null && str2.equals(meetingCard.topic) && (str3 = this.calendarId) != null && str3.equals(meetingCard.calendarId) && this.isLocked == meetingCard.isLocked && this.isLobbyOpen == meetingCard.isLobbyOpen && this.isExternal == meetingCard.isExternal && (arrayList = this.participants) != null && meetingCard.participants != null && arrayList.size() == meetingCard.participants.size() && this.totalParticipantNum == meetingCard.totalParticipantNum && (arrayList2 = this.tenantIds) != null && meetingCard.tenantIds != null && arrayList2.size() == meetingCard.tenantIds.size()) {
                return true;
            }
            return false;
        }
    }

    @Override // com.ss.android.lark.chat.export.entity.message.Content
    public boolean isContentSame(Content content) {
        MeetingCard meetingCard2;
        if (content == null || !(content instanceof VideoChatContent)) {
            return false;
        }
        int i = this.type;
        if ((i == 1 || i == 2) && (meetingCard2 = this.meetingCard) != null && meetingCard2.isSameAs(((VideoChatContent) content).meetingCard)) {
            return true;
        }
        return false;
    }
}
