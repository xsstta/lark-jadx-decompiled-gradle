package com.ss.android.vc.entity;

import android.text.TextUtils;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.io.Serializable;

public class Participant implements Serializable {
    private static final long serialVersionUID = 1;
    private String breakoutRoomId;
    private String deviceId = "";
    private DeviceType deviceType;
    private long globalSeqId = 0;
    private Float gridSortScore = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
    private long handsUpTime;
    private String id;
    private String interactiveId;
    private String inviterDeviceId;
    private String inviterId;
    private ParticipantType inviterType;
    private boolean isGuest;
    private boolean is_host;
    private long joinTime;
    private VideoChatCapabilities mCapabilities;
    private int netWorkQuality;
    private OfflineReason offlineReason;
    private String ongoingInteractiveId;
    private String ongoingMeetingId;
    private ParticipantRole participantRole;
    private ParticipantRoleSettings participantRoleSettings;
    private ParticipantSettings participantSettings;
    private ParticipantType participantType;
    private PSTNInfo pstnInfo;
    private boolean ringing_received;
    private String rtcJoinId = "";
    private String sortName;
    private Status status;
    private String tenantId;
    private TenantTag tenantTag;
    private String uniqueKey;

    public enum DeviceType {
        UNKNOWN_DEVICE_TYPE(0),
        DESKTOP(1),
        MOBILE(2),
        WEB(3);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static DeviceType valueOf(int i) {
            return forNumber(i);
        }

        public static DeviceType forNumber(int i) {
            if (i == 0) {
                return UNKNOWN_DEVICE_TYPE;
            }
            if (i == 1) {
                return DESKTOP;
            }
            if (i == 2) {
                return MOBILE;
            }
            if (i != 3) {
                return null;
            }
            return WEB;
        }

        private DeviceType(int i) {
            this.value = i;
        }
    }

    public enum OfflineReason {
        UNKNOWN_OFFLINE_REASON(0),
        BUSY(1),
        REFUSE(2),
        RING_TIMEOUT(3),
        KICK_OUT(4),
        LEAVE(5),
        END(6),
        CANCEL(7),
        OVERTIME(8),
        ACCEPT_OTHER(9),
        FORBIDDEN_TARGET(12),
        JOIN_LOBBY(13),
        CALL_EXCEPTION(14),
        AUTO_END(15);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static OfflineReason valueOf(int i) {
            return forNumber(i);
        }

        public static OfflineReason forNumber(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_OFFLINE_REASON;
                case 1:
                    return BUSY;
                case 2:
                    return REFUSE;
                case 3:
                    return RING_TIMEOUT;
                case 4:
                    return KICK_OUT;
                case 5:
                    return LEAVE;
                case 6:
                    return END;
                case 7:
                    return CANCEL;
                case 8:
                    return OVERTIME;
                case 9:
                    return ACCEPT_OTHER;
                case 10:
                case 11:
                default:
                    return null;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    return FORBIDDEN_TARGET;
                case 13:
                    return JOIN_LOBBY;
                case 14:
                    return CALL_EXCEPTION;
                case 15:
                    return AUTO_END;
            }
        }

