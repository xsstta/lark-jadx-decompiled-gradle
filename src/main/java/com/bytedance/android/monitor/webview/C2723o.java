package com.bytedance.android.monitor.webview;

import android.webkit.WebView;
import com.bytedance.android.monitor.executor.MonitorExecutor;
import com.bytedance.android.monitor.p109f.C2648b;
import com.bytedance.android.monitor.p112i.C2657e;
import com.bytedance.android.monitor.webview.p118b.AbstractC2680a;
import com.bytedance.android.monitor.webview.p119c.p120a.AbstractC2694c;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.webview.o */
public class C2723o {

    /* renamed from: a */
    public Map<WebView, List<AbstractC2680a.AbstractC2681a>> f8647a = new WeakHashMap();

    /* renamed from: b */
    private Map<WebView, String> f8648b = new WeakHashMap();

    /* renamed from: c */
    private Map<WebView, Long> f8649c = new WeakHashMap();

    /* renamed from: d */
    private Map<WebView, Boolean> f8650d = new WeakHashMap();

    /* renamed from: e */
    private Map<WebView, Long> f8651e = new WeakHashMap();

    /* renamed from: f */
    private Map<WebView, Long> f8652f = new WeakHashMap();

    /* renamed from: g */
    private Map<WebView, Long> f8653g = new WeakHashMap();

    /* renamed from: h */
    private Map<WebView, Boolean> f8654h = new WeakHashMap();

    /* renamed from: i */
    private Map<WebView, Boolean> f8655i = new WeakHashMap();

    /* renamed from: j */
    private Map<WebView, Map<String, Integer>> f8656j = new WeakHashMap();

    /* renamed from: a */
    public Map<WebView, Long> mo11728a() {
        return this.f8649c;
    }

    /* renamed from: f */
    public String mo11737f(WebView webView) {
        return this.f8648b.get(webView);
    }

    /* renamed from: g */
    public void mo11738g(WebView webView) {
        this.f8654h.put(webView, true);
    }

    /* renamed from: i */
    public Map<String, Integer> mo11740i(WebView webView) {
        return this.f8656j.remove(webView);
    }

    /* renamed from: b */
    public boolean mo11733b(WebView webView) {
        Boolean bool = this.f8655i.get(webView);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo11736e(WebView webView) {
        Boolean bool = this.f8650d.get(webView);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: h */
    public boolean mo11739h(WebView webView) {
        Boolean bool = this.f8654h.get(webView);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: a */
    public void mo11729a(WebView webView) {
        this.f8651e.put(webView, Long.valueOf(System.currentTimeMillis()));
        C2648b.m11130a("WebviewCache", "handleViewCreate: " + webView);
    }

    /* renamed from: c */
    public void mo11734c(WebView webView) {
        this.f8652f.put(webView, Long.valueOf(System.currentTimeMillis()));
        C2648b.m11130a("WebviewCache", "handleViewAttach: " + webView);
    }

    /* renamed from: d */
    public void mo11735d(WebView webView) {
        this.f8653g.put(webView, Long.valueOf(System.currentTimeMillis()));
        C2648b.m11130a("WebviewCache", "handleViewDetach: " + webView);
    }

    /* renamed from: j */
    public JSONObject mo11741j(WebView webView) {
        JSONObject jSONObject = new JSONObject();
        C2657e.m11173a(jSONObject, "attach_ts", this.f8652f.get(webView));
        C2657e.m11173a(jSONObject, "detach_ts", this.f8653g.get(webView));
        C2657e.m11173a(jSONObject, "container_init_ts", this.f8651e.get(webView));
        C2657e.m11173a(jSONObject, "container_reuse", (Object) Boolean.valueOf(mo11736e(webView)));
        return jSONObject;
    }

    /* renamed from: a */
    public void mo11730a(final WebView webView, final AbstractC2694c cVar) {
        MonitorExecutor.f8417a.mo11452a(new Runnable() {
            /* class com.bytedance.android.monitor.webview.C2723o.RunnableC27241 */

            public void run() {
                List<AbstractC2680a.AbstractC2681a> list = C2723o.this.f8647a.get(webView);
                if (list != null) {
                    for (AbstractC2680a.AbstractC2681a aVar : list) {
                        if (aVar != null) {
                            aVar.mo11566a(cVar);
                        }
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public void mo11732a(WebView webView, boolean z) {
        this.f8655i.put(webView, Boolean.valueOf(z));
    }

    /* renamed from: a */
    public void mo11731a(WebView webView, String str) {
        if (this.f8649c.get(webView) != null) {
            this.f8650d.put(webView, true);
        }
        this.f8649c.put(webView, Long.valueOf(System.currentTimeMillis()));
        this.f8648b.put(webView, str);
        C2648b.m11130a("WebviewCache", "handleLoadUrl: " + webView);
    }
}
