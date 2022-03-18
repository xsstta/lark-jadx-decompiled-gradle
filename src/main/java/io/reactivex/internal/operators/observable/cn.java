package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.AbstractC68312d;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

public final class cn<T> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final AbstractC68312d f172427b;

    /* renamed from: io.reactivex.internal.operators.observable.cn$a */
    static final class C68759a<T> extends AtomicInteger implements AbstractC69009q<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final AbstractC69009q<? super T> downstream;
        final ObservableSource<? extends T> source;
        final AbstractC68312d stop;
        final SequentialDisposable upstream;

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            try {
                if (this.stop.mo238040a()) {
                    this.downstream.onComplete();
                } else {
                    subscribeNext();
                }
            } catch (Throwable th) {
                C68306a.m265071b(th);
                this.downstream.onError(th);
            }
        }

        /* access modifiers changed from: package-private */
        public void subscribeNext() {
            if (getAndIncrement() == 0) {
                int i = 1;
                do {
                    this.source.subscribe(this);
                    i = addAndGet(-i);
                } while (i != 0);
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
            this.upstream.replace(disposable);
        }

        C68759a(AbstractC69009q<? super T> qVar, AbstractC68312d dVar, SequentialDisposable sequentialDisposable, ObservableSource<? extends T> observableSource) {
            this.downstream = qVar;
            this.upstream = sequentialDisposable;
            this.source = observableSource;
            this.stop = dVar;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        qVar.onSubscribe(sequentialDisposable);
        new C68759a(qVar, this.f172427b, sequentialDisposable, this.f172123a).subscribeNext();
    }

    public cn(Observable<T> observable, AbstractC68312d dVar) {
        super(observable);
        this.f172427b = dVar;
    }
}
