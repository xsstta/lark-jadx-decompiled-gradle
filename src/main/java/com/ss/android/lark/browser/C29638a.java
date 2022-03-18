package com.ss.android.lark.browser;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.lark.plugin_annotation.bean.LKOpenApiBizDomain;
import com.bytedance.ee.lark.plugin_annotation.bean.PluginEnv;
import com.bytedance.i18n.claymore.ClaymoreServiceLoader;
import com.larksuite.component.openplatform.plugins.config.LKPluginConfig;
import com.larksuite.component.webview.container.C25819a;
import com.larksuite.component.webview.container.C25822b;
import com.larksuite.component.webview.container.dto.AbstractC25833d;
import com.larksuite.component.webview.container.dto.C25830a;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26284k;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.biz.core.api.aq;
import com.ss.android.lark.biz.core.api.browser.AbstractC29552a;
import com.ss.android.lark.browser.biz.dybrid.C29761a;
import com.ss.android.lark.browser.biz.messenger.plugin.OPSharePanelPlugin;
import com.ss.android.lark.browser.biz.webapp.C29877a;
import com.ss.android.lark.browser.biz.webapp.C29878b;
import com.ss.android.lark.browser.dependency.IBrowserModuleDependency;
import com.ss.android.lark.browser.handler.C29908a;
import com.ss.android.lark.browser.handler.C29912b;
import com.ss.android.lark.browser.impl.C29927b;
import com.ss.android.lark.browser.impl.C29935c;
import com.ss.android.lark.browser.impl.C29936d;
import com.ss.android.lark.browser.impl.C29937e;
import com.ss.android.lark.browser.impl.manis.IBrowserP0Proxy;
import com.ss.android.lark.browser.impl.statistics.BrowserHitPoint;
import com.ss.android.lark.browser.p1411a.C29639e;
import com.ss.android.lark.browser.p1412b.C29641a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57766ad;
import com.ss.android.lark.utils.LarkContext;
import ee.android.framework.manis.C68183b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.lark.browser.a */
public class C29638a {
    /* renamed from: b */
    public void mo106853b() {
        mo106862e();
    }

    /* renamed from: f */
    public void mo106863f() {
        C29927b.m110654b();
    }

    /* renamed from: a */
    public void mo106852a(boolean z, boolean z2) {
        Log.m165389i("BrowserModule", "onLoginStatusChange in main");
        m109622a().getDocsDependency().mo107661a(z);
        $$Lambda$a$V_W2ZuBX4vWQA6MEuhmCkMDhVyE r1 = $$Lambda$a$V_W2ZuBX4vWQA6MEuhmCkMDhVyE.INSTANCE;
        if (z2) {
            C29927b.m110648a(new Runnable(z, r1) {
                /* class com.ss.android.lark.browser.$$Lambda$a$mWaIqyB1s90elI6udf7YaRMsc */
                public final /* synthetic */ boolean f$0;
                public final /* synthetic */ Runnable f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void run() {
                    C29638a.m109625a(this.f$0, this.f$1);
                }
            });
        } else {
            CoreThreadPool.getDefault().getScheduleThreadPool().execute(r1);
            Log.m165389i("BrowserModule", "append account cookies in main");
        }
        if (!m109622a().getDocsDependency().mo107666c()) {
            if (!mo106856b(m109622a().getContext())) {
                Log.m165389i("BrowserModule", "onLoginStatusChange p0 not exist");
                return;
            }
            Log.m165389i("BrowserModule", "onLoginStatusChange p0 exist");
            IBrowserP0Proxy iBrowserP0Proxy = (IBrowserP0Proxy) C68183b.m264839a().mo237086a(m109622a().getContext(), IBrowserP0Proxy.class);
            if (iBrowserP0Proxy != null) {
                iBrowserP0Proxy.syncCookieOnAccountChange(z, z2);
            }
        }
    }

