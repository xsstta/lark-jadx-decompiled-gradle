package io.reactivex.internal.util;

import io.reactivex.AbstractC68273c;
import io.reactivex.AbstractC68325i;
import io.reactivex.AbstractC68989k;
import io.reactivex.AbstractC69009q;
import io.reactivex.AbstractC69012t;
import io.reactivex.disposables.Disposable;
import io.reactivex.plugins.RxJavaPlugins;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

public enum EmptyComponent implements AbstractC68273c, Disposable, AbstractC68325i<Object>, AbstractC68989k<Object>, AbstractC69009q<Object>, AbstractC69012t<Object>, AbstractC70022d {
    INSTANCE;

    @Override // org.p3511d.AbstractC70022d
    public void cancel() {
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return true;
    }

    @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68989k, io.reactivex.AbstractC68273c, io.reactivex.AbstractC69009q
    public void onComplete() {
    }

    @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC69009q
    public void onNext(Object obj) {
    }

    @Override // io.reactivex.AbstractC68989k, io.reactivex.AbstractC69012t
    public void onSuccess(Object obj) {
    }

    @Override // org.p3511d.AbstractC70022d
    public void request(long j) {
    }

    public static <T> AbstractC69009q<T> asObserver() {
        return INSTANCE;
    }

    public static <T> AbstractC70021c<T> asSubscriber() {
        return INSTANCE;
    }

    @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68989k, io.reactivex.AbstractC69012t, io.reactivex.AbstractC68273c, io.reactivex.AbstractC69009q
    public void onError(Throwable th) {
        RxJavaPlugins.onError(th);
    }

    @Override // io.reactivex.AbstractC68989k, io.reactivex.AbstractC69012t, io.reactivex.AbstractC68273c, io.reactivex.AbstractC69009q
    public void onSubscribe(Disposable disposable) {
        disposable.dispose();
    }

    @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
    public void onSubscribe(AbstractC70022d dVar) {
        dVar.cancel();
    }
}
