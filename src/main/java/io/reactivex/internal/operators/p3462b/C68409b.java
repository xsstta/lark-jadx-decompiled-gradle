package io.reactivex.internal.operators.p3462b;

import io.reactivex.AbstractC68259a;
import io.reactivex.AbstractC68273c;
import io.reactivex.AbstractC68293e;
import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.p3460b.AbstractC68368e;
import io.reactivex.internal.p3460b.AbstractC68373j;
import io.reactivex.internal.queue.C68926b;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.C68981f;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.b.b */
public final class C68409b<T> extends AbstractC68259a {

    /* renamed from: a */
    final Observable<T> f171739a;

    /* renamed from: b */
    final Function<? super T, ? extends AbstractC68293e> f171740b;

    /* renamed from: c */
    final ErrorMode f171741c;

    /* renamed from: d */
    final int f171742d;

    /* renamed from: io.reactivex.internal.operators.b.b$a */
    static final class C68410a<T> extends AtomicInteger implements Disposable, AbstractC69009q<T> {
        private static final long serialVersionUID = 3610901111000061034L;
        volatile boolean active;
        volatile boolean disposed;
        volatile boolean done;
        final AbstractC68273c downstream;
        final ErrorMode errorMode;
        final AtomicThrowable errors = new AtomicThrowable();
        final C68411a inner = new C68411a(this);
        final Function<? super T, ? extends AbstractC68293e> mapper;
        final int prefetch;
        AbstractC68373j<T> queue;
        Disposable upstream;

        /* access modifiers changed from: package-private */
        /* renamed from: io.reactivex.internal.operators.b.b$a$a */
        public static final class C68411a extends AtomicReference<Disposable> implements AbstractC68273c {
            private static final long serialVersionUID = 5638352172918776687L;
            final C68410a<?> parent;

            /* access modifiers changed from: package-private */
            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.AbstractC68273c
            public void onComplete() {
                this.parent.innerComplete();
            }

            @Override // io.reactivex.AbstractC68273c
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this, disposable);
            }

            C68411a(C68410a<?> aVar) {
                this.parent = aVar;
            }

            @Override // io.reactivex.AbstractC68273c
            public void onError(Throwable th) {
                this.parent.innerError(th);
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
            this.done = true;
            drain();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.disposed = true;
            this.upstream.dispose();
            this.inner.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public void drain() {
            boolean z;
            if (getAndIncrement() == 0) {
                AtomicThrowable atomicThrowable = this.errors;
                ErrorMode errorMode2 = this.errorMode;
                while (!this.disposed) {
                    if (!this.active) {
                        if (errorMode2 != ErrorMode.BOUNDARY || atomicThrowable.get() == null) {
                            boolean z2 = this.done;
                            AbstractC68293e eVar = null;
                            try {
                                T poll = this.queue.poll();
                                if (poll != null) {
                                    eVar = (AbstractC68293e) C68362b.m265229a(this.mapper.apply(poll), "The mapper returned a null CompletableSource");
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (z2 && z) {
                                    this.disposed = true;
                                    Throwable terminate = atomicThrowable.terminate();
                                    if (terminate != null) {
                                        this.downstream.onError(terminate);
                                        return;
                                    } else {
                                        this.downstream.onComplete();
                                        return;
                                    }
                                } else if (!z) {
                                    this.active = true;
                                    eVar.mo237885a(this.inner);
                                }
                            } catch (Throwable th) {
                                C68306a.m265071b(th);
                                this.disposed = true;
                                this.queue.clear();
                                this.upstream.dispose();
                                atomicThrowable.addThrowable(th);
                                this.downstream.onError(atomicThrowable.terminate());
                                return;
                            }
                        } else {
                            this.disposed = true;
                            this.queue.clear();
                            this.downstream.onError(atomicThrowable.terminate());
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
        public void onNext(T t) {
            if (t != null) {
                this.queue.offer(t);
            }
            drain();
        }

        /* access modifiers changed from: package-private */
        public void innerError(Throwable th) {
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
            } else if (this.errorMode == ErrorMode.IMMEDIATE) {
                this.disposed = true;
                this.upstream.dispose();
                Throwable terminate = this.errors.terminate();
                if (terminate != C68981f.f172984a) {
                    this.downstream.onError(terminate);
                }
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            } else {
                this.active = false;
                drain();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
            } else if (this.errorMode == ErrorMode.IMMEDIATE) {
                this.disposed = true;
                this.inner.dispose();
                Throwable terminate = this.errors.terminate();
                if (terminate != C68981f.f172984a) {
                    this.downstream.onError(terminate);
                }
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            } else {
                this.done = true;
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
                        this.queue = eVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        drain();
                        return;
                    } else if (requestFusion == 2) {
                        this.queue = eVar;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new C68926b(this.prefetch);
                this.downstream.onSubscribe(this);
            }
        }

        C68410a(AbstractC68273c cVar, Function<? super T, ? extends AbstractC68293e> function, ErrorMode errorMode2, int i) {
            this.downstream = cVar;
            this.mapper = function;
            this.errorMode = errorMode2;
            this.prefetch = i;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68259a
    /* renamed from: b */
    public void mo237889b(AbstractC68273c cVar) {
        if (!C68427h.m265273a(this.f171739a, this.f171740b, cVar)) {
            this.f171739a.subscribe(new C68410a(cVar, this.f171740b, this.f171741c, this.f171742d));
        }
    }

    public C68409b(Observable<T> observable, Function<? super T, ? extends AbstractC68293e> function, ErrorMode errorMode, int i) {
        this.f171739a = observable;
        this.f171740b = function;
        this.f171741c = errorMode;
        this.f171742d = i;
    }
}
