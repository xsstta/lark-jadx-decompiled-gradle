package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.observers.AbstractC68377a;

public final class al<T> extends AbstractC68651a<T, T> {

    /* renamed from: b */
    final Consumer<? super T> f172192b;

    /* renamed from: io.reactivex.internal.operators.observable.al$a */
    static final class C68678a<T> extends AbstractC68377a<T, T> {

        /* renamed from: f */
        final Consumer<? super T> f172193f;

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public T poll() throws Exception {
            T t = (T) this.f171685c.poll();
            if (t != null) {
                this.f172193f.accept(t);
            }
            return t;
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68369f
        public int requestFusion(int i) {
            return mo238104a(i);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            this.f171683a.onNext(t);
            if (this.f171687e == 0) {
                try {
                    this.f172193f.accept(t);
                } catch (Throwable th) {
                    mo238105a(th);
                }
            }
        }

        C68678a(AbstractC69009q<? super T> qVar, Consumer<? super T> consumer) {
            super(qVar);
            this.f172193f = consumer;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        this.f172123a.subscribe(new C68678a(qVar, this.f172192b));
    }

    public al(ObservableSource<T> observableSource, Consumer<? super T> consumer) {
        super(observableSource);
        this.f172192b = consumer;
    }
}
