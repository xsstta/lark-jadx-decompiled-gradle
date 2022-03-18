package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.C68289a;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.queue.C68926b;
import io.reactivex.internal.util.C68981f;
import io.reactivex.p3457e.C68300e;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class bi<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AbstractC68651a<TLeft, R> {

    /* renamed from: b */
    final ObservableSource<? extends TRight> f172288b;

    /* renamed from: c */
    final Function<? super TLeft, ? extends ObservableSource<TLeftEnd>> f172289c;

    /* renamed from: d */
    final Function<? super TRight, ? extends ObservableSource<TRightEnd>> f172290d;

    /* renamed from: e */
    final BiFunction<? super TLeft, ? super Observable<TRight>, ? extends R> f172291e;

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.bi$b */
    public interface AbstractC68705b {
        void innerClose(boolean z, C68706c cVar);

        void innerCloseError(Throwable th);

        void innerComplete(C68707d dVar);

        void innerError(Throwable th);

        void innerValue(boolean z, Object obj);
    }

    /* renamed from: io.reactivex.internal.operators.observable.bi$a */
    static final class C68704a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements Disposable, AbstractC68705b {
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
        final Map<Integer, C68300e<TRight>> lefts = new LinkedHashMap();
        final C68926b<Object> queue = new C68926b<>(Observable.bufferSize());
        final BiFunction<? super TLeft, ? super Observable<TRight>, ? extends R> resultSelector;
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
                        for (C68300e<TRight> eVar : this.lefts.values()) {
                            eVar.onComplete();
                        }
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
                            C68300e<TRight> a = C68300e.m265058a();
                            int i2 = this.leftIndex;
                            this.leftIndex = i2 + 1;
                            this.lefts.put(Integer.valueOf(i2), a);
                            try {
                                ObservableSource observableSource = (ObservableSource) C68362b.m265229a(this.leftEnd.apply(poll), "The leftEnd returned a null ObservableSource");
                                C68706c cVar = new C68706c(this, true, i2);
                                this.disposables.mo237937a(cVar);
                                observableSource.subscribe(cVar);
                                if (this.error.get() != null) {
                                    bVar.clear();
                                    cancelAll();
                                    errorAll(qVar);
                                    return;
                                }
                                try {
                                    qVar.onNext((Object) C68362b.m265229a(this.resultSelector.apply(poll, a), "The resultSelector returned a null value"));
                                    for (TRight tright : this.rights.values()) {
                                        a.onNext(tright);
                                    }
                                } catch (Throwable th) {
                                    fail(th, qVar, bVar);
                                    return;
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
                                C68706c cVar2 = new C68706c(this, false, i3);
                                this.disposables.mo237937a(cVar2);
                                observableSource2.subscribe(cVar2);
                                if (this.error.get() != null) {
                                    bVar.clear();
                                    cancelAll();
                                    errorAll(qVar);
                                    return;
                                }
                                for (C68300e<TRight> eVar2 : this.lefts.values()) {
                                    eVar2.onNext(poll);
                                }
                            } catch (Throwable th3) {
                                fail(th3, qVar, bVar);
                                return;
                            }
                        } else if (num == LEFT_CLOSE) {
                            C68706c cVar3 = (C68706c) poll;
                            C68300e<TRight> remove = this.lefts.remove(Integer.valueOf(cVar3.index));
                            this.disposables.mo237940b(cVar3);
                            if (remove != null) {
                                remove.onComplete();
                            }
                        } else if (num == RIGHT_CLOSE) {
                            C68706c cVar4 = (C68706c) poll;
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
        public void innerComplete(C68707d dVar) {
            this.disposables.mo237941c(dVar);
            this.active.decrementAndGet();
            drain();
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

        /* access modifiers changed from: package-private */
        public void errorAll(AbstractC69009q<?> qVar) {
            Throwable a = C68981f.m265559a(this.error);
            for (C68300e<TRight> eVar : this.lefts.values()) {
                eVar.onError(a);
            }
            this.lefts.clear();
            this.rights.clear();
            qVar.onError(a);
        }

        @Override // io.reactivex.internal.operators.observable.bi.AbstractC68705b
        public void innerClose(boolean z, C68706c cVar) {
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

        C68704a(AbstractC69009q<? super R> qVar, Function<? super TLeft, ? extends ObservableSource<TLeftEnd>> function, Function<? super TRight, ? extends ObservableSource<TRightEnd>> function2, BiFunction<? super TLeft, ? super Observable<TRight>, ? extends R> biFunction) {
            this.downstream = qVar;
            this.leftEnd = function;
            this.rightEnd = function2;
            this.resultSelector = biFunction;
            this.active = new AtomicInteger(2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.bi$c */
    public static final class C68706c extends AtomicReference<Disposable> implements Disposable, AbstractC69009q<Object> {
        private static final long serialVersionUID = 1883890389173668373L;
        final int index;
        final boolean isLeft;
        final AbstractC68705b parent;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.parent.innerClose(this.isLeft, this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.parent.innerCloseError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(Object obj) {
            if (DisposableHelper.dispose(this)) {
                this.parent.innerClose(this.isLeft, this);
            }
        }

        C68706c(AbstractC68705b bVar, boolean z, int i) {
            this.parent = bVar;
            this.isLeft = z;
            this.index = i;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.bi$d */
    static final class C68707d extends AtomicReference<Disposable> implements Disposable, AbstractC69009q<Object> {
        private static final long serialVersionUID = 1883890389173668373L;
        final boolean isLeft;
        final AbstractC68705b parent;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.parent.innerComplete(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.parent.innerError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(Object obj) {
            this.parent.innerValue(this.isLeft, obj);
        }

        C68707d(AbstractC68705b bVar, boolean z) {
            this.parent = bVar;
            this.isLeft = z;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super R> qVar) {
        C68704a aVar = new C68704a(qVar, this.f172289c, this.f172290d, this.f172291e);
        qVar.onSubscribe(aVar);
        C68707d dVar = new C68707d(aVar, true);
        aVar.disposables.mo237937a(dVar);
        C68707d dVar2 = new C68707d(aVar, false);
        aVar.disposables.mo237937a(dVar2);
        this.f172123a.subscribe(dVar);
        this.f172288b.subscribe(dVar2);
    }

    public bi(ObservableSource<TLeft> observableSource, ObservableSource<? extends TRight> observableSource2, Function<? super TLeft, ? extends ObservableSource<TLeftEnd>> function, Function<? super TRight, ? extends ObservableSource<TRightEnd>> function2, BiFunction<? super TLeft, ? super Observable<TRight>, ? extends R> biFunction) {
        super(observableSource);
        this.f172288b = observableSource2;
        this.f172289c = function;
        this.f172290d = function2;
        this.f172291e = biFunction;
    }
}
