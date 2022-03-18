package com.ss.android.lark.app.task;

import android.content.Context;
import android.os.Process;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.account_provider.C28498a;
import com.ss.android.lark.account_provider.integrator.C28513a;
import com.ss.android.lark.applogbridge.AppLogProxy;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.exception.entity.AbstractCallableC37029a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openplatform_api.IOpenPlatformApi;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.entity.DeviceSetting;
import com.ss.android.lark.passport.signinsdk_api.env.AbstractC49370a;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.platform.ab.C51659a;
import com.ss.android.lark.platform.ae.C51677a;
import com.ss.android.lark.platform.p2476b.C51714a;
import com.ss.android.lark.platform.p2485f.C51804b;
import com.ss.android.lark.platform.p2510z.C52066a;
import com.ss.android.lark.platform.statistics.perf.C51995b;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.ApiUtils;

public class InitLoginStatusTask extends AsyncLaunchTask {

    /* renamed from: a */
    private Context f72591a;

    /* renamed from: b */
    private C28513a.AbstractC28514a f72592b;

    /* renamed from: i */
    private void m106197i() {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).registerLoginEnvChangeListener(new AbstractC49370a.AbstractC49371a() {
            /* class com.ss.android.lark.app.task.InitLoginStatusTask.C289544 */

            @Override // com.ss.android.lark.passport.signinsdk_api.env.AbstractC49370a.AbstractC49371a
            /* renamed from: a */
            public boolean mo102729a() {
                return true;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.env.AbstractC49370a.AbstractC49371a
            /* renamed from: a */
            public void mo102728a(final boolean z, final AbstractC49352d<String> dVar) {
                C52066a.m201979a().mo201661b().mo201663a(((IPassportApi) ApiUtils.getApi(IPassportApi.class)).envType(), ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getUserUnit(), new IGetDataCallback<Boolean>() {
                    /* class com.ss.android.lark.app.task.InitLoginStatusTask.C289544.C289551 */

                    /* renamed from: a */
                    public void onSuccess(Boolean bool) {
                        String a = C51714a.m200518a(true);
                        AppLogProxy.setUriRuntime(a);
                        Log.m165390i("InitLoginStatusTask", "onLoginEnvChanged success changed = " + z + "; userUnit=" + ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getUserUnit() + "; domain=" + a, null);
                        AbstractC49352d dVar = dVar;
                        if (dVar != null) {
                            dVar.mo145179a("set env success");
                        }
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Log.m165390i("InitLoginStatusTask", "onLoginEnvChanged failed changed = " + z + "; userUnit=" + ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getUserUnit(), null);
                        if (dVar != null) {
                            NetworkErrorResult networkErrorResult = new NetworkErrorResult();
                            networkErrorResult.setErrorCode(-14);
                            networkErrorResult.setErrorMessage("setEnv error");
                            dVar.mo145178a(networkErrorResult);
                        }
                    }
                });
            }
        });
    }

    /* renamed from: j */
    private static void m106198j() {
        String userId = ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getUserId();
        C57744a a = C57744a.m224104a();
        a.putBoolean("first_sync_feed_" + userId, false);
    }

