package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.C68289a;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.queue.C68926b;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.observable.m */
public final class C68883m<T, U extends Collection<? super T>, Open, Close> extends AbstractC68651a<T, U> {

    /* renamed from: b */
    final Callable<U> f172754b;

    /* renamed from: c */
    final ObservableSource<? extends Open> f172755c;

    /* renamed from: d */
    final Function<? super Open, ? extends ObservableSource<? extends Close>> f172756d;

    /* renamed from: io.reactivex.internal.operators.observable.m$a */
    static final class C68884a<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements Disposable, AbstractC69009q<T> {
        private static final long serialVersionUID = -8466418554264089604L;
        final Function<? super Open, ? extends ObservableSource<? extends Close>> bufferClose;
        final ObservableSource<? extends Open> bufferOpen;
        final Callable<C> bufferSupplier;
        Map<Long, C> buffers = new LinkedHashMap();
        volatile boolean cancelled;
        volatile boolean done;
        final AbstractC69009q<? super C> downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        long index;
        final C68289a observers = new C68289a();
        final C68926b<C> queue = new C68926b<>(Observable.bufferSize());
        final AtomicReference<Disposable> upstream = new AtomicReference<>();

        /* renamed from: io.reactivex.internal.operators.observable.m$a$a */
        static final class C68885a<Open> extends AtomicReference<Disposable> implements Disposable, AbstractC69009q<Open> {
            private static final long serialVersionUID = -8498650778633225126L;
            final C68884a<?, ?, Open, ?> parent;

            @Override // io.reactivex.disposables.Disposable
            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.disposables.Disposable
            public boolean isDisposed() {
                if (get() == DisposableHelper.DISPOSED) {
                    return true;
                }
                return false;
            }

            @Override // io.reactivex.AbstractC69009q
            public void onComplete() {
                lazySet(DisposableHelper.DISPOSED);
                this.parent.openComplete(this);
            }

            @Override // io.reactivex.AbstractC69009q
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            C68885a(C68884a<?, ?, Open, ?> aVar) {
                this.parent = aVar;
            }

            @Override // io.reactivex.AbstractC69009q
            public void onNext(Open open) {
                this.parent.open(open);
            }

