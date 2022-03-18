package com.bytedance.android.monitor.webview.p119c.p121b;

import android.app.Activity;
import android.webkit.WebView;
import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.android.monitor.executor.MonitorExecutor;
import com.bytedance.android.monitor.p106c.C2645c;
import com.bytedance.android.monitor.p112i.C2654b;
import com.bytedance.android.monitor.p112i.C2657e;
import com.bytedance.android.monitor.webview.C2711i;
import java.lang.ref.SoftReference;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.webview.c.b.b */
public class C2697b extends C2645c {

    /* renamed from: j */
    public SoftReference<WebView> f8562j;

    /* renamed from: k */
    public String f8563k;

    /* renamed from: l */
    private long f8564l;

    /* renamed from: m */
    private JSONObject f8565m = new JSONObject();

    /* renamed from: n */
    private JSONObject f8566n = new JSONObject();

    /* renamed from: c */
    public String mo11617c() {
        return this.f8406a;
    }

    /* renamed from: d */
    public long mo11620d() {
        return this.f8410e;
    }

    /* renamed from: e */
    public long mo11622e() {
        return this.f8564l;
    }

    /* renamed from: f */
    private void m11366f() {
        MonitorExecutor.f8417a.mo11452a(new Runnable() {
            /* class com.bytedance.android.monitor.webview.p119c.p121b.C2697b.RunnableC26981 */

            public void run() {
                Activity a;
                WebView webView = C2697b.this.f8562j.get();
                if (webView != null && (a = C2654b.m11157a(webView.getContext())) != null) {
                    HybridMonitor.getInstance().wrapTouchTraceCallback(a);
                    C2697b.this.f8563k = a.getClass().getName();
                }
            }
        });
    }

    /* renamed from: b */
    public SoftReference<WebView> mo11613b() {
        SoftReference<WebView> softReference = this.f8562j;
        if (softReference != null) {
            return softReference;
        }
        return new SoftReference<>(null);
    }

    /* renamed from: a */
    public void mo11610a(long j) {
        this.f8410e = j;
    }

    /* renamed from: b */
    public void mo11614b(long j) {
        this.f8564l = j;
    }

    /* renamed from: a */
    public void mo11611a(String str) {
        this.f8408c = str;
    }

    /* renamed from: b */
    public void mo11615b(String str) {
        this.f8409d = str;
    }

    /* renamed from: c */
    public void mo11618c(String str) {
        this.f8406a = str;
    }

    /* renamed from: d */
    public void mo11621d(String str) {
        this.f8407b = str;
    }

    /* renamed from: a */
    public void mo11612a(SoftReference<WebView> softReference) {
        this.f8562j = softReference;
        m11366f();
        this.f8411f = C2711i.m11492d().mo11664f(softReference.get());
    }

    /* renamed from: c */
    public void mo11619c(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            C2657e.m11173a(this.f8565m, next, C2657e.m11180e(jSONObject, next));
        }
    }

    @Override // com.bytedance.android.monitor.p104a.AbstractC2629a, com.bytedance.android.monitor.p106c.C2645c
    /* renamed from: a */
    public void mo11404a(JSONObject jSONObject) {
        super.mo11404a(jSONObject);
        C2657e.m11174a(jSONObject, "js_dependency_version", "2.2.1");
        C2657e.m11174a(jSONObject, "native_page", this.f8563k);
        C2657e.m11174a(jSONObject, "webview_type", this.f8409d);
        C2657e.m11175a(jSONObject, this.f8565m);
        C2657e.m11175a(jSONObject, this.f8566n);
        JSONObject optJSONObject = jSONObject.optJSONObject("debug_context");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
            C2657e.m11173a(jSONObject, "debug_context", optJSONObject);
        }
        C2657e.m11173a(optJSONObject, "is_ttweb_enable", (Object) Boolean.valueOf(((C2711i) C2711i.m11480a()).mo11682c()));
    }

    /* renamed from: b */
    public void mo11616b(String str, Object obj) {
        C2657e.m11173a(this.f8566n, str, obj);
    }
}
