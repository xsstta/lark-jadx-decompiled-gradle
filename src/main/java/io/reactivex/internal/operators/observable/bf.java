package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC68325i;
import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.p3511d.AbstractC70020b;
import org.p3511d.AbstractC70022d;

public final class bf<T> extends Observable<T> {

    /* renamed from: a */
    final AbstractC70020b<? extends T> f172274a;

    /* renamed from: io.reactivex.internal.operators.observable.bf$a */
    static final class C68701a<T> implements Disposable, AbstractC68325i<T> {

        /* renamed from: a */
        final AbstractC69009q<? super T> f172275a;

        /* renamed from: b */
        AbstractC70022d f172276b;

        @Override // org.p3511d.AbstractC70021c
        public void onComplete() {
            this.f172275a.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f172276b.cancel();
            this.f172276b = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f172276b == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        C68701a(AbstractC69009q<? super T> qVar) {
            this.f172275a = qVar;
        }

        @Override // org.p3511d.AbstractC70021c
        public void onError(Throwable th) {
            this.f172275a.onError(th);
        }

        @Override // org.p3511d.AbstractC70021c
        public void onNext(T t) {
            this.f172275a.onNext(t);
        }

        @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
        public void onSubscribe(AbstractC70022d dVar) {
            if (SubscriptionHelper.validate(this.f172276b, dVar)) {
                this.f172276b = dVar;
                this.f172275a.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }
    }

    public bf(AbstractC70020b<? extends T> bVar) {
        this.f172274a = bVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super T> qVar) {
        this.f172274a.subscribe(new C68701a(qVar));
    }
}
