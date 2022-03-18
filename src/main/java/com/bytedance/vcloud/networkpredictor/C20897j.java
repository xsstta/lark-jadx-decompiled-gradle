package com.bytedance.vcloud.networkpredictor;

import android.util.Log;

/* renamed from: com.bytedance.vcloud.networkpredictor.j */
public class C20897j {

    /* renamed from: a */
    public static int f51143a = 112;

    /* renamed from: a */
    public static void m76090a(String str, String str2) {
        if (((f51143a >> 6) & 1) == 1) {
            Log.e("SpeedPredictorLog", String.format("<%s>%s", str, str2));
        }
    }
}
