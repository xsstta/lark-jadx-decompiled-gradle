package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

public final class cm<T> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final long f172426b;

    /* renamed from: io.reactivex.internal.operators.observable.cm$a */
    static final class C68758a<T> extends AtomicInteger implements AbstractC69009q<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final AbstractC69009q<? super T> downstream;
        long remaining;
        final SequentialDisposable sd;
        final ObservableSource<? extends T> source;

        /* access modifiers changed from: package-private */
        public void subscribeNext() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.sd.isDisposed()) {
                    this.source.subscribe(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            long j = this.remaining;
            if (j != Long.MAX_VALUE) {
                this.remaining = j - 1;
            }
            if (j != 0) {
                subscribeNext();
            } else {
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            this.sd.replace(disposable);
        }

        C68758a(AbstractC69009q<? super T> qVar, long j, SequentialDisposable sequentialDisposable, ObservableSource<? extends T> observableSource) {
            this.downstream = qVar;
            this.sd = sequentialDisposable;
            this.source = observableSource;
            this.remaining = j;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        qVar.onSubscribe(sequentialDisposable);
        long j = this.f172426b;
        long j2 = Long.MAX_VALUE;
        if (j != Long.MAX_VALUE) {
            j2 = j - 1;
        }
        new C68758a(qVar, j2, sequentialDisposable, this.f172123a).subscribeNext();
    }

    public cm(Observable<T> observable, long j) {
        super(observable);
        this.f172426b = j;
    }
}
