package com.tt.miniapp.jsbridge;

import android.app.Activity;
import android.content.ContextWrapper;
import android.os.Handler;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkoryx.OryxManagerProxy;
import com.google.firebase.messaging.Constants;
import com.he.JsRunLoop;
import com.he.jsbinding.JsContext;
import com.he.jsbinding.JsEngine;
import com.he.jsbinding.JsObject;
import com.he.jsbinding.JsScopedContext;
import com.he.jsbinding.snapshot.ISnapshotService;
import com.he.jsbinding.snapshot.SnapshotServiceImpl;
import com.he.v8_inspect.Inspect;
import com.he.v8_inspect.InspectorHelper;
import com.larksuite.component.openplatform.core.loader.jsbundle.C24512a;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.larksuite.component.openplatform.infra.p1140c.p1141a.C25538c;
import com.larksuite.suite.R;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.AbstractC66328m;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.BridgeUniteHelper;
import com.tt.miniapp.GadgetErrorRecoveryManager;
import com.tt.miniapp.JsRuntime;
import com.tt.miniapp.debug.C65983a;
import com.tt.miniapp.debug.VConsoleManager;
import com.tt.miniapp.errorcode.ErrorCode;
import com.tt.miniapp.errorcode.ErrorType;
import com.tt.miniapp.event.C66036d;
import com.tt.miniapp.falcon.p3285a.AbstractC66046a;
import com.tt.miniapp.falcon.p3285a.AbstractC66047b;
import com.tt.miniapp.process.p3316a.C66612a;
import com.tt.miniapp.util.TimeLogger;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.miniapphost.util.MiniAppProcessUtils;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.refer.p3400a.p3401a.AbstractC67699a;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.jsbridge.f */
public class C66244f extends JsRuntime {

    /* renamed from: a */
    private ContextWrapper f167196a;

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.AbstractC66259k
    public String getJsCoreFileName() {
        return "tma-core.js";
    }

    @Override // com.tt.miniapp.JsRuntime, com.he.JsRunLoop.SetupCallback
    public void cleanup() {
        this.mLoader.cleanupV2();
    }

    /* renamed from: a */
    private void m259246a() {
        if (C25529d.m91170k(this.appContext)) {
            InspectorHelper.setDebugEnable(true);
            m259249a(C65983a.m258415a().f166553c);
        }
    }

