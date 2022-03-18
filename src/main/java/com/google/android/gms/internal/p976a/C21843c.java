package com.google.android.gms.internal.p976a;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.a.c */
final class C21843c implements AbstractC21842b {
    private C21843c() {
    }

    @Override // com.google.android.gms.internal.p976a.AbstractC21842b
    /* renamed from: a */
    public final ScheduledExecutorService mo73918a(int i, ThreadFactory threadFactory, int i2) {
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, threadFactory));
    }
}
