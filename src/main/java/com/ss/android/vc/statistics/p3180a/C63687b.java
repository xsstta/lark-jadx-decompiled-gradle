package com.ss.android.vc.statistics.p3180a;

import android.text.TextUtils;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.vc.common.p3077b.C60700b;

/* renamed from: com.ss.android.vc.statistics.a.b */
public class C63687b {

    /* renamed from: a */
    private static String f160771a;

    /* renamed from: a */
    public static void m249666a() {
        f160771a = C63686a.m249658a(Scene.VCCalling, Event.vc_enter_calling, null, null, null, null);
    }

    /* renamed from: b */
    public static void m249667b() {
        if (!TextUtils.isEmpty(f160771a)) {
            C63686a.m249665c(f160771a, null, null, null, null);
            f160771a = null;
        }
    }

    /* renamed from: c */
    public static void m249668c() {
        if (!TextUtils.isEmpty(f160771a)) {
            C60700b.m235851b("CallingAppreciable", "[abortEnterCalling]", "key = " + f160771a);
            f160771a = null;
        }
    }
}
