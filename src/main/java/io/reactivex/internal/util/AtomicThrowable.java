package io.reactivex.internal.util;

import java.util.concurrent.atomic.AtomicReference;

public final class AtomicThrowable extends AtomicReference<Throwable> {
    private static final long serialVersionUID = 3949248817947090603L;

    public Throwable terminate() {
        return C68981f.m265559a(this);
    }

    public boolean isTerminated() {
        if (get() == C68981f.f172984a) {
            return true;
        }
        return false;
    }

    public boolean addThrowable(Throwable th) {
        return C68981f.m265560a(this, th);
    }
}
