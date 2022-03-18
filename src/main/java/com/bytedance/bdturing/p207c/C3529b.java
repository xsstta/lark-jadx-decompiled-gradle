package com.bytedance.bdturing.p207c;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.bytedance.bdturing.LogUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.bdturing.c.b */
public class C3529b {

    /* renamed from: a */
    public WebView f11150a;

    /* renamed from: b */
    public Handler f11151b;

    /* renamed from: a */
    public void mo14303a() {
        if (this.f11150a != null) {
            this.f11151b.post(new Runnable() {
                /* class com.bytedance.bdturing.p207c.C3529b.RunnableC35312 */

                /* renamed from: a */
                WebView f11155a;

                public void run() {
                    this.f11155a.stopLoading();
                    this.f11155a.loadUrl("about:blank");
                    this.f11155a.clearCache(true);
                    this.f11155a.clearHistory();
                    ViewParent parent = this.f11155a.getParent();
                    if (parent != null && (parent instanceof ViewGroup)) {
                        ((ViewGroup) parent).removeView(this.f11155a);
                    }
                    this.f11155a.destroy();
                }

                {
                    this.f11155a = C3529b.this.f11150a;
                }
            });
            this.f11151b = null;
            this.f11150a = null;
        }
    }

    /* renamed from: com.bytedance.bdturing.c.b$a */
    private class C3532a {

        /* renamed from: a */
        public AbstractC3528a f11157a;

        @JavascriptInterface
        public void offMethodParams(String str) {
            LogUtil.m14899d("JsBridgeModule", "JS called method ======= offMethodParams(" + str + ")");
        }

        @JavascriptInterface
        public void callMethodParams(final String str) {
            LogUtil.m14899d("JsBridgeModule", "JS called method ======= callMethodParams(" + str + ")");
            if (C3529b.this.f11151b == null) {
                LogUtil.m14895a("JsBridgeModule", "uihandler is null");
            } else {
                C3529b.this.f11151b.post(new Runnable() {
                    /* class com.bytedance.bdturing.p207c.C3529b.C3532a.RunnableC35331 */

                    public void run() {
                        C3532a.this.f11157a.mo14302b(new C3534c(C3529b.this, str));
                    }
                });
            }
        }

        @JavascriptInterface
        public void onMethodParams(String str) {
            LogUtil.m14899d("JsBridgeModule", "JS called method ======= onMethodParams(" + str + ")");
            try {
                new JSONObject(str).getString("__callback_id");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public C3532a(AbstractC3528a aVar) {
            this.f11157a = aVar;
        }
    }

    /* renamed from: a */
    public void mo14304a(final String str) {
        Handler handler;
        if (str != null && this.f11150a != null && (handler = this.f11151b) != null) {
            handler.post(new Runnable() {
                /* class com.bytedance.bdturing.p207c.C3529b.RunnableC35301 */

                /* renamed from: a */
                WebView f11152a;

                public void run() {
                    if (Build.VERSION.SDK_INT >= 19) {
                        WebView webView = this.f11152a;
                        webView.evaluateJavascript("javascript:window.Native2JSBridge._handleMessageFromApp(" + str + ")", null);
                        StringBuilder sb = new StringBuilder();
                        sb.append("callJsCode ====== ");
                        sb.append(str);
                        LogUtil.m14897b("JsBridgeModule", sb.toString());
                        return;
                    }
                    WebView webView2 = this.f11152a;
                    webView2.loadUrl("javascript:window.Native2JSBridge._handleMessageFromApp('" + str + "')");
                }

                {
                    this.f11152a = C3529b.this.f11150a;
                }
            });
            LogUtil.m14899d("JsBridgeModule", "callJsCode ====== " + str);
        }
    }

    public C3529b(AbstractC3528a aVar, WebView webView) {
        this.f11150a = webView;
        if (webView != null) {
            webView.getSettings().setJavaScriptEnabled(true);
            this.f11150a.addJavascriptInterface(new C3532a(aVar), "androidJsBridge");
            this.f11151b = new Handler(Looper.getMainLooper());
        }
    }
}