    @Override // com.tt.miniapp.falcon.runtime.IJsRuntime
    public void loadMainJs(final AbstractC66328m mVar) {
        TimeLogger.getInstance(this.appContext).logTimeDuration("JsTMARuntime_beforeLoadMainJs");
        final ISnapshotService iSnapshotService = (ISnapshotService) AppbrandApplicationImpl.getInst(this.appContext).getService(SnapshotServiceImpl.class);
        final AppInfoEntity appInfo = C67432a.m262319a(this.appContext).getAppInfo();
        if (!iSnapshotService.enableSnapshot(appInfo.version, appInfo.isPreview()) || !iSnapshotService.checkSnapshotExist(appInfo.version)) {
            executeInJsThread(new JsContext.ScopeCallback() {
                /* class com.tt.miniapp.jsbridge.C66244f.C662451 */

                @Override // com.he.jsbinding.JsContext.ScopeCallback
                public void run(JsScopedContext jsScopedContext) {
                    if (iSnapshotService.needCreateStandardSnapshot(appInfo.version, appInfo.isPreview())) {
                        JsEngine.createLoadedScriptsCache(C66244f.this.mJsThread.getJsContext().vm);
                    }
                    TimeLogger.getInstance(C66244f.this.appContext).logTimeDuration("JsTMARuntime_runInJsThread2LoadMainJs");
                    Inspect.get(C66244f.this.appContext).updateLaunchMode("Normal");
                    JsObject createObject = jsScopedContext.createObject();
                    createObject.set("debug", ((VConsoleManager) AppbrandApplicationImpl.getInst(C66244f.this.appContext).getService(VConsoleManager.class)).isVConsoleSwitchOn());
                    createObject.set("platform", "android");
                    jsScopedContext.global().set("nativeTMAConfig", (AbstractC66047b) createObject);
                    OPTrace tracing = AppbrandContext.getInst().getTracing();
                    if (tracing != null) {
                        JsObject createObject2 = jsScopedContext.createObject();
                        createObject2.set("traceId", tracing.getTracingID());
                        createObject2.set("createTime", (double) tracing.createTime());
                        createObject2.set("extensions", (AbstractC66046a) jsScopedContext.createArray(0));
                        JsObject createObject3 = jsScopedContext.createObject();
                        createObject3.set("optrace_batch_config", C25538c.m91188a().mo88680b());
                        createObject2.set("config", (AbstractC66047b) createObject3);
                        jsScopedContext.global().set("TMATrace", (AbstractC66047b) createObject2);
                    }
                    AbstractC67699a aVar = (AbstractC67699a) C66244f.this.appContext.findServiceByInterface(AbstractC67699a.class);
                    if (aVar != null) {
                        JSONObject b = aVar.mo234977b();
                        if (b != null) {
                            JsObject createObject4 = jsScopedContext.createObject();
                            createObject4.set(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, b.toString());
                            jsScopedContext.global().set("nativeStorageInfo", (AbstractC66047b) createObject4);
                        }
                        JSONObject c = aVar.mo234979c();
                        if (c != null) {
                            JsObject createObject5 = jsScopedContext.createObject();
                            createObject5.set(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, c.toString());
                            jsScopedContext.global().set("nativeStorage", (AbstractC66047b) createObject5);
                        }
                    }
                    try {
                        jsScopedContext.global().getObject("TMAConfig").callMethod("ready", 0);
                    } catch (Exception e) {
                        DebugUtil.outputError("tma_JsTMARuntime", "get TMAConfig JsObject fail", e);
                        C66244f.this.showLoadError(ErrorCode.JSCORE.TMA_CONFIG_EXECUTE_ERROR.getCode());
                    }
                    try {
                        AbstractC66328m mVar = mVar;
                        if (mVar != null) {
                            mVar.mo87263a();
                        }
                        jsScopedContext.eval("loadScript('app-service.js')", (String) null);
                        jsScopedContext.pop();
                        AbstractC66328m mVar2 = mVar;
                        if (mVar2 != null) {
                            mVar2.mo87265b();
                        }
                    } catch (Exception e2) {
                        AppBrandLogger.m52829e("tma_JsTMARuntime", e2);
                        AbstractC66328m mVar3 = mVar;
                        if (mVar3 != null) {
                            mVar3.mo87264a(e2);
                        }
                        Activity currentActivity = C66244f.this.appContext.getCurrentActivity();
                        if (currentActivity != null && (C66244f.this.appContext instanceof AbstractC67433a) && !C66244f.this.appContext.isEmbedContainer()) {
                            String errorDesc = ((GadgetErrorRecoveryManager) AppbrandApplicationImpl.getInst(C66244f.this.appContext).getService(GadgetErrorRecoveryManager.class)).getErrorDesc(ErrorType.RUN_ERROR, ErrorCode.WEBVIEW.EXECUTE_APP_SERVICE_ERROR.getCode());
                            AppBrandLogger.m52830i("tma_JsTMARuntime", "loadMainJs error : desc :" + errorDesc);
                            HostDependManager.getInst().showModal(currentActivity, null, currentActivity.getString(R.string.OpenPlatform_GadgetErr_AppErrorTtl), errorDesc, true, currentActivity.getString(R.string.microapp_m_map_dialog_cancel), "", currentActivity.getString(R.string.OpenPlatform_GadgetErr_RetryBttn), "", new AbstractC67550j.AbstractC67551a<Integer>() {
                                /* class com.tt.miniapp.jsbridge.C66244f.C662451.C662461 */

                                /* renamed from: a */
                                public void onNativeModuleCall(Integer num) {
                                    if (num.intValue() == 1) {
                                        C66612a.m260227a(AppbrandApplicationImpl.getInst(C66244f.this.appContext).getAppInfo().appId, AppbrandApplicationImpl.getInst(C66244f.this.appContext).getSchema(), false);
                                    }
                                }
                            }, currentActivity);
                        }
                    }
                }
            });
        } else {
            m259247a(iSnapshotService, mVar);
        }
    }

