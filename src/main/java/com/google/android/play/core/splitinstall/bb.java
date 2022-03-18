package com.google.android.play.core.splitinstall;

import java.util.concurrent.atomic.AtomicReference;

public final class bb {

    /* renamed from: a */
    private static final AtomicReference<ba> f56184a = new AtomicReference<>(null);

    /* renamed from: a */
    static ba m82617a() {
        return f56184a.get();
    }

    /* renamed from: a */
    public static void m82618a(ba baVar) {
        f56184a.compareAndSet(null, baVar);
    }
}
