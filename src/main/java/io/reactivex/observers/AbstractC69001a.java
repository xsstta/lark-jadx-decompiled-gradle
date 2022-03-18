package io.reactivex.observers;

import io.reactivex.AbstractC69009q;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.util.C68980e;

/* renamed from: io.reactivex.observers.a */
public abstract class AbstractC69001a<T> implements AbstractC69009q<T> {

    /* renamed from: a */
    private Disposable f173000a;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo238785b() {
    }

    @Override // io.reactivex.AbstractC69009q
    public final void onSubscribe(Disposable disposable) {
        if (C68980e.m265555a(this.f173000a, disposable, getClass())) {
            this.f173000a = disposable;
            mo238785b();
        }
    }
}
