package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.c.b */
public final class C68468b<T> extends Single<T> implements AbstractC69012t<T> {

    /* renamed from: a */
    static final C68469a[] f171836a = new C68469a[0];

    /* renamed from: b */
    static final C68469a[] f171837b = new C68469a[0];

    /* renamed from: c */
    final AbstractC69015w<? extends T> f171838c;

    /* renamed from: d */
    final AtomicInteger f171839d = new AtomicInteger();

    /* renamed from: e */
    final AtomicReference<C68469a<T>[]> f171840e = new AtomicReference<>(f171836a);

    /* renamed from: f */
    T f171841f;

    /* renamed from: g */
    Throwable f171842g;

    @Override // io.reactivex.AbstractC69012t
    public void onSubscribe(Disposable disposable) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.c.b$a */
    public static final class C68469a<T> extends AtomicBoolean implements Disposable {
        private static final long serialVersionUID = 7514387411091976596L;
        final AbstractC69012t<? super T> downstream;
        final C68468b<T> parent;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.parent.mo238186b(this);
            }
        }

        C68469a(AbstractC69012t<? super T> tVar, C68468b<T> bVar) {
            this.downstream = tVar;
            this.parent = bVar;
        }
    }

    public C68468b(AbstractC69015w<? extends T> wVar) {
        this.f171838c = wVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo238185a(C68469a<T> aVar) {
        C68469a<T>[] aVarArr;
        C68469a<T>[] aVarArr2;
        do {
            aVarArr = this.f171840e.get();
            if (aVarArr == f171837b) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C68469a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.f171840e.compareAndSet(aVarArr, aVarArr2));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo238186b(C68469a<T> aVar) {
        C68469a<T>[] aVarArr;
        C68469a<T>[] aVarArr2;
        do {
            aVarArr = this.f171840e.get();
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
                        aVarArr2 = f171836a;
                    } else {
                        C68469a<T>[] aVarArr3 = new C68469a[(length - 1)];
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
        } while (!this.f171840e.compareAndSet(aVarArr, aVarArr2));
    }

    @Override // io.reactivex.AbstractC69012t
    public void onError(Throwable th) {
        this.f171842g = th;
        C68469a<T>[] andSet = this.f171840e.getAndSet(f171837b);
        for (C68469a<T> aVar : andSet) {
            if (!aVar.isDisposed()) {
                aVar.downstream.onError(th);
            }
        }
    }

    @Override // io.reactivex.AbstractC69012t
    public void onSuccess(T t) {
        this.f171841f = t;
        C68469a<T>[] andSet = this.f171840e.getAndSet(f171837b);
        for (C68469a<T> aVar : andSet) {
            if (!aVar.isDisposed()) {
                aVar.downstream.onSuccess(t);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super T> tVar) {
        C68469a<T> aVar = new C68469a<>(tVar, this);
        tVar.onSubscribe(aVar);
        if (mo238185a(aVar)) {
            if (aVar.isDisposed()) {
                mo238186b(aVar);
            }
            if (this.f171839d.getAndIncrement() == 0) {
                this.f171838c.subscribe(this);
                return;
            }
            return;
        }
        Throwable th = this.f171842g;
        if (th != null) {
            tVar.onError(th);
        } else {
            tVar.onSuccess(this.f171841f);
        }
    }
}
