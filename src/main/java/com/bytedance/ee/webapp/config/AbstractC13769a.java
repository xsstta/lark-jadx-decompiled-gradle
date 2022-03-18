package com.bytedance.ee.webapp.config;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.permission.AbsPermissionSyncWrapper;
import com.bytedance.ee.ref.p682a.p685c.C13492c;
import com.larksuite.framework.utils.C26320t;
import com.ss.android.lark.openapi.jsapi.AbstractC48760b;
import com.ss.android.lark.openapi.permission.bean.C48768a;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.ss.android.lark.p2069j.p2070a.C40649p;
import com.tt.miniapphost.p3362a.p3367e.C67462h;
import com.tt.refer.p3400a.p3412i.AbstractC67735c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.webapp.config.a */
public abstract class AbstractC13769a implements AbstractC13780f {

    /* renamed from: a */
    protected C67462h f36000a;

    /* renamed from: b */
    protected OPTrace f36001b;

    /* renamed from: c */
    private final List<String> f36002c = new ArrayList<String>() {
        /* class com.bytedance.ee.webapp.config.AbstractC13769a.C137701 */

        {
            add("share");
            add("requestAuthCode");
            add("setStatusBarColor");
            add("getInspectDebugList");
            add("config");
            add("setMainNavRightItems");
        }
    };

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract AbstractC48760b mo50784a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo50788b(String str, String str2);

    @Override // com.bytedance.ee.webapp.config.AbstractC13780f
    /* renamed from: b */
    public void mo50787b() {
        C67462h hVar = this.f36000a;
        if (hVar != null) {
            m55801b(hVar.getAppId(), this.f36001b);
            this.f36000a = null;
        }
        AppBrandLogger.m52830i("AbsWebappAuthStrategy", "destroy webappAuthStrategy: " + WebappAuthStrategyCreator.f35997a.mo50783a());
    }

    /* renamed from: a */
    public static String m55795a(String str) {
        return C26320t.m95318a(str);
    }

    public AbstractC13769a(OPTrace oPTrace) {
        this.f36001b = oPTrace;
        AppBrandLogger.m52830i("AbsWebappAuthStrategy", "webappAuthStrategy: " + this.f36001b.getTracingID());
    }

    /* renamed from: a */
    public static void m55796a(String str, OPTrace oPTrace) {
        OPMonitor oPMonitor = new OPMonitor("op_webapp_auth_strategy", C40649p.f103132a);
        oPMonitor.tracing(oPTrace);
        oPMonitor.addCategoryValue("appId", str);
        oPMonitor.addCategoryValue("authStrategy", WebappAuthStrategyCreator.f35997a.mo50783a());
        oPMonitor.flush();
    }

    /* renamed from: b */
    public static void m55801b(String str, OPTrace oPTrace) {
        OPMonitor oPMonitor = new OPMonitor("op_webapp_auth_strategy", C40649p.f103137f);
        oPMonitor.tracing(oPTrace);
        oPMonitor.addCategoryValue("appId", str);
        oPMonitor.addCategoryValue("authStrategy", WebappAuthStrategyCreator.f35997a.mo50783a());
        oPMonitor.flush();
    }

    @Override // com.bytedance.ee.webapp.config.AbstractC13780f
    /* renamed from: a */
    public synchronized AbstractC48760b mo50785a(String str, String str2) {
        if (this.f36000a == null) {
            AppBrandLogger.m52830i("AbsWebappAuthStrategy", "authApproved mAppContex is null");
            return C48768a.m192108a(100003, "webappcontext is null");
        }
        AppBrandLogger.m52830i("AbsWebappAuthStrategy", "handle name:" + str);
        if (C13772c.m55814b(str2) || this.f36002c.contains(str)) {
            AppBrandLogger.m52830i("AbsWebappAuthStrategy", "in white list, appId: " + str2 + ", apiName: " + str);
            m55800a(str2, m55795a(this.f36000a.mo234201a()), true, "in white list", this.f36001b);
            return C48768a.m192107a();
        }
        AbstractC48760b a = mo50784a();
        if (a.mo51068a()) {
            AbstractC67735c cVar = (AbstractC67735c) this.f36000a.findServiceByInterface(AbstractC67735c.class);
            if ((cVar instanceof C13492c) && AbsPermissionSyncWrapper.SyncAuthState.SUCCESS != ((C13492c) cVar).mo50200c()) {
                cVar.mo49509a(str2, mo50804c());
            }
        }
        return a;
    }

    @Override // com.bytedance.ee.webapp.config.AbstractC13780f
    /* renamed from: a */
    public void mo50786a(C67462h hVar, boolean z) {
        this.f36000a = hVar;
        if (z) {
            m55796a(hVar.getAppId(), this.f36001b);
            AppBrandLogger.m52830i("AbsWebappAuthStrategy", "init webappAuthStrategy: " + WebappAuthStrategyCreator.f35997a.mo50783a());
        }
    }

    /* renamed from: a */
    public static void m55797a(String str, String str2, int i, OPTrace oPTrace) {
        OPMonitor oPMonitor = new OPMonitor("op_webapp_auth_strategy", C40649p.f103134c);
        oPMonitor.tracing(oPTrace);
        oPMonitor.addCategoryValue("appId", str);
        oPMonitor.addCategoryValue("authStrategy", WebappAuthStrategyCreator.f35997a.mo50783a());
        oPMonitor.addCategoryValue("url", m55795a(str2));
        oPMonitor.addCategoryValue("count", Integer.valueOf(i));
        oPMonitor.flush();
    }

    /* renamed from: a */
    public static void m55798a(String str, String str2, String str3, OPTrace oPTrace) {
        OPMonitor oPMonitor = new OPMonitor("op_webapp_auth_strategy", C40649p.f103133b);
        oPMonitor.tracing(oPTrace);
        oPMonitor.addCategoryValue("appId", str);
        oPMonitor.addCategoryValue("authStrategy", WebappAuthStrategyCreator.f35997a.mo50783a());
        oPMonitor.addCategoryValue("signature", m55795a(str2));
        oPMonitor.addCategoryValue("url", m55795a(str3));
        oPMonitor.flush();
    }

    /* renamed from: a */
    public static void m55800a(String str, String str2, boolean z, String str3, OPTrace oPTrace) {
        OPMonitor oPMonitor = new OPMonitor("op_webapp_auth_strategy", C40649p.f103136e);
        oPMonitor.tracing(oPTrace);
        oPMonitor.addCategoryValue("appId", str);
        oPMonitor.addCategoryValue("authStrategy", WebappAuthStrategyCreator.f35997a.mo50783a());
        oPMonitor.addCategoryValue("url", m55795a(str2));
        oPMonitor.addCategoryValue("hasPermission", Boolean.valueOf(z));
        oPMonitor.addCategoryValue("extraMsg", str3);
        oPMonitor.flush();
    }

    /* renamed from: a */
    public static void m55799a(String str, String str2, boolean z, int i, String str3, OPTrace oPTrace) {
        OPMonitor oPMonitor = new OPMonitor("op_webapp_auth_strategy", C40649p.f103135d);
        oPMonitor.tracing(oPTrace);
        oPMonitor.addCategoryValue("appId", str);
        oPMonitor.addCategoryValue("authStrategy", WebappAuthStrategyCreator.f35997a.mo50783a());
        oPMonitor.addCategoryValue("url", m55795a(str2));
        oPMonitor.addCategoryValue("authed", Boolean.valueOf(z));
        oPMonitor.addCategoryValue("count", Integer.valueOf(i));
        oPMonitor.addCategoryValue("extraMsg", str3);
        oPMonitor.flush();
    }
}
