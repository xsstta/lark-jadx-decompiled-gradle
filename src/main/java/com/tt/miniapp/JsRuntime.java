package com.tt.miniapp;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.ee.lark.infra.config.mina.keys.Settings;
import com.bytedance.ee.lark.infra.config.mina.p614a.C12738a;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.he.JsRunLoop;
import com.he.Monitor;
import com.he.jsbinding.JsContext;
import com.he.jsbinding.JsObject;
import com.he.jsbinding.JsScopedContext;
import com.he.loader.LoadScriptSample;
import com.he.loader.SettingsProvider;
import com.he.loader.TTAppLoader;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.tt.frontendapiinterface.IJsBridge;
import com.tt.miniapp.errorcode.ErrorCode;
import com.tt.miniapp.event.C66036d;
import com.tt.miniapp.event.lark.LarkInnerEventHelper;
import com.tt.miniapp.falcon.p3285a.AbstractC66047b;
import com.tt.miniapp.jsbridge.C66237b;
import com.tt.miniapp.jsbridge.C66244f;
import com.tt.miniapp.jsbridge.JsBridge;
import com.tt.miniapp.jsbridge.Jscore;
import com.tt.miniapp.util.C67051o;
import com.tt.miniapp.util.TimeLogger;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.miniapphost.p3371e.p3372a.C67501b;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.miniapphost.util.TimeMeter;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class JsRuntime extends AbstractC66259k implements JsRunLoop.SetupCallback, SettingsProvider {
    private Map<String, Method> injectMethodMap = new HashMap();
    public C66237b mApiQuickCalledManager;
    public JsBridge mJsBridge;
    protected JsContext mJsContext;
    public JsRunLoop mJsThread;
    public Handler mJsThreadHandler;
    protected TTAppLoader mLoader;
    protected List<JsContext.ScopeCallback> mPendingScopeCallbackList = new ArrayList();

    @Override // com.he.JsRunLoop.SetupCallback
    public void cleanup() {
    }

    @Override // com.he.jsbinding.JsContext.ScopeCallback
    public void run(JsScopedContext jsScopedContext) {
    }

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.JsRuntime$a */
    public static class C65713a extends Exception {
        private C65713a() {
        }
    }

    private boolean isTMARuntime() {
        return this instanceof C66244f;
    }

    public JsContext context() {
        return this.mJsContext;
    }

    public C66237b getApiQuickCalledManager() {
        return this.mApiQuickCalledManager;
    }

    @Override // com.tt.miniapp.falcon.runtime.IJsRuntime
    public IJsBridge getJsBridge() {
        return this.mJsBridge;
    }

    public Handler getJsThreadHandler() {
        return this.mJsThreadHandler;
    }

    @Override // com.tt.miniapp.falcon.runtime.IJsRuntime
    public long getRuntimePointer() {
        JsRunLoop jsRunLoop = this.mJsThread;
        if (jsRunLoop != null) {
            return jsRunLoop.getJsContext().vm;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void start() {
        JsRunLoop jsRunLoop = new JsRunLoop();
        this.mJsThread = jsRunLoop;
        jsRunLoop.setup(this);
        this.mJsThread.start();
        this.mJsThreadHandler = this.mJsThread.getHandler();
    }

    @Override // com.tt.miniapp.falcon.runtime.IJsRuntime
    public void release() {
        if (C25529d.m91169j(this.appContext)) {
            AppBrandLogger.m52830i("JsRuntime", "can not destroy");
            return;
        }
        AppBrandLogger.m52830i("JsRuntime", "Release");
        if (this.mJsThread != null) {
            this.mJsBridge.release();
            this.mJsThread.quit();
            this.mJsThread = null;
            this.mJsThreadHandler = null;
        }
    }

    public void executeInJsThread(JsContext.ScopeCallback scopeCallback) {
        executeInJsThread(scopeCallback, false, false);
    }

    public void executeInJsThreadPostAtFront(JsContext.ScopeCallback scopeCallback) {
        executeInJsThread(scopeCallback, false, true);
    }

    @Override // com.tt.miniapp.falcon.runtime.IJsRuntime
    public void postRunnable(Runnable runnable) {
        executeInJsThread(runnable, false);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.AbstractC66259k
    public void setLoadScriptSampleCallback(LoadScriptSample.Callback callback) {
        this.mLoader.setLoadScriptSampleCallback(callback);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.AbstractC66259k
    public void setRootPathToNative(String str) {
        this.mLoader.loadPackage(str);
    }

    /* access modifiers changed from: protected */
    public final void loadJsSdk(JsScopedContext jsScopedContext) {
        updateLoadJsCoreBegin();
        String jsCoreFileName = getJsCoreFileName();
        JsObject global = jsScopedContext.global();
        JsObject createObject = jsScopedContext.createObject();
        registerFunctions2Js(jsScopedContext, createObject, this.mJsBridge);
        global.set("ttJSCore", (AbstractC66047b) createObject);
        global.set(BridgeUniteHelper.f166701a.mo231126b(), (AbstractC66047b) createObject);
        TimeMeter newAndStart = TimeMeter.newAndStart();
        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        String jsCoreFileName2 = getJsCoreFileName();
        File file = new File(AppbrandConstant.getJsBundleDir(applicationContext, this.appContext), jsCoreFileName2);
        try {
            loadJsCoreFile(jsScopedContext, file, jsCoreFileName2, jsCoreFileName, newAndStart);
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("JsRuntime", "load jscore error: " + e.getMessage(), e);
            retryLoadJsCoreFile(jsScopedContext, file, jsCoreFileName2, jsCoreFileName, newAndStart);
        }
    }

    @Override // com.tt.miniapp.falcon.runtime.IJsRuntime
    public void postRunnable(Runnable runnable, boolean z) {
        executeInJsThread(runnable, z);
    }

    public void executeInJsThread(JsContext.ScopeCallback scopeCallback, boolean z) {
        executeInJsThread(scopeCallback, false, false, z);
    }

    public JsRuntime(ContextWrapper contextWrapper, IAppContext iAppContext) {
        super(iAppContext);
        this.mJsBridge = new JsBridge(this, iAppContext);
        C66536o oVar = new C66536o(iAppContext);
        this.mLoader = new TTAppLoader(oVar);
        Monitor.impl = oVar;
        this.mApiQuickCalledManager = new C66237b();
    }

    public void executeInJsThread(Runnable runnable, boolean z) {
        Handler handler = this.mJsThreadHandler;
        if (handler == null) {
            LarkInnerEventHelper.mpJsRuntimeError(50004, (String) null, this.appContext);
            AppBrandLogger.m52829e("JsRuntime", "executeInJsThread, mJsThreadHandler is null");
        } else if (z) {
            handler.postAtFrontOfQueue(runnable);
        } else {
            handler.post(runnable);
        }
    }

    @Override // com.he.loader.SettingsProvider
    public int getSetting(Context context, Enum<?> r5, int i) {
        return C12738a.m52722a(context, i, Settings.BDP_HELIUM_CONFIG, r5);
    }

    public void executeInJsThread(JsContext.ScopeCallback scopeCallback, boolean z, boolean z2) {
        executeInJsThread(scopeCallback, z, z2, false);
    }

    @Override // com.he.loader.SettingsProvider
    public String getSetting(Context context, Enum<?> r5, String str) {
        return C12738a.m52723a(context, str, Settings.BDP_HELIUM_CONFIG, r5);
    }

    @Override // com.he.loader.SettingsProvider
    public boolean getSetting(Context context, Enum<?> r5, boolean z) {
        return C12738a.m52727a(context, z, Settings.BDP_HELIUM_CONFIG, r5);
    }

    public void registerFunctions2Js(JsScopedContext jsScopedContext, JsObject jsObject, JsBridge jsBridge) {
        if (this.injectMethodMap.isEmpty()) {
            Method[] methods = JsBridge.class.getMethods();
            for (Method method : methods) {
                Jscore jscore = (Jscore) method.getAnnotation(Jscore.class);
                if (jscore != null) {
                    String jsfunctionname = jscore.jsfunctionname();
                    if (!TextUtils.isEmpty(jsfunctionname)) {
                        if (DebugUtil.debug()) {
                            AppBrandLogger.m52828d("JsRuntime", "regist to js:" + jsfunctionname);
                        }
                        this.injectMethodMap.put(jsfunctionname, method);
                        jsObject.set(method.getName(), (AbstractC66047b) jsScopedContext.createFunction(jsBridge, method));
                    }
                }
            }
            return;
        }
        for (Map.Entry<String, Method> entry : this.injectMethodMap.entrySet()) {
            jsObject.set(entry.getKey(), (AbstractC66047b) jsScopedContext.createFunction(jsBridge, entry.getValue()));
        }
    }

    public void executeInJsThread(final JsContext.ScopeCallback scopeCallback, final boolean z, boolean z2, final boolean z3) {
        if (this.mJsThreadHandler == null) {
            LarkInnerEventHelper.mpJsRuntimeError(50004, (String) null, this.appContext);
            AppBrandLogger.m52829e("JsRuntime", "executeInJsThread, mJsThreadHandler is null");
            return;
        }
        RunnableC657121 r0 = new Runnable() {
            /* class com.tt.miniapp.JsRuntime.RunnableC657121 */

            /* renamed from: e */
            private boolean f165582e;

            public void run() {
                if (!this.f165582e) {
                    if (z3) {
                        JsRuntime.this.mApiQuickCalledManager.mo231611b(this);
                    }
                    if (z || JsRuntime.this.mJsSdkLoadState == 0) {
                        try {
                            JsRuntime.this.mJsThread.getJsContext().run(scopeCallback);
                        } catch (Exception e) {
                            AppBrandLogger.m52829e("JsRuntime", "mJsContext exception", e);
                            LarkInnerEventHelper.mpJsRuntimeError(50005, e.toString(), JsRuntime.this.appContext);
                            C67051o a = C67051o.m261319a();
                            a.mo233156a("js context run fail: " + e, "unCaughtScriptError", JsRuntime.this.appContext);
                            DebugUtil.outputError("JsRuntime", "js context run fail ", e);
                        }
                    } else {
                        AppBrandLogger.m52830i("JsRuntime", "add to pending list");
                        JsRuntime.this.mPendingScopeCallbackList.add(scopeCallback);
                    }
                    this.f165582e = true;
                }
            }
        };
        if (z3) {
            this.mApiQuickCalledManager.mo231608a(r0);
        }
        if (z2) {
            this.mJsThreadHandler.postAtFrontOfQueue(r0);
        } else {
            this.mJsThreadHandler.post(r0);
        }
    }

    private void loadJsCoreFile(JsScopedContext jsScopedContext, File file, String str, String str2, TimeMeter timeMeter) throws Exception {
        byte[] readBytes = IOUtils.readBytes(file.getAbsolutePath());
        reportLoadJsCoreBegin();
        if (readBytes != null) {
            jsScopedContext.eval(readBytes, file.getName());
            jsScopedContext.pop();
            reportLoadJsCoreEnd();
            for (JsContext.ScopeCallback scopeCallback : this.mPendingScopeCallbackList) {
                jsScopedContext.run(scopeCallback);
            }
            this.mPendingScopeCallbackList.clear();
            updateLoadJsCoreEnd();
            return;
        }
        throw new C65713a();
    }

    private void retryLoadJsCoreFile(JsScopedContext jsScopedContext, File file, String str, String str2, TimeMeter timeMeter) {
        String str3;
        String str4;
        Exception e = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (i < 20 && !z) {
            i++;
            try {
                Thread.sleep(500);
                loadJsCoreFile(jsScopedContext, file, str, str2, timeMeter);
                z = true;
            } catch (InterruptedException e2) {
                AppBrandLogger.m52829e("JsRuntime", e2);
            } catch (C65713a unused) {
                z2 = true;
            } catch (Exception e3) {
                e = e3;
            }
        }
        if (!z) {
            OPMonitor resultTypeFail = new C67500a("mp_jscore_lib_load_result", C67501b.f170245m, this.appContext).setResultTypeFail();
            if (z2) {
                resultTypeFail.setErrorMessage("load jssdk, tma-core not found");
            } else if (e != null) {
                resultTypeFail.setError(e);
                resultTypeFail.setErrorMessage("load jssdk error: " + e.getMessage());
            }
            resultTypeFail.flush();
            if (z2) {
                if (isTMARuntime()) {
                    str4 = ErrorCode.JSCORE.TMA_CORE_NOT_FOUND.getCode();
                } else {
                    str4 = ErrorCode.JSCORE.TMG_CORE_NOT_FOUND.getCode();
                }
                showLoadError(str4);
                return;
            }
            AppBrandLogger.eWithThrowable("JsRuntime", "js core load " + str2 + " fail ", e);
            this.mJsSdkLoadState = 1;
            C66036d.m258582a("fail", TimeMeter.stop(timeMeter), Log.getStackTraceString(e), this.appContext);
            TimeLogger instance = TimeLogger.getInstance(this.appContext);
            instance.logError("JsRuntime_load_" + str2 + "_error", Log.getStackTraceString(e));
            if (isTMARuntime()) {
                str3 = ErrorCode.JSCORE.TMA_CORE_EXECUTE_ERROR.getCode();
            } else {
                str3 = ErrorCode.JSCORE.TMG_CORE_EXECUTE_ERROR.getCode();
            }
            showLoadError(str3);
        }
    }
}
