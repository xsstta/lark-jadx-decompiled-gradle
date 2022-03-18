package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.AbstractC21439l;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.synchronization.AbstractC21521a;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.j */
public final /* synthetic */ class C21512j implements AbstractC21521a.AbstractC21522a {

    /* renamed from: a */
    private final C21509g f52184a;

    /* renamed from: b */
    private final BackendResponse f52185b;

    /* renamed from: c */
    private final Iterable f52186c;

    /* renamed from: d */
    private final AbstractC21439l f52187d;

    /* renamed from: e */
    private final int f52188e;

    private C21512j(C21509g gVar, BackendResponse backendResponse, Iterable iterable, AbstractC21439l lVar, int i) {
        this.f52184a = gVar;
        this.f52185b = backendResponse;
        this.f52186c = iterable;
        this.f52187d = lVar;
        this.f52188e = i;
    }

    /* renamed from: a */
    public static AbstractC21521a.AbstractC21522a m77807a(C21509g gVar, BackendResponse backendResponse, Iterable iterable, AbstractC21439l lVar, int i) {
        return new C21512j(gVar, backendResponse, iterable, lVar, i);
    }

    @Override // com.google.android.datatransport.runtime.synchronization.AbstractC21521a.AbstractC21522a
    /* renamed from: a */
    public Object mo72742a() {
        return C21509g.m77798a(this.f52184a, this.f52185b, this.f52186c, this.f52187d, this.f52188e);
    }
}
