package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import org.p3511d.AbstractC70021c;

/* renamed from: io.reactivex.internal.operators.c.at */
public final class C68459at<T> extends AbstractC68307f<T> {

    /* renamed from: b */
    final AbstractC69015w<? extends T> f171822b;

    /* renamed from: io.reactivex.internal.operators.c.at$a */
    static final class C68460a<T> extends DeferredScalarSubscription<T> implements AbstractC69012t<T> {
        private static final long serialVersionUID = 187782011903685568L;
        Disposable upstream;

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.p3511d.AbstractC70022d
        public void cancel() {
            super.cancel();
            this.upstream.dispose();
        }

        C68460a(AbstractC70021c<? super T> cVar) {
            super(cVar);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSuccess(T t) {
            complete(t);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public C68459at(AbstractC69015w<? extends T> wVar) {
        this.f171822b = wVar;
    }

    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super T> cVar) {
        this.f171822b.subscribe(new C68460a(cVar));
    }
}
