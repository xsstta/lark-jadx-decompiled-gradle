package com.tt.miniapp.preload;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.util.Log;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.tt.miniapp.AppbrandFragment;
import com.tt.miniapp.util.TimeLogger;
import com.tt.miniapp.view.webcore.C67257d;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.refer.common.util.C67866g;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.tt.miniapp.preload.b */
public class C66602b implements IRenderViewPreload {

    /* renamed from: a */
    final PreloadManager f168164a;

    /* renamed from: b */
    public final IAppContext f168165b;

    /* renamed from: c */
    public C67257d f168166c;

    /* renamed from: d */
    private final Object f168167d = new Object();

    /* renamed from: e */
    private volatile boolean f168168e;

    /* renamed from: f */
    private final Handler f168169f;

    /* renamed from: b */
    private void m260212b() {
        this.f168164a.preLoadLoadingView();
    }

    /* renamed from: a */
    private void m260209a() {
        this.f168164a.getWorkerHandler().post(new Runnable() {
            /* class com.tt.miniapp.preload.C66602b.RunnableC666053 */

            public void run() {
                C66602b.this.f168164a.preloadJsRuntime();
            }
        });
    }

    /* renamed from: com.tt.miniapp.preload.b$a */
    private class C66607a implements MessageQueue.IdleHandler {
        public boolean queueIdle() {
            AppBrandLogger.m52828d("tma_WebRenderViewPreload", "queueIdle preload webview");
            C66602b bVar = C66602b.this;
            bVar.mo232226a((Context) bVar.f168165b.getCurrentActivity(), false);
            return false;
        }

        private C66607a() {
        }
    }

    @Override // com.tt.miniapp.preload.IRenderViewPreload
    public void preloadOnIdle() {
        synchronized (this.f168167d) {
            if (this.f168166c == null) {
                this.f168169f.post(new Runnable() {
                    /* class com.tt.miniapp.preload.C66602b.RunnableC666042 */

                    public void run() {
                        Looper.myQueue().addIdleHandler(new C66607a());
                    }
                });
            }
        }
    }

    @Override // com.tt.miniapp.preload.IRenderViewPreload
    public void preloadOnProcessInit() {
        synchronized (this.f168167d) {
            if (this.f168166c == null) {
                AppBrandLogger.m52830i("tma_WebRenderViewPreload", "use async preload");
                m260209a();
                m260210a(this.f168165b.getApplicationContext(), 0);
                m260212b();
            }
        }
    }

