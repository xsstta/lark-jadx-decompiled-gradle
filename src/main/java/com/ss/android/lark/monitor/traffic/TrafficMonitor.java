package com.ss.android.lark.monitor.traffic;

import com.facebook.battery.p951a.p953b.AbstractC20990a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.monitor.AbstractC48207a;
import com.ss.android.lark.monitor.AbstractC48230h;
import com.ss.android.lark.monitor.C48237n;
import com.ss.android.lark.monitor.C48241o;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class TrafficMonitor extends AbstractC48207a {

    /* renamed from: b */
    private AbstractC48230h f121473b;

    /* renamed from: c */
    private C48260f f121474c;

    /* renamed from: d */
    private C48259e f121475d;

    /* renamed from: e */
    private C48265i f121476e;

    /* renamed from: f */
    private C48258d f121477f;

    /* renamed from: g */
    private C48256b f121478g;

    /* renamed from: h */
    private C48237n f121479h;

    /* renamed from: i */
    private C48241o f121480i;

    /* renamed from: j */
    private volatile String f121481j;

    /* renamed from: k */
    private volatile String f121482k;

    /* renamed from: l */
    private volatile String f121483l;

    /* renamed from: m */
    private volatile String f121484m;

    /* renamed from: n */
    private long f121485n;

    /* renamed from: o */
    private volatile boolean f121486o;

    /* renamed from: p */
    private List<AbstractC48257c> f121487p;

    /* renamed from: q */
    private C48263h f121488q;

    @Retention(RetentionPolicy.SOURCE)
    public @interface AppStatus {
    }

    /* renamed from: b */
    private void m190399b() {
        for (AbstractC48257c cVar : this.f121487p) {
            cVar.mo168844b();
        }
    }

    /* renamed from: c */
    private void m190401c() {
        this.f121475d.mo168845a(this.f121474c.mo168840a());
        this.f121475d.mo168840a();
        this.f121476e.mo168840a();
        this.f121477f.mo168840a();
        this.f121478g.mo168840a();
    }

    /* renamed from: a */
    private void m190397a() {
        if (this.f121486o) {
            if (this.f121479h.f121426k) {
                this.f121488q.mo168848b();
            }
            synchronized (this) {
                String str = this.f121484m;
                String str2 = this.f121482k;
                m190401c();
                m190398a(str2, str);
                m190400b(str);
                m190399b();
                this.f121485n = System.currentTimeMillis();
                this.f121484m = this.f121483l;
                this.f121482k = this.f121481j;
            }
        }
    }

    public TrafficMonitor(C48237n nVar) {
        super(nVar);
        mo168835a(nVar);
    }

    /* renamed from: a */
    private String m190396a(String str) {
        if (str == null) {
            return "unknown";
        }
        int indexOf = str.indexOf(58);
        if (indexOf == -1) {
            return "main";
        }
        return str.substring(indexOf + 1);
    }

    /* renamed from: b */
    private void m190400b(String str) {
        TrafficReportTeaData trafficReportTeaData = new TrafficReportTeaData();
        trafficReportTeaData.process = m190396a(this.f121479h.f121427l);
        trafficReportTeaData.status = str;
        for (AbstractC48257c cVar : this.f121487p) {
            cVar.mo168843a(trafficReportTeaData);
        }
        if (!trafficReportTeaData.isInValid()) {
            TrafficReportSlardar trafficReportSlardar = new TrafficReportSlardar();
            trafficReportSlardar.native_cost = trafficReportTeaData.total - trafficReportTeaData.rust;
            trafficReportSlardar.rust_cost = trafficReportTeaData.rust;
            trafficReportSlardar.time = ((float) (System.currentTimeMillis() - this.f121485n)) / 3600000.0f;
            try {
                this.f121473b.mo168771c("lark_android_performance_traffic_monitor_metrics", new JSONObject(com.alibaba.fastjson.JSONObject.toJSONString(trafficReportTeaData)));
                this.f121473b.mo168763a("app_network_cost", new JSONObject(com.alibaba.fastjson.JSONObject.toJSONString(trafficReportSlardar)));
            } catch (JSONException e) {
                Log.m165389i("TrafficMonitor", "[onTriggerTrafficMetrics]" + e.toString());
            }
        }
    }

    /* renamed from: a */
    public void mo168835a(C48237n nVar) {
        this.f121485n = System.currentTimeMillis();
        this.f121482k = "MainActivity";
        this.f121481j = "MainActivity";
        this.f121483l = "1";
        this.f121484m = "1";
        this.f121479h = nVar;
        this.f121473b = nVar.f121420e;
        String str = nVar.f121418c;
        this.f121480i = new C48241o(str, nVar.f121419d + "-traffic");
        this.f121474c = new C48260f();
        this.f121475d = new C48259e(this.f121473b);
        this.f121476e = new C48265i(this.f121473b);
        this.f121477f = new C48258d(this.f121473b);
        this.f121478g = new C48256b(this.f121473b);
        ArrayList arrayList = new ArrayList();
        this.f121487p = arrayList;
        arrayList.add(this.f121474c);
        this.f121487p.add(this.f121475d);
        this.f121487p.add(this.f121476e);
        this.f121487p.add(this.f121477f);
        this.f121487p.add(this.f121478g);
        this.f121474c.mo168846a(nVar.f121416a, nVar.f121426k);
        this.f121486o = true;
        if (this.f121479h.f121426k) {
            C48263h hVar = new C48263h(nVar.f121420e);
            this.f121488q = hVar;
            hVar.mo168848b();
            this.f121479h.f121420e.mo168761a(new AbstractC48230h.AbstractC48231a() {
                /* class com.ss.android.lark.monitor.traffic.TrafficMonitor.C482531 */

                @Override // com.ss.android.lark.monitor.AbstractC48230h.AbstractC48231a
                /* renamed from: a */
                public void mo168774a(long j, long j2) {
                    TrafficMonitor.this.mo168834a(j, j2);
                }
            });
        }
    }

    @Override // com.ss.android.lark.monitor.AbstractC48207a
    /* renamed from: a */
    public void mo168678a(AbstractC20990a.AbstractC20991a aVar, int i) {
        m190397a();
    }

    /* renamed from: a */
    private void m190398a(String str, String str2) {
        TrafficMetricsLog trafficMetricsLog = new TrafficMetricsLog();
        trafficMetricsLog.begin(this.f121479h.f121421f.format(this.f121485n)).end(this.f121479h.f121421f.format(System.currentTimeMillis())).processName(m190396a(this.f121479h.f121427l)).lastActivity(str).appStatus(str2);
        for (AbstractC48257c cVar : this.f121487p) {
            cVar.mo168841a(trafficMetricsLog);
        }
        if (!trafficMetricsLog.isEmpty()) {
            trafficMetricsLog.convert2KB();
            com.alibaba.fastjson.JSONObject jSONObject = (com.alibaba.fastjson.JSONObject) com.alibaba.fastjson.JSONObject.toJSON(trafficMetricsLog);
            if (jSONObject != null) {
                this.f121480i.mo168798a(jSONObject.toJSONString());
            } else {
                Log.m165379d("TrafficMonitor", "[logMetrics]logJsonObject is null.");
            }
        }
    }

    /* renamed from: a */
    public void mo168834a(long j, long j2) {
        if (this.f121477f != null) {
            C48254a aVar = new C48254a(j, j2);
            aVar.f121492c = this.f121479h.f121427l;
            this.f121477f.mo168842a(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.monitor.traffic.TrafficMonitor$a */
    public class C48254a {

        /* renamed from: a */
        long f121490a;

        /* renamed from: b */
        long f121491b;

        /* renamed from: c */
        String f121492c;

        /* renamed from: d */
        String f121493d;

        /* renamed from: e */
        Set<String> f121494e;

        public C48254a(long j, long j2) {
            this.f121490a = j;
            this.f121491b = j2;
        }
    }

    /* renamed from: a */
    public void mo168836a(String str, long j, long j2) {
        if (this.f121478g != null) {
            C48254a aVar = new C48254a(j, j2);
            aVar.f121492c = this.f121479h.f121427l;
            aVar.f121493d = str;
            this.f121478g.mo168842a(aVar);
        }
    }

    @Override // com.ss.android.lark.monitor.AbstractC48207a
    /* renamed from: a */
    public void mo168679a(String str, String str2, String str3, String str4) {
        this.f121482k = str;
        this.f121483l = str4;
        this.f121484m = str2;
        this.f121481j = str3;
    }

    /* renamed from: a */
    public void mo168837a(String str, long j, long j2, Set<String> set) {
        if (this.f121476e != null) {
            C48254a aVar = new C48254a(j, j2);
            aVar.f121493d = str;
            aVar.f121492c = this.f121479h.f121427l;
            aVar.f121494e = set;
            this.f121476e.mo168842a(aVar);
        }
    }
}