    /* renamed from: a */
    private void m259249a(String str) {
        Inspect inspect = Inspect.get(this.appContext);
        inspect.setRemoteDebugURL(str);
        AppBrandLogger.m52828d("tma_JsTMARuntime", "jsDebugURL: " + str);
        inspect.start(this.mJsThread.getJsContext().vm);
        C65983a.m258415a().f166557g = true;
        JsObject global = this.mJsThread.getJsContext().global();
        final JsObject object = global.getObject("Math");
        global.release();
        final Handler handler = ((JsRunLoop) Thread.currentThread()).getHandler();
        handler.post(new Runnable() {
            /* class com.tt.miniapp.jsbridge.C66244f.RunnableC662504 */

            public void run() {
                handler.postDelayed(this, 17);
                object.callMethod("random", 0);
                JsEngine.popResult();
            }
        });
    }

    @Override // com.he.jsbinding.JsContext.ScopeCallback, com.tt.miniapp.JsRuntime
    public void run(JsScopedContext jsScopedContext) {
        if (HostDependManager.getInst().getSettingsProvider() != null) {
            this.mLoader.setup(this.f167196a, HostDependManager.getInst().getSettingsProvider());
        } else {
            this.mLoader.setup(this.f167196a, this);
        }
        setupLoader();
        m259246a();
        JsObject createObject = jsScopedContext.createObject();
        createObject.set("platform", "android");
        createObject.set("pageCreateInAdvance", C24512a.m89385a(this.appContext.getAppId()));
        jsScopedContext.global().set("TMAConfig", (AbstractC66047b) createObject);
        JsObject createObject2 = jsScopedContext.createObject();
        createObject2.set("shouldUseNewBridge", BridgeUniteHelper.f166701a.mo231125a());
        createObject2.set("apiUseJSSDKMonitor", C24512a.m89386b());
        createObject2.set("workerApiUseJSSDKMonitor", C24512a.m89388c());
        jsScopedContext.global().set("JSCoreFG", (AbstractC66047b) createObject2);
        String curProcessName = ProcessUtil.getCurProcessName(this.f167196a);
        if (OryxManagerProxy.f35291a.mo49688c() && MiniAppProcessUtils.isOryxProcess(curProcessName)) {
            jsScopedContext.global().set("oryx_started", 1);
        }
        this.f167196a = null;
        loadJsSdk(jsScopedContext);
        AppBrandLogger.m52830i("tma_JsTMARuntime", "preload, load jssdk done");
    }

    public C66244f(ContextWrapper contextWrapper, IAppContext iAppContext) {
        super(contextWrapper, iAppContext);
        this.f167196a = contextWrapper;
        start();
    }