            @Override // io.reactivex.AbstractC69009q
            public void onError(Throwable th) {
                lazySet(DisposableHelper.DISPOSED);
                this.parent.boundaryError(this, th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.upstream.get());
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (DisposableHelper.dispose(this.upstream)) {
                this.cancelled = true;
                this.observers.dispose();
                synchronized (this) {
                    this.buffers = null;
                }
                if (getAndIncrement() != 0) {
                    this.queue.clear();
                }
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.observers.dispose();
            synchronized (this) {
                Map<Long, C> map = this.buffers;
                if (map != null) {
                    for (C c : map.values()) {
                        this.queue.offer(c);
                    }
                    this.buffers = null;
                    this.done = true;
                    drain();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void drain() {
            boolean z;
            if (getAndIncrement() == 0) {
                AbstractC69009q<? super C> qVar = this.downstream;
                C68926b<C> bVar = this.queue;
                int i = 1;
                while (!this.cancelled) {
                    boolean z2 = this.done;
                    if (!z2 || this.errors.get() == null) {
                        C poll = bVar.poll();
                        if (poll == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z2 && z) {
                            qVar.onComplete();
                            return;
                        } else if (z) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else {
                            qVar.onNext(poll);
                        }
                    } else {
                        bVar.clear();
                        qVar.onError(this.errors.terminate());
                        return;
                    }
                }
                bVar.clear();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (this.errors.addThrowable(th)) {
                this.observers.dispose();
                synchronized (this) {
                    this.buffers = null;
                }
                this.done = true;
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this.upstream, disposable)) {
                C68885a aVar = new C68885a(this);
                this.observers.mo237937a(aVar);
                this.bufferOpen.subscribe(aVar);
            }
        }

        /* access modifiers changed from: package-private */
        public void openComplete(C68885a<Open> aVar) {
            this.observers.mo237941c(aVar);
            if (this.observers.mo237939b() == 0) {
                DisposableHelper.dispose(this.upstream);
                this.done = true;
                drain();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            synchronized (this) {
                Map<Long, C> map = this.buffers;
                if (map != null) {
                    for (C c : map.values()) {
                        c.add(t);
                    }
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: java.util.Map<java.lang.Long, C extends java.util.Collection<? super T>> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        public void open(Open open) {
            try {
                Collection collection = (Collection) C68362b.m265229a((Object) this.bufferSupplier.call(), "The bufferSupplier returned a null Collection");
                ObservableSource observableSource = (ObservableSource) C68362b.m265229a(this.bufferClose.apply(open), "The bufferClose returned a null ObservableSource");
                long j = this.index;
                this.index = 1 + j;
                synchronized (this) {
                    Map<Long, C> map = this.buffers;
                    if (map != 0) {
                        map.put(Long.valueOf(j), collection);
                        C68886b bVar = new C68886b(this, j);
                        this.observers.mo237937a(bVar);
                        observableSource.subscribe(bVar);
                    }
                }
            } catch (Throwable th) {
                C68306a.m265071b(th);
                DisposableHelper.dispose(this.upstream);
                onError(th);
            }
        }

        /* access modifiers changed from: package-private */
        public void boundaryError(Disposable disposable, Throwable th) {
            DisposableHelper.dispose(this.upstream);
            this.observers.mo237941c(disposable);
            onError(th);
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
            if (r4 == false) goto L_0x002f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
            r3.done = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
            drain();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close(io.reactivex.internal.operators.observable.C68883m.C68886b<T, C> r4, long r5) {
            /*
                r3 = this;
                io.reactivex.disposables.a r0 = r3.observers
                r0.mo237941c(r4)
                io.reactivex.disposables.a r4 = r3.observers
                int r4 = r4.mo237939b()
                r0 = 1
                if (r4 != 0) goto L_0x0015
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r4 = r3.upstream
                io.reactivex.internal.disposables.DisposableHelper.dispose(r4)
                r4 = 1
                goto L_0x0016
            L_0x0015:
                r4 = 0
            L_0x0016:
                monitor-enter(r3)
                java.util.Map<java.lang.Long, C extends java.util.Collection<? super T>> r1 = r3.buffers     // Catch:{ all -> 0x0033 }
                if (r1 != 0) goto L_0x001d
                monitor-exit(r3)     // Catch:{ all -> 0x0033 }
                return
            L_0x001d:
                io.reactivex.internal.queue.b<C extends java.util.Collection<? super T>> r2 = r3.queue     // Catch:{ all -> 0x0033 }
                java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0033 }
                java.lang.Object r5 = r1.remove(r5)     // Catch:{ all -> 0x0033 }
                r2.offer(r5)     // Catch:{ all -> 0x0033 }
                monitor-exit(r3)     // Catch:{ all -> 0x0033 }
                if (r4 == 0) goto L_0x002f
                r3.done = r0
            L_0x002f:
                r3.drain()
                return
            L_0x0033:
                r4 = move-exception
                monitor-exit(r3)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.C68883m.C68884a.close(io.reactivex.internal.operators.observable.m$b, long):void");
        }

        C68884a(AbstractC69009q<? super C> qVar, ObservableSource<? extends Open> observableSource, Function<? super Open, ? extends ObservableSource<? extends Close>> function, Callable<C> callable) {
            this.downstream = qVar;
            this.bufferSupplier = callable;
            this.bufferOpen = observableSource;
            this.bufferClose = function;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.m$b */
    public static final class C68886b<T, C extends Collection<? super T>> extends AtomicReference<Disposable> implements Disposable, AbstractC69009q<Object> {
        private static final long serialVersionUID = -8498650778633225126L;
        final long index;
        final C68884a<T, C, ?, ?> parent;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (get() == DisposableHelper.DISPOSED) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (get() != DisposableHelper.DISPOSED) {
                lazySet(DisposableHelper.DISPOSED);
                this.parent.close(this, this.index);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (get() != DisposableHelper.DISPOSED) {
                lazySet(DisposableHelper.DISPOSED);
                this.parent.boundaryError(this, th);
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(Object obj) {
            Disposable disposable = (Disposable) get();
            if (disposable != DisposableHelper.DISPOSED) {
                lazySet(DisposableHelper.DISPOSED);
                disposable.dispose();
                this.parent.close(this, this.index);
            }
        }

        C68886b(C68884a<T, C, ?, ?> aVar, long j) {
            this.parent = aVar;
            this.index = j;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super U> qVar) {
        C68884a aVar = new C68884a(qVar, this.f172755c, this.f172756d, this.f172754b);
        qVar.onSubscribe(aVar);
        this.f172123a.subscribe(aVar);
    }

    public C68883m(ObservableSource<T> observableSource, ObservableSource<? extends Open> observableSource2, Function<? super Open, ? extends ObservableSource<? extends Close>> function, Callable<U> callable) {
        super(observableSource);
        this.f172755c = observableSource2;
        this.f172756d = function;
        this.f172754b = callable;
    }
}
