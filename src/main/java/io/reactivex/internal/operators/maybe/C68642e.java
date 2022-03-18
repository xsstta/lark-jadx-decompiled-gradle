package io.reactivex.internal.operators.maybe;

import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68989k;
import io.reactivex.AbstractC68990l;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import org.p3511d.AbstractC70021c;

/* renamed from: io.reactivex.internal.operators.maybe.e */
public final class C68642e<T> extends AbstractC68307f<T> {

    /* renamed from: b */
    final AbstractC68990l<T> f172109b;

    /* renamed from: io.reactivex.internal.operators.maybe.e$a */
    static final class C68643a<T> extends DeferredScalarSubscription<T> implements AbstractC68989k<T> {
        private static final long serialVersionUID = 7603343402964826922L;
        Disposable upstream;

        @Override // io.reactivex.AbstractC68989k
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.p3511d.AbstractC70022d
        public void cancel() {
            super.cancel();
            this.upstream.dispose();
        }

        C68643a(AbstractC70021c<? super T> cVar) {
            super(cVar);
        }

        @Override // io.reactivex.AbstractC68989k
        public void onSuccess(T t) {
            complete(t);
        }

        @Override // io.reactivex.AbstractC68989k
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.AbstractC68989k
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public C68642e(AbstractC68990l<T> lVar) {
        this.f172109b = lVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super T> cVar) {
        this.f172109b.mo238772a(new C68643a(cVar));
    }
}
