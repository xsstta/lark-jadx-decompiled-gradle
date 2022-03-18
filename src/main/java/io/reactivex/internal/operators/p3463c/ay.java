package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.Single;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.operators.p3463c.aj;
import io.reactivex.internal.operators.p3463c.ax;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: io.reactivex.internal.operators.c.ay */
public final class ay<T, R> extends Single<R> {

    /* renamed from: a */
    final Iterable<? extends AbstractC69015w<? extends T>> f171833a;

    /* renamed from: b */
    final Function<? super Object[], ? extends R> f171834b;

    /* renamed from: io.reactivex.internal.operators.c.ay$a */
    final class C68467a implements Function<T, R> {
        C68467a() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[], java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // io.reactivex.functions.Function
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public R apply(T r4) throws java.lang.Exception {
            /*
                r3 = this;
                io.reactivex.internal.operators.c.ay r0 = io.reactivex.internal.operators.p3463c.ay.this
                io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r0 = r0.f171834b
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r4
                java.lang.Object r4 = r0.apply(r1)
                java.lang.String r0 = "The zipper returned a null value"
                java.lang.Object r4 = io.reactivex.internal.p3459a.C68362b.m265229a(r4, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.p3463c.ay.C68467a.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super R> tVar) {
        AbstractC69015w[] wVarArr = new AbstractC69015w[8];
        try {
            Iterator<? extends AbstractC69015w<? extends T>> it = this.f171833a.iterator();
            int i = 0;
            while (it.hasNext()) {
                AbstractC69015w wVar = (AbstractC69015w) it.next();
                if (wVar == null) {
                    EmptyDisposable.error(new NullPointerException("One of the sources is null"), tVar);
                    return;
                }
                if (i == wVarArr.length) {
                    wVarArr = (AbstractC69015w[]) Arrays.copyOf(wVarArr, (i >> 2) + i);
                }
                int i2 = i + 1;
                wVarArr[i] = wVar;
                i = i2;
            }
            if (i == 0) {
                EmptyDisposable.error(new NoSuchElementException(), tVar);
            } else if (i == 1) {
                wVarArr[0].subscribe(new aj.C68449a(tVar, new C68467a()));
            } else {
                ax.C68465b bVar = new ax.C68465b(tVar, i, this.f171834b);
                tVar.onSubscribe(bVar);
                for (int i3 = 0; i3 < i && !bVar.isDisposed(); i3++) {
                    wVarArr[i3].subscribe(bVar.observers[i3]);
                }
            }
        } catch (Throwable th) {
            C68306a.m265071b(th);
            EmptyDisposable.error(th, tVar);
        }
    }

    public ay(Iterable<? extends AbstractC69015w<? extends T>> iterable, Function<? super Object[], ? extends R> function) {
        this.f171833a = iterable;
        this.f171834b = function;
    }
}
