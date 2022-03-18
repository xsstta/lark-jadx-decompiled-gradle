package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* renamed from: io.reactivex.internal.operators.c.m */
public final class C68491m<T> extends Single<T> {

    /* renamed from: a */
    final AbstractC69015w<T> f171878a;

    /* renamed from: b */
    final Consumer<? super T> f171879b;

    /* renamed from: io.reactivex.internal.operators.c.m$a */
    static final class C68492a<T> implements Disposable, AbstractC69012t<T> {

        /* renamed from: a */
        final AbstractC69012t<? super T> f171880a;

        /* renamed from: b */
        final Consumer<? super T> f171881b;

        /* renamed from: c */
        Disposable f171882c;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f171882c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f171882c.isDisposed();
        }

        @Override // io.reactivex.AbstractC69012t
        public void onError(Throwable th) {
            this.f171880a.onError(th);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f171882c, disposable)) {
                this.f171882c = disposable;
                this.f171880a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSuccess(T t) {
            this.f171880a.onSuccess(t);
            try {
                this.f171881b.accept(t);
            } catch (Throwable th) {
                C68306a.m265071b(th);
                RxJavaPlugins.onError(th);
            }
        }

        C68492a(AbstractC69012t<? super T> tVar, Consumer<? super T> consumer) {
            this.f171880a = tVar;
            this.f171881b = consumer;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super T> tVar) {
        this.f171878a.subscribe(new C68492a(tVar, this.f171879b));
    }

    public C68491m(AbstractC69015w<T> wVar, Consumer<? super T> consumer) {
        this.f171878a = wVar;
        this.f171879b = consumer;
    }
}
