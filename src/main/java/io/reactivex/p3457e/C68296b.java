package io.reactivex.p3457e;

import io.reactivex.AbstractC69009q;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.e.b */
public final class C68296b<T> extends AbstractC68299d<T> {

    /* renamed from: a */
    static final C68297a[] f171612a = new C68297a[0];

    /* renamed from: b */
    static final C68297a[] f171613b = new C68297a[0];

    /* renamed from: c */
    final AtomicReference<C68297a<T>[]> f171614c = new AtomicReference<>(f171613b);

    /* renamed from: d */
    Throwable f171615d;

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.e.b$a */
    public static final class C68297a<T> extends AtomicBoolean implements Disposable {
        private static final long serialVersionUID = 3562861878281475070L;
        final AbstractC69009q<? super T> downstream;
        final C68296b<T> parent;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.parent.mo237954b(this);
            }
        }

        public void onComplete() {
            if (!get()) {
                this.downstream.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (get()) {
                RxJavaPlugins.onError(th);
            } else {
                this.downstream.onError(th);
            }
        }

        public void onNext(T t) {
            if (!get()) {
                this.downstream.onNext(t);
            }
        }

        C68297a(AbstractC69009q<? super T> qVar, C68296b<T> bVar) {
            this.downstream = qVar;
            this.parent = bVar;
        }
    }

    @CheckReturnValue
    /* renamed from: a */
    public static <T> C68296b<T> m265052a() {
        return new C68296b<>();
    }

    C68296b() {
    }

    /* renamed from: b */
    public boolean mo237955b() {
        if (this.f171614c.get().length != 0) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.AbstractC69009q
    public void onComplete() {
        C68297a<T>[] aVarArr = this.f171614c.get();
        C68297a<T>[] aVarArr2 = f171612a;
        if (aVarArr != aVarArr2) {
            for (C68297a<T> aVar : this.f171614c.getAndSet(aVarArr2)) {
                aVar.onComplete();
            }
        }
    }

    @Override // io.reactivex.AbstractC69009q
    public void onSubscribe(Disposable disposable) {
        if (this.f171614c.get() == f171612a) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.AbstractC69009q
    public void onNext(T t) {
        C68362b.m265229a((Object) t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (C68297a<T> aVar : this.f171614c.get()) {
            aVar.onNext(t);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo237953a(C68297a<T> aVar) {
        C68297a<T>[] aVarArr;
        C68297a<T>[] aVarArr2;
        do {
            aVarArr = this.f171614c.get();
            if (aVarArr == f171612a) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C68297a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.f171614c.compareAndSet(aVarArr, aVarArr2));
        return true;
    }

    @Override // io.reactivex.AbstractC69009q
    public void onError(Throwable th) {
        C68362b.m265229a((Object) th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        C68297a<T>[] aVarArr = this.f171614c.get();
        C68297a<T>[] aVarArr2 = f171612a;
        if (aVarArr == aVarArr2) {
            RxJavaPlugins.onError(th);
            return;
        }
        this.f171615d = th;
        for (C68297a<T> aVar : this.f171614c.getAndSet(aVarArr2)) {
            aVar.onError(th);
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        C68297a<T> aVar = new C68297a<>(qVar, this);
        qVar.onSubscribe(aVar);
        if (!mo237953a(aVar)) {
            Throwable th = this.f171615d;
            if (th != null) {
                qVar.onError(th);
            } else {
                qVar.onComplete();
            }
        } else if (aVar.isDisposed()) {
            mo237954b(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo237954b(C68297a<T> aVar) {
        C68297a<T>[] aVarArr;
        C68297a<T>[] aVarArr2;
        do {
            aVarArr = this.f171614c.get();
            if (aVarArr != f171612a && aVarArr != f171613b) {
                int length = aVarArr.length;
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
                        aVarArr2 = f171613b;
                    } else {
                        C68297a<T>[] aVarArr3 = new C68297a[(length - 1)];
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
        } while (!this.f171614c.compareAndSet(aVarArr, aVarArr2));
    }
}
