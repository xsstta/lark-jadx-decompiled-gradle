package com.ss.android.lark.meego.wrapper.debug;

import com.ss.android.lark.meego.wrapper.MeegoModule;
import com.ss.android.lark.meego.wrapper.manis.IMeegoProxy;
import com.ss.android.lark.util.share_preference.C57744a;
import ee.android.framework.manis.C68183b;

/* renamed from: com.ss.android.lark.meego.wrapper.debug.a */
public class C44864a {

    /* renamed from: a */
    public String f113642a;

    /* renamed from: b */
    public String f113643b;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.meego.wrapper.debug.a$a */
    public static class C44865a {

        /* renamed from: a */
        public static final C44864a f113644a = new C44864a();
    }

    /* renamed from: e */
    public static C44864a m177875e() {
        return C44865a.f113644a;
    }

    /* renamed from: b */
    public String mo158753b() {
        return C57744a.m224104a().getString("meego_net_proxy", null);
    }

    /* renamed from: c */
    public String mo158755c() {
        return C57744a.m224104a().getString("meego_use_ppe", null);
    }

    /* renamed from: d */
    public String mo158757d() {
        return C57744a.m224104a().getString("meego_tt_env", null);
    }

    /* renamed from: a */
    public String mo158751a() {
        IMeegoProxy iMeegoProxy = (IMeegoProxy) C68183b.m264839a().mo237086a(MeegoModule.m177824d().getContext(), IMeegoProxy.class);
        if (iMeegoProxy != null) {
            return iMeegoProxy.getRpcPersistDyecpFd();
        }
        return null;
    }

    /* renamed from: a */
    public void mo158752a(String str) {
        C57744a.m224104a().putString("meego_net_proxy", str);
    }

    /* renamed from: b */
    public void mo158754b(String str) {
        C57744a.m224104a().putString("meego_use_ppe", str);
    }

    /* renamed from: c */
    public void mo158756c(String str) {
        C57744a.m224104a().putString("meego_tt_env", str);
    }
}