    /* renamed from: a */
    public void mo106851a(boolean z, int i) {
        $$Lambda$a$YsmHi16bVEem4WlLufHlmSD8mA8 r1 = new Runnable(i, $$Lambda$a$8QxwCDYdoBcoC6mjp8LL4cb7tBg.INSTANCE) {
            /* class com.ss.android.lark.browser.$$Lambda$a$YsmHi16bVEem4WlLufHlmSD8mA8 */
            public final /* synthetic */ int f$0;
            public final /* synthetic */ Runnable f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void run() {
                C29638a.m109623a(this.f$0, this.f$1);
            }
        };
        if (z) {
            Log.m165389i("BrowserModule", "syncMainDomainSessionCookie clear before.");
            C29927b.m110648a(new Runnable(r1) {
                /* class com.ss.android.lark.browser.$$Lambda$a$thUpYvM1oljWp2OnyLaxreuYfgs */
                public final /* synthetic */ Runnable f$0;

                {
                    this.f$0 = r1;
                }

                public final void run() {
                    this.f$0.run();
                }
            });
            return;
        }
        Log.m165389i("BrowserModule", "syncMainDomainSessionCookie without clear.");
        r1.run();
    }

    /* renamed from: a */
    public void mo106848a(String str) {
        C29927b.m110647a(m109622a().getLoginDependency(), str);
        C29927b.m110661e();
    }

    /* renamed from: a */
    public void mo106850a(String str, String str2) {
        BrowserHitPoint.f74663a.mo107796a(str, str2);
    }

    /* renamed from: a */
    public void mo106842a(Context context, String str) {
        mo106844a(context, str, UrlParams.m108857a().mo105523a(), new HashMap());
    }

    /* renamed from: a */
    public void mo106844a(Context context, String str, UrlParams urlParams, Map<String, String> map) {
        mo106845a(context, str, urlParams, map, null);
    }

    /* renamed from: a */
    public void mo106843a(Context context, String str, int i) {
        if (context == null || TextUtils.isEmpty(str)) {
            Log.m165383e("BrowserModule", "context--" + context + ",urlIsEmpty--" + TextUtils.isEmpty(str));
        } else if (C29936d.m110686a().mo107808c()) {
            C29640b.m109697a(context, UrlParams.m108857a().mo105531d(str).mo105528c(i).mo105523a());
        } else {
            C29935c.m110676a().mo107804b(context, str, UrlParams.m108857a().mo105528c(i).mo105523a(), new HashMap());
        }
    }

    /* renamed from: a */
    public void mo106845a(Context context, String str, UrlParams urlParams, Map<String, String> map, Map<String, String> map2) {
        if (context == null || TextUtils.isEmpty(str)) {
            Log.m165383e("BrowserModule", "context--" + context + ",urlIsEmpty--" + TextUtils.isEmpty(str));
        } else if (C29936d.m110686a().mo107808c()) {
            m109627b(context, str, urlParams, map, map2);
        } else if (C29935c.m110676a().mo107803a(str, map, map2)) {
            Log.m165389i("BrowserModule", "old openUrl run : is handled by openDocsUrl");
        } else {
            Log.m165389i("BrowserModule", "old openUrl run :will run openUrl(xx, xx, xx, xx)");
            C29935c.m110676a().mo107802a(context, str, urlParams, map2);
        }
    }

    /* renamed from: a */
    public void mo106849a(String str, IGetDataCallback<Boolean> iGetDataCallback) {
        C29937e.m110691a().mo107809a(str, iGetDataCallback);
    }

    /* renamed from: a */
    public void mo106847a(AbstractC29552a aVar) {
        C29927b.m110646a(aVar);
    }

    /* renamed from: g */
    public C25830a mo106864g() {
        return C29877a.m110475a(false);
    }

    /* renamed from: a */
    public static IBrowserModuleDependency m109622a() {
        return (IBrowserModuleDependency) ClaymoreServiceLoader.loadFirst(IBrowserModuleDependency.class);
    }

