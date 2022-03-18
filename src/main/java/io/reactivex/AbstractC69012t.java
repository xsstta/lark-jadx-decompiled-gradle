package io.reactivex;

import io.reactivex.disposables.Disposable;

/* renamed from: io.reactivex.t */
public interface AbstractC69012t<T> {
    void onError(Throwable th);

    void onSubscribe(Disposable disposable);

    void onSuccess(T t);
}
