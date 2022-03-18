package io.reactivex;

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
import io.reactivex.functions.AbstractC68315g;
import io.reactivex.functions.AbstractC68316h;
import io.reactivex.functions.AbstractC68317i;
import io.reactivex.functions.AbstractC68318j;
import io.reactivex.functions.AbstractC68319k;
import io.reactivex.functions.AbstractC68320l;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.observers.BiConsumerSingleObserver;
import io.reactivex.internal.observers.C68382f;
import io.reactivex.internal.observers.ConsumerSingleObserver;
import io.reactivex.internal.observers.FutureC68385i;
import io.reactivex.internal.operators.flowable.C68574f;
import io.reactivex.internal.operators.flowable.C68584h;
import io.reactivex.internal.operators.flowable.C68619s;
import io.reactivex.internal.operators.flowable.ar;
import io.reactivex.internal.operators.maybe.C68636b;
import io.reactivex.internal.operators.maybe.C68638c;
import io.reactivex.internal.operators.observable.C68799db;
import io.reactivex.internal.operators.observable.C68909u;
import io.reactivex.internal.operators.p3461a.C68398d;
import io.reactivex.internal.operators.p3461a.C68407i;
import io.reactivex.internal.operators.p3462b.C68428i;
import io.reactivex.internal.operators.p3463c.C68430a;
import io.reactivex.internal.operators.p3463c.C68432aa;
import io.reactivex.internal.operators.p3463c.C68435ab;
import io.reactivex.internal.operators.p3463c.C68437ac;
import io.reactivex.internal.operators.p3463c.C68438ad;
import io.reactivex.internal.operators.p3463c.C68440ae;
import io.reactivex.internal.operators.p3463c.C68441af;
import io.reactivex.internal.operators.p3463c.C68443ag;
import io.reactivex.internal.operators.p3463c.C68447ah;
import io.reactivex.internal.operators.p3463c.C68448ai;
import io.reactivex.internal.operators.p3463c.C68459at;
import io.reactivex.internal.operators.p3463c.C68468b;
import io.reactivex.internal.operators.p3463c.C68470c;
import io.reactivex.internal.operators.p3463c.C68472d;
import io.reactivex.internal.operators.p3463c.C68474e;
import io.reactivex.internal.operators.p3463c.C68475f;
import io.reactivex.internal.operators.p3463c.C68479g;
import io.reactivex.internal.operators.p3463c.C68481h;
import io.reactivex.internal.operators.p3463c.C68483i;
import io.reactivex.internal.operators.p3463c.C68485j;
import io.reactivex.internal.operators.p3463c.C68487k;
import io.reactivex.internal.operators.p3463c.C68489l;
import io.reactivex.internal.operators.p3463c.C68491m;
import io.reactivex.internal.operators.p3463c.C68493n;
import io.reactivex.internal.operators.p3463c.C68495o;
import io.reactivex.internal.operators.p3463c.C68497p;
import io.reactivex.internal.operators.p3463c.C68499q;
import io.reactivex.internal.operators.p3463c.C68501r;
import io.reactivex.internal.operators.p3463c.C68503s;
import io.reactivex.internal.operators.p3463c.C68505t;
import io.reactivex.internal.operators.p3463c.C68507u;
import io.reactivex.internal.operators.p3463c.C68509v;
import io.reactivex.internal.operators.p3463c.C68510w;
import io.reactivex.internal.operators.p3463c.C68513x;
import io.reactivex.internal.operators.p3463c.C68515y;
import io.reactivex.internal.operators.p3463c.C68517z;
import io.reactivex.internal.operators.p3463c.aj;
import io.reactivex.internal.operators.p3463c.ak;
import io.reactivex.internal.operators.p3463c.al;
import io.reactivex.internal.operators.p3463c.am;
import io.reactivex.internal.operators.p3463c.an;
import io.reactivex.internal.operators.p3463c.ao;
import io.reactivex.internal.operators.p3463c.ap;
import io.reactivex.internal.operators.p3463c.aq;
import io.reactivex.internal.operators.p3463c.as;
import io.reactivex.internal.operators.p3463c.au;
import io.reactivex.internal.operators.p3463c.av;
import io.reactivex.internal.operators.p3463c.aw;
import io.reactivex.internal.operators.p3463c.ax;
import io.reactivex.internal.operators.p3463c.ay;
import io.reactivex.internal.p3459a.C68326a;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.p3460b.AbstractC68365b;
import io.reactivex.internal.p3460b.AbstractC68366c;
import io.reactivex.internal.p3460b.AbstractC68367d;
import io.reactivex.internal.util.C68981f;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.observers.C69005e;
import io.reactivex.p3456d.C68279a;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.p3511d.AbstractC70020b;

