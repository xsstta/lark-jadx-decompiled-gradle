package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Emitter;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

public final class bh<T, S> extends Observable<T> {

    /* renamed from: a */
    final Callable<S> f172278a;

    /* renamed from: b */
    final BiFunction<S, Emitter<T>, S> f172279b;

    /* renamed from: c */
    final Consumer<? super S> f172280c;

    /* renamed from: io.reactivex.internal.operators.observable.bh$a */
    static final class C68703a<T, S> implements Emitter<T>, Disposable {

        /* renamed from: a */
        final AbstractC69009q<? super T> f172281a;

        /* renamed from: b */
        final BiFunction<S, ? super Emitter<T>, S> f172282b;

        /* renamed from: c */
        final Consumer<? super S> f172283c;

        /* renamed from: d */
        S f172284d;

        /* renamed from: e */
        volatile boolean f172285e;

        /* renamed from: f */
        boolean f172286f;

        /* renamed from: g */
        boolean f172287g;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172285e = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172285e;
        }

        @Override // io.reactivex.Emitter
        public void onComplete() {
            if (!this.f172286f) {
                this.f172286f = true;
                this.f172281a.onComplete();
            }
        }

        /* renamed from: a */
        public void mo238364a() {
            S s = this.f172284d;
            if (this.f172285e) {
                this.f172284d = null;
                m265369a(s);
                return;
            }
            BiFunction<S, ? super Emitter<T>, S> biFunction = this.f172282b;
            while (!this.f172285e) {
                this.f172287g = false;
                try {
                    s = biFunction.apply(s, this);
                    if (this.f172286f) {
                        this.f172285e = true;
                        this.f172284d = null;
                        m265369a(s);
                        return;
                    }
                } catch (Throwable th) {
                    C68306a.m265071b(th);
                    this.f172284d = null;
                    this.f172285e = true;
                    onError(th);
                    m265369a(s);
                    return;
                }
            }
            this.f172284d = null;
            m265369a(s);
        }

        /* renamed from: a */
        private void m265369a(S s) {
            try {
                this.f172283c.accept(s);
            } catch (Throwable th) {
                C68306a.m265071b(th);
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.Emitter
        public void onError(Throwable th) {
            if (this.f172286f) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.f172286f = true;
            this.f172281a.onError(th);
        }

        @Override // io.reactivex.Emitter
        public void onNext(T t) {
            if (this.f172286f) {
                return;
            }
            if (this.f172287g) {
                onError(new IllegalStateException("onNext already called in this generate turn"));
            } else if (t == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.f172287g = true;
                this.f172281a.onNext(t);
            }
        }

        C68703a(AbstractC69009q<? super T> qVar, BiFunction<S, ? super Emitter<T>, S> biFunction, Consumer<? super S> consumer, S s) {
            this.f172281a = qVar;
            this.f172282b = biFunction;
            this.f172283c = consumer;
            this.f172284d = s;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        try {
            C68703a aVar = new C68703a(qVar, this.f172279b, this.f172280c, this.f172278a.call());
            qVar.onSubscribe(aVar);
            aVar.mo238364a();
        } catch (Throwable th) {
            C68306a.m265071b(th);
            EmptyDisposable.error(th, qVar);
        }
    }

    public bh(Callable<S> callable, BiFunction<S, Emitter<T>, S> biFunction, Consumer<? super S> consumer) {
        this.f172278a = callable;
        this.f172279b = biFunction;
        this.f172280c = consumer;
    }
}
