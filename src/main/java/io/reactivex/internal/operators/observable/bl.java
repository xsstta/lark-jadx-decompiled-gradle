package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC68259a;
import io.reactivex.AbstractC68273c;
import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.p3460b.AbstractC68367d;
import io.reactivex.plugins.RxJavaPlugins;

public final class bl<T> extends AbstractC68259a implements AbstractC68367d<T> {

    /* renamed from: a */
    final ObservableSource<T> f172296a;

    /* renamed from: io.reactivex.internal.operators.observable.bl$a */
    static final class C68710a<T> implements Disposable, AbstractC69009q<T> {

        /* renamed from: a */
        final AbstractC68273c f172297a;

        /* renamed from: b */
        Disposable f172298b;

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172298b.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172298b.isDisposed();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            this.f172297a.onComplete();
        }

        C68710a(AbstractC68273c cVar) {
            this.f172297a = cVar;
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            this.f172297a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            this.f172298b = disposable;
            this.f172297a.onSubscribe(this);
        }
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68367d
    public Observable<T> cE_() {
        return RxJavaPlugins.onAssembly(new bk(this.f172296a));
    }

    public bl(ObservableSource<T> observableSource) {
        this.f172296a = observableSource;
    }

    @Override // io.reactivex.AbstractC68259a
    /* renamed from: b */
    public void mo237889b(AbstractC68273c cVar) {
        this.f172296a.subscribe(new C68710a(cVar));
    }
}
