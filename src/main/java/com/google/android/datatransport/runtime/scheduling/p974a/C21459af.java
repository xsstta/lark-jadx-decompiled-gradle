package com.google.android.datatransport.runtime.scheduling.p974a;

import android.content.Context;
import dagger.internal.AbstractC68174b;
import javax.inject.Provider;

/* renamed from: com.google.android.datatransport.runtime.scheduling.a.af */
public final class C21459af implements AbstractC68174b<C21454ab> {

    /* renamed from: a */
    private final Provider<Context> f52095a;

    /* renamed from: b */
    private final Provider<Integer> f52096b;

    /* renamed from: a */
    public C21454ab mo47880b() {
        return new C21454ab(this.f52095a.mo47880b(), this.f52096b.mo47880b().intValue());
    }

    public C21459af(Provider<Context> provider, Provider<Integer> provider2) {
        this.f52095a = provider;
        this.f52096b = provider2;
    }

    /* renamed from: a */
    public static C21459af m77626a(Provider<Context> provider, Provider<Integer> provider2) {
        return new C21459af(provider, provider2);
    }
}
