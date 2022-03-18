package com.tt.miniapp.falcon.runtime;

import android.app.Activity;
import android.app.Application;
import android.text.TextUtils;
import com.bytedance.ee.falcon.inspector.C12642a;
import com.bytedance.ee.falcon.inspector.C12644b;
import com.bytedance.ee.falcon.inspector.protocol.module.Network;
import com.bytedance.ee.falcon.loader.LoadScriptModule;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.bytedance.ee.lark.infra.network.larkbrand.net.C12837a;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.he.loader.LoadScriptSample;
import com.lark.falcon.engine.bridge.JavaOnlyMap;
import com.lark.falcon.engine.holder.AndroidFalconShellHolder;
import com.lark.falcon.engine.holder.AndroidShellHolderDelegate;
import com.lark.falcon.engine.holder.C23974a;
import com.lark.falcon.engine.inspect.InspectorClient;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.larksuite.suite.R;
import com.ss.android.lark.optrace.p2413c.C48936b;
import com.ss.android.lark.p2069j.p2070a.C40640g;
import com.tt.frontendapiinterface.IJsBridge;
import com.tt.miniapp.AbstractC66259k;
import com.tt.miniapp.AbstractC66328m;
import com.tt.miniapp.AppConfig;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.AppbrandConstant;
import com.tt.miniapp.errorcode.ErrorCode;
import com.tt.miniapp.falcon.jsfunction.LoadScriptFunction;
import com.tt.miniapp.falcon.jsmodule.TMAConfig;
import com.tt.miniapp.falcon.module.BridgeModule;
import com.tt.miniapp.falcon.p3286b.C66057c;
import com.tt.miniapp.falcon.p3287c.C66062a;
import com.tt.miniapp.falcon.snapshot.C66076d;
import com.tt.miniapp.falcon.snapshot.C66080g;
import com.tt.miniapp.falcon.snapshot.SnapshotType;
import com.tt.miniapp.jsbridge.C66237b;
import com.tt.miniapp.launchschedule.LaunchScheduler;
import com.tt.miniapp.net.p3310c.C66513a;
import com.tt.miniapp.process.p3316a.C66612a;
import com.tt.miniapp.streamloader.C66876b;
import com.tt.miniapp.util.TimeLogger;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.miniapphost.util.C67586c;
import com.tt.miniapphost.util.DebugUtil;
import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import javax.annotation.Nullable;

/* renamed from: com.tt.miniapp.falcon.runtime.a */
public class C66067a extends AbstractC66259k {

    /* renamed from: a */
    public final AndroidFalconShellHolder f166774a;

    /* renamed from: b */
    private final C66062a f166775b;

    /* renamed from: c */
    private C66080g f166776c;

    /* renamed from: d */
    private C66057c f166777d;
    @Nullable

