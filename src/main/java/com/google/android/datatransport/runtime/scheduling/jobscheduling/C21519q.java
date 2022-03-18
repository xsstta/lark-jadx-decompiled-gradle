package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.p974a.AbstractC21461c;
import com.google.android.datatransport.runtime.synchronization.AbstractC21521a;
import dagger.internal.AbstractC68174b;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.q */
public final class C21519q implements AbstractC68174b<C21516n> {

    /* renamed from: a */
    private final Provider<Executor> f52206a;

    /* renamed from: b */
    private final Provider<AbstractC21461c> f52207b;

    /* renamed from: c */
    private final Provider<AbstractC21520r> f52208c;

    /* renamed from: d */
    private final Provider<AbstractC21521a> f52209d;

    /* renamed from: a */
    public C21516n mo47880b() {
        return new C21516n(this.f52206a.mo47880b(), this.f52207b.mo47880b(), this.f52208c.mo47880b(), this.f52209d.mo47880b());
    }

    /* renamed from: a */
    public static C21519q m77822a(Provider<Executor> provider, Provider<AbstractC21461c> provider2, Provider<AbstractC21520r> provider3, Provider<AbstractC21521a> provider4) {
        return new C21519q(provider, provider2, provider3, provider4);
    }

    public C21519q(Provider<Executor> provider, Provider<AbstractC21461c> provider2, Provider<AbstractC21520r> provider3, Provider<AbstractC21521a> provider4) {
        this.f52206a = provider;
        this.f52207b = provider2;
        this.f52208c = provider3;
        this.f52209d = provider4;
    }
}
