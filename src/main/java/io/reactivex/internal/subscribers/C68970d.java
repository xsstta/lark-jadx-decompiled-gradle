package io.reactivex.internal.subscribers;

import io.reactivex.plugins.RxJavaPlugins;

/* renamed from: io.reactivex.internal.subscribers.d */
public final class C68970d<T> extends AbstractC68969c<T> {
    @Override // org.p3511d.AbstractC70021c
    public void onError(Throwable th) {
        if (this.f172974a == null) {
            this.f172975b = th;
        } else {
            RxJavaPlugins.onError(th);
        }
        countDown();
    }

    @Override // org.p3511d.AbstractC70021c
    public void onNext(T t) {
        if (this.f172974a == null) {
            this.f172974a = t;
            this.f172976c.cancel();
            countDown();
        }
    }
}
