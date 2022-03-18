package io.reactivex;

import io.reactivex.disposables.Disposable;

/* renamed from: io.reactivex.k */
public interface AbstractC68989k<T> {
    void onComplete();

    void onError(Throwable th);

    void onSubscribe(Disposable disposable);

    void onSuccess(T t);
}
