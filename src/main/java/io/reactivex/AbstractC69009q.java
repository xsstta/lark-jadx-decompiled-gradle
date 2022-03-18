package io.reactivex;

import io.reactivex.disposables.Disposable;

/* renamed from: io.reactivex.q */
public interface AbstractC69009q<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t);

    void onSubscribe(Disposable disposable);
}
