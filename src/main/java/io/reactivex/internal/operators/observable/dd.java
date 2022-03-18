package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;

public final class dd<T> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final int f172509b;

    /* renamed from: io.reactivex.internal.operators.observable.dd$a */
    static final class C68802a<T> extends ArrayDeque<T> implements Disposable, AbstractC69009q<T> {
        private static final long serialVersionUID = -3807491841935125653L;
        final AbstractC69009q<? super T> downstream;
        final int skip;
        Disposable upstream;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (this.skip == size()) {
                this.downstream.onNext((Object) poll());
            }
            offer(t);
        }

        C68802a(AbstractC69009q<? super T> qVar, int i) {
            super(i);
            this.downstream = qVar;
            this.skip = i;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        this.f172123a.subscribe(new C68802a(qVar, this.f172509b));
    }

    public dd(ObservableSource<T> observableSource, int i) {
        super(observableSource);
        this.f172509b = i;
    }
}
