package com.ss.android.lark.browser.biz.webapp;

import com.larksuite.component.webview.container.dto.C25830a;
import com.ss.android.lark.apihandler.basic.C28709a;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.browser.biz.basic.C29644a;
import com.ss.android.lark.browser.biz.messenger.C29772a;
import com.ss.android.lark.browser.biz.messenger.jsapi.location.GeoOnceLocationHandlerV2;
import com.ss.android.lark.browser.biz.messenger.jsapi.location.GeoStartLocationHandlerV2;
import com.ss.android.lark.browser.biz.messenger.jsapi.location.GeoStopLocationHandlerV2;
import com.ss.android.lark.browser.biz.webapp.queryapi.OpPlatformServiceQueryApiHandler;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.browser.biz.webapp.a */
public class C29877a {

    /* renamed from: a */
    private static String f74614a = "WebAppInjectorFactory";

    /* renamed from: a */
    public static C25830a m110475a(boolean z) {
        C25830a aVar = new C25830a(z);
        aVar.mo91890a(C29638a.m109622a().getWebAppDependency().mo107727a());
        aVar.mo91892a("op_platform_service", new OpPlatformServiceQueryApiHandler());
        aVar.mo91891a("device.geolocation.get", new GeoOnceLocationHandlerV2());
        aVar.mo91891a("device.geolocation.start", new GeoStartLocationHandlerV2());
        aVar.mo91891a("device.geolocation.stop", new GeoStopLocationHandlerV2());
        if (C29638a.m109622a().isFeatureGatingEnable("lark.basic.api.handler.v3")) {
            Log.m165389i(f74614a, "enableBasicApiHandlerV3 is true");
            C28709a.m105268a(aVar);
            C28709a.m105269b(aVar);
        } else {
            C29644a.m109718a(aVar);
            C29644a.m109719b(aVar);
        }
        C29772a.m110101a(aVar);
        return aVar;
    }
}
