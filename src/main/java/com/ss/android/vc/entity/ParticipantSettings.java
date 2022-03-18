package com.ss.android.vc.entity;

import java.io.Serializable;

public class ParticipantSettings implements Serializable {
    private static final long serialVersionUID = 1;
    private String appliedSpokenLanguage;
    private EquipmentStatus cameraStatus;
    private boolean enableSubtitleRecord;
    private boolean followingStatus;
    private HandsStatus handsStatus;
    private InterpreterSetting interpreterSetting;
    private boolean isCameraMuted;
    private boolean isMicrophoneMuted;
    private boolean isPlayMeetingTone;
    private boolean isSubtitleOn;
    private EquipmentStatus microphoneStatus;
    private String nickname;
    private RtcMode rtcMode;
    private String spokenLanguage;
    private String subtitleLanguage;

    public enum EquipmentStatus {
        UNKNOWN,
        NOT_EXIST,
        NO_PERMISSION,
        UNAVAILABLE,
        NORMAL
    }

    public enum HandsStatus {
        UNKNOWN(0),
        PUT_UP(1),
        PUT_DOWN(2),
        APPROVED(3),
        REJECT(4);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static HandsStatus valueOf(int i) {
            return forNumber(i);
        }

        public static HandsStatus forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return PUT_UP;
            }
            if (i == 2) {
                return PUT_DOWN;
            }
            if (i == 3) {
                return APPROVED;
            }
            if (i != 4) {
                return UNKNOWN;
            }
            return REJECT;
        }

        private HandsStatus(int i) {
            this.value = i;
        }
    }

    public enum RtcMode {
        UNKNOWN(0),
        NORMAL_MODE(1),
        AUDIENCE_MODE(2);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static RtcMode valueOf(int i) {
            return forNumber(i);
        }

        public static RtcMode forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return NORMAL_MODE;
            }
            if (i != 2) {
                return null;
            }
            return AUDIENCE_MODE;
        }

        private RtcMode(int i) {
            this.value = i;
        }
    }

    public String getAppliedSpokenLanguage() {
        return this.appliedSpokenLanguage;
    }

    public EquipmentStatus getCameraStatus() {
        return this.cameraStatus;
    }

    public HandsStatus getHandsStatus() {
        return this.handsStatus;
    }

    public InterpreterSetting getInterpreterSetting() {
        return this.interpreterSetting;
    }

    public EquipmentStatus getMicrophoneStatus() {
        return this.microphoneStatus;
    }

    public String getNickname() {
        return this.nickname;
    }

    public RtcMode getRtcMode() {
        return this.rtcMode;
    }

    public String getSpokenLanguage() {
        return this.spokenLanguage;
    }

    public String getSubtitleLanguage() {
        return this.subtitleLanguage;
    }

    public boolean isCameraMuted() {
        return this.isCameraMuted;
    }

    public boolean isEnableSubtitleRecord() {
        return this.enableSubtitleRecord;
    }

    public boolean isFollowingStatus() {
        return this.followingStatus;
    }

    public boolean isMicrophoneMuted() {
        return this.isMicrophoneMuted;
    }

    public boolean isPlayMeetingTone() {
        return this.isPlayMeetingTone;
    }

    public boolean isSubtitleOn() {
        return this.isSubtitleOn;
    }

    public String toString() {
        return "ParticipantSettings{isMicrophoneMuted=" + this.isMicrophoneMuted + ", isCameraMuted=" + this.isCameraMuted + ", handsStatus=" + this.handsStatus + ", microphoneStatus=" + this.microphoneStatus + ", cameraStatus=" + this.cameraStatus + ", isPlayMeetingTone=" + this.isPlayMeetingTone + ", isSubtitleOn=" + this.isSubtitleOn + ", subtitleLanguage='" + this.subtitleLanguage + '\'' + ", spokenLanguage='" + this.spokenLanguage + '\'' + ", followingStatus=" + this.followingStatus + '\'' + ", enableSubtitleRecord=" + this.enableSubtitleRecord + ", appliedSpokenLanguage='" + this.appliedSpokenLanguage + '\'' + ", rtcMode=" + this.rtcMode + ", interpreterSetting=" + this.interpreterSetting + '}';
    }

    public void setAppliedSpokenLanguage(String str) {
        this.appliedSpokenLanguage = str;
    }

    public void setCameraMuted(boolean z) {
        this.isCameraMuted = z;
    }

    public void setCameraStatus(EquipmentStatus equipmentStatus) {
        this.cameraStatus = equipmentStatus;
    }

    public void setEnableSubtitleRecord(boolean z) {
        this.enableSubtitleRecord = z;
    }

    public void setFollowingStatus(boolean z) {
        this.followingStatus = z;
    }

    public void setHandsStatus(HandsStatus handsStatus2) {
        this.handsStatus = handsStatus2;
    }

    public void setInterpreterSetting(InterpreterSetting interpreterSetting2) {
        this.interpreterSetting = interpreterSetting2;
    }

    public void setMicrophoneMuted(boolean z) {
        this.isMicrophoneMuted = z;
    }

    public void setMicrophoneStatus(EquipmentStatus equipmentStatus) {
        this.microphoneStatus = equipmentStatus;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setPlayMeetingTone(boolean z) {
        this.isPlayMeetingTone = z;
    }

    public void setRtcMode(RtcMode rtcMode2) {
        this.rtcMode = rtcMode2;
    }

    public void setSpokenLanguage(String str) {
        this.spokenLanguage = str;
    }

    public void setSubtitleLanguage(String str) {
        this.subtitleLanguage = str;
    }

    public void setSubtitleOn(boolean z) {
        this.isSubtitleOn = z;
    }
}
