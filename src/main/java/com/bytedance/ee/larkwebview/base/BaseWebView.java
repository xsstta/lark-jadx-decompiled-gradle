package com.bytedance.ee.larkwebview.base;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.ee.larkwebview.monitor.dependency.IMonitorDependency;
import com.bytedance.ee.larkwebview.monitor.webview.WebMonitorManager;
import com.bytedance.ee.larkwebview.p667a.C13390c;
import com.bytedance.ee.larkwebview.p667a.C13393d;
import com.bytedance.ee.larkwebview.p667a.C13395e;
import com.bytedance.ee.larkwebview.p668b.C13398b;
import com.bytedance.ee.larkwebview.p671d.p675c.C13436a;
import com.bytedance.ee.larkwebview.p677e.C13439c;
import com.bytedance.ee.larkwebview.service.AbstractC13467b;
import com.bytedance.ee.larkwebview.service.C13477l;
import com.bytedance.ee.larkwebview.service.p681a.C13462c;
import com.bytedance.lynx.webview.TTWebSdk;
import com.ss.android.lark.log.Log;
import java.util.HashMap;
import java.util.Map;

public abstract class BaseWebView extends WebView implements AbstractC13402a, IMonitorDependency {

    /* renamed from: a */
    private C13390c f35313a;

    /* renamed from: b */
    private C13405d f35314b;

    /* renamed from: c */
    private C13404c f35315c;

    /* renamed from: d */
    private boolean f35316d;

    /* renamed from: e */
    private C13436a f35317e;

    /* renamed from: s */
    protected volatile C13477l f35318s;

    /* renamed from: t */
    protected C13407f f35319t;

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract void mo49720q();

    /* access modifiers changed from: protected */
    public C13436a getSecLinkChecker() {
        return this.f35317e;
    }

    public C13407f getWebTimeHelper() {
        return this.f35319t;
    }

    public C13390c getWebViewConfig() {
        return this.f35313a;
    }

    /* renamed from: p */
    public boolean mo49719p() {
        return this.f35316d;
    }

    @Override // com.bytedance.ee.larkwebview.base.AbstractC13402a
    public Context getWebViewContext() {
        return getContext();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        resumeTimers();
    }

    /* renamed from: r */
    public boolean mo49721r() {
        return TTWebSdk.isTTWebView();
    }

    public WebViewClient getWebViewClient() {
        C13405d dVar = this.f35314b;
        if (dVar != null) {
            return dVar.mo49744b();
        }
        return null;
    }

    /* renamed from: s */
    public void mo49722s() {
        if (mo49721r()) {
            evaluateJavascript("ttwebview:/*enableTTLogEvent*/;", null);
        }
    }

    /* renamed from: b */
    private void mo22336b() {
        this.f35318s = new C13477l();
        this.f35318s.mo49930a(C13462c.class);
        mo49720q();
    }

    /* renamed from: a */
    private void mo19616a() {
        this.f35319t = new C13407f();
        C13390c a = C13390c.m54449a(getContext());
        this.f35313a = a;
        setWebViewConfig(a);
        this.f35314b = new C13405d(this);
        this.f35315c = new C13404c(this);
        setWebViewClientInternal(this.f35314b);
        setWebChromeClientInternal(this.f35315c);
        mo22336b();
        this.f35317e = new C13436a(this);
        Log.m165389i("BaseWebView", "initWebView done");
    }

    public boolean canGoBack() {
        AbstractC13467b bVar = (AbstractC13467b) this.f35318s.mo49931b(AbstractC13467b.class);
        if (bVar == null) {
            return super.canGoBack();
        }
        boolean a = bVar.mo49894a(copyBackForwardList());
        boolean canGoBack = super.canGoBack();
        Log.m165389i("BaseWebView", "canGoBack proxy handle , canGoBack = " + a + " , super canGoBack = " + canGoBack);
        if (!a || !canGoBack) {
            return false;
        }
        return true;
    }

    public boolean canGoForward() {
        AbstractC13467b bVar = (AbstractC13467b) this.f35318s.mo49931b(AbstractC13467b.class);
        if (bVar == null) {
            return super.canGoForward();
        }
        boolean b = bVar.mo49896b(copyBackForwardList());
        boolean canGoForward = super.canGoForward();
        Log.m165389i("BaseWebView", "canGoForward proxy handle, canGoForward = " + b + ", base canGoForward " + canGoForward);
        if (!b || !canGoForward) {
            return false;
        }
        return true;
    }

    private void setWebChromeClientInternal(WebChromeClient webChromeClient) {
        super.setWebChromeClient(webChromeClient);
    }

    private void setWebViewClientInternal(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
    }

    public void setOpenFromMultiWindow(boolean z) {
        this.f35316d = z;
    }

    public BaseWebView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void mo22331a(String str) {
        super.loadUrl(str, new HashMap());
    }

    public void setWebViewConfig(C13390c cVar) {
        if (cVar != null) {
            mo49708a(cVar);
        } else {
            Log.m165397w("BaseWebView", "setWebViewConfig failed, config is null.");
        }
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        if (this.f35315c != null) {
            Log.m165389i("BaseWebView", "setWebChromeClient success");
            this.f35315c.mo49743c(webChromeClient);
            return;
        }
        WebMonitorManager.f35486a.mo49884f(this);
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        if (this.f35314b != null) {
            Log.m165389i("BaseWebView", "mWebViewClient setWebViewClient");
            this.f35314b.mo49745c(webViewClient);
            return;
        }
        WebMonitorManager.f35486a.mo49882e(this);
    }

