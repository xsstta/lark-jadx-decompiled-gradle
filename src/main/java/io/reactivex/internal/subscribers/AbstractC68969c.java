package io.reactivex.internal.subscribers;

import io.reactivex.AbstractC68325i;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.C68978c;
import io.reactivex.internal.util.C68981f;
import java.util.concurrent.CountDownLatch;
import org.p3511d.AbstractC70022d;

/* renamed from: io.reactivex.internal.subscribers.c */
public abstract class AbstractC68969c<T> extends CountDownLatch implements AbstractC68325i<T> {

    /* renamed from: a */
    T f172974a;

    /* renamed from: b */
    Throwable f172975b;

    /* renamed from: c */
    AbstractC70022d f172976c;

    /* renamed from: d */
    volatile boolean f172977d;

    @Override // org.p3511d.AbstractC70021c
    public final void onComplete() {
        countDown();
    }

    public AbstractC68969c() {
        super(1);
    }

    /* renamed from: a */
    public final T mo238696a() {
        if (getCount() != 0) {
            try {
                C68978c.m265550a();
                await();
            } catch (InterruptedException e) {
                AbstractC70022d dVar = this.f172976c;
                this.f172976c = SubscriptionHelper.CANCELLED;
                if (dVar != null) {
                    dVar.cancel();
                }
                throw C68981f.m265557a(e);
            }
        }
        Throwable th = this.f172975b;
        if (th == null) {
            return this.f172974a;
        }
        throw C68981f.m265557a(th);
    }

    @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
    public final void onSubscribe(AbstractC70022d dVar) {
        if (SubscriptionHelper.validate(this.f172976c, dVar)) {
            this.f172976c = dVar;
            if (!this.f172977d) {
                dVar.request(Long.MAX_VALUE);
                if (this.f172977d) {
                    this.f172976c = SubscriptionHelper.CANCELLED;
                    dVar.cancel();
                }
            }
        }
    }
}
