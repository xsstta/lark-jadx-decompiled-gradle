package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC68988j;
import io.reactivex.AbstractC68989k;
import io.reactivex.AbstractC69012t;
import io.reactivex.C68991m;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.p3459a.C68362b;

/* renamed from: io.reactivex.internal.operators.c.k */
public final class C68487k<T, R> extends AbstractC68988j<R> {

    /* renamed from: a */
    final Single<T> f171870a;

    /* renamed from: b */
    final Function<? super T, C68991m<R>> f171871b;

    /* renamed from: io.reactivex.internal.operators.c.k$a */
    static final class C68488a<T, R> implements Disposable, AbstractC69012t<T> {

        /* renamed from: a */
        final AbstractC68989k<? super R> f171872a;

        /* renamed from: b */
        final Function<? super T, C68991m<R>> f171873b;

        /* renamed from: c */
        Disposable f171874c;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f171874c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f171874c.isDisposed();
        }

        @Override // io.reactivex.AbstractC69012t
        public void onError(Throwable th) {
            this.f171872a.onError(th);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f171874c, disposable)) {
                this.f171874c = disposable;
                this.f171872a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSuccess(T t) {
            try {
                C68991m mVar = (C68991m) C68362b.m265229a((Object) this.f171873b.apply(t), "The selector returned a null Notification");
                if (mVar.mo238776c()) {
                    this.f171872a.onSuccess((Object) mVar.mo238777d());
                } else if (mVar.mo238774a()) {
                    this.f171872a.onComplete();
                } else {
                    this.f171872a.onError(mVar.mo238778e());
                }
            } catch (Throwable th) {
                C68306a.m265071b(th);
                this.f171872a.onError(th);
            }
        }

        C68488a(AbstractC68989k<? super R> kVar, Function<? super T, C68991m<R>> function) {
            this.f171872a = kVar;
            this.f171873b = function;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68988j
    /* renamed from: b */
    public void mo238168b(AbstractC68989k<? super R> kVar) {
        this.f171870a.subscribe(new C68488a(kVar, this.f171871b));
    }

    public C68487k(Single<T> single, Function<? super T, C68991m<R>> function) {
        this.f171870a = single;
        this.f171871b = function;
    }
}
