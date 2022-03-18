package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.AbstractC21412e;
import com.google.android.datatransport.runtime.scheduling.p974a.AbstractC21461c;
import com.google.android.datatransport.runtime.synchronization.AbstractC21521a;
import com.google.android.datatransport.runtime.time.AbstractC21523a;
import dagger.internal.AbstractC68174b;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.m */
public final class C21515m implements AbstractC68174b<C21509g> {

    /* renamed from: a */
    private final Provider<Context> f52193a;

    /* renamed from: b */
    private final Provider<AbstractC21412e> f52194b;

    /* renamed from: c */
    private final Provider<AbstractC21461c> f52195c;

    /* renamed from: d */
    private final Provider<AbstractC21520r> f52196d;

    /* renamed from: e */
    private final Provider<Executor> f52197e;

    /* renamed from: f */
    private final Provider<AbstractC21521a> f52198f;

    /* renamed from: g */
    private final Provider<AbstractC21523a> f52199g;

    /* renamed from: a */
    public C21509g mo47880b() {
        return new C21509g(this.f52193a.mo47880b(), this.f52194b.mo47880b(), this.f52195c.mo47880b(), this.f52196d.mo47880b(), this.f52197e.mo47880b(), this.f52198f.mo47880b(), this.f52199g.mo47880b());
    }

    /* renamed from: a */
    public static C21515m m77813a(Provider<Context> provider, Provider<AbstractC21412e> provider2, Provider<AbstractC21461c> provider3, Provider<AbstractC21520r> provider4, Provider<Executor> provider5, Provider<AbstractC21521a> provider6, Provider<AbstractC21523a> provider7) {
        return new C21515m(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public C21515m(Provider<Context> provider, Provider<AbstractC21412e> provider2, Provider<AbstractC21461c> provider3, Provider<AbstractC21520r> provider4, Provider<Executor> provider5, Provider<AbstractC21521a> provider6, Provider<AbstractC21523a> provider7) {
        this.f52193a = provider;
        this.f52194b = provider2;
        this.f52195c = provider3;
        this.f52196d = provider4;
        this.f52197e = provider5;
        this.f52198f = provider6;
        this.f52199g = provider7;
    }
}
