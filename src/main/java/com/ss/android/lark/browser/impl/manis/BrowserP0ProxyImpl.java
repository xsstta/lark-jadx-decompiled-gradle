package com.ss.android.lark.browser.impl.manis;

import android.content.Context;
import android.webkit.WebView;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.browser.impl.C29927b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;

@RemoteServiceImpl(service = IBrowserP0Proxy.class)
public class BrowserP0ProxyImpl implements IBrowserP0Proxy {
    private final Context mContext;

    @Override // com.ss.android.lark.browser.impl.manis.IBrowserP0Proxy
    public void warmUp() {
        Log.m165389i("BrowserP0ProxyImpl", "p0 process warm up launch");
    }

    static /* synthetic */ void lambda$syncCookieOnAccountChange$0() {
        C29638a.m109622a().getDocsDependency().mo107665b();
        C29927b.m110661e();
    }

    @Override // com.ss.android.lark.browser.impl.manis.IBrowserP0Proxy
    public void clearWebViewCache() {
        CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
            /* class com.ss.android.lark.browser.impl.manis.$$Lambda$BrowserP0ProxyImpl$E2utYe_pF_SQMrdk7YC2wHjerd8 */

            public final void run() {
                BrowserP0ProxyImpl.this.lambda$clearWebViewCache$2$BrowserP0ProxyImpl();
            }
        });
    }

    public /* synthetic */ void lambda$clearWebViewCache$2$BrowserP0ProxyImpl() {
        WebView webView = new WebView(this.mContext.getApplicationContext());
        webView.clearCache(true);
        webView.destroy();
    }

    @Override // com.ss.android.lark.browser.impl.manis.IBrowserP0Proxy
    public void syncCookieOnLocaleChange() {
        Log.m165389i("BrowserP0ProxyImpl", "syncCookieOnLocaleChange in p0");
        C29638a.m109622a().getLanguageDependency().mo107674a(this.mContext);
        C29638a.m109622a().getDocsDependency().mo107665b();
        CoreThreadPool.getDefault().getScheduleThreadPool().execute($$Lambda$NQxvNSlCrAICoJyFl1BovPjAK8.INSTANCE);
    }

    public BrowserP0ProxyImpl(Context context) {
        this.mContext = context;
    }

    static /* synthetic */ void lambda$syncCookieOnAccountChange$1(boolean z, Runnable runnable) {
        if (!z) {
            Log.m165389i("BrowserP0ProxyImpl", "simple clear cookies in p0");
            return;
        }
        CoreThreadPool.getDefault().getScheduleThreadPool().execute(runnable);
        Log.m165389i("BrowserP0ProxyImpl", "reset account cookies in p0");
    }

    @Override // com.ss.android.lark.browser.impl.manis.IBrowserP0Proxy
    public void syncCookieOnAccountChange(boolean z, boolean z2) {
        Log.m165389i("BrowserP0ProxyImpl", "syncCookieOnAccountChange in p0");
        if (C29638a.m109622a() == null || C29638a.m109622a().getDocsDependency() == null) {
            Log.m165389i("BrowserP0ProxyImpl", "getDependency null");
            return;
        }
        C29638a.m109622a().getDocsDependency().mo107661a(z);
        $$Lambda$BrowserP0ProxyImpl$UBQRQhZqL5UBFzByDgtl2_WbiWc r1 = $$Lambda$BrowserP0ProxyImpl$UBQRQhZqL5UBFzByDgtl2_WbiWc.INSTANCE;
        if (z2) {
            C29927b.m110648a(new Runnable(z, r1) {
                /* class com.ss.android.lark.browser.impl.manis.$$Lambda$BrowserP0ProxyImpl$pyJizZ22gFu9qWkZTMKqZR3UDBI */
                public final /* synthetic */ boolean f$0;
                public final /* synthetic */ Runnable f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void run() {
                    BrowserP0ProxyImpl.lambda$syncCookieOnAccountChange$1(this.f$0, this.f$1);
                }
            });
            return;
        }
        CoreThreadPool.getDefault().getScheduleThreadPool().execute(r1);
        Log.m165389i("BrowserP0ProxyImpl", "append account cookies in p0");
    }
}
