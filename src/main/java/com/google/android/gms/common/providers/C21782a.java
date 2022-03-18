package com.google.android.gms.common.providers;

import com.google.android.gms.common.providers.PooledExecutorsProvider;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.common.providers.a */
final class C21782a implements PooledExecutorsProvider.PooledExecutorFactory {
    C21782a() {
    }

    @Override // com.google.android.gms.common.providers.PooledExecutorsProvider.PooledExecutorFactory
    public final ScheduledExecutorService newSingleThreadScheduledExecutor() {
        return Executors.newSingleThreadScheduledExecutor();
    }
}
