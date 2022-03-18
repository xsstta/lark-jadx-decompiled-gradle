package com.google.android.datatransport.runtime;

import com.google.android.datatransport.AbstractC21350c;
import com.google.android.datatransport.AbstractC21392d;
import com.google.android.datatransport.AbstractC21393e;
import com.google.android.datatransport.AbstractC21395g;
import com.google.android.datatransport.C21349b;

/* renamed from: com.google.android.datatransport.runtime.n */
final class C21442n<T> implements AbstractC21393e<T> {

    /* renamed from: a */
    private final AbstractC21439l f52051a;

    /* renamed from: b */
    private final String f52052b;

    /* renamed from: c */
    private final C21349b f52053c;

    /* renamed from: d */
    private final AbstractC21392d<T, byte[]> f52054d;

    /* renamed from: e */
    private final AbstractC21444p f52055e;

    /* renamed from: a */
    static /* synthetic */ void m77578a(Exception exc) {
    }

    @Override // com.google.android.datatransport.AbstractC21393e
    /* renamed from: a */
    public void mo72600a(AbstractC21350c<T> cVar) {
        mo72692a(cVar, C21443o.m77581a());
    }

    /* renamed from: a */
    public void mo72692a(AbstractC21350c<T> cVar, AbstractC21395g gVar) {
        this.f52055e.mo72693a(AbstractC21437k.m77554g().mo72632a(this.f52051a).mo72630a((AbstractC21350c<?>) cVar).mo72633a(this.f52052b).mo72631a((AbstractC21392d<?, byte[]>) this.f52054d).mo72629a(this.f52053c).mo72634a(), gVar);
    }

    C21442n(AbstractC21439l lVar, String str, C21349b bVar, AbstractC21392d<T, byte[]> dVar, AbstractC21444p pVar) {
        this.f52051a = lVar;
        this.f52052b = str;
        this.f52053c = bVar;
        this.f52054d = dVar;
        this.f52055e = pVar;
    }
}
