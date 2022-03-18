package com.bytedance.apm.util;

import android.util.Log;

/* renamed from: com.bytedance.apm.util.j */
public class C3124j {
    /* renamed from: a */
    public static void m13012a(String str, String str2) {
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            if (((long) str2.length()) <= ((long) 3072)) {
                Log.d(str, str2);
                return;
            }
            while (str2.length() > 3072) {
                String substring = str2.substring(0, 3072);
                str2 = str2.replace(substring, "");
                Log.d(str, substring);
            }
            Log.d(str, str2);
        }
    }
}
