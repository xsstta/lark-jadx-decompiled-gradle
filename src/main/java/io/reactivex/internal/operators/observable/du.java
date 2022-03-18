package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.operators.observable.dv;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class du<T, U, V> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final ObservableSource<U> f172582b;

    /* renamed from: c */
    final Function<? super T, ? extends ObservableSource<V>> f172583c;

    /* renamed from: d */
    final ObservableSource<? extends T> f172584d;

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.du$d */
    public interface AbstractC68828d extends dv.AbstractC68832d {
        void onTimeoutError(long j, Throwable th);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.du$a */
    public static final class C68825a extends AtomicReference<Disposable> implements Disposable, AbstractC69009q<Object> {
        private static final long serialVersionUID = 8708641127342403073L;
        final long idx;
        final AbstractC68828d parent;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: io.reactivex.internal.operators.observable.du$a */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (get() != DisposableHelper.DISPOSED) {
                lazySet(DisposableHelper.DISPOSED);
                this.parent.onTimeout(this.idx);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: io.reactivex.internal.operators.observable.du$a */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (get() != DisposableHelper.DISPOSED) {
                lazySet(DisposableHelper.DISPOSED);
                this.parent.onTimeoutError(this.idx, th);
                return;
            }
            RxJavaPlugins.onError(th);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: io.reactivex.internal.operators.observable.du$a */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.AbstractC69009q
        public void onNext(Object obj) {
            Disposable disposable = (Disposable) get();
            if (disposable != DisposableHelper.DISPOSED) {
                disposable.dispose();
                lazySet(DisposableHelper.DISPOSED);
                this.parent.onTimeout(this.idx);
            }
        }

        C68825a(long j, AbstractC68828d dVar) {
            this.idx = j;
            this.parent = dVar;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.du$b */
    static final class C68826b<T> extends AtomicReference<Disposable> implements Disposable, AbstractC68828d, AbstractC69009q<T> {
        private static final long serialVersionUID = -7508389464265974549L;
        final AbstractC69009q<? super T> downstream;
        ObservableSource<? extends T> fallback;
        final AtomicLong index;
        final Function<? super T, ? extends ObservableSource<?>> itemTimeoutIndicator;
        final SequentialDisposable task = new SequentialDisposable();
        final AtomicReference<Disposable> upstream;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this.upstream);
            DisposableHelper.dispose(this);
            this.task.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.task.dispose();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.upstream, disposable);
        }

        /* access modifiers changed from: package-private */
        public void startFirstTimeout(ObservableSource<?> observableSource) {
            if (observableSource != null) {
                C68825a aVar = new C68825a(0, this);
                if (this.task.replace(aVar)) {
                    observableSource.subscribe(aVar);
                }
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onError(th);
                this.task.dispose();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.internal.operators.observable.dv.AbstractC68832d
        public void onTimeout(long j) {
            if (this.index.compareAndSet(j, Long.MAX_VALUE)) {
                DisposableHelper.dispose(this.upstream);
                ObservableSource<? extends T> observableSource = this.fallback;
                this.fallback = null;
                observableSource.subscribe(new dv.C68829a(this.downstream, this));
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            long j = this.index.get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (this.index.compareAndSet(j, j2)) {
                    Disposable disposable = (Disposable) this.task.get();
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    this.downstream.onNext(t);
                    try {
                        ObservableSource observableSource = (ObservableSource) C68362b.m265229a(this.itemTimeoutIndicator.apply(t), "The itemTimeoutIndicator returned a null ObservableSource.");
                        C68825a aVar = new C68825a(j2, this);
                        if (this.task.replace(aVar)) {
                            observableSource.subscribe(aVar);
                        }
                    } catch (Throwable th) {
                        C68306a.m265071b(th);
                        this.upstream.get().dispose();
                        this.index.getAndSet(Long.MAX_VALUE);
                        this.downstream.onError(th);
                    }
                }
            }
        }

        @Override // io.reactivex.internal.operators.observable.du.AbstractC68828d
        public void onTimeoutError(long j, Throwable th) {
            if (this.index.compareAndSet(j, Long.MAX_VALUE)) {
                DisposableHelper.dispose(this);
                this.downstream.onError(th);
                return;
            }
            RxJavaPlugins.onError(th);
        }

        C68826b(AbstractC69009q<? super T> qVar, Function<? super T, ? extends ObservableSource<?>> function, ObservableSource<? extends T> observableSource) {
            this.downstream = qVar;
            this.itemTimeoutIndicator = function;
            this.fallback = observableSource;
            this.index = new AtomicLong();
            this.upstream = new AtomicReference<>();
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.du$c */
    static final class C68827c<T> extends AtomicLong implements Disposable, AbstractC68828d, AbstractC69009q<T> {
        private static final long serialVersionUID = 3764492702657003550L;
        final AbstractC69009q<? super T> downstream;
        final Function<? super T, ? extends ObservableSource<?>> itemTimeoutIndicator;
        final SequentialDisposable task = new SequentialDisposable();
        final AtomicReference<Disposable> upstream = new AtomicReference<>();

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this.upstream);
            this.task.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.upstream.get());
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.upstream, disposable);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onError(th);
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.internal.operators.observable.dv.AbstractC68832d
        public void onTimeout(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                DisposableHelper.dispose(this.upstream);
                this.downstream.onError(new TimeoutException());
            }
        }

        /* access modifiers changed from: package-private */
        public void startFirstTimeout(ObservableSource<?> observableSource) {
            if (observableSource != null) {
                C68825a aVar = new C68825a(0, this);
                if (this.task.replace(aVar)) {
                    observableSource.subscribe(aVar);
                }
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    Disposable disposable = (Disposable) this.task.get();
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    this.downstream.onNext(t);
                    try {
                        ObservableSource observableSource = (ObservableSource) C68362b.m265229a(this.itemTimeoutIndicator.apply(t), "The itemTimeoutIndicator returned a null ObservableSource.");
                        C68825a aVar = new C68825a(j2, this);
                        if (this.task.replace(aVar)) {
                            observableSource.subscribe(aVar);
                        }
                    } catch (Throwable th) {
                        C68306a.m265071b(th);
                        this.upstream.get().dispose();
                        getAndSet(Long.MAX_VALUE);
                        this.downstream.onError(th);
                    }
                }
            }
        }

        C68827c(AbstractC69009q<? super T> qVar, Function<? super T, ? extends ObservableSource<?>> function) {
            this.downstream = qVar;
            this.itemTimeoutIndicator = function;
        }

        @Override // io.reactivex.internal.operators.observable.du.AbstractC68828d
        public void onTimeoutError(long j, Throwable th) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                DisposableHelper.dispose(this.upstream);
                this.downstream.onError(th);
                return;
            }
            RxJavaPlugins.onError(th);
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        if (this.f172584d == null) {
            C68827c cVar = new C68827c(qVar, this.f172583c);
            qVar.onSubscribe(cVar);
            cVar.startFirstTimeout(this.f172582b);
            this.f172123a.subscribe(cVar);
            return;
        }
        C68826b bVar = new C68826b(qVar, this.f172583c, this.f172584d);
        qVar.onSubscribe(bVar);
        bVar.startFirstTimeout(this.f172582b);
        this.f172123a.subscribe(bVar);
    }

    public du(Observable<T> observable, ObservableSource<U> observableSource, Function<? super T, ? extends ObservableSource<V>> function, ObservableSource<? extends T> observableSource2) {
        super(observable);
        this.f172582b = observableSource;
        this.f172583c = function;
        this.f172584d = observableSource2;
    }
}
