package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.C68391o;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.c.j */
public final class C68485j<T, U> extends Single<T> {

    /* renamed from: a */
    final AbstractC69015w<T> f171868a;

    /* renamed from: b */
    final AbstractC69015w<U> f171869b;

    /* renamed from: io.reactivex.internal.operators.c.j$a */
    static final class C68486a<T, U> extends AtomicReference<Disposable> implements Disposable, AbstractC69012t<U> {
        private static final long serialVersionUID = -8565274649390031272L;
        final AbstractC69012t<? super T> downstream;
        final AbstractC69015w<T> source;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
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
        public void onSuccess(U u) {
            this.source.subscribe(new C68391o(this, this.downstream));
        }

        C68486a(AbstractC69012t<? super T> tVar, AbstractC69015w<T> wVar) {
            this.downstream = tVar;
            this.source = wVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super T> tVar) {
        this.f171869b.subscribe(new C68486a(tVar, this.f171868a));
    }

    public C68485j(AbstractC69015w<T> wVar, AbstractC69015w<U> wVar2) {
        this.f171868a = wVar;
        this.f171869b = wVar2;
    }
}
