package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.AbstractC68376c;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.p3454b.AbstractC68271a;
import io.reactivex.p3456d.C68279a;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class cl<T> extends Observable<T> {

    /* renamed from: a */
    final AbstractC68271a<T> f172420a;

    /* renamed from: b */
    final int f172421b;

    /* renamed from: c */
    final long f172422c;

    /* renamed from: d */
    final TimeUnit f172423d;

    /* renamed from: e */
    final Scheduler f172424e;

    /* renamed from: f */
    RunnableC68756a f172425f;

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.cl$a */
    public static final class RunnableC68756a extends AtomicReference<Disposable> implements Consumer<Disposable>, Runnable {
        private static final long serialVersionUID = -4552101107598366241L;
        boolean connected;
        boolean disconnectedEarly;
        final cl<?> parent;
        long subscriberCount;
        Disposable timer;

        public void run() {
            this.parent.mo238428c(this);
        }

        RunnableC68756a(cl<?> clVar) {
            this.parent = clVar;
        }

        public void accept(Disposable disposable) throws Exception {
            DisposableHelper.replace(this, disposable);
            synchronized (this.parent) {
                if (this.disconnectedEarly) {
                    ((AbstractC68376c) this.parent.f172420a).mo238089a(disposable);
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.cl$b */
    static final class C68757b<T> extends AtomicBoolean implements Disposable, AbstractC69009q<T> {
        private static final long serialVersionUID = -7419642935409022375L;
        final RunnableC68756a connection;
        final AbstractC69009q<? super T> downstream;
        final cl<T> parent;
        Disposable upstream;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
            if (compareAndSet(false, true)) {
                this.parent.mo238426a(this.connection);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (compareAndSet(false, true)) {
                this.parent.mo238427b(this.connection);
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (compareAndSet(false, true)) {
                this.parent.mo238427b(this.connection);
                this.downstream.onError(th);
                return;
            }
            RxJavaPlugins.onError(th);
        }

        C68757b(AbstractC69009q<? super T> qVar, cl<T> clVar, RunnableC68756a aVar) {
            this.downstream = qVar;
            this.parent = clVar;
            this.connection = aVar;
        }
    }

    public cl(AbstractC68271a<T> aVar) {
        this(aVar, 1, 0, TimeUnit.NANOSECONDS, C68279a.m265024c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo238427b(RunnableC68756a aVar) {
        synchronized (this) {
            RunnableC68756a aVar2 = this.f172425f;
            if (aVar2 != null && aVar2 == aVar) {
                this.f172425f = null;
                if (aVar.timer != null) {
                    aVar.timer.dispose();
                }
            }
            long j = aVar.subscriberCount - 1;
            aVar.subscriberCount = j;
            if (j == 0) {
                AbstractC68271a<T> aVar3 = this.f172420a;
                if (aVar3 instanceof Disposable) {
                    ((Disposable) aVar3).dispose();
                } else if (aVar3 instanceof AbstractC68376c) {
                    ((AbstractC68376c) aVar3).mo238089a((Disposable) aVar.get());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo238428c(RunnableC68756a aVar) {
        synchronized (this) {
            if (aVar.subscriberCount == 0 && aVar == this.f172425f) {
                this.f172425f = null;
                Disposable disposable = (Disposable) aVar.get();
                DisposableHelper.dispose(aVar);
                AbstractC68271a<T> aVar2 = this.f172420a;
                if (aVar2 instanceof Disposable) {
                    ((Disposable) aVar2).dispose();
                } else if (aVar2 instanceof AbstractC68376c) {
                    if (disposable == null) {
                        aVar.disconnectedEarly = true;
                    } else {
                        ((AbstractC68376c) aVar2).mo238089a(disposable);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo238426a(RunnableC68756a aVar) {
        synchronized (this) {
            RunnableC68756a aVar2 = this.f172425f;
            if (aVar2 != null) {
                if (aVar2 == aVar) {
                    long j = aVar.subscriberCount - 1;
                    aVar.subscriberCount = j;
                    if (j == 0) {
                        if (aVar.connected) {
                            if (this.f172422c == 0) {
                                mo238428c(aVar);
                                return;
                            }
                            SequentialDisposable sequentialDisposable = new SequentialDisposable();
                            aVar.timer = sequentialDisposable;
                            sequentialDisposable.replace(this.f172424e.scheduleDirect(aVar, this.f172422c, this.f172423d));
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        RunnableC68756a aVar;
        boolean z;
        synchronized (this) {
            aVar = this.f172425f;
            if (aVar == null) {
                aVar = new RunnableC68756a(this);
                this.f172425f = aVar;
            }
            long j = aVar.subscriberCount;
            if (j == 0 && aVar.timer != null) {
                aVar.timer.dispose();
            }
            long j2 = j + 1;
            aVar.subscriberCount = j2;
            z = true;
            if (aVar.connected || j2 != ((long) this.f172421b)) {
                z = false;
            } else {
                aVar.connected = true;
            }
        }
        this.f172420a.subscribe(new C68757b(qVar, this, aVar));
        if (z) {
            this.f172420a.mo237900a(aVar);
        }
    }

    public cl(AbstractC68271a<T> aVar, int i, long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.f172420a = aVar;
        this.f172421b = i;
        this.f172422c = j;
        this.f172423d = timeUnit;
        this.f172424e = scheduler;
    }
}
