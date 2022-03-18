package com.ss.android.lark.monitor;

import com.facebook.battery.p951a.p953b.AbstractC20990a;

/* renamed from: com.ss.android.lark.monitor.l */
public class C48235l extends AbstractC48207a {

    /* renamed from: b */
    private C48234k f121414b;

    /* renamed from: c */
    private C48236m f121415c = new C48236m();

    public C48235l(C48237n nVar) {
        super(nVar);
        this.f121414b = new C48234k(nVar.f121416a);
    }

    @Override // com.ss.android.lark.monitor.AbstractC48207a
    /* renamed from: a */
    public void mo168678a(AbstractC20990a.AbstractC20991a aVar, int i) {
        C48233j a = this.f121414b.mo71110b();
        this.f121414b.mo71109a(a);
        this.f121415c.mo71087a(a, aVar);
    }
}