    /* renamed from: k */
    public static List<String> m109630k() {
        return C29908a.m110593d().mo107777g();
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static /* synthetic */ void m109633n() {
        m109622a().getDocsDependency().mo107665b();
        C29927b.m110661e();
    }

    /* renamed from: i */
    public Map<String, String> mo106865i() {
        return C29912b.m110607d().mo107775e();
    }

    /* renamed from: j */
    public List<String> mo106866j() {
        return C29908a.m110593d().mo107775e();
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static /* synthetic */ void m109632m() {
        if (m109622a().getLoginDependency().mo107680a()) {
            C29927b.m110661e();
        } else {
            Log.m165389i("BrowserModule", "syncMainDomainSessionCookie skipped, not login.");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static /* synthetic */ void m109634o() {
        WebView webView = new WebView(LarkContext.getApplication());
        webView.clearCache(true);
        webView.destroy();
    }

    /* renamed from: e */
    public void mo106862e() {
        CoreThreadPool.getDefault().getScheduleThreadPool().schedule($$Lambda$a$5EZ1D8FnAiykRgMbF9MqAk4cH3U.INSTANCE, 5, TimeUnit.SECONDS);
    }

    /* renamed from: h */
    public static List<LKPluginConfig> m109629h() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new LKPluginConfig.C25571a().mo88741a(LKOpenApiBizDomain.OPEN_PLATFORM).mo88742a(PluginEnv.APP_ENV).mo88745a(new OPSharePanelPlugin()).mo88749a());
        return arrayList;
    }

    /* renamed from: c */
    public void mo106859c() {
        Log.m165389i("BrowserModule", "onLocaleChange in p0");
        m109622a().getDocsDependency().mo107665b();
        CoreThreadPool.getDefault().getScheduleThreadPool().execute($$Lambda$NQxvNSlCrAICoJyFl1BovPjAK8.INSTANCE);
        if (!m109622a().getDocsDependency().mo107666c()) {
            if (!mo106856b(m109622a().getContext())) {
                Log.m165389i("BrowserModule", "onLocaleChange p0 not exist");
                return;
            }
            Log.m165389i("BrowserModule", "onLocaleChange p0 exist");
            IBrowserP0Proxy iBrowserP0Proxy = (IBrowserP0Proxy) C68183b.m264839a().mo237086a(m109622a().getContext(), IBrowserP0Proxy.class);
            if (iBrowserP0Proxy != null) {
                iBrowserP0Proxy.syncCookieOnLocaleChange();
            }
        }
    }

    /* renamed from: d */
    public void mo106861d() {
        IBrowserP0Proxy iBrowserP0Proxy;
        if (m109622a().isFeatureGatingEnable("openplatform.web.cleancache.enable")) {
            CoreThreadPool.getDefault().getUIExecutor().execute($$Lambda$a$9vCYsuF86B7DnqS2BLnltqZCdqE.INSTANCE);
            if (!m109622a().getDocsDependency().mo107666c() && (iBrowserP0Proxy = (IBrowserP0Proxy) C68183b.m264839a().mo237086a(m109622a().getContext(), IBrowserP0Proxy.class)) != null) {
                iBrowserP0Proxy.clearWebViewCache();
            }
        }
    }

    /* renamed from: a */
    public void mo106846a(aq aqVar) {
        C29878b.m110476a().mo107586a(aqVar);
    }

    /* renamed from: b */
    public void mo106855b(aq aqVar) {
        C29878b.m110476a().mo107588b(aqVar);
    }

    public C29638a(Context context) {
        C29936d.m110686a().mo107807b();
        C29641a.m109702a(context);
    }

    /* renamed from: c */
    public boolean mo106860c(String str) {
        if (!C29639e.m109680a(str) || !C25819a.m93327a(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private void m109628c(Context context) {
        if (C26284k.m95186b(context.getApplicationContext())) {
            throw new IllegalArgumentException("openUrl:try openUrl but urlParams.targetUrl is empty!!!");
        }
    }

    /* renamed from: b */
    public boolean mo106856b(Context context) {
        if (context == null) {
            Log.m165383e("BrowserModule", "isP0ProcessExist: context is null, so return");
            return false;
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            Log.m165383e("BrowserModule", "isP0ProcessExist: activityManager is null, so return");
            return false;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            Log.m165383e("BrowserModule", "isP0ProcessExist: get running process info  is null, so return");
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.processName.contains(":p0")) {
                Log.m165389i("BrowserModule", "found p0 process process: " + runningAppProcessInfo.processName);
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo106858b(String str) {
        if (C29639e.m109683c(str) || C29639e.m109682b(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo106840a(Context context) {
        IBrowserP0Proxy iBrowserP0Proxy;
        if (!m109622a().getDocsDependency().mo107666c() && (iBrowserP0Proxy = (IBrowserP0Proxy) C68183b.m264839a().mo237086a(context, IBrowserP0Proxy.class)) != null) {
            iBrowserP0Proxy.warmUp();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m109625a(boolean z, Runnable runnable) {
        if (!z) {
            Log.m165389i("BrowserModule", "simple clear cookies in main");
            return;
        }
        CoreThreadPool.getDefault().getScheduleThreadPool().execute(runnable);
        Log.m165389i("BrowserModule", "reset account cookies in main");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m109623a(int i, Runnable runnable) {
        if (i > 0) {
            Log.m165389i("BrowserModule", "syncMainDomainSessionCookie sync with delay.");
            CoreThreadPool.getDefault().getScheduleThreadPool().schedule(runnable, 5, TimeUnit.SECONDS);
            return;
        }
        Log.m165389i("BrowserModule", "syncMainDomainSessionCookie sync immediately.");
        runnable.run();
    }

    /* renamed from: b */
    public boolean mo106857b(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            if (C29639e.m109680a(str)) {
                return C29639e.m109678a(context, str);
            }
            if (C25819a.m93327a(str)) {
                return C25819a.m93325a(context, str);
            }
        }
        return false;
    }

    /* renamed from: a */
    public UrlParams.C29536a mo106839a(UrlParams.C29536a aVar, boolean z) {
        aVar.mo105517a(C29761a.m110046a(!z));
        return aVar;
    }

    /* renamed from: a */
    public void mo106841a(Context context, UrlParams urlParams) {
        if (urlParams == null) {
            Log.m165383e("BrowserModule", "urlParams is null");
        } else if (TextUtils.isEmpty(urlParams.f73907q)) {
            m109628c(context);
            Log.m165383e("BrowserModule", "openUrl:urlParams.targetUrl is empty!!!!!");
        } else {
            C29936d.m110686a().mo107805a(context, urlParams);
        }
    }

    /* renamed from: b */
    public void mo106854b(Context context, String str, UrlParams urlParams) {
        mo106845a(context, str, urlParams, new HashMap(), null);
    }

    /* renamed from: a */
    public Fragment mo106837a(Context context, String str, UrlParams urlParams) {
        return mo106838a(context, str, (Map<String, String>) null, urlParams).mo67297i();
    }

    /* renamed from: b */
    private Bundle m109626b(Context context, String str, Map<String, String> map, UrlParams urlParams) {
        C57766ad adVar = new C57766ad(C25822b.m93349a());
        Intent b = adVar.mo196066b(context);
        C29640b.m109699a(adVar, str, map, urlParams);
        return b.getExtras();
    }

    /* renamed from: a */
    private UrlParams m109621a(String str, UrlParams urlParams, Map<String, String> map, Map<String, String> map2) {
        String str2 = urlParams.f73907q;
        if (TextUtils.isEmpty(str2)) {
            Log.m165389i("BrowserModule", "targetUrl is empty will use default url");
        } else {
            str = str2;
        }
        Map<String, String> map3 = urlParams.f73909s;
        if (!CollectionUtils.isEmpty(map3)) {
            map = map3;
        }
        Map<String, String> map4 = urlParams.f73908r;
        if (!CollectionUtils.isEmpty(map4)) {
            map2 = map4;
        }
        return UrlParams.m108857a().mo105531d(str).mo105521a(urlParams.f73896f).mo105515a(urlParams.f73913w).mo105519a(urlParams.f73891a).mo105530c(urlParams.f73906p).mo105532d(urlParams.f73903m).mo105520a(map).mo105525b(urlParams.f73902l).mo105529c(urlParams.f73910t).mo105534e(urlParams.f73904n).mo105526b(map2).mo105533e(urlParams.f73901k).mo105535f(urlParams.f73911u).mo105537g(urlParams.f73892b).mo105536f(urlParams.f73893c).mo105518a(urlParams.f73897g).mo105538g(urlParams.f73894d).mo105539h(urlParams.f73895e).mo105522a(urlParams.f73898h).mo105524b(urlParams.f73899i).mo105516a(urlParams.f73900j).mo105517a(urlParams.f73914x).mo105528c(urlParams.f73912v).mo105523a();
    }

    /* renamed from: a */
    public AbstractC25833d mo106838a(Context context, String str, Map<String, String> map, UrlParams urlParams) {
        return AbstractC25833d.CC.m93461a(context, m109626b(context, str, map, urlParams));
    }

    /* renamed from: b */
    private void m109627b(Context context, String str, UrlParams urlParams, Map<String, String> map, Map<String, String> map2) {
        UrlParams a = m109621a(str, urlParams, map, map2);
        if (C29936d.m110686a().mo107806a(context, a, 1)) {
            Log.m165389i("BrowserModule", "runNewOpenUrl run :is handled by openUrlByInterceptorType function");
            return;
        }
        Log.m165389i("BrowserModule", "runNewOpenUrl will run openUrl(xx, xx)");
        C29936d.m110686a().mo107805a(context, a);
    }
}
