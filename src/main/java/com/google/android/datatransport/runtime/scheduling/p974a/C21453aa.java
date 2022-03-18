package com.google.android.datatransport.runtime.scheduling.p974a;

import com.google.android.datatransport.runtime.time.AbstractC21523a;
import dagger.internal.AbstractC68174b;
import javax.inject.Provider;

/* renamed from: com.google.android.datatransport.runtime.scheduling.a.aa */
public final class C21453aa implements AbstractC68174b<C21468i> {

    /* renamed from: a */
    private final Provider<AbstractC21523a> f52081a;

    /* renamed from: b */
    private final Provider<AbstractC21523a> f52082b;

    /* renamed from: c */
    private final Provider<AbstractC21462d> f52083c;

    /* renamed from: d */
    private final Provider<C21454ab> f52084d;

    /* renamed from: a */
    public C21468i mo47880b() {
        return new C21468i(this.f52081a.mo47880b(), this.f52082b.mo47880b(), this.f52083c.mo47880b(), this.f52084d.mo47880b());
    }

    /* renamed from: a */
    public static C21453aa m77611a(Provider<AbstractC21523a> provider, Provider<AbstractC21523a> provider2, Provider<AbstractC21462d> provider3, Provider<C21454ab> provider4) {
        return new C21453aa(provider, provider2, provider3, provider4);
    }

    public C21453aa(Provider<AbstractC21523a> provider, Provider<AbstractC21523a> provider2, Provider<AbstractC21462d> provider3, Provider<C21454ab> provider4) {
        this.f52081a = provider;
        this.f52082b = provider2;
        this.f52083c = provider3;
        this.f52084d = provider4;
    }
}
