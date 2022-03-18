package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC68307f;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Function;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.ScalarSubscription;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import org.p3511d.AbstractC70020b;
import org.p3511d.AbstractC70021c;

public final class ap {

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.flowable.ap$a */
    public static final class C68551a<T, R> extends AbstractC68307f<R> {

        /* renamed from: b */
        final T f171957b;

        /* renamed from: c */
        final Function<? super T, ? extends AbstractC70020b<? extends R>> f171958c;

        @Override // io.reactivex.AbstractC68307f
        /* renamed from: a */
        public void mo237905a(AbstractC70021c<? super R> cVar) {
            try {
                AbstractC70020b bVar = (AbstractC70020b) C68362b.m265229a(this.f171958c.apply(this.f171957b), "The mapper returned a null Publisher");
                if (bVar instanceof Callable) {
                    try {
                        Object call = ((Callable) bVar).call();
                        if (call == null) {
                            EmptySubscription.complete(cVar);
                        } else {
                            cVar.onSubscribe(new ScalarSubscription(cVar, call));
                        }
                    } catch (Throwable th) {
                        C68306a.m265071b(th);
                        EmptySubscription.error(th, cVar);
                    }
                } else {
                    bVar.subscribe(cVar);
                }
            } catch (Throwable th2) {
                EmptySubscription.error(th2, cVar);
            }
        }

        C68551a(T t, Function<? super T, ? extends AbstractC70020b<? extends R>> function) {
            this.f171957b = t;
            this.f171958c = function;
        }
    }

    /* renamed from: a */
    public static <T, U> AbstractC68307f<U> m265311a(T t, Function<? super T, ? extends AbstractC70020b<? extends U>> function) {
        return RxJavaPlugins.onAssembly(new C68551a(t, function));
    }

    /* renamed from: a */
    public static <T, R> boolean m265312a(AbstractC70020b<T> bVar, AbstractC70021c<? super R> cVar, Function<? super T, ? extends AbstractC70020b<? extends R>> function) {
        if (!(bVar instanceof Callable)) {
            return false;
        }
        try {
            Object obj = (Object) ((Callable) bVar).call();
            if (obj == 0) {
                EmptySubscription.complete(cVar);
                return true;
            }
            try {
                AbstractC70020b bVar2 = (AbstractC70020b) C68362b.m265229a(function.apply(obj), "The mapper returned a null Publisher");
                if (bVar2 instanceof Callable) {
                    try {
                        Object call = ((Callable) bVar2).call();
                        if (call == null) {
                            EmptySubscription.complete(cVar);
                            return true;
                        }
                        cVar.onSubscribe(new ScalarSubscription(cVar, call));
                    } catch (Throwable th) {
                        C68306a.m265071b(th);
                        EmptySubscription.error(th, cVar);
                        return true;
                    }
                } else {
                    bVar2.subscribe(cVar);
                }
                return true;
            } catch (Throwable th2) {
                C68306a.m265071b(th2);
                EmptySubscription.error(th2, cVar);
                return true;
            }
        } catch (Throwable th3) {
            C68306a.m265071b(th3);
            EmptySubscription.error(th3, cVar);
            return true;
        }
    }
}
