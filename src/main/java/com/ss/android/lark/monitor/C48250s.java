package com.ss.android.lark.monitor;

import androidx.core.util.C0844e;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.monitor.C48221b;
import com.ss.android.lark.monitor.traffic.C48261g;

/* renamed from: com.ss.android.lark.monitor.s */
public class C48250s implements AbstractC48252t {

    /* renamed from: a */
    C48241o f121465a;

    /* renamed from: b */
    AbstractC48230h f121466b;

    /* renamed from: c */
    AbstractC48232i f121467c;

    /* renamed from: d */
    boolean f121468d;

    /* renamed from: e */
    C48261g f121469e = new C48261g(new C48261g.AbstractC48262a() {
        /* class com.ss.android.lark.monitor.C48250s.C482511 */
    });

    /* renamed from: f */
    private C48221b.C48223a f121470f;

    /* renamed from: g */
    private long f121471g;

    /* renamed from: a */
    public C48221b.C48223a mo168812a() {
        return this.f121470f;
    }

    /* renamed from: b */
    public void mo168815b() {
        this.f121470f.mo168737a(System.currentTimeMillis());
        C48221b c = this.f121470f.mo168746c();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f121467c.format(c.f121380l));
        sb.append("-");
        sb.append(this.f121467c.format(c.f121381m));
        sb.append("\n");
        sb.append(c.f121375g);
        sb.append("\n");
        sb.append(c.f121369a);
        sb.append("\n");
        if (!"event_sdk_traffic".equals(c.f121369a)) {
            sb.append(String.format("%.2fs %6.2fs %3.2f%%", Double.valueOf(c.f121382n), Double.valueOf(c.f121374f), Double.valueOf((c.f121374f * 100.0d) / Math.max(1.0d, c.f121382n))));
            sb.append("\n");
            if (!c.f121384p.isEmpty()) {
                for (C0844e<String, Double> eVar : c.f121384p) {
                    if (eVar != null) {
                        sb.append(String.format("%-15s: %6.2f", eVar.f3317a, eVar.f3318b));
                        sb.append("\n");
                    }
                }
            }
            sb.append("javaHeap  nativeHeap  totalMem  maxMem\n");
            sb.append(String.format("%sMB  %5sMB %5sMB %5sMB", Integer.valueOf(c.f121378j), Integer.valueOf(c.f121379k), Integer.valueOf(c.f121377i), Integer.valueOf(c.f121376h)));
            sb.append("\n");
        }
        sb.append("cost:" + (System.currentTimeMillis() - this.f121471g) + "\n");
        String sb2 = sb.toString();
        this.f121465a.mo168798a(sb2);
        this.f121466b.mo168760a(c);
        if (c.f121383o >= 1.0d) {
            this.f121466b.mo168762a(c.f121375g, c.f121383o, c.f121384p);
        }
        if (this.f121468d) {
            Log.m165379d("LarkMetrics", sb2);
        }
    }

    public C48250s(C48237n nVar) {
        this.f121465a = new C48241o(nVar.f121418c, nVar.f121419d);
        this.f121466b = nVar.f121420e;
        this.f121467c = nVar.f121421f;
        this.f121468d = nVar.f121430o;
    }

    /* renamed from: b */
    public void mo168816b(String str, String str2) {
        if ("process_name".equals(str)) {
            this.f121470f.mo168743b(str2);
        }
    }

    /* renamed from: a */
    public void mo168813a(String str, String str2) {
        this.f121471g = System.currentTimeMillis();
        this.f121470f = C48221b.m190293a().mo168738a(str2);
    }

    @Override // com.facebook.battery.p951a.p953b.AbstractC20990a.AbstractC20991a
    /* renamed from: a */
    public void mo71088a(String str, double d) {
        if ("cpu_system_time_s".equals(str)) {
            this.f121470f.mo168750f(d);
        } else if ("cpu_user_time_s".equals(str)) {
            this.f121470f.mo168751g(d);
        } else if ("cpu_overload_multiple".equals(str)) {
            this.f121470f.mo168752h(d);
        }
    }

    @Override // com.facebook.battery.p951a.p953b.AbstractC20990a.AbstractC20991a
    /* renamed from: a */
    public void mo71089a(String str, int i) {
        if ("max_mem".equals(str)) {
            this.f121470f.mo168736a(i);
        } else if ("total_mem".equals(str)) {
            this.f121470f.mo168742b(i);
        } else if ("native_heap".equals(str)) {
            this.f121470f.mo168748d(i);
        } else if ("java_heap".equals(str)) {
            this.f121470f.mo168745c(i);
        }
    }

    @Override // com.facebook.battery.p951a.p953b.AbstractC20990a.AbstractC20991a
    /* renamed from: a */
    public void mo71090a(String str, long j) {
        if ("mobile_bytes_rx".equals(str)) {
            this.f121470f.mo168747d((double) ((((float) j) * 1.0f) / 1024.0f));
        } else if ("mobile_bytes_tx".equals(str)) {
            this.f121470f.mo168744c((double) ((((float) j) * 1.0f) / 1024.0f));
        } else if ("wifi_bytes_rx".equals(str)) {
            this.f121470f.mo168741b((double) ((((float) j) * 1.0f) / 1024.0f));
        } else if ("wifi_bytes_tx".equals(str)) {
            this.f121470f.mo168735a((double) ((((float) j) * 1.0f) / 1024.0f));
        } else if ("realtime_ms".equals(str)) {
            this.f121470f.mo168749e((double) ((((float) j) * 1.0f) / 1000.0f));
        }
    }

    @Override // com.ss.android.lark.monitor.AbstractC48252t
    /* renamed from: a */
    public void mo168814a(String str, String str2, double d) {
        if ("top_thread_cpu".equals(str)) {
            this.f121470f.mo168739a(str2, d);
        }
    }
}
