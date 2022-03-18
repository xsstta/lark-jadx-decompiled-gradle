package com.ss.video.rtc.meeting;

public class MeetingRtcConstants {

    public enum AecOption {
        AEC_OPTION_DISABLE,
        AEC_OPTION_NORMAL,
        AEC_OPTION_AGGRESSIVE
    }

    public enum EffectType {
        EFFECT_TYPE_BUILTIN,
        EFFECT_TYPE_EXCLUSIVE
    }

    public enum NsOption {
        NS_OPTION_DISABLE,
        NS_OPTION_MILD,
        NS_OPTION_MEDIM,
        NS_OPTION_AGGRESSIVE,
        NS_OPTION_VERY_AGGRESSIVE
    }

    public enum RemoteUserPriority {
        kRemoteUserPriorityLow,
        kRemoteUserPriorityMedium,
        kRemoteUserPriorityHigh
    }

    public enum VendorType {
        VENDOR_TYPE_UNKNOWN(0),
        VENDOR_TYPE_RTC(2),
        VENDOR_TYPE_LARKRTC(3),
        VENDOR_TYPE_LARKPRERTC(4),
        VENDOR_TYPE_TEST_PRE(240),
        VENDOR_TYPE_TEST_GAUSS(241),
        VENDOR_TYPE_TEST(255);
        
        private final int value;

        public int getValue() {
            return this.value;
        }

        private VendorType(int i) {
            this.value = i;
        }
    }
}
