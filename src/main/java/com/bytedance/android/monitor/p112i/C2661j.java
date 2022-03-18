package com.bytedance.android.monitor.p112i;

import android.net.Uri;

/* renamed from: com.bytedance.android.monitor.i.j */
public class C2661j {
    /* renamed from: a */
    public static String m11190a(String str) {
        try {
            return Uri.parse(str).getPath();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static String m11191b(String str) {
        try {
            return Uri.parse(str).getHost();
        } catch (Exception unused) {
            return "";
        }
    }
}