        private OfflineReason(int i) {
            this.value = i;
        }
    }

    public enum SortType {
        SELF(0),
        HOST(1),
        HANDS_UP(2),
        CO_HOST(3),
        INTERPRETER(4),
        ON_THE_CALL(5),
        RINGING(6),
        UNKNOWN(7);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static SortType valueOf(int i) {
            switch (i) {
                case 0:
                    return SELF;
                case 1:
                    return HOST;
                case 2:
                    return HANDS_UP;
                case 3:
                    return CO_HOST;
                case 4:
                    return INTERPRETER;
                case 5:
                    return ON_THE_CALL;
                case 6:
                    return RINGING;
                default:
                    return UNKNOWN;
            }
        }

        private SortType(int i) {
            this.value = i;
        }
    }

    public enum Status {
        UNKNOWN(0),
        CALLING(1),
        ON_THE_CALL(2),
        RINGING(3),
        IDLE(4);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Status valueOf(int i) {
            return forNumber(i);
        }

        public static Status forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return CALLING;
            }
            if (i == 2) {
                return ON_THE_CALL;
            }
            if (i == 3) {
                return RINGING;
            }
            if (i != 4) {
                return null;
            }
            return IDLE;
        }

        private Status(int i) {
            this.value = i;
        }
    }

    public enum TenantTag {
        STANDARD(0),
        UNDEFINED(1),
        SIMPLE(2);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static TenantTag valueOf(int i) {
            if (i == 0) {
                return STANDARD;
            }
            if (i != 2) {
                return UNDEFINED;
            }
            return SIMPLE;
        }

        private TenantTag(int i) {
            this.value = i;
        }
    }

    public String getBreakoutRoomId() {
        return this.breakoutRoomId;
    }

    public VideoChatCapabilities getCapabilities() {
        return this.mCapabilities;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public DeviceType getDeviceType() {
        return this.deviceType;
    }

    public long getGlobalSeqId() {
        return this.globalSeqId;
    }

    public Float getGridSortScore() {
        return this.gridSortScore;
    }

    public long getHandsUpTime() {
        return this.handsUpTime;
    }

    public String getId() {
        return this.id;
    }

    public String getInteractiveId() {
        return this.interactiveId;
    }

    public String getInviterDeviceId() {
        return this.inviterDeviceId;
    }

    public String getInviterId() {
        return this.inviterId;
    }

    public ParticipantType getInviterType() {
        return this.inviterType;
    }

    public long getJoinTime() {
        return this.joinTime;
    }

    public int getNetWorkQuality() {
        return this.netWorkQuality;
    }

    public OfflineReason getOfflineReason() {
        return this.offlineReason;
    }

    public String getOngoingInteractiveId() {
        return this.ongoingInteractiveId;
    }

    public String getOngoingMeetingId() {
        return this.ongoingMeetingId;
    }

    public PSTNInfo getPSTNInfo() {
        return this.pstnInfo;
    }

    public ParticipantRole getParticipantRole() {
        return this.participantRole;
    }

    public ParticipantRoleSettings getParticipantRoleSettings() {
        return this.participantRoleSettings;
    }

    public ParticipantSettings getParticipantSettings() {
        return this.participantSettings;
    }

    public ParticipantType getParticipantType() {
        return this.participantType;
    }

    public String getSortName() {
        return this.sortName;
    }

    public Status getStatus() {
        return this.status;
    }

    public String getTenantId() {
        return this.tenantId;
    }

    public TenantTag getTenantTag() {
        return this.tenantTag;
    }

    public String getUniqueKey() {
        return this.uniqueKey;
    }

    public boolean isGuest() {
        return this.isGuest;
    }

    public boolean isRingingReceived() {
        return this.ringing_received;
    }

    public boolean is_host() {
        return this.is_host;
    }

    public ParticipantMeetingRole getParticipantMeetingRole() {
        ParticipantRoleSettings participantRoleSettings2 = this.participantRoleSettings;
        if (participantRoleSettings2 != null) {
            return participantRoleSettings2.getMeetingRole();
        }
        return null;
    }

    public String getRtcJoinId() {
        if (!TextUtils.isEmpty(this.rtcJoinId)) {
            return this.rtcJoinId;
        }
        return this.deviceId;
    }

    public boolean isHostOrCoHost() {
        if (isCoHost() || this.is_host) {
            return true;
        }
        return false;
    }

    public boolean isCoHost() {
        if (getParticipantMeetingRole() == null || getParticipantMeetingRole() != ParticipantMeetingRole.CO_HOST) {
            return false;
        }
        return true;
    }

    public boolean isParticipant() {
        if (getParticipantMeetingRole() == null || getParticipantMeetingRole() != ParticipantMeetingRole.PARTICIPANT) {
            return false;
        }
        return true;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("{id = ");
        sb.append(this.id);
        sb.append(", deviceId = ");
        sb.append(this.deviceId);
        sb.append(", participantType = ");
        sb.append(this.participantType);
        sb.append(", status = ");
        Object obj = this.status;
        String str2 = "null";
        if (obj == null) {
            obj = str2;
        }
        sb.append(obj);
        sb.append(", is_host = ");
        sb.append(this.is_host);
        sb.append(", isGuest = ");
        sb.append(this.isGuest);
        sb.append(", offlineReason = ");
        Object obj2 = this.offlineReason;
        if (obj2 == null) {
            obj2 = str2;
        }
        sb.append(obj2);
        sb.append(", participantSettings = ");
        ParticipantSettings participantSettings2 = this.participantSettings;
        if (participantSettings2 == null) {
            str = str2;
        } else {
            str = participantSettings2.toString();
        }
        sb.append(str);
        sb.append(", interactiveId = ");
        String str3 = this.interactiveId;
        if (str3 == null) {
            str3 = str2;
        }
        sb.append(str3);
        sb.append(", capabilities = ");
        VideoChatCapabilities videoChatCapabilities = this.mCapabilities;
        if (videoChatCapabilities != null) {
            str2 = videoChatCapabilities.toString();
        }
        sb.append(str2);
        sb.append(", ongoingMeetingId = ");
        sb.append(this.ongoingMeetingId);
        sb.append(", ongoingInteractiveId = ");
        sb.append(this.ongoingInteractiveId);
        sb.append(", rtcJoinId = ");
        sb.append(this.rtcJoinId);
        sb.append("}");
        return sb.toString();
    }

    public void setBreakoutRoomId(String str) {
        this.breakoutRoomId = str;
    }

    public void setCapabilities(VideoChatCapabilities videoChatCapabilities) {
        this.mCapabilities = videoChatCapabilities;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setDeviceType(DeviceType deviceType2) {
        this.deviceType = deviceType2;
    }

    public void setGlobalSeqId(long j) {
        this.globalSeqId = j;
    }

    public void setGridSortScore(Float f) {
        this.gridSortScore = f;
    }

    public void setGuest(boolean z) {
        this.isGuest = z;
    }

    public void setHandsUpTime(long j) {
        this.handsUpTime = j;
    }

    public void setHost(boolean z) {
        this.is_host = z;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setInteractiveId(String str) {
        this.interactiveId = str;
    }

    public void setInviterDeviceId(String str) {
        this.inviterDeviceId = str;
    }

    public void setInviterId(String str) {
        this.inviterId = str;
    }

    public void setInviterType(ParticipantType participantType2) {
        this.inviterType = participantType2;
    }

    public void setJoinTime(long j) {
        this.joinTime = j;
    }

    public void setNetWorkQuality(int i) {
        this.netWorkQuality = i;
    }

    public void setOfflineReason(OfflineReason offlineReason2) {
        this.offlineReason = offlineReason2;
    }

    public void setOngoingInteractiveId(String str) {
        this.ongoingInteractiveId = str;
    }

    public void setOngoingMeetingId(String str) {
        this.ongoingMeetingId = str;
    }

    public void setPSTNInfo(PSTNInfo pSTNInfo) {
        this.pstnInfo = pSTNInfo;
    }

    public void setParticipantRole(ParticipantRole participantRole2) {
        this.participantRole = participantRole2;
    }

    public void setParticipantRoleSettings(ParticipantRoleSettings participantRoleSettings2) {
        this.participantRoleSettings = participantRoleSettings2;
    }

    public void setParticipantSettings(ParticipantSettings participantSettings2) {
        this.participantSettings = participantSettings2;
    }

    public void setParticipantType(ParticipantType participantType2) {
        this.participantType = participantType2;
    }

    public void setRingingReceived(boolean z) {
        this.ringing_received = z;
    }

    public void setRtcJoinId(String str) {
        this.rtcJoinId = str;
    }

    public void setSortName(String str) {
        this.sortName = str;
    }

    public void setStatus(Status status2) {
        this.status = status2;
    }

    public void setTenantId(String str) {
        this.tenantId = str;
    }

    public void setTenantTag(TenantTag tenantTag2) {
        this.tenantTag = tenantTag2;
    }

    public void setUniqueKey(String str) {
        this.uniqueKey = str;
    }
}
