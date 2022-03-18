package com.tt.miniapphost;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.ss.android.lark.optrace.api.AbstractC48929b;
import com.ss.android.lark.optrace.api.TracingCoreSpan;
import com.tt.miniapp.event.lark.LarkInnerEventHelper;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.util.C67584b;
import com.tt.p3256b.AbstractC65679a;

public class MiniappHostService extends Service {
    private boolean preloaded;

    public Context getApplicationContext() {
        C67584b.m263043a(this, super.getAssets());
        return super.getApplicationContext();
    }

    public AssetManager getAssets() {
        C67584b.m263043a(this, super.getAssets());
        return super.getAssets();
    }

    public Resources getResources() {
        C67584b.m263043a(this, super.getAssets());
        return super.getResources();
    }

    public void onCreate() {
        AppBrandLogger.m52830i("MiniappHostService", "preload, onCreate enter");
        super.onCreate();
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        AppbrandContext.tryKillIfNotInit(context);
        C67584b.m263043a(this, super.getAssets());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.IBinder onBind(android.content.Intent r7) {
        /*
        // Method dump skipped, instructions count: 134
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapphost.MiniappHostService.onBind(android.content.Intent):android.os.IBinder");
    }

    private void callLifeCycleOnBind(Intent intent, IAppContext iAppContext) {
        AbstractC65679a miniAppLifeCycleInstance = HostDependManager.getInst().getMiniAppLifeCycleInstance(iAppContext);
        if (miniAppLifeCycleInstance != null) {
            AppBrandLogger.m52830i("MiniappHostService", "callLifeCycleOnBind");
            miniAppLifeCycleInstance.mo49078a(intent);
            return;
        }
        AppBrandLogger.m52829e("MiniappHostService", "miniAppLifeCycleInstance is null");
    }

    private void mpReportTraceId(Intent intent, int i, IAppContext iAppContext) {
        if (intent != null && i == 1) {
            try {
                OPTrace tracing = AppbrandContext.getInst().getTracing();
                TracingCoreSpan tracingCoreSpan = (TracingCoreSpan) intent.getParcelableExtra("tracing");
                if (tracingCoreSpan != null && tracing != null) {
                    tracing.linkTracing(tracingCoreSpan, iAppContext, new AbstractC48929b.AbstractC48930a<IAppContext>() {
                        /* class com.tt.miniapphost.MiniappHostService.C674311 */

                        /* renamed from: a */
                        public void mo170894a(String str, IAppContext iAppContext) {
                            LarkInnerEventHelper.mpAppEventLink(str, iAppContext);
                        }
                    });
                    AppBrandLogger.m52828d("MiniappHostService", "linkTracing :" + tracingCoreSpan.toString() + "  currentProcessTracing:" + tracing.toString());
                }
            } catch (Throwable th) {
                AppBrandLogger.m52829e("MiniappHostService", "throwable", th);
            }
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00fb, code lost:
        if (r4.equals("hostActionCommand") == false) goto L_0x00f3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int onStartCommand(android.content.Intent r18, int r19, int r20) {
        /*
        // Method dump skipped, instructions count: 444
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapphost.MiniappHostService.onStartCommand(android.content.Intent, int, int):int");
    }

    private void callLifeCycleOnStart(Intent intent, int i, int i2, AbstractC67433a aVar) {
        if (aVar == null || !aVar.mo234162b()) {
            AppBrandLogger.m52829e("MiniappHostService", "miniAppLifeCycleInstance is null");
            return;
        }
        AbstractC65679a miniAppLifeCycleInstance = HostDependManager.getInst().getMiniAppLifeCycleInstance(aVar);
        if (miniAppLifeCycleInstance != null) {
            AppBrandLogger.m52830i("MiniappHostService", "callLifeCycleOnStart");
            miniAppLifeCycleInstance.mo49079a(intent, i, i2);
        }
    }
}
