package com.bytedance.android.monitor.webview;

import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.android.monitor.p104a.AbstractC2633e;
import com.bytedance.android.monitor.p106c.C2641a;
import com.bytedance.android.monitor.p106c.C2644b;
import com.bytedance.android.monitor.p109f.C2648b;
import com.bytedance.android.monitor.p111h.C2652d;
import com.bytedance.android.monitor.p112i.C2655c;
import com.bytedance.android.monitor.p112i.C2657e;
import com.bytedance.android.monitor.webview.AbstractC2690c;
import com.bytedance.android.monitor.webview.p117a.C2678a;
import com.bytedance.android.monitor.webview.p118b.AbstractC2682b;
import com.bytedance.android.monitor.webview.p118b.AbstractC2686f;
import com.bytedance.android.monitor.webview.p122d.AbstractC2702a;
import com.bytedance.android.monitor.webview.p123e.C2704a;
import com.bytedance.p754g.p755a.C14180a;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.webview.i */
public class C2711i implements AbstractC2690c, AbstractC2703e {

    /* renamed from: b */
    private static AbstractC2690c f8611b = null;

    /* renamed from: c */
    private static AbstractC2703e f8612c = null;

    /* renamed from: d */
    private static String f8613d = "ttlive_web_view_tag";

    /* renamed from: e */
    private static String f8614e = "ttlive_web_view_last_url_tag";

    /* renamed from: f */
    private static String f8615f = "ttlive_web_view_auto_report_tag";

    /* renamed from: j */
    private static Map<String, String> f8616j = new HashMap();

    /* renamed from: a */
    public AbstractC2702a f8617a;

    /* renamed from: g */
    private Map<String, AbstractC2690c.C2691a> f8618g = new HashMap();

    /* renamed from: h */
    private Map<String, AbstractC2690c.C2691a> f8619h = new HashMap();

    /* renamed from: i */
    private Set<String> f8620i = new HashSet();

    /* renamed from: k */
    private View$OnAttachStateChangeListenerC2715b f8621k = new View$OnAttachStateChangeListenerC2715b(null);

    /* renamed from: l */
    private C2678a f8622l = new C2678a();

    /* renamed from: m */
    private boolean f8623m = false;

    /* renamed from: n */
    private boolean f8624n = true;

    /* renamed from: o */
    private boolean f8625o = false;

    /* renamed from: p */
    private Handler f8626p = new Handler(Looper.getMainLooper());

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.android.monitor.webview.i$b */
    public static class View$OnAttachStateChangeListenerC2715b implements View.OnAttachStateChangeListener {
        private View$OnAttachStateChangeListenerC2715b() {
        }

        /* synthetic */ View$OnAttachStateChangeListenerC2715b(RunnableC27121 r1) {
            this();
        }

        /* renamed from: b */
        public void mo11698b(WebView webView) {
            if (webView != null) {
                webView.removeOnAttachStateChangeListener(this);
            }
        }

        /* renamed from: a */
        public void mo11697a(WebView webView) {
            if (webView != null) {
                webView.removeOnAttachStateChangeListener(this);
                webView.addOnAttachStateChangeListener(this);
            }
        }

        public void onViewAttachedToWindow(View view) {
            if (view instanceof WebView) {
                C2711i.m11492d().mo11661c((WebView) view);
            }
        }

        /* renamed from: c */
        public void mo11699c(WebView webView) {
            if (C2711i.m11492d().mo11666h(webView)) {
                C2711i.m11480a().mo11591a(webView);
            }
        }

        public void onViewDetachedFromWindow(View view) {
            if (view instanceof WebView) {
                WebView webView = (WebView) view;
                C2711i.m11492d().mo11662d(webView);
                mo11699c(webView);
            }
        }
    }

    /* renamed from: a */
    public static AbstractC2690c m11480a() {
        return f8611b;
    }

