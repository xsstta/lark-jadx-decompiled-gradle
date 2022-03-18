package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.p3457e.C68300e;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class eb<T> extends AbstractC68651a<T, Observable<T>> {

    /* renamed from: b */
    final long f172621b;

    /* renamed from: c */
    final long f172622c;

    /* renamed from: d */
    final int f172623d;

    /* renamed from: io.reactivex.internal.operators.observable.eb$a */
    static final class RunnableC68843a<T> extends AtomicInteger implements Disposable, AbstractC69009q<T>, Runnable {
        private static final long serialVersionUID = -7481782523886138128L;
        volatile boolean cancelled;
        final int capacityHint;
        final long count;
        final AbstractC69009q<? super Observable<T>> downstream;
        long size;
        Disposable upstream;
        C68300e<T> window;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            C68300e<T> eVar = this.window;
            if (eVar != null) {
                this.window = null;
                eVar.onComplete();
            }
            this.downstream.onComplete();
        }

        public void run() {
            if (this.cancelled) {
                this.upstream.dispose();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            C68300e<T> eVar = this.window;
            if (eVar != null) {
                this.window = null;
                eVar.onError(th);
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            C68300e<T> eVar = this.window;
            if (eVar == null && !this.cancelled) {
                eVar = C68300e.m265060a(this.capacityHint, this);
                this.window = eVar;
                this.downstream.onNext(eVar);
            }
            if (eVar != null) {
                eVar.onNext(t);
                long j = this.size + 1;
                this.size = j;
                if (j >= this.count) {
                    this.size = 0;
                    this.window = null;
                    eVar.onComplete();
                    if (this.cancelled) {
                        this.upstream.dispose();
                    }
                }
            }
        }

        RunnableC68843a(AbstractC69009q<? super Observable<T>> qVar, long j, int i) {
            this.downstream = qVar;
            this.count = j;
            this.capacityHint = i;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.eb$b */
    static final class RunnableC68844b<T> extends AtomicBoolean implements Disposable, AbstractC69009q<T>, Runnable {
        private static final long serialVersionUID = 3366976432059579510L;
        volatile boolean cancelled;
        final int capacityHint;
        final long count;
        final AbstractC69009q<? super Observable<T>> downstream;
        long firstEmission;
        long index;
        final long skip;
        Disposable upstream;
        final ArrayDeque<C68300e<T>> windows;
        final AtomicInteger wip = new AtomicInteger();

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            ArrayDeque<C68300e<T>> arrayDeque = this.windows;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onComplete();
            }
            this.downstream.onComplete();
        }

        public void run() {
            if (this.wip.decrementAndGet() == 0 && this.cancelled) {
                this.upstream.dispose();
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
            ArrayDeque<C68300e<T>> arrayDeque = this.windows;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onError(th);
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            ArrayDeque<C68300e<T>> arrayDeque = this.windows;
            long j = this.index;
            long j2 = this.skip;
            if (j % j2 == 0 && !this.cancelled) {
                this.wip.getAndIncrement();
                C68300e<T> a = C68300e.m265060a(this.capacityHint, this);
                arrayDeque.offer(a);
                this.downstream.onNext(a);
            }
            long j3 = this.firstEmission + 1;
            Iterator<C68300e<T>> it = arrayDeque.iterator();
            while (it.hasNext()) {
                it.next().onNext(t);
            }
            if (j3 >= this.count) {
                arrayDeque.poll().onComplete();
                if (!arrayDeque.isEmpty() || !this.cancelled) {
                    this.firstEmission = j3 - j2;
                } else {
                    this.upstream.dispose();
                    return;
                }
            } else {
                this.firstEmission = j3;
            }
            this.index = j + 1;
        }

        RunnableC68844b(AbstractC69009q<? super Observable<T>> qVar, long j, long j2, int i) {
            this.downstream = qVar;
            this.count = j;
            this.skip = j2;
            this.capacityHint = i;
            this.windows = new ArrayDeque<>();
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super Observable<T>> qVar) {
        if (this.f172621b == this.f172622c) {
            this.f172123a.subscribe(new RunnableC68843a(qVar, this.f172621b, this.f172623d));
        } else {
            this.f172123a.subscribe(new RunnableC68844b(qVar, this.f172621b, this.f172622c, this.f172623d));
        }
    }

    public eb(ObservableSource<T> observableSource, long j, long j2, int i) {
        super(observableSource);
        this.f172621b = j;
        this.f172622c = j2;
        this.f172623d = i;
    }
}
