package com.ss.android.vc.entity;

import com.ss.android.vc.entity.VideoChatSettings;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VideoChatConfig implements Serializable {
    private ByteSdkRateConfig byteSdkRateConfig;
    private int callHeartbeatCycle;
    private int callHeartbeatExpireTime;
    private Map<Integer, Boolean> enableUpgradePlanMap;
    private int lobbyHeartbeatCycle;
    private int lobbyHeartbeatExpiredTime;
    private List<C60942l> mSpokenLanguages;
    private List<C60942l> mSubtitleLanguages;
    private int maxParticipantCount;
    private int maxRtcParticipantCount;
    private int meetingHeartbeatCycle;
    private int meetingHeartbeatExpireTime;
    private List<LanguageType> meetingSupportInterpretationLanguage;
    private List<String> meetingUrlKeys;
    private List<String> meetingUrlPathKeys;
    private int videoChatCountDownDuration = 10;

    public static class ByteSdkRateConfig implements Serializable {
        private int bitrateDowngrateParticipantThreshold;
        private int highBitrate;
        private int lowBitrate;
        private int middleBitrate;

        public int getBitrateDowngrateParticipantThreshold() {
            return this.bitrateDowngrateParticipantThreshold;
        }

        public int getHighBitrate() {
            return this.highBitrate;
        }

        public int getLowBitrate() {
            return this.lowBitrate;
        }

        public int getMiddleBitrate() {
            return this.middleBitrate;
        }

        public String toString() {
            return "ByteSdkRateConfig{highBitrate=" + this.highBitrate + ", middleBitrate=" + this.middleBitrate + ", lowBitrate=" + this.lowBitrate + ", bitrateDowngrateParticipantThreshold=" + this.bitrateDowngrateParticipantThreshold + '}';
        }

        public void setBitrateDowngrateParticipantThreshold(int i) {
            this.bitrateDowngrateParticipantThreshold = i;
        }

        public void setHighBitrate(int i) {
            this.highBitrate = i;
        }

        public void setLowBitrate(int i) {
            this.lowBitrate = i;
        }

        public void setMiddleBitrate(int i) {
            this.middleBitrate = i;
        }
    }

    public ByteSdkRateConfig getByteSdkRateConfig() {
        return this.byteSdkRateConfig;
    }

    public int getCallHeartbeatCycle() {
        return this.callHeartbeatCycle;
    }

    public int getCallHeartbeatExpireTime() {
        return this.callHeartbeatExpireTime;
    }

    public int getLobbyHeartbeatCycle() {
        return this.lobbyHeartbeatCycle;
    }

    public int getLobbyHeartbeatExpiredTime() {
        return this.lobbyHeartbeatExpiredTime;
    }

    public int getMeetingHeartbeatCycle() {
        return this.meetingHeartbeatCycle;
    }

    public int getMeetingHeartbeatExpireTime() {
        return this.meetingHeartbeatExpireTime;
    }

    public List<LanguageType> getMeetingSupportInterpretationLanguage() {
        return this.meetingSupportInterpretationLanguage;
    }

    public List<String> getMeetingUrlKeys() {
        return this.meetingUrlKeys;
    }

    public List<String> getMeetingUrlPathKeys() {
        return this.meetingUrlPathKeys;
    }

    public List<C60942l> getSpokenLanguages() {
        return this.mSpokenLanguages;
    }

    public List<C60942l> getSubtitleLanguages() {
        return this.mSubtitleLanguages;
    }

    public int getVideoChatCountDownDuration() {
        return this.videoChatCountDownDuration;
    }

    public String toString() {
        return "VideoChatConfig{maxParticipantCount=" + this.maxParticipantCount + ", maxRtcParticipantCount=" + this.maxRtcParticipantCount + ", meetingHeartbeatCycle=" + this.meetingHeartbeatCycle + ", meetingHeartbeatExpireTime=" + this.meetingHeartbeatExpireTime + ", callHeartbeatCycle=" + this.callHeartbeatCycle + ", callHeartbeatExpireTime=" + this.callHeartbeatExpireTime + ", lobbyHeartbeatCycle=" + this.lobbyHeartbeatCycle + ", lobbyHeartbeatExpiredTime=" + this.lobbyHeartbeatExpiredTime + ", byteSdkRateConfig=" + this.byteSdkRateConfig + ", videoChatCountDownDuration=" + this.videoChatCountDownDuration + ", mSubtitleLanguages=" + this.mSubtitleLanguages + ", mSpokenLanguages=" + this.mSpokenLanguages + ", meetingUrlKeys=" + this.meetingUrlKeys + ", meetingUrlPathKeys=" + this.meetingUrlPathKeys + ", enableUpgradePlanMap=" + this.enableUpgradePlanMap + ", meetingSupportInterpretationLanguage=" + this.meetingSupportInterpretationLanguage + '}';
    }

    public void setByteSdkRateConfig(ByteSdkRateConfig byteSdkRateConfig2) {
        this.byteSdkRateConfig = byteSdkRateConfig2;
    }

    public void setCallHeartbeatCycle(int i) {
        this.callHeartbeatCycle = i;
    }

    public void setCallHeartbeatExpireTime(int i) {
        this.callHeartbeatExpireTime = i;
    }

    public void setLobbyHeartbeatCycle(int i) {
        this.lobbyHeartbeatCycle = i;
    }

    public void setLobbyHeartbeatExpiredTime(int i) {
        this.lobbyHeartbeatExpiredTime = i;
    }

    public void setMaxParticipantCount(int i) {
        this.maxParticipantCount = i;
    }

    public void setMaxRtcParticipantCount(int i) {
        this.maxRtcParticipantCount = i;
    }

    public void setMeetingHeartbeatCycle(int i) {
        this.meetingHeartbeatCycle = i;
    }

    public void setMeetingHeartbeatExpireTime(int i) {
        this.meetingHeartbeatExpireTime = i;
    }

    public void setMeetingSupportInterpretationLanguage(List<LanguageType> list) {
        this.meetingSupportInterpretationLanguage = list;
    }

    public void setSpokenLanguages(List<C60942l> list) {
        this.mSpokenLanguages = list;
    }

    public void setSubtitleLanguages(List<C60942l> list) {
        this.mSubtitleLanguages = list;
    }

    public void setVideoChatCountDownDuration(int i) {
        if (i > 0) {
            this.videoChatCountDownDuration = i;
        }
    }

    public void setMeetingUrlKeys(List<String> list) {
        if (!list.isEmpty()) {
            this.meetingUrlKeys = list;
        }
    }

    public void setMeetingUrlPathKeys(List<String> list) {
        if (!list.isEmpty()) {
            this.meetingUrlPathKeys = list;
        }
    }

    public boolean isUpgradePlanEnable(VideoChatSettings.PlanType planType) {
        Boolean bool;
        Map<Integer, Boolean> map = this.enableUpgradePlanMap;
        if (map == null || planType == null || (bool = map.get(Integer.valueOf(planType.getNumber()))) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public void setEnableUpgradePlanMap(Map<Integer, Boolean> map) {
        if (map == null || map.isEmpty()) {
            HashMap hashMap = new HashMap();
            this.enableUpgradePlanMap = hashMap;
            hashMap.put(Integer.valueOf(VideoChatSettings.PlanType.PLAN_UNKNOWN.getNumber()), true);
            this.enableUpgradePlanMap.put(Integer.valueOf(VideoChatSettings.PlanType.PLAN_FREE.getNumber()), true);
            return;
        }
        this.enableUpgradePlanMap = map;
    }
}
