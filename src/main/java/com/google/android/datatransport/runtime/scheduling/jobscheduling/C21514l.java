package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.AbstractC21439l;
import com.google.android.datatransport.runtime.synchronization.AbstractC21521a;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.l */
public final /* synthetic */ class C21514l implements AbstractC21521a.AbstractC21522a {

    /* renamed from: a */
    private final C21509g f52190a;

    /* renamed from: b */
    private final AbstractC21439l f52191b;

    /* renamed from: c */
    private final int f52192c;

    private C21514l(C21509g gVar, AbstractC21439l lVar, int i) {
        this.f52190a = gVar;
        this.f52191b = lVar;
        this.f52192c = i;
    }

    /* renamed from: a */
    public static AbstractC21521a.AbstractC21522a m77811a(C21509g gVar, AbstractC21439l lVar, int i) {
        return new C21514l(gVar, lVar, i);
    }

    @Override // com.google.android.datatransport.runtime.synchronization.AbstractC21521a.AbstractC21522a
    /* renamed from: a */
    public Object mo72742a() {
        return this.f52190a.f52174d.mo72763a(this.f52191b, this.f52192c + 1);
    }
}
