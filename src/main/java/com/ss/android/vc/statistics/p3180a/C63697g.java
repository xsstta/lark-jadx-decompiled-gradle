package com.ss.android.vc.statistics.p3180a;

import android.text.TextUtils;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.vc.common.p3077b.C60700b;

/* renamed from: com.ss.android.vc.statistics.a.g */
public class C63697g {

    /* renamed from: a */
    private static String f160796a;

    /* renamed from: b */
    private static String f160797b;

    /* renamed from: c */
    private static String f160798c;

    /* renamed from: c */
    public static void m249705c() {
        if (!TextUtils.isEmpty(f160797b)) {
            C63686a.m249660a(f160797b, null, null, null, null);
        }
    }

    /* renamed from: d */
    public static void m249706d() {
        if (!TextUtils.isEmpty(f160797b)) {
            C63686a.m249663b(f160797b, null, null, null, null);
        }
    }

    /* renamed from: f */
    public static void m249708f() {
        f160798c = C63686a.m249658a(Scene.VCPreview, Event.vc_open_camera_time, null, null, null, null);
    }

    /* renamed from: a */
    public static void m249703a() {
        f160796a = C63686a.m249658a(Scene.VCPreview, Event.vc_enter_preview_total, null, null, null, null);
        f160797b = C63686a.m249658a(Scene.VCPreview, Event.vc_enter_preview_pure, null, null, null, null);
    }

    /* renamed from: b */
    public static void m249704b() {
        if (!TextUtils.isEmpty(f160796a)) {
            C63686a.m249665c(f160796a, null, null, null, null);
            f160796a = null;
        }
        if (!TextUtils.isEmpty(f160797b)) {
            C63686a.m249665c(f160797b, null, null, null, null);
            f160797b = null;
        }
    }

    /* renamed from: g */
    public static void m249709g() {
        if (!TextUtils.isEmpty(f160798c)) {
            C63686a.m249665c(f160798c, null, null, null, null);
            f160798c = null;
        }
    }

    /* renamed from: e */
    public static void m249707e() {
        if (!TextUtils.isEmpty(f160796a) || !TextUtils.isEmpty(f160797b)) {
            C60700b.m235851b("PreviewAppreciable", "[abortEnterPreview]", f160796a + ", " + f160797b);
            f160796a = null;
            f160797b = null;
        }
    }
}
