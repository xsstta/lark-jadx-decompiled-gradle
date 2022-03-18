package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Function;
import io.reactivex.internal.operators.flowable.al;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.p3455c.AbstractC68274a;
import io.reactivex.p3455c.C68276c;
import io.reactivex.p3458f.C68308a;
import org.p3511d.AbstractC70020b;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

public final class ao<T> extends AbstractC68522a<T, T> {

    /* renamed from: c */
    final Function<? super AbstractC68307f<Throwable>, ? extends AbstractC70020b<?>> f171956c;

    /* renamed from: io.reactivex.internal.operators.flowable.ao$a */
    static final class C68550a<T> extends al.AbstractC68547c<T, Throwable> {
        private static final long serialVersionUID = -2680129890138081029L;

        @Override // org.p3511d.AbstractC70021c
        public void onComplete() {
            this.receiver.cancel();
            this.downstream.onComplete();
        }

        @Override // org.p3511d.AbstractC70021c
        public void onError(Throwable th) {
            again(th);
        }

        C68550a(AbstractC70021c<? super T> cVar, AbstractC68274a<Throwable> aVar, AbstractC70022d dVar) {
            super(cVar, aVar, dVar);
        }
    }

    @Override // io.reactivex.AbstractC68307f
    /* renamed from: a */
    public void mo237905a(AbstractC70021c<? super T> cVar) {
        C68308a aVar = new C68308a(cVar);
        AbstractC68274a<T> l = C68276c.m265012a(8).mo237904l();
        try {
            AbstractC70020b bVar = (AbstractC70020b) C68362b.m265229a(this.f171956c.apply(l), "handler returned a null Publisher");
            al.C68546b bVar2 = new al.C68546b(this.f171934b);
            C68550a aVar2 = new C68550a(aVar, l, bVar2);
            bVar2.subscriber = aVar2;
            cVar.onSubscribe(aVar2);
            bVar.subscribe(bVar2);
            bVar2.onNext(0);
        } catch (Throwable th) {
            C68306a.m265071b(th);
            EmptySubscription.error(th, cVar);
        }
    }

    public ao(AbstractC68307f<T> fVar, Function<? super AbstractC68307f<Throwable>, ? extends AbstractC70020b<?>> function) {
        super(fVar);
        this.f171956c = function;
    }
}
