package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68325i;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

public final class au<T> extends AbstractC68522a<T, T> {

    /* renamed from: c */
    final AbstractC68322n<? super T> f171977c;

    /* renamed from: io.reactivex.internal.operators.flowable.au$a */
    static final class C68558a<T> implements AbstractC68325i<T>, AbstractC70022d {

        /* renamed from: a */
        final AbstractC70021c<? super T> f171978a;

        /* renamed from: b */
        final AbstractC68322n<? super T> f171979b;

        /* renamed from: c */
        AbstractC70022d f171980c;

        /* renamed from: d */
        boolean f171981d;

        @Override // org.p3511d.AbstractC70022d
        public void cancel() {
            this.f171980c.cancel();
        }

        @Override // org.p3511d.AbstractC70021c
        public void onComplete() {
            if (!this.f171981d) {
                this.f171981d = true;
                this.f171978a.onComplete();
            }
        }

        @Override // org.p3511d.AbstractC70022d
        public void request(long j) {
            this.f171980c.request(j);
        }

        @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
        public void onSubscribe(AbstractC70022d dVar) {
            if (SubscriptionHelper.validate(this.f171980c, dVar)) {
                this.f171980c = dVar;
                this.f171978a.onSubscribe(this);
            }
        }

        @Override // org.p3511d.AbstractC70021c
        public void onError(Throwable th) {
            if (this.f171981d) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.f171981d = true;
            this.f171978a.onError(th);
        }

        @Override // org.p3511d.AbstractC70021c
        public void onNext(T t) {
            if (!this.f171981d) {
                try {
                    if (!this.f171979b.test(t)) {
                        this.f171981d = true;
                        this.f171980c.cancel();
                        this.f171978a.onComplete();
                        return;
                    }
                    this.f171978a.onNext(t);
                } catch (Throwable th) {
                    C68306a.m265071b(th);
                    this.f171980c.cancel();
                    onError(th);
                }
            }
        }

        C68558a(AbstractC70021c<? super T> cVar, AbstractC68322n<? super T> nVar) {
            this.f171978a = cVar;
            this.f171979b = nVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super T> cVar) {
        this.f171934b.mo238000a((AbstractC68325i) new C68558a(cVar, this.f171977c));
    }

    public au(AbstractC68307f<T> fVar, AbstractC68322n<? super T> nVar) {
        super(fVar);
        this.f171977c = nVar;
    }
}
