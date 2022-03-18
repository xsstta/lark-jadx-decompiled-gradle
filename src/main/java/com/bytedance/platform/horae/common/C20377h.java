package com.bytedance.platform.horae.common;

import android.os.Build;

/* renamed from: com.bytedance.platform.horae.common.h */
public final class C20377h {
    /* renamed from: a */
    public static boolean m74231a() {
        if (Build.VERSION.SDK_INT >= 28 || (Build.VERSION.SDK_INT == 27 && Build.VERSION.PREVIEW_SDK_INT > 0)) {
            return true;
        }
        return false;
    }
}
