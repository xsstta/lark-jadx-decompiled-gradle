package com.google.firebase.installations;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.installations.f */
public final /* synthetic */ class RunnableC22858f implements Runnable {

    /* renamed from: a */
    private final C22853c f56508a;

    private RunnableC22858f(C22853c cVar) {
        this.f56508a = cVar;
    }

    /* renamed from: a */
    public static Runnable m83000a(C22853c cVar) {
        return new RunnableC22858f(cVar);
    }

    public void run() {
        this.f56508a.m82982c((C22853c) false);
    }
}
