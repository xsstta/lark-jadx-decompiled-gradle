package io.reactivex.observers;

import io.reactivex.AbstractC69009q;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* renamed from: io.reactivex.observers.c */
public final class C69003c<T> implements Disposable, AbstractC69009q<T> {

    /* renamed from: a */
    final AbstractC69009q<? super T> f173002a;

    /* renamed from: b */
    Disposable f173003b;

    /* renamed from: c */
    boolean f173004c;

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        this.f173003b.dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.f173003b.isDisposed();
    }

    @Override // io.reactivex.AbstractC69009q
    public void onComplete() {
        if (!this.f173004c) {
            this.f173004c = true;
            if (this.f173003b == null) {
                mo238788b();
                return;
            }
            try {
                this.f173002a.onComplete();
            } catch (Throwable th) {
                C68306a.m265071b(th);
                RxJavaPlugins.onError(th);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo238787a() {
        this.f173004c = true;
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f173002a.onSubscribe(EmptyDisposable.INSTANCE);
            try {
                this.f173002a.onError(nullPointerException);
            } catch (Throwable th) {
                C68306a.m265071b(th);
                RxJavaPlugins.onError(new CompositeException(nullPointerException, th));
            }
        } catch (Throwable th2) {
            C68306a.m265071b(th2);
            RxJavaPlugins.onError(new CompositeException(nullPointerException, th2));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo238788b() {
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f173002a.onSubscribe(EmptyDisposable.INSTANCE);
            try {
                this.f173002a.onError(nullPointerException);
            } catch (Throwable th) {
                C68306a.m265071b(th);
                RxJavaPlugins.onError(new CompositeException(nullPointerException, th));
            }
        } catch (Throwable th2) {
            C68306a.m265071b(th2);
            RxJavaPlugins.onError(new CompositeException(nullPointerException, th2));
        }
    }

    public C69003c(AbstractC69009q<? super T> qVar) {
        this.f173002a = qVar;
    }

    @Override // io.reactivex.AbstractC69009q
    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.f173003b, disposable)) {
            this.f173003b = disposable;
            try {
                this.f173002a.onSubscribe(this);
            } catch (Throwable th) {
                C68306a.m265071b(th);
                RxJavaPlugins.onError(new CompositeException(th, th));
            }
        }
    }

    @Override // io.reactivex.AbstractC69009q
    public void onError(Throwable th) {
        if (this.f173004c) {
            RxJavaPlugins.onError(th);
            return;
        }
        this.f173004c = true;
        if (this.f173003b == null) {
            NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
            try {
                this.f173002a.onSubscribe(EmptyDisposable.INSTANCE);
                try {
                    this.f173002a.onError(new CompositeException(th, nullPointerException));
                } catch (Throwable th2) {
                    C68306a.m265071b(th2);
                    RxJavaPlugins.onError(new CompositeException(th, nullPointerException, th2));
                }
            } catch (Throwable th3) {
                C68306a.m265071b(th3);
                RxJavaPlugins.onError(new CompositeException(th, nullPointerException, th3));
            }
        } else {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            try {
                this.f173002a.onError(th);
            } catch (Throwable th4) {
                C68306a.m265071b(th4);
                RxJavaPlugins.onError(new CompositeException(th, th4));
            }
        }
    }

    @Override // io.reactivex.AbstractC69009q
    public void onNext(T t) {
        if (!this.f173004c) {
            if (this.f173003b == null) {
                mo238787a();
            } else if (t == null) {
                NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
                try {
                    this.f173003b.dispose();
                    onError(nullPointerException);
                } catch (Throwable th) {
                    C68306a.m265071b(th);
                    onError(new CompositeException(nullPointerException, th));
                }
            } else {
                try {
                    this.f173002a.onNext(t);
                } catch (Throwable th2) {
                    C68306a.m265071b(th2);
                    onError(new CompositeException(th, th2));
                }
            }
        }
    }
}
