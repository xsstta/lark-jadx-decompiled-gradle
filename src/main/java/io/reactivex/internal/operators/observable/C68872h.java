package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.observable.h */
public final class C68872h<T> extends Observable<T> {

    /* renamed from: a */
    final ObservableSource<? extends T>[] f172729a;

    /* renamed from: b */
    final Iterable<? extends ObservableSource<? extends T>> f172730b;

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.h$b */
    public static final class C68874b<T> extends AtomicReference<Disposable> implements AbstractC69009q<T> {
        private static final long serialVersionUID = -1185974347409665484L;
        final AbstractC69009q<? super T> downstream;
        final int index;
        final C68873a<T> parent;
        boolean won;

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (this.won) {
                this.downstream.onComplete();
            } else if (this.parent.mo238570a(this.index)) {
                this.won = true;
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (this.won) {
                this.downstream.onError(th);
            } else if (this.parent.mo238570a(this.index)) {
                this.won = true;
                this.downstream.onError(th);
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (this.won) {
                this.downstream.onNext(t);
            } else if (this.parent.mo238570a(this.index)) {
                this.won = true;
                this.downstream.onNext(t);
            } else {
                ((Disposable) get()).dispose();
            }
        }

        C68874b(C68873a<T> aVar, int i, AbstractC69009q<? super T> qVar) {
            this.parent = aVar;
            this.index = i;
            this.downstream = qVar;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.h$a */
    static final class C68873a<T> implements Disposable {

        /* renamed from: a */
        final AbstractC69009q<? super T> f172731a;

        /* renamed from: b */
        final C68874b<T>[] f172732b;

        /* renamed from: c */
        final AtomicInteger f172733c = new AtomicInteger();

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f172733c.get() == -1) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.f172733c.get() != -1) {
                this.f172733c.lazySet(-1);
                for (C68874b<T> bVar : this.f172732b) {
                    bVar.dispose();
                }
            }
        }

        /* renamed from: a */
        public void mo238569a(ObservableSource<? extends T>[] observableSourceArr) {
            C68874b<T>[] bVarArr = this.f172732b;
            int length = bVarArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                bVarArr[i] = new C68874b<>(this, i2, this.f172731a);
                i = i2;
            }
            this.f172733c.lazySet(0);
            this.f172731a.onSubscribe(this);
            for (int i3 = 0; i3 < length && this.f172733c.get() == 0; i3++) {
                observableSourceArr[i3].subscribe(bVarArr[i3]);
            }
        }

        /* renamed from: a */
        public boolean mo238570a(int i) {
            int i2 = this.f172733c.get();
            int i3 = 0;
            if (i2 == 0) {
                if (!this.f172733c.compareAndSet(0, i)) {
                    return false;
                }
                C68874b<T>[] bVarArr = this.f172732b;
                int length = bVarArr.length;
                while (i3 < length) {
                    int i4 = i3 + 1;
                    if (i4 != i) {
                        bVarArr[i3].dispose();
                    }
                    i3 = i4;
                }
                return true;
            } else if (i2 == i) {
                return true;
            } else {
                return false;
            }
        }

        C68873a(AbstractC69009q<? super T> qVar, int i) {
            this.f172731a = qVar;
            this.f172732b = new C68874b[i];
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        int i;
        ObservableSource<? extends T>[] observableSourceArr = this.f172729a;
        if (observableSourceArr == null) {
            observableSourceArr = new Observable[8];
            try {
                i = 0;
                for (ObservableSource<? extends T> observableSource : this.f172730b) {
                    if (observableSource == null) {
                        EmptyDisposable.error(new NullPointerException("One of the sources is null"), qVar);
                        return;
                    }
                    if (i == observableSourceArr.length) {
                        ObservableSource<? extends T>[] observableSourceArr2 = new ObservableSource[((i >> 2) + i)];
                        System.arraycopy(observableSourceArr, 0, observableSourceArr2, 0, i);
                        observableSourceArr = observableSourceArr2;
                    }
                    int i2 = i + 1;
                    observableSourceArr[i] = observableSource;
                    i = i2;
                }
            } catch (Throwable th) {
                C68306a.m265071b(th);
                EmptyDisposable.error(th, qVar);
                return;
            }
        } else {
            i = observableSourceArr.length;
        }
        if (i == 0) {
            EmptyDisposable.complete(qVar);
        } else if (i == 1) {
            observableSourceArr[0].subscribe(qVar);
        } else {
            new C68873a(qVar, i).mo238569a(observableSourceArr);
        }
    }

    public C68872h(ObservableSource<? extends T>[] observableSourceArr, Iterable<? extends ObservableSource<? extends T>> iterable) {
        this.f172729a = observableSourceArr;
        this.f172730b = iterable;
    }
}
