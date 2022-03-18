package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.AbstractC21439l;
import com.google.android.datatransport.runtime.synchronization.AbstractC21521a;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.i */
public final /* synthetic */ class C21511i implements AbstractC21521a.AbstractC21522a {

    /* renamed from: a */
    private final C21509g f52182a;

    /* renamed from: b */
    private final AbstractC21439l f52183b;

    private C21511i(C21509g gVar, AbstractC21439l lVar) {
        this.f52182a = gVar;
        this.f52183b = lVar;
    }

    /* renamed from: a */
    public static AbstractC21521a.AbstractC21522a m77805a(C21509g gVar, AbstractC21439l lVar) {
        return new C21511i(gVar, lVar);
    }

    @Override // com.google.android.datatransport.runtime.synchronization.AbstractC21521a.AbstractC21522a
    /* renamed from: a */
    public Object mo72742a() {
        return this.f52182a.f52173c.mo72734c(this.f52183b);
    }
}
