package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68325i;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

/* renamed from: io.reactivex.internal.operators.flowable.at */
public final class C68556at<T> extends AbstractC68522a<T, T> {

    /* renamed from: c */
    final AbstractC68322n<? super T> f171972c;

    /* renamed from: io.reactivex.internal.operators.flowable.at$a */
    static final class C68557a<T> implements AbstractC68325i<T>, AbstractC70022d {

        /* renamed from: a */
        final AbstractC70021c<? super T> f171973a;

        /* renamed from: b */
        final AbstractC68322n<? super T> f171974b;

        /* renamed from: c */
        AbstractC70022d f171975c;

        /* renamed from: d */
        boolean f171976d;

        @Override // org.p3511d.AbstractC70022d
        public void cancel() {
            this.f171975c.cancel();
        }

        @Override // org.p3511d.AbstractC70021c
        public void onComplete() {
            if (!this.f171976d) {
                this.f171976d = true;
                this.f171973a.onComplete();
            }
        }

        @Override // org.p3511d.AbstractC70022d
        public void request(long j) {
            this.f171975c.request(j);
        }

        @Override // org.p3511d.AbstractC70021c, io.reactivex.AbstractC68325i
        public void onSubscribe(AbstractC70022d dVar) {
            if (SubscriptionHelper.validate(this.f171975c, dVar)) {
                this.f171975c = dVar;
                this.f171973a.onSubscribe(this);
            }
        }

        @Override // org.p3511d.AbstractC70021c
        public void onError(Throwable th) {
            if (!this.f171976d) {
                this.f171976d = true;
                this.f171973a.onError(th);
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // org.p3511d.AbstractC70021c
        public void onNext(T t) {
            if (!this.f171976d) {
                this.f171973a.onNext(t);
                try {
                    if (this.f171974b.test(t)) {
                        this.f171976d = true;
                        this.f171975c.cancel();
                        this.f171973a.onComplete();
                    }
                } catch (Throwable th) {
                    C68306a.m265071b(th);
                    this.f171975c.cancel();
                    onError(th);
                }
            }
        }

        C68557a(AbstractC70021c<? super T> cVar, AbstractC68322n<? super T> nVar) {
            this.f171973a = cVar;
            this.f171974b = nVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super T> cVar) {
        this.f171934b.mo238000a((AbstractC68325i) new C68557a(cVar, this.f171972c));
    }

    public C68556at(AbstractC68307f<T> fVar, AbstractC68322n<? super T> nVar) {
        super(fVar);
        this.f171972c = nVar;
    }
}
