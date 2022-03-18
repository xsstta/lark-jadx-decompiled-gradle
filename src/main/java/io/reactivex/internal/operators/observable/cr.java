package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

public final class cr<T> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final AbstractC68322n<? super Throwable> f172447b;

    /* renamed from: c */
    final long f172448c;

    /* renamed from: io.reactivex.internal.operators.observable.cr$a */
    static final class C68779a<T> extends AtomicInteger implements AbstractC69009q<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final AbstractC69009q<? super T> downstream;
        final AbstractC68322n<? super Throwable> predicate;
        long remaining;
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
            long j = this.remaining;
            if (j != Long.MAX_VALUE) {
                this.remaining = j - 1;
            }
            if (j == 0) {
                this.downstream.onError(th);
                return;
            }
            try {
                if (!this.predicate.test(th)) {
                    this.downstream.onError(th);
                } else {
                    subscribeNext();
                }
            } catch (Throwable th2) {
                C68306a.m265071b(th2);
                this.downstream.onError(new CompositeException(th, th2));
            }
        }

        C68779a(AbstractC69009q<? super T> qVar, long j, AbstractC68322n<? super Throwable> nVar, SequentialDisposable sequentialDisposable, ObservableSource<? extends T> observableSource) {
            this.downstream = qVar;
            this.upstream = sequentialDisposable;
            this.source = observableSource;
            this.predicate = nVar;
            this.remaining = j;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        qVar.onSubscribe(sequentialDisposable);
        new C68779a(qVar, this.f172448c, this.f172447b, sequentialDisposable, this.f172123a).subscribeNext();
    }

    public cr(Observable<T> observable, long j, AbstractC68322n<? super Throwable> nVar) {
        super(observable);
        this.f172447b = nVar;
        this.f172448c = j;
    }
}
