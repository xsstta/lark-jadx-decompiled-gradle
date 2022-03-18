package com.bytedance.ee.larkbrand.utils;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.appstrategy.AbstractC4152d;
import com.bytedance.ee.appstrategy.C4149b;
import com.bytedance.ee.appstrategy.C4153e;
import com.bytedance.ee.appstrategy.OpenAppStrategyDataWrapper;
import com.bytedance.ee.appstrategy.p240a.AbstractC4146d;
import com.bytedance.ee.appstrategy.p240a.C4145c;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Function;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12827e;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.ss.android.lark.chat.service.lkp.ConvertOfficeToSpaceService;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.tt.miniapp.manager.C66434g;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.refer.common.util.C67866g;
import java.io.Serializable;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.utils.a */
public class C13328a {

    /* renamed from: com.bytedance.ee.larkbrand.utils.a$a */
    public interface AbstractC13334a {
        /* renamed from: a */
        void mo48981a(boolean z);
    }

    /* renamed from: a */
    static void m54246a(String str) {
        OPMonitor oPMonitor = new OPMonitor("op_launch_failpage_click");
        oPMonitor.addCategoryValue("action_type", str);
        oPMonitor.flush();
    }

    /* renamed from: a */
    public static void m54245a(IAppContext iAppContext, Map<String, Serializable> map) {
        OPMonitorLevel oPMonitorLevel;
        int i = 0;
        if (map == null || map.size() <= 0) {
            AppBrandLogger.m52830i("AppStrategyUtil", "app strategy slardar args empty");
            return;
        }
        String str = map.get("domain") instanceof String ? (String) map.remove("domain") : null;
        if (TextUtils.isEmpty(str)) {
            str = "client.open_platform.gadget.app_strategy.ma";
        }
        if (map.get("code") instanceof Integer) {
            i = ((Integer) map.remove("code")).intValue();
        }
        if (i == 10000) {
            oPMonitorLevel = OPMonitorLevel.NORMAL;
        } else {
            oPMonitorLevel = OPMonitorLevel.ERROR;
        }
        C67500a aVar = new C67500a("op_app_strategy_info_check", new OPMonitorCode(str, i, oPMonitorLevel, null), iAppContext);
        for (String str2 : map.keySet()) {
            Serializable serializable = map.get(str2);
            if (serializable instanceof Number) {
                aVar.addMetricValue(str2, serializable);
            } else {
                aVar.addCategoryValue(str2, serializable);
            }
        }
        aVar.flush();
    }

    /* renamed from: a */
    static void m54243a(final Context context, String str, final AbstractC13334a aVar) {
        try {
            final C4145c a = C4145c.m17243a(new JSONObject(str));
            C67866g.m264027a(new Runnable() {
                /* class com.bytedance.ee.larkbrand.utils.C13328a.RunnableC133323 */

                public void run() {
                    C4153e.m17260a(context, a, new AbstractC4146d() {
                        /* class com.bytedance.ee.larkbrand.utils.C13328a.RunnableC133323.C133331 */

                        @Override // com.bytedance.ee.appstrategy.p240a.AbstractC4146d
                        /* renamed from: a */
                        public void mo16245a(String str, String str2) {
                            C13328a.m54246a("confirm");
                            aVar.mo48981a(true);
                        }

                        @Override // com.bytedance.ee.appstrategy.p240a.AbstractC4146d
                        /* renamed from: b */
                        public void mo16247b(String str, String str2) {
                            C13328a.m54246a("cancel");
                            aVar.mo48981a(true);
                        }

                        @Override // com.bytedance.ee.appstrategy.p240a.AbstractC4146d
                        /* renamed from: c */
                        public void mo16249c(String str, String str2) {
                            C13328a.m54246a("request_accessible");
                            LarkExtensionManager.getInstance().getExtension().mo49602a(context, str, str2);
                            aVar.mo48981a(true);
                        }

                        @Override // com.bytedance.ee.appstrategy.p240a.AbstractC4146d
                        /* renamed from: a */
                        public void mo16246a(String str, String str2, String str3) {
                            C13328a.m54246a("install");
                            HostDependManager.getInst().openSchema(context, str3, null);
                            aVar.mo48981a(true);
                        }

                        @Override // com.bytedance.ee.appstrategy.p240a.AbstractC4146d
                        /* renamed from: b */
                        public void mo16248b(String str, String str2, String str3) {
                            C13328a.m54246a("contact_admin");
                            LarkExtensionManager.getInstance().getExtension().mo49609b(str3, str, false);
                            aVar.mo48981a(true);
                        }
                    });
                }
            });
        } catch (JSONException e) {
            AppBrandLogger.eWithThrowable("AppStrategyUtil", "", e);
            aVar.mo48981a(false);
        }
    }

