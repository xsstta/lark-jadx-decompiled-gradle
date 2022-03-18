package com.ss.android.lark.monitor;

import com.facebook.battery.p951a.p953b.AbstractC20990a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.monitor.C48221b;

/* renamed from: com.ss.android.lark.monitor.f */
public class C48228f extends AbstractC48207a {

    /* renamed from: b */
    private final String f121408b = "CpuThreadMonitor";

    /* renamed from: c */
    private C48227e f121409c = new C48227e();

    /* renamed from: d */
    private C48229g f121410d;

    /* renamed from: e */
    private CpuThreadMetrics f121411e;

    /* renamed from: a */
    private float m190324a() {
        if (this.f121316a.f121426k) {
            return this.f121316a.f121422g;
        }
        return this.f121316a.f121423h;
    }

    public C48228f(C48237n nVar) {
        super(nVar);
        this.f121410d = new C48229g(nVar.f121428m);
    }

    /* renamed from: a */
    private double m190323a(C48221b.C48223a aVar) {
        int i = this.f121316a.f121424i;
        double a = aVar.mo168734a();
        if (a <= ((double) i)) {
            return 0.0d;
        }
        return ((aVar.mo168740b() * 100.0d) / Math.max(a, 1.0d)) / ((Math.pow(0.965d, a) * 200.0d) + ((double) m190324a()));
    }

    @Override // com.ss.android.lark.monitor.AbstractC48207a
    /* renamed from: a */
    public void mo168678a(AbstractC20990a.AbstractC20991a aVar, int i) {
        CpuThreadMetrics cpuThreadMetrics;
        C48221b.C48223a a = ((C48250s) aVar).mo168812a();
        if (i == 1) {
            CpuThreadMetrics a2 = this.f121409c.mo71110b();
            if (this.f121409c.mo71109a(a2)) {
                this.f121411e = a2;
            }
        } else if (i == 0 || i == 2) {
            double a3 = m190323a(a);
            Log.m165379d("CpuThreadMonitor", "multiple :" + a3);
            int i2 = (a3 > 1.0d ? 1 : (a3 == 1.0d ? 0 : -1));
            if (i2 >= 0 || i == 2) {
                cpuThreadMetrics = this.f121409c.mo71110b();
                if (this.f121409c.mo71109a(cpuThreadMetrics) && this.f121411e != null && i2 >= 0) {
                    aVar.mo71088a("cpu_overload_multiple", a3);
                    this.f121410d.mo71087a((CpuThreadMetrics) cpuThreadMetrics.diff(this.f121411e), aVar);
                }
            } else {
                cpuThreadMetrics = null;
            }
            if (i == 0) {
                this.f121411e = null;
            } else {
                this.f121411e = cpuThreadMetrics;
            }
        }
    }
}
