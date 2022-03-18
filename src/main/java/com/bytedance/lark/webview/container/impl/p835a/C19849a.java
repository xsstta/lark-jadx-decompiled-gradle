package com.bytedance.lark.webview.container.impl.p835a;

import android.app.Activity;
import android.os.Bundle;
import android.os.Message;
import android.webkit.WebView;
import com.bytedance.lark.webview.container.impl.WebContainerActivity;
import com.larksuite.component.webview.container.dto.WindowOpenDelegate;
import com.larksuite.component.webview.container.impl.inject.AbstractC25867d;
import com.larksuite.component.webview.container.impl.inject.C25864c;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57766ad;
import com.ss.android.lark.utils.C57858o;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.lark.webview.container.impl.a.a */
public class C19849a {

    /* renamed from: a */
    private static final C19849a f48448a = new C19849a();

    /* renamed from: b */
    private Message f48449b;

    /* renamed from: c */
    private WeakReference<WebView> f48450c;

    /* renamed from: a */
    public static C19849a m72399a() {
        return f48448a;
    }

    /* renamed from: a */
    private Bundle m72398a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        ((AbstractC25867d) C25864c.m93607a()).mo92012a(true, bundle2, bundle);
        return bundle2;
    }

    /* renamed from: a */
    public boolean mo67251a(WebView webView) {
        WeakReference<WebView> weakReference;
        if (this.f48449b == null || ((weakReference = this.f48450c) != null && weakReference.get() == webView)) {
            this.f48449b = null;
            this.f48450c = null;
            return false;
        }
        webView.setTag(R.id.from_window_open, true);
        ((WebView.WebViewTransport) this.f48449b.obj).setWebView(webView);
        this.f48449b.sendToTarget();
        this.f48449b = null;
        return true;
    }

    /* renamed from: a */
    private void m72400a(Activity activity, Bundle bundle) {
        if (activity == null || bundle == null) {
            this.f48449b = null;
        } else if (!(this.f48449b.obj instanceof WebView.WebViewTransport)) {
            this.f48449b = null;
        } else {
            CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable(bundle, activity) {
                /* class com.bytedance.lark.webview.container.impl.p835a.$$Lambda$a$hThJPWTIbbB0z5177NUZ3ZlhSQ */
                public final /* synthetic */ Bundle f$1;
                public final /* synthetic */ Activity f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C19849a.m270150lambda$hThJPWTIbbB0z5177NUZ3ZlhSQ(C19849a.this, this.f$1, this.f$2);
                }
            });
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m72401a(Bundle bundle, Activity activity) {
        C57766ad a = C57858o.m224559a(WebContainerActivity.class).mo196052a(bundle).mo196060a("is_multi_window_open", true);
        a.mo196052a(m72398a(bundle));
        CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable(activity) {
            /* class com.bytedance.lark.webview.container.impl.p835a.$$Lambda$a$4Z6xXWYXQqa6a445TbpD3fyvnqE */
            public final /* synthetic */ Activity f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C19849a.lambda$4Z6xXWYXQqa6a445TbpD3fyvnqE(C57766ad.this, this.f$1);
            }
        });
    }

    /* renamed from: b */
    private boolean m72403b(Activity activity, WebView webView, Message message, Bundle bundle) {
        try {
            WindowOpenDelegate windowOpenDelegate = (WindowOpenDelegate) bundle.getParcelable("intent_key_window_open_impl");
            if (windowOpenDelegate == null) {
                return false;
            }
            return windowOpenDelegate.mo91879a(activity, webView, message, bundle);
        } catch (Exception e) {
            Log.m165385e("MultiWindowHelper", "biz multi window open impl analyse failed", e, true);
            return false;
        }
    }

    /* renamed from: a */
    public void mo67250a(Activity activity, WebView webView, Message message, Bundle bundle) {
        if (message != null && !m72403b(activity, webView, message, bundle)) {
            this.f48449b = message;
            this.f48450c = new WeakReference<>(webView);
            m72400a(activity, bundle);
        }
    }
}
