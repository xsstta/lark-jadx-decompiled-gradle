package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.queue.C68926b;
import io.reactivex.p3454b.AbstractC68272b;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableGroupBy<T, K, V> extends AbstractC68651a<T, AbstractC68272b<K, V>> {

    /* renamed from: b */
    final Function<? super T, ? extends K> f172116b;

    /* renamed from: c */
    final Function<? super T, ? extends V> f172117c;

    /* renamed from: d */
    final int f172118d;

    /* renamed from: e */
    final boolean f172119e;

    public static final class GroupByObserver<T, K, V> extends AtomicInteger implements Disposable, AbstractC69009q<T> {
        static final Object NULL_KEY = new Object();
        private static final long serialVersionUID = -3688291656102519502L;
        final int bufferSize;
        final AtomicBoolean cancelled = new AtomicBoolean();
        final boolean delayError;
        final AbstractC69009q<? super AbstractC68272b<K, V>> downstream;
        final Map<Object, C68648a<K, V>> groups;
        final Function<? super T, ? extends K> keySelector;
        Disposable upstream;
        final Function<? super T, ? extends V> valueSelector;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled.get();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.cancelled.compareAndSet(false, true) && decrementAndGet() == 0) {
                this.upstream.dispose();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            ArrayList<C68648a> arrayList = new ArrayList(this.groups.values());
            this.groups.clear();
            for (C68648a aVar : arrayList) {
                aVar.mo238305a();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        public void cancel(K k) {
            if (k == null) {
                k = (K) NULL_KEY;
            }
            this.groups.remove(k);
            if (decrementAndGet() == 0) {
                this.upstream.dispose();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            ArrayList<C68648a> arrayList = new ArrayList(this.groups.values());
            this.groups.clear();
            for (C68648a aVar : arrayList) {
                aVar.mo238307a(th);
            }
            this.downstream.onError(th);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: io.reactivex.internal.operators.observable.ObservableGroupBy$a */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            Object obj;
            try {
                Object apply = this.keySelector.apply(t);
                if (apply != null) {
                    obj = apply;
                } else {
                    obj = NULL_KEY;
                }
                C68648a<K, V> aVar = this.groups.get(obj);
                if (aVar == null) {
                    if (!this.cancelled.get()) {
                        aVar = C68648a.m265356a(apply, this.bufferSize, this, this.delayError);
                        this.groups.put(obj, aVar);
                        getAndIncrement();
                        this.downstream.onNext(aVar);
                    } else {
                        return;
                    }
                }
                try {
                    aVar.mo238306a(C68362b.m265229a(this.valueSelector.apply(t), "The value supplied is null"));
                } catch (Throwable th) {
                    C68306a.m265071b(th);
                    this.upstream.dispose();
                    onError(th);
                }
            } catch (Throwable th2) {
                C68306a.m265071b(th2);
                this.upstream.dispose();
                onError(th2);
            }
        }

        public GroupByObserver(AbstractC69009q<? super AbstractC68272b<K, V>> qVar, Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, int i, boolean z) {
            this.downstream = qVar;
            this.keySelector = function;
            this.valueSelector = function2;
            this.bufferSize = i;
            this.delayError = z;
            this.groups = new ConcurrentHashMap();
            lazySet(1);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.ObservableGroupBy$a */
    public static final class C68648a<K, T> extends AbstractC68272b<K, T> {

        /* renamed from: a */
        final C68649b<T, K> f172120a;

        /* renamed from: a */
        public void mo238305a() {
            this.f172120a.onComplete();
        }

        /* access modifiers changed from: protected */
        @Override // io.reactivex.Observable
        public void subscribeActual(AbstractC69009q<? super T> qVar) {
            this.f172120a.subscribe(qVar);
        }

        /* renamed from: a */
        public void mo238306a(T t) {
            this.f172120a.onNext(t);
        }

        /* renamed from: a */
        public void mo238307a(Throwable th) {
            this.f172120a.onError(th);
        }

        protected C68648a(K k, C68649b<T, K> bVar) {
            super(k);
            this.f172120a = bVar;
        }

        /* renamed from: a */
        public static <T, K> C68648a<K, T> m265356a(K k, int i, GroupByObserver<?, K, T> groupByObserver, boolean z) {
            return new C68648a<>(k, new C68649b(i, groupByObserver, k, z));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.ObservableGroupBy$b */
    public static final class C68649b<T, K> extends AtomicInteger implements ObservableSource<T>, Disposable {
        private static final long serialVersionUID = -3852313036005250360L;
        final AtomicReference<AbstractC69009q<? super T>> actual = new AtomicReference<>();
        final AtomicBoolean cancelled = new AtomicBoolean();
        final boolean delayError;
        volatile boolean done;
        Throwable error;
        final K key;
        final AtomicBoolean once = new AtomicBoolean();
        final GroupByObserver<?, K, T> parent;
        final C68926b<T> queue;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled.get();
        }

        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.cancelled.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.actual.lazySet(null);
                this.parent.cancel(this.key);
            }
        }

        /* access modifiers changed from: package-private */
        public void drain() {
            boolean z;
            if (getAndIncrement() == 0) {
                C68926b<T> bVar = this.queue;
                boolean z2 = this.delayError;
                AbstractC69009q<? super T> qVar = this.actual.get();
                int i = 1;
                while (true) {
                    if (qVar != null) {
                        while (true) {
                            boolean z3 = this.done;
                            T poll = bVar.poll();
                            if (poll == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!checkTerminated(z3, z, qVar, z2)) {
                                if (z) {
                                    break;
                                }
                                qVar.onNext(poll);
                            } else {
                                return;
                            }
                        }
                    }
                    i = addAndGet(-i);
                    if (i != 0) {
                        if (qVar == null) {
                            qVar = this.actual.get();
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        public void onNext(T t) {
            this.queue.offer(t);
            drain();
        }

        @Override // io.reactivex.ObservableSource
        public void subscribe(AbstractC69009q<? super T> qVar) {
            if (this.once.compareAndSet(false, true)) {
                qVar.onSubscribe(this);
                this.actual.lazySet(qVar);
                if (this.cancelled.get()) {
                    this.actual.lazySet(null);
                } else {
                    drain();
                }
            } else {
                EmptyDisposable.error(new IllegalStateException("Only one Observer allowed!"), qVar);
            }
        }

        C68649b(int i, GroupByObserver<?, K, T> groupByObserver, K k, boolean z) {
            this.queue = new C68926b<>(i);
            this.parent = groupByObserver;
            this.key = k;
            this.delayError = z;
        }

        /* access modifiers changed from: package-private */
        public boolean checkTerminated(boolean z, boolean z2, AbstractC69009q<? super T> qVar, boolean z3) {
            if (this.cancelled.get()) {
                this.queue.clear();
                this.parent.cancel(this.key);
                this.actual.lazySet(null);
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!z3) {
                    Throwable th = this.error;
                    if (th != null) {
                        this.queue.clear();
                        this.actual.lazySet(null);
                        qVar.onError(th);
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        this.actual.lazySet(null);
                        qVar.onComplete();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    Throwable th2 = this.error;
                    this.actual.lazySet(null);
                    if (th2 != null) {
                        qVar.onError(th2);
                    } else {
                        qVar.onComplete();
                    }
                    return true;
                }
            }
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super AbstractC68272b<K, V>> qVar) {
        this.f172123a.subscribe(new GroupByObserver(qVar, this.f172116b, this.f172117c, this.f172118d, this.f172119e));
    }

    public ObservableGroupBy(ObservableSource<T> observableSource, Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, int i, boolean z) {
        super(observableSource);
        this.f172116b = function;
        this.f172117c = function2;
        this.f172118d = i;
        this.f172119e = z;
    }
}
