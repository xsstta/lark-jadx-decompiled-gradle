package com.ss.android.lark.browser.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.component.webview.container.C25819a;
import com.larksuite.component.webview.container.C25822b;
import com.larksuite.component.webview.container.dto.C25830a;
import com.larksuite.framework.utils.C26252ad;
import com.larksuite.framework.utils.aq;
import com.ss.android.lark.appsetting.api.SettingManager;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.browser.biz.messenger.C29772a;
import com.ss.android.lark.browser.biz.webapp.C29877a;
import com.ss.android.lark.browser.dependency.IBrowserModuleDependency;
import com.ss.android.lark.browser.dto.ProcessArchConfig;
import com.ss.android.lark.browser.interceptor.QuickOpenUrlInterceptor;
import com.ss.android.lark.browser.p1411a.C29639e;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.StandAloneParam;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.lark.utils.C57766ad;
import com.ss.android.lark.utils.C57858o;
import com.ss.android.lark.widget.span.C59176n;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.browser.impl.c */
public class C29935c {

    /* renamed from: a */
    private static final C29935c f74696a = new C29935c();

    /* renamed from: a */
    public static C29935c m110676a() {
        return f74696a;
    }

    /* renamed from: a */
    private void m110677a(Context context, C57766ad adVar) {
        int i;
        Intent b = adVar.mo196066b(context);
        b.setFlags(402653184);
        if (!(context instanceof Activity)) {
            context.startActivity(b);
            return;
        }
        if (!TextUtils.isEmpty(b.getStringExtra("app_id"))) {
            i = 366;
        } else {
            i = 566;
        }
        C36512a.m144041a().mo134756a((Activity) context, new StandAloneParam.C36572a(b, 2).mo134966a(i).mo134968b(670).mo134967a());
    }

