package io.reactivex.internal.operators.p3461a;

import io.reactivex.AbstractC68259a;
import io.reactivex.AbstractC68273c;
import io.reactivex.AbstractC69012t;
import io.reactivex.AbstractC69015w;
import io.reactivex.disposables.Disposable;

/* renamed from: io.reactivex.internal.operators.a.d */
public final class C68398d<T> extends AbstractC68259a {

    /* renamed from: a */
    final AbstractC69015w<T> f171719a;

    /* renamed from: io.reactivex.internal.operators.a.d$a */
    static final class C68399a<T> implements AbstractC69012t<T> {

        /* renamed from: a */
        final AbstractC68273c f171720a;

        C68399a(AbstractC68273c cVar) {
            this.f171720a = cVar;
        }

        @Override // io.reactivex.AbstractC69012t
        public void onError(Throwable th) {
            this.f171720a.onError(th);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSubscribe(Disposable disposable) {
            this.f171720a.onSubscribe(disposable);
        }

        @Override // io.reactivex.AbstractC69012t
        public void onSuccess(T t) {
            this.f171720a.onComplete();
        }
    }

    public C68398d(AbstractC69015w<T> wVar) {
        this.f171719a = wVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68259a
    /* renamed from: b */
    public void mo237889b(AbstractC68273c cVar) {
        this.f171719a.subscribe(new C68399a(cVar));
    }
}
