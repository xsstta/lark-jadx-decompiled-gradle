package io.reactivex;

import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Function;
import io.reactivex.internal.observers.C68382f;
import io.reactivex.internal.operators.maybe.C68640d;
import io.reactivex.internal.operators.maybe.C68646g;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.plugins.RxJavaPlugins;

/* renamed from: io.reactivex.j */
public abstract class AbstractC68988j<T> implements AbstractC68990l<T> {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo238168b(AbstractC68989k<? super T> kVar);

    @SchedulerSupport("none")
    @CheckReturnValue
    /* renamed from: b */
    public final Single<T> mo238773b() {
        return RxJavaPlugins.onAssembly(new C68646g(this, null));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    /* renamed from: a */
    public final T mo238771a() {
        C68382f fVar = new C68382f();
        mo238772a(fVar);
        return (T) fVar.mo238110b();
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    /* renamed from: a */
    public final <R> AbstractC68988j<R> mo238770a(Function<? super T, ? extends R> function) {
        C68362b.m265229a((Object) function, "mapper is null");
        return RxJavaPlugins.onAssembly(new C68640d(this, function));
    }

    @Override // io.reactivex.AbstractC68990l
    @SchedulerSupport("none")
    /* renamed from: a */
    public final void mo238772a(AbstractC68989k<? super T> kVar) {
        C68362b.m265229a((Object) kVar, "observer is null");
        AbstractC68989k<? super T> onSubscribe = RxJavaPlugins.onSubscribe(this, kVar);
        C68362b.m265229a((Object) onSubscribe, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            mo238168b(onSubscribe);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C68306a.m265071b(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
