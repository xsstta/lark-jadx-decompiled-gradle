package com.google.android.gms.internal.p979b;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.b.p */
public final class C21900p extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f53315a;

    public final int hashCode() {
        return this.f53315a;
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (this == obj) {
                return true;
            }
            C21900p pVar = (C21900p) obj;
            if (this.f53315a == pVar.f53315a && get() == pVar.get()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C21900p(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        Objects.requireNonNull(th, "The referent cannot be null");
        this.f53315a = System.identityHashCode(th);
    }
}
