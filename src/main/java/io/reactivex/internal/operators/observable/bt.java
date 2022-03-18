package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC68993o;
import io.reactivex.AbstractC69009q;
import io.reactivex.ObservableSource;
import io.reactivex.exceptions.C68306a;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.plugins.RxJavaPlugins;

public final class bt<R, T> extends AbstractC68651a<T, R> {

    /* renamed from: b */
    final AbstractC68993o<? extends R, ? super T> f172350b;

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super R> qVar) {
        try {
            AbstractC69009q<? super Object> a = this.f172350b.mo238783a(qVar);
            this.f172123a.subscribe((AbstractC69009q) C68362b.m265229a((Object) a, "Operator " + this.f172350b + " returned a null Observer"));
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C68306a.m265071b(th);
            RxJavaPlugins.onError(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public bt(ObservableSource<T> observableSource, AbstractC68993o<? extends R, ? super T> oVar) {
        super(observableSource);
        this.f172350b = oVar;
    }
}
