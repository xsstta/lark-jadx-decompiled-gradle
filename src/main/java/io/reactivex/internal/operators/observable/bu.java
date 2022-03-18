package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.internal.observers.AbstractC68377a;
import io.reactivex.internal.p3459a.C68362b;

public final class bu<T, U> extends AbstractC68651a<T, U> {

    /* renamed from: b */
    final Function<? super T, ? extends U> f172351b;

    /* renamed from: io.reactivex.internal.operators.observable.bu$a */
    static final class C68732a<T, U> extends AbstractC68377a<T, U> {

        /* renamed from: f */
        final Function<? super T, ? extends U> f172352f;

        @Override // io.reactivex.internal.p3460b.AbstractC68373j
        public U poll() throws Exception {
            Object poll = this.f171685c.poll();
            if (poll != null) {
                return (U) C68362b.m265229a(this.f172352f.apply(poll), "The mapper function returned a null value.");
            }
            return null;
        }

        @Override // io.reactivex.internal.p3460b.AbstractC68369f
        public int requestFusion(int i) {
            return mo238104a(i);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: io.reactivex.q */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (!this.f171686d) {
                if (this.f171687e != 0) {
                    this.f171683a.onNext(null);
                    return;
                }
                try {
                    this.f171683a.onNext(C68362b.m265229a(this.f172352f.apply(t), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    mo238105a(th);
                }
            }
        }

        C68732a(AbstractC69009q<? super U> qVar, Function<? super T, ? extends U> function) {
            super(qVar);
            this.f172352f = function;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super U> qVar) {
        this.f172123a.subscribe(new C68732a(qVar, this.f172351b));
    }

    public bu(ObservableSource<T> observableSource, Function<? super T, ? extends U> function) {
        super(observableSource);
        this.f172351b = function;
    }
}
