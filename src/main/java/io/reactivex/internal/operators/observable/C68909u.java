package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.p3460b.AbstractC68368e;
import io.reactivex.internal.p3460b.AbstractC68373j;
import io.reactivex.internal.queue.C68926b;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.observers.C69004d;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.observable.u */
public final class C68909u<T, U> extends AbstractC68651a<T, U> {

    /* renamed from: b */
    final Function<? super T, ? extends ObservableSource<? extends U>> f172843b;

    /* renamed from: c */
    final int f172844c;

    /* renamed from: d */
    final ErrorMode f172845d;

    /* renamed from: io.reactivex.internal.operators.observable.u$a */
    static final class C68910a<T, R> extends AtomicInteger implements Disposable, AbstractC69009q<T> {
        private static final long serialVersionUID = -6951100001833242599L;
        volatile boolean active;
        final int bufferSize;
        volatile boolean cancelled;
        volatile boolean done;
        final AbstractC69009q<? super R> downstream;
        final AtomicThrowable error = new AtomicThrowable();
        final Function<? super T, ? extends ObservableSource<? extends R>> mapper;
        final C68911a<R> observer;
        AbstractC68373j<T> queue;
        int sourceMode;
        final boolean tillTheEnd;
        Disposable upstream;

        /* access modifiers changed from: package-private */
        /* renamed from: io.reactivex.internal.operators.observable.u$a$a */
        public static final class C68911a<R> extends AtomicReference<Disposable> implements AbstractC69009q<R> {
            private static final long serialVersionUID = 2620149119579502636L;
            final AbstractC69009q<? super R> downstream;
            final C68910a<?, R> parent;

            /* access modifiers changed from: package-private */
            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.AbstractC69009q
            public void onComplete() {
                C68910a<?, R> aVar = this.parent;
                aVar.active = false;
                aVar.drain();
            }

            @Override // io.reactivex.AbstractC69009q
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this, disposable);
            }

            @Override // io.reactivex.AbstractC69009q
            public void onNext(R r) {
                this.downstream.onNext(r);
            }

            @Override // io.reactivex.AbstractC69009q
            public void onError(Throwable th) {
                C68910a<?, R> aVar = this.parent;
                if (aVar.error.addThrowable(th)) {
                    if (!aVar.tillTheEnd) {
                        aVar.upstream.dispose();
                    }
                    aVar.active = false;
                    aVar.drain();
                    return;
                }
                RxJavaPlugins.onError(th);
            }

            C68911a(AbstractC69009q<? super R> qVar, C68910a<?, R> aVar) {
                this.downstream = qVar;
                this.parent = aVar;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            this.observer.dispose();
        }

