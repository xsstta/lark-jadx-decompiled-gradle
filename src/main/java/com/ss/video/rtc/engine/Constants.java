package com.ss.video.rtc.engine;

public class Constants {

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

    public enum VendorType {
        VENDOR_TYPE_RTC,
        VENDOR_TYPE_LARKRTC,
        VENDOR_TYPE_LARKPRERTC,
        VENDOR_TYPE_TEST
    }
}
