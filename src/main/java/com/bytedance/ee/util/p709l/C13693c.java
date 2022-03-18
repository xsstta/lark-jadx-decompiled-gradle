package com.bytedance.ee.util.p709l;

import com.bytedance.ee.util.p709l.AbstractC13691b;

/* renamed from: com.bytedance.ee.util.l.c */
class C13693c implements AbstractC13691b, AbstractC13696d {

    /* renamed from: a */
    boolean f35888a;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.util.l.c$a */
    public static class C13695a {

        /* renamed from: a */
        public static final C13693c f35889a = new C13693c();
    }

    @Override // com.bytedance.ee.util.p709l.AbstractC13696d
    /* renamed from: c */
    public boolean mo50654c() {
        return true;
    }

    private C13693c() {
    }

    /* renamed from: a */
    public static C13693c m55582a() {
        return C13695a.f35889a;
    }

    @Override // com.bytedance.ee.util.p709l.AbstractC13696d
    /* renamed from: b */
    public boolean mo50653b() {
        return this.f35888a;
    }

    public String toString() {
        return "LandscapeState{reverse=" + this.f35888a + '}';
    }

    @Override // com.bytedance.ee.util.p709l.AbstractC13691b
    /* renamed from: a */
    public void mo50651a(AbstractC13691b.AbstractC13692a aVar, int i) {
        if (i != -1) {
            if (Math.abs(360 - i) < 20 || Math.abs(i) < 20) {
                C13700g a = C13700g.m55592a();
                a.f35895a = false;
                aVar.mo50652a(a);
            } else if (Math.abs(180 - i) < 20) {
                C13700g a2 = C13700g.m55592a();
                a2.f35895a = true;
                aVar.mo50652a(a2);
            } else if (this.f35888a && Math.abs(270 - i) < 70) {
                this.f35888a = false;
                aVar.mo50652a(this);
            } else if (!this.f35888a && Math.abs(90 - i) < 70) {
                this.f35888a = true;
                aVar.mo50652a(this);
            }
        }
    }
}
