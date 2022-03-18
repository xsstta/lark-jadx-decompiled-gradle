package com.bytedance.apm;

import android.util.Log;

public class PerfConfig {

    /* renamed from: a */
    static boolean f8790a;

    /* renamed from: a */
    public static boolean m11610a() {
        return f8790a;
    }

    public static void setReportMessage() {
        Log.e("PerfConfig", "setReportMessage set true");
        f8790a = true;
    }
}
