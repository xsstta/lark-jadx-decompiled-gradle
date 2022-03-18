package io.reactivex;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.AbstractC68313e;

public interface ObservableEmitter<T> extends Emitter<T> {
    boolean isDisposed();

    ObservableEmitter<T> serialize();

    void setCancellable(AbstractC68313e eVar);

    void setDisposable(Disposable disposable);

    boolean tryOnError(Throwable th);
}
