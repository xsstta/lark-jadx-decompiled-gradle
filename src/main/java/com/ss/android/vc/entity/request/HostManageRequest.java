package com.ss.android.vc.entity.request;

import com.huawei.hms.android.HwBuildEx;
import com.ss.android.vc.entity.C60937f;
import com.ss.android.vc.entity.MeetingSecuritySetting;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.breakoutroom.BreakoutRoomManage;
import com.ss.android.vc.entity.breakoutroom.MeetingBroadcastInfo;
import java.io.Serializable;

public class HostManageRequest implements Serializable {
    private static final long serialVersionUID = 1;
    private Action action;
    private Boolean allowPartiUnmute;
    private String breakoutRoomId;
    private BreakoutRoomManage breakoutRoomManage;
    private MeetingBroadcastInfo broadcastInfo;
    private CoHostAction coHostAction;
    private String globalSpokenLanguage;
    private C60937f interpretationSetting;
    private boolean isLocked;
    private boolean isMuteOnEntry;
    private boolean isMuted;
    private String meetingId;
    private boolean onlyHostCanReplaceShare;
    private boolean onlyHostCanShare;
    private boolean onlyPresenterCanAnnotate;
    private String participantDeviceId;
    private String participantId;
    private ParticipantType participantType;
    private MeetingSecuritySetting securitySetting;
    private String topic;

    public enum Action {
        UNKNOWN_ACTION(0),
        KICK_OUT_PARTICIPANT(1),
        TRANSFER_HOST(2),
        MUTE_MICROPHONE(3),
        MUTE_CAMERA(4),
        MUTE_ALL_MICROPHONE(5),
        LOCK_MEETING(6),
        CHANGE_TOPIC(7),
        MUTE_ON_ENTRY(8),
        SET_SECURITY_LEVEL(9),
        APPLY_GLOBAL_SPOKEN_LANGUAGE(10),
        ALLOW_PARTI_UNMUTE(11),
        SET_CO_HOST(12),
        SET_ONLY_HOST_CAN_SHARE(13),
        SET_ONLY_HOST_CAN_REPLACE_SHARE(14),
        STOP_CURRENT_SHARING(15),
        SET_INTERPRETATION_ACTION(16),
        SET_ONLY_PRESENTER_CAN_ANNOTATE(17),
        MANAGE_BREAKOUT_ROOM(18),
        MEETING_BROADCAST(19);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Action valueOf(int i) {
            return forNumber(i);
        }

        public static Action forNumber(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_ACTION;
                case 1:
                    return KICK_OUT_PARTICIPANT;
                case 2:
                    return TRANSFER_HOST;
                case 3:
                    return MUTE_MICROPHONE;
                case 4:
                    return MUTE_CAMERA;
                case 5:
                    return MUTE_ALL_MICROPHONE;
                case 6:
                    return LOCK_MEETING;
                case 7:
                    return CHANGE_TOPIC;
                case 8:
                    return MUTE_ON_ENTRY;
                case 9:
                    return SET_SECURITY_LEVEL;
                case 10:
                    return APPLY_GLOBAL_SPOKEN_LANGUAGE;
                case 11:
                    return ALLOW_PARTI_UNMUTE;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    return SET_CO_HOST;
                case 13:
                    return SET_ONLY_HOST_CAN_SHARE;
                case 14:
                    return SET_ONLY_HOST_CAN_REPLACE_SHARE;
                case 15:
                    return STOP_CURRENT_SHARING;
                case 16:
                    return SET_INTERPRETATION_ACTION;
                case 17:
                    return SET_ONLY_PRESENTER_CAN_ANNOTATE;
                case 18:
                    return MANAGE_BREAKOUT_ROOM;
                case 19:
                    return MEETING_BROADCAST;
                default:
                    return null;
            }
        }

