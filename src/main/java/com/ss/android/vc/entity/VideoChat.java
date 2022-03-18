package com.ss.android.vc.entity;

import com.huawei.hms.android.HwBuildEx;
import com.ss.android.vc.meeting.module.VCBreakoutRoomInfo;
import com.ss.android.vc.p3088d.p3090b.C60871a;
import java.io.Serializable;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class VideoChat implements Serializable {
    private static final long serialVersionUID = 1;
    private ActionTime actionTime;
    private List<VCBreakoutRoomInfo> breakoutRoomInfos;
    private String creatingId;
    private EndReason endReason;
    private boolean force;
    private String groudId;
    private String hostDeviceId;
    private String hostId;
    private ParticipantType hostType;
    private String id;
    private String info;
    private String inviteId;
    private ParticipantType inviterType;
    private boolean isExternalForRing;
    private boolean isLarkMeeting;
    private boolean isOfflineRecovery;
    private boolean isVoiceCall;
    private ExtraInfo mExtraInfo;
    private String meetNumber;
    private MeetingConfig meetingConfig;
    private ByteviewUser meetingOwner;
    private MeetingSource meetingSource;
    private String meetingUrl;
    private VcMsgInfo msgInfo;
    private List<Participant> participants;
    private String pushSid;
    private String sdkType;
    private ByteviewUser sponsorUser;
    private long startTime;
    private String tenantId;
    private Type type;
    private VendorType vendorType;
    private VideoChatSettings videoChatSettings;
    private String zoomMeetNo;
    private String zoomPwd;
    private String zoomUserId;
    private String zoomUserTokne;
    private String zoomZak;

    public static class ExtraInfo implements Serializable {
        public boolean ignoreFor1v1;
        public Boolean isVoiceOnly;
    }

    public enum EndReason {
        UNKNOWN_END_REASON(0),
        HANGUP(1),
        CONNECTION_FAILED(2),
        RING_TIMEOUT(3),
        SDK_EXCEPTION(4),
        CANCEL(5),
        REFUSE(6),
        ACCEPT_OTHER(7),
        TRIAL_TIMEOUT(8),
        CALL_EXCEPTION(9),
        AUTO_END(10);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public static EndReason valueOf(int i) {
            return forNumber(i);
        }

        public static EndReason forNumber(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_END_REASON;
                case 1:
                    return HANGUP;
                case 2:
                    return CONNECTION_FAILED;
                case 3:
                    return RING_TIMEOUT;
                case 4:
                    return SDK_EXCEPTION;
                case 5:
                    return CANCEL;
                case 6:
                    return REFUSE;
                case 7:
                    return ACCEPT_OTHER;
                case 8:
                    return TRIAL_TIMEOUT;
                case 9:
                    return CALL_EXCEPTION;
                case 10:
                    return AUTO_END;
                default:
                    return null;
            }
        }

        private EndReason(int i) {
            this.value = i;
        }
    }

    public enum LogoType {
        RECORD(1),
        MS_CCM(2),
        MS_URL(3),
        LARK_MINUTES(4);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public static LogoType valueOf(int i) {
            return forNumber(i);
        }

        public static LogoType forNumber(int i) {
            if (i == 1) {
                return RECORD;
            }
            if (i == 2) {
                return MS_CCM;
            }
            if (i == 3) {
                return MS_URL;
            }
            if (i != 4) {
                return null;
            }
            return LARK_MINUTES;
        }

        private LogoType(int i) {
            this.value = i;
        }
    }

    public enum MeetingSource {
        VC_UNKNOWN_SOURCE_TYPE(0),
        VC_FROM_USER(1),
        VC_FROM_CALENDAR(2),
        VC_FROM_INTERVIEW(3),
        VC_FROM_DOC(5);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public static MeetingSource valueOf(int i) {
            return forNumber(i);
        }

        public static MeetingSource forNumber(int i) {
            if (i == 0) {
                return VC_UNKNOWN_SOURCE_TYPE;
            }
            if (i == 1) {
                return VC_FROM_USER;
            }
            if (i == 2) {
                return VC_FROM_CALENDAR;
            }
            if (i == 3) {
                return VC_FROM_INTERVIEW;
            }
            if (i != 5) {
                return null;
            }
            return VC_FROM_DOC;
        }

        private MeetingSource(int i) {
            this.value = i;
        }
    }

    public enum SearchChatterType {
        UNKNOWN(0),
        GROUP(1),
        QUERY(2);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public static SearchChatterType valueOf(int i) {
            return forNumber(i);
        }

        public static SearchChatterType forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return GROUP;
            }
            if (i != 2) {
                return null;
            }
            return QUERY;
        }

        private SearchChatterType(int i) {
            this.value = i;
        }
    }

    public enum Type {
        UNKNOWN(0),
        CALL(1),
        MEET(2);
        
        private final int value;

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
                return CALL;
            }
            if (i != 2) {
                return null;
            }
            return MEET;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public enum UpdateVideoChatAction {
        UNKNOWN(0),
        ACCEPT(1),
        REFUSE(2),
        CANCEL(3),
        LEAVE(4),
        END(5),
        RECEIVED_INVITATION(6),
        SDK_EXCEPTION(7),
        TERMINATE(8),
        TRIAL_TIMEOUT(9),
        LEAVE_LOBBY(10),
        MUTE_PUSH_ACK(11),
        AUTO_END(12);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public static UpdateVideoChatAction valueOf(int i) {
            return forNumber(i);
        }

        public static UpdateVideoChatAction forNumber(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return ACCEPT;
                case 2:
                    return REFUSE;
                case 3:
                    return CANCEL;
                case 4:
                    return LEAVE;
                case 5:
                    return END;
                case 6:
                    return RECEIVED_INVITATION;
                case 7:
                    return SDK_EXCEPTION;
                case 8:
                    return TERMINATE;
                case 9:
                    return TRIAL_TIMEOUT;
                case 10:
                    return LEAVE_LOBBY;
                case 11:
                    return MUTE_PUSH_ACK;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    return AUTO_END;
                default:
                    return null;
            }
        }

        private UpdateVideoChatAction(int i) {
            this.value = i;
        }
    }

    public enum VendorType {
        UNKNOWN_VENDOR_TYPE(0),
        ZOOM(1),
        RTC(2),
        LARK_RTC(3),
        LARK_PRE_RTC(4),
        LARK_RTC_TEST_PRE(240),
        LARK_RTC_TEST_GAUSS(241),
        LARK_RTC_TEST(255);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public static VendorType valueOf(int i) {
            return forNumber(i);
        }

        public static VendorType forNumber(int i) {
            if (i == 0) {
                return UNKNOWN_VENDOR_TYPE;
            }
            if (i == 1) {
                return ZOOM;
            }
            if (i == 2) {
                return RTC;
            }
            if (i == 3) {
                return LARK_RTC;
            }
            if (i == 4) {
                return LARK_PRE_RTC;
            }
            if (i == 240) {
                return LARK_RTC_TEST_PRE;
            }
            if (i == 241) {
                return LARK_RTC_TEST_GAUSS;
            }
            if (i != 255) {
                return null;
            }
            return LARK_RTC_TEST;
        }

        private VendorType(int i) {
            this.value = i;
        }
    }

    public VideoChat() {
    }

    public ActionTime getActionTime() {
        return this.actionTime;
    }

    public List<VCBreakoutRoomInfo> getBreakoutRoomInfos() {
        return this.breakoutRoomInfos;
    }

    public String getCreatingId() {
        return this.creatingId;
    }

    public EndReason getEndReason() {
        return this.endReason;
    }

    public ExtraInfo getExtraInfo() {
        return this.mExtraInfo;
    }

    public boolean getForce() {
        return this.force;
    }

    public String getGroudId() {
        return this.groudId;
    }

    public String getHostDeviceId() {
        return this.hostDeviceId;
    }

    public String getHostId() {
        return this.hostId;
    }

    public ParticipantType getHostType() {
        return this.hostType;
    }

    public String getId() {
        return this.id;
    }

    public String getInfo() {
        return this.info;
    }

    public String getInviteId() {
        return this.inviteId;
    }

    public ParticipantType getInviterType() {
        return this.inviterType;
    }

    public boolean getIsLarkMeeting() {
        return this.isLarkMeeting;
    }

    public boolean getIsOfflineRecovery() {
        return this.isOfflineRecovery;
    }

    public String getMeetNumber() {
        return this.meetNumber;
    }

    public MeetingConfig getMeetingConfig() {
        return this.meetingConfig;
    }

    public ByteviewUser getMeetingOwner() {
        return this.meetingOwner;
    }

    public MeetingSource getMeetingSource() {
        return this.meetingSource;
    }

    public String getMeetingUrl() {
        return this.meetingUrl;
    }

    public VcMsgInfo getMsgInfo() {
        return this.msgInfo;
    }

    public List<Participant> getParticipants() {
        return this.participants;
    }

    public String getPushSid() {
        return this.pushSid;
    }

    public ByteviewUser getSponsorUser() {
        return this.sponsorUser;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public String getTenantId() {
        return this.tenantId;
    }

    public Type getType() {
        return this.type;
    }

    public VendorType getVendorType() {
        return this.vendorType;
    }

    public VideoChatSettings getVideoChatSettings() {
        return this.videoChatSettings;
    }

    public boolean isExternalForRing() {
        return this.isExternalForRing;
    }

    public boolean isVoiceCall() {
        return this.isVoiceCall;
    }

    public String getSdkType() {
        String str = this.sdkType;
        if (str == null || str.isEmpty()) {
            decodeInfoJson();
        }
        return this.sdkType;
    }

    public String getZoomMeetNumber() {
        String str = this.zoomMeetNo;
        if (str == null || str.isEmpty()) {
            decodeInfoJson();
        }
        return this.zoomMeetNo;
    }

    public String getZoomUserId() {
        String str = this.zoomUserId;
        if (str == null || str.isEmpty()) {
            decodeInfoJson();
        }
        return this.zoomUserId;
    }

    public String getZoomUserToken() {
        String str = this.zoomUserTokne;
        if (str == null || str.isEmpty()) {
            decodeInfoJson();
        }
        return this.zoomUserTokne;
    }

    private void decodeInfoJson() {
        try {
            String str = this.info;
            if (str == null) {
                return;
            }
            if (!str.isEmpty()) {
                JSONObject jSONObject = new JSONObject(this.info);
                this.sdkType = jSONObject.getString("InfoType");
                this.zoomMeetNo = jSONObject.getString("MeetNumber");
                this.zoomUserId = jSONObject.getString("UserID");
                this.zoomUserTokne = jSONObject.getString("Token");
                this.zoomPwd = jSONObject.getString("Passcode");
            }
        } catch (JSONException e) {
            C60871a.m236612c("VideoChat", "[decodeInfoJson] JSONException " + e);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id = ");
        sb.append(this.id);
        sb.append(", meetNumber = ");
        sb.append(this.meetNumber);
        sb.append(", hostId = ");
        sb.append(this.hostId);
        sb.append(", type = ");
        Object obj = this.type;
        String str = "null";
        if (obj == null) {
            obj = str;
        }
        sb.append(obj);
        sb.append(", groupId = ");
        sb.append(this.groudId);
        sb.append(", inviteId = ");
        sb.append(this.inviteId);
        sb.append(", endReason = ");
        Object obj2 = this.endReason;
        if (obj2 == null) {
            obj2 = str;
        }
        sb.append(obj2);
        sb.append(", videoChatSettings = ");
        VideoChatSettings videoChatSettings2 = this.videoChatSettings;
        if (videoChatSettings2 != null) {
            str = videoChatSettings2.toString();
        }
        sb.append(str);
        sb.append(", creatingId = ");
        sb.append(this.creatingId);
        sb.append(", force = ");
        sb.append(this.force);
        return new StringBuilder(sb.toString()).toString();
    }

    public void setActionTime(ActionTime actionTime2) {
        this.actionTime = actionTime2;
    }

    public void setBreakoutRoomInfos(List<VCBreakoutRoomInfo> list) {
        this.breakoutRoomInfos = list;
    }

    public void setCreatingId(String str) {
        this.creatingId = str;
    }

    public void setEndReason(EndReason endReason2) {
        this.endReason = endReason2;
    }

    public void setExternalForRing(boolean z) {
        this.isExternalForRing = z;
    }

    public void setExtraInfo(ExtraInfo extraInfo) {
        this.mExtraInfo = extraInfo;
    }

    public void setForce(boolean z) {
        this.force = z;
    }

    public void setGroudId(String str) {
        this.groudId = str;
    }

    public void setHostDeviceId(String str) {
        this.hostDeviceId = str;
    }

    public void setHostId(String str) {
        this.hostId = str;
    }

    public void setHostType(ParticipantType participantType) {
        this.hostType = participantType;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setInfo(String str) {
        this.info = str;
    }

    public void setInviteId(String str) {
        this.inviteId = str;
    }

    public void setInviterType(ParticipantType participantType) {
        this.inviterType = participantType;
    }

    public void setIsLarkMeeting(boolean z) {
        this.isLarkMeeting = z;
    }

    public void setIsOfflineRecovery(boolean z) {
        this.isOfflineRecovery = z;
    }

    public void setMeetNumber(String str) {
        this.meetNumber = str;
    }

    public void setMeetingConfig(MeetingConfig meetingConfig2) {
        this.meetingConfig = meetingConfig2;
    }

    public void setMeetingOwner(ByteviewUser byteviewUser) {
        this.meetingOwner = byteviewUser;
    }

    public void setMeetingSource(MeetingSource meetingSource2) {
        this.meetingSource = meetingSource2;
    }

    public void setMeetingUrl(String str) {
        this.meetingUrl = str;
    }

    public void setMsgInfo(VcMsgInfo vcMsgInfo) {
        this.msgInfo = vcMsgInfo;
    }

    public void setParticipants(List<Participant> list) {
        this.participants = list;
    }

    public void setPushSid(String str) {
        this.pushSid = str;
    }

    public void setSponsorUser(ByteviewUser byteviewUser) {
        this.sponsorUser = byteviewUser;
    }

    public void setStartTime(long j) {
        this.startTime = j;
    }

    public void setTenantId(String str) {
        this.tenantId = str;
    }

    public void setType(Type type2) {
        this.type = type2;
    }

    public void setVendorType(VendorType vendorType2) {
        this.vendorType = vendorType2;
    }

    public void setVideoChatSettings(VideoChatSettings videoChatSettings2) {
        this.videoChatSettings = videoChatSettings2;
    }

    public void setVoiceCall(boolean z) {
        this.isVoiceCall = z;
    }

    public VideoChat(VideoChat videoChat) {
        if (videoChat != null) {
            this.id = videoChat.id;
            this.hostId = videoChat.hostId;
            this.hostDeviceId = videoChat.hostDeviceId;
            this.meetingUrl = videoChat.meetingUrl;
            this.type = videoChat.type;
            this.participants = videoChat.participants;
            this.groudId = videoChat.groudId;
            this.inviteId = videoChat.inviteId;
            this.info = videoChat.info;
            this.sdkType = videoChat.sdkType;
            this.zoomMeetNo = videoChat.zoomMeetNo;
            this.zoomUserId = videoChat.zoomUserId;
            this.zoomUserTokne = videoChat.zoomUserTokne;
            this.zoomZak = videoChat.zoomZak;
            this.zoomPwd = videoChat.zoomPwd;
            this.endReason = videoChat.endReason;
            this.actionTime = videoChat.actionTime;
            this.isOfflineRecovery = videoChat.isOfflineRecovery;
            this.videoChatSettings = videoChat.videoChatSettings;
            this.vendorType = videoChat.vendorType;
            this.creatingId = videoChat.creatingId;
            this.startTime = videoChat.startTime;
            this.msgInfo = videoChat.msgInfo;
            this.hostType = videoChat.hostType;
            this.inviterType = videoChat.inviterType;
            this.meetNumber = videoChat.meetNumber;
            this.sponsorUser = videoChat.sponsorUser;
            this.tenantId = videoChat.tenantId;
            this.pushSid = videoChat.pushSid;
        }
    }
}
