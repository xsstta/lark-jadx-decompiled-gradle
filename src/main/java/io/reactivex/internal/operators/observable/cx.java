package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.AbstractC68311c;
import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.internal.queue.C68926b;
import java.util.concurrent.atomic.AtomicInteger;

public final class cx<T> extends Observable<Boolean> {

    /* renamed from: a */
    final ObservableSource<? extends T> f172470a;

    /* renamed from: b */
    final ObservableSource<? extends T> f172471b;

    /* renamed from: c */
    final AbstractC68311c<? super T, ? super T> f172472c;

    /* renamed from: d */
    final int f172473d;

    /* renamed from: io.reactivex.internal.operators.observable.cx$a */
    static final class C68791a<T> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = -6178010334400373240L;
        volatile boolean cancelled;
        final AbstractC68311c<? super T, ? super T> comparer;
        final AbstractC69009q<? super Boolean> downstream;
        final ObservableSource<? extends T> first;
        final C68792b<T>[] observers;
        final ArrayCompositeDisposable resources = new ArrayCompositeDisposable(2);
        final ObservableSource<? extends T> second;
        T v1;
        T v2;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        /* access modifiers changed from: package-private */
        public void subscribe() {
            C68792b<T>[] bVarArr = this.observers;
            this.first.subscribe(bVarArr[0]);
            this.second.subscribe(bVarArr[1]);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.resources.dispose();
                if (getAndIncrement() == 0) {
                    C68792b<T>[] bVarArr = this.observers;
                    bVarArr[0].f172475b.clear();
                    bVarArr[1].f172475b.clear();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void drain() {
            boolean z;
            boolean z2;
            Throwable th;
            Throwable th2;
            if (getAndIncrement() == 0) {
                C68792b<T>[] bVarArr = this.observers;
                C68792b<T> bVar = bVarArr[0];
                C68926b<T> bVar2 = bVar.f172475b;
                C68792b<T> bVar3 = bVarArr[1];
                C68926b<T> bVar4 = bVar3.f172475b;
                int i = 1;
                while (!this.cancelled) {
                    boolean z3 = bVar.f172477d;
                    if (!z3 || (th2 = bVar.f172478e) == null) {
                        boolean z4 = bVar3.f172477d;
                        if (!z4 || (th = bVar3.f172478e) == null) {
                            if (this.v1 == null) {
                                this.v1 = bVar2.poll();
                            }
                            if (this.v1 == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (this.v2 == null) {
                                this.v2 = bVar4.poll();
                            }
                            T t = this.v2;
                            if (t == null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z3 && z4 && z && z2) {
                                this.downstream.onNext(true);
                                this.downstream.onComplete();
                                return;
                            } else if (!z3 || !z4 || z == z2) {
                                if (!z && !z2) {
                                    try {
                                        if (!this.comparer.mo238039a(this.v1, t)) {
                                            cancel(bVar2, bVar4);
                                            this.downstream.onNext(false);
                                            this.downstream.onComplete();
                                            return;
                                        }
                                        this.v1 = null;
                                        this.v2 = null;
                                    } catch (Throwable th3) {
                                        C68306a.m265071b(th3);
                                        cancel(bVar2, bVar4);
                                        this.downstream.onError(th3);
                                        return;
                                    }
                                }
                                if ((z || z2) && (i = addAndGet(-i)) == 0) {
                                    return;
                                }
                            } else {
                                cancel(bVar2, bVar4);
                                this.downstream.onNext(false);
                                this.downstream.onComplete();
                                return;
                            }
                        } else {
                            cancel(bVar2, bVar4);
                            this.downstream.onError(th);
                            return;
                        }
                    } else {
                        cancel(bVar2, bVar4);
                        this.downstream.onError(th2);
                        return;
                    }
                }
                bVar2.clear();
                bVar4.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean setDisposable(Disposable disposable, int i) {
            return this.resources.setResource(i, disposable);
        }

        /* access modifiers changed from: package-private */
        public void cancel(C68926b<T> bVar, C68926b<T> bVar2) {
            this.cancelled = true;
            bVar.clear();
            bVar2.clear();
        }

        C68791a(AbstractC69009q<? super Boolean> qVar, int i, ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, AbstractC68311c<? super T, ? super T> cVar) {
            this.downstream = qVar;
            this.first = observableSource;
            this.second = observableSource2;
            this.comparer = cVar;
            C68792b<T>[] bVarArr = new C68792b[2];
            this.observers = bVarArr;
            bVarArr[0] = new C68792b<>(this, 0, i);
            bVarArr[1] = new C68792b<>(this, 1, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.cx$b */
    public static final class C68792b<T> implements AbstractC69009q<T> {

        /* renamed from: a */
        final C68791a<T> f172474a;

        /* renamed from: b */
        final C68926b<T> f172475b;

        /* renamed from: c */
        final int f172476c;

        /* renamed from: d */
        volatile boolean f172477d;

        /* renamed from: e */
        Throwable f172478e;

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.f172477d = true;
            this.f172474a.drain();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            this.f172474a.setDisposable(disposable, this.f172476c);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.f172478e = th;
            this.f172477d = true;
            this.f172474a.drain();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            this.f172475b.offer(t);
            this.f172474a.drain();
        }

        C68792b(C68791a<T> aVar, int i, int i2) {
            this.f172474a = aVar;
            this.f172476c = i;
            this.f172475b = new C68926b<>(i2);
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super Boolean> qVar) {
        C68791a aVar = new C68791a(qVar, this.f172473d, this.f172470a, this.f172471b, this.f172472c);
        qVar.onSubscribe(aVar);
        aVar.subscribe();
    }

    public cx(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, AbstractC68311c<? super T, ? super T> cVar, int i) {
        this.f172470a = observableSource;
        this.f172471b = observableSource2;
        this.f172472c = cVar;
        this.f172473d = i;
    }
}