public abstract class Single<T> implements AbstractC69015w<T> {
    /* access modifiers changed from: protected */
    public abstract void subscribeActual(AbstractC69012t<? super T> tVar);

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T, R> Single<R> zip(Iterable<? extends AbstractC69015w<? extends T>> iterable, Function<? super Object[], ? extends R> function) {
        C68362b.m265229a((Object) function, "zipper is null");
        C68362b.m265229a((Object) iterable, "sources is null");
        return RxJavaPlugins.onAssembly(new ay(iterable, function));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Single<R> zip(AbstractC69015w<? extends T1> wVar, AbstractC69015w<? extends T2> wVar2, AbstractC69015w<? extends T3> wVar3, AbstractC69015w<? extends T4> wVar4, AbstractC69015w<? extends T5> wVar5, AbstractC69015w<? extends T6> wVar6, AbstractC69015w<? extends T7> wVar7, AbstractC69015w<? extends T8> wVar8, AbstractC69015w<? extends T9> wVar9, AbstractC68320l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> lVar) {
        C68362b.m265229a((Object) wVar, "source1 is null");
        C68362b.m265229a((Object) wVar2, "source2 is null");
        C68362b.m265229a((Object) wVar3, "source3 is null");
        C68362b.m265229a((Object) wVar4, "source4 is null");
        C68362b.m265229a((Object) wVar5, "source5 is null");
        C68362b.m265229a((Object) wVar6, "source6 is null");
        C68362b.m265229a((Object) wVar7, "source7 is null");
        C68362b.m265229a((Object) wVar8, "source8 is null");
        C68362b.m265229a((Object) wVar9, "source9 is null");
        return zipArray(C68326a.m265183a((AbstractC68320l) lVar), wVar, wVar2, wVar3, wVar4, wVar5, wVar6, wVar7, wVar8, wVar9);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Single<T> never() {
        return RxJavaPlugins.onAssembly(al.f171800a);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final T blockingGet() {
        C68382f fVar = new C68382f();
        subscribe(fVar);
        return (T) fVar.mo238110b();
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> cache() {
        return RxJavaPlugins.onAssembly(new C68468b(this));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> hide() {
        return RxJavaPlugins.onAssembly(new C68441af(this));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final AbstractC68259a ignoreElement() {
        return RxJavaPlugins.onAssembly(new C68398d(this));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<C68991m<T>> materialize() {
        return RxJavaPlugins.onAssembly(new ak(this));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> onTerminateDetach() {
        return RxJavaPlugins.onAssembly(new C68489l(this));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final AbstractC68307f<T> repeat() {
        return toFlowable().mo238032h();
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> retry() {
        return toSingle(toFlowable().mo238034i());
    }

    @SchedulerSupport("none")
    public final Disposable subscribe() {
        return subscribe(C68326a.m265193b(), C68326a.f171644f);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final C69005e<T> test() {
        C69005e<T> eVar = new C69005e<>();
        subscribe(eVar);
        return eVar;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final AbstractC68259a toCompletable() {
        return RxJavaPlugins.onAssembly(new C68398d(this));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Future<T> toFuture() {
        return (Future) subscribeWith(new FutureC68385i());
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final AbstractC68307f<T> toFlowable() {
        if (this instanceof AbstractC68365b) {
            return ((AbstractC68365b) this).mo238078a();
        }
        return RxJavaPlugins.onAssembly(new C68459at(this));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final AbstractC68988j<T> toMaybe() {
        if (this instanceof AbstractC68366c) {
            return ((AbstractC68366c) this).mo238079a();
        }
        return RxJavaPlugins.onAssembly(new C68638c(this));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> toObservable() {
        if (this instanceof AbstractC68367d) {
            return ((AbstractC68367d) this).cE_();
        }
        return RxJavaPlugins.onAssembly(new au(this));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <E extends AbstractC69012t<? super T>> E subscribeWith(E e) {
        subscribe(e);
        return e;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> AbstractC68307f<T> concat(AbstractC70020b<? extends AbstractC69015w<? extends T>> bVar) {
        return concat(bVar, 2);
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final AbstractC68307f<T> concatWith(AbstractC69015w<? extends T> wVar) {
        return concat(this, wVar);
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final AbstractC68307f<T> mergeWith(AbstractC69015w<? extends T> wVar) {
        return merge(this, wVar);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Disposable subscribe(Consumer<? super T> consumer) {
        return subscribe(consumer, C68326a.f171644f);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Single<T> amb(Iterable<? extends AbstractC69015w<? extends T>> iterable) {
        C68362b.m265229a((Object) iterable, "sources is null");
        return RxJavaPlugins.onAssembly(new C68430a(null, iterable));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> AbstractC68307f<T> concat(Iterable<? extends AbstractC69015w<? extends T>> iterable) {
        return concat(AbstractC68307f.m265081a((Iterable) iterable));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> AbstractC68307f<T> concatArrayEager(AbstractC69015w<? extends T>... wVarArr) {
        return AbstractC68307f.m265095a((Object[]) wVarArr).mo238006b(C68443ag.m265279b());
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> AbstractC68307f<T> concatEager(Iterable<? extends AbstractC69015w<? extends T>> iterable) {
        return AbstractC68307f.m265081a((Iterable) iterable).mo238006b(C68443ag.m265279b());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Single<T> create(AbstractC69013u<T> uVar) {
        C68362b.m265229a((Object) uVar, "source is null");
        return RxJavaPlugins.onAssembly(new C68472d(uVar));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Single<T> defer(Callable<? extends AbstractC69015w<? extends T>> callable) {
        C68362b.m265229a((Object) callable, "singleSupplier is null");
        return RxJavaPlugins.onAssembly(new C68474e(callable));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Single<T> error(Throwable th) {
        C68362b.m265229a((Object) th, "error is null");
        return error(C68326a.m265192a(th));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Single<T> fromCallable(Callable<? extends T> callable) {
        C68362b.m265229a((Object) callable, "callable is null");
        return RxJavaPlugins.onAssembly(new C68437ac(callable));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Single<T> fromFuture(Future<? extends T> future) {
        return toSingle(AbstractC68307f.m265086a((Future) future));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Single<T> fromObservable(ObservableSource<? extends T> observableSource) {
        C68362b.m265229a((Object) observableSource, "observableSource is null");
        return RxJavaPlugins.onAssembly(new C68799db(observableSource, null));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public static <T> Single<T> fromPublisher(AbstractC70020b<? extends T> bVar) {
        C68362b.m265229a((Object) bVar, "publisher is null");
        return RxJavaPlugins.onAssembly(new C68438ad(bVar));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Single<T> just(T t) {
        C68362b.m265229a((Object) t, "value is null");
        return RxJavaPlugins.onAssembly(new C68447ah(t));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> AbstractC68307f<T> merge(Iterable<? extends AbstractC69015w<? extends T>> iterable) {
        return merge(AbstractC68307f.m265081a((Iterable) iterable));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> AbstractC68307f<T> mergeDelayError(Iterable<? extends AbstractC69015w<? extends T>> iterable) {
        return mergeDelayError(AbstractC68307f.m265081a((Iterable) iterable));
    }

    private static <T> Single<T> toSingle(AbstractC68307f<T> fVar) {
        return RxJavaPlugins.onAssembly(new ar(fVar, null));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> R as(AbstractC69010r<T, ? extends R> rVar) {
        return (R) ((AbstractC69010r) C68362b.m265229a((Object) rVar, "converter is null")).mo238792a(this);
    }

    /* JADX DEBUG: Type inference failed for r2v2. Raw type applied. Possible types: io.reactivex.Single<R>, io.reactivex.Single<U> */
    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U> Single<U> cast(Class<? extends U> cls) {
        C68362b.m265229a((Object) cls, "clazz is null");
        return (Single<R>) map(C68326a.m265184a((Class) cls));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<Boolean> contains(Object obj) {
        return contains(obj, C68362b.m265228a());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> AbstractC68988j<R> dematerialize(Function<? super T, C68991m<R>> function) {
        C68362b.m265229a((Object) function, "selector is null");
        return RxJavaPlugins.onAssembly(new C68487k(this, function));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> doAfterSuccess(Consumer<? super T> consumer) {
        C68362b.m265229a((Object) consumer, "doAfterSuccess is null");
        return RxJavaPlugins.onAssembly(new C68491m(this, consumer));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> doAfterTerminate(AbstractC68309a aVar) {
        C68362b.m265229a((Object) aVar, "onAfterTerminate is null");
        return RxJavaPlugins.onAssembly(new C68493n(this, aVar));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> doFinally(AbstractC68309a aVar) {
        C68362b.m265229a((Object) aVar, "onFinally is null");
        return RxJavaPlugins.onAssembly(new C68495o(this, aVar));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> doOnDispose(AbstractC68309a aVar) {
        C68362b.m265229a((Object) aVar, "onDispose is null");
        return RxJavaPlugins.onAssembly(new C68497p(this, aVar));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> doOnError(Consumer<? super Throwable> consumer) {
        C68362b.m265229a((Object) consumer, "onError is null");
        return RxJavaPlugins.onAssembly(new C68499q(this, consumer));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> doOnEvent(AbstractC68310b<? super T, ? super Throwable> bVar) {
        C68362b.m265229a((Object) bVar, "onEvent is null");
        return RxJavaPlugins.onAssembly(new C68501r(this, bVar));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> doOnSubscribe(Consumer<? super Disposable> consumer) {
        C68362b.m265229a((Object) consumer, "onSubscribe is null");
        return RxJavaPlugins.onAssembly(new C68503s(this, consumer));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> doOnSuccess(Consumer<? super T> consumer) {
        C68362b.m265229a((Object) consumer, "onSuccess is null");
        return RxJavaPlugins.onAssembly(new C68505t(this, consumer));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final AbstractC68988j<T> filter(AbstractC68322n<? super T> nVar) {
        C68362b.m265229a((Object) nVar, "predicate is null");
        return RxJavaPlugins.onAssembly(new C68636b(this, nVar));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Single<R> flatMap(Function<? super T, ? extends AbstractC69015w<? extends R>> function) {
        C68362b.m265229a((Object) function, "mapper is null");
        return RxJavaPlugins.onAssembly(new C68510w(this, function));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final AbstractC68259a flatMapCompletable(Function<? super T, ? extends AbstractC68293e> function) {
        C68362b.m265229a((Object) function, "mapper is null");
        return RxJavaPlugins.onAssembly(new C68513x(this, function));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> AbstractC68988j<R> flatMapMaybe(Function<? super T, ? extends AbstractC68990l<? extends R>> function) {
        C68362b.m265229a((Object) function, "mapper is null");
        return RxJavaPlugins.onAssembly(new C68432aa(this, function));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> flatMapObservable(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        C68362b.m265229a((Object) function, "mapper is null");
        return RxJavaPlugins.onAssembly(new C68428i(this, function));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <R> AbstractC68307f<R> flatMapPublisher(Function<? super T, ? extends AbstractC70020b<? extends R>> function) {
        C68362b.m265229a((Object) function, "mapper is null");
        return RxJavaPlugins.onAssembly(new C68435ab(this, function));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <U> AbstractC68307f<U> flattenAsFlowable(Function<? super T, ? extends Iterable<? extends U>> function) {
        C68362b.m265229a((Object) function, "mapper is null");
        return RxJavaPlugins.onAssembly(new C68515y(this, function));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U> Observable<U> flattenAsObservable(Function<? super T, ? extends Iterable<? extends U>> function) {
        C68362b.m265229a((Object) function, "mapper is null");
        return RxJavaPlugins.onAssembly(new C68517z(this, function));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Single<R> lift(AbstractC69014v<? extends R, ? super T> vVar) {
        C68362b.m265229a((Object) vVar, "onLift is null");
        return RxJavaPlugins.onAssembly(new C68448ai(this, vVar));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Single<R> map(Function<? super T, ? extends R> function) {
        C68362b.m265229a((Object) function, "mapper is null");
        return RxJavaPlugins.onAssembly(new aj(this, function));
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Single<T> observeOn(Scheduler scheduler) {
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new am(this, scheduler));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> onErrorResumeNext(Single<? extends T> single) {
        C68362b.m265229a((Object) single, "resumeSingleInCaseOfError is null");
        return onErrorResumeNext(C68326a.m265195b(single));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> onErrorReturn(Function<Throwable, ? extends T> function) {
        C68362b.m265229a((Object) function, "resumeFunction is null");
        return RxJavaPlugins.onAssembly(new an(this, function, null));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> onErrorReturnItem(T t) {
        C68362b.m265229a((Object) t, "value is null");
        return RxJavaPlugins.onAssembly(new an(this, null, t));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final AbstractC68307f<T> repeatUntil(AbstractC68312d dVar) {
        return toFlowable().mo237997a(dVar);
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final AbstractC68307f<T> repeatWhen(Function<? super AbstractC68307f<Object>, ? extends AbstractC70020b<?>> function) {
        return toFlowable().mo238031g(function);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> retryWhen(Function<? super AbstractC68307f<Throwable>, ? extends AbstractC70020b<?>> function) {
        return toSingle(toFlowable().mo238033h(function));
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Single<T> subscribeOn(Scheduler scheduler) {
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ap(this, scheduler));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> takeUntil(AbstractC68293e eVar) {
        C68362b.m265229a((Object) eVar, "other is null");
        return takeUntil(new C68407i(eVar));
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Single<T> unsubscribeOn(Scheduler scheduler) {
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new av(this, scheduler));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> concat(ObservableSource<? extends AbstractC69015w<? extends T>> observableSource) {
        C68362b.m265229a((Object) observableSource, "sources is null");
        return RxJavaPlugins.onAssembly(new C68909u(observableSource, C68443ag.m265280c(), 2, ErrorMode.IMMEDIATE));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> AbstractC68307f<T> concatArray(AbstractC69015w<? extends T>... wVarArr) {
        return RxJavaPlugins.onAssembly(new C68574f(AbstractC68307f.m265095a((Object[]) wVarArr), C68443ag.m265279b(), 2, ErrorMode.BOUNDARY));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> AbstractC68307f<T> concatEager(AbstractC70020b<? extends AbstractC69015w<? extends T>> bVar) {
        return AbstractC68307f.m265090a((AbstractC70020b) bVar).mo238006b(C68443ag.m265279b());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Single<T> error(Callable<? extends Throwable> callable) {
        C68362b.m265229a((Object) callable, "errorSupplier is null");
        return RxJavaPlugins.onAssembly(new C68509v(callable));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Single<T> merge(AbstractC69015w<? extends AbstractC69015w<? extends T>> wVar) {
        C68362b.m265229a((Object) wVar, "source is null");
        return RxJavaPlugins.onAssembly(new C68510w(wVar, C68326a.m265175a()));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Single<T> unsafeCreate(AbstractC69015w<T> wVar) {
        C68362b.m265229a((Object) wVar, "onSubscribe is null");
        if (!(wVar instanceof Single)) {
            return RxJavaPlugins.onAssembly(new C68440ae(wVar));
        }
        throw new IllegalArgumentException("unsafeCreate(Single) should be upgraded");
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Single<T> wrap(AbstractC69015w<T> wVar) {
        C68362b.m265229a((Object) wVar, "source is null");
        if (wVar instanceof Single) {
            return RxJavaPlugins.onAssembly((Single) wVar);
        }
        return RxJavaPlugins.onAssembly(new C68440ae(wVar));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> ambWith(AbstractC69015w<? extends T> wVar) {
        C68362b.m265229a((Object) wVar, "other is null");
        return ambArray(this, wVar);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Single<R> compose(AbstractC69016x<? super T, ? extends R> xVar) {
        return wrap(((AbstractC69016x) C68362b.m265229a((Object) xVar, "transformer is null")).mo238794a(this));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> onErrorResumeNext(Function<? super Throwable, ? extends AbstractC69015w<? extends T>> function) {
        C68362b.m265229a((Object) function, "resumeFunctionInCaseOfError is null");
        return RxJavaPlugins.onAssembly(new ao(this, function));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final AbstractC68307f<T> repeat(long j) {
        return toFlowable().mo237981a(j);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> retry(long j) {
        return toSingle(toFlowable().mo238002b(j));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <E> Single<T> takeUntil(AbstractC69015w<? extends E> wVar) {
        C68362b.m265229a((Object) wVar, "other is null");
        return takeUntil(new C68459at(wVar));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final C69005e<T> test(boolean z) {
        C69005e<T> eVar = new C69005e<>();
        if (z) {
            eVar.mo238790a();
        }
        subscribe(eVar);
        return eVar;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> R to(Function<? super Single<T>, R> function) {
        try {
            return (R) ((Function) C68362b.m265229a((Object) function, "convert is null")).apply(this);
        } catch (Throwable th) {
            C68306a.m265071b(th);
            throw C68981f.m265557a(th);
        }
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Single<T> ambArray(AbstractC69015w<? extends T>... wVarArr) {
        if (wVarArr.length == 0) {
            return error(C68443ag.m265278a());
        }
        if (wVarArr.length == 1) {
            return wrap(wVarArr[0]);
        }
        return RxJavaPlugins.onAssembly(new C68430a(wVarArr, null));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U> Single<T> delaySubscription(ObservableSource<U> observableSource) {
        C68362b.m265229a((Object) observableSource, "other is null");
        return RxJavaPlugins.onAssembly(new C68481h(this, observableSource));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Disposable subscribe(AbstractC68310b<? super T, ? super Throwable> bVar) {
        C68362b.m265229a((Object) bVar, "onCallback is null");
        BiConsumerSingleObserver biConsumerSingleObserver = new BiConsumerSingleObserver(bVar);
        subscribe(biConsumerSingleObserver);
        return biConsumerSingleObserver;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <E> Single<T> takeUntil(AbstractC70020b<E> bVar) {
        C68362b.m265229a((Object) bVar, "other is null");
        return RxJavaPlugins.onAssembly(new aq(this, bVar));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> delaySubscription(AbstractC68293e eVar) {
        C68362b.m265229a((Object) eVar, "other is null");
        return RxJavaPlugins.onAssembly(new C68479g(this, eVar));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> retry(AbstractC68311c<? super Integer, ? super Throwable> cVar) {
        return toSingle(toFlowable().mo237996a(cVar));
    }

    @Override // io.reactivex.AbstractC69015w
    @SchedulerSupport("none")
    public final void subscribe(AbstractC69012t<? super T> tVar) {
        C68362b.m265229a((Object) tVar, "subscriber is null");
        AbstractC69012t<? super T> onSubscribe = RxJavaPlugins.onSubscribe(this, tVar);
        C68362b.m265229a((Object) onSubscribe, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            subscribeActual(onSubscribe);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C68306a.m265071b(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> AbstractC68307f<T> mergeDelayError(AbstractC70020b<? extends AbstractC69015w<? extends T>> bVar) {
        C68362b.m265229a((Object) bVar, "sources is null");
        return RxJavaPlugins.onAssembly(new C68619s(bVar, C68443ag.m265279b(), true, Integer.MAX_VALUE, AbstractC68307f.m265072a()));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U> Single<T> delaySubscription(AbstractC69015w<U> wVar) {
        C68362b.m265229a((Object) wVar, "other is null");
        return RxJavaPlugins.onAssembly(new C68485j(this, wVar));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> retry(AbstractC68322n<? super Throwable> nVar) {
        return toSingle(toFlowable().mo238009b(nVar));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> AbstractC68307f<T> merge(AbstractC70020b<? extends AbstractC69015w<? extends T>> bVar) {
        C68362b.m265229a((Object) bVar, "sources is null");
        return RxJavaPlugins.onAssembly(new C68619s(bVar, C68443ag.m265279b(), false, Integer.MAX_VALUE, AbstractC68307f.m265072a()));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <U> Single<T> delaySubscription(AbstractC70020b<U> bVar) {
        C68362b.m265229a((Object) bVar, "other is null");
        return RxJavaPlugins.onAssembly(new C68483i(this, bVar));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U, R> Single<R> zipWith(AbstractC69015w<U> wVar, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        return zip(this, wVar, biFunction);
    }

    @SchedulerSupport("io.reactivex:computation")
    @CheckReturnValue
    public static Single<Long> timer(long j, TimeUnit timeUnit) {
        return timer(j, timeUnit, C68279a.m265021a());
    }

    @SchedulerSupport("io.reactivex:computation")
    @CheckReturnValue
    public final Single<T> delay(long j, TimeUnit timeUnit) {
        return delay(j, timeUnit, C68279a.m265021a(), false);
    }

    @SchedulerSupport("io.reactivex:computation")
    @CheckReturnValue
    public final Single<T> delaySubscription(long j, TimeUnit timeUnit) {
        return delaySubscription(j, timeUnit, C68279a.m265021a());
    }

    @SchedulerSupport("io.reactivex:computation")
    @CheckReturnValue
    public final Single<T> timeout(long j, TimeUnit timeUnit) {
        return timeout0(j, timeUnit, C68279a.m265021a(), null);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Single<Boolean> equals(AbstractC69015w<? extends T> wVar, AbstractC69015w<? extends T> wVar2) {
        C68362b.m265229a((Object) wVar, "first is null");
        C68362b.m265229a((Object) wVar2, "second is null");
        return RxJavaPlugins.onAssembly(new C68507u(wVar, wVar2));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> AbstractC68307f<T> mergeDelayError(AbstractC69015w<? extends T> wVar, AbstractC69015w<? extends T> wVar2) {
        C68362b.m265229a((Object) wVar, "source1 is null");
        C68362b.m265229a((Object) wVar2, "source2 is null");
        return mergeDelayError(AbstractC68307f.m265095a((Object[]) new AbstractC69015w[]{wVar, wVar2}));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<Boolean> contains(Object obj, AbstractC68311c<Object, Object> cVar) {
        C68362b.m265229a(obj, "value is null");
        C68362b.m265229a((Object) cVar, "comparer is null");
        return RxJavaPlugins.onAssembly(new C68470c(this, obj, cVar));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        C68362b.m265229a((Object) consumer, "onSuccess is null");
        C68362b.m265229a((Object) consumer2, "onError is null");
        ConsumerSingleObserver consumerSingleObserver = new ConsumerSingleObserver(consumer, consumer2);
        subscribe(consumerSingleObserver);
        return consumerSingleObserver;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> AbstractC68307f<T> concat(AbstractC69015w<? extends T> wVar, AbstractC69015w<? extends T> wVar2) {
        C68362b.m265229a((Object) wVar, "source1 is null");
        C68362b.m265229a((Object) wVar2, "source2 is null");
        return concat(AbstractC68307f.m265095a((Object[]) new AbstractC69015w[]{wVar, wVar2}));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> AbstractC68307f<T> merge(AbstractC69015w<? extends T> wVar, AbstractC69015w<? extends T> wVar2) {
        C68362b.m265229a((Object) wVar, "source1 is null");
        C68362b.m265229a((Object) wVar2, "source2 is null");
        return merge(AbstractC68307f.m265095a((Object[]) new AbstractC69015w[]{wVar, wVar2}));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T, R> Single<R> zipArray(Function<? super Object[], ? extends R> function, AbstractC69015w<? extends T>... wVarArr) {
        C68362b.m265229a((Object) function, "zipper is null");
        C68362b.m265229a((Object) wVarArr, "sources is null");
        if (wVarArr.length == 0) {
            return error(new NoSuchElementException());
        }
        return RxJavaPlugins.onAssembly(new ax(wVarArr, function));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> retry(long j, AbstractC68322n<? super Throwable> nVar) {
        return toSingle(toFlowable().mo237982a(j, nVar));
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public static <T> Single<T> fromFuture(Future<? extends T> future, Scheduler scheduler) {
        return toSingle(AbstractC68307f.m265089a(future, scheduler));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> AbstractC68307f<T> concat(AbstractC70020b<? extends AbstractC69015w<? extends T>> bVar, int i) {
        C68362b.m265229a((Object) bVar, "sources is null");
        C68362b.m265225a(i, "prefetch");
        return RxJavaPlugins.onAssembly(new C68584h(bVar, C68443ag.m265279b(), i, ErrorMode.IMMEDIATE));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T, U> Single<T> using(Callable<U> callable, Function<? super U, ? extends AbstractC69015w<? extends T>> function, Consumer<? super U> consumer) {
        return using(callable, function, consumer, true);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Single<T> fromFuture(Future<? extends T> future, long j, TimeUnit timeUnit) {
        return toSingle(AbstractC68307f.m265087a(future, j, timeUnit));
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public static Single<Long> timer(long j, TimeUnit timeUnit, Scheduler scheduler) {
        C68362b.m265229a((Object) timeUnit, "unit is null");
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new as(j, timeUnit, scheduler));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T1, T2, R> Single<R> zip(AbstractC69015w<? extends T1> wVar, AbstractC69015w<? extends T2> wVar2, BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        C68362b.m265229a((Object) wVar, "source1 is null");
        C68362b.m265229a((Object) wVar2, "source2 is null");
        return zipArray(C68326a.m265176a((BiFunction) biFunction), wVar, wVar2);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Single<T> delay(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return delay(j, timeUnit, scheduler, false);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Single<T> delaySubscription(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return delaySubscription(Observable.timer(j, timeUnit, scheduler));
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Single<T> timeout(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return timeout0(j, timeUnit, scheduler, null);
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> AbstractC68307f<T> mergeDelayError(AbstractC69015w<? extends T> wVar, AbstractC69015w<? extends T> wVar2, AbstractC69015w<? extends T> wVar3) {
        C68362b.m265229a((Object) wVar, "source1 is null");
        C68362b.m265229a((Object) wVar2, "source2 is null");
        C68362b.m265229a((Object) wVar3, "source3 is null");
        return mergeDelayError(AbstractC68307f.m265095a((Object[]) new AbstractC69015w[]{wVar, wVar2, wVar3}));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> AbstractC68307f<T> concat(AbstractC69015w<? extends T> wVar, AbstractC69015w<? extends T> wVar2, AbstractC69015w<? extends T> wVar3) {
        C68362b.m265229a((Object) wVar, "source1 is null");
        C68362b.m265229a((Object) wVar2, "source2 is null");
        C68362b.m265229a((Object) wVar3, "source3 is null");
        return concat(AbstractC68307f.m265095a((Object[]) new AbstractC69015w[]{wVar, wVar2, wVar3}));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> AbstractC68307f<T> merge(AbstractC69015w<? extends T> wVar, AbstractC69015w<? extends T> wVar2, AbstractC69015w<? extends T> wVar3) {
        C68362b.m265229a((Object) wVar, "source1 is null");
        C68362b.m265229a((Object) wVar2, "source2 is null");
        C68362b.m265229a((Object) wVar3, "source3 is null");
        return merge(AbstractC68307f.m265095a((Object[]) new AbstractC69015w[]{wVar, wVar2, wVar3}));
    }

    @SchedulerSupport("io.reactivex:computation")
    @CheckReturnValue
    public final Single<T> delay(long j, TimeUnit timeUnit, boolean z) {
        return delay(j, timeUnit, C68279a.m265021a(), z);
    }

    @SchedulerSupport("io.reactivex:computation")
    @CheckReturnValue
    public final Single<T> timeout(long j, TimeUnit timeUnit, AbstractC69015w<? extends T> wVar) {
        C68362b.m265229a((Object) wVar, "other is null");
        return timeout0(j, timeUnit, C68279a.m265021a(), wVar);
    }

    private Single<T> timeout0(long j, TimeUnit timeUnit, Scheduler scheduler, AbstractC69015w<? extends T> wVar) {
        C68362b.m265229a((Object) timeUnit, "unit is null");
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.p3463c.ar(this, j, timeUnit, scheduler, wVar));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T, U> Single<T> using(Callable<U> callable, Function<? super U, ? extends AbstractC69015w<? extends T>> function, Consumer<? super U> consumer, boolean z) {
        C68362b.m265229a((Object) callable, "resourceSupplier is null");
        C68362b.m265229a((Object) function, "singleFunction is null");
        C68362b.m265229a((Object) consumer, "disposer is null");
        return RxJavaPlugins.onAssembly(new aw(callable, function, consumer, z));
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public static <T> Single<T> fromFuture(Future<? extends T> future, long j, TimeUnit timeUnit, Scheduler scheduler) {
        return toSingle(AbstractC68307f.m265088a(future, j, timeUnit, scheduler));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T1, T2, T3, R> Single<R> zip(AbstractC69015w<? extends T1> wVar, AbstractC69015w<? extends T2> wVar2, AbstractC69015w<? extends T3> wVar3, AbstractC68314f<? super T1, ? super T2, ? super T3, ? extends R> fVar) {
        C68362b.m265229a((Object) wVar, "source1 is null");
        C68362b.m265229a((Object) wVar2, "source2 is null");
        C68362b.m265229a((Object) wVar3, "source3 is null");
        return zipArray(C68326a.m265177a((AbstractC68314f) fVar), wVar, wVar2, wVar3);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Single<T> delay(long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        C68362b.m265229a((Object) timeUnit, "unit is null");
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new C68475f(this, j, timeUnit, scheduler, z));
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Single<T> timeout(long j, TimeUnit timeUnit, Scheduler scheduler, AbstractC69015w<? extends T> wVar) {
        C68362b.m265229a((Object) wVar, "other is null");
        return timeout0(j, timeUnit, scheduler, wVar);
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> AbstractC68307f<T> mergeDelayError(AbstractC69015w<? extends T> wVar, AbstractC69015w<? extends T> wVar2, AbstractC69015w<? extends T> wVar3, AbstractC69015w<? extends T> wVar4) {
        C68362b.m265229a((Object) wVar, "source1 is null");
        C68362b.m265229a((Object) wVar2, "source2 is null");
        C68362b.m265229a((Object) wVar3, "source3 is null");
        C68362b.m265229a((Object) wVar4, "source4 is null");
        return mergeDelayError(AbstractC68307f.m265095a((Object[]) new AbstractC69015w[]{wVar, wVar2, wVar3, wVar4}));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> AbstractC68307f<T> concat(AbstractC69015w<? extends T> wVar, AbstractC69015w<? extends T> wVar2, AbstractC69015w<? extends T> wVar3, AbstractC69015w<? extends T> wVar4) {
        C68362b.m265229a((Object) wVar, "source1 is null");
        C68362b.m265229a((Object) wVar2, "source2 is null");
        C68362b.m265229a((Object) wVar3, "source3 is null");
        C68362b.m265229a((Object) wVar4, "source4 is null");
        return concat(AbstractC68307f.m265095a((Object[]) new AbstractC69015w[]{wVar, wVar2, wVar3, wVar4}));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> AbstractC68307f<T> merge(AbstractC69015w<? extends T> wVar, AbstractC69015w<? extends T> wVar2, AbstractC69015w<? extends T> wVar3, AbstractC69015w<? extends T> wVar4) {
        C68362b.m265229a((Object) wVar, "source1 is null");
        C68362b.m265229a((Object) wVar2, "source2 is null");
        C68362b.m265229a((Object) wVar3, "source3 is null");
        C68362b.m265229a((Object) wVar4, "source4 is null");
        return merge(AbstractC68307f.m265095a((Object[]) new AbstractC69015w[]{wVar, wVar2, wVar3, wVar4}));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T1, T2, T3, T4, R> Single<R> zip(AbstractC69015w<? extends T1> wVar, AbstractC69015w<? extends T2> wVar2, AbstractC69015w<? extends T3> wVar3, AbstractC69015w<? extends T4> wVar4, AbstractC68315g<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> gVar) {
        C68362b.m265229a((Object) wVar, "source1 is null");
        C68362b.m265229a((Object) wVar2, "source2 is null");
        C68362b.m265229a((Object) wVar3, "source3 is null");
        C68362b.m265229a((Object) wVar4, "source4 is null");
        return zipArray(C68326a.m265178a((AbstractC68315g) gVar), wVar, wVar2, wVar3, wVar4);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T1, T2, T3, T4, T5, R> Single<R> zip(AbstractC69015w<? extends T1> wVar, AbstractC69015w<? extends T2> wVar2, AbstractC69015w<? extends T3> wVar3, AbstractC69015w<? extends T4> wVar4, AbstractC69015w<? extends T5> wVar5, AbstractC68316h<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> hVar) {
        C68362b.m265229a((Object) wVar, "source1 is null");
        C68362b.m265229a((Object) wVar2, "source2 is null");
        C68362b.m265229a((Object) wVar3, "source3 is null");
        C68362b.m265229a((Object) wVar4, "source4 is null");
        C68362b.m265229a((Object) wVar5, "source5 is null");
        return zipArray(C68326a.m265179a((AbstractC68316h) hVar), wVar, wVar2, wVar3, wVar4, wVar5);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T1, T2, T3, T4, T5, T6, R> Single<R> zip(AbstractC69015w<? extends T1> wVar, AbstractC69015w<? extends T2> wVar2, AbstractC69015w<? extends T3> wVar3, AbstractC69015w<? extends T4> wVar4, AbstractC69015w<? extends T5> wVar5, AbstractC69015w<? extends T6> wVar6, AbstractC68317i<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> iVar) {
        C68362b.m265229a((Object) wVar, "source1 is null");
        C68362b.m265229a((Object) wVar2, "source2 is null");
        C68362b.m265229a((Object) wVar3, "source3 is null");
        C68362b.m265229a((Object) wVar4, "source4 is null");
        C68362b.m265229a((Object) wVar5, "source5 is null");
        C68362b.m265229a((Object) wVar6, "source6 is null");
        return zipArray(C68326a.m265180a((AbstractC68317i) iVar), wVar, wVar2, wVar3, wVar4, wVar5, wVar6);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T1, T2, T3, T4, T5, T6, T7, R> Single<R> zip(AbstractC69015w<? extends T1> wVar, AbstractC69015w<? extends T2> wVar2, AbstractC69015w<? extends T3> wVar3, AbstractC69015w<? extends T4> wVar4, AbstractC69015w<? extends T5> wVar5, AbstractC69015w<? extends T6> wVar6, AbstractC69015w<? extends T7> wVar7, AbstractC68318j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> jVar) {
        C68362b.m265229a((Object) wVar, "source1 is null");
        C68362b.m265229a((Object) wVar2, "source2 is null");
        C68362b.m265229a((Object) wVar3, "source3 is null");
        C68362b.m265229a((Object) wVar4, "source4 is null");
        C68362b.m265229a((Object) wVar5, "source5 is null");
        C68362b.m265229a((Object) wVar6, "source6 is null");
        C68362b.m265229a((Object) wVar7, "source7 is null");
        return zipArray(C68326a.m265181a((AbstractC68318j) jVar), wVar, wVar2, wVar3, wVar4, wVar5, wVar6, wVar7);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Single<R> zip(AbstractC69015w<? extends T1> wVar, AbstractC69015w<? extends T2> wVar2, AbstractC69015w<? extends T3> wVar3, AbstractC69015w<? extends T4> wVar4, AbstractC69015w<? extends T5> wVar5, AbstractC69015w<? extends T6> wVar6, AbstractC69015w<? extends T7> wVar7, AbstractC69015w<? extends T8> wVar8, AbstractC68319k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> kVar) {
        C68362b.m265229a((Object) wVar, "source1 is null");
        C68362b.m265229a((Object) wVar2, "source2 is null");
        C68362b.m265229a((Object) wVar3, "source3 is null");
        C68362b.m265229a((Object) wVar4, "source4 is null");
        C68362b.m265229a((Object) wVar5, "source5 is null");
        C68362b.m265229a((Object) wVar6, "source6 is null");
        C68362b.m265229a((Object) wVar7, "source7 is null");
        C68362b.m265229a((Object) wVar8, "source8 is null");
        return zipArray(C68326a.m265182a((AbstractC68319k) kVar), wVar, wVar2, wVar3, wVar4, wVar5, wVar6, wVar7, wVar8);
    }
}
