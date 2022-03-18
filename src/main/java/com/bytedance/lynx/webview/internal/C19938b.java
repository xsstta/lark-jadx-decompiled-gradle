package com.bytedance.lynx.webview.internal;

import android.text.TextUtils;
import com.bytedance.lynx.webview.util.C20048g;

/* renamed from: com.bytedance.lynx.webview.internal.b */
public class C19938b {

    /* renamed from: a */
    private static AbstractC19940d f48715a;

    /* renamed from: a */
    public static void m72701a(String str) {
        if (f48715a != null && !TextUtils.isEmpty(str)) {
            C20048g.m73162b(str);
            AbstractC19940d dVar = f48715a;
            dVar.mo67717a("TT_WEBVIEW" + str);
        }
    }
}
