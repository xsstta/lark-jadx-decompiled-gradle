package com.ss.android.vc.entity.tab;

import com.ss.android.vc.entity.VideoChat;
import java.io.Serializable;
import java.util.List;

public class VCTabListItem implements Serializable {
    private static final long serialVersionUID = 1;
    private boolean containsMultipleTenant;
    private List<VideoChat.LogoType> contentLogos;
    private long createTime;
    private long endTime;
    private VCHistoryAbbrInfo historyAbbrInfo;
    private String historyId;
    private boolean isLocked;
    private String key;
    private String meetingId;
    private String meetingNumber;
    private VideoChat.MeetingSource meetingSource;
    private MeetingStatus meetingStatus;
    private long meetingTime;
    private String meetingTopic;
    private VideoChat.Type meetingType;
    private long originalTime;
    private String phoneNumber;
    private PhoneType phoneType;
    private List<CalendarEventReminder> reminders;
    private String sameTenantId;
    private boolean subscribeDetailChange;
    private String uniqueId;

    public enum MeetingStatus {
        MEETING_UNKNOWN(0),
        MEETING_CALLING(1),
        MEETING_ON_THE_CALL(2),
        MEETING_END(3),
        MEETING_UPCOMING(4);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public static MeetingStatus valueOf(int i) {
            return forNumber(i);
        }

        public static MeetingStatus forNumber(int i) {
            if (i == 1) {
                return MEETING_CALLING;
            }
            if (i == 2) {
                return MEETING_ON_THE_CALL;
            }
            if (i == 3) {
                return MEETING_END;
            }
            if (i != 4) {
                return MEETING_UNKNOWN;
            }
            return MEETING_UPCOMING;
        }

        private MeetingStatus(int i) {
            this.value = i;
        }
    }

    public enum PhoneType {
        VC(0),
        OUTSIDE_ENTERPRISE_PHONE(1);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public static PhoneType valueOf(int i) {
            return forNumber(i);
        }

        public static PhoneType forNumber(int i) {
            if (i != 1) {
                return VC;
            }
            return OUTSIDE_ENTERPRISE_PHONE;
        }

        private PhoneType(int i) {
            this.value = i;
        }
    }

    public List<VideoChat.LogoType> getContentLogos() {
        return this.contentLogos;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public VCHistoryAbbrInfo getHistoryAbbrInfo() {
        return this.historyAbbrInfo;
    }

    public String getHistoryId() {
        return this.historyId;
    }

    public String getKey() {
        return this.key;
    }

    public String getMeetingId() {
        return this.meetingId;
    }

    public String getMeetingNumber() {
        return this.meetingNumber;
    }

    public VideoChat.MeetingSource getMeetingSource() {
        return this.meetingSource;
    }

    public MeetingStatus getMeetingStatus() {
        return this.meetingStatus;
    }

    public long getMeetingTime() {
        return this.meetingTime;
    }

    public String getMeetingTopic() {
        return this.meetingTopic;
    }

    public VideoChat.Type getMeetingType() {
        return this.meetingType;
    }

    public long getOriginalTime() {
        return this.originalTime;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public PhoneType getPhoneType() {
        return this.phoneType;
    }

    public List<CalendarEventReminder> getReminders() {
        return this.reminders;
    }

    public String getSameTenantId() {
        return this.sameTenantId;
    }

    public String getUniqueId() {
        return this.uniqueId;
    }

    public boolean isContainsMultipleTenant() {
        return this.containsMultipleTenant;
    }

    public boolean isLocked() {
        return this.isLocked;
    }

    public boolean isSubscribeDetailChange() {
        return this.subscribeDetailChange;
    }

    public boolean isHistory() {
        if (this.meetingStatus == MeetingStatus.MEETING_END) {
            return true;
        }
        return false;
    }

    public boolean isOngoing() {
        if (this.meetingStatus == MeetingStatus.MEETING_ON_THE_CALL) {
            return true;
        }
        return false;
    }

    public boolean isUpcoming() {
        if (this.meetingStatus == MeetingStatus.MEETING_UPCOMING) {
            return true;
        }
        return false;
    }

    public String toString() {
        return " \nVCTabListItem: " + " \nhistoryId= " + this.historyId + " \nmeetingTopic= " + this.meetingTopic + " \nisLocked= " + this.isLocked + " \nmeetingId= " + this.meetingId + " \nmeetingTime= " + this.meetingTime + " \ncontainsMultipleTenant = " + this.containsMultipleTenant + " \nmeetingSource= " + this.meetingSource + " \nmeetingStatus= " + this.meetingStatus + " \nmeetingNumber= " + this.meetingNumber + " \nendTime= " + this.endTime + " \ncreateTime= " + this.createTime + " \nkey= " + this.key + " \noriginalTime= " + this.originalTime + " \nreminders= " + this.reminders + " \nphoneType= " + this.phoneType + " \n";
    }

    public void setContainsMultipleTenant(boolean z) {
        this.containsMultipleTenant = z;
    }

    public void setContentLogos(List<VideoChat.LogoType> list) {
        this.contentLogos = list;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setEndTime(long j) {
        this.endTime = j;
    }

    public void setHistoryAbbrInfo(VCHistoryAbbrInfo vCHistoryAbbrInfo) {
        this.historyAbbrInfo = vCHistoryAbbrInfo;
    }

    public void setHistoryId(String str) {
        this.historyId = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setLocked(boolean z) {
        this.isLocked = z;
    }

    public void setMeetingId(String str) {
        this.meetingId = str;
    }

    public void setMeetingNumber(String str) {
        this.meetingNumber = str;
    }

    public void setMeetingSource(VideoChat.MeetingSource meetingSource2) {
        this.meetingSource = meetingSource2;
    }

    public void setMeetingStatus(MeetingStatus meetingStatus2) {
        this.meetingStatus = meetingStatus2;
    }

    public void setMeetingTime(long j) {
        this.meetingTime = j;
    }

    public void setMeetingTopic(String str) {
        this.meetingTopic = str;
    }

    public void setMeetingType(VideoChat.Type type) {
        this.meetingType = type;
    }

    public void setOriginalTime(long j) {
        this.originalTime = j;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public void setPhoneType(PhoneType phoneType2) {
        this.phoneType = phoneType2;
    }

    public void setReminders(List<CalendarEventReminder> list) {
        this.reminders = list;
    }

    public void setSameTenantId(String str) {
        this.sameTenantId = str;
    }

    public void setSubscribeDetailChange(boolean z) {
        this.subscribeDetailChange = z;
    }

    public void setUniqueId(String str) {
        this.uniqueId = str;
    }
}
