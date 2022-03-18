package com.ss.android.lark.app.task;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.apm.ApmAgent;
import com.bytedance.apm.C2734a;
import com.bytedance.apm.block.p136a.C2835b;
import com.bytedance.apm.block.p136a.C2848f;
import com.bytedance.apm.config.C2882b;
import com.bytedance.apm.config.C2888d;
import com.bytedance.apm.core.AbstractC2908b;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.launch.C3038c;
import com.bytedance.apm.p138d.AbstractC2914a;
import com.bytedance.apm.p138d.AbstractC2915b;
import com.bytedance.apm.p138d.AbstractC2916c;
import com.bytedance.apm.p138d.AbstractC2917d;
import com.bytedance.apm.trace.p155a.C3069b;
import com.bytedance.apm.trace.p155a.C3078c;
import com.bytedance.apm.util.C3116d;
import com.bytedance.applog.encryptor.EncryptorUtil;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.bytedance.memory.MemoryWidget;
import com.bytedance.memory.model.MemoryWidgetConfig;
import com.bytedance.services.apm.api.AbstractC20699d;
import com.bytedance.services.apm.api.C20697b;
import com.bytedance.services.apm.api.IHttpService;
import com.bytedance.tailor.Tailor;
import com.bytedance.ugc.security.detection.privacy_detection_dynamic.PrivacyDetectionDynamicInitializer;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.http.response.BaseResponse;
import com.larksuite.framework.launch.task.AbstractLaunchTask;
import com.larksuite.framework.launch.task.ILaunchTask;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26246a;
import com.larksuite.framework.utils.C26252ad;
import com.larksuite.framework.utils.C26284k;
import com.larksuite.framework.utils.CollectionUtils;
import com.p940e.p941a.C20960a;
import com.p940e.p941a.C20962b;
import com.p940e.p941a.p942a.AbstractC20961a;
import com.ss.android.lark.account_provider.integrator.C28513a;
import com.ss.android.lark.app.task.InitMonitorTask;
import com.ss.android.lark.app.util.FileFgCenter;
import com.ss.android.lark.applogbridge.AppLogProxy;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.passport.signinsdk_api.entity.DeviceId;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49390d;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.platform.lifecycle.ComponentCallbacks2C51833b;
import com.ss.android.lark.platform.network.C51857a;
import com.ss.android.lark.platform.network.C51864e;
import com.ss.android.lark.platform.p2482c.C51790a;
import com.ss.android.lark.platform.p2493n.C51854a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.PackageChannelManager;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

public class InitMonitorTask extends AbstractLaunchTask {

    /* renamed from: a */
    public String f72602a;

    /* renamed from: b */
    public String f72603b;

    /* renamed from: c */
    public String f72604c;

    /* renamed from: g */
    public String f72605g;

    /* renamed from: h */
    public Context f72606h;

