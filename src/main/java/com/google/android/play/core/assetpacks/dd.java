package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.bd;
import com.google.android.play.core.internal.cc;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class dd implements cc<Executor> {
    /* renamed from: b */
    public static Executor m82121b() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(cz.f55908a);
        bd.m82322a(newSingleThreadExecutor, "Cannot return null from a non-@Nullable @Provides method");
        return newSingleThreadExecutor;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.internal.cc
    /* renamed from: a */
    public final /* synthetic */ Executor mo78728a() {
        return m82121b();
    }
}
