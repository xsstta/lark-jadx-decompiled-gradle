package io.reactivex;

import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.observers.CallbackCompletableObserver;
import io.reactivex.internal.observers.EmptyCompletableObserver;
import io.reactivex.internal.operators.p3461a.C68393a;
import io.reactivex.internal.operators.p3461a.C68395b;
import io.reactivex.internal.operators.p3461a.C68397c;
import io.reactivex.internal.operators.p3461a.C68400e;
import io.reactivex.internal.operators.p3461a.C68401f;
import io.reactivex.internal.operators.p3461a.C68403g;
import io.reactivex.internal.operators.p3461a.C68405h;
import io.reactivex.internal.p3459a.C68326a;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.plugins.RxJavaPlugins;

/* renamed from: io.reactivex.a */
public abstract class AbstractC68259a implements AbstractC68293e {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo237889b(AbstractC68273c cVar);

    @Override // io.reactivex.AbstractC68293e
    @SchedulerSupport("none")
    /* renamed from: a */
    public final void mo237885a(AbstractC68273c cVar) {
        C68362b.m265229a((Object) cVar, "s is null");
        try {
            AbstractC68273c onSubscribe = RxJavaPlugins.onSubscribe(this, cVar);
            C68362b.m265229a((Object) onSubscribe, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo237889b(onSubscribe);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C68306a.m265071b(th);
            RxJavaPlugins.onError(th);
            throw m264988a(th);
        }
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    /* renamed from: a */
    public final Disposable mo237884a(AbstractC68309a aVar, Consumer<? super Throwable> consumer) {
        C68362b.m265229a((Object) consumer, "onError is null");
        C68362b.m265229a((Object) aVar, "onComplete is null");
        CallbackCompletableObserver callbackCompletableObserver = new CallbackCompletableObserver(consumer, aVar);
        mo237885a((AbstractC68273c) callbackCompletableObserver);
        return callbackCompletableObserver;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    /* renamed from: a */
    public static AbstractC68259a m264983a() {
        return RxJavaPlugins.onAssembly(C68397c.f171718a);
    }

    @SchedulerSupport("none")
    /* renamed from: b */
    public final Disposable mo237888b() {
        EmptyCompletableObserver emptyCompletableObserver = new EmptyCompletableObserver();
        mo237885a(emptyCompletableObserver);
        return emptyCompletableObserver;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    /* renamed from: b */
    public final AbstractC68259a mo237887b(AbstractC68293e eVar) {
        return mo237890c(eVar);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    /* renamed from: a */
    public static AbstractC68259a m264984a(AbstractC68278d dVar) {
        C68362b.m265229a((Object) dVar, "source is null");
        return RxJavaPlugins.onAssembly(new C68395b(dVar));
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    /* renamed from: b */
    public final AbstractC68259a mo237886b(Scheduler scheduler) {
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new C68405h(this, scheduler));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    /* renamed from: a */
    public static AbstractC68259a m264985a(AbstractC68293e eVar) {
        C68362b.m265229a((Object) eVar, "source is null");
        if (eVar instanceof AbstractC68259a) {
            return RxJavaPlugins.onAssembly((AbstractC68259a) eVar);
        }
        return RxJavaPlugins.onAssembly(new C68400e(eVar));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    /* renamed from: c */
    public final AbstractC68259a mo237890c(AbstractC68293e eVar) {
        C68362b.m265229a((Object) eVar, "other is null");
        return m264987a(this, eVar);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    /* renamed from: a */
    public static AbstractC68259a m264987a(AbstractC68293e... eVarArr) {
        C68362b.m265229a((Object) eVarArr, "sources is null");
        if (eVarArr.length == 0) {
            return m264983a();
        }
        if (eVarArr.length == 1) {
            return m264985a(eVarArr[0]);
        }
        return RxJavaPlugins.onAssembly(new C68393a(eVarArr));
    }

    /* renamed from: a */
    private static NullPointerException m264988a(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    /* renamed from: a */
    public final AbstractC68259a mo237881a(Scheduler scheduler) {
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new C68401f(this, scheduler));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    /* renamed from: a */
    public final AbstractC68259a mo237882a(Consumer<? super Disposable> consumer) {
        return m264986a(consumer, C68326a.m265193b(), C68326a.f171641c, C68326a.f171641c, C68326a.f171641c, C68326a.f171641c);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    /* renamed from: a */
    public final AbstractC68259a mo237883a(AbstractC68309a aVar) {
        return m264986a(C68326a.m265193b(), C68326a.m265193b(), aVar, C68326a.f171641c, C68326a.f171641c, C68326a.f171641c);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    /* renamed from: a */
    private AbstractC68259a m264986a(Consumer<? super Disposable> consumer, Consumer<? super Throwable> consumer2, AbstractC68309a aVar, AbstractC68309a aVar2, AbstractC68309a aVar3, AbstractC68309a aVar4) {
        C68362b.m265229a((Object) consumer, "onSubscribe is null");
        C68362b.m265229a((Object) consumer2, "onError is null");
        C68362b.m265229a((Object) aVar, "onComplete is null");
        C68362b.m265229a((Object) aVar2, "onTerminate is null");
        C68362b.m265229a((Object) aVar3, "onAfterTerminate is null");
        C68362b.m265229a((Object) aVar4, "onDispose is null");
        return RxJavaPlugins.onAssembly(new C68403g(this, consumer, consumer2, aVar, aVar2, aVar3, aVar4));
    }
}
