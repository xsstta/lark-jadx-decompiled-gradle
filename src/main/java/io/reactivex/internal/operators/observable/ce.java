package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.C68981f;
import io.reactivex.p3454b.AbstractC68271a;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class ce<T> extends AbstractC68271a<T> {

    /* renamed from: a */
    final ObservableSource<T> f172386a;

    /* renamed from: b */
    final AtomicReference<C68748b<T>> f172387b;

    /* renamed from: c */
    final ObservableSource<T> f172388c;

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.ce$a */
    public static final class C68747a<T> extends AtomicReference<Object> implements Disposable {
        private static final long serialVersionUID = -1100270633763673112L;
        final AbstractC69009q<? super T> child;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            Object andSet = getAndSet(this);
            if (andSet != null && andSet != this) {
                ((C68748b) andSet).mo238423b(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (get() == this) {
                return true;
            }
            return false;
        }

        C68747a(AbstractC69009q<? super T> qVar) {
            this.child = qVar;
        }

        /* access modifiers changed from: package-private */
        public void setParent(C68748b<T> bVar) {
            if (!compareAndSet(null, bVar)) {
                bVar.mo238423b(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.ce$b */
    public static final class C68748b<T> implements Disposable, AbstractC69009q<T> {

        /* renamed from: b */
        static final C68747a[] f172389b = new C68747a[0];

        /* renamed from: c */
        static final C68747a[] f172390c = new C68747a[0];

        /* renamed from: a */
        final AtomicReference<C68748b<T>> f172391a;

        /* renamed from: d */
        final AtomicReference<C68747a<T>[]> f172392d = new AtomicReference<>(f172389b);

        /* renamed from: e */
        final AtomicBoolean f172393e;

        /* renamed from: f */
        final AtomicReference<Disposable> f172394f = new AtomicReference<>();

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f172392d.get() == f172390c) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            AtomicReference<C68747a<T>[]> atomicReference = this.f172392d;
            C68747a<T>[] aVarArr = f172390c;
            if (atomicReference.getAndSet(aVarArr) != aVarArr) {
                this.f172391a.compareAndSet(this, null);
                DisposableHelper.dispose(this.f172394f);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.f172391a.compareAndSet(this, null);
            for (C68747a<T> aVar : this.f172392d.getAndSet(f172390c)) {
                aVar.child.onComplete();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f172394f, disposable);
        }

        C68748b(AtomicReference<C68748b<T>> atomicReference) {
            this.f172391a = atomicReference;
            this.f172393e = new AtomicBoolean();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            for (C68747a<T> aVar : this.f172392d.get()) {
                aVar.child.onNext(t);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo238422a(C68747a<T> aVar) {
            C68747a<T>[] aVarArr;
            C68747a<T>[] aVarArr2;
            do {
                aVarArr = this.f172392d.get();
                if (aVarArr == f172390c) {
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new C68747a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!this.f172392d.compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo238423b(C68747a<T> aVar) {
            C68747a<T>[] aVarArr;
            C68747a<T>[] aVarArr2;
            do {
                aVarArr = this.f172392d.get();
                int length = aVarArr.length;
                if (length != 0) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (aVarArr[i2].equals(aVar)) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            aVarArr2 = f172389b;
                        } else {
                            C68747a<T>[] aVarArr3 = new C68747a[(length - 1)];
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
            } while (!this.f172392d.compareAndSet(aVarArr, aVarArr2));
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.f172391a.compareAndSet(this, null);
            C68747a<T>[] andSet = this.f172392d.getAndSet(f172390c);
            if (andSet.length != 0) {
                for (C68747a<T> aVar : andSet) {
                    aVar.child.onError(th);
                }
                return;
            }
            RxJavaPlugins.onError(th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.observable.ce$c */
    public static final class C68749c<T> implements ObservableSource<T> {

        /* renamed from: a */
        private final AtomicReference<C68748b<T>> f172395a;

        C68749c(AtomicReference<C68748b<T>> atomicReference) {
            this.f172395a = atomicReference;
        }

        @Override // io.reactivex.ObservableSource
        public void subscribe(AbstractC69009q<? super T> qVar) {
            C68747a aVar = new C68747a(qVar);
            qVar.onSubscribe(aVar);
            while (true) {
                C68748b<T> bVar = this.f172395a.get();
                if (bVar == null || bVar.isDisposed()) {
                    C68748b<T> bVar2 = new C68748b<>(this.f172395a);
                    if (!this.f172395a.compareAndSet(bVar, bVar2)) {
                        continue;
                    } else {
                        bVar = bVar2;
                    }
                }
                if (bVar.mo238422a(aVar)) {
                    aVar.setParent(bVar);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        this.f172388c.subscribe(qVar);
    }

    /* renamed from: a */
    public static <T> AbstractC68271a<T> m265400a(ObservableSource<T> observableSource) {
        AtomicReference atomicReference = new AtomicReference();
        return RxJavaPlugins.onAssembly((AbstractC68271a) new ce(new C68749c(atomicReference), observableSource, atomicReference));
    }

    @Override // io.reactivex.p3454b.AbstractC68271a
    /* renamed from: a */
    public void mo237900a(Consumer<? super Disposable> consumer) {
        C68748b<T> bVar;
        while (true) {
            bVar = this.f172387b.get();
            if (bVar != null && !bVar.isDisposed()) {
                break;
            }
            C68748b<T> bVar2 = new C68748b<>(this.f172387b);
            if (this.f172387b.compareAndSet(bVar, bVar2)) {
                bVar = bVar2;
                break;
            }
        }
        boolean z = true;
        if (bVar.f172393e.get() || !bVar.f172393e.compareAndSet(false, true)) {
            z = false;
        }
        try {
            consumer.accept(bVar);
            if (z) {
                this.f172386a.subscribe(bVar);
            }
        } catch (Throwable th) {
            C68306a.m265071b(th);
            throw C68981f.m265557a(th);
        }
    }

    private ce(ObservableSource<T> observableSource, ObservableSource<T> observableSource2, AtomicReference<C68748b<T>> atomicReference) {
        this.f172388c = observableSource;
        this.f172386a = observableSource2;
        this.f172387b = atomicReference;
    }
}
