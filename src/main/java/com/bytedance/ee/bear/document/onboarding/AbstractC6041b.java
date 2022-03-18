package com.bytedance.ee.bear.document.onboarding;

import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d;

/* renamed from: com.bytedance.ee.bear.document.onboarding.b */
public abstract class AbstractC6041b implements AbstractC10397d<C6042c> {

    /* renamed from: a */
    private OnBoardingData f16913a;

    /* renamed from: b */
    private C6095s f16914b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo21351a(C6042c cVar, OnBoardingData onBoardingData);

    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
    /* renamed from: c */
    public /* synthetic */ String mo21356c() {
        return AbstractC10397d.CC.$default$c(this);
    }

    public C6095s M_() {
        return this.f16914b;
    }

    /* renamed from: e */
    public OnBoardingData mo24401e() {
        return this.f16913a;
    }

    /* renamed from: a */
    public void mo24397a(OnBoardingData onBoardingData) {
        this.f16913a = onBoardingData;
    }

    /* renamed from: a */
    public void mo24398a(C6095s sVar) {
        this.f16914b = sVar;
    }

    /* renamed from: a */
    public boolean mo24400a(C6042c cVar) {
        return mo21351a(cVar, this.f16913a);
    }
}
