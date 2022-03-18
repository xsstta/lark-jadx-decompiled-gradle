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
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class dj<T, R> extends AbstractC68651a<T, R> {

    /* renamed from: b */
    final Function<? super T, ? extends ObservableSource<? extends R>> f172539b;

    /* renamed from: c */
    final int f172540c;

    /* renamed from: d */
    final boolean f172541d;

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.dj$a */
    public static final class C68811a<T, R> extends AtomicReference<Disposable> implements AbstractC69009q<R> {
        private static final long serialVersionUID = 3837284832786408377L;
        final int bufferSize;
        volatile boolean done;
        final long index;
        final C68812b<T, R> parent;
        volatile AbstractC68373j<R> queue;

        public void cancel() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (this.index == this.parent.unique) {
                this.done = true;
                this.parent.drain();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.parent.innerError(this, th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(R r) {
            if (this.index == this.parent.unique) {
                if (r != null) {
                    this.queue.offer(r);
                }
                this.parent.drain();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                if (disposable instanceof AbstractC68368e) {
                    AbstractC68368e eVar = (AbstractC68368e) disposable;
                    int requestFusion = eVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.queue = eVar;
                        this.done = true;
                        this.parent.drain();
                        return;
                    } else if (requestFusion == 2) {
                        this.queue = eVar;
                        return;
                    }
                }
                this.queue = new C68926b(this.bufferSize);
            }
        }

        C68811a(C68812b<T, R> bVar, long j, int i) {
            this.parent = bVar;
            this.index = j;
            this.bufferSize = i;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.dj$b */
    static final class C68812b<T, R> extends AtomicInteger implements Disposable, AbstractC69009q<T> {
        static final C68811a<Object, Object> CANCELLED;
        private static final long serialVersionUID = -3491074160481096299L;
        final AtomicReference<C68811a<T, R>> active = new AtomicReference<>();
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final AbstractC69009q<? super R> downstream;
        final AtomicThrowable errors;
        final Function<? super T, ? extends ObservableSource<? extends R>> mapper;
        volatile long unique;
        Disposable upstream;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        static {
            C68811a<Object, Object> aVar = new C68811a<>(null, -1, 1);
            CANCELLED = aVar;
            aVar.cancel();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.dispose();
                disposeInner();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                drain();
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.dj$a<T, R>> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        public void disposeInner() {
            C68811a<Object, Object> aVar;
            C68811a<T, R> aVar2 = this.active.get();
            C68811a<Object, Object> aVar3 = CANCELLED;
            if (aVar2 != aVar3 && (aVar = (C68811a) this.active.getAndSet(aVar3)) != aVar3 && aVar != null) {
                aVar.cancel();
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x000f A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void drain() {
            /*
            // Method dump skipped, instructions count: 241
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.dj.C68812b.drain():void");
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
            if (this.done || !this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (!this.delayErrors) {
                disposeInner();
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            C68811a<T, R> aVar;
            long j = this.unique + 1;
            this.unique = j;
            C68811a<T, R> aVar2 = this.active.get();
            if (aVar2 != null) {
                aVar2.cancel();
            }
            try {
                ObservableSource observableSource = (ObservableSource) C68362b.m265229a(this.mapper.apply(t), "The ObservableSource returned is null");
                C68811a<T, R> aVar3 = new C68811a<>(this, j, this.bufferSize);
                do {
                    aVar = this.active.get();
                    if (aVar == CANCELLED) {
                        return;
                    }
                } while (!this.active.compareAndSet(aVar, aVar3));
                observableSource.subscribe(aVar3);
            } catch (Throwable th) {
                C68306a.m265071b(th);
                this.upstream.dispose();
                onError(th);
            }
        }

        /* access modifiers changed from: package-private */
        public void innerError(C68811a<T, R> aVar, Throwable th) {
            if (aVar.index != this.unique || !this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (!this.delayErrors) {
                this.upstream.dispose();
            }
            aVar.done = true;
            drain();
        }

        C68812b(AbstractC69009q<? super R> qVar, Function<? super T, ? extends ObservableSource<? extends R>> function, int i, boolean z) {
            this.downstream = qVar;
            this.mapper = function;
            this.bufferSize = i;
            this.delayErrors = z;
            this.errors = new AtomicThrowable();
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super R> qVar) {
        if (!ObservableScalarXMap.m265361a(this.f172123a, qVar, this.f172539b)) {
            this.f172123a.subscribe(new C68812b(qVar, this.f172539b, this.f172540c, this.f172541d));
        }
    }

    public dj(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<? extends R>> function, int i, boolean z) {
        super(observableSource);
        this.f172539b = function;
        this.f172540c = i;
        this.f172541d = z;
    }
}
