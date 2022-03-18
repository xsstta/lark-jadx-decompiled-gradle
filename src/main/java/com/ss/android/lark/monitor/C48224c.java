package com.ss.android.lark.monitor;

import com.facebook.battery.metrics.composite.C20994a;
import com.facebook.battery.metrics.composite.CompositeMetrics;
import com.facebook.battery.metrics.core.C20996a;
import com.facebook.battery.metrics.cpu.C21001a;
import com.facebook.battery.metrics.cpu.CpuMetrics;
import com.facebook.battery.metrics.time.C21010a;
import com.facebook.battery.metrics.time.TimeMetrics;
import com.facebook.battery.p951a.p952a.C20989a;
import com.facebook.battery.p951a.p953b.AbstractC20990a;
import com.facebook.battery.p951a.p954c.C20992a;
import com.facebook.battery.p951a.p955d.C20993a;

/* renamed from: com.ss.android.lark.monitor.c */
public class C48224c extends AbstractC48207a {

    /* renamed from: b */
    private C20994a f121401b;

    /* renamed from: c */
    private C20989a f121402c = new C20989a().mo71085a(TimeMetrics.class, new C20993a()).mo71085a(CpuMetrics.class, new C20992a());

    /* renamed from: d */
    private C20996a<CompositeMetrics, C20994a> f121403d;

    public C48224c(C48237n nVar) {
        super(nVar);
        C20994a.C20995a a = new C20994a.C20995a().mo71111a(TimeMetrics.class, new C21010a()).mo71111a(CpuMetrics.class, new C21001a());
        C20994a a2 = a.mo71112a();
        this.f121401b = a2;
        this.f121403d = new C20996a<>(a2);
    }

    @Override // com.ss.android.lark.monitor.AbstractC48207a
    /* renamed from: a */
    public void mo168678a(AbstractC20990a.AbstractC20991a aVar, int i) {
        this.f121402c.mo71087a(this.f121403d.mo71115a(), aVar);
    }
}
