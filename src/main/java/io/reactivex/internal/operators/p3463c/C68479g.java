package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC68273c;
import io.reactivex.AbstractC68293e;
import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.C68391o;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.c.g */
public final class C68479g<T> extends Single<T> {

    /* renamed from: a */
    final AbstractC69015w<T> f171862a;

    /* renamed from: b */
    final AbstractC68293e f171863b;

    /* renamed from: io.reactivex.internal.operators.c.g$a */
    static final class C68480a<T> extends AtomicReference<Disposable> implements AbstractC68273c, Disposable {
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

        @Override // io.reactivex.AbstractC68273c
        public void onComplete() {
            this.source.subscribe(new C68391o(this, this.downstream));
        }

        @Override // io.reactivex.AbstractC68273c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.AbstractC68273c
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.downstream.onSubscribe(this);
            }
        }

        C68480a(AbstractC69012t<? super T> tVar, AbstractC69015w<T> wVar) {
            this.downstream = tVar;
            this.source = wVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super T> tVar) {
        this.f171863b.mo237885a(new C68480a(tVar, this.f171862a));
    }

    public C68479g(AbstractC69015w<T> wVar, AbstractC68293e eVar) {
        this.f171862a = wVar;
        this.f171863b = eVar;
    }
}
