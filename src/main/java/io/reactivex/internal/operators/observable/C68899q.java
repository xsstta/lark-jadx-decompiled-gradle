package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.observable.q */
public final class C68899q<T> extends AbstractC68651a<T, T> implements AbstractC69009q<T> {

    /* renamed from: e */
    static final C68900a[] f172810e = new C68900a[0];

    /* renamed from: f */
    static final C68900a[] f172811f = new C68900a[0];

    /* renamed from: b */
    final AtomicBoolean f172812b = new AtomicBoolean();

    /* renamed from: c */
    final int f172813c;

    /* renamed from: d */
    final AtomicReference<C68900a<T>[]> f172814d;

    /* renamed from: g */
    volatile long f172815g;

    /* renamed from: h */
    final C68901b<T> f172816h;

    /* renamed from: i */
    C68901b<T> f172817i;

    /* renamed from: j */
    int f172818j;

    /* renamed from: k */
    Throwable f172819k;

    /* renamed from: l */
    volatile boolean f172820l;

    @Override // io.reactivex.AbstractC69009q
    public void onSubscribe(Disposable disposable) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.q$a */
    public static final class C68900a<T> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = 6770240836423125754L;
        volatile boolean disposed;
        final AbstractC69009q<? super T> downstream;
        long index;
        C68901b<T> node;
        int offset;
        final C68899q<T> parent;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.disposed) {
                this.disposed = true;
                this.parent.mo238593b(this);
            }
        }

        C68900a(AbstractC69009q<? super T> qVar, C68899q<T> qVar2) {
            this.downstream = qVar;
            this.parent = qVar2;
            this.node = qVar2.f172816h;
        }
    }

    @Override // io.reactivex.AbstractC69009q
    public void onComplete() {
        this.f172820l = true;
        for (C68900a<T> aVar : this.f172814d.getAndSet(f172811f)) {
            mo238594c(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.q$b */
    public static final class C68901b<T> {

        /* renamed from: a */
        final T[] f172821a;

        /* renamed from: b */
        volatile C68901b<T> f172822b;

        C68901b(int i) {
            this.f172821a = (T[]) new Object[i];
        }
    }

    @Override // io.reactivex.AbstractC69009q
    public void onError(Throwable th) {
        this.f172819k = th;
        this.f172820l = true;
        for (C68900a<T> aVar : this.f172814d.getAndSet(f172811f)) {
            mo238594c(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo238592a(C68900a<T> aVar) {
        C68900a<T>[] aVarArr;
        C68900a<T>[] aVarArr2;
        do {
            aVarArr = this.f172814d.get();
            if (aVarArr != f172811f) {
                int length = aVarArr.length;
                aVarArr2 = new C68900a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } else {
                return;
            }
        } while (!this.f172814d.compareAndSet(aVarArr, aVarArr2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo238593b(C68900a<T> aVar) {
        C68900a<T>[] aVarArr;
        C68900a<T>[] aVarArr2;
        do {
            aVarArr = this.f172814d.get();
            int length = aVarArr.length;
            if (length != 0) {
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (aVarArr[i2] == aVar) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        aVarArr2 = f172810e;
                    } else {
                        C68900a<T>[] aVarArr3 = new C68900a[(length - 1)];
                        System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                        System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                        aVarArr2 = aVarArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.f172814d.compareAndSet(aVarArr, aVarArr2));
    }

    @Override // io.reactivex.AbstractC69009q
    public void onNext(T t) {
        int i = this.f172818j;
        if (i == this.f172813c) {
            C68901b<T> bVar = new C68901b<>(i);
            bVar.f172821a[0] = t;
            this.f172818j = 1;
            this.f172817i.f172822b = bVar;
            this.f172817i = bVar;
        } else {
            this.f172817i.f172821a[i] = t;
            this.f172818j = i + 1;
        }
        this.f172815g++;
        for (C68900a<T> aVar : this.f172814d.get()) {
            mo238594c(aVar);
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        C68900a<T> aVar = new C68900a<>(qVar, this);
        qVar.onSubscribe(aVar);
        mo238592a(aVar);
        if (this.f172812b.get() || !this.f172812b.compareAndSet(false, true)) {
            mo238594c(aVar);
        } else {
            this.f172123a.subscribe(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo238594c(C68900a<T> aVar) {
        boolean z;
        if (aVar.getAndIncrement() == 0) {
            long j = aVar.index;
            int i = aVar.offset;
            C68901b<T> bVar = aVar.node;
            AbstractC69009q<? super T> qVar = aVar.downstream;
            int i2 = this.f172813c;
            int i3 = 1;
            while (!aVar.disposed) {
                boolean z2 = this.f172820l;
                if (this.f172815g == j) {
                    z = true;
                } else {
                    z = false;
                }
                if (z2 && z) {
                    aVar.node = null;
                    Throwable th = this.f172819k;
                    if (th != null) {
                        qVar.onError(th);
                        return;
                    } else {
                        qVar.onComplete();
                        return;
                    }
                } else if (!z) {
                    if (i == i2) {
                        bVar = bVar.f172822b;
                        i = 0;
                    }
                    qVar.onNext(bVar.f172821a[i]);
                    i++;
                    j++;
                } else {
                    aVar.index = j;
                    aVar.offset = i;
                    aVar.node = bVar;
                    i3 = aVar.addAndGet(-i3);
                    if (i3 == 0) {
                        return;
                    }
                }
            }
            aVar.node = null;
        }
    }

    public C68899q(Observable<T> observable, int i) {
        super(observable);
        this.f172813c = i;
        C68901b<T> bVar = new C68901b<>(i);
        this.f172816h = bVar;
        this.f172817i = bVar;
        this.f172814d = new AtomicReference<>(f172810e);
    }
}
