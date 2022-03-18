package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.internal.observers.AbstractC68377a;

public final class au<T> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final AbstractC68322n<? super T> f172236b;

    /* renamed from: io.reactivex.internal.operators.observable.au$a */
    static final class C68685a<T> extends AbstractC68377a<T, T> {

        /* renamed from: f */
        final AbstractC68322n<? super T> f172237f;

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public T poll() throws Exception {
            T t;
            do {
                t = (T) this.f171685c.poll();
                if (t == null) {
                    break;
                }
            } while (!this.f172237f.test(t));
            return t;
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68369f
        public int requestFusion(int i) {
            return mo238104a(i);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (this.f171687e == 0) {
                try {
                    if (this.f172237f.test(t)) {
                        this.f171683a.onNext(t);
                    }
                } catch (Throwable th) {
                    mo238105a(th);
                }
            } else {
                this.f171683a.onNext(null);
            }
        }

        C68685a(AbstractC69009q<? super T> qVar, AbstractC68322n<? super T> nVar) {
            super(qVar);
            this.f172237f = nVar;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        this.f172123a.subscribe(new C68685a(qVar, this.f172236b));
    }

    public au(ObservableSource<T> observableSource, AbstractC68322n<? super T> nVar) {
        super(observableSource);
        this.f172236b = nVar;
    }
}
