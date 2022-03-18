package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.internal.p3460b.AbstractC68368e;
import io.reactivex.internal.p3460b.AbstractC68373j;
import io.reactivex.internal.queue.C68926b;
import io.reactivex.internal.schedulers.C68962m;
import io.reactivex.plugins.RxJavaPlugins;

public final class cb<T> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final Scheduler f172371b;

    /* renamed from: c */
    final boolean f172372c;

    /* renamed from: d */
    final int f172373d;

    /* renamed from: io.reactivex.internal.operators.observable.cb$a */
    static final class RunnableC68744a<T> extends BasicIntQueueDisposable<T> implements AbstractC69009q<T>, Runnable {
        private static final long serialVersionUID = 6576896619930983584L;
        final int bufferSize;
        final boolean delayError;
        volatile boolean disposed;
        volatile boolean done;
        final AbstractC69009q<? super T> downstream;
        Throwable error;
        boolean outputFused;
        AbstractC68373j<T> queue;
        int sourceMode;
        Disposable upstream;
        final Scheduler.AbstractC68257c worker;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public void clear() {
            this.queue.clear();
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public T poll() throws Exception {
            return this.queue.poll();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                schedule();
            }
        }

        public void run() {
            if (this.outputFused) {
                drainFused();
            } else {
                drainNormal();
            }
        }

        /* access modifiers changed from: package-private */
        public void schedule() {
            if (getAndIncrement() == 0) {
                this.worker.mo237795a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.disposed) {
                this.disposed = true;
                this.upstream.dispose();
                this.worker.dispose();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void drainFused() {
            int i = 1;
            while (!this.disposed) {
                boolean z = this.done;
                Throwable th = this.error;
                if (this.delayError || !z || th == null) {
                    this.downstream.onNext(null);
                    if (z) {
                        this.disposed = true;
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            this.downstream.onError(th2);
                        } else {
                            this.downstream.onComplete();
                        }
                        this.worker.dispose();
                        return;
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    this.disposed = true;
                    this.downstream.onError(this.error);
                    this.worker.dispose();
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void drainNormal() {
            boolean z;
            AbstractC68373j<T> jVar = this.queue;
            AbstractC69009q<? super T> qVar = this.downstream;
            int i = 1;
            while (!checkTerminated(this.done, jVar.isEmpty(), qVar)) {
                while (true) {
                    boolean z2 = this.done;
                    try {
                        T poll = jVar.poll();
                        if (poll == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!checkTerminated(z2, z, qVar)) {
                            if (z) {
                                i = addAndGet(-i);
                                if (i == 0) {
                                    return;
                                }
                            } else {
                                qVar.onNext(poll);
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C68306a.m265071b(th);
                        this.disposed = true;
                        this.upstream.dispose();
                        jVar.clear();
                        qVar.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68369f
        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            schedule();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (!this.done) {
                if (this.sourceMode != 2) {
                    this.queue.offer(t);
                }
                schedule();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                if (disposable instanceof AbstractC68368e) {
                    AbstractC68368e eVar = (AbstractC68368e) disposable;
                    int requestFusion = eVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = requestFusion;
                        this.queue = eVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        schedule();
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

        /* access modifiers changed from: package-private */
        public boolean checkTerminated(boolean z, boolean z2, AbstractC69009q<? super T> qVar) {
            if (this.disposed) {
                this.queue.clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                Throwable th = this.error;
                if (this.delayError) {
                    if (!z2) {
                        return false;
                    }
                    this.disposed = true;
                    if (th != null) {
                        qVar.onError(th);
                    } else {
                        qVar.onComplete();
                    }
                    this.worker.dispose();
                    return true;
                } else if (th != null) {
                    this.disposed = true;
                    this.queue.clear();
                    qVar.onError(th);
                    this.worker.dispose();
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    this.disposed = true;
                    qVar.onComplete();
                    this.worker.dispose();
                    return true;
                }
            }
        }

        RunnableC68744a(AbstractC69009q<? super T> qVar, Scheduler.AbstractC68257c cVar, boolean z, int i) {
            this.downstream = qVar;
            this.worker = cVar;
            this.delayError = z;
            this.bufferSize = i;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        Scheduler scheduler = this.f172371b;
        if (scheduler instanceof C68962m) {
            this.f172123a.subscribe(qVar);
            return;
        }
        this.f172123a.subscribe(new RunnableC68744a(qVar, scheduler.createWorker(), this.f172372c, this.f172373d));
    }

    public cb(ObservableSource<T> observableSource, Scheduler scheduler, boolean z, int i) {
        super(observableSource);
        this.f172371b = scheduler;
        this.f172372c = z;
        this.f172373d = i;
    }
}
