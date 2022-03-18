package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;

public final class dl<T> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final int f172547b;

    /* renamed from: io.reactivex.internal.operators.observable.dl$a */
    static final class C68814a<T> extends ArrayDeque<T> implements Disposable, AbstractC69009q<T> {
        private static final long serialVersionUID = 7240042530241604978L;
        volatile boolean cancelled;
        final int count;
        final AbstractC69009q<? super T> downstream;
        Disposable upstream;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.dispose();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            AbstractC69009q<? super T> qVar = this.downstream;
            while (!this.cancelled) {
                Object obj = (Object) poll();
                if (obj != 0) {
                    qVar.onNext(obj);
                } else if (!this.cancelled) {
                    qVar.onComplete();
                    return;
                } else {
                    return;
                }
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (this.count == size()) {
                poll();
            }
            offer(t);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        C68814a(AbstractC69009q<? super T> qVar, int i) {
            this.downstream = qVar;
            this.count = i;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        this.f172123a.subscribe(new C68814a(qVar, this.f172547b));
    }

    public dl(ObservableSource<T> observableSource, int i) {
        super(observableSource);
        this.f172547b = i;
    }
}
