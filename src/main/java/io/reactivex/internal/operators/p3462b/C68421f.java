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
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.b.f */
public final class C68421f<T, R> extends Observable<R> {

    /* renamed from: a */
    final Observable<T> f171762a;

    /* renamed from: b */
    final Function<? super T, ? extends AbstractC68990l<? extends R>> f171763b;

    /* renamed from: c */
    final boolean f171764c;

    /* renamed from: io.reactivex.internal.operators.b.f$a */
    static final class C68422a<T, R> extends AtomicInteger implements Disposable, AbstractC69009q<T> {
        static final C68423a<Object> INNER_DISPOSED = new C68423a<>(null);
        private static final long serialVersionUID = -5402190102429853762L;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final AbstractC69009q<? super R> downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicReference<C68423a<R>> inner = new AtomicReference<>();
        final Function<? super T, ? extends AbstractC68990l<? extends R>> mapper;
        Disposable upstream;

        /* access modifiers changed from: package-private */
        /* renamed from: io.reactivex.internal.operators.b.f$a$a */
        public static final class C68423a<R> extends AtomicReference<Disposable> implements AbstractC68989k<R> {
            private static final long serialVersionUID = 8042919737683345351L;
            volatile R item;
            final C68422a<?, R> parent;

            /* access modifiers changed from: package-private */
            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.AbstractC68989k
            public void onComplete() {
                this.parent.innerComplete(this);
            }

            @Override // io.reactivex.AbstractC68989k
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            C68423a(C68422a<?, R> aVar) {
                this.parent = aVar;
            }

            @Override // io.reactivex.AbstractC68989k
            public void onError(Throwable th) {
                this.parent.innerError(this, th);
            }

            @Override // io.reactivex.AbstractC68989k
            public void onSuccess(R r) {
                this.item = r;
                this.parent.drain();
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
            disposeInner();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.b.f$a$a<R>> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        public void disposeInner() {
            C68423a<Object> aVar = INNER_DISPOSED;
            C68423a<Object> aVar2 = (C68423a) this.inner.getAndSet(aVar);
            if (aVar2 != null && aVar2 != aVar) {
                aVar2.dispose();
            }
        }

        /* access modifiers changed from: package-private */
        public void drain() {
            boolean z;
            if (getAndIncrement() == 0) {
                AbstractC69009q<? super R> qVar = this.downstream;
                AtomicThrowable atomicThrowable = this.errors;
                AtomicReference<C68423a<R>> atomicReference = this.inner;
                int i = 1;
                while (!this.cancelled) {
                    if (atomicThrowable.get() == null || this.delayErrors) {
                        boolean z2 = this.done;
                        C68423a<R> aVar = atomicReference.get();
                        if (aVar == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z2 && z) {
                            Throwable terminate = atomicThrowable.terminate();
                            if (terminate != null) {
                                qVar.onError(terminate);
                                return;
                            } else {
                                qVar.onComplete();
                                return;
                            }
                        } else if (z || aVar.item == null) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else {
                            atomicReference.compareAndSet(aVar, null);
                            qVar.onNext(aVar.item);
                        }
                    } else {
                        qVar.onError(atomicThrowable.terminate());
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void innerComplete(C68423a<R> aVar) {
            if (this.inner.compareAndSet(aVar, null)) {
                drain();
            }
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
            if (this.errors.addThrowable(th)) {
                if (!this.delayErrors) {
                    disposeInner();
                }
                this.done = true;
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.b.f$a$a<R>> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            C68423a<R> aVar;
            C68423a<R> aVar2 = this.inner.get();
            if (aVar2 != null) {
                aVar2.dispose();
            }
            try {
                AbstractC68990l lVar = (AbstractC68990l) C68362b.m265229a(this.mapper.apply(t), "The mapper returned a null MaybeSource");
                C68423a<R> aVar3 = new C68423a<>(this);
                do {
                    aVar = this.inner.get();
                    if (aVar == INNER_DISPOSED) {
                        return;
                    }
                } while (!this.inner.compareAndSet(aVar, aVar3));
                lVar.mo238772a(aVar3);
            } catch (Throwable th) {
                C68306a.m265071b(th);
                this.upstream.dispose();
                this.inner.getAndSet(INNER_DISPOSED);
                onError(th);
            }
        }

        /* access modifiers changed from: package-private */
        public void innerError(C68423a<R> aVar, Throwable th) {
            if (!this.inner.compareAndSet(aVar, null) || !this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (!this.delayErrors) {
                this.upstream.dispose();
                disposeInner();
            }
            drain();
        }

        C68422a(AbstractC69009q<? super R> qVar, Function<? super T, ? extends AbstractC68990l<? extends R>> function, boolean z) {
            this.downstream = qVar;
            this.mapper = function;
            this.delayErrors = z;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super R> qVar) {
        if (!C68427h.m265274a(this.f171762a, this.f171763b, qVar)) {
            this.f171762a.subscribe(new C68422a(qVar, this.f171763b, this.f171764c));
        }
    }

    public C68421f(Observable<T> observable, Function<? super T, ? extends AbstractC68990l<? extends R>> function, boolean z) {
        this.f171762a = observable;
        this.f171763b = function;
        this.f171764c = z;
    }
}