    /* renamed from: d */
    public static AbstractC2703e m11492d() {
        return f8612c;
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC2690c
    /* renamed from: a */
    public void mo11592a(boolean z) {
        this.f8624n = z;
    }

    /* renamed from: b */
    public boolean mo11680b() {
        return this.f8624n && m11495g().f8435a;
    }

    @Override // com.bytedance.android.monitor.webview.p118b.AbstractC2689i
    /* renamed from: a */
    public void mo11582a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (!mo11682c()) {
            mo11678b(webView, webResourceRequest, webResourceError);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo11678b(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        AbstractC2690c.C2691a x;
        try {
            if (mo11680b() && webView != null && webResourceRequest != null && webResourceError != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    if (mo11665g(webView) && m11504y(webView) && (x = mo11693x(webView)) != null) {
                        if (m11489b(x.f8538m)) {
                            AbstractC2701d dVar = x.f8527b;
                            if (dVar != null) {
                                dVar.mo11640a(webView, webResourceRequest.getUrl().toString(), webResourceRequest.isForMainFrame(), webResourceError.getErrorCode(), webResourceError.getDescription().toString(), 0);
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            C2655c.m11159a(e);
        }
    }

    @Override // com.bytedance.android.monitor.webview.p118b.AbstractC2689i
    /* renamed from: a */
    public void mo11583a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (!mo11682c()) {
            mo11679b(webView, webResourceRequest, webResourceResponse);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo11679b(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        AbstractC2690c.C2691a x;
        try {
            if (mo11680b() && webView != null && webResourceRequest != null && webResourceResponse != null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    if (mo11665g(webView) && m11504y(webView) && (x = mo11693x(webView)) != null) {
                        if (m11489b(x.f8538m)) {
                            AbstractC2701d dVar = x.f8527b;
                            if (dVar != null) {
                                dVar.mo11640a(webView, webResourceRequest.getUrl().toString(), webResourceRequest.isForMainFrame(), 0, webResourceResponse.getReasonPhrase(), webResourceResponse.getStatusCode());
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            C2655c.m11159a(e);
        }
    }

    @Override // com.bytedance.android.monitor.webview.p118b.AbstractC2688h
    /* renamed from: a */
    public void mo11578a(WebView webView, C2644b bVar) {
        AbstractC2690c.C2691a x;
        AbstractC2701d dVar;
        try {
            if (!mo11680b() || webView == null || !mo11665g(webView) || !m11504y(webView) || (x = mo11693x(webView)) == null) {
                return;
            }
            if (m11489b(x.f8539n)) {
                if (m11495g().f8438d && (dVar = x.f8527b) != null) {
                    dVar.mo11635a(webView, bVar);
                }
            }
        } catch (Exception e) {
            C2655c.m11159a(e);
        }
    }

    /* renamed from: a */
    public void mo11674a(WebView webView, boolean z, long j) throws InterruptedException {
        AbstractC2690c.C2691a x = mo11693x(webView);
        if (x != null && mo11665g(webView) && m11489b(x.f8541p)) {
            String format = String.format(" javascript: (function () {\n    var target = {}\n    if (typeof SlardarHybrid !== 'undefined' && typeof jsIESLiveTimingMonitor !== 'undefined'){\n    var performacess = SlardarHybrid('getLatestPerformance');\n    var resourcess = SlardarHybrid('getLatestResource');\n    target.performance = performacess;\n    target.resource = resourcess;\n    target.needReport = %s;\n    jsIESLiveTimingMonitor.reportPageLatestData(target);}\n })()", z ? "true" : "false");
            if (webView != null && Build.VERSION.SDK_INT >= 19) {
                webView.evaluateJavascript(format, null);
            }
        }
    }

    @Override // com.bytedance.android.monitor.webview.p118b.AbstractC2684d
    /* renamed from: a */
    public void mo11571a(AbstractC2690c.C2691a aVar) {
        try {
            AbstractC2690c.C2691a b = m11485b(aVar);
            String[] strArr = b.f8531f;
            if (!(strArr == null || strArr.length == 0)) {
                for (String str : strArr) {
                    this.f8619h.put(str, b);
                }
            }
            String[] strArr2 = b.f8530e;
            if (!(strArr2 == null || strArr2.length == 0)) {
                for (String str2 : strArr2) {
                    this.f8618g.put(str2, b);
                }
            }
            this.f8620i.clear();
        } catch (Exception e) {
            C2655c.m11159a(e);
        }
    }

    @Override // com.bytedance.android.monitor.webview.p118b.AbstractC2689i
    /* renamed from: b */
    public void mo11584b(WebView webView, String str) {
        if (!mo11682c()) {
            mo11681c(webView, str);
        }
    }

    @Override // com.bytedance.android.monitor.webview.p118b.AbstractC2687g
    /* renamed from: a */
    public void mo11577a(WebView webView, String str, String str2, String str3, String str4, String str5, String str6) {
        mo11673a(webView, str, str2, C2657e.m11170a(str3), C2657e.m11170a(str4), C2657e.m11170a(str5), (JSONObject) null, true);
    }

    /* renamed from: a */
    public void mo11675a(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, boolean z) {
        m11483a(null, str, str2, str3, jSONObject, jSONObject2, jSONObject3, jSONObject4, z);
    }

    @Override // com.bytedance.android.monitor.webview.p118b.AbstractC2687g
    /* renamed from: a */
    public void mo11576a(WebView webView, C2641a aVar) {
        AbstractC2682b s;
        if (!(webView == null || (s = mo11690s(webView)) == null)) {
            if (TextUtils.isEmpty(aVar.mo11424b())) {
                aVar.mo11425b(s.mo11568b());
            }
            if (TextUtils.isEmpty(aVar.mo11421a())) {
                aVar.mo11423a(s.mo11569c());
            }
            if (TextUtils.isEmpty(aVar.mo11433i())) {
                aVar.mo11427c(s.mo11567a());
            }
            AbstractC2690c.C2691a x = mo11693x(webView);
            if (!(x == null || x.f8534i == null)) {
                aVar.mo11422a(x.f8534i);
            }
        }
        C2657e.m11171a(aVar.mo11432h(), "platform", 0);
        HybridMonitor.getInstance().customReport(aVar);
    }

    @Override // com.bytedance.android.monitor.webview.p118b.AbstractC2688h
    /* renamed from: b */
    public void mo11579b(WebView webView, long j) {
        if (j > 0 && webView != null) {
            JSONObject jSONObject = new JSONObject();
            Uri parse = Uri.parse(webView.getUrl());
            C2657e.m11174a(jSONObject, "url", parse.toString());
            C2657e.m11174a(jSONObject, "host", parse.getHost());
            C2657e.m11174a(jSONObject, "path", parse.getPath());
            String str = "true";
            C2657e.m11174a(jSONObject, "hybrid_monitor_switch", (!mo11680b() || !mo11665g(webView)) ? "false" : str);
            if (!mo11680b() || !m11473B(webView)) {
                str = "false";
            }
            C2657e.m11174a(jSONObject, "js_inject_switch", str);
            C2657e.m11174a(jSONObject, "container_type", "web");
            JSONObject jSONObject2 = new JSONObject();
            C2657e.m11172a(jSONObject2, "web_page_cost", j);
            mo11577a(webView, webView.getUrl(), "performance_test", jSONObject.toString(), jSONObject2.toString(), null, "0");
        }
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC2703e
    /* renamed from: a */
    public void mo11660a(WebView webView, String str, String str2, String str3) {
        AbstractC2701d dVar;
        try {
            AbstractC2690c.C2691a x = mo11693x(webView);
            if (x != null && (dVar = x.f8527b) != null) {
                dVar.mo11639a(webView, str, str2, str3);
                m11498i(webView, "loc_after_tti");
            }
        } catch (Exception e) {
            C2655c.m11159a(e);
        }
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC2703e
    /* renamed from: a */
    public void mo11659a(WebView webView, String str, String str2) {
        AbstractC2701d dVar;
        try {
            AbstractC2690c.C2691a x = mo11693x(webView);
            if (x != null && (dVar = x.f8527b) != null) {
                dVar.mo11638a(webView, str, str2);
            }
        } catch (Exception e) {
            C2655c.m11159a(e);
        }
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC2703e
    /* renamed from: a */
    public void mo11658a(WebView webView, String str) {
        AbstractC2701d dVar;
        try {
            AbstractC2690c.C2691a x = mo11693x(webView);
            if (x != null && (dVar = x.f8527b) != null) {
                dVar.mo11647d(webView, str);
            }
        } catch (Exception e) {
            C2655c.m11159a(e);
        }
    }

    /* renamed from: com.bytedance.android.monitor.webview.i$a */
    private class RunnableC2714a implements Runnable {

        /* renamed from: b */
        private WebView f8631b;

        public void run() {
            C2711i.this.mo11593b(this.f8631b);
        }

        private RunnableC2714a(WebView webView) {
            this.f8631b = webView;
        }

        /* synthetic */ RunnableC2714a(C2711i iVar, WebView webView, RunnableC27121 r3) {
            this(webView);
        }
    }

    @Override // com.bytedance.android.monitor.webview.p118b.AbstractC2684d
    /* renamed from: e */
    public AbstractC2690c.C2691a mo11572e() {
        return new AbstractC2690c.C2691a();
    }

    /* renamed from: com.bytedance.android.monitor.webview.i$1 */
    class RunnableC27121 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C2711i f8627a;

        public void run() {
            if (this.f8627a.f8617a != null) {
                this.f8627a.f8617a.mo11655a();
            }
        }
    }

    /* renamed from: g */
    private C2652d m11495g() {
        return HybridMonitor.getInstance().getSettingManager().mo11466b();
    }

    /* renamed from: c */
    public boolean mo11682c() {
        if (!this.f8625o || !this.f8623m) {
            return false;
        }
        return true;
    }

    static {
        C2711i iVar = new C2711i();
        f8611b = iVar;
        f8612c = iVar;
    }

    private C2711i() {
        m11494f();
    }

    /* renamed from: h */
    private String m11496h() {
        if (this.f8617a == null) {
            return null;
        }
        try {
            File file = new File(this.f8617a.mo11656b() + "/slardar.js");
            if (file.exists()) {
                return file.getAbsolutePath();
            }
            return null;
        } catch (Exception e) {
            C2655c.m11159a(e);
            return null;
        }
    }

    /* renamed from: f */
    private void m11494f() {
        try {
            Class<?> cls = Class.forName("com.bytedance.lynx.webview.TTWebSdk");
            Class<?> cls2 = Class.forName("com.bytedance.lynx.webview.monitors.IWebViewDelegate");
            Class<?> cls3 = Class.forName("com.bytedance.lynx.webview.monitors.IWebViewClientDelegate");
            Class<?> cls4 = Class.forName("com.bytedance.lynx.webview.monitors.IWebChromeClientDelegate");
            cls.getDeclaredMethod("registerGlobalWebViewDelegate", cls2).invoke(null, new C2718l().mo11706a());
            cls.getDeclaredMethod("registerGlobalWebViewClientDelegate", cls3).invoke(null, new C2717k().mo11704a());
            cls.getDeclaredMethod("registerGlobalWebChromeClientDelegate", cls4).invoke(null, new C2716j().mo11702a());
            this.f8623m = true;
        } catch (Exception e) {
            this.f8623m = false;
            C2655c.m11159a(e);
        }
    }

    /* renamed from: E */
    private void m11476E(WebView webView) {
        View$OnAttachStateChangeListenerC2715b bVar = this.f8621k;
        if (bVar != null) {
            bVar.mo11697a(webView);
        }
    }

    /* renamed from: F */
    private void m11477F(WebView webView) {
        View$OnAttachStateChangeListenerC2715b bVar = this.f8621k;
        if (bVar != null) {
            bVar.mo11698b(webView);
        }
    }

    /* renamed from: B */
    private boolean m11473B(WebView webView) {
        try {
            AbstractC2690c.C2691a x = mo11693x(webView);
            if (x == null) {
                return false;
            }
            return x.f8546u;
        } catch (Exception e) {
            C2655c.m11159a(e);
            return false;
        }
    }

    /* renamed from: H */
    private void m11479H(WebView webView) {
        this.f8619h.remove(mo11570t(webView));
    }

    /* renamed from: a */
    private Class<?> m11481a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable th) {
            C2655c.m11159a(th);
            return null;
        }
    }

    /* renamed from: b */
    private boolean m11488b(String str) {
        return C2657e.m11176a(C2657e.m11170a(str), "webview_is_need_monitor", (Boolean) false);
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC2703e
    /* renamed from: e */
    public String mo11663e(WebView webView) {
        AbstractC2690c.C2691a x = mo11693x(webView);
        if (x != null) {
            return x.f8551z;
        }
        return "";
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC2703e
    /* renamed from: f */
    public String mo11664f(WebView webView) {
        AbstractC2690c.C2691a x = mo11693x(webView);
        if (x != null) {
            return x.f8526a;
        }
        return "";
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC2703e
    /* renamed from: i */
    public AbstractC2633e mo11667i(WebView webView) {
        try {
            AbstractC2690c.C2691a x = mo11693x(webView);
            if (x == null) {
                return null;
            }
            return x.f8533h;
        } catch (Exception e) {
            C2655c.m11159a(e);
            return null;
        }
    }

    @Override // com.bytedance.android.monitor.webview.p118b.AbstractC2689i
    /* renamed from: j */
    public void mo11587j(WebView webView) {
        if (!mo11682c()) {
            mo11685k(webView);
        }
    }

    @Override // com.bytedance.android.monitor.webview.p118b.AbstractC2689i
    /* renamed from: l */
    public void mo11588l(WebView webView) {
        if (!mo11682c()) {
            mo11686m(webView);
        }
    }

    @Override // com.bytedance.android.monitor.webview.p118b.AbstractC2689i
    /* renamed from: o */
    public void mo11589o(WebView webView) {
        if (!mo11682c()) {
            mo11688p(webView);
        }
    }

    @Override // com.bytedance.android.monitor.webview.p118b.AbstractC2689i
    /* renamed from: q */
    public void mo11590q(WebView webView) {
        if (!mo11682c()) {
            mo11689r(webView);
        }
    }

    /* renamed from: w */
    public AbstractC2686f mo11692w(WebView webView) {
        try {
            AbstractC2690c.C2691a x = mo11693x(webView);
            if (x == null) {
                return null;
            }
            return x.f8529d;
        } catch (Exception e) {
            C2655c.m11159a(e);
            return null;
        }
    }

    /* renamed from: A */
    private void m11472A(WebView webView) {
        AbstractC2701d dVar;
        try {
            AbstractC2690c.C2691a x = mo11693x(webView);
            if (x != null && (dVar = x.f8527b) != null) {
                dVar.mo11648e(webView);
            }
        } catch (Exception e) {
            C2655c.m11159a(e);
        }
    }

    /* renamed from: C */
    private void m11474C(WebView webView) {
        AbstractC2701d dVar;
        try {
            AbstractC2690c.C2691a x = mo11693x(webView);
            if (x != null && (dVar = x.f8527b) != null) {
                dVar.mo11653i(webView);
            }
        } catch (Exception e) {
            C2655c.m11159a(e);
        }
    }

    /* renamed from: y */
    private boolean m11504y(WebView webView) {
        AbstractC2701d dVar;
        AbstractC2690c.C2691a x = mo11693x(webView);
        if (x == null || (dVar = x.f8527b) == null) {
            return false;
        }
        return dVar.mo11651g(webView);
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC2703e
    /* renamed from: c */
    public void mo11661c(WebView webView) {
        AbstractC2701d dVar;
        try {
            AbstractC2690c.C2691a x = mo11693x(webView);
            if (x != null && (dVar = x.f8527b) != null) {
                dVar.mo11644c(webView);
            }
        } catch (Exception e) {
            C2655c.m11159a(e);
        }
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC2703e
    /* renamed from: d */
    public void mo11662d(WebView webView) {
        AbstractC2701d dVar;
        try {
            AbstractC2690c.C2691a x = mo11693x(webView);
            if (x != null && (dVar = x.f8527b) != null) {
                dVar.mo11646d(webView);
            }
        } catch (Exception e) {
            C2655c.m11159a(e);
        }
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC2703e
    /* renamed from: g */
    public boolean mo11665g(WebView webView) {
        try {
            AbstractC2690c.C2691a x = mo11693x(webView);
            if (x == null) {
                return false;
            }
            return x.f8542q;
        } catch (Exception e) {
            C2655c.m11159a(e);
            return false;
        }
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC2703e
    /* renamed from: h */
    public boolean mo11666h(WebView webView) {
        try {
            AbstractC2690c.C2691a x = mo11693x(webView);
            if (x == null || !x.f8543r) {
                return false;
            }
            return true;
        } catch (Exception e) {
            C2655c.m11159a(e);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo11688p(WebView webView) {
        try {
            if (mo11680b() && mo11665g(webView)) {
                mo11674a(webView, false, 30L);
                m11482a(webView, mo11692w(webView));
            }
        } catch (Exception e) {
            C2655c.m11159a(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo11689r(WebView webView) {
        try {
            if (mo11680b() && mo11665g(webView)) {
                mo11661c(webView);
            }
        } catch (Exception e) {
            C2655c.m11159a(e);
        }
    }

    @Override // com.bytedance.android.monitor.webview.p118b.AbstractC2683c
    /* renamed from: t */
    public String mo11570t(WebView webView) {
        if (webView == null) {
            return "";
        }
        return webView.hashCode() + "";
    }

    /* renamed from: v */
    public boolean mo11691v(WebView webView) {
        AbstractC2701d dVar;
        AbstractC2690c.C2691a x = mo11693x(webView);
        if (x == null || (dVar = x.f8527b) == null) {
            return false;
        }
        return dVar.mo11650f(webView);
    }

    /* renamed from: D */
    private void m11475D(WebView webView) {
        if (Build.VERSION.SDK_INT >= 19 && mo11665g(webView)) {
            String str = f8613d;
            if (!str.equals(m11502m(webView, str))) {
                WebViewMonitorJsBridge webViewMonitorJsBridge = new WebViewMonitorJsBridge(webView);
                if (!webView.getSettings().getJavaScriptEnabled()) {
                    webView.getSettings().setJavaScriptEnabled(true);
                }
                webView.addJavascriptInterface(webViewMonitorJsBridge, "iesJsBridgeTransferMonitor");
                String str2 = f8613d;
                m11486b(webView, str2, str2);
            }
        }
    }

    /* renamed from: b */
    private boolean m11489b(boolean z) {
        if (HybridMonitor.isDebuggable() || z) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    private boolean m11505z(WebView webView) {
        AbstractC2690c.C2691a x;
        AbstractC2701d dVar;
        if (webView == null) {
            return false;
        }
        try {
            if (!mo11665g(webView) || (x = mo11693x(webView)) == null || (dVar = x.f8527b) == null) {
                return false;
            }
            return dVar.mo11641a(webView);
        } catch (Exception e) {
            C2655c.m11159a(e);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo11685k(WebView webView) {
        AbstractC2701d dVar;
        try {
            if (!mo11680b() || webView == null) {
                return;
            }
            if (mo11665g(webView)) {
                AbstractC2690c.C2691a x = mo11693x(webView);
                if (x != null && (dVar = x.f8527b) != null) {
                    dVar.mo11642b(webView);
                    return;
                }
                return;
            }
            C2705f a = C2705f.m11432a();
            if (a != null) {
                a.mo11642b(webView);
            }
        } catch (Exception e) {
            C2655c.m11159a(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo11687n(WebView webView) {
        try {
            if (mo11680b() && mo11665g(webView)) {
                m11503n(webView, f8614e);
            }
        } catch (Exception e) {
            C2655c.m11159a(e);
        }
    }

    /* renamed from: s */
    public AbstractC2682b mo11690s(WebView webView) {
        AbstractC2690c.C2691a x;
        AbstractC2701d dVar;
        try {
            if (mo11680b() && mo11665g(webView) && (x = mo11693x(webView)) != null && (dVar = x.f8527b) != null) {
                return dVar.mo11654j(webView);
            }
            return null;
        } catch (Exception e) {
            C2655c.m11159a(e);
        }
        return null;
    }

    @Override // com.bytedance.android.monitor.webview.p118b.AbstractC2685e
    /* renamed from: u */
    public boolean mo11573u(WebView webView) {
        try {
            return ((Boolean) Class.forName("com.bytedance.lynx.webview.TTWebSdk").getDeclaredMethod("isTTWebView", WebView.class).invoke(null, webView)).booleanValue();
        } catch (Exception e) {
            C2655c.m11159a(e);
            return false;
        }
    }

    /* renamed from: G */
    private void m11478G(WebView webView) {
        String str;
        String str2;
        boolean z;
        try {
            if (Build.VERSION.SDK_INT >= 19) {
                String url = webView.getUrl();
                if (url == null || !url.equals("about:blank")) {
                    String m = m11502m(webView, f8614e);
                    if (!TextUtils.isEmpty(url) && !url.equals(m)) {
                        AbstractC2690c.C2691a x = mo11693x(webView);
                        if (x == null) {
                            str = C2709g.m11469b();
                        } else {
                            str = x.f8547v;
                        }
                        if (x == null) {
                            str2 = "";
                        } else {
                            str2 = x.f8548w;
                        }
                        if (x != null) {
                            if (!m11489b(x.f8546u)) {
                                z = false;
                                if (z && m11495g().f8439e) {
                                    webView.evaluateJavascript(C2704a.m11430a(webView.getContext(), str2, str, z), null);
                                }
                                m11486b(webView, f8614e, url);
                                C2648b.m11130a("WebViewMonitorHelper", "injectJsScript : " + url);
                            }
                        }
                        z = true;
                        webView.evaluateJavascript(C2704a.m11430a(webView.getContext(), str2, str, z), null);
                        m11486b(webView, f8614e, url);
                        C2648b.m11130a("WebViewMonitorHelper", "injectJsScript : " + url);
                    }
                }
            }
        } catch (Exception e) {
            C2655c.m11159a(e);
        }
    }

    /* renamed from: c */
    private String[] m11491c(String str) {
        JSONArray d;
        String[] strArr = new String[0];
        if (TextUtils.isEmpty(str) || (d = C2657e.m11179d(C2657e.m11170a(str), "webview_classes")) == null) {
            return strArr;
        }
        String[] strArr2 = new String[d.length()];
        for (int i = 0; i < d.length(); i++) {
            try {
                strArr2[i] = d.getString(i);
            } catch (JSONException unused) {
            }
        }
        return strArr2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo11686m(WebView webView) {
        try {
            if (mo11680b() && mo11665g(webView)) {
                mo11674a(webView, false, 100L);
                m11482a(webView, mo11692w(webView));
                m11472A(webView);
            }
        } catch (Exception e) {
            C2655c.m11159a(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public AbstractC2690c.C2691a mo11693x(WebView webView) {
        AbstractC2690c.C2691a aVar;
        if (webView == null) {
            return null;
        }
        AbstractC2690c.C2691a aVar2 = this.f8619h.get(mo11570t(webView));
        if (aVar2 != null) {
            return aVar2;
        }
        String name = webView.getClass().getName();
        AbstractC2690c.C2691a aVar3 = this.f8618g.get(name);
        if (aVar3 != null) {
            return aVar3;
        }
        if (this.f8620i.contains(name)) {
            return null;
        }
        for (String str : new HashSet(this.f8618g.keySet())) {
            if (m11484a(name, str) && (aVar = this.f8618g.get(str)) != null) {
                this.f8618g.put(name, aVar);
                return aVar;
            }
        }
        this.f8620i.add(name);
        return null;
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC2690c
    /* renamed from: a */
    public void mo11591a(final WebView webView) {
        if (webView == null) {
            try {
                mo11593b((WebView) null);
            } catch (Exception e) {
                C2655c.m11159a(e);
            }
        } else {
            RunnableC2714a aVar = new RunnableC2714a(this, webView, null);
            if (mo11691v(webView)) {
                this.f8626p.post(aVar);
                return;
            }
            this.f8626p.post(new Runnable() {
                /* class com.bytedance.android.monitor.webview.C2711i.RunnableC27132 */

                public void run() {
                    try {
                        C2711i.this.mo11674a(webView, true, 30L);
                    } catch (Exception unused) {
                    }
                }
            });
            this.f8626p.postDelayed(aVar, 500);
        }
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC2690c
    /* renamed from: b */
    public void mo11593b(WebView webView) {
        try {
            if (!m11505z(webView)) {
                m11474C(webView);
                m11482a(webView, mo11692w(webView));
                m11498i(webView, "loc_after_detach");
                m11503n(webView, f8614e);
                m11503n(webView, f8615f);
                m11503n(webView, f8613d);
                m11479H(webView);
                m11477F(webView);
            }
        } catch (Exception e) {
            C2655c.m11159a(e);
        }
    }

    /* renamed from: b */
    private AbstractC2690c.C2691a m11485b(AbstractC2690c.C2691a aVar) {
        AbstractC2701d dVar;
        String str;
        String str2;
        String[] strArr;
        boolean z;
        String str3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        AbstractC2690c.C2691a aVar2 = new AbstractC2690c.C2691a();
        aVar.mo11595a(aVar.f8551z);
        if (aVar.f8527b != null) {
            dVar = aVar.f8527b;
        } else {
            dVar = C2705f.m11432a();
        }
        aVar2.f8527b = dVar;
        if (aVar.f8532g != null) {
            str = aVar.f8532g;
        } else {
            str = "WebViewMonitor";
        }
        aVar2.f8532g = str;
        aVar2.f8526a = aVar.f8526a;
        aVar2.f8534i = aVar.f8534i;
        aVar2.f8533h = aVar.f8533h;
        aVar2.f8536k = aVar.f8536k;
        aVar2.f8543r = aVar.f8543r;
        aVar2.f8544s = aVar.f8544s;
        aVar2.f8545t = aVar.f8545t;
        aVar2.f8548w = m11496h();
        aVar2.f8542q = aVar.f8542q;
        aVar2.f8546u = aVar.f8546u;
        aVar2.f8531f = aVar.f8531f;
        aVar2.f8530e = aVar.f8530e;
        aVar2.f8528c = aVar.f8528c;
        aVar2.f8529d = aVar.f8529d;
        aVar2.f8551z = aVar.f8551z;
        if (TextUtils.isEmpty(aVar.f8547v)) {
            str2 = C2709g.m11469b();
        } else {
            str2 = aVar.f8547v;
        }
        aVar2.f8547v = str2;
        aVar2.f8549x = aVar.f8549x;
        aVar2.f8537l = aVar.f8537l;
        aVar2.f8538m = aVar.f8538m;
        aVar2.f8540o = aVar.f8540o;
        aVar2.f8539n = aVar.f8539n;
        aVar2.f8541p = aVar.f8541p;
        aVar2.f8525A = aVar.f8525A;
        if (!TextUtils.isEmpty(aVar.f8535j)) {
            JSONObject a = C2657e.m11170a(aVar.f8535j);
            if (C2657e.m11180e(a, "webview_classes") == null) {
                strArr = aVar2.f8530e;
            } else {
                strArr = m11491c(aVar.f8535j);
            }
            aVar2.f8530e = strArr;
            if (C2657e.m11180e(a, "webview_is_need_monitor") == null) {
                z = aVar2.f8542q;
            } else {
                z = m11488b(aVar.f8535j);
            }
            aVar2.f8542q = z;
            if (TextUtils.isEmpty(aVar.f8535j)) {
                str3 = aVar2.f8547v;
            } else {
                str3 = new C2709g(aVar.f8535j).mo11672a();
            }
            aVar2.f8547v = str3;
            if (C2657e.m11180e(a, "webview_is_open_blankdetect") == null) {
                z2 = aVar2.f8537l;
            } else {
                z2 = C2657e.m11176a(a, "webview_is_open_blankdetect", (Boolean) false);
            }
            aVar2.f8537l = z2;
            if (C2657e.m11180e(a, "webview_is_open_jsb") == null) {
                z3 = aVar2.f8539n;
            } else {
                z3 = C2657e.m11176a(a, "webview_is_open_jsb", (Boolean) false);
            }
            aVar2.f8539n = z3;
            if (C2657e.m11180e(a, "webview_is_open_fetch") == null) {
                z4 = aVar2.f8540o;
            } else {
                z4 = C2657e.m11176a(a, "webview_is_open_fetch", (Boolean) false);
            }
            aVar2.f8540o = z4;
            if (C2657e.m11180e(a, "webview_is_inject_js") == null) {
                z5 = aVar2.f8546u;
            } else {
                z5 = C2657e.m11176a(a, "webview_is_inject_js", (Boolean) false);
            }
            aVar2.f8546u = z5;
            if (C2657e.m11180e(a, "webview_is_update_page_data") == null) {
                z6 = aVar2.f8541p;
            } else {
                z6 = C2657e.m11176a(a, "webview_is_update_page_data", (Boolean) false);
            }
            aVar2.f8541p = z6;
        }
        return aVar2;
    }

    @Override // com.bytedance.android.monitor.webview.p118b.AbstractC2689i
    /* renamed from: d */
    public void mo11585d(WebView webView, String str) {
        if (!mo11682c()) {
            mo11683e(webView, str);
        }
    }

    /* renamed from: a */
    private boolean m11484a(String str, String str2) {
        Class<?> a = m11481a(str);
        Class<?> a2 = m11481a(str2);
        if (a == null || a2 == null) {
            return false;
        }
        return a2.isAssignableFrom(a);
    }

    /* renamed from: j */
    private void m11499j(WebView webView, String str) {
        if (mo11665g(webView)) {
            String str2 = f8615f;
            if (!str2.equals(m11502m(webView, str2))) {
                m11476E(webView);
                String str3 = f8615f;
                m11486b(webView, str3, str3);
            }
            m11500k(webView, str);
        }
    }

    /* renamed from: k */
    private void m11500k(WebView webView, String str) {
        AbstractC2701d dVar;
        try {
            AbstractC2690c.C2691a x = mo11693x(webView);
            if (x != null && (dVar = x.f8527b) != null) {
                dVar.mo11643b(webView, str);
            }
        } catch (Exception e) {
            C2655c.m11159a(e);
        }
    }

    /* renamed from: l */
    private void m11501l(WebView webView, String str) {
        AbstractC2701d dVar;
        try {
            AbstractC2690c.C2691a x = mo11693x(webView);
            if (x != null && (dVar = x.f8527b) != null) {
                dVar.mo11645c(webView, str);
            }
        } catch (Exception e) {
            C2655c.m11159a(e);
        }
    }

    /* renamed from: n */
    private void m11503n(WebView webView, String str) {
        String t = mo11570t(webView);
        f8616j.remove(str + t);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo11683e(WebView webView, String str) {
        try {
            if (!mo11680b()) {
                this.f8622l.mo11564a(webView, str);
            } else if (mo11665g(webView)) {
                m11501l(webView, str);
            }
        } catch (Exception e) {
            C2655c.m11159a(e);
        }
    }

    @Override // com.bytedance.android.monitor.webview.p118b.AbstractC2689i
    /* renamed from: f */
    public void mo11586f(WebView webView, String str) {
        if (!mo11682c()) {
            mo11684g(webView, str);
        }
    }

    /* renamed from: c */
    private void m11490c(WebView webView, int i) {
        AbstractC2690c.C2691a x;
        AbstractC2701d dVar;
        if (webView != null) {
            try {
                if (mo11665g(webView) && m11504y(webView) && (x = mo11693x(webView)) != null && (dVar = x.f8527b) != null) {
                    dVar.mo11633a(webView, i);
                }
            } catch (Exception e) {
                C2655c.m11159a(e);
            }
        }
    }

    /* renamed from: d */
    private void m11493d(WebView webView, int i) {
        if (mo11665g(webView) && i >= 15 && webView != null) {
            if (!webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            m11478G(webView);
        }
    }

    /* renamed from: i */
    private void m11498i(WebView webView, String str) {
        AbstractC2701d dVar;
        AbstractC2690c.C2691a x = mo11693x(webView);
        if (x != null && x.f8545t != null && (dVar = x.f8527b) != null) {
            if ("loc_force".equals(str) || "loc_after_detach".equals(str) || x.f8545t.equals(str)) {
                dVar.mo11649e(webView, str);
            }
        }
    }

    /* renamed from: m */
    private String m11502m(WebView webView, String str) {
        String t = mo11570t(webView);
        String str2 = f8616j.get(str + t);
        if (str2 == null) {
            return null;
        }
        return str2.replaceAll(t, "");
    }

    /* renamed from: a */
    private void m11482a(WebView webView, AbstractC2686f fVar) {
        AbstractC2690c.C2691a x;
        AbstractC2701d dVar;
        if (webView != null) {
            try {
                if (webView.getUrl() == null) {
                    return;
                }
                if (!webView.getUrl().equals("about:blank")) {
                    if (mo11665g(webView) && (x = mo11693x(webView)) != null && m11489b(x.f8537l) && m11495g().f8436b && (dVar = x.f8527b) != null && !mo11691v(webView)) {
                        dVar.mo11636a(webView, C14180a.m57270a(webView), fVar);
                    }
                }
            } catch (Exception e) {
                C2655c.m11159a(e);
            }
        }
    }

    /* renamed from: h */
    private boolean m11497h(WebView webView, String str) {
        AbstractC2690c.C2691a x;
        AbstractC2701d dVar;
        if ((!TextUtils.isEmpty(str) && !"about:blank".equals(str)) || (x = mo11693x(webView)) == null || (dVar = x.f8527b) == null) {
            return false;
        }
        String h = dVar.mo11652h(webView);
        if (TextUtils.isEmpty(h) || h.equals("about:blank")) {
            return false;
        }
        return true;
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo11684g(WebView webView, String str) {
        AbstractC2701d dVar;
        try {
            if (mo11680b() && mo11665g(webView) && !str.contains("javascript:")) {
                m11503n(webView, f8614e);
                C2648b.m11130a("TTLiveWebViewMonitorHelper", "onLoadUrl : " + str);
                if (m11497h(webView, str)) {
                    mo11674a(webView, false, 30L);
                    m11482a(webView, mo11693x(webView).f8529d);
                }
                m11475D(webView);
                AbstractC2690c.C2691a x = mo11693x(webView);
                if (x != null && (dVar = x.f8527b) != null) {
                    dVar.mo11637a(webView, str);
                }
            }
        } catch (Exception e) {
            C2655c.m11159a(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo11681c(WebView webView, String str) {
        try {
            if (!mo11680b()) {
                this.f8622l.mo11565a(str);
            } else {
                m11499j(webView, str);
            }
        } catch (Exception e) {
            C2655c.m11159a(e);
        }
    }

    @Override // com.bytedance.android.monitor.webview.p118b.AbstractC2689i
    /* renamed from: a */
    public void mo11580a(WebView webView, int i) {
        if (!mo11682c()) {
            mo11676b(webView, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo11676b(WebView webView, int i) {
        try {
            if (mo11680b()) {
                m11493d(webView, i);
                m11490c(webView, i);
            }
        } catch (Exception e) {
            C2655c.m11159a(e);
        }
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC2703e
    /* renamed from: a */
    public void mo11657a(WebView webView, long j) {
        AbstractC2701d dVar;
        try {
            AbstractC2690c.C2691a x = mo11693x(webView);
            if (x != null && (dVar = x.f8527b) != null) {
                dVar.mo11634a(webView, j);
            }
        } catch (Exception e) {
            C2655c.m11159a(e);
        }
    }

    /* renamed from: b */
    private void m11486b(WebView webView, String str, String str2) {
        String t = mo11570t(webView);
        f8616j.put(str + t, str2);
    }

    @Override // com.bytedance.android.monitor.webview.p118b.AbstractC2689i
    /* renamed from: a */
    public void mo11581a(WebView webView, int i, String str, String str2) {
        if (!mo11682c()) {
            mo11677b(webView, i, str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo11677b(WebView webView, int i, String str, String str2) {
        AbstractC2690c.C2691a x;
        try {
            if (mo11680b() && webView != null && str != null && str2 != null) {
                if (Build.VERSION.SDK_INT < 23) {
                    if (mo11665g(webView) && m11504y(webView) && (x = mo11693x(webView)) != null) {
                        if (m11489b(x.f8538m)) {
                            AbstractC2701d dVar = x.f8527b;
                            if (dVar != null) {
                                dVar.mo11640a(webView, str2, true, i, str, 0);
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            C2655c.m11159a(e);
        }
    }

    /* renamed from: a */
    public void mo11673a(WebView webView, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, boolean z) {
        m11487b(webView, str, str2, jSONObject, jSONObject2, jSONObject3, jSONObject4, z);
    }

    /* renamed from: b */
    private void m11487b(WebView webView, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, boolean z) {
        JSONObject jSONObject5;
        String str3;
        String str4;
        JSONObject jSONObject6;
        if (webView != null) {
            try {
                AbstractC2682b s = mo11690s(webView);
                if (s != null) {
                    if (jSONObject4 == null) {
                        jSONObject6 = new JSONObject();
                    } else {
                        jSONObject6 = jSONObject4;
                    }
                    C2657e.m11174a(jSONObject6, "virtual_aid", s.mo11567a());
                    String b = s.mo11568b();
                    if (TextUtils.isEmpty(str)) {
                        jSONObject5 = jSONObject6;
                        str3 = s.mo11569c();
                    } else {
                        str3 = str;
                        jSONObject5 = jSONObject6;
                    }
                    str4 = b;
                } else {
                    str3 = str;
                    jSONObject5 = jSONObject4;
                    str4 = "";
                }
                AbstractC2677a aVar = null;
                AbstractC2690c.C2691a x = mo11693x(webView);
                if (x != null) {
                    aVar = x.f8534i;
                }
                m11483a(aVar, str4, str3, str2, jSONObject, jSONObject2, jSONObject3, jSONObject5, z);
            } catch (Exception e) {
                C2655c.m11159a(e);
            }
        } else {
            mo11675a("", str, str2, jSONObject, jSONObject2, jSONObject3, jSONObject4, z);
        }
    }

    /* renamed from: a */
    private void m11483a(AbstractC2677a aVar, String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, boolean z) {
        if (jSONObject4 == null) {
            jSONObject4 = new JSONObject();
        }
        C2657e.m11171a(jSONObject4, "platform", 0);
        HybridMonitor.getInstance().customReport(new C2641a.C2643a(str3).mo11441b(str).mo11437a(str2).mo11438a(jSONObject).mo11442b(jSONObject2).mo11444c(jSONObject3).mo11446e(jSONObject4).mo11439a(z).mo11436a(aVar).mo11440a());
    }
}
