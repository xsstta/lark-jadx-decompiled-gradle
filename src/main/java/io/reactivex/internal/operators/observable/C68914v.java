package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.AbstractC68386j;
import io.reactivex.internal.observers.InnerQueuedObserver;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.p3460b.AbstractC68368e;
import io.reactivex.internal.p3460b.AbstractC68373j;
import io.reactivex.internal.queue.C68926b;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: io.reactivex.internal.operators.observable.v */
public final class C68914v<T, R> extends AbstractC68651a<T, R> {

    /* renamed from: b */
    final Function<? super T, ? extends ObservableSource<? extends R>> f172846b;

    /* renamed from: c */
    final ErrorMode f172847c;

    /* renamed from: d */
    final int f172848d;

    /* renamed from: e */
    final int f172849e;

    /* renamed from: io.reactivex.internal.operators.observable.v$a */
    static final class C68915a<T, R> extends AtomicInteger implements Disposable, AbstractC68386j<R>, AbstractC69009q<T> {
        private static final long serialVersionUID = 8080567949447303262L;
        int activeCount;
        volatile boolean cancelled;
        InnerQueuedObserver<R> current;
        volatile boolean done;
        final AbstractC69009q<? super R> downstream;
        final AtomicThrowable error = new AtomicThrowable();
        final ErrorMode errorMode;
        final Function<? super T, ? extends ObservableSource<? extends R>> mapper;
        final int maxConcurrency;
        final ArrayDeque<InnerQueuedObserver<R>> observers = new ArrayDeque<>();
        final int prefetch;
        AbstractC68373j<T> queue;
        int sourceMode;
        Disposable upstream;

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
            if (getAndIncrement() == 0) {
                this.queue.clear();
                disposeAll();
            }
        }

        /* access modifiers changed from: package-private */
        public void disposeAll() {
            InnerQueuedObserver<R> innerQueuedObserver = this.current;
            if (innerQueuedObserver != null) {
                innerQueuedObserver.dispose();
            }
            while (true) {
                InnerQueuedObserver<R> poll = this.observers.poll();
                if (poll != null) {
                    poll.dispose();
                } else {
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.observers.AbstractC68386j
        public void drain() {
            boolean z;
            boolean z2;
            if (getAndIncrement() == 0) {
                AbstractC68373j<T> jVar = this.queue;
                ArrayDeque<InnerQueuedObserver<R>> arrayDeque = this.observers;
                AbstractC69009q<? super R> qVar = this.downstream;
                ErrorMode errorMode2 = this.errorMode;
                int i = 1;
                while (true) {
                    int i2 = this.activeCount;
                    while (true) {
                        if (i2 == this.maxConcurrency) {
                            break;
                        } else if (this.cancelled) {
                            jVar.clear();
                            disposeAll();
                            return;
                        } else if (errorMode2 != ErrorMode.IMMEDIATE || ((Throwable) this.error.get()) == null) {
                            try {
                                T poll = jVar.poll();
                                if (poll == null) {
                                    break;
                                }
                                ObservableSource observableSource = (ObservableSource) C68362b.m265229a(this.mapper.apply(poll), "The mapper returned a null ObservableSource");
                                InnerQueuedObserver<R> innerQueuedObserver = new InnerQueuedObserver<>(this, this.prefetch);
                                arrayDeque.offer(innerQueuedObserver);
                                observableSource.subscribe(innerQueuedObserver);
                                i2++;
                            } catch (Throwable th) {
                                C68306a.m265071b(th);
                                this.upstream.dispose();
                                jVar.clear();
                                disposeAll();
                                this.error.addThrowable(th);
                                qVar.onError(this.error.terminate());
                                return;
                            }
                        } else {
                            jVar.clear();
                            disposeAll();
                            qVar.onError(this.error.terminate());
                            return;
                        }
                    }
                    this.activeCount = i2;
                    if (this.cancelled) {
                        jVar.clear();
                        disposeAll();
                        return;
                    } else if (errorMode2 != ErrorMode.IMMEDIATE || ((Throwable) this.error.get()) == null) {
                        InnerQueuedObserver<R> innerQueuedObserver2 = this.current;
                        if (innerQueuedObserver2 == null) {
                            if (errorMode2 != ErrorMode.BOUNDARY || ((Throwable) this.error.get()) == null) {
                                boolean z3 = this.done;
                                InnerQueuedObserver<R> poll2 = arrayDeque.poll();
                                if (poll2 == null) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (!z3 || !z2) {
                                    if (!z2) {
                                        this.current = poll2;
                                    }
                                    innerQueuedObserver2 = poll2;
                                } else if (((Throwable) this.error.get()) != null) {
                                    jVar.clear();
                                    disposeAll();
                                    qVar.onError(this.error.terminate());
                                    return;
                                } else {
                                    qVar.onComplete();
                                    return;
                                }
                            } else {
                                jVar.clear();
                                disposeAll();
                                qVar.onError(this.error.terminate());
                                return;
                            }
                        }
                        if (innerQueuedObserver2 != null) {
                            AbstractC68373j<R> queue2 = innerQueuedObserver2.queue();
                            while (!this.cancelled) {
                                boolean isDone = innerQueuedObserver2.isDone();
                                if (errorMode2 != ErrorMode.IMMEDIATE || ((Throwable) this.error.get()) == null) {
                                    try {
                                        R poll3 = queue2.poll();
                                        if (poll3 == null) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (isDone && z) {
                                            this.current = null;
                                            this.activeCount--;
                                        } else if (!z) {
                                            qVar.onNext(poll3);
                                        }
                                    } catch (Throwable th2) {
                                        C68306a.m265071b(th2);
                                        this.error.addThrowable(th2);
                                        this.current = null;
                                        this.activeCount--;
                                    }
                                } else {
                                    jVar.clear();
                                    disposeAll();
                                    qVar.onError(this.error.terminate());
                                    return;
                                }
                            }
                            jVar.clear();
                            disposeAll();
                            return;
                        }
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        jVar.clear();
                        disposeAll();
                        qVar.onError(this.error.terminate());
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.internal.observers.AbstractC68386j
        public void innerComplete(InnerQueuedObserver<R> innerQueuedObserver) {
            innerQueuedObserver.setDone();
            drain();
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
                this.queue = new C68926b(this.prefetch);
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.observers.AbstractC68386j
        public void innerNext(InnerQueuedObserver<R> innerQueuedObserver, R r) {
            innerQueuedObserver.queue().offer(r);
            drain();
        }

        @Override // io.reactivex.internal.observers.AbstractC68386j
        public void innerError(InnerQueuedObserver<R> innerQueuedObserver, Throwable th) {
            if (this.error.addThrowable(th)) {
                if (this.errorMode == ErrorMode.IMMEDIATE) {
                    this.upstream.dispose();
                }
                innerQueuedObserver.setDone();
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        C68915a(AbstractC69009q<? super R> qVar, Function<? super T, ? extends ObservableSource<? extends R>> function, int i, int i2, ErrorMode errorMode2) {
            this.downstream = qVar;
            this.mapper = function;
            this.maxConcurrency = i;
            this.prefetch = i2;
            this.errorMode = errorMode2;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super R> qVar) {
        this.f172123a.subscribe(new C68915a(qVar, this.f172846b, this.f172848d, this.f172849e, this.f172847c));
    }

    public C68914v(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<? extends R>> function, ErrorMode errorMode, int i, int i2) {
        super(observableSource);
        this.f172846b = function;
        this.f172847c = errorMode;
        this.f172848d = i;
        this.f172849e = i2;
    }
}
