package com.ss.android.lark.app.task.initor;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.thread.ThreadFactoryC26153m;
import com.larksuite.framework.utils.C26246a;
import com.larksuite.framework.utils.C26252ad;
import com.larksuite.framework.utils.RomUtils;
import com.ss.android.lark.app.task.initor.TeaAgentModuleDependencyInitor;
import com.ss.android.lark.applogbridge.AppLogProxy;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.signinsdk_api.entity.DeviceId;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.statistics.C54931a;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.helper.CustomHitPointHeaderHolder;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57859q;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

public class TeaAgentModuleDependencyInitor {

    /* renamed from: a */
    public static ExecutorService f72717a;

    /* renamed from: b */
    public static final boolean f72718b = C37239a.m146648b().mo136952a("lark.feed.optimization.enable_skip_get_ab_version_from_sdk", false);

    /* renamed from: c */
    public static final Set<String> f72719c;

    /* renamed from: a */
    public static boolean m106645a() {
        return true;
    }

    static {
        HashSet hashSet = new HashSet();
        f72719c = hashSet;
        hashSet.add("lark_android_ui_receive_push_metrics");
        hashSet.add("lark_android_ui_receive_push_metrics_by_command");
        hashSet.add("feed_main_view");
        hashSet.add("lark_android_cpu_metrics");
        hashSet.add("lark_android_performance_traffic_monitor_metrics");
        hashSet.add("wschannel_push_monitor");
        hashSet.add("feed_grouping_tab_click");
        hashSet.add("feed_main_click");
        hashSet.add("feed_loading_time_new");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m106644a(String str) {
        Log.m165389i("DeviceIdService", "TeaAgentModuleDependencyInitor onDeviceIdChange  rust setDeviceId = " + str);
        CustomHitPointHeaderHolder.f135720a.mo187489b(str);
    }

    /* renamed from: a */
    public static void m106643a(final Context context) {
        if (C26252ad.m94993b(context)) {
            ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).addDeviceIdChangeListener($$Lambda$TeaAgentModuleDependencyInitor$mEH3w5Orob656jqbVLYwLSDle8.INSTANCE);
        }
        f72717a = Executors.newSingleThreadExecutor(new ThreadFactoryC26153m("TeaAgent"));
        Statistics.lazyInit(new C54931a.AbstractC54936d() {
            /* class com.ss.android.lark.app.task.initor.TeaAgentModuleDependencyInitor.C290211 */

            @Override // com.ss.android.lark.statistics.C54931a.AbstractC54936d
            /* renamed from: e */
            public String mo103005e() {
                return C26246a.m94977a(context);
            }

            @Override // com.ss.android.lark.statistics.C54931a.AbstractC54936d
            /* renamed from: g */
            public Context mo103007g() {
                return context.getApplicationContext();
            }

            @Override // com.ss.android.lark.statistics.C54931a.AbstractC54936d
            /* renamed from: c */
            public String mo103003c() {
                return RomUtils.m94954i().mo93345b();
            }

            @Override // com.ss.android.lark.statistics.C54931a.AbstractC54936d
            /* renamed from: d */
            public String mo103004d() {
                return RomUtils.m94954i().mo93346c();
            }

            @Override // com.ss.android.lark.statistics.C54931a.AbstractC54936d
            /* renamed from: f */
            public boolean mo103006f() {
                return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).isLogin();
            }

            @Override // com.ss.android.lark.statistics.C54931a.AbstractC54936d
            /* renamed from: h */
            public ScheduledExecutorService mo103008h() {
                return CoreThreadPool.getDefault().getScheduleThreadPool();
            }

            @Override // com.ss.android.lark.statistics.C54931a.AbstractC54936d
            /* renamed from: i */
            public ExecutorService mo103009i() {
                return CoreThreadPool.getDefault().getCachedThreadPool();
            }

            @Override // com.ss.android.lark.statistics.C54931a.AbstractC54936d
            /* renamed from: b */
            public String mo103002b() {
                return C57859q.m224565a(((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getUserId());
            }

            @Override // com.ss.android.lark.statistics.C54931a.AbstractC54936d
            /* renamed from: a */
            public String mo103000a() {
                String tenantId = ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getTenantId();
                if (!TextUtils.isEmpty(tenantId)) {
                    return C57859q.m224565a(tenantId);
                }
                Log.m165389i("TeaAgentModuleDependencyInitor", "[getEncryptedUserTenantId]loginInfo is null.");
                return "";
            }

            @Override // com.ss.android.lark.statistics.C54931a.AbstractC54936d
            /* renamed from: a */
            public void mo103001a(final C54931a.AbstractC54935c<String> cVar) {
                ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getDeviceId(context, new IGetDataCallback<DeviceId>() {
                    /* class com.ss.android.lark.app.task.initor.TeaAgentModuleDependencyInitor.C290211.C290221 */

                    /* renamed from: a */
                    public void onSuccess(DeviceId deviceId) {
                        C54931a.AbstractC54935c cVar = cVar;
                        if (cVar != null) {
                            cVar.mo187327a((Object) deviceId.getDeviceId());
                        }
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        C54931a.AbstractC54935c cVar = cVar;
                        if (cVar != null) {
                            cVar.mo187328a(errorResult.toString());
                        }
                    }
                });
            }
        }, new C54931a.AbstractC54934b() {
            /* class com.ss.android.lark.app.task.initor.TeaAgentModuleDependencyInitor.C290232 */

            @Override // com.ss.android.lark.statistics.C54931a.AbstractC54934b
            /* renamed from: a */
            public void mo103011a(Context context) {
            }

            @Override // com.ss.android.lark.statistics.C54931a.AbstractC54934b
            /* renamed from: b */
            public void mo103016b(Context context) {
                AppLogProxy.onPause(context);
            }

            @Override // com.ss.android.lark.statistics.C54931a.AbstractC54934b
            /* renamed from: c */
            public void mo103018c(Context context) {
                AppLogProxy.onResume(context);
            }

            @Override // com.ss.android.lark.statistics.C54931a.AbstractC54934b
            /* renamed from: a */
            public void mo103012a(String str) {
                AppLogProxy.setUserUniqueId(str);
            }

            @Override // com.ss.android.lark.statistics.C54931a.AbstractC54934b
            /* renamed from: a */
            public void mo103014a(HashMap<String, Object> hashMap) {
                AppLogProxy.setHeaderInfo(hashMap);
            }

            @Override // com.ss.android.lark.statistics.C54931a.AbstractC54934b
            /* renamed from: a */
            public void mo103015a(boolean z) {
                AppLogProxy.setEnableLog(z);
            }

            /* renamed from: b */
            public void mo103017b(String str, JSONObject jSONObject) {
                AppLogProxy.onEventV3(str, jSONObject);
            }

            @Override // com.ss.android.lark.statistics.C54931a.AbstractC54934b
            /* renamed from: c */
            public void mo103019c(String str, JSONObject jSONObject) {
                AppLogProxy.onMiscEvent(str, jSONObject);
            }

            @Override // com.ss.android.lark.statistics.C54931a.AbstractC54934b
            /* renamed from: a */
            public void mo103013a(String str, JSONObject jSONObject) {
                if (TeaAgentModuleDependencyInitor.m106645a()) {
                    TeaAgentModuleDependencyInitor.f72717a.execute(new Runnable(str, jSONObject, context) {
                        /* class com.ss.android.lark.app.task.initor.$$Lambda$TeaAgentModuleDependencyInitor$2$WP2NET9GTz7tZH4GzAZhlOiIK4o */
                        public final /* synthetic */ String f$1;
                        public final /* synthetic */ JSONObject f$2;
                        public final /* synthetic */ Context f$3;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                            this.f$3 = r4;
                        }

                        public final void run() {
                            TeaAgentModuleDependencyInitor.C290232.this.m106658a(this.f$1, this.f$2, this.f$3);
                        }
                    });
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m106658a(final String str, final JSONObject jSONObject, Context context) {
                if (TeaAgentModuleDependencyInitor.f72718b && TeaAgentModuleDependencyInitor.f72719c.contains(str)) {
                    mo103017b(str, jSONObject);
                } else if (TeaAgentModuleDependencyInitor.m106646b(context)) {
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getABExperimentVersion(str, new IGetDataCallback<String>() {
                        /* class com.ss.android.lark.app.task.initor.TeaAgentModuleDependencyInitor.C290232.C290241 */

                        /* renamed from: a */
                        public void onSuccess(String str) {
                            try {
                                jSONObject.put("ab_sdk_version", str);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            C290232.this.mo103017b(str, jSONObject);
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            try {
                                jSONObject.put("ab_sdk_version", "");
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            C290232.this.mo103017b(str, jSONObject);
                        }
                    });
                } else {
                    mo103017b(str, jSONObject);
                }
            }
        });
    }

    /* renamed from: b */
    public static boolean m106646b(Context context) {
        if (C26252ad.m94993b(context) || TextUtils.equals(C26252ad.m94994c(context), "p0") || C26252ad.m94994c(context).contains("miniapp")) {
            return true;
        }
        return false;
    }
}
