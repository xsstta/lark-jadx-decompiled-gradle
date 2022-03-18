package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* renamed from: io.reactivex.internal.operators.c.s */
public final class C68503s<T> extends Single<T> {

    /* renamed from: a */
    final AbstractC69015w<T> f171900a;

    /* renamed from: b */
    final Consumer<? super Disposable> f171901b;

    /* renamed from: io.reactivex.internal.operators.c.s$a */
    static final class C68504a<T> implements AbstractC69012t<T> {

        /* renamed from: a */
        final AbstractC69012t<? super T> f171902a;

        /* renamed from: b */
        final Consumer<? super Disposable> f171903b;

        /* renamed from: c */
        boolean f171904c;

        @Override // io.reactivex.AbstractC69012t
        public void onError(Throwable th) {
            if (this.f171904c) {
                RxJavaPlugins.onError(th);
            } else {
                this.f171902a.onError(th);
            }
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSuccess(T t) {
            if (!this.f171904c) {
                this.f171902a.onSuccess(t);
            }
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSubscribe(Disposable disposable) {
            try {
                this.f171903b.accept(disposable);
                this.f171902a.onSubscribe(disposable);
            } catch (Throwable th) {
                C68306a.m265071b(th);
                this.f171904c = true;
                disposable.dispose();
                EmptyDisposable.error(th, this.f171902a);
            }
        }

        C68504a(AbstractC69012t<? super T> tVar, Consumer<? super Disposable> consumer) {
            this.f171902a = tVar;
            this.f171903b = consumer;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super T> tVar) {
        this.f171900a.subscribe(new C68504a(tVar, this.f171901b));
    }

    public C68503s(AbstractC69015w<T> wVar, Consumer<? super Disposable> consumer) {
        this.f171900a = wVar;
        this.f171901b = consumer;
    }
}
