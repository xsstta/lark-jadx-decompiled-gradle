package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.at */
abstract class AbstractC21654at {

    /* renamed from: a */
    private final ar f52687a;

    protected AbstractC21654at(ar arVar) {
        this.f52687a = arVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo73337a();

    /* renamed from: a */
    public final void mo73379a(as asVar) {
        as.m78419a(asVar).lock();
        try {
            if (as.m78420b(asVar) == this.f52687a) {
                mo73337a();
                as.m78419a(asVar).unlock();
            }
        } finally {
            as.m78419a(asVar).unlock();
        }
    }
}
