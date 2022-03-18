package com.tt.miniapp.util;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.AppConfig;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.C66546p;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67434b;

/* renamed from: com.tt.miniapp.util.p */
public class C67052p {
    /* renamed from: a */
    public static String m261322a(IAppContext iAppContext) {
        AppConfig.C65688c cVar;
        AppConfig.Window window;
        String b = m261323b(iAppContext);
        if (!TextUtils.isEmpty(b)) {
            return b;
        }
        AppConfig appConfig = AppbrandApplicationImpl.getInst(iAppContext).getAppConfig();
        if (appConfig == null || (cVar = appConfig.f165494a) == null || (window = cVar.f165528a) == null || !window.hasNavigationStyle) {
            return "default";
        }
        return window.navigationStyle;
    }

    /* renamed from: b */
    private static String m261323b(IAppContext iAppContext) {
        AppConfig appConfig;
        AppConfig.Window a;
        if (iAppContext.getCurrentActivity() == null || !(iAppContext instanceof AbstractC67433a)) {
            return null;
        }
        AbstractC67434b a2 = ((AbstractC67433a) iAppContext).mo234156a();
        if (!(a2 instanceof C66546p)) {
            return null;
        }
        String g = a2.mo231014g();
        if (TextUtils.isEmpty(g)) {
            return null;
        }
        int indexOf = g.indexOf("?");
        AppbrandApplicationImpl inst = AppbrandApplicationImpl.getInst(iAppContext);
        if (inst == null || (appConfig = inst.getAppConfig()) == null) {
            return null;
        }
        if (indexOf >= 0 && indexOf <= g.length()) {
            g = g.substring(0, indexOf);
        }
        AppConfig.C65690e eVar = appConfig.f165495b;
        if (eVar == null || TextUtils.isEmpty(g) || (a = eVar.mo230061a(g)) == null || !a.hasNavigationStyle) {
            return null;
        }
        return a.navigationStyle;
    }
}