    /* renamed from: a */
    public static void m54247a(String str, final String str2, String str3, final IAppContext iAppContext) {
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("cli_id", str);
                jSONObject.put("apply_param", str3);
            } catch (JSONException e) {
                AppBrandLogger.eWithThrowable("AppStrategyUtil", "request payment", e);
            }
            Observable.create(new Function<String>() {
                /* class com.bytedance.ee.larkbrand.utils.C13328a.C133312 */

                /* renamed from: a */
                public String fun() {
                    C12827e eVar = new C12827e(str2, "POST");
                    eVar.mo48434a(ConvertOfficeToSpaceService.f88309g, "session=" + LarkExtensionManager.getInstance().getExtension().mo49565b());
                    eVar.mo48438b(10000);
                    eVar.mo48439c(10000);
                    eVar.mo48429a(10000);
                    return C66434g.m259707a().mo231984a(eVar, iAppContext).mo48466d();
                }
            }).schudleOn(Schedulers.longIO()).subscribeSimple();
        } catch (Exception e2) {
            AppBrandLogger.eWithThrowable("AppStrategyUtil", "request payment", e2);
        }
    }

    /* renamed from: a */
    public static void m54244a(final Context context, String str, final String str2, final AbstractC13334a aVar, final IAppContext iAppContext) {
        final C4149b a = C4149b.m17250a(str);
        if (a == null) {
            aVar.mo48981a(false);
        } else {
            C67866g.m264027a(new Runnable() {
                /* class com.bytedance.ee.larkbrand.utils.C13328a.RunnableC133291 */

                public void run() {
                    C4153e.m17261a(context, a, new AbstractC4152d() {
                        /* class com.bytedance.ee.larkbrand.utils.C13328a.RunnableC133291.C133301 */

                        @Override // com.bytedance.ee.appstrategy.AbstractC4152d
                        /* renamed from: a */
                        public void mo16254a() {
                            LarkExtensionManager.getInstance().getExtension().mo49602a(context, str2, a.f12610d);
                        }

                        @Override // com.bytedance.ee.appstrategy.AbstractC4152d
                        /* renamed from: a */
                        public void mo16257a(boolean z) {
                            aVar.mo48981a(z);
                        }

                        @Override // com.bytedance.ee.appstrategy.AbstractC4152d
                        /* renamed from: a */
                        public void mo16255a(String str) {
                            LarkExtensionManager.getInstance().getExtension().mo49609b(str, C67432a.m262319a(iAppContext).getAppInfo().appId, false);
                        }

                        @Override // com.bytedance.ee.appstrategy.AbstractC4152d
                        /* renamed from: a */
                        public void mo16256a(String str, String str2) {
                            C13328a.m54247a(str2, str, str2, iAppContext);
                        }
                    });
                }
            });
        }
    }

    /* renamed from: b */
    public static void m54248b(Context context, String str, String str2, AbstractC13334a aVar, IAppContext iAppContext) {
        try {
            OpenAppStrategyDataWrapper a = OpenAppStrategyDataWrapper.m17241a(new JSONObject(str));
            int i = a.f12588a;
            String str3 = a.f12591d;
            if (i == OpenAppStrategyDataWrapper.DataVersion.V1.ordinal()) {
                m54244a(context, str3, str2, aVar, iAppContext);
            } else if (i == OpenAppStrategyDataWrapper.DataVersion.V2.ordinal()) {
                m54243a(context, str3, aVar);
            } else {
                AppBrandLogger.m52831w("AppStrategyUtil", "data wrapper version undefined");
                aVar.mo48981a(false);
            }
        } catch (JSONException e) {
            AppBrandLogger.eWithThrowable("AppStrategyUtil", "open app data parse error", e);
            aVar.mo48981a(false);
        }
    }
}
