package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC69011s;
import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69013u;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.AbstractC68313e;
import io.reactivex.internal.disposables.CancellableDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.c.d */
public final class C68472d<T> extends Single<T> {

    /* renamed from: a */
    final AbstractC69013u<T> f171848a;

    /* renamed from: io.reactivex.internal.operators.c.d$a */
    static final class C68473a<T> extends AtomicReference<Disposable> implements Disposable, AbstractC69011s<T> {
        private static final long serialVersionUID = -2467358622224974244L;
        final AbstractC69012t<? super T> downstream;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable, io.reactivex.AbstractC69011s
        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        public String toString() {
            return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
        }

        public void setDisposable(Disposable disposable) {
            DisposableHelper.set(this, disposable);
        }

        C68473a(AbstractC69012t<? super T> tVar) {
            this.downstream = tVar;
        }

        @Override // io.reactivex.AbstractC69011s
        public void onError(Throwable th) {
            if (!tryOnError(th)) {
                RxJavaPlugins.onError(th);
            }
        }

        public void setCancellable(AbstractC68313e eVar) {
            setDisposable(new CancellableDisposable(eVar));
        }

        @Override // io.reactivex.AbstractC69011s
        public void onSuccess(T t) {
            Disposable disposable;
            if (get() != DisposableHelper.DISPOSED && (disposable = (Disposable) getAndSet(DisposableHelper.DISPOSED)) != DisposableHelper.DISPOSED) {
                if (t == null) {
                    try {
                        this.downstream.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                    } catch (Throwable th) {
                        if (disposable != null) {
                            disposable.dispose();
                        }
                        throw th;
                    }
                } else {
                    this.downstream.onSuccess(t);
                }
                if (disposable != null) {
                    disposable.dispose();
                }
            }
        }

        public boolean tryOnError(Throwable th) {
            Disposable disposable;
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (get() == DisposableHelper.DISPOSED || (disposable = (Disposable) getAndSet(DisposableHelper.DISPOSED)) == DisposableHelper.DISPOSED) {
                return false;
            }
            try {
                this.downstream.onError(th);
            } finally {
                if (disposable != null) {
                    disposable.dispose();
                }
            }
        }
    }

    public C68472d(AbstractC69013u<T> uVar) {
        this.f171848a = uVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super T> tVar) {
        C68473a aVar = new C68473a(tVar);
        tVar.onSubscribe(aVar);
        try {
            this.f171848a.subscribe(aVar);
        } catch (Throwable th) {
            C68306a.m265071b(th);
            aVar.onError(th);
        }
    }
}
