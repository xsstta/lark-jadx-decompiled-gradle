package io.reactivex;

import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.AbstractC68310b;
import io.reactivex.functions.AbstractC68311c;
import io.reactivex.functions.AbstractC68312d;
import io.reactivex.functions.AbstractC68314f;
import io.reactivex.functions.AbstractC68321m;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.operators.flowable.C68523aa;
import io.reactivex.internal.operators.flowable.C68524ab;
import io.reactivex.internal.operators.flowable.C68527ac;
import io.reactivex.internal.operators.flowable.C68531ad;
import io.reactivex.internal.operators.flowable.C68533ae;
import io.reactivex.internal.operators.flowable.C68537ag;
import io.reactivex.internal.operators.flowable.C68539ah;
import io.reactivex.internal.operators.flowable.C68541ai;
import io.reactivex.internal.operators.flowable.C68556at;
import io.reactivex.internal.operators.flowable.C68567b;
import io.reactivex.internal.operators.flowable.C68570d;
import io.reactivex.internal.operators.flowable.C68572e;
import io.reactivex.internal.operators.flowable.C68574f;
import io.reactivex.internal.operators.flowable.C68582g;
import io.reactivex.internal.operators.flowable.C68585i;
import io.reactivex.internal.operators.flowable.C68595j;
import io.reactivex.internal.operators.flowable.C68598k;
import io.reactivex.internal.operators.flowable.C68603l;
import io.reactivex.internal.operators.flowable.C68606m;
import io.reactivex.internal.operators.flowable.C68609n;
import io.reactivex.internal.operators.flowable.C68611o;
import io.reactivex.internal.operators.flowable.C68612p;
import io.reactivex.internal.operators.flowable.C68613q;
import io.reactivex.internal.operators.flowable.C68616r;
import io.reactivex.internal.operators.flowable.C68620t;
import io.reactivex.internal.operators.flowable.C68625v;
import io.reactivex.internal.operators.flowable.C68626w;
import io.reactivex.internal.operators.flowable.C68632y;
import io.reactivex.internal.operators.flowable.C68633z;
import io.reactivex.internal.operators.flowable.CallableC68624u;
import io.reactivex.internal.operators.flowable.FlowableInternalHelper;
import io.reactivex.internal.operators.flowable.aj;
import io.reactivex.internal.operators.flowable.ak;
import io.reactivex.internal.operators.flowable.al;
import io.reactivex.internal.operators.flowable.am;
import io.reactivex.internal.operators.flowable.an;
import io.reactivex.internal.operators.flowable.ao;
import io.reactivex.internal.operators.flowable.ap;
import io.reactivex.internal.operators.flowable.ar;
import io.reactivex.internal.operators.flowable.as;
import io.reactivex.internal.operators.flowable.au;
import io.reactivex.internal.operators.flowable.av;
import io.reactivex.internal.operators.flowable.aw;
import io.reactivex.internal.operators.flowable.ax;
import io.reactivex.internal.p3459a.C68326a;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.p3460b.AbstractCallableC68371h;
import io.reactivex.internal.subscribers.C68970d;
import io.reactivex.internal.subscribers.LambdaSubscriber;
import io.reactivex.internal.subscribers.StrictSubscriber;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.p3456d.C68279a;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.p3511d.AbstractC70020b;
import org.p3511d.AbstractC70021c;
import org.p3511d.AbstractC70022d;

/* renamed from: io.reactivex.f */
public abstract class AbstractC68307f<T> implements AbstractC70020b<T> {

    /* renamed from: a */
    static final int f171632a = Math.max(1, Integer.getInteger("rx2.buffer-size", (int) SmActions.ACTION_ONTHECALL_EXIT).intValue());

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo237905a(AbstractC70021c<? super T> cVar);

