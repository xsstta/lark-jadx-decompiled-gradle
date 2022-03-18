package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.C68391o;
import io.reactivex.internal.p3459a.C68362b;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.c.ao */
public final class ao<T> extends Single<T> {

    /* renamed from: a */
    final AbstractC69015w<? extends T> f171808a;

    /* renamed from: b */
    final Function<? super Throwable, ? extends AbstractC69015w<? extends T>> f171809b;

    /* renamed from: io.reactivex.internal.operators.c.ao$a */
    static final class C68452a<T> extends AtomicReference<Disposable> implements Disposable, AbstractC69012t<T> {
        private static final long serialVersionUID = -5314538511045349925L;
        final AbstractC69012t<? super T> downstream;
        final Function<? super Throwable, ? extends AbstractC69015w<? extends T>> nextFunction;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69012t
        public void onError(Throwable th) {
            try {
                ((AbstractC69015w) C68362b.m265229a(this.nextFunction.apply(th), "The nextFunction returned a null SingleSource.")).subscribe(new C68391o(this, this.downstream));
            } catch (Throwable th2) {
                C68306a.m265071b(th2);
                this.downstream.onError(new CompositeException(th, th2));
            }
        }

        C68452a(AbstractC69012t<? super T> tVar, Function<? super Throwable, ? extends AbstractC69015w<? extends T>> function) {
            this.downstream = tVar;
            this.nextFunction = function;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super T> tVar) {
        this.f171808a.subscribe(new C68452a(tVar, this.f171809b));
    }

    public ao(AbstractC69015w<? extends T> wVar, Function<? super Throwable, ? extends AbstractC69015w<? extends T>> function) {
        this.f171808a = wVar;
        this.f171809b = function;
    }
}
