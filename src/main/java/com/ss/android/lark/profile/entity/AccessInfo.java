package com.ss.android.lark.profile.entity;

import java.io.Serializable;

public class AccessInfo implements Serializable {
    private static final long serialVersionUID = -9002720120116429273L;
    private AccessProfile phoneCallAccessProfile;
    private AccessProfile urgentAccessProfile;
    private AccessProfile videoCallAccessProfile;
    private AccessProfile voiceCallAccessProfile;

    public void setUrgentAccessProfile(AccessProfile accessProfile) {
    }

    public static class AccessProfile implements Serializable {
        private static final long serialVersionUID = 8071320435156201806L;
        public InaccessibleCode inaccessibleCode;
        public boolean isAccessible;

        public AccessProfile() {
        }

        public InaccessibleCode getInaccessibleCode() {
            return this.inaccessibleCode;
        }

        public boolean isAccessible() {
            return this.isAccessible;
        }

        public void setAccessible(boolean z) {
            this.isAccessible = z;
        }

        public void setInaccessibleCode(InaccessibleCode inaccessibleCode2) {
            this.inaccessibleCode = inaccessibleCode2;
        }

        public AccessProfile(boolean z, InaccessibleCode inaccessibleCode2) {
            this.isAccessible = z;
            this.inaccessibleCode = inaccessibleCode2;
        }
    }

    public enum InaccessibleCode {
        DEFAULT(0),
        EXECUTIVES(1);
        
        private final int value;

        public int getValue() {
            return this.value;
        }

        public static InaccessibleCode fromValue(int i) {
            if (i == 0) {
                return DEFAULT;
            }
            if (i != 1) {
                return DEFAULT;
            }
            return EXECUTIVES;
        }

        private InaccessibleCode(int i) {
            this.value = i;
        }
    }

    public AccessProfile getPhoneCallAccessProfile() {
        return this.phoneCallAccessProfile;
    }

    public AccessProfile getUrgentAccessProfile() {
        return this.urgentAccessProfile;
    }

    public AccessProfile getVideoCallAccessProfile() {
        return this.videoCallAccessProfile;
    }

    public AccessProfile getVoiceCallAccessProfile() {
        return this.voiceCallAccessProfile;
    }

    public boolean isAccessPhoneCall() {
        AccessProfile accessProfile = this.phoneCallAccessProfile;
        if (accessProfile == null || accessProfile.isAccessible) {
            return true;
        }
        return false;
    }

    public boolean isAccessVideoCall() {
        AccessProfile accessProfile = this.videoCallAccessProfile;
        if (accessProfile == null || accessProfile.isAccessible) {
            return true;
        }
        return false;
    }

    public boolean isAccessVoiceCall() {
        AccessProfile accessProfile = this.voiceCallAccessProfile;
        if (accessProfile == null || accessProfile.isAccessible) {
            return true;
        }
        return false;
    }

    public boolean isInaccessPhoneCallByExecutives() {
        AccessProfile accessProfile = this.phoneCallAccessProfile;
        if (accessProfile == null || accessProfile.isAccessible() || this.phoneCallAccessProfile.inaccessibleCode != InaccessibleCode.EXECUTIVES) {
            return false;
        }
        return true;
    }

    public boolean isInaccessVideoCallByExecutives() {
        AccessProfile accessProfile = this.videoCallAccessProfile;
        if (accessProfile == null || accessProfile.isAccessible() || this.videoCallAccessProfile.inaccessibleCode != InaccessibleCode.EXECUTIVES) {
            return false;
        }
        return true;
    }

    public boolean isInaccessVoiceCallByExecutives() {
        AccessProfile accessProfile = this.voiceCallAccessProfile;
        if (accessProfile == null || accessProfile.isAccessible() || this.voiceCallAccessProfile.inaccessibleCode != InaccessibleCode.EXECUTIVES) {
            return false;
        }
        return true;
    }

    public void setPhoneCallAccessProfile(AccessProfile accessProfile) {
        this.phoneCallAccessProfile = accessProfile;
    }

    public void setVideoCallAccessProfile(AccessProfile accessProfile) {
        this.videoCallAccessProfile = accessProfile;
    }

    public void setVoiceCallAccessProfile(AccessProfile accessProfile) {
        this.voiceCallAccessProfile = accessProfile;
    }
}
