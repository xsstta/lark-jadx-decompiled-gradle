package com.bytedance.mira.plugin.hook.flipped;

import android.os.Build;
import com.bytedance.mira.plugin.hook.flipped.compat.AbstractC20112c;
import com.bytedance.mira.plugin.hook.flipped.compat.C20110a;
import com.bytedance.mira.plugin.hook.flipped.compat.C20111b;
import com.bytedance.mira.plugin.hook.flipped.compat.FlippedV2Impl;

/* renamed from: com.bytedance.mira.plugin.hook.flipped.a */
public class C20109a {
    /* renamed from: a */
    public static void m73415a() {
        m73416b().mo68209a();
    }

    /* renamed from: b */
    private static AbstractC20112c m73416b() {
        if (m73417c()) {
            return new FlippedV2Impl();
        }
        if (m73418d()) {
            return new C20111b();
        }
        return new C20110a();
    }

    /* renamed from: c */
    private static boolean m73417c() {
        if (Build.VERSION.SDK_INT >= 30 || (Build.VERSION.SDK_INT == 29 && Build.VERSION.PREVIEW_SDK_INT > 0)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static boolean m73418d() {
        if (Build.VERSION.SDK_INT >= 28 || (Build.VERSION.SDK_INT == 27 && Build.VERSION.PREVIEW_SDK_INT > 0)) {
            return true;
        }
        return false;
    }
}
