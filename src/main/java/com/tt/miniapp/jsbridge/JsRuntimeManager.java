package com.tt.miniapp.jsbridge;

import android.content.Context;
import android.content.ContextWrapper;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.storage.sp.biz.Storage;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.tt.frontendapiinterface.IJsBridge;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.AppbrandServiceManager;
import com.tt.miniapp.event.lark.LarkInnerEventHelper;
import com.tt.miniapp.falcon.runtime.C66067a;
import com.tt.miniapp.falcon.runtime.IJsRuntime;
import com.tt.miniapp.falcon.snapshot.C66070a;
import com.tt.miniapp.falcon.snapshot.C66077e;
import com.tt.miniapp.falcon.snapshot.C66083i;
import com.tt.miniapp.falcon.snapshot.SnapshotType;
import com.tt.miniapp.util.MpTimeLineReporter;
import java.util.HashSet;
import java.util.Iterator;

public class JsRuntimeManager extends AppbrandServiceManager.ServiceBase {
    private IAppContext appContext = this.mApp.getiAppContext();
    private C66070a mAppSnapshot;
    private volatile IJsRuntime mCurrentRuntime;
    private boolean mHasReady = false;
    private volatile C66243e mJsRuntimeProxy;
    boolean runtimePreloaded = false;
    private final HashSet<JsRuntimeReadyListener> sReadyListeners = new HashSet<>();

    public interface JsRuntimeReadyListener {
        void onJsRuntimeReady();
    }

    public C66070a getAppSnapshot() {
        return this.mAppSnapshot;
    }

    public boolean isRuntimePreloaded() {
        return this.runtimePreloaded;
    }

    public synchronized IJsRuntime getCurrentRuntime() {
        return this.mJsRuntimeProxy;
    }

    public boolean isSnapshotJsRuntime() {
        return this.mCurrentRuntime instanceof C66083i;
    }

    public synchronized IJsBridge getJsBridge() {
        if (this.mCurrentRuntime == null) {
            return null;
        }
        return this.mCurrentRuntime.getJsBridge();
    }

    private synchronized void notifyRuntimeReady() {
        Iterator<JsRuntimeReadyListener> it = this.sReadyListeners.iterator();
        while (it.hasNext()) {
            JsRuntimeReadyListener next = it.next();
            if (next != null) {
                next.onJsRuntimeReady();
            }
        }
        this.sReadyListeners.clear();
    }

    private synchronized void createSnapshotJsRuntimeIfNeed() {
        if (!C66240d.m259242a()) {
            AppBrandLogger.m52830i("tma_JsRuntimeManager", "createSnapshotJsRuntimeIfNeed: isUseFalcon is FALSE");
            return;
        }
        String appId = this.appContext.getAppId();
        if (TextUtils.isEmpty(appId)) {
            AppBrandLogger.m52830i("tma_JsRuntimeManager", "createSnapshotJsRuntimeIfNeed: appId is NULL");
            return;
        }
        Context applicationContext = this.appContext.getApplicationContext();
        String string = Storage.getStorageByName(applicationContext, Storage.getStorageFilePrefix("new_update_app_info_v2" + appId)).getString(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, null);
        if (TextUtils.isEmpty(string)) {
            AppBrandLogger.m52830i("tma_JsRuntimeManager", "createSnapshotJsRuntimeIfNeed: appVersion is NULL");
            return;
        }
        createSnapshotJsRuntimeIfNeed(string);
    }

    protected JsRuntimeManager(AppbrandApplicationImpl appbrandApplicationImpl) {
        super(appbrandApplicationImpl);
    }

    private void setCurrentRuntime(IJsRuntime iJsRuntime) {
        this.mCurrentRuntime = iJsRuntime;
        if (this.mJsRuntimeProxy == null) {
            this.mJsRuntimeProxy = new C66243e();
        }
        this.mJsRuntimeProxy.mo231615a(this.mCurrentRuntime);
    }

