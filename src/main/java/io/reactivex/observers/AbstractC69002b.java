package io.reactivex.observers;

import io.reactivex.AbstractC69009q;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.C68980e;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.observers.b */
public abstract class AbstractC69002b<T> implements Disposable, AbstractC69009q<T> {

    /* renamed from: f */
    final AtomicReference<Disposable> f173001f = new AtomicReference<>();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo238786c() {
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this.f173001f);
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        if (this.f173001f.get() == DisposableHelper.DISPOSED) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.AbstractC69009q
    public final void onSubscribe(Disposable disposable) {
        if (C68980e.m265556a(this.f173001f, disposable, getClass())) {
            mo238786c();
        }
    }
}
