package com.ss.android.lark.browser;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.component.webview.container.C25822b;
import com.larksuite.component.webview.container.dto.C25830a;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.appsetting.api.SettingManager;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.browser.biz.messenger.C29772a;
import com.ss.android.lark.browser.biz.webapp.C29877a;
import com.ss.android.lark.browser.dependency.IBrowserModuleDependency;
import com.ss.android.lark.browser.dto.ProcessArchConfig;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.StandAloneParam;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.lark.utils.C57766ad;
import com.ss.android.lark.utils.C57858o;
import java.util.Map;

/* renamed from: com.ss.android.lark.browser.b */
public class C29640b {
    /* renamed from: b */
    private static boolean m109701b(UrlParams urlParams) {
        boolean z = false;
        if (urlParams == null || TextUtils.isEmpty(urlParams.f73907q)) {
            Log.m165383e("OpenWebContainerHelper", "urlParams is null or targetUrl is empty");
            return false;
        } else if (urlParams.f73907q.contains("/accounts/security/page/")) {
            Log.m165389i("OpenWebContainerHelper", "is account security page,isEnableReducing return false");
            return false;
        } else {
            ProcessArchConfig processArchConfig = (ProcessArchConfig) SettingManager.getInstance().get(ProcessArchConfig.class);
            if (processArchConfig != null) {
                z = processArchConfig.f74627a;
            }
            Log.m165389i("OpenWebContainerHelper", "ProcessArchConfig enableReducing = " + z);
            return z;
        }
    }

    /* renamed from: a */
    private static boolean m109700a(UrlParams urlParams) {
        boolean z;
        boolean b = C26252ad.m94993b(C29638a.m109622a().getContext());
        boolean b2 = m109701b(urlParams);
        boolean z2 = false;
        if (b) {
            boolean z3 = urlParams.f73906p;
            Log.m165389i("OpenWebContainerHelper", "paramsCanRunInMainProcess = " + z3 + ",enableReducing=" + b2);
            if (b2 || z3) {
                z = true;
            } else {
                z = false;
            }
            C25830a aVar = urlParams.f73914x;
            if (aVar != null && z && aVar.mo91897b()) {
                aVar.mo91895a(false);
                Log.m165389i("OpenWebContainerHelper", "changed origin  paramsInjector,will mainProcess run webContainer");
            }
            z2 = z;
        } else {
            new OPMonitor("open_web_url_process").addCategoryValue("process", C26252ad.m94992a(C29638a.m109622a().getContext())).flush();
        }
        Log.m165389i("OpenWebContainerHelper", "final mainProcessQuickLaunch = " + z2);
        return z2;
    }

    /* renamed from: a */
    private static void m109698a(Context context, C57766ad adVar) {
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
    public static void m109697a(Context context, UrlParams urlParams) {
        if (TextUtils.isEmpty(urlParams.f73907q)) {
            Log.m165383e("OpenWebContainerHelper", "openUrlInWebContainer- urlParams.targetUrl is empty will return");
            return;
        }
        boolean a = m109700a(urlParams);
        if (a) {
            C29638a.m109622a().getWebAppDependency().mo107728a(context);
        }
        boolean isFeatureGatingEnable = C29638a.m109622a().isFeatureGatingEnable("gadget.web.delegate.unify");
        IBrowserModuleDependency.AbstractC29901q webAppDependency = C29638a.m109622a().getWebAppDependency();
        String str = urlParams.f73907q;
        Map<String, String> map = urlParams.f73908r;
        if ((urlParams.f73914x == null && isFeatureGatingEnable) || webAppDependency.mo107729a(str, urlParams)) {
            urlParams.f73914x = C29877a.m110475a(!a);
        }
        C57766ad a2 = C57858o.m224559a(C25822b.m93350a(a));
        m109699a(a2, str, map, urlParams);
        if (!DesktopUtil.m144301a(context)) {
            a2.mo196064a(context);
        } else if (!C29638a.m109622a().isFeatureGatingEnable("spacekit.lkp_open_docs_use_sys_browser") || urlParams.f73912v == 0) {
            Log.m165389i("OpenWebContainerHelper", "lkp open web url in app");
            m109698a(context, a2);
        } else {
            try {
                Log.m165389i("OpenWebContainerHelper", "lkp open web url in system browser");
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
                Log.m165383e("OpenWebContainerHelper", e.getMessage());
                m109698a(context, a2);
            }
        }
    }

    /* renamed from: a */
    public static void m109699a(C57766ad adVar, String str, Map<String, String> map, UrlParams urlParams) {
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
            if (m109701b(urlParams) || z) {
                z2 = true;
            }
            if (z2) {
                Log.m165389i("OpenWebContainerHelper", "use main process messenger webview , for quick launch.");
            }
            C25830a a2 = C29772a.m110103a(!z2);
            C29772a.m110102a(str, a2);
            Log.m165397w("OpenWebContainerHelper", "did not find feature injector , will create default one");
            aVar = a2;
        }
        C25822b.m93352b().mo91901a(bundle, aVar);
        adVar.mo196052a(bundle);
    }
}
