package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.Single;
import io.reactivex.disposables.C68289a;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.reactivex.internal.operators.c.a */
public final class C68430a<T> extends Single<T> {

    /* renamed from: a */
    private final AbstractC69015w<? extends T>[] f171770a;

    /* renamed from: b */
    private final Iterable<? extends AbstractC69015w<? extends T>> f171771b;

    /* renamed from: io.reactivex.internal.operators.c.a$a */
    static final class C68431a<T> extends AtomicBoolean implements AbstractC69012t<T> {
        private static final long serialVersionUID = -1944085461036028108L;
        final AbstractC69012t<? super T> downstream;
        final C68289a set;

        @Override // io.reactivex.AbstractC69012t
        public void onSubscribe(Disposable disposable) {
            this.set.mo237937a(disposable);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onError(Throwable th) {
            if (compareAndSet(false, true)) {
                this.set.dispose();
                this.downstream.onError(th);
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSuccess(T t) {
            if (compareAndSet(false, true)) {
                this.set.dispose();
                this.downstream.onSuccess(t);
            }
        }

        C68431a(AbstractC69012t<? super T> tVar, C68289a aVar) {
            this.downstream = tVar;
            this.set = aVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super T> tVar) {
        int i;
        AbstractC69015w<? extends T>[] wVarArr = this.f171770a;
        if (wVarArr == null) {
            wVarArr = new AbstractC69015w[8];
            try {
                i = 0;
                for (AbstractC69015w<? extends T> wVar : this.f171771b) {
                    if (wVar == null) {
                        EmptyDisposable.error(new NullPointerException("One of the sources is null"), tVar);
                        return;
                    }
                    if (i == wVarArr.length) {
                        AbstractC69015w<? extends T>[] wVarArr2 = new AbstractC69015w[((i >> 2) + i)];
                        System.arraycopy(wVarArr, 0, wVarArr2, 0, i);
                        wVarArr = wVarArr2;
                    }
                    int i2 = i + 1;
                    wVarArr[i] = wVar;
                    i = i2;
                }
            } catch (Throwable th) {
                C68306a.m265071b(th);
                EmptyDisposable.error(th, tVar);
                return;
            }
        } else {
            i = wVarArr.length;
        }
        C68289a aVar = new C68289a();
        C68431a aVar2 = new C68431a(tVar, aVar);
        tVar.onSubscribe(aVar);
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC69015w<? extends T> wVar2 = wVarArr[i3];
            if (aVar2.get()) {
                return;
            }
            if (wVar2 == null) {
                aVar.dispose();
                NullPointerException nullPointerException = new NullPointerException("One of the sources is null");
                if (aVar2.compareAndSet(false, true)) {
                    tVar.onError(nullPointerException);
                    return;
                } else {
                    RxJavaPlugins.onError(nullPointerException);
                    return;
                }
            } else {
                wVar2.subscribe(aVar2);
            }
        }
    }

    public C68430a(AbstractC69015w<? extends T>[] wVarArr, Iterable<? extends AbstractC69015w<? extends T>> iterable) {
        this.f171770a = wVarArr;
        this.f171771b = iterable;
    }
}
