package com.google.android.gms.internal.base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.base.g */
final class C21908g implements AbstractC21905d {
    private C21908g() {
    }

    @Override // com.google.android.gms.internal.base.AbstractC21905d
    /* renamed from: a */
    public final ExecutorService mo74010a(int i, ThreadFactory threadFactory, int i2) {
        return Executors.newFixedThreadPool(2, threadFactory);
    }
}
