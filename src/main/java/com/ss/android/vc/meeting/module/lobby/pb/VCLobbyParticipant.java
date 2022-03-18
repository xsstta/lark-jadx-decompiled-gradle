package com.ss.android.vc.meeting.module.lobby.pb;

import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantType;
import java.io.Serializable;

public final class VCLobbyParticipant implements Serializable {
    private String interactive_id;
    private boolean isGuest;
    private boolean is_camera_muted;
    private boolean is_in_approval;
    private boolean is_microphone_muted;
    private boolean is_status_wait;
    private long join_lobby_time;
    private LeaveReason mLeaveReason;
    private String meeting_id;
    private String nick_name;
    private long seq_id;
    private String tenantId;
    private Participant.TenantTag tenantTag;
    private ByteviewUser user;

    public enum LeaveReason {
        UNKNOWN(0),
        HEARBEAT_EXPIRE(1),
        EXIT(2),
        HOST_REJECT(3),
        MEETING_END(4),
        HOST_APPROVE(5),
        VC_NOT_SUPPORT_LOBBY(6);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static LeaveReason fromValue(int i) {
            switch (i) {
                case 1:
                    return HEARBEAT_EXPIRE;
                case 2:
                    return EXIT;
                case 3:
                    return HOST_REJECT;
                case 4:
                    return MEETING_END;
                case 5:
                    return HOST_APPROVE;
                case 6:
                    return VC_NOT_SUPPORT_LOBBY;
                default:
                    return UNKNOWN;
            }
        }

        private LeaveReason(int i) {
            this.value = i;
        }
    }

    public String getInteractive_id() {
        return this.interactive_id;
    }

    public long getJoinLobbyTime() {
        return this.join_lobby_time;
    }

    public String getMeetingId() {
        return this.meeting_id;
    }

    public String getNickName() {
        return this.nick_name;
    }

    public long getSeq_id() {
        return this.seq_id;
    }

    public String getTenantId() {
        return this.tenantId;
    }

    public Participant.TenantTag getTenantTag() {
        return this.tenantTag;
    }

    public ByteviewUser getUser() {
        return this.user;
    }

    public boolean isCameraMuted() {
        return this.is_camera_muted;
    }

    public boolean isGuest() {
        return this.isGuest;
    }

    public boolean isInApproval() {
        return this.is_in_approval;
    }

    public boolean isMicrophoneMuted() {
        return this.is_microphone_muted;
    }

    public boolean isStatusWait() {
        return this.is_status_wait;
    }

    public ParticipantType getParticipantType() {
        return this.user.getParticipantType();
    }

    public String getID() {
        if (this.user == null) {
            return "";
        }
        return this.user.getUserId() + "-" + this.user.getDeviceId() + "-" + this.user.getParticipantType();
    }

    public String toString() {
        return "VCLobbyParticipant{user=" + this.user + ", meeting_id='" + this.meeting_id + '\'' + ", is_microphone_muted=" + this.is_microphone_muted + ", is_camera_muted=" + this.is_camera_muted + ", is_status_wait=" + this.is_status_wait + ", isGuest=" + this.isGuest + ", seq_id=" + this.seq_id + ", interactive_id=" + this.interactive_id + ", is_in_approval=" + this.is_in_approval + ", join_lobby_time=" + this.join_lobby_time + '\'' + '}';
    }

    public void setGuest(boolean z) {
        this.isGuest = z;
    }

    public void setInApproval(boolean z) {
        this.is_in_approval = z;
    }

    public void setInteractive_id(String str) {
        this.interactive_id = str;
    }

    public void setIsCameraMuted(boolean z) {
        this.is_camera_muted = z;
    }

    public void setIsMicrophoneMuted(boolean z) {
        this.is_microphone_muted = z;
    }

    public void setJoinLobbyTime(long j) {
        this.join_lobby_time = j;
    }

    public void setLeaveReason(LeaveReason leaveReason) {
        this.mLeaveReason = leaveReason;
    }

    public void setMeetingId(String str) {
        this.meeting_id = str;
    }

    public void setNickName(String str) {
        this.nick_name = str;
    }

    public void setSeq_id(long j) {
        this.seq_id = j;
    }

    public void setStatusWait(boolean z) {
        this.is_status_wait = z;
    }

    public void setTenantId(String str) {
        this.tenantId = str;
    }

    public void setTenantTag(Participant.TenantTag tenantTag2) {
        this.tenantTag = tenantTag2;
    }

    public void setUser(ByteviewUser byteviewUser) {
        this.user = byteviewUser;
    }
}
