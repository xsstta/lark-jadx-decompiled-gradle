package com.ss.android.ad.splash.core;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ad.splash.core.b */
final class C27269b {

    /* renamed from: a */
    private static final List<WeakReference<AbstractC27301f>> f67947a = new ArrayList();

    /* renamed from: a */
    static void m99130a(AbstractC27301f fVar) {
        if (fVar != null) {
            f67947a.add(new WeakReference<>(fVar));
        }
    }
}
