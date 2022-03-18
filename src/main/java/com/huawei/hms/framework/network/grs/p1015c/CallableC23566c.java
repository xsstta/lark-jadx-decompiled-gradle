package com.huawei.hms.framework.network.grs.p1015c;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* renamed from: com.huawei.hms.framework.network.grs.c.c */
class CallableC23566c implements Callable<C23568e> {

    /* renamed from: a */
    final /* synthetic */ ExecutorService f58082a;

    /* renamed from: b */
    final /* synthetic */ String f58083b;

    /* renamed from: c */
    final /* synthetic */ C23567d f58084c;

    CallableC23566c(C23567d dVar, ExecutorService executorService, String str) {
        this.f58084c = dVar;
        this.f58082a = executorService;
        this.f58083b = str;
    }

    @Override // java.util.concurrent.Callable
    public C23568e call() {
        return this.f58084c.m85470b(this.f58082a, this.f58083b);
    }
}
