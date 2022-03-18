package com.bytedance.android.monitor.webview.p119c.p121b;

import android.text.TextUtils;
import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.android.monitor.p109f.C2648b;
import com.bytedance.android.monitor.p112i.C2657e;
import com.bytedance.android.monitor.webview.C2711i;
import com.bytedance.android.monitor.webview.p119c.p120a.AbstractC2692a;
import com.bytedance.android.monitor.webview.p119c.p120a.AbstractC2694c;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.webview.c.b.c */
public class C2699c extends AbstractC2694c {

    /* renamed from: a */
    public long f8568a;

    /* renamed from: b */
    public long f8569b;

    /* renamed from: c */
    public long f8570c;

    /* renamed from: e */
    public long f8571e;

    /* renamed from: f */
    public long f8572f;

    /* renamed from: g */
    public long f8573g;

    /* renamed from: h */
    public long f8574h;

    /* renamed from: i */
    public boolean f8575i;

    /* renamed from: j */
    public JSONObject f8576j = new JSONObject();

    /* renamed from: k */
    private AbstractC2692a f8577k = new AbstractC2692a("performance") {
        /* class com.bytedance.android.monitor.webview.p119c.p121b.C2699c.C27001 */

        @Override // com.bytedance.android.monitor.webview.p119c.p120a.AbstractC2692a
        /* renamed from: b */
        public void mo11602b() {
            mo11605e();
        }

        @Override // com.bytedance.android.monitor.p104a.AbstractC2629a
        /* renamed from: a */
        public void mo11404a(JSONObject jSONObject) {
            C2657e.m11172a(jSONObject, "page_start", C2699c.this.f8568a);
            C2657e.m11172a(jSONObject, "page_finish", C2699c.this.f8569b);
            C2657e.m11172a(jSONObject, "page_progress_100", C2699c.this.f8570c);
            C2657e.m11172a(jSONObject, "show_start", C2699c.this.f8572f);
            C2657e.m11172a(jSONObject, "show_end", C2699c.this.f8573g);
            if (C2699c.this.f8575i) {
                C2657e.m11172a(jSONObject, "init_time", C2699c.this.f8574h);
            }
            C2657e.m11172a(jSONObject, "inject_js_time", C2699c.this.f8571e);
            C2657e.m11173a(jSONObject, "event_counts", C2699c.this.f8576j);
            C2657e.m11172a(jSONObject, "load_start", C2699c.this.f8556d.mo11622e());
        }

        {
            mo11604d();
        }
    };

    /* renamed from: l */
    private long f8578l;

    /* renamed from: m */
    private Set<String> f8579m = new HashSet();

    @Override // com.bytedance.android.monitor.webview.p119c.p120a.AbstractC2694c
    /* renamed from: j */
    public AbstractC2692a mo11408d() {
        return this.f8577k;
    }

    /* renamed from: m */
    public Set<String> mo11628m() {
        return this.f8579m;
    }

    /* renamed from: p */
    public void mo11631p() {
        this.f8572f = System.currentTimeMillis();
    }

    /* renamed from: q */
    public void mo11632q() {
        this.f8573g = System.currentTimeMillis();
    }

    /* renamed from: n */
    public void mo11629n() {
        if (this.f8568a == 0) {
            this.f8568a = System.currentTimeMillis();
        }
    }

    /* renamed from: o */
    public void mo11630o() {
        if (this.f8569b == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f8569b = currentTimeMillis;
            long j = currentTimeMillis - this.f8568a;
            this.f8578l = j;
            if (j < 0) {
                this.f8578l = 0;
            }
            if (HybridMonitor.getInstance().isAbTestEnable()) {
                C2711i.m11480a().mo11579b(this.f8556d.mo11613b().get(), this.f8578l);
            }
        }
    }

    /* renamed from: a */
    public void mo11625a(long j) {
        this.f8571e = j;
    }

    /* renamed from: a */
    public void mo11624a(int i) {
        if (i == 100 && this.f8570c == 0) {
            this.f8570c = System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    public void mo11626a(String str) {
        if (this.f8556d.mo11622e() != 0) {
            this.f8575i = true;
            long parseLong = Long.parseLong(str) - this.f8556d.mo11622e();
            this.f8574h = parseLong;
            if (parseLong < 0) {
                this.f8574h = 0;
            }
            C2648b.m11130a("WebPerfReportData", " updateMonitorInitTimeData : " + this.f8574h);
        }
    }

    /* renamed from: b */
    public void mo11627b(String str) {
        if (!TextUtils.isEmpty(str)) {
            C2657e.m11171a(this.f8576j, str, C2657e.m11169a(this.f8576j, str) + 1);
            this.f8579m.add(str);
            C2648b.m11130a("WebPerfReportData", "addCount: " + str);
        }
    }

    public C2699c(C2697b bVar, String str) {
        super(bVar, str, bVar.f8408c);
    }
}
