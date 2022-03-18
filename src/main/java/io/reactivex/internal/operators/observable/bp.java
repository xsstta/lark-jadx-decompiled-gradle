package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.C68289a;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.operators.observable.bi;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.queue.C68926b;
import io.reactivex.internal.util.C68981f;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class bp<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AbstractC68651a<TLeft, R> {

    /* renamed from: b */
    final ObservableSource<? extends TRight> f172335b;

    /* renamed from: c */
    final Function<? super TLeft, ? extends ObservableSource<TLeftEnd>> f172336c;

    /* renamed from: d */
    final Function<? super TRight, ? extends ObservableSource<TRightEnd>> f172337d;

    /* renamed from: e */
    final BiFunction<? super TLeft, ? super TRight, ? extends R> f172338e;

    /* renamed from: io.reactivex.internal.operators.observable.bp$a */
    static final class C68729a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements Disposable, bi.AbstractC68705b {
        static final Integer LEFT_CLOSE = 3;
        static final Integer LEFT_VALUE = 1;
        static final Integer RIGHT_CLOSE = 4;
        static final Integer RIGHT_VALUE = 2;
        private static final long serialVersionUID = -6071216598687999801L;
        final AtomicInteger active;
        volatile boolean cancelled;
        final C68289a disposables = new C68289a();
        final AbstractC69009q<? super R> downstream;
        final AtomicReference<Throwable> error = new AtomicReference<>();
        final Function<? super TLeft, ? extends ObservableSource<TLeftEnd>> leftEnd;
        int leftIndex;
        final Map<Integer, TLeft> lefts = new LinkedHashMap();
        final C68926b<Object> queue = new C68926b<>(Observable.bufferSize());
        final BiFunction<? super TLeft, ? super TRight, ? extends R> resultSelector;
        final Function<? super TRight, ? extends ObservableSource<TRightEnd>> rightEnd;
        int rightIndex;
        final Map<Integer, TRight> rights = new LinkedHashMap();

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        /* access modifiers changed from: package-private */
        public void cancelAll() {
            this.disposables.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                cancelAll();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v4, resolved type: java.util.Map<java.lang.Integer, TRight> */
        /* JADX DEBUG: Multi-variable search result rejected for r6v12, resolved type: java.util.Map<java.lang.Integer, TLeft> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        public void drain() {
            boolean z;
            boolean z2;
            if (getAndIncrement() == 0) {
                C68926b<?> bVar = this.queue;
                AbstractC69009q<? super R> qVar = this.downstream;
                int i = 1;
                while (!this.cancelled) {
                    if (this.error.get() != null) {
                        bVar.clear();
                        cancelAll();
                        errorAll(qVar);
                        return;
                    }
                    if (this.active.get() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Integer num = (Integer) bVar.poll();
                    if (num == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z && z2) {
                        this.lefts.clear();
                        this.rights.clear();
                        this.disposables.dispose();
                        qVar.onComplete();
                        return;
                    } else if (z2) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        Object poll = bVar.poll();
                        if (num == LEFT_VALUE) {
                            int i2 = this.leftIndex;
                            this.leftIndex = i2 + 1;
                            this.lefts.put(Integer.valueOf(i2), poll);
                            try {
                                ObservableSource observableSource = (ObservableSource) C68362b.m265229a(this.leftEnd.apply(poll), "The leftEnd returned a null ObservableSource");
                                bi.C68706c cVar = new bi.C68706c(this, true, i2);
                                this.disposables.mo237937a(cVar);
                                observableSource.subscribe(cVar);
                                if (this.error.get() != null) {
                                    bVar.clear();
                                    cancelAll();
                                    errorAll(qVar);
                                    return;
                                }
                                for (TRight tright : this.rights.values()) {
                                    try {
                                        qVar.onNext((Object) C68362b.m265229a(this.resultSelector.apply(poll, tright), "The resultSelector returned a null value"));
                                    } catch (Throwable th) {
                                        fail(th, qVar, bVar);
                                        return;
                                    }
                                }
                            } catch (Throwable th2) {
                                fail(th2, qVar, bVar);
                                return;
                            }
                        } else if (num == RIGHT_VALUE) {
                            int i3 = this.rightIndex;
                            this.rightIndex = i3 + 1;
                            this.rights.put(Integer.valueOf(i3), poll);
                            try {
                                ObservableSource observableSource2 = (ObservableSource) C68362b.m265229a(this.rightEnd.apply(poll), "The rightEnd returned a null ObservableSource");
                                bi.C68706c cVar2 = new bi.C68706c(this, false, i3);
                                this.disposables.mo237937a(cVar2);
                                observableSource2.subscribe(cVar2);
                                if (this.error.get() != null) {
                                    bVar.clear();
                                    cancelAll();
                                    errorAll(qVar);
                                    return;
                                }
                                for (TLeft tleft : this.lefts.values()) {
                                    try {
                                        qVar.onNext((Object) C68362b.m265229a(this.resultSelector.apply(tleft, poll), "The resultSelector returned a null value"));
                                    } catch (Throwable th3) {
                                        fail(th3, qVar, bVar);
                                        return;
                                    }
                                }
                            } catch (Throwable th4) {
                                fail(th4, qVar, bVar);
                                return;
                            }
                        } else if (num == LEFT_CLOSE) {
                            bi.C68706c cVar3 = (bi.C68706c) poll;
                            this.lefts.remove(Integer.valueOf(cVar3.index));
                            this.disposables.mo237940b(cVar3);
                        } else {
                            bi.C68706c cVar4 = (bi.C68706c) poll;
                            this.rights.remove(Integer.valueOf(cVar4.index));
                            this.disposables.mo237940b(cVar4);
                        }
                    }
                }
                bVar.clear();
            }
        }

        @Override // io.reactivex.internal.operators.observable.bi.AbstractC68705b
        public void innerCloseError(Throwable th) {
            if (C68981f.m265560a(this.error, th)) {
                drain();
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.internal.operators.observable.bi.AbstractC68705b
        public void innerComplete(bi.C68707d dVar) {
            this.disposables.mo237941c(dVar);
            this.active.decrementAndGet();
            drain();
        }

        /* access modifiers changed from: package-private */
        public void errorAll(AbstractC69009q<?> qVar) {
            Throwable a = C68981f.m265559a(this.error);
            this.lefts.clear();
            this.rights.clear();
            qVar.onError(a);
        }

        @Override // io.reactivex.internal.operators.observable.bi.AbstractC68705b
        public void innerError(Throwable th) {
            if (C68981f.m265560a(this.error, th)) {
                this.active.decrementAndGet();
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.internal.operators.observable.bi.AbstractC68705b
        public void innerClose(boolean z, bi.C68706c cVar) {
            Integer num;
            synchronized (this) {
                C68926b<Object> bVar = this.queue;
                if (z) {
                    num = LEFT_CLOSE;
                } else {
                    num = RIGHT_CLOSE;
                }
                bVar.mo238627a(num, cVar);
            }
            drain();
        }

        @Override // io.reactivex.internal.operators.observable.bi.AbstractC68705b
        public void innerValue(boolean z, Object obj) {
            Integer num;
            synchronized (this) {
                C68926b<Object> bVar = this.queue;
                if (z) {
                    num = LEFT_VALUE;
                } else {
                    num = RIGHT_VALUE;
                }
                bVar.mo238627a(num, obj);
            }
            drain();
        }

        /* access modifiers changed from: package-private */
        public void fail(Throwable th, AbstractC69009q<?> qVar, C68926b<?> bVar) {
            C68306a.m265071b(th);
            C68981f.m265560a(this.error, th);
            bVar.clear();
            cancelAll();
            errorAll(qVar);
        }

        C68729a(AbstractC69009q<? super R> qVar, Function<? super TLeft, ? extends ObservableSource<TLeftEnd>> function, Function<? super TRight, ? extends ObservableSource<TRightEnd>> function2, BiFunction<? super TLeft, ? super TRight, ? extends R> biFunction) {
            this.downstream = qVar;
            this.leftEnd = function;
            this.rightEnd = function2;
            this.resultSelector = biFunction;
            this.active = new AtomicInteger(2);
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super R> qVar) {
        C68729a aVar = new C68729a(qVar, this.f172336c, this.f172337d, this.f172338e);
        qVar.onSubscribe(aVar);
        bi.C68707d dVar = new bi.C68707d(aVar, true);
        aVar.disposables.mo237937a(dVar);
        bi.C68707d dVar2 = new bi.C68707d(aVar, false);
        aVar.disposables.mo237937a(dVar2);
        this.f172123a.subscribe(dVar);
        this.f172335b.subscribe(dVar2);
    }

    public bp(ObservableSource<TLeft> observableSource, ObservableSource<? extends TRight> observableSource2, Function<? super TLeft, ? extends ObservableSource<TLeftEnd>> function, Function<? super TRight, ? extends ObservableSource<TRightEnd>> function2, BiFunction<? super TLeft, ? super TRight, ? extends R> biFunction) {
        super(observableSource);
        this.f172335b = observableSource2;
        this.f172336c = function;
        this.f172337d = function2;
        this.f172338e = biFunction;
    }
}