        /* access modifiers changed from: package-private */
        public void drain() {
            boolean z;
            if (getAndIncrement() == 0) {
                AbstractC69009q<? super R> qVar = this.downstream;
                AbstractC68373j<T> jVar = this.queue;
                AtomicThrowable atomicThrowable = this.error;
                while (true) {
                    if (!this.active) {
                        if (this.cancelled) {
                            jVar.clear();
                            return;
                        } else if (this.tillTheEnd || ((Throwable) atomicThrowable.get()) == null) {
                            boolean z2 = this.done;
                            try {
                                T poll = jVar.poll();
                                if (poll == null) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z2 && z) {
                                    this.cancelled = true;
                                    Throwable terminate = atomicThrowable.terminate();
                                    if (terminate != null) {
                                        qVar.onError(terminate);
                                        return;
                                    } else {
                                        qVar.onComplete();
                                        return;
                                    }
                                } else if (!z) {
                                    try {
                                        ObservableSource observableSource = (ObservableSource) C68362b.m265229a(this.mapper.apply(poll), "The mapper returned a null ObservableSource");
                                        if (observableSource instanceof Callable) {
                                            try {
                                                Object obj = (Object) ((Callable) observableSource).call();
                                                if (obj != 0 && !this.cancelled) {
                                                    qVar.onNext(obj);
                                                }
                                            } catch (Throwable th) {
                                                C68306a.m265071b(th);
                                                atomicThrowable.addThrowable(th);
                                            }
                                        } else {
                                            this.active = true;
                                            observableSource.subscribe(this.observer);
                                        }
                                    } catch (Throwable th2) {
                                        C68306a.m265071b(th2);
                                        this.cancelled = true;
                                        this.upstream.dispose();
                                        jVar.clear();
                                        atomicThrowable.addThrowable(th2);
                                        qVar.onError(atomicThrowable.terminate());
                                        return;
                                    }
                                }
                            } catch (Throwable th3) {
                                C68306a.m265071b(th3);
                                this.cancelled = true;
                                this.upstream.dispose();
                                atomicThrowable.addThrowable(th3);
                                qVar.onError(atomicThrowable.terminate());
                                return;
                            }
                        } else {
                            jVar.clear();
                            this.cancelled = true;
                            qVar.onError(atomicThrowable.terminate());
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (this.sourceMode == 0) {
                this.queue.offer(t);
            }
            drain();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (this.error.addThrowable(th)) {
                this.done = true;
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                if (disposable instanceof AbstractC68368e) {
                    AbstractC68368e eVar = (AbstractC68368e) disposable;
                    int requestFusion = eVar.requestFusion(3);
                    if (requestFusion == 1) {
                        this.sourceMode = requestFusion;
                        this.queue = eVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        drain();
                        return;
                    } else if (requestFusion == 2) {
                        this.sourceMode = requestFusion;
                        this.queue = eVar;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new C68926b(this.bufferSize);
                this.downstream.onSubscribe(this);
            }
        }

        C68910a(AbstractC69009q<? super R> qVar, Function<? super T, ? extends ObservableSource<? extends R>> function, int i, boolean z) {
            this.downstream = qVar;
            this.mapper = function;
            this.bufferSize = i;
            this.tillTheEnd = z;
            this.observer = new C68911a<>(qVar, this);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.u$b */
    static final class C68912b<T, U> extends AtomicInteger implements Disposable, AbstractC69009q<T> {
        private static final long serialVersionUID = 8828587559905699186L;
        volatile boolean active;
        final int bufferSize;
        volatile boolean disposed;
        volatile boolean done;
        final AbstractC69009q<? super U> downstream;
        int fusionMode;
        final C68913a<U> inner;
        final Function<? super T, ? extends ObservableSource<? extends U>> mapper;
        AbstractC68373j<T> queue;
        Disposable upstream;

        /* access modifiers changed from: package-private */
        /* renamed from: io.reactivex.internal.operators.observable.u$b$a */
        public static final class C68913a<U> extends AtomicReference<Disposable> implements AbstractC69009q<U> {
            private static final long serialVersionUID = -7449079488798789337L;
            final AbstractC69009q<? super U> downstream;
            final C68912b<?, ?> parent;

            /* access modifiers changed from: package-private */
            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.AbstractC69009q
            public void onComplete() {
                this.parent.innerComplete();
            }

            @Override // io.reactivex.AbstractC69009q
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this, disposable);
            }

            @Override // io.reactivex.AbstractC69009q
            public void onNext(U u) {
                this.downstream.onNext(u);
            }

            @Override // io.reactivex.AbstractC69009q
            public void onError(Throwable th) {
                this.parent.dispose();
                this.downstream.onError(th);
            }

            C68913a(AbstractC69009q<? super U> qVar, C68912b<?, ?> bVar) {
                this.downstream = qVar;
                this.parent = bVar;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.disposed;
        }

        /* access modifiers changed from: package-private */
        public void innerComplete() {
            this.active = false;
            drain();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                drain();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.disposed = true;
            this.inner.dispose();
            this.upstream.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public void drain() {
            boolean z;
            if (getAndIncrement() == 0) {
                while (!this.disposed) {
                    if (!this.active) {
                        boolean z2 = this.done;
                        try {
                            T poll = this.queue.poll();
                            if (poll == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z2 && z) {
                                this.disposed = true;
                                this.downstream.onComplete();
                                return;
                            } else if (!z) {
                                try {
                                    ObservableSource observableSource = (ObservableSource) C68362b.m265229a(this.mapper.apply(poll), "The mapper returned a null ObservableSource");
                                    this.active = true;
                                    observableSource.subscribe(this.inner);
                                } catch (Throwable th) {
                                    C68306a.m265071b(th);
                                    dispose();
                                    this.queue.clear();
                                    this.downstream.onError(th);
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            C68306a.m265071b(th2);
                            dispose();
                            this.queue.clear();
                            this.downstream.onError(th2);
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                this.queue.clear();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            dispose();
            this.downstream.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (!this.done) {
                if (this.fusionMode == 0) {
                    this.queue.offer(t);
                }
                drain();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                if (disposable instanceof AbstractC68368e) {
                    AbstractC68368e eVar = (AbstractC68368e) disposable;
                    int requestFusion = eVar.requestFusion(3);
                    if (requestFusion == 1) {
                        this.fusionMode = requestFusion;
                        this.queue = eVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        drain();
                        return;
                    } else if (requestFusion == 2) {
                        this.fusionMode = requestFusion;
                        this.queue = eVar;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new C68926b(this.bufferSize);
                this.downstream.onSubscribe(this);
            }
        }

        C68912b(AbstractC69009q<? super U> qVar, Function<? super T, ? extends ObservableSource<? extends U>> function, int i) {
            this.downstream = qVar;
            this.mapper = function;
            this.bufferSize = i;
            this.inner = new C68913a<>(qVar, this);
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super U> qVar) {
        boolean z;
        if (!ObservableScalarXMap.m265361a(this.f172123a, qVar, this.f172843b)) {
            if (this.f172845d == ErrorMode.IMMEDIATE) {
                this.f172123a.subscribe(new C68912b(new C69004d(qVar), this.f172843b, this.f172844c));
                return;
            }
            ObservableSource observableSource = this.f172123a;
            Function<? super T, ? extends ObservableSource<? extends U>> function = this.f172843b;
            int i = this.f172844c;
            if (this.f172845d == ErrorMode.END) {
                z = true;
            } else {
                z = false;
            }
            observableSource.subscribe(new C68910a(qVar, function, i, z));
        }
    }

    public C68909u(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<? extends U>> function, int i, ErrorMode errorMode) {
        super(observableSource);
        this.f172843b = function;
        this.f172845d = errorMode;
        this.f172844c = Math.max(8, i);
    }
}
