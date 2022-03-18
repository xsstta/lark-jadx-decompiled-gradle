package com.google.firebase.installations;

import java.util.concurrent.Callable;

/* renamed from: com.google.firebase.installations.e */
final /* synthetic */ class CallableC22857e implements Callable {

    /* renamed from: a */
    private final C22853c f56507a;

    private CallableC22857e(C22853c cVar) {
        this.f56507a = cVar;
    }

    /* renamed from: a */
    public static Callable m82999a(C22853c cVar) {
        return new CallableC22857e(cVar);
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        return this.f56507a.mo79386f();
    }
}
