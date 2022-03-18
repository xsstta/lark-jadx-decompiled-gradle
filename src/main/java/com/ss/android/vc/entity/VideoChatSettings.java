package com.ss.android.vc.entity;

import com.ss.android.lark.calendar.impl.utils.CalendarWorkHourUtil;
import com.ss.android.vc.entity.MeetingSecuritySetting;
import java.io.Serializable;
import java.util.List;

public class VideoChatSettings implements Serializable {
    private static final long serialVersionUID = 1;
    private boolean allowPartiUnMute = true;
    private int countDownDuration;
    private VCFeatureConfig featureConfig;
    private VideoChatH323Setting h323Setting;
    private boolean isBoxSharing;
    private boolean isCameraMuted;
    private boolean isMeetingOpenInterpretation = true;
    private boolean isMicrophoneMuted;
    private boolean isMuteOnEntry;
    private boolean isOpenBreakoutRoom;
    private boolean isOwnerJoinedMeeting;
    private VCManageCapability mManageCapability;
    private RTCProxy mRTCProxy;
    private int maxParticipantNum;
    private int maxSoftRtcNormalMode;
    private int maxVideoChatDuration;
    private List<LanguageType> meetingSupportLanguages;
    private boolean onlyHostCanReplaceShare;
    private boolean onlyHostCanShare;
    private boolean onlyPresenterCanAnnotate;
    private int planTimeLimit = CalendarWorkHourUtil.f83805a;
    private PlanType planType = PlanType.PLAN_FREE;
    private MeetingSecuritySetting securitySetting;
    private VideoChatSIPSetting sipSetting;
    private SubType subType;
    private String topic;

    public enum PlanType {
        PLAN_UNKNOWN(0),
        PLAN_FREE(1),
        PLAN_BASIC(2),
        PLAN_BUSINESS(3),
        PLAN_ENTERPRISE(4),
        PLAN_NEW_STANDARD(5),
        PLAN_NEW_CERT_STANDARD(6),
        PLAN_NEW_BUSINESS(7),
        PLAN_NEW_ENTERPRISE(8);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static PlanType valueOf(int i) {
            return forNumber(i);
        }

        public static PlanType forNumber(int i) {
            switch (i) {
                case 0:
                    return PLAN_UNKNOWN;
                case 1:
                    return PLAN_FREE;
                case 2:
                    return PLAN_BASIC;
                case 3:
                    return PLAN_BUSINESS;
                case 4:
                    return PLAN_ENTERPRISE;
                case 5:
                    return PLAN_NEW_STANDARD;
                case 6:
                    return PLAN_NEW_CERT_STANDARD;
                case 7:
                    return PLAN_NEW_BUSINESS;
                case 8:
                    return PLAN_NEW_ENTERPRISE;
                default:
                    return null;
            }
        }

        private PlanType(int i) {
            this.value = i;
        }
    }

    public enum SubType {
        DEFAULT(0),
        SCREEN_SHARE(1),
        WIRED_SCREEN_SHARE(2),
        FOLLOW_SHARE(3),
        CHAT_ROOM(4);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static SubType valueOf(int i) {
            return forNumber(i);
        }

        public static SubType forNumber(int i) {
            if (i == 0) {
                return DEFAULT;
            }
            if (i == 1) {
                return SCREEN_SHARE;
            }
            if (i == 2) {
                return WIRED_SCREEN_SHARE;
            }
            if (i == 3) {
                return FOLLOW_SHARE;
            }
            if (i != 4) {
                return null;
            }
            return CHAT_ROOM;
        }

        private SubType(int i) {
            this.value = i;
        }
    }

    public boolean getAllowPartiUnMute() {
        return this.allowPartiUnMute;
    }

    public int getCountDownDuration() {
        return this.countDownDuration;
    }

    public VCFeatureConfig getFeatureConfig() {
        return this.featureConfig;
    }

    public VideoChatH323Setting getH323Setting() {
        return this.h323Setting;
    }

    public VCManageCapability getManageCapability() {
        return this.mManageCapability;
    }

    public int getMaxParticipantNum() {
        return this.maxParticipantNum;
    }

    public int getMaxSoftRtcNormalMode() {
        return this.maxSoftRtcNormalMode;
    }

    public int getMaxVideoChatDuration() {
        return this.maxVideoChatDuration;
    }

