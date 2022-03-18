package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.C68991m;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.plugins.RxJavaPlugins;

/* renamed from: io.reactivex.internal.operators.observable.ah */
public final class C68672ah<T, R> extends AbstractC68651a<T, R> {

    /* renamed from: b */
    final Function<? super T, ? extends C68991m<R>> f172175b;

    /* renamed from: io.reactivex.internal.operators.observable.ah$a */
    static final class C68673a<T, R> implements Disposable, AbstractC69009q<T> {

        /* renamed from: a */
        final AbstractC69009q<? super R> f172176a;

        /* renamed from: b */
        final Function<? super T, ? extends C68991m<R>> f172177b;

        /* renamed from: c */
        boolean f172178c;

        /* renamed from: d */
        Disposable f172179d;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172179d.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172179d.isDisposed();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (!this.f172178c) {
                this.f172178c = true;
                this.f172176a.onComplete();
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172179d, disposable)) {
                this.f172179d = disposable;
                this.f172176a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (this.f172178c) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.f172178c = true;
            this.f172176a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (!this.f172178c) {
                try {
                    C68991m mVar = (C68991m) C68362b.m265229a(this.f172177b.apply(t), "The selector returned a null Notification");
                    if (mVar.mo238775b()) {
                        this.f172179d.dispose();
                        onError(mVar.mo238778e());
                    } else if (mVar.mo238774a()) {
                        this.f172179d.dispose();
                        onComplete();
                    } else {
                        this.f172176a.onNext((Object) mVar.mo238777d());
                    }
                } catch (Throwable th) {
                    C68306a.m265071b(th);
                    this.f172179d.dispose();
                    onError(th);
                }
            } else if (t instanceof C68991m) {
                T t2 = t;
                if (t2.mo238775b()) {
                    RxJavaPlugins.onError(t2.mo238778e());
                }
            }
        }

        C68673a(AbstractC69009q<? super R> qVar, Function<? super T, ? extends C68991m<R>> function) {
            this.f172176a = qVar;
            this.f172177b = function;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super R> qVar) {
        this.f172123a.subscribe(new C68673a(qVar, this.f172175b));
    }

    public C68672ah(ObservableSource<T> observableSource, Function<? super T, ? extends C68991m<R>> function) {
        super(observableSource);
        this.f172175b = function;
    }
}
