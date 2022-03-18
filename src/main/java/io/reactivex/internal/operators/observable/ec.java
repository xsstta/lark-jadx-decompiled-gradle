package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.C68924a;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.observers.AbstractC69002b;
import io.reactivex.p3457e.C68300e;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ec<T, B> extends AbstractC68651a<T, Observable<T>> {

    /* renamed from: b */
    final ObservableSource<B> f172624b;

    /* renamed from: c */
    final int f172625c;

    /* renamed from: io.reactivex.internal.operators.observable.ec$b */
    static final class RunnableC68846b<T, B> extends AtomicInteger implements Disposable, AbstractC69009q<T>, Runnable {
        static final Object NEXT_WINDOW = new Object();
        private static final long serialVersionUID = 2233020065421370272L;
        final C68845a<T, B> boundaryObserver = new C68845a<>(this);
        final int capacityHint;
        volatile boolean done;
        final AbstractC69009q<? super Observable<T>> downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        final C68924a<Object> queue = new C68924a<>();
        final AtomicBoolean stopWindows = new AtomicBoolean();
        final AtomicReference<Disposable> upstream = new AtomicReference<>();
        C68300e<T> window;
        final AtomicInteger windows = new AtomicInteger(1);

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.stopWindows.get();
        }

        /* access modifiers changed from: package-private */
        public void innerComplete() {
            DisposableHelper.dispose(this.upstream);
            this.done = true;
            drain();
        }

        /* access modifiers changed from: package-private */
        public void innerNext() {
            this.queue.offer(NEXT_WINDOW);
            drain();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.boundaryObserver.dispose();
            this.done = true;
            drain();
        }

        public void run() {
            if (this.windows.decrementAndGet() == 0) {
                DisposableHelper.dispose(this.upstream);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.stopWindows.compareAndSet(false, true)) {
                this.boundaryObserver.dispose();
                if (this.windows.decrementAndGet() == 0) {
                    DisposableHelper.dispose(this.upstream);
                }
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
                                qVar.onNext(a);
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

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this.upstream, disposable)) {
                innerNext();
            }
        }

        /* access modifiers changed from: package-private */
        public void innerError(Throwable th) {
            DisposableHelper.dispose(this.upstream);
            if (this.errors.addThrowable(th)) {
                this.done = true;
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.boundaryObserver.dispose();
            if (this.errors.addThrowable(th)) {
                this.done = true;
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        RunnableC68846b(AbstractC69009q<? super Observable<T>> qVar, int i) {
            this.downstream = qVar;
            this.capacityHint = i;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ec$a */
    static final class C68845a<T, B> extends AbstractC69002b<B> {

        /* renamed from: a */
        final RunnableC68846b<T, B> f172626a;

        /* renamed from: b */
        boolean f172627b;

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (!this.f172627b) {
                this.f172627b = true;
                this.f172626a.innerComplete();
            }
        }

        C68845a(RunnableC68846b<T, B> bVar) {
            this.f172626a = bVar;
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(B b) {
            if (!this.f172627b) {
                this.f172626a.innerNext();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (this.f172627b) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.f172627b = true;
            this.f172626a.innerError(th);
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super Observable<T>> qVar) {
        RunnableC68846b bVar = new RunnableC68846b(qVar, this.f172625c);
        qVar.onSubscribe(bVar);
        this.f172624b.subscribe(bVar.boundaryObserver);
        this.f172123a.subscribe(bVar);
    }

    public ec(ObservableSource<T> observableSource, ObservableSource<B> observableSource2, int i) {
        super(observableSource);
        this.f172624b = observableSource2;
        this.f172625c = i;
    }
}
