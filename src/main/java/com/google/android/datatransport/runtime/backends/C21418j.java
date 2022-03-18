package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.time.AbstractC21523a;
import dagger.internal.AbstractC68174b;
import javax.inject.Provider;

/* renamed from: com.google.android.datatransport.runtime.backends.j */
public final class C21418j implements AbstractC68174b<C21417i> {

    /* renamed from: a */
    private final Provider<Context> f52014a;

    /* renamed from: b */
    private final Provider<AbstractC21523a> f52015b;

    /* renamed from: c */
    private final Provider<AbstractC21523a> f52016c;

    /* renamed from: a */
    public C21417i mo47880b() {
        return new C21417i(this.f52014a.mo47880b(), this.f52015b.mo47880b(), this.f52016c.mo47880b());
    }

    /* renamed from: a */
    public static C21418j m77492a(Provider<Context> provider, Provider<AbstractC21523a> provider2, Provider<AbstractC21523a> provider3) {
        return new C21418j(provider, provider2, provider3);
    }

    public C21418j(Provider<Context> provider, Provider<AbstractC21523a> provider2, Provider<AbstractC21523a> provider3) {
        this.f52014a = provider;
        this.f52015b = provider2;
        this.f52016c = provider3;
    }
}
