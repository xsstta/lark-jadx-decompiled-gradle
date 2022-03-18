package io.reactivex.internal.disposables;

import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.AbstractC68313e;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class CancellableDisposable extends AtomicReference<AbstractC68313e> implements Disposable {
    private static final long serialVersionUID = 5718521705281392066L;

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        if (get() == null) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        AbstractC68313e eVar;
        if (get() != null && (eVar = (AbstractC68313e) getAndSet(null)) != null) {
            try {
                eVar.cancel();
            } catch (Exception e) {
                C68306a.m265071b(e);
                RxJavaPlugins.onError(e);
            }
        }
    }

    public CancellableDisposable(AbstractC68313e eVar) {
        super(eVar);
    }
}
