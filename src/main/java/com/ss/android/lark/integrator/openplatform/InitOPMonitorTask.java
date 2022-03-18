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
import com.ss.android.lark.integrator.littleapp.C39824h;
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
import com.tt.miniapphost.util.DebugUtil;
import com.tt.miniapphost.util.ProcessUtil;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class InitOPMonitorTask extends AsyncLaunchTask {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.integrator.openplatform.InitOPMonitorTask$a */
    public static class C39910a extends C41152a {

        /* renamed from: a */
        private JSONObject f101599a;

        /* renamed from: a */
        public JSONObject mo144741a() {
            return this.f101599a;
        }

        C39910a(JSONObject jSONObject) {
            this.f101599a = jSONObject;
        }
    }

    /* renamed from: com.ss.android.lark.integrator.openplatform.InitOPMonitorTask$b */
    private static class C39911b implements AbstractC41160a {
        private C39911b() {
        }

        /* renamed from: a */
        public C39910a mo103073b(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                return new C39910a(new JSONObject(str));
            } catch (Exception e) {
                Log.m165384e("OPMonitorConfig", "op config parse error", e);
                return null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.integrator.openplatform.InitOPMonitorTask$5 */
    public static /* synthetic */ class C399095 {

        /* renamed from: a */
        static final /* synthetic */ int[] f101598a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ss.android.lark.opmonitor.model.OPMonitorLogLevel[] r0 = com.ss.android.lark.opmonitor.model.OPMonitorLogLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.integrator.openplatform.InitOPMonitorTask.C399095.f101598a = r0
                com.ss.android.lark.opmonitor.model.OPMonitorLogLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLogLevel.ERROR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.integrator.openplatform.InitOPMonitorTask.C399095.f101598a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.opmonitor.model.OPMonitorLogLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLogLevel.FATAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.integrator.openplatform.InitOPMonitorTask.C399095.f101598a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.opmonitor.model.OPMonitorLogLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLogLevel.WARN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.integrator.openplatform.InitOPMonitorTask.C399095.f101598a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.opmonitor.model.OPMonitorLogLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLogLevel.INFO     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.integrator.openplatform.InitOPMonitorTask.C399095.<clinit>():void");
        }
    }

    /* renamed from: a */
    private void m158422a(C48919b bVar) {
        bVar.mo170804a(new IEventNameGetter() {
            /* class com.ss.android.lark.integrator.openplatform.InitOPMonitorTask.C399073 */

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
    private void m158424b(C48919b bVar) {
        bVar.mo170803a(new ICommonParamsGetter() {
            /* class com.ss.android.lark.integrator.openplatform.InitOPMonitorTask.C399084 */

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
        C39910a aVar = (C39910a) ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getAppConfig("op_monitor", new C39911b());
        if (aVar != null) {
            C48919b.m192721a(aVar.mo144741a());
            Log.m165389i("OPMonitorConfig", "set op_monitor_config:" + aVar.mo144741a());
        }
        C48919b bVar = new C48919b(new OPBaseReportImpl() {
            /* class com.ss.android.lark.integrator.openplatform.InitOPMonitorTask.C399051 */

            @Override // com.ss.android.lark.opmonitor.api.OPBaseReportImpl
            /* renamed from: a */
            public void mo144735a(String str, Map<String, ?> map) {
                if (TextUtils.isEmpty(str) || map == null || map.isEmpty()) {
                    Log.m165383e("OPMonitorConfig", "reportToSlardar eventName or data is null!");
                    return;
                }
                JSONObject jSONObject = new JSONObject(map);
                InitOPMonitorTask.m158423a(str, jSONObject);
                Log.m165379d("OPMonitorConfig", "monitor report: " + str + " => " + jSONObject + " platform:slardar");
                C39824h.m158095a().mo144324a(str, jSONObject, (JSONObject) null);
            }

            @Override // com.ss.android.lark.opmonitor.api.OPBaseReportImpl
            /* renamed from: b */
            public void mo144736b(String str, Map<String, ?> map) {
                if (TextUtils.isEmpty(str) || map == null || map.isEmpty()) {
                    Log.m165383e("OPMonitorConfig", "reportToTea eventName or data is null!");
                    return;
                }
                JSONObject jSONObject = new JSONObject(map);
                Log.m165379d("OPMonitorConfig", "monitor report: " + str + " => " + jSONObject + " platform:tea");
                C39824h.m158095a().mo144326b(str, jSONObject);
            }
        }, $$Lambda$InitOPMonitorTask$moeywro75QhDMUHafzPYmccI4g.INSTANCE);
        m158422a(bVar);
        m158424b(bVar);
        bVar.mo170805a(C40634ab.f103062a);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).addLifecycleObserver(new AbstractC29586u(context) {
            /* class com.ss.android.lark.integrator.openplatform.$$Lambda$InitOPMonitorTask$oyzAuY1vBRllBT7lGyPhD4YQNQc */
            public final /* synthetic */ Context f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.ss.android.lark.biz.core.api.AbstractC29586u
            public final void onAppLifecycleChanged(AbstractC29586u.C29587a aVar, AbstractC29586u.C29587a aVar2) {
                InitOPMonitorTask.m158420a(this.f$0, aVar, aVar2);
            }
        });
        C48924d.m192744a(bVar);
        ECOProbeSDKDepMgr.m192760a(new IHostDependency() {
            /* class com.ss.android.lark.integrator.openplatform.InitOPMonitorTask.C399062 */

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

    /* renamed from: a */
    public static void m158423a(String str, JSONObject jSONObject) {
        if (DebugUtil.debug() && jSONObject.optString("trace_id", null) == null) {
            Log.m165383e("OPMonitorConfig", str + " trace id is null!");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m158420a(Context context, AbstractC29586u.C29587a aVar, AbstractC29586u.C29587a aVar2) {
        C48905c.m192683a(context, aVar2.mo105887c());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m158421a(OPMonitorLogLevel oPMonitorLogLevel, String str, String str2, String str3, int i, String str4) {
        StringBuilder sb = new StringBuilder();
        sb.append("filePath:");
        sb.append(str2);
        sb.append("\t");
        sb.append("function:");
        sb.append(str3);
        sb.append("\t");
        sb.append("line:");
        sb.append(i);
        sb.append("\t");
        sb.append("content");
        sb.append(str4);
        int i2 = C399095.f101598a[oPMonitorLogLevel.ordinal()];
        if (i2 == 1 || i2 == 2) {
            Log.m165383e(str, sb.toString());
        } else if (i2 == 3) {
            Log.m165397w(str, sb.toString());
        } else if (i2 != 4) {
            Log.m165379d(str, sb.toString());
        } else {
            Log.m165389i(str, sb.toString());
        }
    }
}
