package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.p974a.AbstractC21461c;
import com.google.android.datatransport.runtime.synchronization.AbstractC21521a;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.k */
public final /* synthetic */ class C21513k implements AbstractC21521a.AbstractC21522a {

    /* renamed from: a */
    private final AbstractC21461c f52189a;

    private C21513k(AbstractC21461c cVar) {
        this.f52189a = cVar;
    }

    /* renamed from: a */
    public static AbstractC21521a.AbstractC21522a m77809a(AbstractC21461c cVar) {
        return new C21513k(cVar);
    }

    @Override // com.google.android.datatransport.runtime.synchronization.AbstractC21521a.AbstractC21522a
    /* renamed from: a */
    public Object mo72742a() {
        return Integer.valueOf(this.f52189a.mo72731b());
    }
}
