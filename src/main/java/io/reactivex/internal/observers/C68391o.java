package io.reactivex.internal.observers;

import io.reactivex.AbstractC69012t;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.observers.o */
public final class C68391o<T> implements AbstractC69012t<T> {

    /* renamed from: a */
    final AtomicReference<Disposable> f171712a;

    /* renamed from: b */
    final AbstractC69012t<? super T> f171713b;

    @Override // io.reactivex.AbstractC69012t
    public void onError(Throwable th) {
        this.f171713b.onError(th);
    }

    @Override // io.reactivex.AbstractC69012t
    public void onSubscribe(Disposable disposable) {
        DisposableHelper.replace(this.f171712a, disposable);
    }

    @Override // io.reactivex.AbstractC69012t
    public void onSuccess(T t) {
        this.f171713b.onSuccess(t);
    }

    public C68391o(AtomicReference<Disposable> atomicReference, AbstractC69012t<? super T> tVar) {
        this.f171712a = atomicReference;
        this.f171713b = tVar;
    }
}
