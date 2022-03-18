package com.bytedance.platform.godzilla.p872b;

import android.os.Build;

/* renamed from: com.bytedance.platform.godzilla.b.e */
public final class C20313e {
    /* renamed from: a */
    public static boolean m74082a() {
        if (Build.VERSION.SDK_INT >= 28 || (Build.VERSION.SDK_INT == 27 && Build.VERSION.PREVIEW_SDK_INT > 0)) {
            return true;
        }
        return false;
    }
}