    public synchronized void addJsRuntimeReadyListener(JsRuntimeReadyListener jsRuntimeReadyListener) {
        if (jsRuntimeReadyListener != null) {
            if (!this.mHasReady) {
                this.sReadyListeners.add(jsRuntimeReadyListener);
            } else {
                jsRuntimeReadyListener.onJsRuntimeReady();
            }
        }
    }

    public synchronized void preloadTMARuntime(ContextWrapper contextWrapper) {
        MpTimeLineReporter mpTimeLineReporter = (MpTimeLineReporter) AppbrandApplicationImpl.getInst(this.appContext).getService(MpTimeLineReporter.class);
        if (this.mCurrentRuntime == null) {
            mpTimeLineReporter.addPoint("create_jsEngine_begin");
            LarkInnerEventHelper.mpJsCoreLoadStart(this.appContext);
            setCurrentRuntime(C66240d.m259240a(contextWrapper, this.appContext));
            LarkInnerEventHelper.mpJsCoreLoadResult("success", null, 0, null, null, this.appContext);
            mpTimeLineReporter.addPoint("create_jsEngine_end");
            this.runtimePreloaded = true;
            this.mHasReady = true;
            notifyRuntimeReady();
        }
    }

    public synchronized void createSnapshotJsRuntimeIfNeed(String str) {
        AppBrandLogger.m52830i("tma_JsRuntimeManager", "createSnapshotJsRuntimeIfNeed: start");
        if (this.mCurrentRuntime instanceof C66083i) {
            AppBrandLogger.m52829e("tma_JsRuntimeManager", "createSnapshotJsRuntimeIfNeed: currentRuntime is SnapshotJsRuntime");
            return;
        }
        C66070a aVar = new C66070a(this.appContext, str, SnapshotType.KEEP_APP);
        this.mAppSnapshot = aVar;
        if (aVar.mo231217d()) {
            IJsRuntime iJsRuntime = this.mCurrentRuntime;
            LarkInnerEventHelper.mpInitEngineStart(this.appContext);
            C66083i iVar = new C66083i(this.appContext, this.mAppSnapshot);
            setCurrentRuntime(iVar);
            LarkInnerEventHelper.mpInitEngineEnd(this.appContext);
            if (iJsRuntime != null) {
                if (iJsRuntime instanceof C66067a) {
                    iVar.mo231239a((C66067a) iJsRuntime);
                }
                iJsRuntime.release();
            }
        }
        AppBrandLogger.m52830i("tma_JsRuntimeManager", "createSnapshotJsRuntimeIfNeed: end");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a7, code lost:
        if ((r6.mCurrentRuntime instanceof com.tt.miniapp.jsbridge.C66244f) != false) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00af, code lost:
        if (r6.mCurrentRuntime.getJsSdkLoadState() == 1) goto L_0x00b1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void initTMARuntime(android.content.ContextWrapper r7) {
        /*
        // Method dump skipped, instructions count: 222
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.jsbridge.JsRuntimeManager.initTMARuntime(android.content.ContextWrapper):void");
    }

    public void createSnapshotJsRuntimeForPreview(String str, String str2) {
        SnapshotType snapshotType = SnapshotType.getSnapshotType(str2);
        if (snapshotType == SnapshotType.INVALID_TYPE) {
            AppBrandLogger.m52829e("tma_JsRuntimeManager", "createSnapshotJsRuntimeForPreview: snapshotType = " + str2 + ", it is INVALID_TYPE");
            return;
        }
        C66077e eVar = new C66077e(this.mApp.getiAppContext(), str, snapshotType);
        eVar.mo231231c();
        C66070a a = eVar.mo231218a();
        this.mAppSnapshot = a;
        if (a.mo231217d()) {
            IJsRuntime iJsRuntime = this.mCurrentRuntime;
            C66083i iVar = new C66083i(this.appContext, this.mAppSnapshot);
            setCurrentRuntime(iVar);
            if (iJsRuntime != null) {
                if (iJsRuntime instanceof C66067a) {
                    iVar.mo231239a((C66067a) iJsRuntime);
                }
                iJsRuntime.release();
            }
        }
    }
}
