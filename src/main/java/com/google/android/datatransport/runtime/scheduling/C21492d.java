package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.backends.AbstractC21412e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC21520r;
import com.google.android.datatransport.runtime.scheduling.p974a.AbstractC21461c;
import com.google.android.datatransport.runtime.synchronization.AbstractC21521a;
import dagger.internal.AbstractC68174b;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* renamed from: com.google.android.datatransport.runtime.scheduling.d */
public final class C21492d implements AbstractC68174b<C21449a> {

    /* renamed from: a */
    private final Provider<Executor> f52140a;

    /* renamed from: b */
    private final Provider<AbstractC21412e> f52141b;

    /* renamed from: c */
    private final Provider<AbstractC21520r> f52142c;

    /* renamed from: d */
    private final Provider<AbstractC21461c> f52143d;

    /* renamed from: e */
    private final Provider<AbstractC21521a> f52144e;

    /* renamed from: a */
    public C21449a mo47880b() {
        return new C21449a(this.f52140a.mo47880b(), this.f52141b.mo47880b(), this.f52142c.mo47880b(), this.f52143d.mo47880b(), this.f52144e.mo47880b());
    }

    public C21492d(Provider<Executor> provider, Provider<AbstractC21412e> provider2, Provider<AbstractC21520r> provider3, Provider<AbstractC21461c> provider4, Provider<AbstractC21521a> provider5) {
        this.f52140a = provider;
        this.f52141b = provider2;
        this.f52142c = provider3;
        this.f52143d = provider4;
        this.f52144e = provider5;
    }

    /* renamed from: a */
    public static C21492d m77745a(Provider<Executor> provider, Provider<AbstractC21412e> provider2, Provider<AbstractC21520r> provider3, Provider<AbstractC21461c> provider4, Provider<AbstractC21521a> provider5) {
        return new C21492d(provider, provider2, provider3, provider4, provider5);
    }
}