    /* renamed from: e */
    private final C66076d f166778e;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo231203d() {
        return "-Normal";
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.AbstractC66259k
    public String getJsCoreFileName() {
        return "tma-core.js";
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.AbstractC66259k
    public void setLoadScriptSampleCallback(LoadScriptSample.Callback callback) {
    }

    @Nullable
    /* renamed from: b */
    public C66076d mo231201b() {
        return this.f166778e;
    }

    @Override // com.tt.miniapp.falcon.runtime.IJsRuntime
    public IJsBridge getJsBridge() {
        return this.f166777d;
    }

    /* renamed from: i */
    private void m258726i() {
        this.f166774a.mo86093d();
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m258728k() {
        this.f166774a.mo86096g();
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m258730m() {
        this.f166776c.mo231233d();
    }

    /* renamed from: a */
    public AndroidFalconShellHolder mo231200a() {
        return this.f166774a;
    }

    @Override // com.tt.miniapp.falcon.runtime.IJsRuntime
    public long getRuntimePointer() {
        return this.f166774a.mo86088b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public JavaOnlyMap mo231208h() {
        return this.f166775b.mo231164a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo231204e() {
        ((LoadScriptFunction) this.f166774a.mo86089b(LoadScriptFunction.class)).loadScript("app-service.js");
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m258729l() {
        AppBrandLogger.m52828d("FalconJsRuntime", "onFirstRenderReady:");
        this.f166774a.mo86090b(new Runnable() {
            /* class com.tt.miniapp.falcon.runtime.$$Lambda$a$pZpGWPOmzPBsQQ3yPwQoPIZ5bZY */

            public final void run() {
                C66067a.this.m258730m();
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void m258731n() {
        updateLoadJsCoreBegin();
        reportLoadJsCoreBegin();
        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        File file = new File(AppbrandConstant.getJsBundleDir(applicationContext, this.appContext), getJsCoreFileName());
        this.f166774a.mo86087a(IOUtils.readString(file.getAbsolutePath(), "utf-8"), file.getName());
        reportLoadJsCoreEnd();
        updateLoadJsCoreEnd();
    }

    @Override // com.tt.miniapp.falcon.runtime.IJsRuntime
    public void release() {
        if (C25529d.m91169j(this.appContext)) {
            AppBrandLogger.m52830i("FalconJsRuntime", "can not destroy");
            return;
        }
        C66076d dVar = this.f166778e;
        if (dVar == null || !dVar.mo231230b()) {
            this.f166774a.mo86083a(new Runnable() {
                /* class com.tt.miniapp.falcon.runtime.$$Lambda$a$lJXuNX1ebldUtuSF4qkXpghBCIs */

                public final void run() {
                    C66067a.this.m258728k();
                }
            });
            return;
        }
        AppBrandLogger.m52829e("FalconJsRuntime", "JsRuntime is profiling");
    }

    /* renamed from: j */
    private void m258727j() {
        this.f166774a.mo86080a(mo231208h());
        C66237b bVar = new C66237b();
        this.f166774a.mo86091c().registerModule(new BridgeModule(this.appContext, bVar));
        this.f166774a.mo86091c().registerModule(new LoadScriptModule(new C66876b(this.appContext)));
        this.f166777d = new C66057c(this.appContext, this.f166774a, bVar);
        m258726i();
        setupLoader();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo231205f() {
        AppInfoEntity appInfo = C67432a.m262319a(this.appContext).getAppInfo();
        String str = appInfo.appId;
        String str2 = appInfo.version;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            AppBrandLogger.m52829e("FalconJsRuntime", "enableCodeCache: appId or appVersion is NULL");
            return;
        }
        String str3 = this.appContext.getApplicationContext().getExternalCacheDir() + "/jsi_code_cache/" + str + "/" + str2;
        this.f166774a.mo86086a(str3, 32768);
        ((LaunchScheduler) AppbrandApplicationImpl.getInst(this.appContext).getService(LaunchScheduler.class)).addFirstRenderReadyListener(new LaunchScheduler.AbstractC66321a(str3) {
            /* class com.tt.miniapp.falcon.runtime.$$Lambda$a$nEESRNmaJBnrm9s7VP1Hi6Jj1E */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.tt.miniapp.launchschedule.LaunchScheduler.AbstractC66321a
            public final void onFirstRenderReady() {
                C66067a.m258724a(this.f$0);
            }
        }, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo231206g() {
        AppConfig appConfig = AppbrandApplicationImpl.getInst(this.appContext).getAppConfig();
        SnapshotType snapshotType = SnapshotType.INVALID_TYPE;
        if (appConfig != null && !TextUtils.isEmpty(appConfig.mo230043d().f165527a)) {
            snapshotType = SnapshotType.getSnapshotType(appConfig.mo230043d().f165527a);
        }
        if (snapshotType == SnapshotType.INVALID_TYPE) {
            AppBrandLogger.m52829e("FalconJsRuntime", "createSnapshotIfNeed: SnapshotType INVALID");
            snapshotType = SnapshotType.KEEP_APP;
        }
        C66080g gVar = new C66080g(this.appContext, C67432a.m262319a(this.appContext).getAppInfo().version, snapshotType);
        this.f166776c = gVar;
        if (gVar.mo231232c()) {
            ((LaunchScheduler) AppbrandApplicationImpl.getInst(this.appContext).getService(LaunchScheduler.class)).addFirstRenderReadyListener(new LaunchScheduler.AbstractC66321a() {
                /* class com.tt.miniapp.falcon.runtime.$$Lambda$a$Y9xAsCbdTFXIdImxf5azn_zAE4 */

                @Override // com.tt.miniapp.launchschedule.LaunchScheduler.AbstractC66321a
                public final void onFirstRenderReady() {
                    C66067a.this.m258729l();
                }
            }, true);
        }
    }

    @Override // com.tt.miniapp.falcon.runtime.IJsRuntime
    public void postRunnable(Runnable runnable) {
        this.f166774a.mo86083a(runnable);
    }

    public C66067a(IAppContext iAppContext) {
        this(iAppContext, new AndroidFalconShellHolder(new C23974a.C23976a().mo86108b(C25529d.m91170k(iAppContext)).mo86106a(true).mo86107a()));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m258724a(String str) {
        File file = new File(str);
        if (file.exists()) {
            file.getParentFile().listFiles(new FileFilter(str) {
                /* class com.tt.miniapp.falcon.runtime.$$Lambda$a$3U05fcacoB7h1anonok2Z4Kq8c4 */
                public final /* synthetic */ String f$0;

                {
                    this.f$0 = r1;
                }

                public final boolean accept(File file) {
                    return C66067a.m258725a(this.f$0, file);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m258723a(Integer num) {
        if (num.intValue() == 1) {
            C66612a.m260227a(AppbrandApplicationImpl.getInst(this.appContext).getAppInfo().appId, AppbrandApplicationImpl.getInst(this.appContext).getSchema(), false);
        }
    }

    @Override // com.tt.miniapp.falcon.runtime.IJsRuntime
    public void loadMainJs(AbstractC66328m mVar) {
        TimeLogger.getInstance(this.appContext).logTimeDuration("JsTMARuntime_beforeLoadMainJs");
        this.f166774a.mo86083a(new Runnable(C67432a.m262319a(this.appContext).getAppInfo(), mVar) {
            /* class com.tt.miniapp.falcon.runtime.$$Lambda$a$1Tgodiij798DjyGqv5HlotdYDtY */
            public final /* synthetic */ AppInfoEntity f$1;
            public final /* synthetic */ AbstractC66328m f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C66067a.this.m258722a((C66067a) this.f$1, (AppInfoEntity) this.f$2);
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.AbstractC66259k
    public void setRootPathToNative(String str) {
        LoadScriptModule loadScriptModule = (LoadScriptModule) this.f166774a.mo86091c().getModule(LoadScriptModule.class);
        if (loadScriptModule != null) {
            this.f166774a.mo86083a(new Runnable(str) {
                /* class com.tt.miniapp.falcon.runtime.$$Lambda$a$FM4VTBZdD6P5L4q9UGZNyLWNaK8 */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    LoadScriptModule.this.nativeSwitchNativeReader(this.f$1);
                }
            });
        } else {
            C48936b.m192783a("load script not register");
        }
    }

    @Override // com.tt.miniapp.falcon.runtime.IJsRuntime
    public void postRunnable(Runnable runnable, boolean z) {
        if (z) {
            this.f166774a.mo86092c(runnable);
        } else {
            postRunnable(runnable);
        }
    }

    @Override // com.tt.miniapp.falcon.runtime.IJsRuntime
    public void loadSubPackageMainJs(final AbstractC66328m mVar, final String str) {
        TimeLogger.getInstance(this.appContext).logTimeDuration("JsTMARuntime_beforeLoadMainJs");
        this.f166774a.mo86083a(new Runnable() {
            /* class com.tt.miniapp.falcon.runtime.C66067a.RunnableC660681 */

            public void run() {
                TimeLogger.getInstance(C66067a.this.appContext).logTimeDuration("JsTMARuntime_runInJsThread2LoadMainJs");
                try {
                    AbstractC66328m mVar = mVar;
                    if (mVar != null) {
                        mVar.mo87263a();
                    }
                    ((LoadScriptFunction) C66067a.this.f166774a.mo86089b(LoadScriptFunction.class)).loadScript(str + "/app-service.js");
                    AbstractC66328m mVar2 = mVar;
                    if (mVar2 != null) {
                        mVar2.mo87265b();
                    }
                } catch (Exception e) {
                    AppBrandLogger.m52829e("FalconJsRuntime", e);
                    AbstractC66328m mVar3 = mVar;
                    if (mVar3 != null) {
                        mVar3.mo87264a(e);
                    }
                    Activity currentActivity = C66067a.this.appContext.getCurrentActivity();
                    if (currentActivity != null && (C66067a.this.appContext instanceof AbstractC67433a) && !C66067a.this.appContext.isEmbedContainer()) {
                        HostDependManager.getInst().showModal(currentActivity, null, currentActivity.getString(R.string.OpenPlatform_GadgetErr_AppErrorTtl), currentActivity.getString(R.string.OpenPlatform_GadgetErr_AppErrToast), true, currentActivity.getString(R.string.microapp_m_map_dialog_cancel), "", currentActivity.getString(R.string.OpenPlatform_GadgetErr_RetryBttn), "", new AbstractC67550j.AbstractC67551a<Integer>() {
                            /* class com.tt.miniapp.falcon.runtime.C66067a.RunnableC660681.C660691 */

                            /* renamed from: a */
                            public void onNativeModuleCall(Integer num) {
                                if (num.intValue() == 1) {
                                    C66612a.m260227a(AppbrandApplicationImpl.getInst(C66067a.this.appContext).getAppInfo().appId, AppbrandApplicationImpl.getInst(C66067a.this.appContext).getSchema(), false);
                                }
                            }
                        }, currentActivity);
                    }
                }
            }
        });
    }

    protected C66067a(IAppContext iAppContext, AndroidFalconShellHolder androidFalconShellHolder) {
        super(iAppContext);
        this.f166774a = androidFalconShellHolder;
        androidFalconShellHolder.mo86081a(new AndroidShellHolderDelegate() {
            /* class com.tt.miniapp.falcon.runtime.$$Lambda$a$032muOVD_qYK4MTfEhOtUBlxLFA */

            @Override // com.lark.falcon.engine.holder.AndroidShellHolderDelegate
            public final void onError(int i, String str) {
                C66067a.m258721a(IAppContext.this, i, str);
            }
        });
        InspectorClient a = androidFalconShellHolder.mo86076a();
        if (a != null) {
            C66076d dVar = new C66076d();
            this.f166778e = dVar;
            a.mo86112a(dVar);
            C12642a aVar = new C12642a();
            aVar.mo48001a(Arrays.asList(new Network(iAppContext.getApplicationContext())));
            a.mo86112a(aVar);
            C12837a.m53022a(Arrays.asList(new C12644b(), new C66513a()));
        } else {
            this.f166778e = null;
        }
        this.f166775b = new C66062a(iAppContext);
        m258727j();
        androidFalconShellHolder.mo86083a(new Runnable() {
            /* class com.tt.miniapp.falcon.runtime.$$Lambda$a$TycMR4Aeb62yZrG0Ayj5hjO9r5s */

            public final void run() {
                C66067a.this.m258731n();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m258722a(AppInfoEntity appInfoEntity, AbstractC66328m mVar) {
        InspectorClient a = this.f166774a.mo86076a();
        if (a != null) {
            a.mo86113a(appInfoEntity.appName + mo231203d());
        }
        if (!appInfoEntity.isPreview()) {
            mo231205f();
        }
        this.f166774a.mo86080a(this.f166775b.mo231165b());
        try {
            ((TMAConfig) this.f166774a.mo86077a(TMAConfig.class)).ready();
        } catch (Exception e) {
            DebugUtil.outputError("FalconJsRuntime", "get TMAConfig JsObject fail", e);
            showLoadError(ErrorCode.JSCORE.TMA_CONFIG_EXECUTE_ERROR.getCode());
        }
        if (mVar != null) {
            try {
                mVar.mo87263a();
            } catch (Exception e2) {
                AppBrandLogger.m52829e("FalconJsRuntime", e2);
                if (mVar != null) {
                    mVar.mo87264a(e2);
                }
                Activity currentActivity = this.appContext.getCurrentActivity();
                if (currentActivity != null && (this.appContext instanceof AbstractC67433a) && !this.appContext.isEmbedContainer()) {
                    HostDependManager.getInst().showModal(currentActivity, null, currentActivity.getString(R.string.OpenPlatform_GadgetErr_AppErrorTtl), currentActivity.getString(R.string.OpenPlatform_GadgetErr_AppErrToast), true, currentActivity.getString(R.string.microapp_m_map_dialog_cancel), "", currentActivity.getString(R.string.OpenPlatform_GadgetErr_RetryBttn), "", new AbstractC67550j.AbstractC67551a() {
                        /* class com.tt.miniapp.falcon.runtime.$$Lambda$a$XCUd66FygHEZNcQQQyvlrmLRXw */

                        @Override // com.tt.miniapphost.AbstractC67550j.AbstractC67551a
                        public final void onNativeModuleCall(Object obj) {
                            C66067a.this.m258723a((C66067a) ((Integer) obj));
                        }
                    }, currentActivity);
                    return;
                }
                return;
            }
        }
        mo231204e();
        if (mVar != null) {
            mVar.mo87265b();
        }
        mo231206g();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ boolean m258725a(String str, File file) {
        if (!file.getAbsolutePath().equals(str)) {
            AppBrandLogger.m52831w("FalconJsRuntime", "enableCodeCache: delete old version code cache ");
            C67586c.m263051b(file);
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m258721a(IAppContext iAppContext, int i, String str) {
        AppBrandLogger.m52829e("FalconJsRuntime", "JSEngine app_id:" + iAppContext.getAppId() + " errorCode:" + i + " msg:" + str);
        new C67500a(C40640g.f103078d, iAppContext).addCategoryValue("code", Integer.valueOf(i)).addCategoryValue("msg", str).flush();
    }
}
