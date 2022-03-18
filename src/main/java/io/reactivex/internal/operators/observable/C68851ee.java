package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.queue.C68924a;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.observers.AbstractC69002b;
import io.reactivex.p3457e.C68300e;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.observable.ee */
public final class C68851ee<T, B> extends AbstractC68651a<T, Observable<T>> {

    /* renamed from: b */
    final Callable<? extends ObservableSource<B>> f172645b;

    /* renamed from: c */
    final int f172646c;

    /* renamed from: io.reactivex.internal.operators.observable.ee$b */
    static final class RunnableC68853b<T, B> extends AtomicInteger implements Disposable, AbstractC69009q<T>, Runnable {
        static final C68852a<Object, Object> BOUNDARY_DISPOSED = new C68852a<>(null);
        static final Object NEXT_WINDOW = new Object();
        private static final long serialVersionUID = 2233020065421370272L;
        final AtomicReference<C68852a<T, B>> boundaryObserver = new AtomicReference<>();
        final int capacityHint;
        volatile boolean done;
        final AbstractC69009q<? super Observable<T>> downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        final Callable<? extends ObservableSource<B>> other;
        final C68924a<Object> queue = new C68924a<>();
        final AtomicBoolean stopWindows = new AtomicBoolean();
        Disposable upstream;
        C68300e<T> window;
        final AtomicInteger windows = new AtomicInteger(1);

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.stopWindows.get();
        }

        /* access modifiers changed from: package-private */
        public void innerComplete() {
            this.upstream.dispose();
            this.done = true;
            drain();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            disposeBoundary();
            this.done = true;
            drain();
        }

        public void run() {
            if (this.windows.decrementAndGet() == 0) {
                this.upstream.dispose();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.stopWindows.compareAndSet(false, true)) {
                disposeBoundary();
                if (this.windows.decrementAndGet() == 0) {
                    this.upstream.dispose();
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ee$a<T, B>> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        public void disposeBoundary() {
            C68852a<Object, Object> aVar = BOUNDARY_DISPOSED;
            Disposable disposable = (Disposable) this.boundaryObserver.getAndSet(aVar);
            if (disposable != null && disposable != aVar) {
                disposable.dispose();
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: io.reactivex.e.e<T> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        public void drain() {
            boolean z;
            if (getAndIncrement() == 0) {
                AbstractC69009q<? super Observable<T>> qVar = this.downstream;
                C68924a<Object> aVar = this.queue;
                AtomicThrowable atomicThrowable = this.errors;
                int i = 1;
                while (this.windows.get() != 0) {
                    C68300e<T> eVar = this.window;
                    boolean z2 = this.done;
                    if (!z2 || atomicThrowable.get() == null) {
                        Object poll = aVar.poll();
                        if (poll == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z2 && z) {
                            Throwable terminate = atomicThrowable.terminate();
                            if (terminate == null) {
                                if (eVar != 0) {
                                    this.window = null;
                                    eVar.onComplete();
                                }
                                qVar.onComplete();
                                return;
                            }
                            if (eVar != 0) {
                                this.window = null;
                                eVar.onError(terminate);
                            }
                            qVar.onError(terminate);
                            return;
                        } else if (z) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else if (poll != NEXT_WINDOW) {
                            eVar.onNext(poll);
                        } else {
                            if (eVar != 0) {
                                this.window = null;
                                eVar.onComplete();
                            }
                            if (!this.stopWindows.get()) {
                                C68300e<T> a = C68300e.m265060a(this.capacityHint, this);
                                this.window = a;
                                this.windows.getAndIncrement();
                                try {
                                    ObservableSource observableSource = (ObservableSource) C68362b.m265229a(this.other.call(), "The other Callable returned a null ObservableSource");
                                    C68852a<T, B> aVar2 = new C68852a<>(this);
                                    if (this.boundaryObserver.compareAndSet(null, aVar2)) {
                                        observableSource.subscribe(aVar2);
                                        qVar.onNext(a);
                                    }
                                } catch (Throwable th) {
                                    C68306a.m265071b(th);
                                    atomicThrowable.addThrowable(th);
                                    this.done = true;
                                }
                            }
                        }
                    } else {
                        aVar.clear();
                        Throwable terminate2 = atomicThrowable.terminate();
                        if (eVar != 0) {
                            this.window = null;
                            eVar.onError(terminate2);
                        }
                        qVar.onError(terminate2);
                        return;
                    }
                }
                aVar.clear();
                this.window = null;
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            this.queue.offer(t);
            drain();
        }

        /* access modifiers changed from: package-private */
        public void innerError(Throwable th) {
            this.upstream.dispose();
            if (this.errors.addThrowable(th)) {
                this.done = true;
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        /* access modifiers changed from: package-private */
        public void innerNext(C68852a<T, B> aVar) {
            this.boundaryObserver.compareAndSet(aVar, null);
            this.queue.offer(NEXT_WINDOW);
            drain();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            disposeBoundary();
            if (this.errors.addThrowable(th)) {
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
                this.downstream.onSubscribe(this);
                this.queue.offer(NEXT_WINDOW);
                drain();
            }
        }

        RunnableC68853b(AbstractC69009q<? super Observable<T>> qVar, int i, Callable<? extends ObservableSource<B>> callable) {
            this.downstream = qVar;
            this.capacityHint = i;
            this.other = callable;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.ee$a */
    public static final class C68852a<T, B> extends AbstractC69002b<B> {

        /* renamed from: a */
        final RunnableC68853b<T, B> f172647a;

        /* renamed from: b */
        boolean f172648b;

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (!this.f172648b) {
                this.f172648b = true;
                this.f172647a.innerComplete();
            }
        }

        C68852a(RunnableC68853b<T, B> bVar) {
            this.f172647a = bVar;
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (this.f172648b) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.f172648b = true;
            this.f172647a.innerError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(B b) {
            if (!this.f172648b) {
                this.f172648b = true;
                dispose();
                this.f172647a.innerNext(this);
            }
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super Observable<T>> qVar) {
        this.f172123a.subscribe(new RunnableC68853b(qVar, this.f172646c, this.f172645b));
    }

    public C68851ee(ObservableSource<T> observableSource, Callable<? extends ObservableSource<B>> callable, int i) {
        super(observableSource);
        this.f172645b = callable;
        this.f172646c = i;
    }
}
