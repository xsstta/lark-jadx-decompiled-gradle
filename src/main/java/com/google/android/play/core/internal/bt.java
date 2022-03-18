package com.google.android.play.core.internal;

import java.util.Objects;

final class bt extends bi {

    /* renamed from: a */
    private final bl f56043a = new bl();

    bt() {
    }

    @Override // com.google.android.play.core.internal.bi
    /* renamed from: a */
    public final void mo78884a(Throwable th, Throwable th2) {
        if (th2 != th) {
            Objects.requireNonNull(th2, "The suppressed exception cannot be null.");
            this.f56043a.mo78887a(th).add(th2);
            return;
        }
        throw new IllegalArgumentException("Self suppression is not allowed.", th2);
    }
}