    public void loadUrl(String str) {
        Log.m165389i("BaseWebView", "loadUrl");
        this.f35319t.mo49752a(str, System.currentTimeMillis());
        String a = this.f35317e.mo49837a(str);
        if (C13439c.m54613b()) {
            super.loadUrl(a, new HashMap());
        } else {
            C13439c.m54612a().mo49846a(new Runnable(a) {
                /* class com.bytedance.ee.larkwebview.base.$$Lambda$BaseWebView$eXhYwSZFKMi9X_24qxQZDnT5qwo */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    BaseWebView.this.mo22331a((BaseWebView) this.f$1);
                }
            });
        }
    }

    public boolean canGoBackOrForward(int i) {
        AbstractC13467b bVar = (AbstractC13467b) this.f35318s.mo49931b(AbstractC13467b.class);
        if (bVar == null) {
            return super.canGoBackOrForward(i);
        }
        boolean a = bVar.mo49895a(copyBackForwardList(), i);
        boolean canGoBackOrForward = super.canGoBackOrForward(i);
        Log.m165389i("BaseWebView", "canGoBackOrForward proxy handle, canGoBackOrForward = " + a + " , superCanGoBackOrForward " + canGoBackOrForward);
        if (!a || !canGoBackOrForward) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo49708a(C13390c cVar) {
        if (cVar == null) {
            Log.m165397w("BaseWebView", "updateWebViewConfig failed, config is null.");
            return;
        }
        this.f35313a = new C13390c.C13392a(getContext()).mo49698a(cVar);
        if (cVar.mo49694a() != null) {
            WebView.setWebContentsDebuggingEnabled(cVar.mo49694a().mo49692a());
        } else {
            Log.m165397w("BaseWebView", "setWebViewConfig failed, debuggableConfig is null.");
        }
        C13395e b = cVar.mo49695b();
        if (b != null) {
            b.mo49701a(this);
        } else {
            Log.m165397w("BaseWebView", "setWebViewConfig failed, webSettingConfig is null.");
        }
        C13393d c = cVar.mo49696c();
        if (c == null) {
            Log.m165397w("BaseWebView", "setPerformanceConfig failed, performanceConfig is null.");
        } else if (c.mo49699a()) {
            Log.m165389i("BaseWebView", "performanceConfig is enable");
            mo49722s();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m54470a(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    public BaseWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo19616a();
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        Log.m165389i("BaseWebView", "evaluateJavascript run");
        if (C13439c.m54613b()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            C13439c.m54612a().mo49846a(new Runnable(str, valueCallback) {
                /* class com.bytedance.ee.larkwebview.base.$$Lambda$BaseWebView$MOscPjDd7HERyIJvDTqif00CuI */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ ValueCallback f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    BaseWebView.this.m54470a((BaseWebView) this.f$1, (String) this.f$2);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m54473a(String str, Map map) {
        super.loadUrl(str, map);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        Log.m165389i("BaseWebView", "loadUrl additional");
        this.f35319t.mo49752a(str, System.currentTimeMillis());
        if (!(map == null || C13398b.m54466a() == null)) {
            map.put("Accept-Language", C13398b.m54466a().mo22593c());
        }
        String a = this.f35317e.mo49837a(str);
        if (C13439c.m54613b()) {
            super.loadUrl(a, map);
        } else {
            C13439c.m54612a().mo49846a(new Runnable(a, map) {
                /* class com.bytedance.ee.larkwebview.base.$$Lambda$BaseWebView$IS1VBbHWNCWStNHnpreUD1zQH7w */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ Map f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    BaseWebView.this.m54473a((BaseWebView) this.f$1, (String) this.f$2);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m54471a(String str, String str2, String str3) {
        super.loadData(str, str2, str3);
    }

    public void loadData(String str, String str2, String str3) {
        Log.m165389i("BaseWebView", "loadData");
        this.f35319t.mo49752a(getUrl(), System.currentTimeMillis());
        if (C13439c.m54613b()) {
            super.loadData(str, str2, str3);
        } else {
            C13439c.m54612a().mo49846a(new Runnable(str, str2, str3) {
                /* class com.bytedance.ee.larkwebview.base.$$Lambda$BaseWebView$08RAf9RuIJataFQy88E9sTg4UQ */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ String f$2;
                public final /* synthetic */ String f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                public final void run() {
                    BaseWebView.this.m54471a(this.f$1, this.f$2, this.f$3);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m54472a(String str, String str2, String str3, String str4, String str5) {
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        Log.m165389i("BaseWebView", "loadDataWithBaseUrl");
        this.f35319t.mo49752a(str, System.currentTimeMillis());
        if (C13439c.m54613b()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            C13439c.m54612a().mo49846a(new Runnable(str, str2, str3, str4, str5) {
                /* class com.bytedance.ee.larkwebview.base.$$Lambda$BaseWebView$fFG8_aioETncWtHYDiimYuPk */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ String f$2;
                public final /* synthetic */ String f$3;
                public final /* synthetic */ String f$4;
                public final /* synthetic */ String f$5;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                    this.f$5 = r6;
                }

                public final void run() {
                    BaseWebView.this.m54472a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5);
                }
            });
        }
    }
}
