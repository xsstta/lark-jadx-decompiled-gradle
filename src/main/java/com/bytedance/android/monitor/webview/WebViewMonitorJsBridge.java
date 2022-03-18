package com.bytedance.android.monitor.webview;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.bytedance.android.monitor.executor.MonitorExecutor;
import com.bytedance.android.monitor.p106c.C2641a;
import com.bytedance.android.monitor.p109f.C2648b;
import com.bytedance.android.monitor.p112i.C2655c;
import com.bytedance.android.monitor.p112i.C2657e;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class WebViewMonitorJsBridge {
    public WeakReference<WebView> mWebViewRef;
    public Handler mainHandler = new Handler(Looper.getMainLooper());

    @JavascriptInterface
    public String getVersion() {
        return "1.2.1-alpha.1";
    }

    @JavascriptInterface
    public void injectJS() {
        final long currentTimeMillis = System.currentTimeMillis();
        MonitorExecutor.f8417a.mo11452a(new Runnable() {
            /* class com.bytedance.android.monitor.webview.WebViewMonitorJsBridge.RunnableC26767 */

            public void run() {
                if (C2711i.m11492d().mo11665g(WebViewMonitorJsBridge.this.mWebViewRef.get())) {
                    C2711i.m11492d().mo11657a(WebViewMonitorJsBridge.this.mWebViewRef.get(), currentTimeMillis);
                }
            }
        });
    }

    @JavascriptInterface
    public void reportPageLatestData(final String str) {
        MonitorExecutor.f8417a.mo11452a(new Runnable() {
            /* class com.bytedance.android.monitor.webview.WebViewMonitorJsBridge.RunnableC26746 */

            public void run() {
                if (C2711i.m11492d().mo11665g(WebViewMonitorJsBridge.this.mWebViewRef.get())) {
                    final JSONObject a = C2657e.m11170a(str);
                    String b = C2657e.m11177b(a, "performance");
                    String b2 = C2657e.m11177b(C2657e.m11170a(b), "serviceType");
                    String b3 = C2657e.m11177b(a, "resource");
                    String b4 = C2657e.m11177b(C2657e.m11170a(b3), "serviceType");
                    final String b5 = C2657e.m11177b(a, "url");
                    C2711i.m11492d().mo11660a(WebViewMonitorJsBridge.this.mWebViewRef.get(), b5, b2, b);
                    C2711i.m11492d().mo11659a(WebViewMonitorJsBridge.this.mWebViewRef.get(), b4, b3);
                    WebViewMonitorJsBridge.this.mainHandler.post(new Runnable() {
                        /* class com.bytedance.android.monitor.webview.WebViewMonitorJsBridge.RunnableC26746.RunnableC26751 */

                        public void run() {
                            try {
                                C2648b.m11130a("TTLiveWebViewMonitorJsBridge", "reportPageLatestData : " + b5);
                                String b = C2657e.m11177b(a, "needReport");
                                if (!TextUtils.isEmpty(b) && b.equals("true")) {
                                    C2711i.m11480a().mo11593b(WebViewMonitorJsBridge.this.mWebViewRef.get());
                                }
                            } catch (Throwable th) {
                                C2655c.m11159a(th);
                            }
                        }
                    });
                }
            }
        });
    }

    public WebViewMonitorJsBridge(WebView webView) {
        this.mWebViewRef = new WeakReference<>(webView);
    }

    @JavascriptInterface
    public void batch(final String str) {
        if (C2711i.m11492d().mo11665g(this.mWebViewRef.get())) {
            MonitorExecutor.f8417a.mo11452a(new Runnable() {
                /* class com.bytedance.android.monitor.webview.WebViewMonitorJsBridge.RunnableC26713 */

                public void run() {
                    try {
                        JSONArray jSONArray = new JSONArray(str);
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String jSONObject2 = jSONObject.toString();
                            String b = C2657e.m11177b(jSONObject, "serviceType");
                            if (b.equals("")) {
                                JSONObject a = C2657e.m11170a(C2657e.m11177b(jSONObject, "category"));
                                C2711i.m11480a().mo11576a(WebViewMonitorJsBridge.this.mWebViewRef.get(), new C2641a.C2643a(C2657e.m11177b(jSONObject, "eventName")).mo11438a(a).mo11444c(C2657e.m11170a(C2657e.m11177b(jSONObject, "extra"))).mo11445d(C2657e.m11170a(C2657e.m11177b(jSONObject, "timing"))).mo11442b(C2657e.m11170a(C2657e.m11177b(jSONObject, "metrics"))).mo11439a(C2657e.m11176a(jSONObject, "canSample", (Boolean) true)).mo11440a());
                            } else if (b.equals("perf")) {
                                C2711i.m11492d().mo11660a(WebViewMonitorJsBridge.this.mWebViewRef.get(), C2657e.m11177b(jSONObject, "url"), b, jSONObject2);
                            } else {
                                C2711i.m11492d().mo11659a(WebViewMonitorJsBridge.this.mWebViewRef.get(), b, jSONObject2);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    @JavascriptInterface
    public void sendInitTimeInfo(final String str) {
        if (C2711i.m11492d().mo11665g(this.mWebViewRef.get())) {
            MonitorExecutor.f8417a.mo11452a(new Runnable() {
                /* class com.bytedance.android.monitor.webview.WebViewMonitorJsBridge.RunnableC26735 */

                public void run() {
                    C2711i.m11492d().mo11658a(WebViewMonitorJsBridge.this.mWebViewRef.get(), str);
                }
            });
        }
    }

    @JavascriptInterface
    public void cover(final String str, final String str2) {
        if (C2711i.m11492d().mo11665g(this.mWebViewRef.get())) {
            MonitorExecutor.f8417a.mo11452a(new Runnable() {
                /* class com.bytedance.android.monitor.webview.WebViewMonitorJsBridge.RunnableC26691 */

                public void run() {
                    try {
                        C2711i.m11492d().mo11660a(WebViewMonitorJsBridge.this.mWebViewRef.get(), C2657e.m11177b(C2657e.m11170a(str), "url"), str2, str);
                    } catch (Throwable th) {
                        C2655c.m11159a(th);
                    }
                }
            });
        }
    }

    @JavascriptInterface
    public void reportDirectly(final String str, final String str2) {
        if (C2711i.m11492d().mo11665g(this.mWebViewRef.get())) {
            MonitorExecutor.f8417a.mo11452a(new Runnable() {
                /* class com.bytedance.android.monitor.webview.WebViewMonitorJsBridge.RunnableC26702 */

                public void run() {
                    try {
                        C2711i.m11492d().mo11659a(WebViewMonitorJsBridge.this.mWebViewRef.get(), str2, str);
                    } catch (Throwable th) {
                        C2655c.m11159a(th);
                    }
                }
            });
        }
    }

    @JavascriptInterface
    public void customReport(final String str, final String str2, final String str3, final boolean z, final String str4, final String str5) {
        if (C2711i.m11492d().mo11665g(this.mWebViewRef.get()) && !TextUtils.isEmpty(str)) {
            MonitorExecutor.f8417a.mo11452a(new Runnable() {
                /* class com.bytedance.android.monitor.webview.WebViewMonitorJsBridge.RunnableC26724 */

                public void run() {
                    try {
                        JSONObject a = C2657e.m11170a(str3);
                        JSONObject a2 = C2657e.m11170a(str2);
                        JSONObject a3 = C2657e.m11170a(str4);
                        C2711i.m11480a().mo11576a(WebViewMonitorJsBridge.this.mWebViewRef.get(), new C2641a.C2643a(str).mo11438a(a).mo11442b(a2).mo11444c(a3).mo11445d(C2657e.m11170a(str5)).mo11439a(z).mo11440a());
                    } catch (Throwable th) {
                        C2655c.m11159a(th);
                    }
                }
            });
        }
    }
}
