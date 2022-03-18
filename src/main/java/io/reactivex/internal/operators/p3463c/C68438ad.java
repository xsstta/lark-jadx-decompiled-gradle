package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC68325i;
import io.reactivex.AbstractC69012t;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import org.p3511d.AbstractC70020b;
import org.p3511d.AbstractC70022d;

/* renamed from: io.reactivex.internal.operators.c.ad */
public final class C68438ad<T> extends Single<T> {

    /* renamed from: a */
    final AbstractC70020b<? extends T> f171779a;

    /* renamed from: io.reactivex.internal.operators.c.ad$a */
    static final class C68439a<T> implements Disposable, AbstractC68325i<T> {

        /* renamed from: a */
        final AbstractC69012t<? super T> f171780a;

        /* renamed from: b */
        AbstractC70022d f171781b;

        /* renamed from: c */
        T f171782c;

        /* renamed from: d */
        boolean f171783d;

        /* renamed from: e */
        volatile boolean f171784e;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f171784e;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f171784e = true;
            this.f171781b.cancel();
        }

        @Override // org.p3511d.AbstractC70021c
        public void onComplete() {
            if (!this.f171783d) {
                this.f171783d = true;
                T t = this.f171782c;
                this.f171782c = null;
                if (t == null) {
                    this.f171780a.onError(new NoSuchElementException("The source Publisher is empty"));
                } else {
                    this.f171780a.onSuccess(t);
                }
            }
        }

        C68439a(AbstractC69012t<? super T> tVar) {
            this.f171780a = tVar;
        }

        @Override // org.p3511d.AbstractC70021c
        public void onError(Throwable th) {
            if (this.f171783d) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.f171783d = true;
            this.f171782c = null;
            this.f171780a.onError(th);
        }

        @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
        public void onSubscribe(AbstractC70022d dVar) {
            if (SubscriptionHelper.validate(this.f171781b, dVar)) {
                this.f171781b = dVar;
                this.f171780a.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.p3511d.AbstractC70021c
        public void onNext(T t) {
            if (!this.f171783d) {
                if (this.f171782c != null) {
                    this.f171781b.cancel();
                    this.f171783d = true;
                    this.f171782c = null;
                    this.f171780a.onError(new IndexOutOfBoundsException("Too many elements in the Publisher"));
                    return;
                }
                this.f171782c = t;
            }
        }
    }

    public C68438ad(AbstractC70020b<? extends T> bVar) {
        this.f171779a = bVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Single
    public void subscribeActual(AbstractC69012t<? super T> tVar) {
        this.f171779a.subscribe(new C68439a(tVar));
    }
}
