package com.ss.android.lark.browser.biz.dybrid;

import com.larksuite.component.dybrid.h5api.api.AbstractC24169l;
import com.larksuite.component.webview.container.dto.C25830a;
import com.ss.android.lark.apihandler.basic.C28709a;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.browser.biz.basic.C29644a;
import com.ss.android.lark.browser.biz.dybrid.jsapi.CheckJSApiHandlerV2;
import com.ss.android.lark.browser.biz.dybrid.jsapi.FeatureGatingHandlerV2;
import com.ss.android.lark.browser.biz.dybrid.jsapi.GetLarkEnvHandlerV2;
import com.ss.android.lark.browser.biz.dybrid.jsapi.MetricLoggerHandlerV2;
import com.ss.android.lark.browser.biz.dybrid.jsapi.TeaTrackerHandlerV2;
import com.ss.android.lark.browser.biz.dybrid.queryapi.ShowLeftTextQueryApiHandler;
import com.ss.android.lark.browser.biz.dybrid.viewdelegate.DybridWebViewDelegate;
import com.ss.android.lark.browser.biz.messenger.C29772a;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.browser.biz.dybrid.a */
public class C29761a {

    /* renamed from: a */
    private static String f74463a = "DybridInjectorFactory";

    /* renamed from: a */
    public static C25830a m110046a(boolean z) {
        C25830a aVar = new C25830a(z);
        aVar.mo91890a(new DybridWebViewDelegate());
        aVar.mo91891a(AbstractC24169l.C24170a.f59753c, new MetricLoggerHandlerV2());
        aVar.mo91891a(AbstractC24169l.C24170a.f59754d, new TeaTrackerHandlerV2());
        aVar.mo91891a(AbstractC24169l.C24170a.f59756f, new FeatureGatingHandlerV2());
        aVar.mo91891a(AbstractC24169l.C24170a.f59755e, new GetLarkEnvHandlerV2());
        aVar.mo91891a(AbstractC24169l.C24170a.f59758h, new CheckJSApiHandlerV2());
        aVar.mo91892a("is_show_left_text", new ShowLeftTextQueryApiHandler());
        if (C29638a.m109622a().isFeatureGatingEnable("lark.basic.api.handler.v3")) {
            Log.m165389i(f74463a, "enableBasicApiHandlerV3 is true");
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
