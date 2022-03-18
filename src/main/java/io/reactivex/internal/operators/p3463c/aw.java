package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.c.aw */
public final class aw<T, U> extends Single<T> {

    /* renamed from: a */
    final Callable<U> f171826a;

    /* renamed from: b */
    final Function<? super U, ? extends AbstractC69015w<? extends T>> f171827b;

    /* renamed from: c */
    final Consumer<? super U> f171828c;

    /* renamed from: d */
    final boolean f171829d;

    /* renamed from: io.reactivex.internal.operators.c.aw$a */
    static final class C68463a<T, U> extends AtomicReference<Object> implements Disposable, AbstractC69012t<T> {
        private static final long serialVersionUID = -5331524057054083935L;
        final Consumer<? super U> disposer;
        final AbstractC69012t<? super T> downstream;
        final boolean eager;
        Disposable upstream;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
            this.upstream = DisposableHelper.DISPOSED;
            disposeAfter();
        }

        /* access modifiers changed from: package-private */
        public void disposeAfter() {
            Object andSet = getAndSet(this);
            if (andSet != this) {
                try {
                    this.disposer.accept(andSet);
                } catch (Throwable th) {
                    C68306a.m265071b(th);
                    RxJavaPlugins.onError(th);
                }
            }
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69012t
        public void onError(Throwable th) {
            this.upstream = DisposableHelper.DISPOSED;
            if (this.eager) {
                Object andSet = getAndSet(this);
                if (andSet != this) {
                    try {
                        this.disposer.accept(andSet);
                    } catch (Throwable th2) {
                        C68306a.m265071b(th2);
                        th = new CompositeException(th, th2);
                    }
                } else {
                    return;
                }
            }
            this.downstream.onError(th);
            if (!this.eager) {
                disposeAfter();
            }
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSuccess(T t) {
            this.upstream = DisposableHelper.DISPOSED;
            if (this.eager) {
                Object andSet = getAndSet(this);
                if (andSet != this) {
                    try {
                        this.disposer.accept(andSet);
                    } catch (Throwable th) {
                        C68306a.m265071b(th);
                        this.downstream.onError(th);
                        return;
                    }
                } else {
                    return;
                }
            }
            this.downstream.onSuccess(t);
            if (!this.eager) {
                disposeAfter();
            }
        }

        C68463a(AbstractC69012t<? super T> tVar, U u, boolean z, Consumer<? super U> consumer) {
            super(u);
            this.downstream = tVar;
            this.eager = z;
            this.disposer = consumer;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super T> tVar) {
        try {
            U call = this.f171826a.call();
            try {
                ((AbstractC69015w) C68362b.m265229a(this.f171827b.apply(call), "The singleFunction returned a null SingleSource")).subscribe(new C68463a(tVar, call, this.f171829d, this.f171828c));
                return;
            } catch (Throwable th) {
                C68306a.m265071b(th);
                RxJavaPlugins.onError(th);
                return;
            }
            EmptyDisposable.error(th, tVar);
            if (!this.f171829d) {
                this.f171828c.accept(call);
            }
        } catch (Throwable th2) {
            C68306a.m265071b(th2);
            EmptyDisposable.error(th2, tVar);
        }
    }

    public aw(Callable<U> callable, Function<? super U, ? extends AbstractC69015w<? extends T>> function, Consumer<? super U> consumer, boolean z) {
        this.f171826a = callable;
        this.f171827b = function;
        this.f171828c = consumer;
        this.f171829d = z;
    }
}
