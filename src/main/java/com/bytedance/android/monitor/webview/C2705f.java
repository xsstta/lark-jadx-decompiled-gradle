package com.bytedance.android.monitor.webview;

import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.android.monitor.executor.MonitorExecutor;
import com.bytedance.android.monitor.p106c.C2644b;
import com.bytedance.android.monitor.p109f.C2648b;
import com.bytedance.android.monitor.p112i.C2657e;
import com.bytedance.android.monitor.p112i.C2660i;
import com.bytedance.android.monitor.webview.p118b.AbstractC2682b;
import com.bytedance.android.monitor.webview.p118b.AbstractC2685e;
import com.bytedance.android.monitor.webview.p118b.AbstractC2686f;
import com.bytedance.p754g.p755a.C14180a;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.webview.f */
public class C2705f implements AbstractC2701d {

    /* renamed from: b */
    private static volatile C2705f f8590b;

    /* renamed from: a */
    public C2723o f8591a = new C2723o();

    /* renamed from: c */
    private C2719m f8592c = new C2719m();

    /* renamed from: d */
    private Map<WebView, List<C2720n>> f8593d = new WeakHashMap();

    @Override // com.bytedance.android.monitor.webview.AbstractC2701d
    /* renamed from: a */
    public boolean mo11641a(WebView webView) {
        return this.f8591a.mo11733b(webView);
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC2701d
    /* renamed from: a */
    public void mo11640a(final WebView webView, final String str, final boolean z, final int i, final String str2, final int i2) {
        MonitorExecutor.f8417a.mo11452a(new Runnable() {
            /* class com.bytedance.android.monitor.webview.C2705f.RunnableC27061 */

            public void run() {
                String str;
                JSONObject jSONObject = new JSONObject();
                C2657e.m11174a(jSONObject, "event_type", "nativeError");
                C2657e.m11171a(jSONObject, "error_code", i);
                C2657e.m11174a(jSONObject, "error_msg", str2);
                if (z) {
                    str = "main_frame";
                } else {
                    str = "child_resource";
                }
                C2657e.m11174a(jSONObject, "scene", str);
                C2657e.m11174a(jSONObject, "error_url", str);
                C2657e.m11171a(jSONObject, "http_status", i2);
                C2705f.this.mo11668a(webView, "nativeError", jSONObject);
                C2648b.m11130a("MonitorCacheInfoHandler", "handleRequestError: ");
            }
        });
    }

    /* renamed from: a */
    public void mo11668a(WebView webView, String str, JSONObject jSONObject) {
        C2720n l = m11436l(webView);
        if (l != null && l.mo11724c(str)) {
            l.mo11719a(m11440p(webView));
            l.mo11713a(webView, str, null, jSONObject);
            l.mo11722b(str);
        }
    }

    private C2705f() {
    }

    /* renamed from: a */
    public static C2705f m11432a() {
        if (f8590b == null) {
            synchronized (C2705f.class) {
                if (f8590b == null) {
                    f8590b = new C2705f();
                }
            }
        }
        return f8590b;
    }

    /* renamed from: o */
    private Map<String, Integer> m11439o(WebView webView) {
        return this.f8591a.mo11740i(webView);
    }

    /* renamed from: p */
    private JSONObject m11440p(WebView webView) {
        return this.f8591a.mo11741j(webView);
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC2701d
    /* renamed from: b */
    public void mo11642b(WebView webView) {
        this.f8591a.mo11729a(webView);
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC2701d
    /* renamed from: c */
    public void mo11644c(WebView webView) {
        this.f8591a.mo11734c(webView);
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC2701d
    /* renamed from: d */
    public void mo11646d(WebView webView) {
        this.f8591a.mo11735d(webView);
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC2701d
    /* renamed from: e */
    public void mo11648e(WebView webView) {
        this.f8591a.mo11738g(webView);
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC2701d
    /* renamed from: f */
    public boolean mo11650f(WebView webView) {
        return this.f8591a.mo11739h(webView);
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC2701d
    /* renamed from: j */
    public AbstractC2682b mo11654j(final WebView webView) {
        return new AbstractC2682b() {
            /* class com.bytedance.android.monitor.webview.C2705f.C27083 */

            @Override // com.bytedance.android.monitor.webview.p118b.AbstractC2682b
            /* renamed from: a */
            public String mo11567a() {
                return C2711i.m11492d().mo11664f(webView);
            }

            @Override // com.bytedance.android.monitor.webview.p118b.AbstractC2682b
            /* renamed from: b */
            public String mo11568b() {
                return C2711i.m11492d().mo11663e(webView);
            }

            @Override // com.bytedance.android.monitor.webview.p118b.AbstractC2682b
            /* renamed from: c */
            public String mo11569c() {
                C2720n k = C2705f.this.mo11669k(webView);
                if (k != null) {
                    return k.mo11726e();
                }
                return C2705f.this.f8591a.mo11737f(webView);
            }
        };
    }

    /* renamed from: k */
    public C2720n mo11669k(WebView webView) {
        return m11436l(webView);
    }

    /* renamed from: m */
    private synchronized List<C2720n> m11437m(WebView webView) {
        return this.f8593d.remove(webView);
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC2701d
    /* renamed from: g */
    public boolean mo11651g(WebView webView) {
        if (m11436l(webView) != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC2701d
    /* renamed from: h */
    public String mo11652h(WebView webView) {
        C2720n l = m11436l(webView);
        if (l != null) {
            return l.mo11726e();
        }
        return null;
    }

    /* renamed from: n */
    private void m11438n(WebView webView) {
        JSONObject jSONObject = new JSONObject();
        C2657e.m11172a(jSONObject, "invoke_ts", System.currentTimeMillis());
        mo11668a(webView, "navigationStart", jSONObject);
        C2648b.m11130a("MonitorCacheInfoHandler", "handlePv");
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC2701d
    /* renamed from: i */
    public void mo11653i(WebView webView) {
        C2720n l = m11436l(webView);
        if (l != null) {
            l.mo11720b();
        }
        C2648b.m11130a("MonitorCacheInfoHandler", "handlePageExit: " + webView);
    }

    /* renamed from: l */
    private synchronized C2720n m11436l(WebView webView) {
        List<C2720n> list = this.f8593d.get(webView);
        if (list == null || list.size() <= 0) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC2701d
    /* renamed from: a */
    public void mo11637a(WebView webView, String str) {
        this.f8591a.mo11731a(webView, str);
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC2701d
    /* renamed from: a */
    public void mo11633a(WebView webView, int i) {
        C2720n l = m11436l(webView);
        if (l != null) {
            l.mo11709a(i);
        }
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC2701d
    /* renamed from: d */
    public void mo11647d(WebView webView, String str) {
        C2720n l = m11436l(webView);
        if (l != null) {
            l.mo11715a(str);
        }
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC2701d
    /* renamed from: c */
    public void mo11645c(WebView webView, String str) {
        C2720n l = m11436l(webView);
        if (l != null) {
            l.mo11725d();
        }
        C2648b.m11130a("MonitorCacheInfoHandler", "handlePageFinish: " + webView);
    }

    /* renamed from: a */
    private synchronized void m11433a(WebView webView, C2720n nVar) {
        List<C2720n> list = this.f8593d.get(webView);
        if (list != null) {
            list.remove(nVar);
        }
    }

    /* renamed from: f */
    private synchronized C2720n m11434f(WebView webView, String str) {
        List<C2720n> list = this.f8593d.get(webView);
        if (list != null && list.size() > 0) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C2720n nVar = list.get(size);
                if (nVar != null && nVar.mo11726e().equals(str)) {
                    return nVar;
                }
            }
        }
        return null;
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC2701d
    /* renamed from: a */
    public void mo11634a(WebView webView, long j) {
        C2720n l = m11436l(webView);
        if (l != null) {
            l.mo11710a(j);
        }
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC2701d
    /* renamed from: b */
    public void mo11643b(WebView webView, String str) {
        String h = mo11652h(webView);
        if (!TextUtils.isEmpty(h)) {
            mo11653i(webView);
        }
        if (str.equals(h) && mo11669k(webView).mo11727f() == C2660i.m11188a()) {
            C2648b.m11130a("MonitorCacheInfoHandler", "handlePageStart : clickStart is same");
        } else if (str == null || !str.equals("about:blank")) {
            m11435g(webView, str);
            C2720n l = m11436l(webView);
            if (l != null) {
                l.mo11708a();
                l.mo11723c();
            }
            m11438n(webView);
            C2648b.m11130a("MonitorCacheInfoHandler", "handlePageStart: " + webView + "   url : " + str);
        }
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC2701d
    /* renamed from: e */
    public void mo11649e(WebView webView, String str) {
        C2720n l;
        if ("loc_after_detach".equals(str)) {
            List<C2720n> m = m11437m(webView);
            if (m != null) {
                for (C2720n nVar : m) {
                    nVar.mo11719a(m11440p(webView));
                    nVar.mo11711a(webView);
                }
            }
        } else if (("loc_after_tti".equals(str) || "loc_force".equals(str)) && (l = m11436l(webView)) != null) {
            l.mo11719a(m11440p(webView));
            l.mo11721b(webView);
        }
        this.f8591a.mo11732a(webView, true);
    }

    /* renamed from: g */
    private C2720n m11435g(WebView webView, String str) {
        String str2;
        C2648b.m11130a("MonitorCacheInfoHandler", "buildNewNavigation cache new url : " + str);
        AbstractC2685e eVar = (AbstractC2685e) C2711i.m11492d();
        JSONObject jSONObject = new JSONObject();
        if (((C2711i) C2711i.m11480a()).mo11693x(webView) != null) {
            jSONObject = ((C2711i) C2711i.m11480a()).mo11693x(webView).f8525A;
        }
        if (eVar.mo11573u(webView)) {
            str2 = "ttweb";
        } else {
            str2 = "web";
        }
        C2720n nVar = new C2720n(webView, "web", str2, str, C2660i.m11188a(), this.f8591a.mo11728a().get(webView).longValue(), jSONObject);
        nVar.mo11718a(m11439o(webView));
        nVar.mo11714a(this.f8591a);
        List<C2720n> list = this.f8593d.get(webView);
        if (list == null) {
            list = new ArrayList<>();
            this.f8593d.put(webView, list);
        }
        list.add(nVar);
        return nVar;
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC2701d
    /* renamed from: a */
    public void mo11635a(final WebView webView, final C2644b bVar) {
        MonitorExecutor.f8417a.mo11452a(new Runnable() {
            /* class com.bytedance.android.monitor.webview.C2705f.RunnableC27072 */

            public void run() {
                JSONObject jSONObject = new JSONObject();
                C2657e.m11174a(jSONObject, "event_type", "jsbError");
                C2657e.m11174a(jSONObject, "bridge_name", bVar.f8401c);
                C2657e.m11174a(jSONObject, "error_activity", bVar.f8405g);
                C2657e.m11171a(jSONObject, "error_code", bVar.f8399a);
                C2657e.m11174a(jSONObject, "error_message", bVar.f8400b);
                C2657e.m11174a(jSONObject, "js_type", bVar.f8402d);
                C2657e.m11174a(jSONObject, "error_url", bVar.f8404f);
                C2657e.m11171a(jSONObject, "is_sync", bVar.f8403e);
                C2705f.this.mo11668a(webView, "jsbError", jSONObject);
                C2648b.m11130a("MonitorCacheInfoHandler", "handleJSBError: ");
            }
        });
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC2701d
    /* renamed from: a */
    public void mo11636a(WebView webView, C14180a.C14181a aVar, AbstractC2686f fVar) {
        int i;
        if (aVar != null) {
            JSONObject jSONObject = new JSONObject();
            C2657e.m11174a(jSONObject, "event_type", "blank");
            boolean z = false;
            if (aVar.f37290a == 1) {
                i = 1;
            } else {
                i = 0;
            }
            C2657e.m11171a(jSONObject, "is_blank", i);
            C2657e.m11171a(jSONObject, "detect_type", 0);
            C2657e.m11172a(jSONObject, HiAnalyticsConstant.BI_KEY_COST_TIME, aVar.f37292c);
            if (aVar.f37290a == 3) {
                C2657e.m11171a(jSONObject, "error_code", aVar.f37293d);
                C2657e.m11174a(jSONObject, "error_msg", aVar.f37294e);
            }
            if (fVar != null) {
                fVar.mo11575a(webView, aVar.f37292c);
                fVar.mo11574a((View) webView, aVar.f37290a);
            }
            C2720n f = m11434f(webView, webView.getUrl());
            if (f == null) {
                f = m11435g(webView, webView.getUrl());
                z = true;
            }
            mo11668a(webView, "blank", jSONObject);
            if (z) {
                m11433a(webView, f);
            }
            C2648b.m11130a("MonitorCacheInfoHandler", "handleBlankDetect: ");
        }
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC2701d
    /* renamed from: a */
    public void mo11638a(WebView webView, String str, String str2) {
        String b = C2657e.m11177b(C2657e.m11170a(str2), "url");
        if (TextUtils.isEmpty(b)) {
            C2720n l = m11436l(webView);
            if (l != null) {
                l.mo11713a(webView, str, C2657e.m11170a(str2), null);
                l.mo11722b(str);
                return;
            }
            return;
        }
        C2720n f = m11434f(webView, b);
        if (f != null && f.mo11724c(str)) {
            f.mo11713a(webView, str, C2657e.m11170a(str2), null);
            f.mo11722b(str);
        }
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC2701d
    /* renamed from: a */
    public void mo11639a(WebView webView, String str, String str2, String str3) {
        C2720n f = m11434f(webView, str);
        if (f != null) {
            f.mo11717a(str2, str3);
        }
        C2648b.m11130a("MonitorCacheInfoHandler", "cover: " + str);
    }
}
