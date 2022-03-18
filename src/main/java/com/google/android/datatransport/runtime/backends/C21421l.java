package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import dagger.internal.AbstractC68174b;
import javax.inject.Provider;

/* renamed from: com.google.android.datatransport.runtime.backends.l */
public final class C21421l implements AbstractC68174b<C21419k> {

    /* renamed from: a */
    private final Provider<Context> f52022a;

    /* renamed from: b */
    private final Provider<C21417i> f52023b;

    /* renamed from: a */
    public C21419k mo47880b() {
        return new C21419k(this.f52022a.mo47880b(), this.f52023b.mo47880b());
    }

    public C21421l(Provider<Context> provider, Provider<C21417i> provider2) {
        this.f52022a = provider;
        this.f52023b = provider2;
    }

    /* renamed from: a */
    public static C21421l m77500a(Provider<Context> provider, Provider<C21417i> provider2) {
        return new C21421l(provider, provider2);
    }
}
