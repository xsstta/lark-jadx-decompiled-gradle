package io.reactivex.disposables;

import io.reactivex.internal.p3459a.C68362b;
import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
/* renamed from: io.reactivex.disposables.c */
public abstract class AbstractC68291c<T> extends AtomicReference<T> implements Disposable {
    private static final long serialVersionUID = 6537757548749041217L;

    /* access modifiers changed from: protected */
    public abstract void onDisposed(T t);

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        if (get() == null) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: io.reactivex.disposables.c<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        Object andSet;
        if (get() != null && (andSet = getAndSet(null)) != null) {
            onDisposed(andSet);
        }
    }

    AbstractC68291c(T t) {
        super(C68362b.m265229a((Object) t, "value is null"));
    }
}
