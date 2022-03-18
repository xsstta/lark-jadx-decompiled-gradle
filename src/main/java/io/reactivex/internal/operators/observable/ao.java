package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.observers.C68383g;

public final class ao<T> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    private final Consumer<? super Disposable> f172206b;

    /* renamed from: c */
    private final AbstractC68309a f172207c;

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        this.f172123a.subscribe(new C68383g(qVar, this.f172206b, this.f172207c));
    }

    public ao(Observable<T> observable, Consumer<? super Disposable> consumer, AbstractC68309a aVar) {
        super(observable);
        this.f172206b = consumer;
        this.f172207c = aVar;
    }
}
