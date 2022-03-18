package com.ss.android.vesdk;

import java.util.HashMap;
import java.util.Map;

public class VERuntimeConfig {

    /* renamed from: a */
    public static boolean f161376a = false;

    /* renamed from: b */
    public static boolean f161377b = false;

    /* renamed from: c */
    public static boolean f161378c = false;

    /* renamed from: d */
    public static boolean f161379d = false;

    /* renamed from: e */
    public static int f161380e = HwEncFallBackMode.HW_ENC_FALLBACK_NONE.getValue();

    /* renamed from: f */
    public static Map<String, Long> f161381f = new HashMap();

    /* renamed from: g */
    private static String f161382g = "VERuntimeConfig";

    /* renamed from: h */
    private static boolean f161383h;

    public enum HwEncFallBackMode {
        HW_ENC_FALLBACK_NONE(0),
        VIDEO_ENC_INIT_FALLBACK(1),
        AUDIO_ENC_INIT_FALLBACK(2),
        VIDEO_ENC_ENCODING_FALLBACK(3),
        AUDIO_ENC_ENCODING_FALLBACK(4);
        
        private int mValue;

        public int getValue() {
            return this.mValue;
        }

        private HwEncFallBackMode(int i) {
            this.mValue = i;
        }
    }

    /* renamed from: a */
    public static boolean m250894a() {
        if (f161383h || ((Boolean) VEConfigCenter.m250617a().mo220632a("vesdk_use_agfxcontext", (Object) false)).booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m250893a(int i) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if ((i & 8) == 8) {
            z = true;
        } else {
            z = false;
        }
        f161383h = z;
        if ((i & 8192) == 8192) {
            z2 = true;
        } else {
            z2 = false;
        }
        f161377b = z2;
        if ((i & 16777216) != 16777216) {
            z3 = false;
        }
        f161378c = z3;
        String str = f161382g;
        C63929ab.m250974a(str, "setConfig, sUseSingleGLThread = " + f161383h + ", sSeekTimeCostOpt = " + f161377b + ", sOutResolutionBase4 = " + f161378c);
    }
}
