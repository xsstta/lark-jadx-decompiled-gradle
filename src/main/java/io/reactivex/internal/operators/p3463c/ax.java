package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.operators.p3463c.aj;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.c.ax */
public final class ax<T, R> extends Single<R> {

    /* renamed from: a */
    final AbstractC69015w<? extends T>[] f171830a;

    /* renamed from: b */
    final Function<? super Object[], ? extends R> f171831b;

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.c.ax$c */
    public static final class C68466c<T> extends AtomicReference<Disposable> implements AbstractC69012t<T> {
        private static final long serialVersionUID = 3323743579927613702L;
        final int index;
        final C68465b<T, ?> parent;

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onError(Throwable th) {
            this.parent.innerError(th, this.index);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSuccess(T t) {
            this.parent.innerSuccess(t, this.index);
        }

        C68466c(C68465b<T, ?> bVar, int i) {
            this.parent = bVar;
            this.index = i;
        }
    }

    /* renamed from: io.reactivex.internal.operators.c.ax$b */
    static final class C68465b<T, R> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = -5556924161382950569L;
        final AbstractC69012t<? super R> downstream;
        final C68466c<T>[] observers;
        final Object[] values;
        final Function<? super Object[], ? extends R> zipper;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (get() <= 0) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (getAndSet(0) > 0) {
                for (C68466c<T> cVar : this.observers) {
                    cVar.dispose();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void disposeExcept(int i) {
            C68466c<T>[] cVarArr = this.observers;
            int length = cVarArr.length;
            for (int i2 = 0; i2 < i; i2++) {
                cVarArr[i2].dispose();
            }
            while (true) {
                i++;
                if (i < length) {
                    cVarArr[i].dispose();
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void innerError(Throwable th, int i) {
            if (getAndSet(0) > 0) {
                disposeExcept(i);
                this.downstream.onError(th);
                return;
            }
            RxJavaPlugins.onError(th);
        }

        /* JADX DEBUG: Type inference failed for r3v2. Raw type applied. Possible types: ? super java.lang.Object[] */
        /* access modifiers changed from: package-private */
        public void innerSuccess(T t, int i) {
            this.values[i] = t;
            if (decrementAndGet() == 0) {
                try {
                    this.downstream.onSuccess(C68362b.m265229a(this.zipper.apply(this.values), "The zipper returned a null value"));
                } catch (Throwable th) {
                    C68306a.m265071b(th);
                    this.downstream.onError(th);
                }
            }
        }

        C68465b(AbstractC69012t<? super R> tVar, int i, Function<? super Object[], ? extends R> function) {
            super(i);
            this.downstream = tVar;
            this.zipper = function;
            C68466c<T>[] cVarArr = new C68466c[i];
            for (int i2 = 0; i2 < i; i2++) {
                cVarArr[i2] = new C68466c<>(this, i2);
            }
            this.observers = cVarArr;
            this.values = new Object[i];
        }
    }

    /* renamed from: io.reactivex.internal.operators.c.ax$a */
    final class C68464a implements Function<T, R> {
        C68464a() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[], java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // io.reactivex.functions.Function
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public R apply(T r4) throws java.lang.Exception {
            /*
                r3 = this;
                io.reactivex.internal.operators.c.ax r0 = io.reactivex.internal.operators.p3463c.ax.this
                io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r0 = r0.f171831b
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r4
                java.lang.Object r4 = r0.apply(r1)
                java.lang.String r0 = "The zipper returned a null value"
                java.lang.Object r4 = io.reactivex.internal.p3459a.C68362b.m265229a(r4, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.p3463c.ax.C68464a.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super R> tVar) {
        AbstractC69015w<? extends T>[] wVarArr = this.f171830a;
        int length = wVarArr.length;
        if (length == 1) {
            wVarArr[0].subscribe(new aj.C68449a(tVar, new C68464a()));
            return;
        }
        C68465b bVar = new C68465b(tVar, length, this.f171831b);
        tVar.onSubscribe(bVar);
        for (int i = 0; i < length && !bVar.isDisposed(); i++) {
            AbstractC69015w<? extends T> wVar = wVarArr[i];
            if (wVar == null) {
                bVar.innerError(new NullPointerException("One of the sources is null"), i);
                return;
            } else {
                wVar.subscribe(bVar.observers[i]);
            }
        }
    }

    public ax(AbstractC69015w<? extends T>[] wVarArr, Function<? super Object[], ? extends R> function) {
        this.f171830a = wVarArr;
        this.f171831b = function;
    }
}
