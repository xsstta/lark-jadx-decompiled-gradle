package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.AbstractC69012t;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.AbstractC68311c;
import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.internal.p3460b.AbstractC68367d;
import io.reactivex.internal.queue.C68926b;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

public final class cy<T> extends Single<Boolean> implements AbstractC68367d<Boolean> {

    /* renamed from: a */
    final ObservableSource<? extends T> f172479a;

    /* renamed from: b */
    final ObservableSource<? extends T> f172480b;

    /* renamed from: c */
    final AbstractC68311c<? super T, ? super T> f172481c;

    /* renamed from: d */
    final int f172482d;

    /* renamed from: io.reactivex.internal.operators.observable.cy$a */
    static final class C68793a<T> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = -6178010334400373240L;
        volatile boolean cancelled;
        final AbstractC68311c<? super T, ? super T> comparer;
        final AbstractC69012t<? super Boolean> downstream;
        final ObservableSource<? extends T> first;
        final C68794b<T>[] observers;
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
            C68794b<T>[] bVarArr = this.observers;
            this.first.subscribe(bVarArr[0]);
            this.second.subscribe(bVarArr[1]);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.resources.dispose();
                if (getAndIncrement() == 0) {
                    C68794b<T>[] bVarArr = this.observers;
                    bVarArr[0].f172484b.clear();
                    bVarArr[1].f172484b.clear();
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
                C68794b<T>[] bVarArr = this.observers;
                C68794b<T> bVar = bVarArr[0];
                C68926b<T> bVar2 = bVar.f172484b;
                C68794b<T> bVar3 = bVarArr[1];
                C68926b<T> bVar4 = bVar3.f172484b;
                int i = 1;
                while (!this.cancelled) {
                    boolean z3 = bVar.f172486d;
                    if (!z3 || (th2 = bVar.f172487e) == null) {
                        boolean z4 = bVar3.f172486d;
                        if (!z4 || (th = bVar3.f172487e) == null) {
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
                                this.downstream.onSuccess(true);
                                return;
                            } else if (!z3 || !z4 || z == z2) {
                                if (!z && !z2) {
                                    try {
                                        if (!this.comparer.mo238039a(this.v1, t)) {
                                            cancel(bVar2, bVar4);
                                            this.downstream.onSuccess(false);
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
                                this.downstream.onSuccess(false);
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

        C68793a(AbstractC69012t<? super Boolean> tVar, int i, ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, AbstractC68311c<? super T, ? super T> cVar) {
            this.downstream = tVar;
            this.first = observableSource;
            this.second = observableSource2;
            this.comparer = cVar;
            C68794b<T>[] bVarArr = new C68794b[2];
            this.observers = bVarArr;
            bVarArr[0] = new C68794b<>(this, 0, i);
            bVarArr[1] = new C68794b<>(this, 1, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.cy$b */
    public static final class C68794b<T> implements AbstractC69009q<T> {

        /* renamed from: a */
        final C68793a<T> f172483a;

        /* renamed from: b */
        final C68926b<T> f172484b;

        /* renamed from: c */
        final int f172485c;

        /* renamed from: d */
        volatile boolean f172486d;

        /* renamed from: e */
        Throwable f172487e;

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.f172486d = true;
            this.f172483a.drain();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            this.f172483a.setDisposable(disposable, this.f172485c);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.f172487e = th;
            this.f172486d = true;
            this.f172483a.drain();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            this.f172484b.offer(t);
            this.f172483a.drain();
        }

        C68794b(C68793a<T> aVar, int i, int i2) {
            this.f172483a = aVar;
            this.f172485c = i;
            this.f172484b = new C68926b<>(i2);
        }
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68367d
    public Observable<Boolean> cE_() {
        return RxJavaPlugins.onAssembly(new cx(this.f172479a, this.f172480b, this.f172481c, this.f172482d));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super Boolean> tVar) {
        C68793a aVar = new C68793a(tVar, this.f172482d, this.f172479a, this.f172480b, this.f172481c);
        tVar.onSubscribe(aVar);
        aVar.subscribe();
    }

    public cy(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, AbstractC68311c<? super T, ? super T> cVar, int i) {
        this.f172479a = observableSource;
        this.f172480b = observableSource2;
        this.f172481c = cVar;
        this.f172482d = i;
    }
}
