package com.google.firebase.installations;

/* renamed from: com.google.firebase.installations.d */
final /* synthetic */ class RunnableC22856d implements Runnable {

    /* renamed from: a */
    private final C22853c f56505a;

    /* renamed from: b */
    private final boolean f56506b;

    private RunnableC22856d(C22853c cVar, boolean z) {
        this.f56505a = cVar;
        this.f56506b = z;
    }

    /* renamed from: a */
    public static Runnable m82998a(C22853c cVar, boolean z) {
        return new RunnableC22856d(cVar, z);
    }

    public void run() {
        this.f56505a.m82980b((C22853c) this.f56506b);
    }
}
