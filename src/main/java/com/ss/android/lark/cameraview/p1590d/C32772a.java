package com.ss.android.lark.cameraview.p1590d;

/* renamed from: com.ss.android.lark.cameraview.d.a */
public class C32772a {
    /* renamed from: a */
    public static int m125801a(float f, float f2) {
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
