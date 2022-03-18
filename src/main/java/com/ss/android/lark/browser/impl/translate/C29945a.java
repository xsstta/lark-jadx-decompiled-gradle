package com.ss.android.lark.browser.impl.translate;

import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.util.share_preference.C57744a;

/* renamed from: com.ss.android.lark.browser.impl.translate.a */
public class C29945a {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.browser.impl.translate.a$a */
    public static class C29946a {

        /* renamed from: a */
        public static final C29945a f74719a = new C29945a();
    }

    /* renamed from: a */
    public static C29945a m110725a() {
        return C29946a.f74719a;
    }

    /* renamed from: b */
    public boolean mo107846b() {
        return C29638a.m109622a().isFeatureGatingEnable("translate.webpage.enable");
    }

    /* renamed from: c */
    public boolean mo107847c() {
        return C29638a.m109622a().isFeatureGatingEnable("translate.webpage.filter.enable");
    }

    /* renamed from: e */
    public boolean mo107849e() {
        return C57744a.m224104a().getBoolean("key_browser_web_translate_tip", true);
    }

    /* renamed from: f */
    public void mo107850f() {
        C57744a.m224104a().putBoolean("key_browser_web_translate_tip", false);
    }

    /* renamed from: d */
    public int mo107848d() {
        int a = C29638a.m109622a().getAppConfigDependency().mo107657a();
        if (a == 0) {
            return 1000;
        }
        return a;
    }

    /* renamed from: a */
    public boolean mo107845a(String str) {
        if (mo107847c()) {
            return C29638a.m109622a().getAppConfigDependency().mo107658a(str);
        }
        return true;
    }
}
