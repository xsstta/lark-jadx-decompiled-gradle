package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.scheduling.AbstractC21493e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C21509g;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C21516n;
import com.google.android.datatransport.runtime.time.AbstractC21523a;
import dagger.internal.AbstractC68174b;
import javax.inject.Provider;

/* renamed from: com.google.android.datatransport.runtime.s */
public final class C21448s implements AbstractC68174b<C21445q> {

    /* renamed from: a */
    private final Provider<AbstractC21523a> f52062a;

    /* renamed from: b */
    private final Provider<AbstractC21523a> f52063b;

    /* renamed from: c */
    private final Provider<AbstractC21493e> f52064c;

    /* renamed from: d */
    private final Provider<C21509g> f52065d;

    /* renamed from: e */
    private final Provider<C21516n> f52066e;

    /* renamed from: a */
    public C21445q mo47880b() {
        return new C21445q(this.f52062a.mo47880b(), this.f52063b.mo47880b(), this.f52064c.mo47880b(), this.f52065d.mo47880b(), this.f52066e.mo47880b());
    }

    public C21448s(Provider<AbstractC21523a> provider, Provider<AbstractC21523a> provider2, Provider<AbstractC21493e> provider3, Provider<C21509g> provider4, Provider<C21516n> provider5) {
        this.f52062a = provider;
        this.f52063b = provider2;
        this.f52064c = provider3;
        this.f52065d = provider4;
        this.f52066e = provider5;
    }

    /* renamed from: a */
    public static C21448s m77596a(Provider<AbstractC21523a> provider, Provider<AbstractC21523a> provider2, Provider<AbstractC21493e> provider3, Provider<C21509g> provider4, Provider<C21516n> provider5) {
        return new C21448s(provider, provider2, provider3, provider4, provider5);
    }
}
