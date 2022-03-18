package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.observers.C69004d;
import java.util.concurrent.atomic.AtomicReference;

public final class eg<T, U, R> extends AbstractC68651a<T, R> {

    /* renamed from: b */
    final BiFunction<? super T, ? super U, ? extends R> f172692b;

    /* renamed from: c */
    final ObservableSource<? extends U> f172693c;

    /* renamed from: io.reactivex.internal.operators.observable.eg$a */
    static final class C68860a<T, U, R> extends AtomicReference<U> implements Disposable, AbstractC69009q<T> {
        private static final long serialVersionUID = -312246233408980075L;
        final BiFunction<? super T, ? super U, ? extends R> combiner;
        final AbstractC69009q<? super R> downstream;
        final AtomicReference<Disposable> other = new AtomicReference<>();
        final AtomicReference<Disposable> upstream = new AtomicReference<>();

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this.upstream);
            DisposableHelper.dispose(this.other);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.upstream.get());
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            DisposableHelper.dispose(this.other);
            this.downstream.onComplete();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.upstream, disposable);
        }

        public boolean setOther(Disposable disposable) {
            return DisposableHelper.setOnce(this.other, disposable);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            DisposableHelper.dispose(this.other);
            this.downstream.onError(th);
        }

        public void otherError(Throwable th) {
            DisposableHelper.dispose(this.upstream);
            this.downstream.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            Object obj = get();
            if (obj != null) {
                try {
                    this.downstream.onNext(C68362b.m265229a(this.combiner.apply(t, obj), "The combiner returned a null value"));
                } catch (Throwable th) {
                    C68306a.m265071b(th);
                    dispose();
                    this.downstream.onError(th);
                }
            }
        }

        C68860a(AbstractC69009q<? super R> qVar, BiFunction<? super T, ? super U, ? extends R> biFunction) {
            this.downstream = qVar;
            this.combiner = biFunction;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.eg$b */
    final class C68861b implements AbstractC69009q<U> {

        /* renamed from: b */
        private final C68860a<T, U, R> f172695b;

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.f172695b.otherError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(U u) {
            this.f172695b.lazySet(u);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            this.f172695b.setOther(disposable);
        }

        C68861b(C68860a<T, U, R> aVar) {
            this.f172695b = aVar;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super R> qVar) {
        C69004d dVar = new C69004d(qVar);
        C68860a aVar = new C68860a(dVar, this.f172692b);
        dVar.onSubscribe(aVar);
        this.f172693c.subscribe(new C68861b(aVar));
        this.f172123a.subscribe(aVar);
    }

    public eg(ObservableSource<T> observableSource, BiFunction<? super T, ? super U, ? extends R> biFunction, ObservableSource<? extends U> observableSource2) {
        super(observableSource);
        this.f172692b = biFunction;
        this.f172693c = observableSource2;
    }
}
