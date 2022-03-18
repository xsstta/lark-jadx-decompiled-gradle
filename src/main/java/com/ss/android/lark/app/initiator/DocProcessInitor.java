package com.ss.android.lark.app.initiator;

import android.content.Context;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.ee.bear.diskmanager.Biz;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.InitSDKRequest;
import com.bytedance.lark.pb.basic.v1.KaInitConfig;
import com.bytedance.lark.pb.device.v1.SetDeviceRequest;
import com.bytedance.lark.pb.tool.v1.InitNetRequest;
import com.bytedance.lark.pb.tool.v1.SetAccessTokenOnlyRequest;
import com.bytedance.lark.sdk.Sdk;
import com.facebook.soloader.DirectorySoSource;
import com.facebook.soloader.SoLoader;
import com.larksuite.component.safemode.SafeModeConstants;
import com.larksuite.component.safemode.SafeModeManager;
import com.larksuite.component.ui.display.manager.IStore;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.framework.launch.task.AbstractLaunchTask;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.larksuite.framework.launch.task.ILaunchTask;
import com.larksuite.framework.utils.C26246a;
import com.ss.android.lark.account_provider.integrator.C28513a;
import com.ss.android.lark.app.task.DoubleThreadQuickenInit;
import com.ss.android.lark.app.task.InitGuideTask;
import com.ss.android.lark.app.task.InitHotfixModuleTask;
import com.ss.android.lark.app.task.InitMonitorTask;
import com.ss.android.lark.app.task.InitOkHttpTask;
import com.ss.android.lark.app.task.PreloadModuleTask;
import com.ss.android.lark.app.task.UpdateUserAgentTask;
import com.ss.android.lark.app.taskv2.InitScreenshotsTask;
import com.ss.android.lark.app.taskv2.central.InitSafeModeTask;
import com.ss.android.lark.app.taskv2.preload.DocSpPreloadTask;
import com.ss.android.lark.app.taskv2.preload.GadgetJatoTask;
import com.ss.android.lark.app.taskv2.preload.InitCacheCleanTask;
import com.ss.android.lark.app.taskv2.preload.InitMagicTeaTask;
import com.ss.android.lark.app.taskv2.preload.InitTroubleKillerTask;
import com.ss.android.lark.app.taskv2.preload.StartRaphaelTask;
import com.ss.android.lark.app.taskv2.preload.initVPNSDKTask;
import com.ss.android.lark.app.util.OpenSSLEnvUtil;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.aq;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.ccm_api.AbstractC32803a;
import com.ss.android.lark.ccm_api.ICCMApi;
import com.ss.android.lark.ccm_api.SpacekitConst;
import com.ss.android.lark.core.p1768f.C36136a;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openplatform_api.IOpenPlatformApi;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.platform.network.ttnet.C51880f;
import com.ss.android.lark.sdk.AbstractC53235b;
import com.ss.android.lark.sdk.AbstractC53238e;
import com.ss.android.lark.sdk.C53254m;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57840j;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.PackageChannelManager;
import com.ss.android.lark.utils.UIHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DocProcessInitor extends C28912b {

    /* renamed from: b */
    private static List<String> f72522b;

    private static class InitP0UIComponentTask extends AbstractLaunchTask {
        private InitP0UIComponentTask() {
        }

        /* renamed from: g */
        private void m105909g() {
            LKUIDisplayManager.m91873a(new IStore() {
                /* class com.ss.android.lark.app.initiator.DocProcessInitor.InitP0UIComponentTask.C289051 */

                @Override // com.larksuite.component.ui.display.manager.IStore
                /* renamed from: a */
                public boolean mo89310a() {
                    return C37239a.m146648b().mo136952a("lark.mobile.display_textsize", false);
                }

                @Override // com.larksuite.component.ui.display.manager.IStore
                /* renamed from: a */
                public int mo89308a(String str) {
                    return C57744a.m224104a().getInt(str);
                }

                @Override // com.larksuite.component.ui.display.manager.IStore
                /* renamed from: a */
                public void mo89309a(String str, int i) {
                    C57744a.m224104a().putInt(str, i);
                }
            });
        }

        @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
        /* renamed from: a */
        public void mo43817a(Context context) {
            m105909g();
        }
    }

    /* access modifiers changed from: private */
    public static class InitRustP0Task extends AsyncLaunchTask {
        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ Object m105914a(byte[] bArr) throws IOException {
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static /* synthetic */ Object m105916b(byte[] bArr) throws IOException {
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static /* synthetic */ Object m105917c(byte[] bArr) throws IOException {
            return null;
        }

        private InitRustP0Task() {
        }

        /* renamed from: g */
        private void m105918g() {
            m105919h();
            m105920i();
            m105921j();
        }

        /* renamed from: j */
        private void m105921j() {
            InitNetRequest.C19713a aVar = new InitNetRequest.C19713a();
            ArrayList arrayList = new ArrayList();
            arrayList.add(InitNetRequest.HostAlias.DOCS_DRIVE);
            arrayList.add(InitNetRequest.HostAlias.DOCS_API);
            aVar.mo66816a(arrayList);
            SdkSender.asynSendRequestNonWrap(Command.INIT_NET, aVar, null, $$Lambda$DocProcessInitor$InitRustP0Task$PfkBoiWAmbpVOr7yLc6iQbzr2w.INSTANCE);
        }

        /* renamed from: h */
        private void m105919h() {
            String deviceId = ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getDeviceId();
            Log.m165389i("DocProcessInitImpl", "setDeviceId: deviceId start ");
            if (!TextUtils.isEmpty(deviceId)) {
                SetDeviceRequest.C16592a aVar = new SetDeviceRequest.C16592a();
                HashMap hashMap = new HashMap();
                hashMap.put("device_model", Build.MODEL);
                aVar.mo59022a(deviceId).mo59025b(Build.VERSION.RELEASE).mo59026c(Build.MODEL).mo59023a(hashMap).mo59027d(UIHelper.getAppName()).mo59028e(((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getDevicePlatform());
                SdkSender.asynSendRequestNonWrap(Command.SET_DEVICE, aVar, null, $$Lambda$DocProcessInitor$InitRustP0Task$MMlF9zZ8rZ3i1x3YfLVcfxzlbCg.INSTANCE);
                return;
            }
            Log.m165383e("DocProcessInitImpl", "setDeviceId()... deviceId is empty");
        }

        /* renamed from: i */
        private void m105920i() {
            String session = ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getSession();
            Log.m165389i("DocProcessInitImpl", "setAccessTokenOnlyRequest: start");
            if (!TextUtils.isEmpty(session)) {
                SetAccessTokenOnlyRequest.C19747a aVar = new SetAccessTokenOnlyRequest.C19747a();
                aVar.mo66897a(session);
                aVar.mo66899b(((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getUserId());
                SdkSender.asynSendRequestNonWrap(Command.SET_ACCESS_TOKEN_ONLY, aVar, null, $$Lambda$DocProcessInitor$InitRustP0Task$XJ_isXxxs1Jm2xuYPgHUXZ8pVwA.INSTANCE);
                Log.m165389i("DocProcessInitImpl", "setAccessTokenOnlyRequest()... ok");
                return;
            }
            Log.m165383e("DocProcessInitImpl", "setAccessTokenOnlyRequest()... token is empty");
        }

        @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
        /* renamed from: a */
        public void mo43817a(Context context) {
            mo102646b(context);
        }

        /* renamed from: a */
        private String m105915a(String str) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("DocsSDK");
            stringBuffer.append("/");
            stringBuffer.append(str);
            stringBuffer.append(" ");
            stringBuffer.append("Lark");
            stringBuffer.append("/");
            stringBuffer.append(str);
            stringBuffer.append(" ");
            stringBuffer.append("Rust platform/android okhttp/3.2 Mobile");
            return stringBuffer.toString();
        }

        /* renamed from: b */
        public void mo102646b(Context context) {
            Log.m165389i("DocProcessInitImpl", "initRustSDK: start");
            String a = C26246a.m94977a(context);
            String a2 = m105915a(a);
            String valueOf = String.valueOf(C29410a.m108287a().mo104277a());
            String cCMInnerFilePath = ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).getCCMInnerFilePath(context, Biz.RUSTSDK, "sdkStorage");
            InitSDKRequest.C15029a aVar = new InitSDKRequest.C15029a();
            aVar.f39738a = cCMInnerFilePath + "/space";
            aVar.f39752o = C57881t.m224634f(context);
            InitSDKRequest.EnvV2.Type fromValue = InitSDKRequest.EnvV2.Type.fromValue(((IPassportApi) ApiUtils.getApi(IPassportApi.class)).envType());
            String userUnit = ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getUserUnit();
            if (fromValue == InitSDKRequest.EnvV2.Type.RELEASE) {
                if (ServiceFinder.m193748c().isLarkPackage()) {
                    userUnit = "eu_ea";
                } else {
                    userUnit = "eu_nc";
                }
            }
            InitSDKRequest.EnvV2 envV2 = new InitSDKRequest.EnvV2(fromValue, userUnit, "");
            aVar.mo54905a(InitSDKRequest.EnvType.fromValue(((IPassportApi) ApiUtils.getApi(IPassportApi.class)).oldSdkEnv()));
            aVar.mo54906a(envV2);
            aVar.mo54925i(DynamicConfigModule.m145555d());
            aVar.mo54917b(a);
            aVar.mo54919c(a2);
            boolean z = true;
            aVar.mo54912a((Boolean) true);
            aVar.mo54920d(valueOf);
            aVar.mo54909a(InitSDKRequest.ProcessType.NETWORK);
            ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).interceptRustInitRequest(aVar);
            Log.m165389i("DocProcessInitImpl", "initRustSDK: env 2 is " + envV2);
            if (PackageChannelManager.isKABuildPackage(context)) {
                KaInitConfig.C15033a aVar2 = new KaInitConfig.C15033a();
                aVar2.mo54934a(PackageChannelManager.getBuildPackageChannel(context));
                if (!PackageChannelManager.isKABuildPackage(context) || PackageChannelManager.getDeployMode(context) == 1) {
                    z = false;
                }
                aVar2.mo54933a(Boolean.valueOf(z));
                if (z) {
                    aVar2.mo54936b(DynamicConfigModule.m145555d());
                }
                aVar.mo54910a(aVar2.build());
            }
            try {
                Sdk.getInstance().initSDK(context, aVar);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                Sdk.notifyEndInitSdk();
                throw th;
            }
            Sdk.notifyEndInitSdk();
            m105918g();
        }
    }

    private static class initBrowserLogicTask extends AbstractLaunchTask {
        private initBrowserLogicTask() {
        }

        /* renamed from: g */
        private void m105924g() {
            ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).registerWebLifecycleListener();
            ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).registerWebLifecycleListener(new aq() {
                /* class com.ss.android.lark.app.initiator.DocProcessInitor.initBrowserLogicTask.C289061 */

                @Override // com.ss.android.lark.biz.core.api.aq
                /* renamed from: a */
                public void mo102647a(WebView webView, Context context, String str, SslError sslError, Map<String, String> map) {
                }

                @Override // com.ss.android.lark.biz.core.api.aq
                /* renamed from: a */
                public void mo102648a(WebView webView, Context context, String str, String str2, Map<String, String> map) {
                }

                @Override // com.ss.android.lark.biz.core.api.aq
                /* renamed from: b */
                public void mo102650b(WebView webView, Context context, String str, Map<String, String> map) {
                }

                @Override // com.ss.android.lark.biz.core.api.aq
                /* renamed from: a */
                public void mo102649a(WebView webView, Context context, String str, Map<String, String> map) {
                    ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).onPageStartedLoad(webView, context, str, map);
                }
            });
        }

        @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
        /* renamed from: a */
        public void mo43817a(Context context) {
            m105924g();
            ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).initBrowserModule();
            ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).initOpenPlatformModule(context);
            Log.m165379d("DocProcessInitImpl", "start updateVariationsStampIfNeed");
            new PreloadModuleTask.BfdIssueTracker().mo102759a(context);
        }
    }

    /* access modifiers changed from: private */
    public static class initDocLogicTask extends AbstractLaunchTask {
        private initDocLogicTask() {
        }

        /* renamed from: g */
        private void m105931g() {
            ICCMApi iCCMApi = (ICCMApi) ApiUtils.getApi(ICCMApi.class);
            if (iCCMApi != null) {
                iCCMApi.setOnWebViewCreateListener(new AbstractC32803a() {
                    /* class com.ss.android.lark.app.initiator.DocProcessInitor.initDocLogicTask.C289071 */

                    @Override // com.ss.android.lark.ccm_api.AbstractC32803a
                    /* renamed from: a */
                    public void mo102651a(WebView webView) {
                        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).setWebViewTag(webView, "DocWebView");
                    }
                });
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ void m105930a(int i) {
            ICCMApi iCCMApi = (ICCMApi) ApiUtils.getApi(ICCMApi.class);
            if (iCCMApi == null) {
                return;
            }
            if (i == 0) {
                ((IIMApi) ApiUtils.getApi(IIMApi.class)).unInitAuditModule();
                iCCMApi.onLoginStatusChangedEvent(SpacekitConst.LoginEvent.Logout.ordinal());
            } else if (i == 1 || i == 2) {
                ((IIMApi) ApiUtils.getApi(IIMApi.class)).initAuditModule();
                iCCMApi.onLoginStatusChangedEvent(SpacekitConst.LoginEvent.Login.ordinal());
            }
        }

        @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
        /* renamed from: a */
        public void mo43817a(Context context) {
            C28513a.m104512a($$Lambda$DocProcessInitor$initDocLogicTask$_1qqCzzNoA1nO0MAcbc51XNofU.INSTANCE);
            ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).initDocPlugin(context);
            m105931g();
            if (!((IPassportApi) ApiUtils.getApi(IPassportApi.class)).isLogin()) {
                ((IIMApi) ApiUtils.getApi(IIMApi.class)).unInitAuditModule();
                Log.m165383e("DocProcessInitImpl", "User does not login in AppRunTime");
                return;
            }
            ((IIMApi) ApiUtils.getApi(IIMApi.class)).initAuditModule();
        }
    }

    private static class initImageModuleProviderTask extends AbstractLaunchTask {
        private initImageModuleProviderTask() {
        }

        @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
        /* renamed from: a */
        public void mo43817a(Context context) {
            ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).preLoadImageModule();
        }
    }

    private static class initPreLoadSettingV1FromLocalTask extends AbstractLaunchTask {
        private initPreLoadSettingV1FromLocalTask() {
        }

        @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
        /* renamed from: a */
        public void mo43817a(Context context) {
            ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).preLoadSettingV1FromLocal();
        }
    }

    private static class initPreloadDynamicConfigTask extends AbstractLaunchTask {
        private initPreloadDynamicConfigTask() {
        }

        @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
        /* renamed from: a */
        public void mo43817a(Context context) {
            ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).preloadDynamicConfig();
        }
    }

    private static class initRustDependencyP0Task extends AbstractLaunchTask {
        private initRustDependencyP0Task() {
        }

        /* renamed from: g */
        private void m105937g() {
            C53254m.m205924a(new AbstractC53238e() {
                /* class com.ss.android.lark.app.initiator.DocProcessInitor.initRustDependencyP0Task.C289081 */

                /* renamed from: b */
                private boolean f72527b = C37239a.m146648b().mo136951a("lark.sdk.async_invoke_in_background");

                @Override // com.ss.android.lark.sdk.AbstractC53238e
                /* renamed from: a */
                public String mo102652a() {
                    return null;
                }

                @Override // com.ss.android.lark.sdk.AbstractC53238e
                /* renamed from: b */
                public boolean mo102654b() {
                    return false;
                }

                @Override // com.ss.android.lark.sdk.AbstractC53238e
                /* renamed from: c */
                public int mo102655c() {
                    return 1;
                }

                @Override // com.ss.android.lark.sdk.AbstractC53238e
                /* renamed from: d */
                public boolean mo102656d() {
                    return this.f72527b;
                }

                @Override // com.ss.android.lark.sdk.AbstractC53238e
                /* renamed from: a */
                public boolean mo102653a(Command command) {
                    if (command == Command.SET_DEVICE || command == Command.MAKE_USER_ONLINE || command == Command.GET_INIT_SETTINGS) {
                        return true;
                    }
                    return false;
                }
            });
            C53254m.m205921a(new AbstractC53235b() {
                /* class com.ss.android.lark.app.initiator.DocProcessInitor.initRustDependencyP0Task.C289092 */

                @Override // com.ss.android.lark.sdk.AbstractC53235b
                /* renamed from: a */
                public void mo102657a() {
                }

                @Override // com.ss.android.lark.sdk.AbstractC53235b
                /* renamed from: b */
                public void mo102658b() {
                }
            });
        }

        @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
        /* renamed from: a */
        public void mo43817a(Context context) {
            m105937g();
        }
    }

    private static class initSoTask extends AbstractLaunchTask {
        private initSoTask() {
        }

        /* renamed from: b */
        private static boolean m105946b(Context context) {
            Log.m165379d("DocProcessInitImpl", "injectFBSoLoader start");
            SoLoader.init(context, false);
            try {
                SoLoader.prependSoSource(new DirectorySoSource(C57840j.m224506b().mo196187a(context, false), 1));
                SoLoader.prependSoSource(new DirectorySoSource(C57840j.m224506b().mo196187a(context, true), 1));
                Log.m165379d("DocProcessInitImpl", "injectFBSoLoader end");
                return true;
            } catch (Exception e) {
                Log.m165384e("DocProcessInitImpl", "inject fb SoLoader failed", e);
                return false;
            }
        }

        @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
        /* renamed from: a */
        public void mo43817a(Context context) {
            OpenSSLEnvUtil.f72905b.mo103200a();
            C57840j.m224506b().mo196191c("doc");
            if (!((IPassportApi) ApiUtils.getApi(IPassportApi.class)).isUsPackage() && C57840j.m224507c()) {
                m105946b(context);
            }
        }
    }

    private static class initWebAppP0Task extends AbstractLaunchTask {
        private initWebAppP0Task() {
        }

        @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
        /* renamed from: a */
        public void mo43817a(Context context) {
            ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).initWebAppP0(context);
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        f72522b = arrayList;
        arrayList.add("gnustl_shared");
        f72522b.add("glog");
        f72522b.add("glog_init");
        f72522b.add("privatedata");
        f72522b.add("folly_json");
        f72522b.add("fbrn");
        f72522b.add("reactnativejni");
        f72522b.add("jsc");
        f72522b.add("icu_common");
    }

    @Override // com.ss.android.lark.app.initiator.C28912b, com.ss.android.lark.app.initiator.AbstractC28915e
    /* renamed from: b */
    public void mo102527b(Context context) {
        super.mo102527b(context);
        C51880f.m201207a(context);
        C36136a.m142087b(context);
    }

    @Override // com.ss.android.lark.app.initiator.C28912b, com.ss.android.lark.app.initiator.AbstractC28915e
    /* renamed from: a */
    public void mo102526a(Context context) {
        this.f72532a.mo102769a(new DocSpPreloadTask()).mo102770a(context);
        super.mo102526a(context);
        this.f72532a.mo102769a(new InitScreenshotsTask()).mo102770a(context);
    }

    @Override // com.ss.android.lark.app.initiator.C28912b, com.ss.android.lark.app.initiator.AbstractC28915e
    /* renamed from: c */
    public void mo102528c(Context context) {
        super.mo102528c(context);
        this.f72532a.mo102769a(new initBrowserLogicTask()).mo102769a(new initSoTask()).mo102769a(new initPreloadDynamicConfigTask()).mo102769a(new initPreLoadSettingV1FromLocalTask()).mo102769a(new initImageModuleProviderTask()).mo102769a(new initRustDependencyP0Task()).mo102769a(new InitRustP0Task()).mo102769a(new initDocLogicTask().mo92544a(initRustDependencyP0Task.class)).mo102769a(new initWebAppP0Task()).mo102769a(new InitHotfixModuleTask()).mo102769a(new InitTroubleKillerTask()).mo102769a(new UpdateUserAgentTask()).mo102769a(new InitOkHttpTask()).mo102769a(new InitMonitorTask()).mo102769a(new InitCacheCleanTask()).mo102769a(new InitMagicTeaTask()).mo102769a(new StartRaphaelTask()).mo102769a(new InitGuideTask()).mo102769a(new initVPNSDKTask()).mo102769a(new InitP0UIComponentTask());
        ILaunchTask initOPMonitorTask = ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).getInitOPMonitorTask();
        if (initOPMonitorTask != null) {
            this.f72532a.mo102769a(initOPMonitorTask);
        }
        if (SafeModeManager.f62333a.mo88864a() != SafeModeConstants.SafeModeLevel.NONE) {
            this.f72532a.mo102769a(new InitSafeModeTask().mo92544a(InitHotfixModuleTask.class));
        }
        this.f72532a.mo102770a(context);
        this.f72532a.mo102769a(new GadgetJatoTask()).mo102770a(context);
        boolean a = C37239a.m146648b().mo136951a("lark.android.double.thread.doc");
        Log.m165389i("DocProcessInitImpl", "lark.android.double.thread.doc:" + a);
        if (a) {
            this.f72532a.mo102769a(new DoubleThreadQuickenInit()).mo102770a(context);
        }
    }
}