    /* renamed from: g */
    public void mo102723g() {
        C51677a.m200443a().mo148569c().mo148564e();
        C51804b.m200825a().mo148365b().mo148373b();
        ((IIMApi) ApiUtils.getApi(IIMApi.class)).unInitLeanModule();
        ((IIMApi) ApiUtils.getApi(IIMApi.class)).unInitFeedModule();
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).unInitMainModule();
        C51659a.m200385a().mo148385a().mo148381b();
        ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).unInitAppCenterModule();
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).unInitGuideMgrModule();
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).unInitPassportModule();
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).unInitRustTrackPushMonitor();
        ((IIMApi) ApiUtils.getApi(IIMApi.class)).unInitAuditModule();
    }

    /* renamed from: h */
    public void mo102724h() {
        String languageLocalTag = ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLanguageLocalTag(((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLanguageSetting());
        Log.m165379d("MainProcessInitiator", "after login putDeviceSetting Locale = " + languageLocalTag);
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).putDeviceSetting(((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getDeviceId(), languageLocalTag, new IGetDataCallback<DeviceSetting>() {
            /* class com.ss.android.lark.app.task.InitLoginStatusTask.C289533 */

            /* renamed from: a */
            public void onSuccess(DeviceSetting deviceSetting) {
                Log.m165389i("InitLoginStatusTask", "uploadDeviceLanguageSetting success");
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                String str;
                StringBuilder sb = new StringBuilder();
                sb.append("uploadDeviceLanguageSetting error:");
                if (errorResult == null) {
                    str = "null";
                } else {
                    str = errorResult.toString();
                }
                sb.append(str);
                Log.m165383e("InitLoginStatusTask", sb.toString());
            }
        });
    }

    /* renamed from: a */
    public void m106196c(final int i) {
        CoreThreadPool.getDefault().getFixedThreadPool().submit(new AbstractCallableC37029a<Boolean>() {
            /* class com.ss.android.lark.app.task.InitLoginStatusTask.C289511 */

            /* renamed from: a */
            public Boolean mo102726b() {
                Process.setThreadPriority(-8);
                int i = i;
                if (i != 0) {
                    InitLoginStatusTask.this.mo102722b(i);
                    InitLoginStatusTask.this.mo102724h();
                } else {
                    InitLoginStatusTask.this.mo102723g();
                }
                Process.setThreadPriority(0);
                return true;
            }
        });
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        Log.m165389i("InitLoginStatusTask", "InitLoginStatusTask execute...");
        this.f72591a = context;
        $$Lambda$InitLoginStatusTask$LXKbebXyJQ5CC7qonNxW4s57gc r3 = new C28513a.AbstractC28514a() {
            /* class com.ss.android.lark.app.task.$$Lambda$InitLoginStatusTask$LXKbebXyJQ5CC7qonNxW4s57gc */

            @Override // com.ss.android.lark.account_provider.integrator.C28513a.AbstractC28514a
            public final void onLoginStatusChanged(int i) {
                InitLoginStatusTask.m270254lambda$LXKbebXyJQ5CC7qonNxW4s57gc(InitLoginStatusTask.this, i);
            }
        };
        this.f72592b = r3;
        C28513a.m104512a(r3);
        if (!((IPassportApi) ApiUtils.getApi(IPassportApi.class)).isLogin()) {
            C28513a.m104514a(false);
            Log.m165383e("InitLoginStatusTask", "User does not login in AppRunTime");
        } else {
            m106198j();
            ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).dispatchFastLogin();
            C28513a.m104514a(true);
        }
        m106197i();
    }

    /* renamed from: b */
    public void mo102722b(int i) {
        C51995b.m201718a("moduleInit", null, 1);
        C51677a.m200443a().mo148569c().mo148560b();
        if (i == 1) {
            C51804b.m200825a().mo148365b().mo148367a();
            ((IIMApi) ApiUtils.getApi(IIMApi.class)).initLeanModule();
            C28498a.m104383a().mo101377e();
            final ICoreApi iCoreApi = (ICoreApi) ApiUtils.getApi(ICoreApi.class);
            iCoreApi.initMainModule(this.f72591a);
            C51659a.m200385a().mo148385a().mo148378a();
            IOpenPlatformApi iOpenPlatformApi = (IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class);
            iOpenPlatformApi.initAppCenterModule();
            iOpenPlatformApi.registerQRCodeScannerFactory(new IOpenPlatformApi.AbstractC48901b() {
                /* class com.ss.android.lark.app.task.InitLoginStatusTask.C289522 */
            });
            iCoreApi.initGuideMgrModule();
            iCoreApi.initGuideModule();
            ((IIMApi) ApiUtils.getApi(IIMApi.class)).initAuditModule();
        }
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).initPassportModule();
        C51995b.m201714a();
    }
}
