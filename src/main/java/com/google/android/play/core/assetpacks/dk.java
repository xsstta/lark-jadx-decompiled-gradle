package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.bd;
import com.google.android.play.core.internal.cc;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class dk implements cc<Executor> {
    /* renamed from: b */
    public static Executor m82131b() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(da.f55909a);
        bd.m82322a(newSingleThreadExecutor, "Cannot return null from a non-@Nullable @Provides method");
        return newSingleThreadExecutor;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.internal.cc
    /* renamed from: a */
    public final /* synthetic */ Executor mo78728a() {
        return m82131b();
    }
}
