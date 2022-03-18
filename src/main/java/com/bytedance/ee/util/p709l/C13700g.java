package com.bytedance.ee.util.p709l;

import com.bytedance.ee.util.p709l.AbstractC13691b;

/* renamed from: com.bytedance.ee.util.l.g */
public class C13700g implements AbstractC13691b, AbstractC13696d {

    /* renamed from: a */
    boolean f35895a;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.util.l.g$a */
    public static class C13702a {

        /* renamed from: a */
        public static final C13700g f35896a = new C13700g();
    }

    @Override // com.bytedance.ee.util.p709l.AbstractC13696d
    /* renamed from: c */
    public boolean mo50654c() {
        return false;
    }

    private C13700g() {
    }

    /* renamed from: a */
    public static C13700g m55592a() {
        return C13702a.f35896a;
    }

    @Override // com.bytedance.ee.util.p709l.AbstractC13696d
    /* renamed from: b */
    public boolean mo50653b() {
        return this.f35895a;
    }

    public String toString() {
        return "PortraitState{reverse=" + this.f35895a + '}';
    }

    @Override // com.bytedance.ee.util.p709l.AbstractC13691b
    /* renamed from: a */
    public void mo50651a(AbstractC13691b.AbstractC13692a aVar, int i) {
        if (i != -1) {
            if (Math.abs(90 - i) < 20) {
                C13693c a = C13693c.m55582a();
                a.f35888a = true;
                aVar.mo50652a(a);
            } else if (Math.abs(270 - i) < 20) {
                C13693c a2 = C13693c.m55582a();
                a2.f35888a = false;
                aVar.mo50652a(a2);
            } else if (this.f35895a && (Math.abs(360 - i) < 70 || Math.abs(i) < 70)) {
                this.f35895a = false;
                aVar.mo50652a(this);
            } else if (!this.f35895a && Math.abs(180 - i) < 70) {
                this.f35895a = true;
                aVar.mo50652a(this);
            }
        }
    }
}
