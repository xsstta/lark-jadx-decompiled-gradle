package com.ss.android.lark.browser.impl;

import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.ValueCallback;
import com.huawei.hms.framework.common.ContainerUtils;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26252ad;
import com.larksuite.framework.utils.aq;
import com.ss.android.lark.biz.core.api.browser.AbstractC29552a;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.browser.biz.p1413a.C29643b;
import com.ss.android.lark.browser.dependency.IBrowserModuleDependency;
import com.ss.android.lark.browser.dto.MainDomainSessionWrapper;
import com.ss.android.lark.browser.dto.SessionInfo;
import com.ss.android.lark.browser.impl.p1422b.p1423a.C29929a;
import com.ss.android.lark.browser.impl.p1422b.p1423a.C29931b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.webcore.C48782b;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.util.share_preference.UserSP;
import com.ss.android.lark.utils.LarkContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.lark.browser.impl.b */
public class C29927b {

    /* renamed from: a */
    private static Set<String> f74659a;

    /* renamed from: b */
    private static final Map<AbstractC29552a, Object> f74660b = new ConcurrentHashMap();

    /* renamed from: a */
    private static boolean m110653a(String str, List<String> list) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        for (String str2 : list) {
            if (lowerCase.equalsIgnoreCase(str2)) {
                return true;
            }
        }
        Pattern h = m110664h();
        if (h == null) {
            return false;
        }
        return h.matcher(lowerCase).matches();
    }

    /* renamed from: i */
    private static String m110665i() {
        return C29638a.m109622a().getMainDomain();
    }

    /* renamed from: a */
    public static String m110644a() {
        return "COOKIE_INJECT_SIGN" + C26252ad.m94994c(LarkContext.getApplication());
    }

    /* renamed from: d */
    public static boolean m110658d() {
        IBrowserModuleDependency a = C29638a.m109622a();
        if (a == null) {
            return false;
        }
        return !a.isFeatureGatingEnable("lark.browser.safe.cookie");
    }

    /* renamed from: f */
    public static String m110662f() {
        return "clean_session" + C26252ad.m94992a(C29638a.m109622a().getContext());
    }

    /* renamed from: g */
    private static void m110663g() {
        for (AbstractC29552a aVar : f74660b.keySet()) {
            aVar.mo105678a();
        }
    }

    /* renamed from: h */
    private static Pattern m110664h() {
        return Pattern.compile(".*\\." + m110665i());
    }

    /* renamed from: c */
    public static void m110656c() {
        if (m110658d() && !UserSP.getInstance().getBoolean(m110644a(), false)) {
            Log.m165397w("LarkWebCookieManager", "syncMainDomainCookieForSafe lost cookie when use web view " + C26252ad.m94994c(LarkContext.getApplication()));
            m110661e();
        }
    }

    /* renamed from: b */
    public static void m110654b() {
        Log.m165389i("LarkWebCookieManager", "start syncMainDomainCookieForSimple");
        if (!C29638a.m109622a().getLoginDependency().mo107680a()) {
            m110649a("not login");
            return;
        }
        String mainDomainForSimple = C29638a.m109622a().getMainDomainForSimple();
        if (TextUtils.isEmpty(mainDomainForSimple)) {
            m110649a("get session data error");
            Log.m165389i("LarkWebCookieManager", "get session data error");
            return;
        }
        CookieSyncManager.createInstance(C29638a.m109622a().getContext());
        m110652a(mainDomainForSimple, mainDomainForSimple, "session", C29638a.m109622a().getLoginDependency().mo107682b());
        m110652a(mainDomainForSimple, mainDomainForSimple, "session_list", C29638a.m109622a().getLoginDependency().mo107682b());
        Log.m165389i("LarkWebCookieManager", "syncMainDomainCookieForSimple sync session data success");
        m110663g();
    }

    /* renamed from: e */
    public static void m110661e() {
        String str;
        HashMap<String, SessionInfo> hashMap;
        Log.m165389i("LarkWebCookieManager", "start syncMainDomainCookie");
        if (!C29638a.m109622a().getLoginDependency().mo107680a()) {
            m110649a("not login");
        } else if (!C29939f.m110697a().mo107816c()) {
            m110649a("lean mode not allowed");
        } else {
            String str2 = null;
            if (C26252ad.m94993b(C29638a.m109622a().getContext())) {
                Log.m165389i("LarkWebCookieManager", "get session data from main process");
                str2 = C29638a.m109622a().getMainDomain();
                str = C29638a.m109622a().getDocMainDomain();
                hashMap = C29638a.m109622a().getLoginDependency().mo107683c();
            } else {
                Log.m165389i("LarkWebCookieManager", "get session data from child process");
                MainDomainSessionWrapper mainDomainSession = C29638a.m109622a().getMainDomainSession();
                if (mainDomainSession != null) {
                    Log.m165389i("LarkWebCookieManager", "get session data from child process success");
                    str2 = mainDomainSession.mMainDomain;
                    str = mainDomainSession.mDocMainDomain;
                    hashMap = mainDomainSession.mSessionInfoMap;
                } else {
                    hashMap = null;
                    str = null;
                }
            }
            if (TextUtils.isEmpty(str2)) {
                m110649a("get session data error");
                Log.m165389i("LarkWebCookieManager", "get session data error");
                return;
            }
            if (hashMap == null) {
                hashMap = new HashMap<>();
            }
            CookieSyncManager.createInstance(C29638a.m109622a().getContext());
            m110652a(str2, str2, "session", C29638a.m109622a().getLoginDependency().mo107682b());
            m110652a(str, str, "session", C29638a.m109622a().getLoginDependency().mo107682b());
            m110652a(str2, str2, "session_list", C29638a.m109622a().getLoginDependency().mo107682b());
            m110652a(str, str, "session_list", C29638a.m109622a().getLoginDependency().mo107682b());
            for (String str3 : new ArrayList(hashMap.keySet())) {
                if (!TextUtils.equals(str3, str2) && !TextUtils.equals(str3, str)) {
                    SessionInfo sessionInfo = hashMap.get(str3);
                    m110652a(str3, str3, sessionInfo.getSessionName(), sessionInfo.getSession());
                    Log.m165389i("LarkWebCookieManager", "sync addition host " + str3);
                }
            }
            Log.m165389i("LarkWebCookieManager", "sync session data success");
            if (m110658d()) {
                UserSP.getInstance().putBoolean(m110644a(), true);
            }
            m110663g();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m110645a(ValueCallback valueCallback) {
        CookieManager.getInstance().removeSessionCookies(valueCallback);
        CookieManager.getInstance().removeAllCookies(valueCallback);
    }

    /* renamed from: a */
    public static void m110646a(AbstractC29552a aVar) {
        f74660b.put(aVar, new Object());
    }

    /* renamed from: a */
    public static void m110648a(final Runnable runnable) {
        CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable(new ValueCallback<Boolean>() {
            /* class com.ss.android.lark.browser.impl.C29927b.C299281 */

            /* renamed from: b */
            private boolean f74662b;

            /* renamed from: a */
            public void onReceiveValue(Boolean bool) {
                if (!this.f74662b) {
                    this.f74662b = true;
                    Log.m165389i("LarkWebCookieManager", "on clearCookie");
                    Runnable runnable = runnable;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (C29927b.m110658d()) {
                        UserSP.getInstance().putBoolean(C29927b.m110644a(), false);
                    }
                }
            }
        }) {
            /* class com.ss.android.lark.browser.impl.$$Lambda$b$WNK61hTp_kPy9Mky8UCg_8kpXg */
            public final /* synthetic */ ValueCallback f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                C29927b.m110645a(this.f$0);
            }
        });
    }

    /* renamed from: d */
    private static boolean m110659d(String str) {
        String a = C48782b.m192187a().mo170436a(str);
        if (TextUtils.isEmpty(a)) {
            Log.m165389i("LarkWebCookieManager", "cookieStr is null so return");
            return false;
        }
        String a2 = C29643b.m109715a(str);
        if (a2 == null || !a.contains(a2)) {
            Log.m165389i("LarkWebCookieManager", "cookieStr do not contains session");
            return false;
        }
        String str2 = m110660e(a).get(a2);
        if (TextUtils.isEmpty(str2)) {
            Log.m165389i("LarkWebCookieManager", "cookieStr do not contains session value is null");
            return false;
        } else if ((!str2.startsWith("XN0YXJ0-") || !str2.endsWith("-WVuZA")) && (!str2.startsWith("U7CK1RF-") || !str2.endsWith("-NN5W4"))) {
            Log.m165389i("LarkWebCookieManager", "cookieStr not match session feature");
            return false;
        } else {
            Log.m165389i("LarkWebCookieManager", "cookieStr is dirty session");
            return true;
        }
    }

    /* renamed from: e */
    private static Map<String, String> m110660e(String str) {
        HashMap hashMap = new HashMap();
        try {
            for (String str2 : str.split(";")) {
                String[] split = str2.split(ContainerUtils.KEY_VALUE_DELIMITER, 2);
                if (split != null && split.length == 2) {
                    hashMap.put(split[0], split[1]);
                }
            }
        } catch (Exception e) {
            Log.m165383e("LarkWebCookieManager", "transform cookie error " + e);
            C29929a.m110673a(C29931b.f74689t).addCategoryValue("err_msg", e).flush();
        }
        return hashMap;
    }

    /* renamed from: b */
    private static boolean m110655b(String str) {
        try {
            if (!C29638a.m109622a().isFeatureGatingEnable("fg.lark.open.delete.session")) {
                Log.m165389i("LarkWebCookieManager", "fgEnableCheckSession fg is not enable , so return");
                return false;
            }
            String f = m110662f();
            boolean z = C57744a.m224104a().getBoolean(f, false);
            Log.m165389i("LarkWebCookieManager", "clean sp key = " + f + " , hasClean = " + z);
            if (z) {
                Log.m165389i("LarkWebCookieManager", "has clean so return false");
                return false;
            }
            boolean c = m110657c(str);
            C29929a.m110673a(C29931b.f74690u).addCategoryValue("is_main_domain", Boolean.valueOf(c)).flush();
            if (c) {
                Log.m165389i("LarkWebCookieManager", "main domain so not check");
                return false;
            }
            boolean d = m110659d(str);
            C29929a.m110673a(C29931b.f74687r).addCategoryValue("has_dirty_session", Boolean.valueOf(d)).addCategoryValue("host", aq.m95059b(str)).flush();
            if (d) {
                return true;
            }
            Log.m165389i("LarkWebCookieManager", "not contains Error session");
            return false;
        } catch (Exception e) {
            Log.m165383e("LarkWebCookieManager", "shouldCleanSession error : " + e);
            C29929a.m110673a(C29931b.f74692w).addCategoryValue("error_msg", e).flush();
            return false;
        }
    }

    /* renamed from: c */
    private static boolean m110657c(String str) {
        boolean z;
        String str2;
        String str3;
        if (f74659a == null) {
            HashMap<String, SessionInfo> hashMap = null;
            if (C26252ad.m94993b(C29638a.m109622a().getContext())) {
                Log.m165389i("LarkWebCookieManager", "isMainDomain get session data from main process");
                String mainDomain = C29638a.m109622a().getMainDomain();
                str2 = C29638a.m109622a().getDocMainDomain();
                str3 = mainDomain;
                hashMap = C29638a.m109622a().getLoginDependency().mo107683c();
            } else {
                Log.m165389i("LarkWebCookieManager", "isMainDomain get session data from child process");
                MainDomainSessionWrapper mainDomainSession = C29638a.m109622a().getMainDomainSession();
                if (mainDomainSession != null) {
                    Log.m165389i("LarkWebCookieManager", "isMainDomain get session data from child process success");
                    String str4 = mainDomainSession.mMainDomain;
                    str2 = mainDomainSession.mDocMainDomain;
                    hashMap = mainDomainSession.mSessionInfoMap;
                    str3 = str4;
                } else {
                    str3 = null;
                    str2 = null;
                }
            }
            if (hashMap == null) {
                hashMap = new HashMap<>();
            }
            f74659a = new CopyOnWriteArraySet();
            if (!TextUtils.isEmpty(str3)) {
                f74659a.add(str3.toLowerCase());
            }
            if (!TextUtils.isEmpty(str2)) {
                f74659a.add(str2.toLowerCase());
            }
            for (String str5 : hashMap.keySet()) {
                f74659a.add(str5.toLowerCase());
            }
        }
        String b = aq.m95059b(str);
        if (b == null) {
            z = false;
        } else {
            z = f74659a.contains(b.toLowerCase());
        }
        Log.m165389i("LarkWebCookieManager", "host : " + b + " isMainDomain = " + z);
        return z;
    }

    /* renamed from: a */
    private static void m110649a(String str) {
        for (AbstractC29552a aVar : f74660b.keySet()) {
            aVar.mo105679a(str);
        }
    }

    /* renamed from: a */
    public static void m110647a(IBrowserModuleDependency.AbstractC29891h hVar, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                if (!aq.m95060c(str)) {
                    return;
                }
            } catch (Exception e) {
                Log.m165391i("LarkWebCookieManager", e);
            }
            String b = aq.m95059b(str);
            if (b != null) {
                boolean z = false;
                C48782b a = C48782b.m192187a();
                a.mo170438a(true);
                long currentTimeMillis = System.currentTimeMillis();
                if (m110655b(str)) {
                    try {
                        m110650a(str, currentTimeMillis);
                    } catch (Exception e2) {
                        Log.m165383e("LarkWebCookieManager", "handleErrorSession occur err : " + e2);
                        C29929a.m110673a(C29931b.f74691v).addCategoryValue("error_msg", e2).flush();
                    }
                }
                if (m110653a(b, C29643b.m109716a())) {
                    String b2 = hVar.mo107682b();
                    String a2 = a.mo170436a(str);
                    if (!TextUtils.isEmpty(b2) && (TextUtils.isEmpty(a2) || !a2.contains(b2))) {
                        m110652a(str, b, C29643b.m109715a(b), b2);
                        m110652a(str, b, "session_list", b2);
                        z = true;
                    }
                } else {
                    HashMap<String, SessionInfo> c = hVar.mo107683c();
                    for (String str2 : new ArrayList(c.keySet())) {
                        if (!TextUtils.equals(str2, b)) {
                            SessionInfo sessionInfo = c.get(str2);
                            m110652a(str2, str2, sessionInfo.getSessionName(), sessionInfo.getSession());
                            m110652a(str2, str2, "session_list", sessionInfo.getSession());
                            Log.m165389i("LarkWebCookieManager", "sync target url addition host " + str2);
                        }
                    }
                }
                if (z) {
                    a.mo170439b();
                }
            }
        }
    }

    /* renamed from: a */
    private static void m110650a(String str, long j) {
        C29929a.m110673a(C29931b.f74693x).addCategoryValue("host", aq.m95059b(str)).flush();
        m110648a(new RunnableC29924a(str, j));
    }

    /* renamed from: a */
    private static void m110651a(String str, String str2) {
        C48782b a = C48782b.m192187a();
        String str3 = str2 + "=;max-age=0";
        a.mo170437a(str, str3);
        a.mo170437a("." + str, str3);
    }

    /* renamed from: a */
    private static void m110652a(String str, String str2, String str3, String str4) {
        Matcher matcher;
        C48782b a = C48782b.m192187a();
        m110651a(str2, str3);
        m110651a(str2, "lang");
        Pattern h = m110664h();
        if (h == null) {
            matcher = null;
        } else {
            matcher = h.matcher(str2);
        }
        if (matcher != null && matcher.matches()) {
            str2 = m110665i();
        }
        a.mo170437a(str, str3 + ContainerUtils.KEY_VALUE_DELIMITER + str4 + ";max-age=2534023007;domain=" + str2 + ";path=/;lang=" + C29638a.m109622a().getLanguageDependency().mo107673a().getLanguage() + "; HttpOnly");
    }
}
