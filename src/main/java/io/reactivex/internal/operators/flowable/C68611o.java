package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.internal.p3460b.AbstractCallableC68371h;
import io.reactivex.internal.subscriptions.EmptySubscription;
import org.p3511d.AbstractC70021c;

/* renamed from: io.reactivex.internal.operators.flowable.o */
public final class C68611o extends AbstractC68307f<Object> implements AbstractCallableC68371h<Object> {

    /* renamed from: b */
    public static final AbstractC68307f<Object> f172068b = new C68611o();

    @Override // io.reactivex.internal.p3460b.AbstractCallableC68371h, java.util.concurrent.Callable
    public Object call() {
        return null;
    }

    private C68611o() {
    }

    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super Object> cVar) {
        EmptySubscription.complete(cVar);
    }
}
