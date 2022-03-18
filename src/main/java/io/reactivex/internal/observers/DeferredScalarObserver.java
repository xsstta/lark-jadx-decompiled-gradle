package io.reactivex.internal.observers;

import io.reactivex.AbstractC69009q;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

public abstract class DeferredScalarObserver<T, R> extends DeferredScalarDisposable<R> implements AbstractC69009q<T> {
    private static final long serialVersionUID = -266195175408988651L;
    protected Disposable upstream;

    @Override // io.reactivex.disposables.Disposable, io.reactivex.internal.observers.DeferredScalarDisposable
    public void dispose() {
        super.dispose();
        this.upstream.dispose();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: io.reactivex.internal.observers.DeferredScalarObserver<T, R> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.AbstractC69009q
    public void onComplete() {
        Object obj = this.value;
        if (obj != null) {
            this.value = null;
            complete(obj);
            return;
        }
        complete();
    }

    public DeferredScalarObserver(AbstractC69009q<? super R> qVar) {
        super(qVar);
    }

    @Override // io.reactivex.AbstractC69009q
    public void onError(Throwable th) {
        this.value = null;
        error(th);
    }

    @Override // io.reactivex.AbstractC69009q
    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.upstream, disposable)) {
            this.upstream = disposable;
            this.downstream.onSubscribe(this);
        }
    }
}
