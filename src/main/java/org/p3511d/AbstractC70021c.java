package org.p3511d;

/* renamed from: org.d.c */
public interface AbstractC70021c<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t);

    void onSubscribe(AbstractC70022d dVar);
}
