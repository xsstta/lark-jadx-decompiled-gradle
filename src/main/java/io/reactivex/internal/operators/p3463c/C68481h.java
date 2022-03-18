package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC69009q;
import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.C68391o;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.c.h */
public final class C68481h<T, U> extends Single<T> {

    /* renamed from: a */
    final AbstractC69015w<T> f171864a;

    /* renamed from: b */
    final ObservableSource<U> f171865b;

    /* renamed from: io.reactivex.internal.operators.c.h$a */
    static final class C68482a<T, U> extends AtomicReference<Disposable> implements Disposable, AbstractC69009q<U> {
        private static final long serialVersionUID = -8565274649390031272L;
        boolean done;
        final AbstractC69012t<? super T> downstream;
        final AbstractC69015w<T> source;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.source.subscribe(new C68391o(this, this.downstream));
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(U u) {
            ((Disposable) get()).dispose();
            onComplete();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.set(this, disposable)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.downstream.onError(th);
        }

        C68482a(AbstractC69012t<? super T> tVar, AbstractC69015w<T> wVar) {
            this.downstream = tVar;
            this.source = wVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super T> tVar) {
        this.f171865b.subscribe(new C68482a(tVar, this.f171864a));
    }

    public C68481h(AbstractC69015w<T> wVar, ObservableSource<U> observableSource) {
        this.f171864a = wVar;
        this.f171865b = observableSource;
    }
}
