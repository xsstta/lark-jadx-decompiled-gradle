package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.p3459a.C68362b;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.c.w */
public final class C68510w<T, R> extends Single<R> {

    /* renamed from: a */
    final AbstractC69015w<? extends T> f171917a;

    /* renamed from: b */
    final Function<? super T, ? extends AbstractC69015w<? extends R>> f171918b;

    /* renamed from: io.reactivex.internal.operators.c.w$a */
    static final class C68511a<T, R> extends AtomicReference<Disposable> implements Disposable, AbstractC69012t<T> {
        private static final long serialVersionUID = 3258103020495908596L;
        final AbstractC69012t<? super R> downstream;
        final Function<? super T, ? extends AbstractC69015w<? extends R>> mapper;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        /* renamed from: io.reactivex.internal.operators.c.w$a$a */
        static final class C68512a<R> implements AbstractC69012t<R> {

            /* renamed from: a */
            final AtomicReference<Disposable> f171919a;

            /* renamed from: b */
            final AbstractC69012t<? super R> f171920b;

            @Override // io.reactivex.AbstractC69012t
            public void onError(Throwable th) {
                this.f171920b.onError(th);
            }

            @Override // io.reactivex.AbstractC69012t
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this.f171919a, disposable);
            }

            @Override // io.reactivex.AbstractC69012t
            public void onSuccess(R r) {
                this.f171920b.onSuccess(r);
            }

            C68512a(AtomicReference<Disposable> atomicReference, AbstractC69012t<? super R> tVar) {
                this.f171919a = atomicReference;
                this.f171920b = tVar;
            }
        }

        @Override // io.reactivex.AbstractC69012t
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSuccess(T t) {
            try {
                AbstractC69015w wVar = (AbstractC69015w) C68362b.m265229a(this.mapper.apply(t), "The single returned by the mapper is null");
                if (!isDisposed()) {
                    wVar.subscribe(new C68512a(this, this.downstream));
                }
            } catch (Throwable th) {
                C68306a.m265071b(th);
                this.downstream.onError(th);
            }
        }

        C68511a(AbstractC69012t<? super R> tVar, Function<? super T, ? extends AbstractC69015w<? extends R>> function) {
            this.downstream = tVar;
            this.mapper = function;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super R> tVar) {
        this.f171917a.subscribe(new C68511a(tVar, this.f171918b));
    }

    public C68510w(AbstractC69015w<? extends T> wVar, Function<? super T, ? extends AbstractC69015w<? extends R>> function) {
        this.f171918b = function;
        this.f171917a = wVar;
    }
}
