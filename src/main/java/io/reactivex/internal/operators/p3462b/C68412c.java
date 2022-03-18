package io.reactivex.internal.operators.p3462b;

import io.reactivex.AbstractC68989k;
import io.reactivex.AbstractC68990l;
import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.p3460b.AbstractC68372i;
import io.reactivex.internal.queue.C68926b;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.b.c */
public final class C68412c<T, R> extends Observable<R> {

    /* renamed from: a */
    final Observable<T> f171743a;

    /* renamed from: b */
    final Function<? super T, ? extends AbstractC68990l<? extends R>> f171744b;

    /* renamed from: c */
    final ErrorMode f171745c;

    /* renamed from: d */
    final int f171746d;

    /* renamed from: io.reactivex.internal.operators.b.c$a */
    static final class C68413a<T, R> extends AtomicInteger implements Disposable, AbstractC69009q<T> {
        private static final long serialVersionUID = -9140123220065488293L;
        volatile boolean cancelled;
        volatile boolean done;
        final AbstractC69009q<? super R> downstream;
        final ErrorMode errorMode;
        final AtomicThrowable errors = new AtomicThrowable();
        final C68414a<R> inner = new C68414a<>(this);
        R item;
        final Function<? super T, ? extends AbstractC68990l<? extends R>> mapper;
        final AbstractC68372i<T> queue;
        volatile int state;
        Disposable upstream;

        /* access modifiers changed from: package-private */
        /* renamed from: io.reactivex.internal.operators.b.c$a$a */
        public static final class C68414a<R> extends AtomicReference<Disposable> implements AbstractC68989k<R> {
            private static final long serialVersionUID = -3051469169682093892L;
            final C68413a<?, R> parent;

            /* access modifiers changed from: package-private */
            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.AbstractC68989k
            public void onComplete() {
                this.parent.innerComplete();
            }

            @Override // io.reactivex.AbstractC68989k
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this, disposable);
            }

            C68414a(C68413a<?, R> aVar) {
                this.parent = aVar;
            }

            @Override // io.reactivex.AbstractC68989k
            public void onError(Throwable th) {
                this.parent.innerError(th);
            }

            @Override // io.reactivex.AbstractC68989k
            public void onSuccess(R r) {
                this.parent.innerSuccess(r);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        /* access modifiers changed from: package-private */
        public void innerComplete() {
            this.state = 0;
            drain();
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
            this.inner.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
                this.item = null;
            }
        }

        /* access modifiers changed from: package-private */
        public void drain() {
            if (getAndIncrement() == 0) {
                AbstractC69009q<? super R> qVar = this.downstream;
                ErrorMode errorMode2 = this.errorMode;
                AbstractC68372i<T> iVar = this.queue;
                AtomicThrowable atomicThrowable = this.errors;
                int i = 1;
                while (true) {
                    if (this.cancelled) {
                        iVar.clear();
                        this.item = null;
                    } else {
                        int i2 = this.state;
                        if (atomicThrowable.get() == null || !(errorMode2 == ErrorMode.IMMEDIATE || (errorMode2 == ErrorMode.BOUNDARY && i2 == 0))) {
                            boolean z = false;
                            if (i2 == 0) {
                                boolean z2 = this.done;
                                T poll = iVar.poll();
                                if (poll == null) {
                                    z = true;
                                }
                                if (z2 && z) {
                                    Throwable terminate = atomicThrowable.terminate();
                                    if (terminate == null) {
                                        qVar.onComplete();
                                        return;
                                    } else {
                                        qVar.onError(terminate);
                                        return;
                                    }
                                } else if (!z) {
                                    try {
                                        AbstractC68990l lVar = (AbstractC68990l) C68362b.m265229a(this.mapper.apply(poll), "The mapper returned a null MaybeSource");
                                        this.state = 1;
                                        lVar.mo238772a(this.inner);
                                    } catch (Throwable th) {
                                        C68306a.m265071b(th);
                                        this.upstream.dispose();
                                        iVar.clear();
                                        atomicThrowable.addThrowable(th);
                                        qVar.onError(atomicThrowable.terminate());
                                        return;
                                    }
                                }
                            } else if (i2 == 2) {
                                R r = this.item;
                                this.item = null;
                                qVar.onNext(r);
                                this.state = 0;
                            }
                        }
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
                iVar.clear();
                this.item = null;
                qVar.onError(atomicThrowable.terminate());
            }
        }

        /* access modifiers changed from: package-private */
        public void innerSuccess(R r) {
            this.item = r;
            this.state = 2;
            drain();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            this.queue.offer(t);
            drain();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        /* access modifiers changed from: package-private */
        public void innerError(Throwable th) {
            if (this.errors.addThrowable(th)) {
                if (this.errorMode != ErrorMode.END) {
                    this.upstream.dispose();
                }
                this.state = 0;
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (this.errors.addThrowable(th)) {
                if (this.errorMode == ErrorMode.IMMEDIATE) {
                    this.inner.dispose();
                }
                this.done = true;
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        C68413a(AbstractC69009q<? super R> qVar, Function<? super T, ? extends AbstractC68990l<? extends R>> function, int i, ErrorMode errorMode2) {
            this.downstream = qVar;
            this.mapper = function;
            this.errorMode = errorMode2;
            this.queue = new C68926b(i);
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super R> qVar) {
        if (!C68427h.m265274a(this.f171743a, this.f171744b, qVar)) {
            this.f171743a.subscribe(new C68413a(qVar, this.f171744b, this.f171746d, this.f171745c));
        }
    }

    public C68412c(Observable<T> observable, Function<? super T, ? extends AbstractC68990l<? extends R>> function, ErrorMode errorMode, int i) {
        this.f171743a = observable;
        this.f171744b = function;
        this.f171745c = errorMode;
        this.f171746d = i;
    }
}
