package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.queue.C68926b;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.observable.t */
public final class C68906t<T, R> extends Observable<R> {

    /* renamed from: a */
    final ObservableSource<? extends T>[] f172838a;

    /* renamed from: b */
    final Iterable<? extends ObservableSource<? extends T>> f172839b;

    /* renamed from: c */
    final Function<? super Object[], ? extends R> f172840c;

    /* renamed from: d */
    final int f172841d;

    /* renamed from: e */
    final boolean f172842e;

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.t$a */
    public static final class C68907a<T, R> extends AtomicReference<Disposable> implements AbstractC69009q<T> {
        private static final long serialVersionUID = -4823716997131257941L;
        final int index;
        final C68908b<T, R> parent;

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.parent.innerComplete(this.index);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.parent.innerError(this.index, th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            this.parent.innerNext(this.index, t);
        }

        C68907a(C68908b<T, R> bVar, int i) {
            this.parent = bVar;
            this.index = i;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.t$b */
    static final class C68908b<T, R> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = 8567835998786448817L;
        int active;
        volatile boolean cancelled;
        final Function<? super Object[], ? extends R> combiner;
        int complete;
        final boolean delayError;
        volatile boolean done;
        final AbstractC69009q<? super R> downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        Object[] latest;
        final C68907a<T, R>[] observers;
        final C68926b<Object[]> queue;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        /* access modifiers changed from: package-private */
        public void cancelSources() {
            for (C68907a<T, R> aVar : this.observers) {
                aVar.dispose();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                cancelSources();
                if (getAndIncrement() == 0) {
                    clear(this.queue);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void drain() {
            boolean z;
            if (getAndIncrement() == 0) {
                C68926b<Object[]> bVar = this.queue;
                AbstractC69009q<? super R> qVar = this.downstream;
                boolean z2 = this.delayError;
                int i = 1;
                while (!this.cancelled) {
                    if (z2 || this.errors.get() == null) {
                        boolean z3 = this.done;
                        Object[] poll = bVar.poll();
                        if (poll == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z3 && z) {
                            clear(bVar);
                            Throwable terminate = this.errors.terminate();
                            if (terminate == null) {
                                qVar.onComplete();
                                return;
                            } else {
                                qVar.onError(terminate);
                                return;
                            }
                        } else if (z) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else {
                            try {
                                qVar.onNext((Object) C68362b.m265229a(this.combiner.apply(poll), "The combiner returned a null value"));
                            } catch (Throwable th) {
                                C68306a.m265071b(th);
                                this.errors.addThrowable(th);
                                cancelSources();
                                clear(bVar);
                                qVar.onError(this.errors.terminate());
                                return;
                            }
                        }
                    } else {
                        cancelSources();
                        clear(bVar);
                        qVar.onError(this.errors.terminate());
                        return;
                    }
                }
                clear(bVar);
            }
        }

        /* access modifiers changed from: package-private */
        public void clear(C68926b<?> bVar) {
            synchronized (this) {
                this.latest = null;
            }
            bVar.clear();
        }

        public void subscribe(ObservableSource<? extends T>[] observableSourceArr) {
            C68907a<T, R>[] aVarArr = this.observers;
            int length = aVarArr.length;
            this.downstream.onSubscribe(this);
            for (int i = 0; i < length && !this.done && !this.cancelled; i++) {
                observableSourceArr[i].subscribe(aVarArr[i]);
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
            if (r2 == r0.length) goto L_0x0019;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x001c, code lost:
            if (r4 == false) goto L_0x0021;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x001e, code lost:
            cancelSources();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
            drain();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0024, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void innerComplete(int r4) {
            /*
                r3 = this;
                monitor-enter(r3)
                java.lang.Object[] r0 = r3.latest     // Catch:{ all -> 0x0025 }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r3)     // Catch:{ all -> 0x0025 }
                return
            L_0x0007:
                r4 = r0[r4]     // Catch:{ all -> 0x0025 }
                r1 = 1
                if (r4 != 0) goto L_0x000e
                r4 = 1
                goto L_0x000f
            L_0x000e:
                r4 = 0
            L_0x000f:
                if (r4 != 0) goto L_0x0019
                int r2 = r3.complete     // Catch:{ all -> 0x0025 }
                int r2 = r2 + r1
                r3.complete = r2     // Catch:{ all -> 0x0025 }
                int r0 = r0.length     // Catch:{ all -> 0x0025 }
                if (r2 != r0) goto L_0x001b
            L_0x0019:
                r3.done = r1     // Catch:{ all -> 0x0025 }
            L_0x001b:
                monitor-exit(r3)     // Catch:{ all -> 0x0025 }
                if (r4 == 0) goto L_0x0021
                r3.cancelSources()
            L_0x0021:
                r3.drain()
                return
            L_0x0025:
                r4 = move-exception
                monitor-exit(r3)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.C68906t.C68908b.innerComplete(int):void");
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0023, code lost:
            if (r1 == r4.length) goto L_0x0025;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0028, code lost:
            r0 = r3;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void innerError(int r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                io.reactivex.internal.util.AtomicThrowable r0 = r2.errors
                boolean r0 = r0.addThrowable(r4)
                if (r0 == 0) goto L_0x0036
                boolean r4 = r2.delayError
                r0 = 1
                if (r4 == 0) goto L_0x002d
                monitor-enter(r2)
                java.lang.Object[] r4 = r2.latest     // Catch:{ all -> 0x002a }
                if (r4 != 0) goto L_0x0014
                monitor-exit(r2)     // Catch:{ all -> 0x002a }
                return
            L_0x0014:
                r3 = r4[r3]     // Catch:{ all -> 0x002a }
                if (r3 != 0) goto L_0x001a
                r3 = 1
                goto L_0x001b
            L_0x001a:
                r3 = 0
            L_0x001b:
                if (r3 != 0) goto L_0x0025
                int r1 = r2.complete     // Catch:{ all -> 0x002a }
                int r1 = r1 + r0
                r2.complete = r1     // Catch:{ all -> 0x002a }
                int r4 = r4.length     // Catch:{ all -> 0x002a }
                if (r1 != r4) goto L_0x0027
            L_0x0025:
                r2.done = r0     // Catch:{ all -> 0x002a }
            L_0x0027:
                monitor-exit(r2)     // Catch:{ all -> 0x002a }
                r0 = r3
                goto L_0x002d
            L_0x002a:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x002a }
                throw r3
            L_0x002d:
                if (r0 == 0) goto L_0x0032
                r2.cancelSources()
            L_0x0032:
                r2.drain()
                goto L_0x0039
            L_0x0036:
                io.reactivex.plugins.RxJavaPlugins.onError(r4)
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.C68906t.C68908b.innerError(int, java.lang.Throwable):void");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v5, resolved type: io.reactivex.internal.queue.b<java.lang.Object[]> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
            if (r4 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
            drain();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void innerNext(int r4, T r5) {
            /*
                r3 = this;
                monitor-enter(r3)
                java.lang.Object[] r0 = r3.latest     // Catch:{ all -> 0x0029 }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r3)     // Catch:{ all -> 0x0029 }
                return
            L_0x0007:
                r1 = r0[r4]     // Catch:{ all -> 0x0029 }
                int r2 = r3.active     // Catch:{ all -> 0x0029 }
                if (r1 != 0) goto L_0x0011
                int r2 = r2 + 1
                r3.active = r2     // Catch:{ all -> 0x0029 }
            L_0x0011:
                r0[r4] = r5     // Catch:{ all -> 0x0029 }
                int r4 = r0.length     // Catch:{ all -> 0x0029 }
                if (r2 != r4) goto L_0x0021
                io.reactivex.internal.queue.b<java.lang.Object[]> r4 = r3.queue     // Catch:{ all -> 0x0029 }
                java.lang.Object r5 = r0.clone()     // Catch:{ all -> 0x0029 }
                r4.offer(r5)     // Catch:{ all -> 0x0029 }
                r4 = 1
                goto L_0x0022
            L_0x0021:
                r4 = 0
            L_0x0022:
                monitor-exit(r3)     // Catch:{ all -> 0x0029 }
                if (r4 == 0) goto L_0x0028
                r3.drain()
            L_0x0028:
                return
            L_0x0029:
                r4 = move-exception
                monitor-exit(r3)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.C68906t.C68908b.innerNext(int, java.lang.Object):void");
        }

        C68908b(AbstractC69009q<? super R> qVar, Function<? super Object[], ? extends R> function, int i, int i2, boolean z) {
            this.downstream = qVar;
            this.combiner = function;
            this.delayError = z;
            this.latest = new Object[i];
            C68907a<T, R>[] aVarArr = new C68907a[i];
            for (int i3 = 0; i3 < i; i3++) {
                aVarArr[i3] = new C68907a<>(this, i3);
            }
            this.observers = aVarArr;
            this.queue = new C68926b<>(i2);
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super R> qVar) {
        int i;
        ObservableSource<? extends T>[] observableSourceArr = this.f172838a;
        if (observableSourceArr == null) {
            observableSourceArr = new Observable[8];
            i = 0;
            for (ObservableSource<? extends T> observableSource : this.f172839b) {
                if (i == observableSourceArr.length) {
                    ObservableSource<? extends T>[] observableSourceArr2 = new ObservableSource[((i >> 2) + i)];
                    System.arraycopy(observableSourceArr, 0, observableSourceArr2, 0, i);
                    observableSourceArr = observableSourceArr2;
                }
                observableSourceArr[i] = observableSource;
                i++;
            }
        } else {
            i = observableSourceArr.length;
        }
        if (i == 0) {
            EmptyDisposable.complete(qVar);
        } else {
            new C68908b(qVar, this.f172840c, i, this.f172841d, this.f172842e).subscribe(observableSourceArr);
        }
    }

    public C68906t(ObservableSource<? extends T>[] observableSourceArr, Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i, boolean z) {
        this.f172838a = observableSourceArr;
        this.f172839b = iterable;
        this.f172840c = function;
        this.f172841d = i;
        this.f172842e = z;
    }
}
