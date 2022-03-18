package com.bytedance.android.monitor.webview;

import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.android.monitor.p104a.AbstractC2633e;
import com.bytedance.android.monitor.p112i.C2657e;
import com.bytedance.android.monitor.p112i.C2658g;
import com.bytedance.android.monitor.webview.p119c.p120a.AbstractC2692a;
import com.bytedance.android.monitor.webview.p119c.p120a.AbstractC2693b;
import com.bytedance.android.monitor.webview.p119c.p120a.AbstractC2694c;
import com.bytedance.android.monitor.webview.p119c.p121b.C2695a;
import com.bytedance.android.monitor.webview.p119c.p121b.C2697b;
import com.bytedance.android.monitor.webview.p119c.p121b.C2699c;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.webview.n */
class C2720n {

    /* renamed from: a */
    private C2697b f8639a;

    /* renamed from: b */
    private C2699c f8640b;

    /* renamed from: c */
    private C2723o f8641c;

    /* renamed from: d */
    private Map<String, AbstractC2693b> f8642d = new HashMap();

    /* renamed from: a */
    public void mo11717a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            m11569h().mo11608a(C2657e.m11170a(str2));
        }
    }

    /* renamed from: a */
    public void mo11719a(JSONObject jSONObject) {
        this.f8639a.mo11619c(jSONObject);
    }

    /* renamed from: a */
    public void mo11718a(Map<String, Integer> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                mo11716a(str, map.get(str).intValue());
            }
        }
    }

    /* renamed from: b */
    public void mo11720b() {
        m11569h().mo11632q();
    }

    /* renamed from: c */
    public void mo11723c() {
        m11569h().mo11629n();
    }

    /* renamed from: d */
    public void mo11725d() {
        m11569h().mo11630o();
    }

    /* renamed from: e */
    public String mo11726e() {
        return this.f8639a.mo11617c();
    }

    /* renamed from: f */
    public long mo11727f() {
        return this.f8639a.mo11620d();
    }

    /* renamed from: g */
    private void m11568g() {
        m11566a("falconPerf", new C2695a(this.f8639a));
    }

    /* renamed from: a */
    public void mo11708a() {
        m11569h().mo11631p();
    }

    /* renamed from: h */
    private C2699c m11569h() {
        if (this.f8640b == null) {
            this.f8640b = new C2699c(this.f8639a, "perf");
        }
        return this.f8640b;
    }

    /* renamed from: a */
    public void mo11714a(C2723o oVar) {
        this.f8641c = oVar;
    }

    /* renamed from: b */
    public void mo11722b(String str) {
        m11569h().mo11627b(str);
    }

    /* renamed from: a */
    public void mo11709a(int i) {
        m11569h().mo11624a(i);
    }

    /* renamed from: b */
    public void mo11721b(WebView webView) {
        C2699c h = m11569h();
        mo11712a(webView, h);
        m11569h().mo11607l();
        this.f8641c.mo11730a(webView, h);
    }

    /* renamed from: c */
    private void m11567c(WebView webView) {
        for (AbstractC2693b bVar : this.f8642d.values()) {
            if (bVar.mo11606k() && (bVar instanceof AbstractC2694c)) {
                mo11712a(webView, (AbstractC2694c) bVar);
                bVar.mo11607l();
            }
        }
    }

    /* renamed from: a */
    public void mo11710a(long j) {
        m11569h().mo11625a(j);
    }

    /* renamed from: a */
    public void mo11711a(WebView webView) {
        mo11721b(webView);
        m11567c(webView);
    }

    /* renamed from: c */
    public boolean mo11724c(String str) {
        if (!m11569h().mo11628m().contains(str)) {
            return true;
        }
        if ("blank".equals(str) || "performance".equals(str) || "resource_performance".equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo11715a(String str) {
        m11569h().mo11626a(str);
    }

    /* renamed from: a */
    private void m11566a(String str, AbstractC2693b bVar) {
        this.f8642d.put(str, bVar);
    }

    /* renamed from: a */
    public void mo11712a(WebView webView, AbstractC2694c cVar) {
        AbstractC2633e i;
        if (webView != null && cVar != null && cVar.mo11606k() && (i = C2711i.m11492d().mo11667i(webView)) != null) {
            i.mo11410a(cVar);
        }
    }

    /* renamed from: a */
    public void mo11716a(String str, int i) {
        this.f8639a.mo11616b(str, Integer.valueOf(i));
    }

    /* renamed from: a */
    public void mo11713a(WebView webView, final String str, JSONObject jSONObject, final JSONObject jSONObject2) {
        C2697b bVar = this.f8639a;
        C27211 r7 = new AbstractC2694c(bVar, bVar.f8408c, str) {
            /* class com.bytedance.android.monitor.webview.C2720n.C27211 */

            @Override // com.bytedance.android.monitor.webview.p119c.p120a.AbstractC2694c
            /* renamed from: j */
            public AbstractC2692a mo11408d() {
                if (jSONObject2 == null) {
                    return null;
                }
                return new AbstractC2692a(str) {
                    /* class com.bytedance.android.monitor.webview.C2720n.C27211.C27221 */

                    @Override // com.bytedance.android.monitor.webview.p119c.p120a.AbstractC2692a
                    /* renamed from: b */
                    public void mo11602b() {
                    }

                    @Override // com.bytedance.android.monitor.p104a.AbstractC2629a
                    /* renamed from: a */
                    public void mo11404a(JSONObject jSONObject) {
                        C2657e.m11175a(jSONObject, jSONObject2);
                    }

                    {
                        mo11604d();
                    }
                };
            }
        };
        r7.mo11608a(jSONObject);
        mo11712a(webView, r7);
    }

    C2720n(WebView webView, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        C2697b bVar = new C2697b();
        this.f8639a = bVar;
        bVar.mo11612a(new SoftReference<>(webView));
        this.f8639a.mo11611a(str);
        this.f8639a.mo11615b(str2);
        this.f8639a.mo11618c(str3);
        this.f8639a.mo11610a(j);
        this.f8639a.mo11614b(j2);
        this.f8639a.mo11621d(C2658g.m11184a());
        this.f8639a.mo11449b(jSONObject);
        m11568g();
    }
}