    /* renamed from: a */
    public static int m265072a() {
        return f171632a;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    /* renamed from: a */
    public static <T> AbstractC68307f<T> m265091a(AbstractC70020b<? extends T> bVar, AbstractC70020b<? extends T> bVar2) {
        C68362b.m265229a((Object) bVar, "source1 is null");
        C68362b.m265229a((Object) bVar2, "source2 is null");
        return m265096a(bVar, bVar2);
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    /* renamed from: a */
    public static <T> AbstractC68307f<T> m265096a(AbstractC70020b<? extends T>... bVarArr) {
        if (bVarArr.length == 0) {
            return m265097b();
        }
        if (bVarArr.length == 1) {
            return m265090a((AbstractC70020b) bVarArr[0]);
        }
        return RxJavaPlugins.onAssembly(new C68572e(bVarArr, false));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    /* renamed from: a */
    public static <T> AbstractC68307f<T> m265085a(Callable<? extends Throwable> callable) {
        C68362b.m265229a((Object) callable, "errorSupplier is null");
        return RxJavaPlugins.onAssembly(new C68612p(callable));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    /* renamed from: a */
    public static <T> AbstractC68307f<T> m265084a(Throwable th) {
        C68362b.m265229a((Object) th, "throwable is null");
        return m265085a((Callable<? extends Throwable>) C68326a.m265192a(th));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    /* renamed from: a */
    public static <T> AbstractC68307f<T> m265095a(T... tArr) {
        C68362b.m265229a((Object) tArr, "items is null");
        if (tArr.length == 0) {
            return m265097b();
        }
        if (tArr.length == 1) {
            return m265083a((Object) tArr[0]);
        }
        return RxJavaPlugins.onAssembly(new C68620t(tArr));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    /* renamed from: a */
    public static <T> AbstractC68307f<T> m265086a(Future<? extends T> future) {
        C68362b.m265229a((Object) future, "future is null");
        return RxJavaPlugins.onAssembly(new C68625v(future, 0, null));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    /* renamed from: a */
    public static <T> AbstractC68307f<T> m265087a(Future<? extends T> future, long j, TimeUnit timeUnit) {
        C68362b.m265229a((Object) future, "future is null");
        C68362b.m265229a((Object) timeUnit, "unit is null");
        return RxJavaPlugins.onAssembly(new C68625v(future, j, timeUnit));
    }

    @SchedulerSupport("custom")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    /* renamed from: a */
    public static <T> AbstractC68307f<T> m265088a(Future<? extends T> future, long j, TimeUnit timeUnit, Scheduler scheduler) {
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        return m265087a(future, j, timeUnit).mo238004b(scheduler);
    }

    @SchedulerSupport("custom")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    /* renamed from: a */
    public static <T> AbstractC68307f<T> m265089a(Future<? extends T> future, Scheduler scheduler) {
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        return m265086a((Future) future).mo238004b(scheduler);
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    /* renamed from: a */
    public static <T> AbstractC68307f<T> m265081a(Iterable<? extends T> iterable) {
        C68362b.m265229a((Object) iterable, "source is null");
        return RxJavaPlugins.onAssembly(new C68626w(iterable));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    /* renamed from: a */
    public static <T> AbstractC68307f<T> m265090a(AbstractC70020b<? extends T> bVar) {
        if (bVar instanceof AbstractC68307f) {
            return RxJavaPlugins.onAssembly((AbstractC68307f) bVar);
        }
        C68362b.m265229a((Object) bVar, "publisher is null");
        return RxJavaPlugins.onAssembly(new C68632y(bVar));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    /* renamed from: a */
    public static <T> AbstractC68307f<T> m265083a(T t) {
        C68362b.m265229a((Object) t, "item is null");
        return RxJavaPlugins.onAssembly(new C68523aa(t));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    /* renamed from: a */
    public static <T> AbstractC68307f<T> m265093a(AbstractC70020b<? extends T> bVar, AbstractC70020b<? extends T> bVar2, AbstractC70020b<? extends T> bVar3) {
        C68362b.m265229a((Object) bVar, "source1 is null");
        C68362b.m265229a((Object) bVar2, "source2 is null");
        C68362b.m265229a((Object) bVar3, "source3 is null");
        return m265095a((Object[]) new AbstractC70020b[]{bVar, bVar2, bVar3}).mo237993a(C68326a.m265175a(), false, 3);
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    /* renamed from: a */
    public static <T, R> AbstractC68307f<R> m265082a(Iterable<? extends AbstractC70020b<? extends T>> iterable, Function<? super Object[], ? extends R> function) {
        C68362b.m265229a((Object) function, "zipper is null");
        C68362b.m265229a((Object) iterable, "sources is null");
        return RxJavaPlugins.onAssembly(new ax(null, iterable, function, m265072a(), false));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    /* renamed from: a */
    public static <T1, T2, R> AbstractC68307f<R> m265092a(AbstractC70020b<? extends T1> bVar, AbstractC70020b<? extends T2> bVar2, BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        C68362b.m265229a((Object) bVar, "source1 is null");
        C68362b.m265229a((Object) bVar2, "source2 is null");
        return m265079a(C68326a.m265176a((BiFunction) biFunction), false, m265072a(), bVar, bVar2);
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    /* renamed from: a */
    public static <T1, T2, T3, R> AbstractC68307f<R> m265094a(AbstractC70020b<? extends T1> bVar, AbstractC70020b<? extends T2> bVar2, AbstractC70020b<? extends T3> bVar3, AbstractC68314f<? super T1, ? super T2, ? super T3, ? extends R> fVar) {
        C68362b.m265229a((Object) bVar, "source1 is null");
        C68362b.m265229a((Object) bVar2, "source2 is null");
        C68362b.m265229a((Object) bVar3, "source3 is null");
        return m265079a(C68326a.m265177a((AbstractC68314f) fVar), false, m265072a(), bVar, bVar2, bVar3);
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    /* renamed from: a */
    public final void mo237999a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        C68567b.m265322a(this, consumer, consumer2, C68326a.f171641c);
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    /* renamed from: a */
    public final <U> Single<U> mo237977a(Callable<? extends U> callable, AbstractC68310b<? super U, ? super T> bVar) {
        C68362b.m265229a((Object) callable, "initialItemSupplier is null");
        C68362b.m265229a((Object) bVar, "collector is null");
        return RxJavaPlugins.onAssembly(new C68570d(this, callable, bVar));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    /* renamed from: a */
    public final <R> AbstractC68307f<R> mo237990a(Function<? super T, ? extends AbstractC70020b<? extends R>> function) {
        return mo237991a(function, 2);
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    /* renamed from: a */
    public final <R> AbstractC68307f<R> mo237991a(Function<? super T, ? extends AbstractC70020b<? extends R>> function, int i) {
        C68362b.m265229a((Object) function, "mapper is null");
        C68362b.m265225a(i, "prefetch");
        if (!(this instanceof AbstractCallableC68371h)) {
            return RxJavaPlugins.onAssembly(new C68574f(this, function, i, ErrorMode.IMMEDIATE));
        }
        Object call = ((AbstractCallableC68371h) this).call();
        if (call == null) {
            return m265097b();
        }
        return ap.m265311a(call, function);
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    /* renamed from: b */
    public final <R> AbstractC68307f<R> mo238006b(Function<? super T, ? extends AbstractC70020b<? extends R>> function) {
        return mo237992a(function, m265072a(), m265072a());
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    /* renamed from: a */
    public final <R> AbstractC68307f<R> mo237992a(Function<? super T, ? extends AbstractC70020b<? extends R>> function, int i, int i2) {
        C68362b.m265229a((Object) function, "mapper is null");
        C68362b.m265225a(i, "maxConcurrency");
        C68362b.m265225a(i2, "prefetch");
        return RxJavaPlugins.onAssembly(new C68582g(this, function, i, i2, ErrorMode.IMMEDIATE));
    }

    @SchedulerSupport("io.reactivex:computation")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    /* renamed from: a */
    public final AbstractC68307f<T> mo237984a(long j, TimeUnit timeUnit, boolean z) {
        return mo237983a(j, timeUnit, C68279a.m265021a(), z);
    }

    @SchedulerSupport("custom")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    /* renamed from: a */
    public final AbstractC68307f<T> mo237983a(long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        C68362b.m265229a((Object) timeUnit, "unit is null");
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new C68598k(this, Math.max(0L, j), timeUnit, scheduler, z));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    /* renamed from: a */
    public final AbstractC68307f<T> mo237995a(AbstractC68309a aVar) {
        C68362b.m265229a((Object) aVar, "onFinally is null");
        return RxJavaPlugins.onAssembly(new C68603l(this, aVar));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    /* renamed from: b */
    public final AbstractC68307f<T> mo238008b(AbstractC68309a aVar) {
        return mo237989a(C68326a.m265193b(), C68326a.f171645g, aVar);
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    /* renamed from: a */
    public final AbstractC68307f<T> mo237988a(Consumer<? super Throwable> consumer) {
        return m265078a(C68326a.m265193b(), consumer, C68326a.f171641c, C68326a.f171641c);
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    /* renamed from: a */
    public final AbstractC68307f<T> mo237989a(Consumer<? super AbstractC70022d> consumer, AbstractC68321m mVar, AbstractC68309a aVar) {
        C68362b.m265229a((Object) consumer, "onSubscribe is null");
        C68362b.m265229a((Object) mVar, "onRequest is null");
        C68362b.m265229a((Object) aVar, "onCancel is null");
        return RxJavaPlugins.onAssembly(new C68609n(this, consumer, mVar, aVar));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    /* renamed from: b */
    public final AbstractC68307f<T> mo238005b(Consumer<? super T> consumer) {
        return m265078a(consumer, C68326a.m265193b(), C68326a.f171641c, C68326a.f171641c);
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    /* renamed from: a */
    public final AbstractC68307f<T> mo237998a(AbstractC68322n<? super T> nVar) {
        C68362b.m265229a((Object) nVar, "predicate is null");
        return RxJavaPlugins.onAssembly(new C68613q(this, nVar));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    /* renamed from: b */
    public final <R> AbstractC68307f<R> mo238007b(Function<? super T, ? extends AbstractC70020b<? extends R>> function, int i) {
        return mo237994a((Function) function, false, i, m265072a());
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    /* renamed from: a */
    public final <R> AbstractC68307f<R> mo237993a(Function<? super T, ? extends AbstractC70020b<? extends R>> function, boolean z, int i) {
        return mo237994a(function, z, i, m265072a());
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    /* renamed from: a */
    public final <R> AbstractC68307f<R> mo237994a(Function<? super T, ? extends AbstractC70020b<? extends R>> function, boolean z, int i, int i2) {
        C68362b.m265229a((Object) function, "mapper is null");
        C68362b.m265225a(i, "maxConcurrency");
        C68362b.m265225a(i2, "bufferSize");
        if (!(this instanceof AbstractCallableC68371h)) {
            return RxJavaPlugins.onAssembly(new C68616r(this, function, z, i, i2));
        }
        Object call = ((AbstractCallableC68371h) this).call();
        if (call == null) {
            return m265097b();
        }
        return ap.m265311a(call, function);
    }

    @SchedulerSupport("custom")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    /* renamed from: a */
    public final AbstractC68307f<T> mo237985a(Scheduler scheduler) {
        return mo237987a(scheduler, false, m265072a());
    }

    @SchedulerSupport("custom")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    /* renamed from: a */
    public final AbstractC68307f<T> mo237987a(Scheduler scheduler, boolean z, int i) {
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        C68362b.m265225a(i, "bufferSize");
        return RxJavaPlugins.onAssembly(new C68527ac(this, scheduler, z, i));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @CheckReturnValue
    /* renamed from: a */
    public final AbstractC68307f<T> mo237980a(int i, boolean z, boolean z2) {
        C68362b.m265225a(i, "bufferSize");
        return RxJavaPlugins.onAssembly(new C68531ad(this, i, z2, z, C68326a.f171641c));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    /* renamed from: b */
    public final AbstractC68307f<T> mo238011b(AbstractC70020b<? extends T> bVar) {
        C68362b.m265229a((Object) bVar, "next is null");
        return mo238026e(C68326a.m265195b(bVar));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    /* renamed from: b */
    public final AbstractC68307f<T> mo238010b(T t) {
        C68362b.m265229a((Object) t, "item is null");
        return mo238029f(C68326a.m265195b((Object) t));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    /* renamed from: a */
    public final AbstractC68307f<T> mo237981a(long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("times >= 0 required but it was " + j);
        } else if (i == 0) {
            return m265097b();
        } else {
            return RxJavaPlugins.onAssembly(new aj(this, j));
        }
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    /* renamed from: a */
    public final AbstractC68307f<T> mo237997a(AbstractC68312d dVar) {
        C68362b.m265229a((Object) dVar, "stop is null");
        return RxJavaPlugins.onAssembly(new ak(this, dVar));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    /* renamed from: a */
    public final AbstractC68307f<T> mo237996a(AbstractC68311c<? super Integer, ? super Throwable> cVar) {
        C68362b.m265229a((Object) cVar, "predicate is null");
        return RxJavaPlugins.onAssembly(new am(this, cVar));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    /* renamed from: a */
    public final AbstractC68307f<T> mo237982a(long j, AbstractC68322n<? super Throwable> nVar) {
        if (j >= 0) {
            C68362b.m265229a((Object) nVar, "predicate is null");
            return RxJavaPlugins.onAssembly(new an(this, j, nVar));
        }
        throw new IllegalArgumentException("times >= 0 required but it was " + j);
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    /* renamed from: b */
    public final AbstractC68307f<T> mo238009b(AbstractC68322n<? super Throwable> nVar) {
        return mo237982a(Long.MAX_VALUE, nVar);
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @CheckReturnValue
    /* renamed from: a */
    public final Disposable mo237979a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, AbstractC68309a aVar, Consumer<? super AbstractC70022d> consumer3) {
        C68362b.m265229a((Object) consumer, "onNext is null");
        C68362b.m265229a((Object) consumer2, "onError is null");
        C68362b.m265229a((Object) aVar, "onComplete is null");
        C68362b.m265229a((Object) consumer3, "onSubscribe is null");
        LambdaSubscriber lambdaSubscriber = new LambdaSubscriber(consumer, consumer2, aVar, consumer3);
        mo238000a((AbstractC68325i) lambdaSubscriber);
        return lambdaSubscriber;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.SPECIAL)
    /* renamed from: a */
    public final void mo238000a(AbstractC68325i<? super T> iVar) {
        C68362b.m265229a((Object) iVar, "s is null");
        try {
            AbstractC70021c<? super T> onSubscribe = RxJavaPlugins.onSubscribe(this, iVar);
            C68362b.m265229a((Object) onSubscribe, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo237905a((AbstractC70021c) onSubscribe);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C68306a.m265071b(th);
            RxJavaPlugins.onError(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    @SchedulerSupport("custom")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    /* renamed from: a */
    public final AbstractC68307f<T> mo237986a(Scheduler scheduler, boolean z) {
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new as(this, scheduler, z));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    /* renamed from: b */
    public static <T> AbstractC68307f<T> m265097b() {
        return RxJavaPlugins.onAssembly(C68611o.f172068b);
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    /* renamed from: e */
    public final AbstractC68307f<T> mo238024e() {
        return mo237980a(m265072a(), false, true);
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    /* renamed from: f */
    public final AbstractC68307f<T> mo238027f() {
        return RxJavaPlugins.onAssembly(new C68533ae(this));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    /* renamed from: g */
    public final AbstractC68307f<T> mo238030g() {
        return RxJavaPlugins.onAssembly(new C68537ag(this));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    /* renamed from: h */
    public final AbstractC68307f<T> mo238032h() {
        return mo237981a(Long.MAX_VALUE);
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    /* renamed from: i */
    public final AbstractC68307f<T> mo238034i() {
        return mo237982a(Long.MAX_VALUE, C68326a.m265198c());
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    /* renamed from: j */
    public final Single<T> mo238035j() {
        return RxJavaPlugins.onAssembly(new ar(this, null));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    /* renamed from: k */
    public final Disposable mo238036k() {
        return mo237979a(C68326a.m265193b(), C68326a.f171644f, C68326a.f171641c, FlowableInternalHelper.RequestMax.INSTANCE);
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    /* renamed from: c */
    public final T mo238017c() {
        C68970d dVar = new C68970d();
        mo238000a((AbstractC68325i) dVar);
        T t = (T) dVar.mo238696a();
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException();
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    /* renamed from: d */
    public final T mo238023d() {
        return mo238035j().blockingGet();
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    /* renamed from: d */
    public final Disposable mo238018d(Consumer<? super T> consumer) {
        return mo237979a(consumer, C68326a.f171644f, C68326a.f171641c, FlowableInternalHelper.RequestMax.INSTANCE);
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    /* renamed from: b */
    public static <T> AbstractC68307f<T> m265099b(Callable<? extends T> callable) {
        C68362b.m265229a((Object) callable, "supplier is null");
        return RxJavaPlugins.onAssembly(new CallableC68624u(callable));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    /* renamed from: c */
    public final AbstractC68307f<T> mo238013c(Consumer<? super AbstractC70022d> consumer) {
        return mo237989a(consumer, C68326a.f171645g, C68326a.f171641c);
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    /* renamed from: e */
    public final AbstractC68307f<T> mo238026e(Function<? super Throwable, ? extends AbstractC70020b<? extends T>> function) {
        C68362b.m265229a((Object) function, "resumeFunction is null");
        return RxJavaPlugins.onAssembly(new C68539ah(this, function, false));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    /* renamed from: g */
    public final AbstractC68307f<T> mo238031g(Function<? super AbstractC68307f<Object>, ? extends AbstractC70020b<?>> function) {
        C68362b.m265229a((Object) function, "handler is null");
        return RxJavaPlugins.onAssembly(new al(this, function));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    /* renamed from: h */
    public final AbstractC68307f<T> mo238033h(Function<? super AbstractC68307f<Throwable>, ? extends AbstractC70020b<?>> function) {
        C68362b.m265229a((Object) function, "handler is null");
        return RxJavaPlugins.onAssembly(new ao(this, function));
    }

    @Override // org.p3511d.AbstractC70020b
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.SPECIAL)
    public final void subscribe(AbstractC70021c<? super T> cVar) {
        if (cVar instanceof AbstractC68325i) {
            mo238000a((AbstractC68325i) ((AbstractC68325i) cVar));
            return;
        }
        C68362b.m265229a((Object) cVar, "s is null");
        mo238000a((AbstractC68325i) new StrictSubscriber(cVar));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    /* renamed from: c */
    public final <R> AbstractC68307f<R> mo238014c(Function<? super T, ? extends AbstractC70020b<? extends R>> function) {
        return mo237994a((Function) function, false, m265072a(), m265072a());
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    /* renamed from: d */
    public final <R> AbstractC68307f<R> mo238020d(Function<? super T, ? extends R> function) {
        C68362b.m265229a((Object) function, "mapper is null");
        return RxJavaPlugins.onAssembly(new C68524ab(this, function));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    /* renamed from: f */
    public final AbstractC68307f<T> mo238029f(Function<? super Throwable, ? extends T> function) {
        C68362b.m265229a((Object) function, "valueSupplier is null");
        return RxJavaPlugins.onAssembly(new C68541ai(this, function));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    /* renamed from: b */
    public static <T> AbstractC68307f<T> m265101b(AbstractC70020b<? extends T>... bVarArr) {
        return m265095a((Object[]) bVarArr).mo238007b(C68326a.m265175a(), bVarArr.length);
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    /* renamed from: c */
    public final AbstractC68307f<T> mo238015c(AbstractC68309a aVar) {
        return m265078a(C68326a.m265193b(), C68326a.m265193b(), aVar, C68326a.f171641c);
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    /* renamed from: d */
    public final AbstractC68307f<T> mo238021d(AbstractC68309a aVar) {
        return m265078a(C68326a.m265193b(), C68326a.m265174a(aVar), aVar, C68326a.f171641c);
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    /* renamed from: c */
    public final AbstractC68307f<T> mo238016c(AbstractC68322n<? super T> nVar) {
        C68362b.m265229a((Object) nVar, "stopPredicate is null");
        return RxJavaPlugins.onAssembly(new C68556at(this, nVar));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    /* renamed from: d */
    public final AbstractC68307f<T> mo238022d(AbstractC68322n<? super T> nVar) {
        C68362b.m265229a((Object) nVar, "predicate is null");
        return RxJavaPlugins.onAssembly(new au(this, nVar));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    /* renamed from: b */
    public final AbstractC68307f<T> mo238002b(long j) {
        return mo237982a(j, C68326a.m265198c());
    }

    @SchedulerSupport("custom")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    /* renamed from: b */
    public final AbstractC68307f<T> mo238004b(Scheduler scheduler) {
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        return mo237986a(scheduler, !(this instanceof C68585i));
    }

    @SchedulerSupport("io.reactivex:computation")
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    /* renamed from: e */
    public final AbstractC68307f<T> mo238025e(long j, TimeUnit timeUnit) {
        return mo238012c(j, timeUnit);
    }

    @SchedulerSupport("io.reactivex:computation")
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    /* renamed from: b */
    public static AbstractC68307f<Long> m265098b(long j, TimeUnit timeUnit) {
        return m265076a(j, timeUnit, C68279a.m265021a());
    }

    @SchedulerSupport("io.reactivex:computation")
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    /* renamed from: c */
    public final AbstractC68307f<T> mo238012c(long j, TimeUnit timeUnit) {
        return mo238003b(j, timeUnit, C68279a.m265021a());
    }

    @SchedulerSupport("io.reactivex:computation")
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    /* renamed from: a */
    public static AbstractC68307f<Long> m265075a(long j, TimeUnit timeUnit) {
        return m265074a(j, j, timeUnit, C68279a.m265021a());
    }

    @SchedulerSupport("io.reactivex:computation")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    /* renamed from: d */
    public final AbstractC68307f<T> mo238019d(long j, TimeUnit timeUnit) {
        return mo237983a(j, timeUnit, C68279a.m265021a(), false);
    }

    @SchedulerSupport("io.reactivex:computation")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    /* renamed from: f */
    public final AbstractC68307f<T> mo238028f(long j, TimeUnit timeUnit) {
        return m265077a(j, timeUnit, (AbstractC70020b) null, C68279a.m265021a());
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    /* renamed from: b */
    public static <T> AbstractC68307f<T> m265100b(AbstractC70020b<? extends T> bVar, AbstractC70020b<? extends T> bVar2) {
        C68362b.m265229a((Object) bVar, "source1 is null");
        C68362b.m265229a((Object) bVar2, "source2 is null");
        return m265095a((Object[]) new AbstractC70020b[]{bVar, bVar2}).mo237993a(C68326a.m265175a(), false, 2);
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    /* renamed from: b */
    public final Disposable mo238001b(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        return mo237979a(consumer, consumer2, C68326a.f171641c, FlowableInternalHelper.RequestMax.INSTANCE);
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @CheckReturnValue
    /* renamed from: a */
    public static <T> AbstractC68307f<T> m265080a(AbstractC68324h<T> hVar, BackpressureStrategy backpressureStrategy) {
        C68362b.m265229a((Object) hVar, "source is null");
        C68362b.m265229a((Object) backpressureStrategy, "mode is null");
        return RxJavaPlugins.onAssembly(new C68585i(hVar, backpressureStrategy));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    /* renamed from: a */
    public final Disposable mo237978a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, AbstractC68309a aVar) {
        return mo237979a(consumer, consumer2, aVar, FlowableInternalHelper.RequestMax.INSTANCE);
    }

    @SchedulerSupport("io.reactivex:computation")
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    /* renamed from: a */
    public static AbstractC68307f<Long> m265073a(long j, long j2, TimeUnit timeUnit) {
        return m265074a(j, j2, timeUnit, C68279a.m265021a());
    }

    @SchedulerSupport("custom")
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    /* renamed from: a */
    public static AbstractC68307f<Long> m265076a(long j, TimeUnit timeUnit, Scheduler scheduler) {
        C68362b.m265229a((Object) timeUnit, "unit is null");
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new aw(Math.max(0L, j), timeUnit, scheduler));
    }

    @SchedulerSupport("custom")
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    /* renamed from: b */
    public final AbstractC68307f<T> mo238003b(long j, TimeUnit timeUnit, Scheduler scheduler) {
        C68362b.m265229a((Object) timeUnit, "unit is null");
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new C68595j(this, j, timeUnit, scheduler));
    }

    @SchedulerSupport("custom")
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    /* renamed from: a */
    public static AbstractC68307f<Long> m265074a(long j, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        C68362b.m265229a((Object) timeUnit, "unit is null");
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new C68633z(Math.max(0L, j), Math.max(0L, j2), timeUnit, scheduler));
    }

    /* renamed from: a */
    private AbstractC68307f<T> m265077a(long j, TimeUnit timeUnit, AbstractC70020b<? extends T> bVar, Scheduler scheduler) {
        C68362b.m265229a((Object) timeUnit, "timeUnit is null");
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new av(this, j, timeUnit, scheduler, bVar));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    /* renamed from: a */
    private AbstractC68307f<T> m265078a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, AbstractC68309a aVar, AbstractC68309a aVar2) {
        C68362b.m265229a((Object) consumer, "onNext is null");
        C68362b.m265229a((Object) consumer2, "onError is null");
        C68362b.m265229a((Object) aVar, "onComplete is null");
        C68362b.m265229a((Object) aVar2, "onAfterTerminate is null");
        return RxJavaPlugins.onAssembly(new C68606m(this, consumer, consumer2, aVar, aVar2));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    /* renamed from: a */
    public static <T, R> AbstractC68307f<R> m265079a(Function<? super Object[], ? extends R> function, boolean z, int i, AbstractC70020b<? extends T>... bVarArr) {
        if (bVarArr.length == 0) {
            return m265097b();
        }
        C68362b.m265229a((Object) function, "zipper is null");
        C68362b.m265225a(i, "bufferSize");
        return RxJavaPlugins.onAssembly(new ax(bVarArr, null, function, i, z));
    }
}
