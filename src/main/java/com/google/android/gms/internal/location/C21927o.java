package com.google.android.gms.internal.location;

import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.internal.location.o */
public final class C21927o {
    /* renamed from: a */
    public static Looper m79248a() {
        Preconditions.checkState(Looper.myLooper() != null, "Can't create handler inside thread that has not called Looper.prepare()");
        return Looper.myLooper();
    }

    /* renamed from: a */
    public static Looper m79249a(Looper looper) {
        return looper != null ? looper : m79248a();
    }
}
