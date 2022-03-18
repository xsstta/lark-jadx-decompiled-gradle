package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC69009q;
import io.reactivex.AbstractC69012t;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.p3460b.AbstractC68367d;
import io.reactivex.plugins.RxJavaPlugins;

/* renamed from: io.reactivex.internal.operators.observable.g */
public final class C68870g<T> extends Single<Boolean> implements AbstractC68367d<Boolean> {

    /* renamed from: a */
    final ObservableSource<T> f172723a;

    /* renamed from: b */
    final AbstractC68322n<? super T> f172724b;

    /* renamed from: io.reactivex.internal.operators.observable.g$a */
    static final class C68871a<T> implements Disposable, AbstractC69009q<T> {

        /* renamed from: a */
        final AbstractC69012t<? super Boolean> f172725a;

        /* renamed from: b */
        final AbstractC68322n<? super T> f172726b;

        /* renamed from: c */
        Disposable f172727c;

        /* renamed from: d */
        boolean f172728d;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172727c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172727c.isDisposed();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (!this.f172728d) {
                this.f172728d = true;
                this.f172725a.onSuccess(true);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172727c, disposable)) {
                this.f172727c = disposable;
                this.f172725a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (this.f172728d) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.f172728d = true;
            this.f172725a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (!this.f172728d) {
                try {
                    if (!this.f172726b.test(t)) {
                        this.f172728d = true;
                        this.f172727c.dispose();
                        this.f172725a.onSuccess(false);
                    }
                } catch (Throwable th) {
                    C68306a.m265071b(th);
                    this.f172727c.dispose();
                    onError(th);
                }
            }
        }

        C68871a(AbstractC69012t<? super Boolean> tVar, AbstractC68322n<? super T> nVar) {
            this.f172725a = tVar;
            this.f172726b = nVar;
        }
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68367d
    public Observable<Boolean> cE_() {
        return RxJavaPlugins.onAssembly(new C68868f(this.f172723a, this.f172724b));
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super Boolean> tVar) {
        this.f172723a.subscribe(new C68871a(tVar, this.f172724b));
    }

    public C68870g(ObservableSource<T> observableSource, AbstractC68322n<? super T> nVar) {
        this.f172723a = observableSource;
        this.f172724b = nVar;
    }
}
