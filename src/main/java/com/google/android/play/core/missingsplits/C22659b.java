package com.google.android.play.core.missingsplits;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.play.core.missingsplits.b */
public class C22659b {

    /* renamed from: a */
    private static final AtomicReference<Boolean> f56067a = new AtomicReference<>(null);

    /* renamed from: a */
    public static AbstractC22658a m82479a(Context context) {
        return new C22661d(context, Runtime.getRuntime(), new C22660c(context, context.getPackageManager()), f56067a);
    }
}
