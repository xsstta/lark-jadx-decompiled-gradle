package com.tt.miniapphost;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.ee.lark.infra.config.mina.v2.C12745c;
import com.bytedance.ee.lark.infra.cookie.p620e.C12765b;
import com.bytedance.ee.lark.infra.cookie.p620e.C12768c;
import com.bytedance.ee.lark.infra.foundation.dependency.DependencyMgr;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.larkbrand.net.p634a.C12841a;
import com.bytedance.ee.lark.infra.network.ref.p635a.C12859i;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.storage.AbstractC12889a;
import com.bytedance.ee.lark.infra.storage.p640c.C12899a;
import com.bytedance.ee.webapp.config.C13778e;
import com.bytedance.ee.webapp.config.WebappAuthSettingHandler;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.larksuite.component.openplatform.core.mina.AdapterApiSettingHandler;
import com.larksuite.component.openplatform.infra.p1140c.p1141a.C25534a;
import com.larksuite.component.openplatform.infra.p1140c.p1141a.C25536b;
import com.larksuite.component.openplatform.infra.p1140c.p1141a.C25538c;
import com.ss.android.lark.littleapp.C41392m;
import com.ss.android.lark.littleapp.tempinfra.dependency.CommonDependencyImpl;
import com.ss.android.lark.littleapp.tempinfra.dependency.NetworkDependencyImpl;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.ss.android.lark.opmonitor.trace.OPTraceService;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.C65716a;
import com.tt.miniapp.jsbridge.C66238c;
import com.tt.miniapp.manager.appinfo.C66409a;
import com.tt.miniapp.permission.C66581d;
import com.tt.miniapp.settings.v2.C66751b;
import com.tt.miniapp.settings.v2.handler.C66755a;
import com.tt.miniapp.settings.v2.handler.C66757aa;
import com.tt.miniapp.settings.v2.handler.C66759ab;
import com.tt.miniapp.settings.v2.handler.C66761ac;
import com.tt.miniapp.settings.v2.handler.C66763b;
import com.tt.miniapp.settings.v2.handler.C66765c;
import com.tt.miniapp.settings.v2.handler.C66767d;
import com.tt.miniapp.settings.v2.handler.C66769e;
import com.tt.miniapp.settings.v2.handler.C66771f;
import com.tt.miniapp.settings.v2.handler.C66773g;
import com.tt.miniapp.settings.v2.handler.C66775h;
import com.tt.miniapp.settings.v2.handler.C66777i;
import com.tt.miniapp.settings.v2.handler.C66780j;
import com.tt.miniapp.settings.v2.handler.C66782k;
import com.tt.miniapp.settings.v2.handler.C66784l;
import com.tt.miniapp.settings.v2.handler.C66786m;
import com.tt.miniapp.settings.v2.handler.C66788n;
import com.tt.miniapp.settings.v2.handler.C66790o;
import com.tt.miniapp.settings.v2.handler.C66792p;
import com.tt.miniapp.settings.v2.handler.C66794q;
import com.tt.miniapp.settings.v2.handler.C66796r;
import com.tt.miniapp.settings.v2.handler.C66798s;
import com.tt.miniapp.settings.v2.handler.C66800t;
import com.tt.miniapp.settings.v2.handler.C66802u;
import com.tt.miniapp.settings.v2.handler.C66804v;
import com.tt.miniapp.settings.v2.handler.C66806w;
import com.tt.miniapp.settings.v2.handler.C66808x;
import com.tt.miniapp.settings.v2.handler.C66810y;
import com.tt.miniapp.settings.v2.handler.C66812z;
import com.tt.miniapp.settings.v2.handler.FlutterRenderAppSupportSettingHandler;
import com.tt.miniapp.settings.v2.handler.FlutterRenderGlobalSupportSettingHandler;
import com.tt.miniapp.settings.v2.handler.GadgetRuntimeConfigSettingHandler;
import com.tt.miniapphost.data.C67489c;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.miniapphost.entity.C67531h;
import com.tt.miniapphost.entity.C67536j;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3371e.C67509b;
import com.tt.miniapphost.process.p3378d.AbstractC67570a;
import com.tt.miniapphost.process.p3378d.AbstractC67571b;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.miniapphost.util.MiniAppProcessUtils;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.option.ext.AbstractC67622h;
import com.tt.option.ext.AbstractC67626k;
import com.tt.option.p3390k.AbstractC67648c;
import com.tt.refer.impl.business.file.TTFileHelper;
import com.tt.refer.p3400a.p3408f.p3409a.AbstractC67728b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public class AppbrandContext {
    private C67536j configEntity = new C67536j(3420001, "3.42.0.1.lark", "null", "");
    private C67531h initParams;
    private AbstractC67622h.AbstractC67623a mApiHandlerCreator;
    private Application mApplicationContext;
    private Map<String, AbstractC67570a> mAsyncHandlerMap = new HashMap();
    private Map<String, AbstractC67728b> mAsyncHandlerMapV2 = new HashMap();
    private Activity mMiniAppActivity;
    private AbstractC67626k.AbstractC67627a mNativeViewCreator;
    private long mProcessStartTime;
    private Map<String, AbstractC67571b> mSyncHandlerMap = new HashMap();
    private List<AbstractC67648c> mTitleMenuItem;
    private String mTraceId;
    private final String sUniqueId = (UUID.randomUUID().toString().substring(0, 6) + System.currentTimeMillis());
    private OPTrace tracing;

    public static HandlerThread new_android_os_HandlerThread_by_knot(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    public boolean isGame() {
        return false;
    }

    public void setGame(boolean z) {
    }

    public Application getApplicationContext() {
        return this.mApplicationContext;
    }

    public C67536j getBuildConfig() {
        return this.configEntity;
    }

    public AbstractC67622h.AbstractC67623a getExtensionApiCreator() {
        return this.mApiHandlerCreator;
    }

    public AbstractC67626k.AbstractC67627a getNativeViewCreator() {
        return this.mNativeViewCreator;
    }

    public long getProcessStartTime() {
        return this.mProcessStartTime;
    }

    public List<AbstractC67648c> getTitleMenuItems() {
        return this.mTitleMenuItem;
    }

    public String getUniqueId() {
        return this.sUniqueId;
    }

    public static Handler getMainHandler() {
        return ContextSingletonInstance.getInstance().mainHandler;
    }

    public boolean isInitParamsReady() {
        if (this.initParams != null) {
            return true;
        }
        return false;
    }

    public static AppbrandContext getInst() {
        return ContextSingletonInstance.getInstance().getAppbrandContext();
    }

    public String getTraceId() {
        if (TextUtils.isEmpty(this.mTraceId)) {
            initTracing();
        }
        return this.mTraceId;
    }

    public OPTrace getTracing() {
        if (this.tracing == null) {
            initTracing();
        }
        return this.tracing;
    }

    private void initTracing() {
        if (this.tracing == null) {
            this.tracing = OPTraceService.m192757a();
        }
        String str = this.mTraceId;
        if (str == null || str.isEmpty()) {
            this.mTraceId = this.tracing.getTracingID();
        }
    }

    public C67531h getInitParams() {
        if (this.initParams == null) {
            AppBrandLogger.m52829e("AppbrandContext", "no init params");
            tryInitAgain(this.mApplicationContext);
        }
        return this.initParams;
    }

    public boolean checkProcessCommunicationPermission() {
        Application application = this.mApplicationContext;
        if (application == null) {
            return false;
        }
        if (application.checkCallingOrSelfPermission(this.mApplicationContext.getPackageName() + ".miniapp.PROCESS_COMMUNICATION") == 0) {
            return true;
        }
        return false;
    }

    public String getProcessCommunicationPermission() {
        if (this.mApplicationContext == null || !checkProcessCommunicationPermission()) {
            return null;
        }
        return this.mApplicationContext.getPackageName() + ".miniapp.PROCESS_COMMUNICATION";
    }

    private void tryInitAgain(Context context) {
        MiniAppProcessUtils.killCurrentProcess(context);
    }

    public void setExtensionApiCreator(AbstractC67622h.AbstractC67623a aVar) {
        this.mApiHandlerCreator = aVar;
    }

    public void setInitParams(C67531h hVar) {
        this.initParams = hVar;
    }

    public void setNativeViewCreator(AbstractC67626k.AbstractC67627a aVar) {
        this.mNativeViewCreator = aVar;
    }

    public void setTitleMenuItems(List<AbstractC67648c> list) {
        this.mTitleMenuItem = list;
    }

    public void setApplicationContext(Application application) {
        if (application != null) {
            this.mApplicationContext = application;
        }
    }

    private static void addPermissionCleanTask(final Application application) {
        ContextSingletonInstance.getInstance().getStorageManager().mo48645a(new AbstractC12889a.AbstractC12890a() {
            /* class com.tt.miniapphost.AppbrandContext.C674194 */

            @Override // com.bytedance.ee.lark.infra.storage.AbstractC12889a.AbstractC12890a
            /* renamed from: a */
            public void mo48647a(String str) {
                Application application = application;
                C12899a.m53203a(application, C66581d.m260138a() + str).edit().clear().commit();
            }
        });
    }

    public static void startFetchSetting(AbstractC67433a aVar) {
        C12745c.m52737a().mo48253a(C66751b.m260570a());
        C67467b.m262425b().mo234215a(getInst().getApplicationContext(), aVar);
    }

    public AbstractC67570a getAsyncHandler(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.mAsyncHandlerMap.get(str);
        }
        AppBrandLogger.m52829e("AppbrandContext", " call type is null ");
        return null;
    }

    public AbstractC67728b getAsyncHandlerV2(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.mAsyncHandlerMapV2.get(str);
        }
        AppBrandLogger.m52829e("AppbrandContext", " call type is null ");
        return null;
    }

    public AbstractC67571b getSyncHandler(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.mSyncHandlerMap.get(str);
    }

    public boolean isDataHandlerExist(String str) {
        if (this.mSyncHandlerMap.containsKey(str) || this.mAsyncHandlerMap.containsKey(str)) {
            return true;
        }
        return false;
    }

    public void onCreate(IAppContext iAppContext) {
        if (this.mApplicationContext != null || !DebugUtil.debug()) {
            C67432a.m262319a(iAppContext).onCreate();
            return;
        }
        throw new IllegalStateException("should call setApplicationContext first");
    }

    public void updateHostInjectResources(IAppContext iAppContext) {
        getInst().setTitleMenuItems(HostDependManager.getInst().createTitleMenuItems(iAppContext));
        AbstractC67626k.AbstractC67627a createNativeView = HostDependManager.getInst().createNativeView();
        if (createNativeView != null) {
            getInst().setNativeViewCreator(createNativeView);
        }
    }

    public static void tryKillIfNotInit(Context context) {
        if (!ProcessUtil.isMiniappProcess()) {
            AppBrandLogger.m52830i("AppbrandContext", "Only can kill self on MINI_APP_PROCESS");
            return;
        }
        C67489c a = C67489c.m262538a();
        if (!a.mo234314e()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("context", context.toString());
                jSONObject.put("support init", a.mo234314e());
                jSONObject.put("context init", a.mo234314e());
                jSONObject.put("ProcessName", ProcessUtil.getCurProcessName(context));
                C67509b.m262587a("mp_init_error", 1007, jSONObject, C65716a.f165588a);
            } catch (JSONException e) {
                AppBrandLogger.m52829e("AppbrandContext", e);
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e2) {
                AppBrandLogger.m52829e("AppbrandContext", e2);
            }
            Process.killProcess(Process.myPid());
            System.exit(0);
        }
    }

    private static void initSettingHandler(Context context) {
        C12745c a = C12745c.m52737a();
        a.mo48252a(C66804v.m260682a());
        a.mo48252a(C66796r.m260667a());
        a.mo48252a(C12768c.m52791a());
        a.mo48252a(C66802u.m260678a());
        a.mo48252a(C66773g.m260618a());
        a.mo48252a(C66761ac.m260594a());
        a.mo48252a(C66755a.m260582a());
        a.mo48252a(C66788n.m260652a());
        a.mo48252a(C66794q.m260664a());
        a.mo48252a(C66808x.m260690a());
        a.mo48252a(C66765c.m260602a());
        a.mo48252a(C66759ab.m260590a());
        a.mo48252a(C66769e.m260610a());
        a.mo48252a(C66767d.m260606a());
        a.mo48252a(C66806w.m260686a());
        a.mo48252a(C66786m.m260648a(context));
        a.mo48252a(C66775h.m260622a());
        a.mo48252a(C66790o.m260656a(context));
        a.mo48252a(C66812z.m260698a(context));
        a.mo48252a(AdapterApiSettingHandler.m89609a());
        a.mo48252a(C66810y.m260694a());
        a.mo48252a(C66800t.m260674a());
        a.mo48252a(C12765b.m52782a());
        a.mo48252a(C66771f.m260614a());
        a.mo48252a(C66777i.m260625a());
        a.mo48252a(C66757aa.m260586a());
        a.mo48252a(C66782k.m260640a());
        a.mo48252a(C25538c.m91188a());
        a.mo48252a(C66784l.m260644a());
        a.mo48252a(C13778e.m55825a());
        a.mo48252a(C41392m.m164164b());
        a.mo48252a(C66238c.m259236a());
        a.mo48252a(C25536b.m91184a());
        a.mo48252a(C25534a.m91180a());
        a.mo48252a(C66792p.m260660a(context));
        a.mo48252a(C66798s.m260670a());
        a.mo48252a(C66780j.m260633a());
        a.mo48252a(TTFileHelper.TTFileSettingsHandler.f171067a);
        a.mo48252a(C66763b.m260598a());
        a.mo48252a(C12841a.m53030a());
        a.mo48252a(FlutterRenderAppSupportSettingHandler.get());
        a.mo48252a(FlutterRenderGlobalSupportSettingHandler.get());
        a.mo48252a(WebappAuthSettingHandler.f36021b.mo50808b());
        a.mo48252a(GadgetRuntimeConfigSettingHandler.m260575a());
        a.mo48252a(TTFileHelper.TTFileCryptoConfigHandler.f171066a);
    }

    public static void preloadInMainProcess(Context context, IAppContext iAppContext) {
        C66409a.m259644a(context, iAppContext);
    }

    private void initHostProcessDataHandler(List<AbstractC67571b> list, List<AbstractC67570a> list2, List<AbstractC67728b> list3) {
        if (list != null) {
            for (AbstractC67571b bVar : list) {
                if (bVar != null) {
                    this.mSyncHandlerMap.put(bVar.mo49139a(), bVar);
                }
            }
        }
        if (list2 != null) {
            for (AbstractC67570a aVar : list2) {
                if (aVar != null) {
                    this.mAsyncHandlerMap.put(aVar.mo49145a(), aVar);
                }
            }
        }
        if (list3 != null) {
            for (AbstractC67728b bVar2 : list3) {
                if (bVar2 != null) {
                    this.mAsyncHandlerMapV2.put(bVar2.mo49147a(), bVar2);
                }
            }
        }
    }

    public static void init(Application application, IAppbrandInitializer iAppbrandInitializer, long j, AbstractC67433a aVar) {
        AppBrandLogger.m52830i("AppbrandContext", "preload, init enter");
        if (application != null) {
            getInst().setApplicationContext(application);
            DebugUtil.updateDebugState(application, iAppbrandInitializer);
            String curProcessName = ProcessUtil.getCurProcessName(application);
            boolean isMainProcess = ProcessUtil.isMainProcess(application);
            boolean isMiniAppProcess = MiniAppProcessUtils.isMiniAppProcess(application);
            AppBrandLogger.registerLogger(HostDependManager.getInst().createLogger());
            getInst().initHostProcessDataHandler(HostDependManager.getInst().createSyncHostDataHandlerList(), HostDependManager.getInst().createAsyncHostDataHandlerList(), HostDependManager.getInst().createAsyncHostDataHandlerV2List());
            DependencyMgr.m52810a(new CommonDependencyImpl(application), new NetworkDependencyImpl());
            C12859i.m53077a();
            if (!isMainProcess && !isMiniAppProcess) {
                AppBrandLogger.m52828d("AppbrandContext", "!isMainProcess && !isMiniAppProcess");
            } else if (Build.VERSION.SDK_INT < 21) {
                AppBrandLogger.m52829e("AppbrandContext", "init, sdk version low: " + Build.VERSION.SDK_INT);
            } else {
                try {
                    initSync(application, curProcessName, isMainProcess, iAppbrandInitializer, j, aVar);
                } catch (Throwable th) {
                    AppBrandLogger.m52829e("AppbrandContext", "", th);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, Log.getStackTraceString(th));
                        jSONObject.put("mhasinit", C67489c.m262538a().mo234314e());
                        jSONObject.put("isMainProcess", isMainProcess);
                        C67509b.m262587a("mp_init_error", 1005, jSONObject, aVar);
                    } catch (JSONException e) {
                        AppBrandLogger.m52829e("AppbrandContext", e);
                    }
                    MiniAppProcessUtils.killCurrentProcess(application);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0048, code lost:
        if (com.tt.miniapphost.data.C67489c.m262538a().mo234312c() != false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void initSync(final android.app.Application r13, java.lang.String r14, final boolean r15, com.tt.miniapphost.IAppbrandInitializer r16, long r17, final com.tt.miniapphost.p3362a.p3363a.AbstractC67433a r19) {
        /*
        // Method dump skipped, instructions count: 428
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapphost.AppbrandContext.initSync(android.app.Application, java.lang.String, boolean, com.tt.miniapphost.IAppbrandInitializer, long, com.tt.miniapphost.a.a.a):void");
    }
}
