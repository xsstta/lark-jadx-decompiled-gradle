package com.google.android.play.core.internal;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class bk extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f56037a;

    public bk(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.f56037a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        bk bkVar = (bk) obj;
        return this.f56037a == bkVar.f56037a && get() == bkVar.get();
    }

    public final int hashCode() {
        return this.f56037a;
    }
}
