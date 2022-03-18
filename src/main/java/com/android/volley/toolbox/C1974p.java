package com.android.volley.toolbox;

import android.os.Looper;

/* access modifiers changed from: package-private */
/* renamed from: com.android.volley.toolbox.p */
public final class C1974p {
    /* renamed from: a */
    static void m8698a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Must be invoked from the main thread.");
        }
    }
}