    /* renamed from: a */
    private boolean m110679a(String str, UrlParams urlParams) {
        if (!TextUtils.isEmpty(urlParams.f73892b)) {
            return true;
        }
        if (urlParams.f73900j != null && !TextUtils.isEmpty(urlParams.f73900j.getString("app_id", null))) {
            return true;
        }
        try {
            return !TextUtils.isEmpty(Uri.parse(str).getQueryParameter("app_id"));
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    private boolean m110681b(String str, UrlParams urlParams) {
        boolean z = false;
        if (urlParams == null || (TextUtils.isEmpty(urlParams.f73907q) && TextUtils.isEmpty(str))) {
            Log.m165383e("OpenUrlHelper", "urlParams is null or url is empty");
            return false;
        } else if (!TextUtils.isEmpty(urlParams.f73907q) && urlParams.f73907q.contains("/accounts/security/page/")) {
            Log.m165389i("OpenUrlHelper", "targetUrl is account security page,isEnableReducing return false");
            return false;
        } else if (str.contains("/accounts/security/page/")) {
            Log.m165389i("OpenUrlHelper", "url is account security page,isEnableReducing return false");
            return false;
        } else {
            ProcessArchConfig processArchConfig = (ProcessArchConfig) SettingManager.getInstance().get(ProcessArchConfig.class);
            if (processArchConfig != null) {
                z = processArchConfig.f74627a;
            }
            Log.m165389i("OpenUrlHelper", "ProcessArchConfig enableReducing = " + z);
            return z;
        }
    }

    /* renamed from: a */
    public void mo107801a(Context context, String str, UrlParams urlParams) {
        mo107802a(context, str, urlParams, (Map<String, String>) null);
    }

    /* renamed from: b */
    private boolean m110680b(Context context, String str, UrlParams urlParams) {
        IBrowserModuleDependency.AbstractC29890g littleAppDependency = C29638a.m109622a().getLittleAppDependency();
        if (littleAppDependency == null || !littleAppDependency.mo107676a(str)) {
            return false;
        }
        return littleAppDependency.mo107675a(context, str, urlParams.f73897g);
    }

    /* renamed from: a */
    public boolean mo107803a(String str, Map<String, String> map, Map<String, String> map2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        IBrowserModuleDependency.AbstractC29884b docsDependency = C29638a.m109622a().getDocsDependency();
        if (docsDependency == null || !docsDependency.mo107663a(str)) {
            return false;
        }
        String a = docsDependency.mo107659a(str, C29638a.m109622a().getPerfEnterChatMonitor().mo107771b(), map);
        if (TextUtils.isEmpty(a)) {
            return false;
        }
        return docsDependency.mo107664a(a, map2);
    }

    /* renamed from: a */
    private void m110678a(C57766ad adVar, String str, Map<String, String> map, UrlParams urlParams) {
        C25830a aVar;
        boolean z;
        UrlParams.Source source = urlParams.f73897g;
        C57766ad a = adVar.mo196058a("url", str).mo196058a("title", urlParams.f73891a).mo196058a("app_id", urlParams.f73892b).mo196060a("showTitleBar", urlParams.f73893c).mo196058a("bizName", urlParams.f73901k).mo196058a("offlineResRootPath", urlParams.f73902l).mo196058a("titleBackgroundTranslate", urlParams.f73910t).mo196058a("userAgent", urlParams.f73911u).mo196060a("showActionTitleBar", urlParams.f73894d).mo196060a("showMoreMenuBtn", urlParams.f73895e).mo196060a("isNeedLogin", urlParams.f73903m).mo196060a("isShowLoading", urlParams.f73904n);
        if (source == null) {
            source = UrlParams.Source.APP;
        }
        a.mo196053a(ShareHitPoint.f121868c, source.getValue()).mo196060a("screenForcePortrait", urlParams.f73896f).mo196052a(urlParams.f73900j);
        if (map != null) {
            adVar.mo196059a("extra_data", map);
        }
        if (urlParams.f73898h != null) {
            adVar.mo196061a("enter_transition", urlParams.f73898h);
        }
        if (urlParams.f73899i != -1) {
            adVar.mo196050a(urlParams.f73899i);
        }
        Bundle bundle = new Bundle();
        if (urlParams.f73914x != null) {
            aVar = urlParams.f73914x;
        } else {
            boolean z2 = false;
            if (!urlParams.f73906p || !C26252ad.m94993b(C29638a.m109622a().getContext())) {
                z = false;
            } else {
                z = true;
            }
            if (m110681b(str, urlParams) || z) {
                z2 = true;
            }
            if (z2) {
                Log.m165389i("OpenUrlHelper", "use main process messenger webview , for quick launch.");
            }
            C25830a a2 = C29772a.m110103a(!z2);
            C29772a.m110102a(str, a2);
            Log.m165397w("OpenUrlHelper", "did not find feature injector , will create default one");
            aVar = a2;
        }
        C25822b.m93352b().mo91901a(bundle, aVar);
        adVar.mo196052a(bundle);
    }

    /* renamed from: a */
    public void mo107802a(Context context, String str, UrlParams urlParams, Map<String, String> map) {
        if (context != null && !TextUtils.isEmpty(str)) {
            if (QuickOpenUrlInterceptor.f74310a.mo106868a(context, UrlParams.m108857a().mo105531d(str).mo105523a())) {
                mo107804b(context, str, urlParams, map);
                Log.m165389i("OpenUrlHelper", "load intercept by QuickOpenUrlInterceptor");
            } else if (mo107803a(str, new HashMap(), map)) {
                Log.m165389i("OpenUrlHelper", "load intercept by openDocsUrl");
            } else if (m110680b(context, str, urlParams)) {
                Log.m165389i("OpenUrlHelper", "load intercept by openMalaitaUrl");
            } else if (C29638a.m109622a().getMailDependency().mo107688a(str) && C29638a.m109622a().getMailDependency().mo107687a(context, str, map)) {
                Log.m165389i("OpenUrlHelper", "load intercept by isMailAddress");
            } else if (!m110679a(str, urlParams) || !C29638a.m109622a().onAppIntercept(context)) {
                if (Uri.parse(str).getScheme() == null && C59176n.m229858b().matcher(str).find()) {
                    Log.m165389i("OpenUrlHelper", "missing http schema");
                    str = "https://" + str;
                }
                if (!aq.m95060c(str) && !C29639e.m109680a(str) && !C25819a.m93327a(str)) {
                    Log.m165389i("OpenUrlHelper", "not support url , abort loading");
                } else if (C29639e.m109680a(str) && C29639e.m109679a(context, str, map, urlParams.f73897g)) {
                    Log.m165389i("OpenUrlHelper", "load intercept by MessengerUrlInterceptor");
                } else if (!C25819a.m93327a(str) || !C25819a.m93325a(context, str)) {
                    Log.m165389i("OpenUrlHelper", "will start open browser to loading normal http url");
                    mo107804b(context, str, urlParams, map);
                } else {
                    Log.m165389i("OpenUrlHelper", "load intercept by WebContainerUrlInterceptor");
                }
            } else {
                Log.m165389i("OpenUrlHelper", "load intercept by isApp");
            }
        }
    }

    /* renamed from: b */
    public void mo107804b(Context context, String str, UrlParams urlParams, Map<String, String> map) {
        boolean z;
        IBrowserModuleDependency.AbstractC29901q webAppDependency = C29638a.m109622a().getWebAppDependency();
        boolean b = C26252ad.m94993b(C29638a.m109622a().getContext());
        boolean b2 = m110681b(str, urlParams);
        boolean z2 = false;
        if (b) {
            boolean z3 = urlParams.f73906p;
            Log.m165389i("OpenUrlHelper", "paramsCanRunInMainProcess = " + z3 + ",enableReducing=" + b2);
            if (b2 || z3) {
                z = true;
            } else {
                z = false;
            }
            C25830a aVar = urlParams.f73914x;
            if (aVar != null && z && aVar.mo91897b()) {
                aVar.mo91895a(false);
                Log.m165389i("OpenUrlHelper", "changed origin  paramsInjector,will mainProcess run webContainer");
            }
            z2 = z;
        } else {
            new OPMonitor("open_web_url_process").addCategoryValue("process", C26252ad.m94992a(C29638a.m109622a().getContext())).flush();
        }
        Log.m165389i("OpenUrlHelper", "final mainProcessQuickLaunch = " + z2);
        if (z2) {
            C29638a.m109622a().getWebAppDependency().mo107728a(context);
        }
        boolean isFeatureGatingEnable = C29638a.m109622a().isFeatureGatingEnable("gadget.web.delegate.unify");
        if ((urlParams.f73914x == null && isFeatureGatingEnable) || webAppDependency.mo107729a(str, urlParams)) {
            urlParams.f73914x = C29877a.m110475a(!z2);
        }
        C57766ad a = C57858o.m224559a(C25822b.m93350a(z2));
        m110678a(a, str, map, urlParams);
        if (!DesktopUtil.m144301a(context)) {
            a.mo196064a(context);
        } else if (!C29638a.m109622a().isFeatureGatingEnable("spacekit.lkp_open_docs_use_sys_browser") || urlParams.f73912v == 0) {
            Log.m165389i("OpenUrlHelper", "lkp open web url in app");
            m110677a(context, a);
        } else {
            try {
                Log.m165389i("OpenUrlHelper", "lkp open web url in system browser");
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                if (urlParams.f73912v == 2) {
                    String c = DesktopUtil.m144310c();
                    if (!TextUtils.isEmpty(c)) {
                        intent.setPackage(c);
                    }
                }
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
            } catch (Exception e) {
                Log.m165383e("OpenUrlHelper", e.getMessage());
                m110677a(context, a);
            }
        }
    }
}
