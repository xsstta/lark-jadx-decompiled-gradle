package com.google.android.datatransport.runtime;

import com.google.android.datatransport.AbstractC21392d;
import com.google.android.datatransport.AbstractC21393e;
import com.google.android.datatransport.AbstractC21394f;
import com.google.android.datatransport.C21349b;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.runtime.m */
public final class C21441m implements AbstractC21394f {

    /* renamed from: a */
    private final Set<C21349b> f52048a;

    /* renamed from: b */
    private final AbstractC21439l f52049b;

    /* renamed from: c */
    private final AbstractC21444p f52050c;

    C21441m(Set<C21349b> set, AbstractC21439l lVar, AbstractC21444p pVar) {
        this.f52048a = set;
        this.f52049b = lVar;
        this.f52050c = pVar;
    }

    @Override // com.google.android.datatransport.AbstractC21394f
    /* renamed from: a */
    public <T> AbstractC21393e<T> mo72602a(String str, Class<T> cls, AbstractC21392d<T, byte[]> dVar) {
        return mo72601a(str, cls, C21349b.m77288a("proto"), dVar);
    }

    @Override // com.google.android.datatransport.AbstractC21394f
    /* renamed from: a */
    public <T> AbstractC21393e<T> mo72601a(String str, Class<T> cls, C21349b bVar, AbstractC21392d<T, byte[]> dVar) {
        if (this.f52048a.contains(bVar)) {
            return new C21442n(this.f52049b, str, bVar, dVar, this.f52050c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, this.f52048a));
    }
}