    /* access modifiers changed from: protected */
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask
    /* renamed from: a */
    public List<Class<? extends ILaunchTask>> mo43818a() {
        return null;
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: e */
    public String mo92547e() {
        return "InitMonitorTask";
    }

    /* renamed from: g */
    public boolean mo102740g() {
        return true;
    }

    /* renamed from: h */
    private void m106216h() {
        C20960a.m76338a(new AbstractC20961a() {
            /* class com.ss.android.lark.app.task.InitMonitorTask.C289678 */
        });
    }

    /* renamed from: i */
    private static boolean m106218i() {
        return C37239a.m146648b().mo136951a("tt_slardar_old_cryption");
    }

    /* renamed from: g */
    public void mo102739g(C2888d.C2890a aVar) {
        aVar.mo12468b(true);
    }

    /* renamed from: a */
    public void mo102731a(C2888d.C2890a aVar) {
        aVar.mo12457a(new AbstractC2917d() {
            /* class com.ss.android.lark.app.task.InitMonitorTask.C289612 */

            @Override // com.bytedance.apm.p138d.AbstractC2917d
            /* renamed from: a */
            public long mo12600a() {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long ntpTime = ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getNtpTime();
                if (ntpTime > elapsedRealtime * 2) {
                    return ntpTime;
                }
                Log.m165379d("InitMonitorTask", "getNtpTime is -1");
                return -1;
            }
        });
    }

    /* renamed from: b */
    public void mo102734b(C2888d.C2890a aVar) {
        aVar.mo12453a(new AbstractC2908b() {
            /* class com.ss.android.lark.app.task.InitMonitorTask.C289623 */

            @Override // com.bytedance.apm.core.AbstractC2908b
            /* renamed from: b */
            public String mo12552b() {
                return AppLogProxy.getSessionId();
            }

            @Override // com.bytedance.apm.core.AbstractC2908b
            /* renamed from: c */
            public long mo12553c() {
                String userId = ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getUserId();
                try {
                    if (!TextUtils.isEmpty(userId)) {
                        return Long.parseLong(userId);
                    }
                } catch (Exception unused) {
                }
                return (long) UUID.randomUUID().hashCode();
            }

            @Override // com.bytedance.apm.core.AbstractC2908b
            /* renamed from: a */
            public Map<String, String> mo12551a() {
                String str;
                HashMap hashMap = new HashMap(16);
                hashMap.put("aid", InitMonitorTask.this.f72604c);
                hashMap.put("device_id", InitMonitorTask.this.f72605g);
                hashMap.put("version_code", InitMonitorTask.this.f72603b);
                hashMap.put("app_version", InitMonitorTask.this.f72602a);
                hashMap.put("manifest_version_code", InitMonitorTask.this.f72603b);
                hashMap.put("update_version_code", InitMonitorTask.this.f72603b);
                if (InitMonitorTask.this.f72606h != null) {
                    hashMap.put("channel", PackageChannelManager.getBuildPackageChannel(InitMonitorTask.this.f72606h));
                }
                if (C26284k.m95185a(InitMonitorTask.this.f72606h)) {
                    str = "debug";
                } else {
                    str = "release";
                }
                hashMap.put("build_type", str);
                hashMap.put("os_version", Build.VERSION.RELEASE);
                return hashMap;
            }
        });
    }

    /* renamed from: e */
    public void mo102737e(C2888d.C2890a aVar) {
        if (!m106218i()) {
            aVar.mo12459a(new AbstractC20699d() {
                /* class com.ss.android.lark.app.task.InitMonitorTask.C289656 */

                @Override // com.bytedance.services.apm.api.AbstractC20699d
                /* renamed from: a */
                public byte[] mo12470a(byte[] bArr) {
                    if (bArr == null) {
                        return null;
                    }
                    return EncryptorUtil.m14355a(bArr, bArr.length);
                }
            });
        }
    }

    /* renamed from: f */
    public void mo102738f(C2888d.C2890a aVar) {
        aVar.mo12454a(new AbstractC2914a() {
            /* class com.ss.android.lark.app.task.InitMonitorTask.C289667 */

            @Override // com.bytedance.apm.p138d.AbstractC2914a
            /* renamed from: a */
            public void mo12596a(String str, String str2, JSONObject jSONObject) {
                if ("block_monitor".equals(str)) {
                    long optLong = jSONObject.optLong("block_duration");
                    JSONObject jSONObject2 = new JSONObject();
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    try {
                        jSONObject2.put("latency", optLong);
                        jSONObject3.put("since_latest_enter_foreground", C51790a.m200789b());
                        jSONObject3.put("since_startup", C51790a.m200787a());
                        String c = C26252ad.m94994c(InitMonitorTask.this.f72606h);
                        if (TextUtils.isEmpty(c)) {
                            c = "main";
                        }
                        jSONObject4.put("proccess", c);
                        ApmAgent.monitorEvent("app_lag_time", jSONObject4, jSONObject2, jSONObject3);
                    } catch (Exception e) {
                        Log.m165384e("InitMonitorTask", "Block monitor exception", e);
                    }
                    String optString = jSONObject.optString("stack");
                    if (!TextUtils.isEmpty(optString)) {
                        Log.m165397w("InitMonitorTask", "Block detected, duration: " + optLong + ", stack: \n" + optString);
                        return;
                    }
                    Log.m165397w("InitMonitorTask", "Block detected, stack not available");
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m106215b(String str) {
        Log.m165389i("InitMonitorTask", "memoryReachTop");
        ComponentCallbacks2C51833b.m200965a();
        C51854a.m201094a().mo142156a(this.f72606h);
    }

    /* renamed from: h */
    public void mo102741h(C2888d.C2890a aVar) {
        aVar.mo12460a(new C20962b());
        m106216h();
    }

    /* renamed from: i */
    private void m106217i(C2888d.C2890a aVar) {
        aVar.mo12469c(m106214a(DomainSettings.Alias.TT_SLARDAR_SETTING, "/monitor/appmonitor/v4/settings"));
        aVar.mo12463a(m106214a(DomainSettings.Alias.TT_SLARDAR_REPORT, "/monitor/collect/batch/"));
        aVar.mo12467b(m106214a(DomainSettings.Alias.TT_SLARDAR_EXCEPTION, "/monitor/collect/c/exception"));
    }

    /* renamed from: j */
    private void m106219j(C2888d.C2890a aVar) {
        aVar.mo12469c(m106214a(DomainSettings.Alias.TT_SLARDAR_SETTING, "/monitor/appmonitor/v4/settings"));
        aVar.mo12463a(m106214a(DomainSettings.Alias.TT_SLARDAR_REPORT, "/monitor/collect/batch/"));
        aVar.mo12467b(m106214a(DomainSettings.Alias.TT_SLARDAR_EXCEPTION, "/monitor/collect/c/exception"));
    }

    /* renamed from: d */
    public void mo102736d(C2888d.C2890a aVar) {
        MemoryWidgetConfig.Builder buildDebug = MemoryWidgetConfig.newBuilder().buildDebug(false);
        if (C37239a.m146648b().mo136951a("lark.tailor")) {
            buildDebug.dumpAndShrinkConfig(new MemoryWidgetConfig.AbstractC20095a() {
                /* class com.ss.android.lark.app.task.InitMonitorTask.C289645 */

                @Override // com.bytedance.memory.model.MemoryWidgetConfig.AbstractC20095a
                /* renamed from: a */
                public boolean mo68135a(File file) {
                    try {
                        Tailor.dumpHprofData(file.getAbsolutePath(), true);
                        return true;
                    } catch (Throwable th) {
                        Log.m165386e("InitMonitorTask", th);
                        return false;
                    }
                }
            });
        }
        aVar.mo12460a(new MemoryWidget(buildDebug.build(), null));
        aVar.mo12456a(new AbstractC2916c() {
            /* class com.ss.android.lark.app.task.$$Lambda$InitMonitorTask$a38sN09NJzT_hMhEYN3yyvhuy6M */

            @Override // com.bytedance.apm.p138d.AbstractC2916c
            public final void onReachTop(String str) {
                InitMonitorTask.this.m106215b((InitMonitorTask) str);
            }
        });
    }

    /* renamed from: a */
    public void mo102733a(String str) {
        C2888d.C2890a d = C2734a.m11611a().mo11781d();
        mo102732a(d, str);
        mo102734b(d);
        mo102736d(d);
        mo102737e(d);
        mo102738f(d);
        mo102739g(d);
        if (mo102740g()) {
            C2734a.m11611a().mo11779b(d.mo12466a());
        }
    }

    /* renamed from: c */
    public void mo102735c(C2888d.C2890a aVar) {
        long j;
        aVar.mo12462a("os", "Android");
        aVar.mo12462a("device_platform", "android");
        aVar.mo12461a("sdk_int", Build.VERSION.SDK_INT);
        String a = C26246a.m94977a(this.f72606h);
        String valueOf = String.valueOf(C26246a.m94978b(this.f72606h));
        String valueOf2 = String.valueOf(C26246a.m94979c(this.f72606h));
        this.f72603b = valueOf;
        this.f72602a = a;
        aVar.mo12462a("app_version", a);
        aVar.mo12462a("version_code", valueOf);
        aVar.mo12462a("update_version_code", valueOf2);
        if (C26284k.m95186b(this.f72606h)) {
            j = 10;
        } else {
            j = 30;
        }
        aVar.mo12452a(j);
        aVar.mo12465a(true);
        aVar.mo12458a(new IHttpService() {
            /* class com.ss.android.lark.app.task.InitMonitorTask.C289634 */
            private C51857a bytedanceNetworkClient;

            private void initNetworkIfNeed() {
                if (this.bytedanceNetworkClient == null) {
                    this.bytedanceNetworkClient = new C51857a(InitMonitorTask.this.f72606h, C51864e.m201147a());
                }
            }

            @Override // com.bytedance.services.apm.api.IHttpService
            public C20697b doGet(String str, Map<String, String> map) throws Exception {
                initNetworkIfNeed();
                BaseResponse a = this.bytedanceNetworkClient.mo178023a(str, map);
                return new C20697b(a.code(), a.headers(), a.body().mo92411c());
            }

            @Override // com.bytedance.services.apm.api.IHttpService
            public C20697b uploadFiles(String str, List<File> list, Map<String, String> map) throws Exception {
                return C3116d.m12978a(str, list, map);
            }

            @Override // com.bytedance.services.apm.api.IHttpService
            public C20697b doPost(String str, byte[] bArr, Map<String, String> map) throws Exception {
                initNetworkIfNeed();
                BaseResponse a = this.bytedanceNetworkClient.mo178024a(str, bArr, map);
                return new C20697b(a.code(), a.headers(), a.body().mo92411c());
            }
        });
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(final Context context) {
        this.f72606h = context;
        C2882b.C2884a s = C2882b.m12147s();
        s.mo12419d(C26284k.m95185a(this.f72606h));
        s.mo12420e(true);
        s.mo12418c(true);
        s.mo12413a(C26252ad.m94992a(this.f72606h));
        if (C26284k.m95186b(this.f72606h)) {
            s.mo12417b(true);
            s.mo12416b(500);
        }
        ApmDelegate.m12591a().mo12776a(this.f72606h, s.mo12411a(new C3038c.C3039a().mo12854a(100000).mo12853a().mo12855b().mo12856c()).mo12415a());
        C3069b.m12808a(true);
        if (!C26252ad.m94993b(context)) {
            C2848f.m12008a().mo12248b();
            C2835b bVar = new C2835b();
            C3078c.m12830a(bVar);
            C2848f.m12008a().mo12243a(bVar);
        }
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.app.task.InitMonitorTask.RunnableC289561 */

            public void run() {
                ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getDeviceId(context, new IGetDataCallback<DeviceId>() {
                    /* class com.ss.android.lark.app.task.InitMonitorTask.RunnableC289561.C289571 */

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public /* synthetic */ void m106234a(String str) {
                        Log.m165389i("DeviceIdService", "InitMonitorTask onDeviceid  changed = " + str);
                        InitMonitorTask.this.mo102733a(str);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Log.m165383e("InitMonitorTask", "getDeviceId" + errorResult.toString());
                    }

                    /* renamed from: a */
                    public void onSuccess(DeviceId deviceId) {
                        InitMonitorTask.this.f72605g = deviceId.getDeviceId();
                        C2888d.C2890a a = C2888d.m12186a();
                        InitMonitorTask.this.mo102731a(a);
                        InitMonitorTask.this.mo102735c(a);
                        InitMonitorTask.this.mo102732a(a, InitMonitorTask.this.f72605g);
                        InitMonitorTask.this.mo102734b(a);
                        InitMonitorTask.this.mo102736d(a);
                        InitMonitorTask.this.mo102737e(a);
                        InitMonitorTask.this.mo102738f(a);
                        InitMonitorTask.this.mo102739g(a);
                        InitMonitorTask.this.mo102741h(a);
                        if (FileFgCenter.m106955b().mo103171a("privacy_detection_dynamic")) {
                            a.mo12455a(new AbstractC2915b() {
                                /* class com.ss.android.lark.app.task.InitMonitorTask.RunnableC289561.C289571.C289581 */

                                @Override // com.bytedance.apm.p138d.AbstractC2915b
                                /* renamed from: a */
                                public void mo12597a() {
                                }

                                @Override // com.bytedance.apm.p138d.AbstractC2915b
                                /* renamed from: b */
                                public void mo12598b() {
                                    PrivacyDetectionDynamicInitializer.onApmConfigReady();
                                }
                            });
                        }
                        C2888d a2 = a.mo12466a();
                        if (InitMonitorTask.this.mo102740g()) {
                            C2734a.m11611a().mo11777a(a2);
                        }
                        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).addDeviceIdChangeListener(new AbstractC49390d.AbstractC49391a() {
                            /* class com.ss.android.lark.app.task.$$Lambda$InitMonitorTask$1$1$cxLPUuBs3IrB76lK41PquoiTEU */

                            @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49390d.AbstractC49391a
                            public final void onDeviceIdChange(String str) {
                                InitMonitorTask.RunnableC289561.C289571.this.m106234a((InitMonitorTask.RunnableC289561.C289571) str);
                            }
                        });
                        C28513a.m104513a(new C28513a.AbstractC28515b() {
                            /* class com.ss.android.lark.app.task.InitMonitorTask.RunnableC289561.C289571.C289592 */

                            @Override // com.ss.android.lark.account_provider.integrator.C28513a.AbstractC28515b
                            public void onLoginStatusChanged(boolean z) {
                                Log.m165389i("InitMonitorTask ", "receive login status change! isLogin is " + z);
                                CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
                                    /* class com.ss.android.lark.app.task.InitMonitorTask.RunnableC289561.C289571.C289592.RunnableC289601 */

                                    public void run() {
                                        InitMonitorTask.this.mo102733a((String) null);
                                    }
                                });
                            }
                        });
                    }
                });
            }
        });
    }

    /* renamed from: a */
    private List<String> m106214a(DomainSettings.Alias alias, String str) {
        List<String> b = DynamicConfigModule.m145553b(alias);
        if (CollectionUtils.isEmpty(b)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = b.iterator();
        while (it.hasNext()) {
            arrayList.add("https://" + it.next() + str);
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo102732a(C2888d.C2890a aVar, String str) {
        if (str == null) {
            str = ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getDeviceIdFromLocal();
        }
        this.f72605g = str;
        aVar.mo12462a("device_id", str);
        if (((IPassportApi) ApiUtils.getApi(IPassportApi.class)).isOverseaTenantBrand()) {
            m106217i(aVar);
        } else {
            m106219j(aVar);
        }
        String valueOf = String.valueOf(C29410a.m108287a().mo104277a());
        aVar.mo12462a("aid", valueOf);
        Log.m165389i("InitMonitorTask", "TextUtils.isEmpty(aId)=" + TextUtils.isEmpty(valueOf) + " Thread name:" + Thread.currentThread().getName());
        if (TextUtils.isEmpty(valueOf)) {
            Log.m165389i("InitMonitorTask", "BuildConfig.SLARDAR_APP_ID:0 isDebugMode:" + C26284k.m95185a(LarkContext.getApplication()) + " isDevelopPackage:" + C26284k.m95186b(LarkContext.getApplication()) + " isUsPackage():" + C29410a.m108290d().isUsPackage());
        }
        this.f72604c = valueOf;
    }
}
