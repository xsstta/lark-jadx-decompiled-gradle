package com.ss.android.ttvecamera;

import android.content.Context;

public class TEVBoostInterface {

    public enum VBoostCapabilityType {
        UNKNOWN,
        CPU_FREQ_MIN,
        CPU_FREQ_MAX,
        CPU_CORE_MIN,
        CPU_CORE_MAX,
        GPU_FREQ_MIN,
        GPU_FREQ_MAX,
        BUS_FREQ_MIN,
        BUS_FREQ_MAX,
        UFS_FREQ_MIN,
        UFS_FREQ_MAX,
        TASK_PRIORITY,
        CPU_AFFINITY,
        IDLE_STATE,
        IO_PRELOAD,
        NETWORK_ENHANCE,
        PRESET_SCENE,
        THUMB_FETCH,
        VIBRATE_ENHANCE
    }

    /* renamed from: a */
    public static int m234241a(VBoostCapabilityType vBoostCapabilityType, int i, long j) {
        return 0;
    }

    /* renamed from: a */
    public static void m234242a(Context context) {
    }

    /* renamed from: a */
    public static boolean m234243a(VBoostCapabilityType vBoostCapabilityType) {
        return false;
    }

    /* renamed from: b */
    public static int m234244b(VBoostCapabilityType vBoostCapabilityType) {
        return 0;
    }
}
