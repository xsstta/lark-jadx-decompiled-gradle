package io.reactivex.internal.operators.p3462b;

import io.reactivex.AbstractC68273c;
import io.reactivex.AbstractC68989k;
import io.reactivex.AbstractC69012t;
import io.reactivex.C68991m;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.operators.b.a */
public final class C68408a<T> implements AbstractC68273c, Disposable, AbstractC68989k<T>, AbstractC69012t<T> {

    /* renamed from: a */
    final AbstractC69012t<? super C68991m<T>> f171737a;

    /* renamed from: b */
    Disposable f171738b;

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        this.f171738b.dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.f171738b.isDisposed();
    }

    @Override // io.reactivex.AbstractC68989k, io.reactivex.AbstractC68273c
    public void onComplete() {
        this.f171737a.onSuccess(C68991m.m265593f());
    }

    public C68408a(AbstractC69012t<? super C68991m<T>> tVar) {
        this.f171737a = tVar;
    }

    @Override // io.reactivex.AbstractC68989k, io.reactivex.AbstractC69012t, io.reactivex.AbstractC68273c
    public void onError(Throwable th) {
        this.f171737a.onSuccess(C68991m.m265592a(th));
    }

    @Override // io.reactivex.AbstractC68989k, io.reactivex.AbstractC69012t, io.reactivex.AbstractC68273c
    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.f171738b, disposable)) {
            this.f171738b = disposable;
            this.f171737a.onSubscribe(this);
        }
    }

    @Override // io.reactivex.AbstractC68989k, io.reactivex.AbstractC69012t
    public void onSuccess(T t) {
        this.f171737a.onSuccess(C68991m.m265591a((Object) t));
    }
}
