package com.bytedance.ee.bear.onboarding.export.ui;

import com.bytedance.ee.bear.onboarding.export.AbstractC10400d;
import com.bytedance.ee.bear.onboarding.export.mission.OnBoardingListener;
import com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10396b;
import com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.onboarding.export.ui.b */
public class C10404b implements AbstractC10400d.AbstractC10402b {

    /* renamed from: a */
    private AbstractC10397d<? extends AbstractC10405c> f27967a;

    /* renamed from: b */
    private AbstractC10396b f27968b;

    /* renamed from: c */
    private OnBoardingListener f27969c;

    /* renamed from: d */
    private AbstractC10400d.AbstractC10401a f27970d;

    @Override // com.bytedance.ee.bear.onboarding.export.AbstractC10400d.AbstractC10402b
    /* renamed from: a */
    public void mo39600a() {
        AbstractC10396b bVar = this.f27968b;
        if (bVar != null) {
            bVar.mo24388b(this.f27967a);
        }
        OnBoardingListener cVar = this.f27969c;
        if (cVar != null) {
            cVar.mo30552a(this.f27967a);
        }
    }

    @Override // com.bytedance.ee.bear.onboarding.export.AbstractC10400d.AbstractC10402b
    /* renamed from: b */
    public void mo39602b() {
        AbstractC10396b bVar = this.f27968b;
        if (bVar != null) {
            bVar.mo24386a(this.f27967a);
        }
        OnBoardingListener cVar = this.f27969c;
        if (cVar != null) {
            cVar.mo30553b(this.f27967a);
        }
    }

    @Override // com.bytedance.ee.bear.onboarding.export.AbstractC10400d.AbstractC10402b
    /* renamed from: a */
    public void mo39601a(boolean z) {
        AbstractC10396b bVar;
        OnBoardingListener cVar = this.f27969c;
        if (cVar != null) {
            cVar.mo30554c(this.f27967a);
        }
        if (!z && (bVar = this.f27968b) != null) {
            bVar.mo24387a(this.f27967a, "No user action performed.");
        }
        AbstractC10400d.AbstractC10401a aVar = this.f27970d;
        if (aVar != null) {
            aVar.mo39530a(this.f27967a, z);
        }
    }

    public C10404b(AbstractC10397d<? extends AbstractC10405c> dVar, AbstractC10396b bVar, OnBoardingListener cVar, AbstractC10400d.AbstractC10401a aVar) {
        this.f27967a = dVar;
        this.f27968b = bVar;
        this.f27969c = cVar;
        this.f27970d = aVar;
    }
}
