package com.ss.android.lark.integrator.openplatform;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.larkbrand.net.MiniEnvType;
import com.bytedance.ee.lark.infra.network.larkbrand.net.RustNetworkLevel;
import com.larksuite.component.openplatform.infra.p1140c.p1141a.C25536b;
import com.larksuite.component.openplatform.infra.p1140c.p1141a.C25538c;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.ss.android.lark.biz.core.api.AbstractC29586u;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.larkconfig.export.p2103a.C41152a;
import com.ss.android.lark.larkconfig.export.p2105c.AbstractC41160a;
import com.ss.android.lark.littleapp.EnvInfo;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.opmonitor.api.C48905c;
import com.ss.android.lark.opmonitor.api.OPBaseReportImpl;
import com.ss.android.lark.opmonitor.config.ICommonParamsGetter;
import com.ss.android.lark.opmonitor.config.IEventNameGetter;
import com.ss.android.lark.opmonitor.model.C48919b;
import com.ss.android.lark.opmonitor.model.OPMonitorLogLevel;
import com.ss.android.lark.opmonitor.service.C48924d;
import com.ss.android.lark.optrace.dependency.ECOProbeSDKDepMgr;
import com.ss.android.lark.optrace.dependency.IHostDependency;
import com.ss.android.lark.p2069j.p2070a.C40634ab;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;
import com.tt.miniapphost.util.ProcessUtil;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class InitOPMonitorTaskForSimple extends AsyncLaunchTask {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m158436a(OPMonitorLogLevel oPMonitorLogLevel, String str, String str2, String str3, int i, String str4) {
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.integrator.openplatform.InitOPMonitorTaskForSimple$a */
    public static class C39916a extends C41152a {

        /* renamed from: a */
        private final JSONObject f101604a;

        /* renamed from: a */
        public JSONObject mo144743a() {
            return this.f101604a;
        }

        C39916a(JSONObject jSONObject) {
            this.f101604a = jSONObject;
        }
    }

    /* renamed from: com.ss.android.lark.integrator.openplatform.InitOPMonitorTaskForSimple$b */
    private static class C39917b implements AbstractC41160a {
        private C39917b() {
        }

        /* renamed from: a */
        public C39916a mo103073b(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                return new C39916a(new JSONObject(str));
            } catch (Exception e) {
                Log.m165384e("OPMonitorConfig", "op config parse error", e);
                return null;
            }
        }
    }

    /* renamed from: a */
    private void m158437a(C48919b bVar) {
        bVar.mo170804a(new IEventNameGetter() {
            /* class com.ss.android.lark.integrator.openplatform.InitOPMonitorTaskForSimple.C399143 */

            @Override // com.ss.android.lark.opmonitor.config.IEventNameGetter
            /* renamed from: a */
            public String mo144739a(String str) {
                if (TextUtils.isEmpty(str) || !str.startsWith("client.passport.")) {
                    return null;
                }
                return "passport_monitor_event";
            }
        });
    }

    /* renamed from: b */
    private void m158438b(C48919b bVar) {
        bVar.mo170803a(new ICommonParamsGetter() {
            /* class com.ss.android.lark.integrator.openplatform.InitOPMonitorTaskForSimple.C399154 */

            @Override // com.ss.android.lark.opmonitor.config.ICommonParamsGetter
            /* renamed from: a */
            public HashMap<String, Object> mo144740a() {
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put("time", Long.valueOf(System.currentTimeMillis()));
                hashMap.put("cpu_time", Long.valueOf(SystemClock.elapsedRealtime()));
                hashMap.put("is_tt_webview", Boolean.valueOf(((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isUsingTTWebView()));
                hashMap.put("process_info", ProcessUtil.getProcess());
                hashMap.put("rust_status", RustNetworkLevel.forNumber(((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getCurNetWorkLevel().getValue()).getValue());
                IPassportApi iPassportApi = (IPassportApi) ApiUtils.getApi(IPassportApi.class);
                hashMap.put("evn_type", MiniEnvType.forNumber(new EnvInfo(iPassportApi.isOverseaTenantBrand(), iPassportApi.envType()).mo148731b()).getValue());
                return hashMap;
            }
        });
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        C39916a aVar = (C39916a) ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getAppConfig("op_monitor", new C39917b());
        if (aVar != null) {
            C48919b.m192721a(aVar.mo144743a());
            Log.m165389i("OPMonitorConfig", "set op_monitor_config:" + aVar.mo144743a());
        }
        C48919b bVar = new C48919b(new OPBaseReportImpl() {
            /* class com.ss.android.lark.integrator.openplatform.InitOPMonitorTaskForSimple.C399121 */

            @Override // com.ss.android.lark.opmonitor.api.OPBaseReportImpl
            /* renamed from: a */
            public void mo144735a(String str, Map<String, ?> map) {
            }

            @Override // com.ss.android.lark.opmonitor.api.OPBaseReportImpl
            /* renamed from: b */
            public void mo144736b(String str, Map<String, ?> map) {
            }
        }, $$Lambda$InitOPMonitorTaskForSimple$KW3QwlS4OhANYfV6ErK8hP_AwlA.INSTANCE);
        m158437a(bVar);
        m158438b(bVar);
        bVar.mo170805a(C40634ab.f103062a);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).addLifecycleObserver(new AbstractC29586u(context) {
            /* class com.ss.android.lark.integrator.openplatform.$$Lambda$InitOPMonitorTaskForSimple$9WWtfSkc6yW36gGGd9OcNNnTads */
            public final /* synthetic */ Context f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.ss.android.lark.biz.core.api.AbstractC29586u
            public final void onAppLifecycleChanged(AbstractC29586u.C29587a aVar, AbstractC29586u.C29587a aVar2) {
                InitOPMonitorTaskForSimple.m158435a(this.f$0, aVar, aVar2);
            }
        });
        C48924d.m192744a(bVar);
        ECOProbeSDKDepMgr.m192760a(new IHostDependency() {
            /* class com.ss.android.lark.integrator.openplatform.InitOPMonitorTaskForSimple.C399132 */

            @Override // com.ss.android.lark.optrace.dependency.IHostDependency
            /* renamed from: b */
            public boolean mo144738b(String str) {
                return C37239a.m146648b().mo136952a(str, false);
            }

            @Override // com.ss.android.lark.optrace.dependency.IHostDependency
            /* renamed from: a */
            public String mo144737a(String str) {
                if ("optrace_batch_config".equals(str) && C25538c.m91188a() != null) {
                    return C25538c.m91188a().mo88680b();
                }
                if ("opmonitor_heartbeat_conifg".equals(str) && C25536b.m91184a() != null) {
                    return C25536b.m91184a().mo88678b();
                }
                AppBrandLogger.m52829e("OPMonitorConfig", "getMinaConfigValue handler not found,and key is:", str);
                return "";
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m158435a(Context context, AbstractC29586u.C29587a aVar, AbstractC29586u.C29587a aVar2) {
        C48905c.m192683a(context, aVar2.mo105887c());
    }
}