    public List<LanguageType> getMeetingSupportLanguages() {
        return this.meetingSupportLanguages;
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

    public int getPlanTimeLimit() {
        return this.planTimeLimit;
    }

    public PlanType getPlanType() {
        return this.planType;
    }

    public RTCProxy getRTCProxy() {
        return this.mRTCProxy;
    }

    public VideoChatSIPSetting getSIPSetting() {
        return this.sipSetting;
    }

    public MeetingSecuritySetting getSecuritySetting() {
        return this.securitySetting;
    }

    public SubType getSubType() {
        return this.subType;
    }

    public String getTopic() {
        return this.topic;
    }

    public boolean isBoxSharing() {
        return this.isBoxSharing;
    }

    public boolean isCameraMuted() {
        return this.isCameraMuted;
    }

    public boolean isMeetingOpenInterpretation() {
        return this.isMeetingOpenInterpretation;
    }

    public boolean isMicrophoneMuted() {
        return this.isMicrophoneMuted;
    }

    public boolean isMuteOnEntry() {
        return this.isMuteOnEntry;
    }

    public boolean isOpenBreakoutRoom() {
        return this.isOpenBreakoutRoom;
    }

    public boolean isOwnerJoinedMeeting() {
        return this.isOwnerJoinedMeeting;
    }

    public boolean shouldEndMeetingOrCloseTip() {
        if (this.countDownDuration >= this.maxVideoChatDuration) {
            return true;
        }
        return false;
    }

    public boolean isLocked() {
        MeetingSecuritySetting meetingSecuritySetting = this.securitySetting;
        if (meetingSecuritySetting == null || meetingSecuritySetting.getSecurityLevel() != MeetingSecuritySetting.SecurityLevel.ONLY_HOST || this.securitySetting.isEnableLobby()) {
            return false;
        }
        return true;
    }

    public boolean isNewStandardPlan() {
        if (this.planType == PlanType.PLAN_NEW_STANDARD || this.planType == PlanType.PLAN_NEW_CERT_STANDARD) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "VideoChatSettings{, isMicrophoneMuted=" + this.isMicrophoneMuted + ", isCameraMuted=" + this.isCameraMuted + ", maxParticipantNum=" + this.maxParticipantNum + ", isBoxSharing=" + this.isBoxSharing + ", maxVideoChatDuration=" + this.maxVideoChatDuration + ", countDownDuration=" + this.countDownDuration + ", planType=" + this.planType + ", subType=" + this.subType + ", securitySetting=" + this.securitySetting + ", isMuteOnEntry=" + this.isMuteOnEntry + ", isOpenBreakoutRoom=" + this.isOpenBreakoutRoom + ", allowPartiUnMute=" + this.allowPartiUnMute + ", planTimeLimit=" + this.planTimeLimit + ", maxSoftRtcNormalMode=" + this.maxSoftRtcNormalMode + ", featureConfig=" + this.featureConfig + ", isOwnerJoinedMeeting=" + this.isOwnerJoinedMeeting + ", onlyHostCanShare=" + this.onlyHostCanShare + ", onlyHostCanReplaceShare=" + this.onlyHostCanReplaceShare + ", onlyPresenterCanAnnotate=" + this.onlyPresenterCanAnnotate + ", mManageCapability=" + this.mManageCapability + ", mRTCProxy=" + this.mRTCProxy + ", isMeetingOpenInterpretation=" + this.isMeetingOpenInterpretation + '}';
    }

    public void setAllowPartiUnMute(boolean z) {
        this.allowPartiUnMute = z;
    }

    public void setBoxSharing(boolean z) {
        this.isBoxSharing = z;
    }

    public void setCameraMuted(boolean z) {
        this.isCameraMuted = z;
    }

    public void setCountDownDuration(int i) {
        this.countDownDuration = i;
    }

    public void setFeatureConfig(VCFeatureConfig vCFeatureConfig) {
        this.featureConfig = vCFeatureConfig;
    }

    public void setH323Setting(VideoChatH323Setting videoChatH323Setting) {
        this.h323Setting = videoChatH323Setting;
    }

    public void setIsOwnerJoinedMeeting(boolean z) {
        this.isOwnerJoinedMeeting = z;
    }

    public void setManageCapability(VCManageCapability vCManageCapability) {
        this.mManageCapability = vCManageCapability;
    }

    public void setMaxParticipantNum(int i) {
        this.maxParticipantNum = i;
    }

    public void setMaxSoftRtcNormalMode(int i) {
        this.maxSoftRtcNormalMode = i;
    }

    public void setMaxVideoChatDuration(int i) {
        this.maxVideoChatDuration = i;
    }

    public void setMeetingOpenInterpretation(boolean z) {
        this.isMeetingOpenInterpretation = z;
    }

    public void setMeetingSupportLanguages(List<LanguageType> list) {
        this.meetingSupportLanguages = list;
    }

    public void setMicrophoneMuted(boolean z) {
        this.isMicrophoneMuted = z;
    }

    public void setMuteOnEntry(boolean z) {
        this.isMuteOnEntry = z;
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

    public void setOpenBreakoutRoom(boolean z) {
        this.isOpenBreakoutRoom = z;
    }

    public void setPlanType(PlanType planType2) {
        this.planType = planType2;
    }

    public void setRTCProxy(RTCProxy rTCProxy) {
        this.mRTCProxy = rTCProxy;
    }

    public void setSIPSetting(VideoChatSIPSetting videoChatSIPSetting) {
        this.sipSetting = videoChatSIPSetting;
    }

    public void setSecuritySetting(MeetingSecuritySetting meetingSecuritySetting) {
        this.securitySetting = meetingSecuritySetting;
    }

    public void setSubType(SubType subType2) {
        this.subType = subType2;
    }

    public void setTopic(String str) {
        this.topic = str;
    }

    public void setPlanTimeLimit(int i) {
        if (i > 0) {
            this.planTimeLimit = i;
        }
    }
}
