package com.ss.android.lark.locationmessage.p2149b;

import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.locationmessage.b.f */
public class C41595f {
    /* renamed from: a */
    public static double m165064a(String str) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e) {
            Log.m165383e("NumberUtils", "failed to parse double, e:" + e);
            return 0.0d;
        }
    }
}