    @Override // com.tt.miniapp.falcon.runtime.IJsRuntime
    public void loadSubPackageMainJs(final AbstractC66328m mVar, final String str) {
        TimeLogger.getInstance(this.appContext).logTimeDuration("JsTMARuntime_beforeLoadMainJs");
        executeInJsThread(new JsContext.ScopeCallback() {
            /* class com.tt.miniapp.jsbridge.C66244f.C662472 */

            @Override // com.he.jsbinding.JsContext.ScopeCallback
            public void run(JsScopedContext jsScopedContext) {
                TimeLogger.getInstance(C66244f.this.appContext).logTimeDuration("JsTMARuntime_runInJsThread2LoadMainJs");
                try {
                    AbstractC66328m mVar = mVar;
                    if (mVar != null) {
                        mVar.mo87263a();
                    }
                    jsScopedContext.eval("loadScript('" + (str + "/app-service.js") + "')", (String) null);
                    jsScopedContext.pop();
                    AbstractC66328m mVar2 = mVar;
                    if (mVar2 != null) {
                        mVar2.mo87265b();
                    }
                } catch (Exception e) {
                    AppBrandLogger.m52829e("tma_JsTMARuntime", e);
                    AbstractC66328m mVar3 = mVar;
                    if (mVar3 != null) {
                        mVar3.mo87264a(e);
                    }
                    Activity currentActivity = C66244f.this.appContext.getCurrentActivity();
                    if (currentActivity != null && (C66244f.this.appContext instanceof AbstractC67433a) && !C66244f.this.appContext.isEmbedContainer()) {
                        String errorDesc = ((GadgetErrorRecoveryManager) AppbrandApplicationImpl.getInst(C66244f.this.appContext).getService(GadgetErrorRecoveryManager.class)).getErrorDesc(ErrorType.RUN_ERROR, ErrorCode.WEBVIEW.EXECUTE_APP_SERVICE_ERROR.getCode());
                        AppBrandLogger.m52830i("tma_JsTMARuntime", "loadSubPackageMainJs error : desc :" + errorDesc);
                        HostDependManager.getInst().showModal(currentActivity, null, currentActivity.getString(R.string.OpenPlatform_GadgetErr_AppErrorTtl), errorDesc, true, currentActivity.getString(R.string.microapp_m_map_dialog_cancel), "", currentActivity.getString(R.string.OpenPlatform_GadgetErr_RetryBttn), "", new AbstractC67550j.AbstractC67551a<Integer>() {
                            /* class com.tt.miniapp.jsbridge.C66244f.C662472.C662481 */

                            /* renamed from: a */
                            public void onNativeModuleCall(Integer num) {
                                if (num.intValue() == 1) {
                                    C66612a.m260227a(AppbrandApplicationImpl.getInst(C66244f.this.appContext).getAppInfo().appId, AppbrandApplicationImpl.getInst(C66244f.this.appContext).getSchema(), false);
                                }
                            }
                        }, currentActivity);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    private void m259248a(final AbstractC66328m mVar, final boolean z) {
        final long currentTimeMillis = System.currentTimeMillis();
        executeInJsThread(new JsContext.ScopeCallback() {
            /* class com.tt.miniapp.jsbridge.C66244f.C662493 */

            @Override // com.he.jsbinding.JsContext.ScopeCallback
            public void run(JsScopedContext jsScopedContext) {
                AppBrandLogger.m52830i("tma_JsTMARuntime", "wait snapshot init:" + (System.currentTimeMillis() - currentTimeMillis));
                TimeLogger.getInstance(C66244f.this.appContext).logTimeDuration("JsTMARuntime_runInJsThread2LoadMainJs");
                JsObject createObject = jsScopedContext.createObject();
                createObject.set("debug", ((VConsoleManager) AppbrandApplicationImpl.getInst(C66244f.this.appContext).getService(VConsoleManager.class)).isVConsoleSwitchOn());
                createObject.set("platform", "android");
                jsScopedContext.global().set("nativeTMAConfig", (AbstractC66047b) createObject);
                OPTrace tracing = AppbrandContext.getInst().getTracing();
                if (tracing != null) {
                    JsObject createObject2 = jsScopedContext.createObject();
                    createObject2.set("traceId", tracing.getTracingID());
                    createObject2.set("createTime", (double) tracing.createTime());
                    createObject2.set("extensions", (AbstractC66046a) jsScopedContext.createArray(0));
                    JsObject createObject3 = jsScopedContext.createObject();
                    createObject3.set("optrace_batch_config", C25538c.m91188a().mo88680b());
                    createObject2.set("config", (AbstractC66047b) createObject3);
                    jsScopedContext.global().set("TMATrace", (AbstractC66047b) createObject2);
                }
                JsObject createObject4 = jsScopedContext.createObject();
                C66244f fVar = C66244f.this;
                fVar.registerFunctions2Js(jsScopedContext, createObject4, fVar.mJsBridge);
                jsScopedContext.global().set("ttJSCore", (AbstractC66047b) createObject4);
                AbstractC67699a aVar = (AbstractC67699a) C66244f.this.appContext.findServiceByInterface(AbstractC67699a.class);
                if (aVar != null) {
                    JSONObject b = aVar.mo234977b();
                    if (b != null) {
                        JsObject createObject5 = jsScopedContext.createObject();
                        createObject5.set("date", b.toString());
                        jsScopedContext.global().set("nativeStorageInfo", (AbstractC66047b) createObject5);
                    }
                    JSONObject c = aVar.mo234979c();
                    if (c != null) {
                        JsObject createObject6 = jsScopedContext.createObject();
                        createObject6.set("date", c.toString());
                        jsScopedContext.global().set("nativeStorage", (AbstractC66047b) createObject6);
                    }
                }
                try {
                    jsScopedContext.global().getObject("TMAConfig").callMethod("ready", 0);
                } catch (Exception e) {
                    AppBrandLogger.m52828d("falcon", "TMAConfig ready： e" + e.toString());
                    DebugUtil.outputError("tma_JsTMARuntime", "falcon get TMAConfig JsObject fail", e);
                    C66244f.this.showLoadError(ErrorCode.JSCORE.TMA_CONFIG_EXECUTE_ERROR.getCode());
                }
                try {
                    AbstractC66328m mVar = mVar;
                    if (mVar != null) {
                        mVar.mo87263a();
                    }
                    AppBrandLogger.m52830i("tma_JsTMARuntime", "JsTMARuntime startApp");
                    long currentTimeMillis = System.currentTimeMillis();
                    if (z) {
                        jsScopedContext.eval("require('app-service.js')", (String) null);
                    } else {
                        jsScopedContext.eval("this.getApp().startApp()", (String) null);
                    }
                    jsScopedContext.pop();
                    AppBrandLogger.m52828d("falcon", "startup app-service.js  end cost:" + (System.currentTimeMillis() - currentTimeMillis));
                    new OPMonitor("mp_snapshot_engine_run_result").tracing(AppbrandContext.getInst().getTracing().getTracingID()).addCategoryValue("result", "success").flush();
                    AbstractC66328m mVar2 = mVar;
                    if (mVar2 != null) {
                        mVar2.mo87265b();
                    }
                } catch (Exception e2) {
                    AppBrandLogger.m52829e("tma_JsTMARuntime", e2);
                    ((ISnapshotService) AppbrandApplicationImpl.getInst(C66244f.this.appContext).getService(SnapshotServiceImpl.class)).discardSnapshot(C67432a.m262319a(C66244f.this.appContext).getAppInfo().version);
                    new OPMonitor("mp_snapshot_engine_run_result").tracing(AppbrandContext.getInst().getTracing().getTracingID()).addCategoryValue("result", ApiHandler.API_CALLBACK_EXCEPTION).addCategoryValue(ApiHandler.API_CALLBACK_EXCEPTION, e2.getMessage()).flush();
                    AbstractC66328m mVar3 = mVar;
                    if (mVar3 != null) {
                        mVar3.mo87264a(e2);
                    }
                    C66244f.this.showLoadError(ErrorCode.JSCORE.MAIN_JS_NOT_FOUND.getCode());
                }
            }
        });
    }

    /* renamed from: a */
    private void m259247a(ISnapshotService iSnapshotService, AbstractC66328m mVar) {
        C66036d.m258580a(this.appContext);
        AppBrandLogger.m52828d("falcon", "loadMainJsSnapshot  preloaded:" + ((JsRuntimeManager) AppbrandApplicationImpl.getInst(this.appContext).getService(JsRuntimeManager.class)).isRuntimePreloaded());
        iSnapshotService.initEngine(C67432a.m262319a(this.appContext).getAppInfo().version);
        m259248a(mVar, iSnapshotService.isEnableStandardSnapshot());
    }
}
