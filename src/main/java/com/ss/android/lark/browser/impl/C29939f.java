package com.ss.android.lark.browser.impl;

import android.app.Activity;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.browser.C29638a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.browser.impl.f */
public class C29939f {

    /* renamed from: a */
    private static final C29939f f74703a = new C29939f();

    /* renamed from: b */
    private static List<String> f74704b = new ArrayList();

    /* renamed from: a */
    public static C29939f m110697a() {
        return f74703a;
    }

    /* renamed from: e */
    private boolean m110699e() {
        return C29638a.m109622a().isFeatureGatingEnable("lark.browser.webview.lean.mode");
    }

    /* renamed from: d */
    private void m110698d() {
        if (m110699e() && f74704b.isEmpty()) {
            CoreThreadPool.getDefault().getScheduleThreadPool().execute($$Lambda$f$1gBiYolFRyLe8CCD5OmuNN8f0s.INSTANCE);
        }
    }

    /* renamed from: b */
    public boolean mo107815b() {
        if (!m110699e() || !C29638a.m109622a().isInWebLeanMode()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public boolean mo107816c() {
        if (!m110699e()) {
            return true;
        }
        boolean isInWebLeanMode = C29638a.m109622a().isInWebLeanMode();
        boolean z = !f74704b.isEmpty();
        if (!isInWebLeanMode || !z) {
            return true;
        }
        if (!C29638a.m109622a().isInWebLeanMode() || !C29638a.m109622a().isMultiProcessStorage() || "p0".equals(C26252ad.m94994c(C29638a.m109622a().getContext()))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo107812a(Activity activity) {
        if (m110699e() && activity != null) {
            f74704b.add(String.valueOf(activity.hashCode()));
        }
    }

    /* renamed from: b */
    public void mo107814b(Activity activity) {
        if (m110699e() && activity != null) {
            f74704b.remove(String.valueOf(activity.hashCode()));
            m110698d();
        }
    }

    /* renamed from: a */
    public void mo107813a(final Runnable runnable) {
        if (!m110699e()) {
            runnable.run();
        } else if (C29638a.m109622a().isInWebLeanMode()) {
            C299401 r0 = new ValueCallback<Boolean>() {
                /* class com.ss.android.lark.browser.impl.C29939f.C299401 */

                /* renamed from: c */
                private volatile int f74707c = 2;

                /* renamed from: a */
                public void onReceiveValue(Boolean bool) {
                    this.f74707c--;
                    if (this.f74707c == 0) {
                        runnable.run();
                    }
                }
            };
            CookieManager.getInstance().removeSessionCookies(r0);
            CookieManager.getInstance().removeAllCookies(r0);
        } else {
            runnable.run();
        }
    }
}
