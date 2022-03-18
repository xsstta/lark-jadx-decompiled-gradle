package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.AbstractC21433h;
import com.google.android.datatransport.runtime.AbstractC21439l;
import com.google.android.datatransport.runtime.synchronization.AbstractC21521a;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.runtime.scheduling.c */
public final /* synthetic */ class C21491c implements AbstractC21521a.AbstractC21522a {

    /* renamed from: a */
    private final C21449a f52137a;

    /* renamed from: b */
    private final AbstractC21439l f52138b;

    /* renamed from: c */
    private final AbstractC21433h f52139c;

    private C21491c(C21449a aVar, AbstractC21439l lVar, AbstractC21433h hVar) {
        this.f52137a = aVar;
        this.f52138b = lVar;
        this.f52139c = hVar;
    }

    /* renamed from: a */
    public static AbstractC21521a.AbstractC21522a m77743a(C21449a aVar, AbstractC21439l lVar, AbstractC21433h hVar) {
        return new C21491c(aVar, lVar, hVar);
    }

    @Override // com.google.android.datatransport.runtime.synchronization.AbstractC21521a.AbstractC21522a
    /* renamed from: a */
    public Object mo72742a() {
        return C21449a.m77599a(this.f52137a, this.f52138b, this.f52139c);
    }
}
