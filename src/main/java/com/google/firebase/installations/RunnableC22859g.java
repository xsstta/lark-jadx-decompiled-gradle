package com.google.firebase.installations;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.installations.g */
public final /* synthetic */ class RunnableC22859g implements Runnable {

    /* renamed from: a */
    private final C22853c f56509a;

    /* renamed from: b */
    private final boolean f56510b;

    private RunnableC22859g(C22853c cVar, boolean z) {
        this.f56509a = cVar;
        this.f56510b = z;
    }

    /* renamed from: a */
    public static Runnable m83001a(C22853c cVar, boolean z) {
        return new RunnableC22859g(cVar, z);
    }

    public void run() {
        this.f56509a.m82982c((C22853c) this.f56510b);
    }
}
