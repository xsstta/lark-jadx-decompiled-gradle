package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.exceptions.C68306a;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.concurrent.Callable;
import org.p3511d.AbstractC70021c;

/* renamed from: io.reactivex.internal.operators.flowable.p */
public final class C68612p<T> extends AbstractC68307f<T> {

    /* renamed from: b */
    final Callable<? extends Throwable> f172069b;

    public C68612p(Callable<? extends Throwable> callable) {
        this.f172069b = callable;
    }

    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super T> cVar) {
        Throwable th;
        try {
            th = (Throwable) C68362b.m265229a(this.f172069b.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th2) {
            th = th2;
            C68306a.m265071b(th);
        }
        EmptySubscription.error(th, cVar);
    }
}
