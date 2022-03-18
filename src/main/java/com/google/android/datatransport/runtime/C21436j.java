package com.google.android.datatransport.runtime;

import dagger.internal.AbstractC68174b;
import dagger.internal.C68177e;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.datatransport.runtime.j */
public final class C21436j implements AbstractC68174b<Executor> {

    /* renamed from: a */
    private static final C21436j f52047a = new C21436j();

    /* renamed from: c */
    public static C21436j m77550c() {
        return f52047a;
    }

    /* renamed from: a */
    public Executor mo47880b() {
        return m77551d();
    }

    /* renamed from: d */
    public static Executor m77551d() {
        return (Executor) C68177e.m264824a(AbstractC21435i.m77549a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
