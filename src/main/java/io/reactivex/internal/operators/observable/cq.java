package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.AbstractC68311c;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

public final class cq<T> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final AbstractC68311c<? super Integer, ? super Throwable> f172446b;

    /* renamed from: io.reactivex.internal.operators.observable.cq$a */
    static final class C68778a<T> extends AtomicInteger implements AbstractC69009q<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final AbstractC69009q<? super T> downstream;
        final AbstractC68311c<? super Integer, ? super Throwable> predicate;
        int retries;
        final ObservableSource<? extends T> source;
        final SequentialDisposable upstream;

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.downstream.onComplete();
        }

        /* access modifiers changed from: package-private */
        public void subscribeNext() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.upstream.isDisposed()) {
                    this.source.subscribe(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            this.upstream.replace(disposable);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            try {
                AbstractC68311c<? super Integer, ? super Throwable> cVar = this.predicate;
                int i = this.retries + 1;
                this.retries = i;
                if (!cVar.mo238039a(Integer.valueOf(i), th)) {
                    this.downstream.onError(th);
                } else {
                    subscribeNext();
                }
            } catch (Throwable th2) {
                C68306a.m265071b(th2);
                this.downstream.onError(new CompositeException(th, th2));
            }
        }

        C68778a(AbstractC69009q<? super T> qVar, AbstractC68311c<? super Integer, ? super Throwable> cVar, SequentialDisposable sequentialDisposable, ObservableSource<? extends T> observableSource) {
            this.downstream = qVar;
            this.upstream = sequentialDisposable;
            this.source = observableSource;
            this.predicate = cVar;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        qVar.onSubscribe(sequentialDisposable);
        new C68778a(qVar, this.f172446b, sequentialDisposable, this.f172123a).subscribeNext();
    }

    public cq(Observable<T> observable, AbstractC68311c<? super Integer, ? super Throwable> cVar) {
        super(observable);
        this.f172446b = cVar;
    }
}
