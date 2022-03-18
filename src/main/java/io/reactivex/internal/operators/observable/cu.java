package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.C69004d;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class cu<T> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final ObservableSource<?> f172454b;

    /* renamed from: c */
    final boolean f172455c;

    /* renamed from: io.reactivex.internal.operators.observable.cu$b */
    static final class C68786b<T> extends AbstractC68787c<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.observable.cu.AbstractC68787c
        public void run() {
            emit();
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.observable.cu.AbstractC68787c
        public void completeMain() {
            this.downstream.onComplete();
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.observable.cu.AbstractC68787c
        public void completeOther() {
            this.downstream.onComplete();
        }

        C68786b(AbstractC69009q<? super T> qVar, ObservableSource<?> observableSource) {
            super(qVar, observableSource);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.cu$d */
    static final class C68788d<T> implements AbstractC69009q<Object> {

        /* renamed from: a */
        final AbstractC68787c<T> f172456a;

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.f172456a.complete();
        }

        C68788d(AbstractC68787c<T> cVar) {
            this.f172456a = cVar;
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.f172456a.error(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(Object obj) {
            this.f172456a.run();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            this.f172456a.setOther(disposable);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.cu$c */
    static abstract class AbstractC68787c<T> extends AtomicReference<T> implements Disposable, AbstractC69009q<T> {
        private static final long serialVersionUID = -3517602651313910099L;
        final AbstractC69009q<? super T> downstream;
        final AtomicReference<Disposable> other = new AtomicReference<>();
        final ObservableSource<?> sampler;
        Disposable upstream;

        /* access modifiers changed from: package-private */
        public abstract void completeMain();

        /* access modifiers changed from: package-private */
        public abstract void completeOther();

        /* access modifiers changed from: package-private */
        public abstract void run();

        public void complete() {
            this.upstream.dispose();
            completeOther();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this.other);
            this.upstream.dispose();
        }

        /* access modifiers changed from: package-private */
        public void emit() {
            Object andSet = getAndSet(null);
            if (andSet != null) {
                this.downstream.onNext(andSet);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.other.get() == DisposableHelper.DISPOSED) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            DisposableHelper.dispose(this.other);
            completeMain();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            lazySet(t);
        }

        /* access modifiers changed from: package-private */
        public boolean setOther(Disposable disposable) {
            return DisposableHelper.setOnce(this.other, disposable);
        }

        public void error(Throwable th) {
            this.upstream.dispose();
            this.downstream.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            DisposableHelper.dispose(this.other);
            this.downstream.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
                if (this.other.get() == null) {
                    this.sampler.subscribe(new C68788d(this));
                }
            }
        }

        AbstractC68787c(AbstractC69009q<? super T> qVar, ObservableSource<?> observableSource) {
            this.downstream = qVar;
            this.sampler = observableSource;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.cu$a */
    static final class C68785a<T> extends AbstractC68787c<T> {
        private static final long serialVersionUID = -3029755663834015785L;
        volatile boolean done;
        final AtomicInteger wip = new AtomicInteger();

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.observable.cu.AbstractC68787c
        public void completeMain() {
            this.done = true;
            if (this.wip.getAndIncrement() == 0) {
                emit();
                this.downstream.onComplete();
            }
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.observable.cu.AbstractC68787c
        public void completeOther() {
            this.done = true;
            if (this.wip.getAndIncrement() == 0) {
                emit();
                this.downstream.onComplete();
            }
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.observable.cu.AbstractC68787c
        public void run() {
            if (this.wip.getAndIncrement() == 0) {
                do {
                    boolean z = this.done;
                    emit();
                    if (z) {
                        this.downstream.onComplete();
                        return;
                    }
                } while (this.wip.decrementAndGet() != 0);
            }
        }

        C68785a(AbstractC69009q<? super T> qVar, ObservableSource<?> observableSource) {
            super(qVar, observableSource);
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        C69004d dVar = new C69004d(qVar);
        if (this.f172455c) {
            this.f172123a.subscribe(new C68785a(dVar, this.f172454b));
        } else {
            this.f172123a.subscribe(new C68786b(dVar, this.f172454b));
        }
    }

    public cu(ObservableSource<T> observableSource, ObservableSource<?> observableSource2, boolean z) {
        super(observableSource);
        this.f172454b = observableSource2;
        this.f172455c = z;
    }
}
