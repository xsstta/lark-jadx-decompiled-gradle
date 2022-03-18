package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.functions.AbstractC68311c;
import io.reactivex.functions.Function;
import io.reactivex.internal.observers.AbstractC68377a;

public final class ak<T, K> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final Function<? super T, K> f172186b;

    /* renamed from: c */
    final AbstractC68311c<? super K, ? super K> f172187c;

    /* renamed from: io.reactivex.internal.operators.observable.ak$a */
    static final class C68677a<T, K> extends AbstractC68377a<T, T> {

        /* renamed from: f */
        final Function<? super T, K> f172188f;

        /* renamed from: g */
        final AbstractC68311c<? super K, ? super K> f172189g;

        /* renamed from: h */
        K f172190h;

        /* renamed from: i */
        boolean f172191i;

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public T poll() throws java.lang.Exception {
            /*
                r4 = this;
            L_0x0000:
                io.reactivex.internal.b.e r0 = r4.f171685c
                java.lang.Object r0 = r0.poll()
                if (r0 != 0) goto L_0x000a
                r0 = 0
                return r0
            L_0x000a:
                io.reactivex.functions.Function<? super T, K> r1 = r4.f172188f
                java.lang.Object r1 = r1.apply(r0)
                boolean r2 = r4.f172191i
                if (r2 != 0) goto L_0x001a
                r2 = 1
                r4.f172191i = r2
                r4.f172190h = r1
                return r0
            L_0x001a:
                io.reactivex.functions.c<? super K, ? super K> r2 = r4.f172189g
                K r3 = r4.f172190h
                boolean r2 = r2.mo238039a(r3, r1)
                if (r2 != 0) goto L_0x0027
                r4.f172190h = r1
                return r0
            L_0x0027:
                r4.f172190h = r1
                goto L_0x0000
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ak.C68677a.poll():java.lang.Object");
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68369f
        public int requestFusion(int i) {
            return mo238104a(i);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (!this.f171686d) {
                if (this.f171687e != 0) {
                    this.f171683a.onNext(t);
                    return;
                }
                try {
                    K apply = this.f172188f.apply(t);
                    if (this.f172191i) {
                        boolean a = this.f172189g.mo238039a(this.f172190h, apply);
                        this.f172190h = apply;
                        if (a) {
                            return;
                        }
                    } else {
                        this.f172191i = true;
                        this.f172190h = apply;
                    }
                    this.f171683a.onNext(t);
                } catch (Throwable th) {
                    mo238105a(th);
                }
            }
        }

        C68677a(AbstractC69009q<? super T> qVar, Function<? super T, K> function, AbstractC68311c<? super K, ? super K> cVar) {
            super(qVar);
            this.f172188f = function;
            this.f172189g = cVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        this.f172123a.subscribe(new C68677a(qVar, this.f172186b, this.f172187c));
    }

    public ak(ObservableSource<T> observableSource, Function<? super T, K> function, AbstractC68311c<? super K, ? super K> cVar) {
        super(observableSource);
        this.f172186b = function;
        this.f172187c = cVar;
    }
}
