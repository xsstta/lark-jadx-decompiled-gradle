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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ei<T, R> extends Observable<R> {

    /* renamed from: a */
    final ObservableSource<? extends T>[] f172700a;

    /* renamed from: b */
    final Iterable<? extends ObservableSource<? extends T>> f172701b;

    /* renamed from: c */
    final Function<? super Object[], ? extends R> f172702c;

    /* renamed from: d */
    final int f172703d;

    /* renamed from: e */
    final boolean f172704e;

    /* renamed from: io.reactivex.internal.operators.observable.ei$a */
    static final class C68865a<T, R> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = 2983708048395377667L;
        volatile boolean cancelled;
        final boolean delayError;
        final AbstractC69009q<? super R> downstream;
        final C68866b<T, R>[] observers;
        final T[] row;
        final Function<? super Object[], ? extends R> zipper;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        /* access modifiers changed from: package-private */
        public void cancel() {
            clear();
            cancelSources();
        }

        /* access modifiers changed from: package-private */
        public void cancelSources() {
            for (C68866b<T, R> bVar : this.observers) {
                bVar.mo238567a();
            }
        }

        /* access modifiers changed from: package-private */
        public void clear() {
            for (C68866b<T, R> bVar : this.observers) {
                bVar.f172706b.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                cancelSources();
                if (getAndIncrement() == 0) {
                    clear();
                }
            }
        }

        public void drain() {
            Throwable th;
            boolean z;
            if (getAndIncrement() == 0) {
                C68866b<T, R>[] bVarArr = this.observers;
                AbstractC69009q<? super R> qVar = this.downstream;
                T[] tArr = this.row;
                boolean z2 = this.delayError;
                int i = 1;
                while (true) {
                    int i2 = 0;
                    int i3 = 0;
                    for (C68866b<T, R> bVar : bVarArr) {
                        if (tArr[i3] == null) {
                            boolean z3 = bVar.f172707c;
                            T poll = bVar.f172706b.poll();
                            if (poll == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (checkTerminated(z3, z, qVar, z2, bVar)) {
                                return;
                            }
                            if (!z) {
                                tArr[i3] = poll;
                            } else {
                                i2++;
                            }
                        } else if (bVar.f172707c && !z2 && (th = bVar.f172708d) != null) {
                            cancel();
                            qVar.onError(th);
                            return;
                        }
                        i3++;
                    }
                    if (i2 != 0) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        try {
                            qVar.onNext((Object) C68362b.m265229a(this.zipper.apply(tArr.clone()), "The zipper returned a null value"));
                            Arrays.fill(tArr, (Object) null);
                        } catch (Throwable th2) {
                            C68306a.m265071b(th2);
                            cancel();
                            qVar.onError(th2);
                            return;
                        }
                    }
                }
            }
        }

        public void subscribe(ObservableSource<? extends T>[] observableSourceArr, int i) {
            C68866b<T, R>[] bVarArr = this.observers;
            int length = bVarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                bVarArr[i2] = new C68866b<>(this, i);
            }
            lazySet(0);
            this.downstream.onSubscribe(this);
            for (int i3 = 0; i3 < length && !this.cancelled; i3++) {
                observableSourceArr[i3].subscribe(bVarArr[i3]);
            }
        }

        C68865a(AbstractC69009q<? super R> qVar, Function<? super Object[], ? extends R> function, int i, boolean z) {
            this.downstream = qVar;
            this.zipper = function;
            this.observers = new C68866b[i];
            this.row = (T[]) new Object[i];
            this.delayError = z;
        }

        /* access modifiers changed from: package-private */
        public boolean checkTerminated(boolean z, boolean z2, AbstractC69009q<? super R> qVar, boolean z3, C68866b<?, ?> bVar) {
            if (this.cancelled) {
                cancel();
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!z3) {
                    Throwable th = bVar.f172708d;
                    if (th != null) {
                        cancel();
                        qVar.onError(th);
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        cancel();
                        qVar.onComplete();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    Throwable th2 = bVar.f172708d;
                    cancel();
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

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.ei$b */
    public static final class C68866b<T, R> implements AbstractC69009q<T> {

        /* renamed from: a */
        final C68865a<T, R> f172705a;

        /* renamed from: b */
        final C68926b<T> f172706b;

        /* renamed from: c */
        volatile boolean f172707c;

        /* renamed from: d */
        Throwable f172708d;

        /* renamed from: e */
        final AtomicReference<Disposable> f172709e = new AtomicReference<>();

        /* renamed from: a */
        public void mo238567a() {
            DisposableHelper.dispose(this.f172709e);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.f172707c = true;
            this.f172705a.drain();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f172709e, disposable);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.f172708d = th;
            this.f172707c = true;
            this.f172705a.drain();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            this.f172706b.offer(t);
            this.f172705a.drain();
        }

        C68866b(C68865a<T, R> aVar, int i) {
            this.f172705a = aVar;
            this.f172706b = new C68926b<>(i);
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super R> qVar) {
        int i;
        ObservableSource<? extends T>[] observableSourceArr = this.f172700a;
        if (observableSourceArr == null) {
            observableSourceArr = new Observable[8];
            i = 0;
            for (ObservableSource<? extends T> observableSource : this.f172701b) {
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
            new C68865a(qVar, this.f172702c, i, this.f172704e).subscribe(observableSourceArr, this.f172703d);
        }
    }

    public ei(ObservableSource<? extends T>[] observableSourceArr, Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i, boolean z) {
        this.f172700a = observableSourceArr;
        this.f172701b = iterable;
        this.f172702c = function;
        this.f172703d = i;
        this.f172704e = z;
    }
}
