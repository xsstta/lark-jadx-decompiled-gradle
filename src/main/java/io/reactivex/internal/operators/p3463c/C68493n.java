package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* renamed from: io.reactivex.internal.operators.c.n */
public final class C68493n<T> extends Single<T> {

    /* renamed from: a */
    final AbstractC69015w<T> f171883a;

    /* renamed from: b */
    final AbstractC68309a f171884b;

    /* renamed from: io.reactivex.internal.operators.c.n$a */
    static final class C68494a<T> implements Disposable, AbstractC69012t<T> {

        /* renamed from: a */
        final AbstractC69012t<? super T> f171885a;

        /* renamed from: b */
        final AbstractC68309a f171886b;

        /* renamed from: c */
        Disposable f171887c;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f171887c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f171887c.isDisposed();
        }

        /* renamed from: a */
        private void m265286a() {
            try {
                this.f171886b.run();
            } catch (Throwable th) {
                C68306a.m265071b(th);
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.AbstractC69012t
        public void onError(Throwable th) {
            this.f171885a.onError(th);
            m265286a();
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f171887c, disposable)) {
                this.f171887c = disposable;
                this.f171885a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSuccess(T t) {
            this.f171885a.onSuccess(t);
            m265286a();
        }

        C68494a(AbstractC69012t<? super T> tVar, AbstractC68309a aVar) {
            this.f171885a = tVar;
            this.f171886b = aVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super T> tVar) {
        this.f171883a.subscribe(new C68494a(tVar, this.f171884b));
    }

    public C68493n(AbstractC69015w<T> wVar, AbstractC68309a aVar) {
        this.f171883a = wVar;
        this.f171884b = aVar;
    }
}
