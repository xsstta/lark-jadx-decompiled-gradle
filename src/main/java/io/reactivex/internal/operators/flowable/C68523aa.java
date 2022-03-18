package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.internal.p3460b.AbstractCallableC68371h;
import io.reactivex.internal.subscriptions.ScalarSubscription;
import org.p3511d.AbstractC70021c;

/* renamed from: io.reactivex.internal.operators.flowable.aa */
public final class C68523aa<T> extends AbstractC68307f<T> implements AbstractCallableC68371h<T> {

    /* renamed from: b */
    private final T f171935b;

    @Override // io.reactivex.internal.p3460b.AbstractCallableC68371h, java.util.concurrent.Callable
    public T call() {
        return this.f171935b;
    }

    public C68523aa(T t) {
        this.f171935b = t;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super T> cVar) {
        cVar.onSubscribe(new ScalarSubscription(cVar, this.f171935b));
    }
}
