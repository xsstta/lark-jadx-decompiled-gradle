package com.ss.android.lark.openapi.webcore;

import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.openapi.webcore.b */
public class C48782b {

    /* renamed from: a */
    private CookieManager f122568a;

    /* renamed from: b */
    private CookieSyncManager f122569b;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.openapi.webcore.b$a */
    public static final class C48784a {

        /* renamed from: a */
        public static final C48782b f122570a = new C48782b();
    }

    /* renamed from: a */
    public static C48782b m192187a() {
        return C48784a.f122570a;
    }

    /* renamed from: b */
    public void mo170439b() {
        CookieSyncManager cookieSyncManager = this.f122569b;
        if (cookieSyncManager != null) {
            cookieSyncManager.sync();
        }
    }

    private C48782b() {
        try {
            this.f122568a = CookieManager.getInstance();
            this.f122569b = CookieSyncManager.getInstance();
        } catch (Exception e) {
            Log.m165390i("LarkCookieManager", "init LarkCookieManager error", e);
        }
    }

    /* renamed from: a */
    public String mo170436a(String str) {
        CookieManager cookieManager = this.f122568a;
        if (cookieManager == null) {
            return null;
        }
        return cookieManager.getCookie(str);
    }

    /* renamed from: a */
    public void mo170438a(boolean z) {
        CookieManager cookieManager = this.f122568a;
        if (cookieManager != null) {
            cookieManager.setAcceptCookie(z);
        }
    }

    /* renamed from: a */
    public void mo170437a(String str, String str2) {
        CookieManager cookieManager = this.f122568a;
        if (cookieManager != null) {
            cookieManager.setCookie(str, str2);
        }
    }
}
