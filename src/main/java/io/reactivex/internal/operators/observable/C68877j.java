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

/* renamed from: io.reactivex.internal.operators.observable.j */
public final class C68877j<T> extends Single<Boolean> implements AbstractC68367d<Boolean> {

    /* renamed from: a */
    final ObservableSource<T> f172739a;

    /* renamed from: b */
    final AbstractC68322n<? super T> f172740b;

    /* renamed from: io.reactivex.internal.operators.observable.j$a */
    static final class C68878a<T> implements Disposable, AbstractC69009q<T> {

        /* renamed from: a */
        final AbstractC69012t<? super Boolean> f172741a;

        /* renamed from: b */
        final AbstractC68322n<? super T> f172742b;

        /* renamed from: c */
        Disposable f172743c;

        /* renamed from: d */
        boolean f172744d;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172743c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f172743c.isDisposed();
        }

        @Override // io.reactivex.AbstractC69009q
        public void onComplete() {
            if (!this.f172744d) {
                this.f172744d = true;
                this.f172741a.onSuccess(false);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f172743c, disposable)) {
                this.f172743c = disposable;
                this.f172741a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69009q
        public void onError(Throwable th) {
            if (this.f172744d) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.f172744d = true;
            this.f172741a.onError(th);
        }

        @Override // io.reactivex.AbstractC69009q
        public void onNext(T t) {
            if (!this.f172744d) {
                try {
                    if (this.f172742b.test(t)) {
                        this.f172744d = true;
                        this.f172743c.dispose();
                        this.f172741a.onSuccess(true);
                    }
                } catch (Throwable th) {
                    C68306a.m265071b(th);
                    this.f172743c.dispose();
                    onError(th);
                }
            }
        }

        C68878a(AbstractC69012t<? super Boolean> tVar, AbstractC68322n<? super T> nVar) {
            this.f172741a = tVar;
            this.f172742b = nVar;
        }
    }

    @Override // io.reactivex.internal.p3460b.AbstractC68367d
    public Observable<Boolean> cE_() {
        return RxJavaPlugins.onAssembly(new C68875i(this.f172739a, this.f172740b));
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super Boolean> tVar) {
        this.f172739a.subscribe(new C68878a(tVar, this.f172740b));
    }

    public C68877j(ObservableSource<T> observableSource, AbstractC68322n<? super T> nVar) {
        this.f172739a = observableSource;
        this.f172740b = nVar;
    }
}
