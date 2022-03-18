package com.google.android.play.core.internal;

import com.google.android.play.core.tasks.C22741m;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.internal.f */
public final class C22637f extends AbstractRunnableC22634c {

    /* renamed from: a */
    final /* synthetic */ AbstractRunnableC22634c f56059a;

    /* renamed from: b */
    final /* synthetic */ C22622ac f56060b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C22637f(C22622ac acVar, C22741m mVar, AbstractRunnableC22634c cVar) {
        super(mVar);
        this.f56060b = acVar;
        this.f56059a = cVar;
    }

    @Override // com.google.android.play.core.internal.AbstractRunnableC22634c
    /* renamed from: a */
    public final void mo78814a() {
        C22622ac.m82230a(this.f56060b, this.f56059a);
    }
}