    @Override // com.tt.miniapp.preload.IRenderViewPreload
    public void clean() {
        try {
            synchronized (this.f168167d) {
                C67257d dVar = this.f168166c;
                if (!(dVar == null || dVar.getWebView() == null)) {
                    this.f168166c.getWebView().mo233948a().loadUrl("about:blank");
                    this.f168166c.removeAllViews();
                    this.f168166c.getWebView().mo233948a().destroy();
                }
                this.f168166c = null;
            }
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "tma_WebRenderViewPreload", e.getStackTrace());
        }
    }

    /* renamed from: b */
    private C67257d m260211b(final Context context) {
        C67257d dVar;
        synchronized (this.f168167d) {
            dVar = this.f168166c;
            if (dVar != null) {
                dVar.checkAppDarkModeStatus();
                this.f168166c = null;
            } else {
                dVar = null;
            }
        }
        if (dVar == null) {
            if (C67866g.m264030a()) {
                dVar = mo232225a(context);
            } else {
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                final C67257d[] dVarArr = new C67257d[1];
                this.f168169f.post(new Runnable() {
                    /* class com.tt.miniapp.preload.C66602b.RunnableC666031 */

                    public void run() {
                        if (C66602b.this.f168166c != null) {
                            dVarArr[0] = C66602b.this.f168166c;
                            C66602b.this.f168166c = null;
                        } else {
                            dVarArr[0] = C66602b.this.mo232225a(context);
                        }
                        countDownLatch.countDown();
                    }
                });
                try {
                    countDownLatch.await();
                } catch (InterruptedException e) {
                    AppBrandLogger.m52829e("tma_WebRenderViewPreload", e);
                }
                dVar = dVarArr[0];
            }
        }
        dVar.getRenderLoadManager().continuePreloadIfNeed();
        return dVar;
    }

    /* renamed from: a */
    public C67257d mo232225a(Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        C67257d a = C67257d.m262087a(context, this.f168165b);
        AppBrandLogger.m52830i("tma_WebRenderViewPreload", "----createWebView:" + (System.currentTimeMillis() - currentTimeMillis));
        a.getRenderLoadManager().continuePreloadIfNeed();
        this.f168168e = true;
        return a;
    }

    /* renamed from: c */
    private void m260213c(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        int i = configuration.uiMode;
        AppBrandLogger.m52830i("tma_WebRenderViewPreload", "origin config : " + configuration + " originDarkModeStatus : " + UDUiModeUtils.m93320a(configuration));
        this.f168166c = mo232225a(context);
        Configuration configuration2 = context.getResources().getConfiguration();
        AppBrandLogger.m52830i("tma_WebRenderViewPreload", "merged config : " + configuration2 + " mergedDarkModeStatus : " + UDUiModeUtils.m93320a(configuration2));
        configuration2.uiMode = i;
        context.getResources().updateConfiguration(configuration2, context.getResources().getDisplayMetrics());
        AppBrandLogger.m52830i("tma_WebRenderViewPreload", "redirect config : " + context.getResources().getConfiguration() + " redirectDarkModeStatus : " + UDUiModeUtils.m93320a(context.getResources().getConfiguration()));
    }

    @Override // com.tt.miniapp.preload.IRenderViewPreload
    public AppbrandFragment takePreloadFragment(Context context, String str) {
        return m260211b(context).getFragment();
    }

    public C66602b(PreloadManager preloadManager, IAppContext iAppContext) {
        this.f168165b = iAppContext;
        this.f168164a = preloadManager;
        this.f168169f = new Handler(Looper.getMainLooper());
    }

    /* renamed from: a */
    private void m260210a(final Context context, long j) {
        if (this.f168168e) {
            AppBrandLogger.m52830i("tma_WebRenderViewPreload", "----has preload:" + j);
        } else if (C67866g.m264030a()) {
            mo232226a(context, true);
        } else {
            this.f168169f.postDelayed(new Runnable() {
                /* class com.tt.miniapp.preload.C66602b.RunnableC666064 */

                public void run() {
                    C66602b.this.mo232226a(context, true);
                }
            }, j);
        }
    }

    /* renamed from: a */
    public void mo232226a(Context context, boolean z) {
        if (context == null) {
            context = this.f168165b.getCurrentActivity();
        }
        if (context == null) {
            context = AppbrandContext.getInst().getApplicationContext();
        }
        if (!z || !this.f168168e) {
            synchronized (this.f168167d) {
                if (this.f168166c == null) {
                    try {
                        if (!HostDependManager.getInst().getFeatureGating("openplatform.gadget.webview.use.direct.configuration", false)) {
                            m260213c(context);
                        } else {
                            this.f168166c = mo232225a(context);
                        }
                        this.f168166c.getRenderLoadManager().checkGlobalDarkModeStatus();
                    } catch (Exception e) {
                        TimeLogger.getInstance(this.f168165b).logError("tma_WebRenderViewPreload_preload_error", Log.getStackTraceString(e));
                        if (!(context instanceof Activity)) {
                            AppBrandLogger.eWithThrowable("tma_WebRenderViewPreload", "Exception at preloadOnProcessInit.", e);
                        } else {
                            AppBrandLogger.eWithThrowable("tma_WebRenderViewPreload", "Exception at preloadForNextPage.", e);
                        }
                    }
                }
            }
            this.f168164a.afterPreloadView();
            return;
        }
        AppBrandLogger.m52830i("tma_WebRenderViewPreload", "no need preload webView again when process init");
    }
}