        private Action(int i) {
            this.value = i;
        }
    }

    public enum CoHostAction {
        UNKNOWN(0),
        SET(1),
        UNSET(2);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static CoHostAction valueOf(int i) {
            return forNumber(i);
        }

        public static CoHostAction forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return SET;
            }
            if (i != 2) {
                return null;
            }
            return UNSET;
        }

        private CoHostAction(int i) {
            this.value = i;
        }
    }

    public Action getAction() {
        return this.action;
    }

    public Boolean getAllowPartiUnmute() {
        return this.allowPartiUnmute;
    }

    public String getBreakoutRoomId() {
        return this.breakoutRoomId;
    }

    public BreakoutRoomManage getBreakoutRoomManage() {
        return this.breakoutRoomManage;
    }

    public MeetingBroadcastInfo getBroadcastInfo() {
        return this.broadcastInfo;
    }

    public CoHostAction getCoHostAction() {
        return this.coHostAction;
    }

    public String getGlobalSpokenLanguage() {
        return this.globalSpokenLanguage;
    }

    public C60937f getInterpretationSetting() {
        return this.interpretationSetting;
    }

    public String getMeetingId() {
        return this.meetingId;
    }

    public boolean getOnlyHostCanReplaceShare() {
        return this.onlyHostCanReplaceShare;
    }

    public boolean getOnlyHostCanShare() {
        return this.onlyHostCanShare;
    }

    public boolean getOnlyPresenterCanAnnotate() {
        return this.onlyPresenterCanAnnotate;
    }

    public String getParticipantDeviceId() {
        return this.participantDeviceId;
    }

    public String getParticipantId() {
        return this.participantId;
    }

    public ParticipantType getParticipantType() {
        return this.participantType;
    }

    public MeetingSecuritySetting getSecuritySetting() {
        return this.securitySetting;
    }

    public String getTopic() {
        return this.topic;
    }

    public boolean isLocked() {
        return this.isLocked;
    }

    public boolean isMuteOnEntry() {
        return this.isMuteOnEntry;
    }

    public boolean isMuted() {
        return this.isMuted;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{action = ");
        Object obj = this.action;
        if (obj == null) {
            obj = "null";
        }
        sb.append(obj);
        sb.append(", meetingId = ");
        sb.append(this.meetingId);
        sb.append(", isMuted = ");
        sb.append(this.isMuted);
        sb.append(", participantId = ");
        sb.append(this.participantId);
        sb.append("}");
        return sb.toString();
    }

    public void setAction(Action action2) {
        this.action = action2;
    }

    public void setAllowPartiUnmute(Boolean bool) {
        this.allowPartiUnmute = bool;
    }

    public void setBreakoutRoomId(String str) {
        this.breakoutRoomId = str;
    }

    public void setBreakoutRoomManage(BreakoutRoomManage breakoutRoomManage2) {
        this.breakoutRoomManage = breakoutRoomManage2;
    }

    public void setBroadcastInfo(MeetingBroadcastInfo meetingBroadcastInfo) {
        this.broadcastInfo = meetingBroadcastInfo;
    }

    public void setCoHostAction(CoHostAction coHostAction2) {
        this.coHostAction = coHostAction2;
    }

    public void setGlobalSpokenLanguage(String str) {
        this.globalSpokenLanguage = str;
    }

    public void setInterpretationSetting(C60937f fVar) {
        this.interpretationSetting = fVar;
    }

    public void setLocked(boolean z) {
        this.isLocked = z;
    }

    public void setMeetingId(String str) {
        this.meetingId = str;
    }

    public void setMuteOnEntry(boolean z) {
        this.isMuteOnEntry = z;
    }

    public void setMuted(boolean z) {
        this.isMuted = z;
    }

    public void setOnlyHostCanReplaceShare(boolean z) {
        this.onlyHostCanReplaceShare = z;
    }

    public void setOnlyHostCanShare(boolean z) {
        this.onlyHostCanShare = z;
    }

    public void setOnlyPresenterCanAnnotate(boolean z) {
        this.onlyPresenterCanAnnotate = z;
    }

    public void setParticipantDeviceId(String str) {
        this.participantDeviceId = str;
    }

    public void setParticipantId(String str) {
        this.participantId = str;
    }

    public void setParticipantType(ParticipantType participantType2) {
        this.participantType = participantType2;
    }

    public void setSecuritySetting(MeetingSecuritySetting meetingSecuritySetting) {
        this.securitySetting = meetingSecuritySetting;
    }

    public void setTopic(String str) {
        this.topic = str;
    }
}
