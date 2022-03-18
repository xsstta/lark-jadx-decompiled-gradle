package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68325i;
import io.reactivex.exceptions.C68306a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.Function;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import org.p3511d.AbstractC70021c;

/* renamed from: io.reactivex.internal.operators.flowable.ai */
public final class C68541ai<T> extends AbstractC68522a<T, T> {

    /* renamed from: c */
    final Function<? super Throwable, ? extends T> f171949c;

    /* renamed from: io.reactivex.internal.operators.flowable.ai$a */
    static final class C68542a<T> extends SinglePostCompleteSubscriber<T, T> {
        private static final long serialVersionUID = -3740826063558713822L;
        final Function<? super Throwable, ? extends T> valueSupplier;

        @Override // org.p3511d.AbstractC70021c
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // org.p3511d.AbstractC70021c
        public void onNext(T t) {
            this.produced++;
            this.downstream.onNext(t);
        }

        @Override // org.p3511d.AbstractC70021c
        public void onError(Throwable th) {
            try {
                complete(C68362b.m265229a(this.valueSupplier.apply(th), "The valueSupplier returned a null value"));
            } catch (Throwable th2) {
                C68306a.m265071b(th2);
                this.downstream.onError(new CompositeException(th, th2));
            }
        }

        C68542a(AbstractC70021c<? super T> cVar, Function<? super Throwable, ? extends T> function) {
            super(cVar);
            this.valueSupplier = function;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super T> cVar) {
        this.f171934b.mo238000a((AbstractC68325i) new C68542a(cVar, this.f171949c));
    }

    public C68541ai(AbstractC68307f<T> fVar, Function<? super Throwable, ? extends T> function) {
        super(fVar);
        this.f171949c = function;
    }
}
