package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.ah */
abstract class AbstractRunnableC21652ah implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C21690y f52633a;

    private AbstractRunnableC21652ah(C21690y yVar) {
        this.f52633a = yVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo73336a();

    public void run() {
        C21690y.m78812c(this.f52633a).lock();
        try {
            if (!Thread.interrupted()) {
                mo73336a();
                C21690y.m78812c(this.f52633a).unlock();
            }
        } catch (RuntimeException e) {
            C21690y.m78813d(this.f52633a).mo73367a(e);
        } finally {
            C21690y.m78812c(this.f52633a).unlock();
        }
    }

    /* synthetic */ AbstractRunnableC21652ah(C21690y yVar, RunnableC21691z zVar) {
        this(yVar);
    }
}
