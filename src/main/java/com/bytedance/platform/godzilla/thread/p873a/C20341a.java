package com.bytedance.platform.godzilla.thread.p873a;

import android.os.Build;

/* renamed from: com.bytedance.platform.godzilla.thread.a.a */
public final class C20341a {

    /* renamed from: a */
    public static boolean f49620a = true;

    /* renamed from: b */
    public static int f49621b = -524288;

    /* renamed from: a */
    public static boolean m74147a() {
        if (Build.VERSION.SDK_INT < 21 || !f49620a) {
            return false;
        }
        return true;
    }
}
