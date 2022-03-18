package com.bytedance.lark.sdk.log;

import android.text.TextUtils;
import android.util.Log;

/* renamed from: com.bytedance.lark.sdk.log.a */
public class C19837a {

    /* renamed from: a */
    private static int f48410a = -1;

    /* renamed from: b */
    private static int f48411b = -1;

    /* renamed from: a */
    public static void m72361a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = "main";
        }
        try {
            f48411b = Thoth.m72356a(str2, str);
        } catch (Exception e) {
            Log.e("RLog", "initMetricPath error=" + e.toString());
        }
    }

    /* renamed from: a */
    public static void m72362a(String str, String str2, boolean z) {
        int i;
        if (TextUtils.isEmpty(str)) {
            str = "main";
        }
        if (z) {
            i = 0;
        } else {
            i = 1;
        }
        try {
            f48410a = Thoth.m72357a(str, str2, i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static boolean m72363a(long j, String str, int[] iArr, int i, int i2, String str2) {
        try {
            if (f48411b == -1 || Thoth.m72354a(j, str, iArr, i, i2, str2) != 0) {
                return false;
            }
            return true;
        } catch (Exception e) {
            Log.e("RLog", "writeMetric error=" + e.toString());
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m72364a(long j, String str, int[] iArr, int i, int i2, String str2, int i3, long j2) {
        try {
            if (f48411b == -1 || Thoth.m72355a(j, str, iArr, i, i2, str2, i3, j2) != 0) {
                return false;
            }
            return true;
        } catch (Exception e) {
            Log.e("RLog", "writeMetric error=" + e.toString());
        }
        return false;
    }
}
