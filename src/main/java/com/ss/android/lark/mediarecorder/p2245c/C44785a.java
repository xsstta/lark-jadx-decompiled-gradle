package com.ss.android.lark.mediarecorder.p2245c;

/* renamed from: com.ss.android.lark.mediarecorder.c.a */
public class C44785a {
    /* renamed from: a */
    public static int m177614a(float f, float f2) {
        if (Math.abs(f) > Math.abs(f2)) {
            if (f > 4.0f) {
                return 270;
            }
            if (f < -4.0f) {
                return 90;
            }
            return 0;
        } else if (f2 <= 7.0f && f2 < -7.0f) {
            return 180;
        } else {
            return 0;
        }
    }
}
