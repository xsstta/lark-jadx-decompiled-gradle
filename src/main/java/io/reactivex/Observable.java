package io.reactivex;

import android.util.Log;
import com.larksuite.framework.thread.C26165s;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
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
import io.reactivex.internal.observers.C68380d;
import io.reactivex.internal.observers.C68381e;
import io.reactivex.internal.observers.ForEachWhileObserver;
import io.reactivex.internal.observers.FutureC68384h;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.internal.operators.flowable.C68535af;
import io.reactivex.internal.operators.flowable.C68630x;
import io.reactivex.internal.operators.observable.C68652aa;
import io.reactivex.internal.operators.observable.C68654ab;
import io.reactivex.internal.operators.observable.C68657ac;
import io.reactivex.internal.operators.observable.C68660ad;
import io.reactivex.internal.operators.observable.C68663ae;
import io.reactivex.internal.operators.observable.C68664af;
import io.reactivex.internal.operators.observable.C68669ag;
import io.reactivex.internal.operators.observable.C68672ah;
import io.reactivex.internal.operators.observable.C68674ai;
import io.reactivex.internal.operators.observable.C68684at;
import io.reactivex.internal.operators.observable.C68696b;
import io.reactivex.internal.operators.observable.C68702bg;
import io.reactivex.internal.operators.observable.C68711bm;
import io.reactivex.internal.operators.observable.C68737by;
import io.reactivex.internal.operators.observable.C68742c;
import io.reactivex.internal.operators.observable.C68795d;
import io.reactivex.internal.operators.observable.C68799db;
import io.reactivex.internal.operators.observable.C68809di;
import io.reactivex.internal.operators.observable.C68821dr;
import io.reactivex.internal.operators.observable.C68839e;
import io.reactivex.internal.operators.observable.C68851ee;
import io.reactivex.internal.operators.observable.C68870g;
import io.reactivex.internal.operators.observable.C68872h;
import io.reactivex.internal.operators.observable.C68877j;
import io.reactivex.internal.operators.observable.C68879k;
import io.reactivex.internal.operators.observable.C68880l;
import io.reactivex.internal.operators.observable.C68883m;
import io.reactivex.internal.operators.observable.C68887n;
import io.reactivex.internal.operators.observable.C68890o;
import io.reactivex.internal.operators.observable.C68893p;
import io.reactivex.internal.operators.observable.C68899q;
import io.reactivex.internal.operators.observable.C68904s;
import io.reactivex.internal.operators.observable.C68906t;
import io.reactivex.internal.operators.observable.C68909u;
import io.reactivex.internal.operators.observable.C68914v;
import io.reactivex.internal.operators.observable.C68916w;
import io.reactivex.internal.operators.observable.C68918x;
import io.reactivex.internal.operators.observable.C68920y;
import io.reactivex.internal.operators.observable.Cdo;
import io.reactivex.internal.operators.observable.ObservableGroupBy;
import io.reactivex.internal.operators.observable.ObservableScalarXMap;
import io.reactivex.internal.operators.observable.aj;
import io.reactivex.internal.operators.observable.ak;
import io.reactivex.internal.operators.observable.al;
import io.reactivex.internal.operators.observable.am;
import io.reactivex.internal.operators.observable.an;
import io.reactivex.internal.operators.observable.ao;
import io.reactivex.internal.operators.observable.aq;
import io.reactivex.internal.operators.observable.ar;
import io.reactivex.internal.operators.observable.as;
import io.reactivex.internal.operators.observable.au;
import io.reactivex.internal.operators.observable.av;
import io.reactivex.internal.operators.observable.ax;
import io.reactivex.internal.operators.observable.ay;
import io.reactivex.internal.operators.observable.az;
import io.reactivex.internal.operators.observable.ba;
import io.reactivex.internal.operators.observable.bb;
import io.reactivex.internal.operators.observable.bc;
import io.reactivex.internal.operators.observable.bd;
import io.reactivex.internal.operators.observable.be;
import io.reactivex.internal.operators.observable.bf;
import io.reactivex.internal.operators.observable.bh;
import io.reactivex.internal.operators.observable.bi;
import io.reactivex.internal.operators.observable.bj;
import io.reactivex.internal.operators.observable.bk;
import io.reactivex.internal.operators.observable.bl;
import io.reactivex.internal.operators.observable.bn;
import io.reactivex.internal.operators.observable.bo;
import io.reactivex.internal.operators.observable.bp;
import io.reactivex.internal.operators.observable.bq;
import io.reactivex.internal.operators.observable.br;
import io.reactivex.internal.operators.observable.bs;
import io.reactivex.internal.operators.observable.bt;
import io.reactivex.internal.operators.observable.bu;
import io.reactivex.internal.operators.observable.bv;
import io.reactivex.internal.operators.observable.bw;
import io.reactivex.internal.operators.observable.bx;
import io.reactivex.internal.operators.observable.bz;
import io.reactivex.internal.operators.observable.ca;
import io.reactivex.internal.operators.observable.cb;
import io.reactivex.internal.operators.observable.cc;
import io.reactivex.internal.operators.observable.cd;
import io.reactivex.internal.operators.observable.ce;
import io.reactivex.internal.operators.observable.cf;
import io.reactivex.internal.operators.observable.cg;
import io.reactivex.internal.operators.observable.ch;
import io.reactivex.internal.operators.observable.ci;
import io.reactivex.internal.operators.observable.cj;
import io.reactivex.internal.operators.observable.ck;
import io.reactivex.internal.operators.observable.cm;
import io.reactivex.internal.operators.observable.cn;
import io.reactivex.internal.operators.observable.co;
import io.reactivex.internal.operators.observable.cp;
import io.reactivex.internal.operators.observable.cq;
import io.reactivex.internal.operators.observable.cr;
import io.reactivex.internal.operators.observable.cs;
import io.reactivex.internal.operators.observable.ct;
import io.reactivex.internal.operators.observable.cu;
import io.reactivex.internal.operators.observable.cv;
import io.reactivex.internal.operators.observable.cw;
import io.reactivex.internal.operators.observable.cy;
import io.reactivex.internal.operators.observable.cz;
import io.reactivex.internal.operators.observable.da;
import io.reactivex.internal.operators.observable.dc;
import io.reactivex.internal.operators.observable.dd;
import io.reactivex.internal.operators.observable.de;
import io.reactivex.internal.operators.observable.df;
import io.reactivex.internal.operators.observable.dg;
import io.reactivex.internal.operators.observable.dh;
import io.reactivex.internal.operators.observable.dj;
import io.reactivex.internal.operators.observable.dk;
import io.reactivex.internal.operators.observable.dl;
import io.reactivex.internal.operators.observable.dm;
import io.reactivex.internal.operators.observable.dn;
import io.reactivex.internal.operators.observable.dp;
import io.reactivex.internal.operators.observable.dq;
import io.reactivex.internal.operators.observable.ds;
import io.reactivex.internal.operators.observable.dt;
import io.reactivex.internal.operators.observable.du;
import io.reactivex.internal.operators.observable.dv;
import io.reactivex.internal.operators.observable.dw;
import io.reactivex.internal.operators.observable.dx;
import io.reactivex.internal.operators.observable.dy;
import io.reactivex.internal.operators.observable.dz;
import io.reactivex.internal.operators.observable.ea;
import io.reactivex.internal.operators.observable.eb;
import io.reactivex.internal.operators.observable.ec;
import io.reactivex.internal.operators.observable.ed;
import io.reactivex.internal.operators.observable.ef;
import io.reactivex.internal.operators.observable.eg;
import io.reactivex.internal.operators.observable.eh;
import io.reactivex.internal.operators.observable.ei;
import io.reactivex.internal.operators.observable.ej;
import io.reactivex.internal.operators.p3462b.C68409b;
import io.reactivex.internal.operators.p3462b.C68412c;
import io.reactivex.internal.operators.p3462b.C68415d;
import io.reactivex.internal.operators.p3462b.C68418e;
import io.reactivex.internal.operators.p3462b.C68421f;
import io.reactivex.internal.operators.p3462b.C68424g;
import io.reactivex.internal.p3459a.C68326a;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.p3460b.AbstractCallableC68371h;
import io.reactivex.internal.util.ArrayListSupplier;
import io.reactivex.internal.util.C68981f;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.HashMapSupplier;
import io.reactivex.observers.C69003c;
import io.reactivex.observers.C69005e;
import io.reactivex.p3454b.AbstractC68271a;
import io.reactivex.p3454b.AbstractC68272b;
import io.reactivex.p3456d.C68279a;
import io.reactivex.p3456d.C68288b;
import io.reactivex.plugins.RxJavaPlugins;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.p3511d.AbstractC70020b;

public abstract class Observable<T> implements ObservableSource<T> {
    public static Observable create(ObservableOnSubscribe observableOnSubscribe) {
        return io_reactivex_Observable_com_ss_android_lark_integrator_lancet_RxObservableHook_create(observableOnSubscribe);
    }

    /* access modifiers changed from: protected */
    public abstract void subscribeActual(AbstractC69009q<? super T> qVar);

    public final Observable subscribeOn(Scheduler scheduler) {
        return io_reactivex_Observable_com_ss_android_lark_integrator_lancet_RxObservableHook_subscribeOn(this, scheduler);
    }

    @SchedulerSupport("none")
    public final void blockingSubscribe() {
        C68879k.m265447a(this);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T, R> Observable<R> combineLatest(Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i) {
        C68362b.m265229a((Object) iterable, "sources is null");
        C68362b.m265229a((Object) function, "combiner is null");
        C68362b.m265225a(i, "bufferSize");
        return RxJavaPlugins.onAssembly(new C68906t(null, iterable, function, i << 1, false));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T, R> Observable<R> combineLatest(ObservableSource<? extends T>[] observableSourceArr, Function<? super Object[], ? extends R> function) {
        return combineLatest(observableSourceArr, function, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T, R> Observable<R> combineLatest(ObservableSource<? extends T>[] observableSourceArr, Function<? super Object[], ? extends R> function, int i) {
        C68362b.m265229a((Object) observableSourceArr, "sources is null");
        if (observableSourceArr.length == 0) {
            return empty();
        }
        C68362b.m265229a((Object) function, "combiner is null");
        C68362b.m265225a(i, "bufferSize");
        return RxJavaPlugins.onAssembly(new C68906t(observableSourceArr, null, function, i << 1, false));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T1, T2, T3, R> Observable<R> combineLatest(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, AbstractC68314f<? super T1, ? super T2, ? super T3, ? extends R> fVar) {
        C68362b.m265229a((Object) observableSource, "source1 is null");
        C68362b.m265229a((Object) observableSource2, "source2 is null");
        C68362b.m265229a((Object) observableSource3, "source3 is null");
        return combineLatest(C68326a.m265177a((AbstractC68314f) fVar), bufferSize(), observableSource, observableSource2, observableSource3);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9) {
        C68362b.m265229a((Object) t, "The first item is null");
        C68362b.m265229a((Object) t2, "The second item is null");
        C68362b.m265229a((Object) t3, "The third item is null");
        C68362b.m265229a((Object) t4, "The fourth item is null");
        C68362b.m265229a((Object) t5, "The fifth item is null");
        C68362b.m265229a((Object) t6, "The sixth item is null");
        C68362b.m265229a((Object) t7, "The seventh item is null");
        C68362b.m265229a((Object) t8, "The eighth item is null");
        C68362b.m265229a((Object) t9, "The ninth item is null");
        return fromArray(t, t2, t3, t4, t5, t6, t7, t8, t9);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9, T t10) {
        C68362b.m265229a((Object) t, "The first item is null");
        C68362b.m265229a((Object) t2, "The second item is null");
        C68362b.m265229a((Object) t3, "The third item is null");
        C68362b.m265229a((Object) t4, "The fourth item is null");
        C68362b.m265229a((Object) t5, "The fifth item is null");
        C68362b.m265229a((Object) t6, "The sixth item is null");
        C68362b.m265229a((Object) t7, "The seventh item is null");
        C68362b.m265229a((Object) t8, "The eighth item is null");
        C68362b.m265229a((Object) t9, "The ninth item is null");
        C68362b.m265229a((Object) t10, "The tenth item is null");
        return fromArray(t, t2, t3, t4, t5, t6, t7, t8, t9, t10);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T, R> Observable<R> zip(Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function) {
        C68362b.m265229a((Object) function, "zipper is null");
        C68362b.m265229a((Object) iterable, "sources is null");
        return RxJavaPlugins.onAssembly(new ei(null, iterable, function, bufferSize(), false));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T, R> Observable<R> zip(ObservableSource<? extends ObservableSource<? extends T>> observableSource, Function<? super Object[], ? extends R> function) {
        C68362b.m265229a((Object) function, "zipper is null");
        C68362b.m265229a((Object) observableSource, "sources is null");
        return RxJavaPlugins.onAssembly(new dx(observableSource, 16).flatMap(C68711bm.m265384c(function)));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T1, T2, R> Observable<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, BiFunction<? super T1, ? super T2, ? extends R> biFunction, boolean z) {
        C68362b.m265229a((Object) observableSource, "source1 is null");
        C68362b.m265229a((Object) observableSource2, "source2 is null");
        return zipArray(C68326a.m265176a((BiFunction) biFunction), z, bufferSize(), observableSource, observableSource2);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T1, T2, R> Observable<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, BiFunction<? super T1, ? super T2, ? extends R> biFunction, boolean z, int i) {
        C68362b.m265229a((Object) observableSource, "source1 is null");
        C68362b.m265229a((Object) observableSource2, "source2 is null");
        return zipArray(C68326a.m265176a((BiFunction) biFunction), z, i, observableSource, observableSource2);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T1, T2, T3, R> Observable<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, AbstractC68314f<? super T1, ? super T2, ? super T3, ? extends R> fVar) {
        C68362b.m265229a((Object) observableSource, "source1 is null");
        C68362b.m265229a((Object) observableSource2, "source2 is null");
        C68362b.m265229a((Object) observableSource3, "source3 is null");
        return zipArray(C68326a.m265177a((AbstractC68314f) fVar), false, bufferSize(), observableSource, observableSource2, observableSource3);
    }

    /* JADX DEBUG: Type inference failed for r9v1. Raw type applied. Possible types: io.reactivex.Observable<U extends java.util.Collection<? super T>>, io.reactivex.Observable<java.util.List<T>> */
    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<List<T>> buffer(long j, TimeUnit timeUnit, Scheduler scheduler, int i) {
        return (Observable<U>) buffer(j, timeUnit, scheduler, i, ArrayListSupplier.asCallable(), false);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final <U extends Collection<? super T>> Observable<U> buffer(long j, TimeUnit timeUnit, Scheduler scheduler, int i, Callable<U> callable, boolean z) {
        C68362b.m265229a((Object) timeUnit, "unit is null");
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        C68362b.m265229a((Object) callable, "bufferSupplier is null");
        C68362b.m265225a(i, "count");
        return RxJavaPlugins.onAssembly(new C68893p(this, j, j, timeUnit, scheduler, callable, i, z));
    }

    /* JADX DEBUG: Type inference failed for r9v1. Raw type applied. Possible types: io.reactivex.Observable<U extends java.util.Collection<? super T>>, io.reactivex.Observable<java.util.List<T>> */
    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<List<T>> buffer(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return (Observable<U>) buffer(j, timeUnit, scheduler, Integer.MAX_VALUE, ArrayListSupplier.asCallable(), false);
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: io.reactivex.Observable<U extends java.util.Collection<? super T>>, io.reactivex.Observable<java.util.List<T>> */
    @SchedulerSupport("none")
    @CheckReturnValue
    public final <TOpening, TClosing> Observable<List<T>> buffer(ObservableSource<? extends TOpening> observableSource, Function<? super TOpening, ? extends ObservableSource<? extends TClosing>> function) {
        return (Observable<U>) buffer(observableSource, function, ArrayListSupplier.asCallable());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <TOpening, TClosing, U extends Collection<? super T>> Observable<U> buffer(ObservableSource<? extends TOpening> observableSource, Function<? super TOpening, ? extends ObservableSource<? extends TClosing>> function, Callable<U> callable) {
        C68362b.m265229a((Object) observableSource, "openingIndicator is null");
        C68362b.m265229a((Object) function, "closingIndicator is null");
        C68362b.m265229a((Object) callable, "bufferSupplier is null");
        return RxJavaPlugins.onAssembly(new C68883m(this, observableSource, function, callable));
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: io.reactivex.Observable<U extends java.util.Collection<? super T>>, io.reactivex.Observable<java.util.List<T>> */
    @SchedulerSupport("none")
    @CheckReturnValue
    public final <B> Observable<List<T>> buffer(ObservableSource<B> observableSource) {
        return (Observable<U>) buffer(observableSource, ArrayListSupplier.asCallable());
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: io.reactivex.Observable<U extends java.util.Collection<? super T>>, io.reactivex.Observable<java.util.List<T>> */
    @SchedulerSupport("none")
    @CheckReturnValue
    public final <B> Observable<List<T>> buffer(ObservableSource<B> observableSource, int i) {
        C68362b.m265225a(i, "initialCapacity");
        return (Observable<U>) buffer(observableSource, C68326a.m265191a(i));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <B, U extends Collection<? super T>> Observable<U> buffer(ObservableSource<B> observableSource, Callable<U> callable) {
        C68362b.m265229a((Object) observableSource, "boundary is null");
        C68362b.m265229a((Object) callable, "bufferSupplier is null");
        return RxJavaPlugins.onAssembly(new C68890o(this, observableSource, callable));
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: io.reactivex.Observable<U extends java.util.Collection<? super T>>, io.reactivex.Observable<java.util.List<T>> */
    @SchedulerSupport("none")
    @CheckReturnValue
    public final <B> Observable<List<T>> buffer(Callable<? extends ObservableSource<B>> callable) {
        return (Observable<U>) buffer(callable, ArrayListSupplier.asCallable());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <B, U extends Collection<? super T>> Observable<U> buffer(Callable<? extends ObservableSource<B>> callable, Callable<U> callable2) {
        C68362b.m265229a((Object) callable, "boundarySupplier is null");
        C68362b.m265229a((Object) callable2, "bufferSupplier is null");
        return RxJavaPlugins.onAssembly(new C68887n(this, callable, callable2));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends R>> function, boolean z) {
        return flatMap(function, z, Integer.MAX_VALUE);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends R>> function, boolean z, int i) {
        return flatMap(function, z, i, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends R>> function, boolean z, int i, int i2) {
        C68362b.m265229a((Object) function, "mapper is null");
        C68362b.m265225a(i, "maxConcurrency");
        C68362b.m265225a(i2, "bufferSize");
        if (!(this instanceof AbstractCallableC68371h)) {
            return RxJavaPlugins.onAssembly(new av(this, function, z, i, i2));
        }
        Object call = ((AbstractCallableC68371h) this).call();
        if (call == null) {
            return empty();
        }
        return ObservableScalarXMap.m265360a(call, function);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final AbstractC68271a<T> replay(int i) {
        C68362b.m265225a(i, "bufferSize");
        return cp.m265410a(this, i);
    }

    @SchedulerSupport("io.reactivex:computation")
    @CheckReturnValue
    public final AbstractC68271a<T> replay(int i, long j, TimeUnit timeUnit) {
        return replay(i, j, timeUnit, C68279a.m265021a());
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final AbstractC68271a<T> replay(int i, long j, TimeUnit timeUnit, Scheduler scheduler) {
        C68362b.m265225a(i, "bufferSize");
        C68362b.m265229a((Object) timeUnit, "unit is null");
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        return cp.m265412a(this, j, timeUnit, scheduler, i);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final AbstractC68271a<T> replay(int i, Scheduler scheduler) {
        C68362b.m265225a(i, "bufferSize");
        return cp.m265414a(replay(i), scheduler);
    }

    @SchedulerSupport("io.reactivex:computation")
    @CheckReturnValue
    public final AbstractC68271a<T> replay(long j, TimeUnit timeUnit) {
        return replay(j, timeUnit, C68279a.m265021a());
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final AbstractC68271a<T> replay(long j, TimeUnit timeUnit, Scheduler scheduler) {
        C68362b.m265229a((Object) timeUnit, "unit is null");
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        return cp.m265411a(this, j, timeUnit, scheduler);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final AbstractC68271a<T> replay(Scheduler scheduler) {
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        return cp.m265414a(replay(), scheduler);
    }

    @SchedulerSupport("io.reactivex:trampoline")
    @CheckReturnValue
    public final Observable<T> takeLast(long j, TimeUnit timeUnit, boolean z) {
        return takeLast(j, timeUnit, C68279a.m265024c(), z, bufferSize());
    }

    @SchedulerSupport("io.reactivex:computation")
    @CheckReturnValue
    public final Observable<Observable<T>> window(long j, TimeUnit timeUnit, long j2, boolean z) {
        return window(j, timeUnit, C68279a.m265021a(), j2, z);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<Observable<T>> window(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return window(j, timeUnit, scheduler, Long.MAX_VALUE, false);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<Observable<T>> window(long j, TimeUnit timeUnit, Scheduler scheduler, long j2) {
        return window(j, timeUnit, scheduler, j2, false);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<Observable<T>> window(long j, TimeUnit timeUnit, Scheduler scheduler, long j2, boolean z) {
        return window(j, timeUnit, scheduler, j2, z, bufferSize());
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<Observable<T>> window(long j, TimeUnit timeUnit, Scheduler scheduler, long j2, boolean z, int i) {
        C68362b.m265225a(i, "bufferSize");
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        C68362b.m265229a((Object) timeUnit, "unit is null");
        C68362b.m265227a(j2, "count");
        return RxJavaPlugins.onAssembly(new ef(this, j, j, timeUnit, scheduler, j2, i, z));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <B> Observable<Observable<T>> window(ObservableSource<B> observableSource) {
        return window(observableSource, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <B> Observable<Observable<T>> window(ObservableSource<B> observableSource, int i) {
        C68362b.m265229a((Object) observableSource, "boundary is null");
        C68362b.m265225a(i, "bufferSize");
        return RxJavaPlugins.onAssembly(new ec(this, observableSource, i));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U, V> Observable<Observable<T>> window(ObservableSource<U> observableSource, Function<? super U, ? extends ObservableSource<V>> function) {
        return window(observableSource, function, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U, V> Observable<Observable<T>> window(ObservableSource<U> observableSource, Function<? super U, ? extends ObservableSource<V>> function, int i) {
        C68362b.m265229a((Object) observableSource, "openingIndicator is null");
        C68362b.m265229a((Object) function, "closingIndicator is null");
        C68362b.m265225a(i, "bufferSize");
        return RxJavaPlugins.onAssembly(new ed(this, observableSource, function, i));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <B> Observable<Observable<T>> window(Callable<? extends ObservableSource<B>> callable) {
        return window(callable, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <B> Observable<Observable<T>> window(Callable<? extends ObservableSource<B>> callable, int i) {
        C68362b.m265229a((Object) callable, "boundary is null");
        C68362b.m265225a(i, "bufferSize");
        return RxJavaPlugins.onAssembly(new C68851ee(this, callable, i));
    }

    public static int bufferSize() {
        return AbstractC68307f.m265072a();
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> empty() {
        return RxJavaPlugins.onAssembly(as.f172234a);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> never() {
        return RxJavaPlugins.onAssembly(ca.f172370a);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Iterable<T> blockingLatest() {
        return new C68742c(this);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Iterable<T> blockingNext() {
        return new C68839e(this);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> cache() {
        return cacheWithInitialCapacity(16);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final AbstractC68988j<T> firstElement() {
        return elementAt(0);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> firstOrError() {
        return elementAtOrError(0);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final AbstractC68271a<T> publish() {
        return ce.m265400a(this);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final AbstractC68271a<T> replay() {
        return cp.m265409a(this);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<List<T>> toList() {
        return toList(16);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Iterable<T> blockingIterable() {
        return blockingIterable(bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<Long> count() {
        return RxJavaPlugins.onAssembly(new C68652aa(this));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T2> Observable<T2> dematerialize() {
        return RxJavaPlugins.onAssembly(new C68672ah(this, C68326a.m265175a()));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> distinct() {
        return distinct(C68326a.m265175a(), C68326a.m265203g());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> distinctUntilChanged() {
        return distinctUntilChanged(C68326a.m265175a());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> hide() {
        return RxJavaPlugins.onAssembly(new bj(this));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final AbstractC68259a ignoreElements() {
        return RxJavaPlugins.onAssembly(new bl(this));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<Boolean> isEmpty() {
        return all(C68326a.m265200d());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final AbstractC68988j<T> lastElement() {
        return RxJavaPlugins.onAssembly(new br(this));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> lastOrError() {
        return RxJavaPlugins.onAssembly(new bs(this, null));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<C68991m<T>> materialize() {
        return RxJavaPlugins.onAssembly(new bw(this));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> onTerminateDetach() {
        return RxJavaPlugins.onAssembly(new C68674ai(this));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> repeat() {
        return repeat(Long.MAX_VALUE);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> retry() {
        return retry(Long.MAX_VALUE, C68326a.m265198c());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> serialize() {
        return RxJavaPlugins.onAssembly(new cz(this));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> share() {
        return publish().mo237899a();
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final AbstractC68988j<T> singleElement() {
        return RxJavaPlugins.onAssembly(new da(this));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> singleOrError() {
        return RxJavaPlugins.onAssembly(new C68799db(this, null));
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
    public final Observable<C68288b<T>> timeInterval() {
        return timeInterval(TimeUnit.MILLISECONDS, C68279a.m265021a());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<C68288b<T>> timestamp() {
        return timestamp(TimeUnit.MILLISECONDS, C68279a.m265021a());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Future<T> toFuture() {
        return (Future) subscribeWith(new FutureC68384h());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<List<T>> toSortedList() {
        return toSortedList(C68326a.m265202f());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final T blockingFirst() {
        C68380d dVar = new C68380d();
        subscribe(dVar);
        T t = (T) dVar.mo238108a();
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException();
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final T blockingLast() {
        C68381e eVar = new C68381e();
        subscribe(eVar);
        T t = (T) eVar.mo238108a();
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException();
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final T blockingSingle() {
        T a = singleElement().mo238771a();
        if (a != null) {
            return a;
        }
        throw new NoSuchElementException();
    }

    /* JADX DEBUG: Type inference failed for r0v3. Raw type applied. Possible types: io.reactivex.Observable<U>, io.reactivex.Observable<T> */
    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> sorted() {
        return (Observable<U>) toList().toObservable().map(C68326a.m265185a(C68326a.m265204h())).flatMapIterable(C68326a.m265175a());
    }

    @SchedulerSupport("none")
    public final Disposable subscribe() {
        return subscribe(C68326a.m265193b(), C68326a.f171644f, C68326a.f171641c, C68326a.m265193b());
    }

    /* renamed from: io.reactivex.Observable$1 */
    static /* synthetic */ class C682541 {

        /* renamed from: a */
        static final /* synthetic */ int[] f171538a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                io.reactivex.BackpressureStrategy[] r0 = io.reactivex.BackpressureStrategy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.reactivex.Observable.C682541.f171538a = r0
                io.reactivex.BackpressureStrategy r1 = io.reactivex.BackpressureStrategy.DROP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = io.reactivex.Observable.C682541.f171538a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.reactivex.BackpressureStrategy r1 = io.reactivex.BackpressureStrategy.LATEST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = io.reactivex.Observable.C682541.f171538a     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.reactivex.BackpressureStrategy r1 = io.reactivex.BackpressureStrategy.MISSING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = io.reactivex.Observable.C682541.f171538a     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.reactivex.BackpressureStrategy r1 = io.reactivex.BackpressureStrategy.ERROR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.Observable.C682541.<clinit>():void");
        }
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <E extends AbstractC69009q<? super T>> E subscribeWith(E e) {
        subscribe(e);
        return e;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Iterable<T> blockingMostRecent(T t) {
        return new C68795d(this, t);
    }

    @SchedulerSupport("none")
    public final void blockingSubscribe(Consumer<? super T> consumer) {
        C68879k.m265448a(this, consumer, C68326a.f171644f, C68326a.f171641c);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<List<T>> buffer(int i) {
        return buffer(i, i);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> concatMap(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return concatMap(function, 2);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final AbstractC68259a concatMapCompletable(Function<? super T, ? extends AbstractC68293e> function) {
        return concatMapCompletable(function, 2);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final AbstractC68259a concatMapCompletableDelayError(Function<? super T, ? extends AbstractC68293e> function) {
        return concatMapCompletableDelayError(function, true, 2);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> concatMapMaybe(Function<? super T, ? extends AbstractC68990l<? extends R>> function) {
        return concatMapMaybe(function, 2);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> concatMapMaybeDelayError(Function<? super T, ? extends AbstractC68990l<? extends R>> function) {
        return concatMapMaybeDelayError(function, true, 2);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> concatMapSingle(Function<? super T, ? extends AbstractC69015w<? extends R>> function) {
        return concatMapSingle(function, 2);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> concatMapSingleDelayError(Function<? super T, ? extends AbstractC69015w<? extends R>> function) {
        return concatMapSingleDelayError(function, true, 2);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> doOnSubscribe(Consumer<? super Disposable> consumer) {
        return doOnLifecycle(consumer, C68326a.f171641c);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> first(T t) {
        return elementAt(0, t);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return flatMap((Function) function, false);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final AbstractC68259a flatMapCompletable(Function<? super T, ? extends AbstractC68293e> function) {
        return flatMapCompletable(function, false);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> flatMapMaybe(Function<? super T, ? extends AbstractC68990l<? extends R>> function) {
        return flatMapMaybe(function, false);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> flatMapSingle(Function<? super T, ? extends AbstractC69015w<? extends R>> function) {
        return flatMapSingle(function, false);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Disposable forEach(Consumer<? super T> consumer) {
        return subscribe(consumer);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<C68288b<T>> timeInterval(Scheduler scheduler) {
        return timeInterval(TimeUnit.MILLISECONDS, scheduler);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <V> Observable<T> timeout(Function<? super T, ? extends ObservableSource<V>> function) {
        return timeout0(null, function, null);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<C68288b<T>> timestamp(Scheduler scheduler) {
        return timestamp(TimeUnit.MILLISECONDS, scheduler);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> Observable__create$___twin___(ObservableOnSubscribe<T> observableOnSubscribe) {
        C68362b.m265229a((Object) observableOnSubscribe, "source is null");
        return RxJavaPlugins.onAssembly(new C68654ab(observableOnSubscribe));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> amb(Iterable<? extends ObservableSource<? extends T>> iterable) {
        C68362b.m265229a((Object) iterable, "sources is null");
        return RxJavaPlugins.onAssembly(new C68872h(null, iterable));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> concat(ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        return concat(observableSource, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> concatDelayError(ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        return concatDelayError(observableSource, bufferSize(), true);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> concatEager(ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        return concatEager(observableSource, bufferSize(), bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> defer(Callable<? extends ObservableSource<? extends T>> callable) {
        C68362b.m265229a((Object) callable, "supplier is null");
        return RxJavaPlugins.onAssembly(new C68663ae(callable));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> error(Throwable th) {
        C68362b.m265229a((Object) th, "e is null");
        return error(C68326a.m265192a(th));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> fromCallable(Callable<? extends T> callable) {
        C68362b.m265229a((Object) callable, "supplier is null");
        return RxJavaPlugins.onAssembly(new bc(callable));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> fromIterable(Iterable<? extends T> iterable) {
        C68362b.m265229a((Object) iterable, "source is null");
        return RxJavaPlugins.onAssembly(new be(iterable));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public static <T> Observable<T> fromPublisher(AbstractC70020b<? extends T> bVar) {
        C68362b.m265229a((Object) bVar, "publisher is null");
        return RxJavaPlugins.onAssembly(new bf(bVar));
    }

    public static Observable io_reactivex_Observable_com_ss_android_lark_integrator_lancet_RxObservableHook_create(ObservableOnSubscribe observableOnSubscribe) {
        return Observable__create$___twin___(new C26165s(observableOnSubscribe));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> just(T t) {
        C68362b.m265229a((Object) t, "The item is null");
        return RxJavaPlugins.onAssembly(new bq(t));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> merge(Iterable<? extends ObservableSource<? extends T>> iterable) {
        return fromIterable(iterable).flatMap(C68326a.m265175a());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> mergeDelayError(Iterable<? extends ObservableSource<? extends T>> iterable) {
        return fromIterable(iterable).flatMap(C68326a.m265175a(), true);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> switchOnNext(ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        return switchOnNext(observableSource, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> switchOnNextDelayError(ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        return switchOnNextDelayError(observableSource, bufferSize());
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> Observable__subscribeOn$___twin___(Scheduler scheduler) {
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new dh(this, scheduler));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<Boolean> all(AbstractC68322n<? super T> nVar) {
        C68362b.m265229a((Object) nVar, "predicate is null");
        return RxJavaPlugins.onAssembly(new C68870g(this, nVar));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<Boolean> any(AbstractC68322n<? super T> nVar) {
        C68362b.m265229a((Object) nVar, "predicate is null");
        return RxJavaPlugins.onAssembly(new C68877j(this, nVar));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> R as(AbstractC68992n<T, ? extends R> nVar) {
        return (R) ((AbstractC68992n) C68362b.m265229a((Object) nVar, "converter is null")).mo238782a(this);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final T blockingFirst(T t) {
        C68380d dVar = new C68380d();
        subscribe(dVar);
        T t2 = (T) dVar.mo238108a();
        return t2 != null ? t2 : t;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final T blockingLast(T t) {
        C68381e eVar = new C68381e();
        subscribe(eVar);
        T t2 = (T) eVar.mo238108a();
        return t2 != null ? t2 : t;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final T blockingSingle(T t) {
        return single(t).blockingGet();
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> cacheWithInitialCapacity(int i) {
        C68362b.m265225a(i, "initialCapacity");
        return RxJavaPlugins.onAssembly(new C68899q(this, i));
    }

    /* JADX DEBUG: Type inference failed for r2v2. Raw type applied. Possible types: io.reactivex.Observable<R>, io.reactivex.Observable<U> */
    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U> Observable<U> cast(Class<U> cls) {
        C68362b.m265229a((Object) cls, "clazz is null");
        return (Observable<R>) map(C68326a.m265184a((Class) cls));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> concatMapDelayError(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return concatMapDelayError(function, bufferSize(), true);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> concatMapEager(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return concatMapEager(function, Integer.MAX_VALUE, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U> Observable<U> concatMapIterable(Function<? super T, ? extends Iterable<? extends U>> function) {
        C68362b.m265229a((Object) function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ba(this, function));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> concatWith(ObservableSource<? extends T> observableSource) {
        C68362b.m265229a((Object) observableSource, "other is null");
        return concat(this, observableSource);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<Boolean> contains(Object obj) {
        C68362b.m265229a(obj, "element is null");
        return any(C68326a.m265199c(obj));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> defaultIfEmpty(T t) {
        C68362b.m265229a((Object) t, "defaultItem is null");
        return switchIfEmpty(just(t));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> doAfterNext(Consumer<? super T> consumer) {
        C68362b.m265229a((Object) consumer, "onAfterNext is null");
        return RxJavaPlugins.onAssembly(new al(this, consumer));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> doFinally(AbstractC68309a aVar) {
        C68362b.m265229a((Object) aVar, "onFinally is null");
        return RxJavaPlugins.onAssembly(new am(this, aVar));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> doOnComplete(AbstractC68309a aVar) {
        return doOnEach(C68326a.m265193b(), C68326a.m265193b(), aVar, C68326a.f171641c);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> doOnDispose(AbstractC68309a aVar) {
        return doOnLifecycle(C68326a.m265193b(), aVar);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> doOnError(Consumer<? super Throwable> consumer) {
        return doOnEach(C68326a.m265193b(), consumer, C68326a.f171641c, C68326a.f171641c);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> doOnNext(Consumer<? super T> consumer) {
        return doOnEach(consumer, C68326a.m265193b(), C68326a.f171641c, C68326a.f171641c);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> filter(AbstractC68322n<? super T> nVar) {
        C68362b.m265229a((Object) nVar, "predicate is null");
        return RxJavaPlugins.onAssembly(new au(this, nVar));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U> Observable<U> flatMapIterable(Function<? super T, ? extends Iterable<? extends U>> function) {
        C68362b.m265229a((Object) function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ba(this, function));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Disposable forEachWhile(AbstractC68322n<? super T> nVar) {
        return forEachWhile(nVar, C68326a.f171644f, C68326a.f171641c);
    }

    /* JADX DEBUG: Type inference failed for r4v1. Raw type applied. Possible types: io.reactivex.Observable<io.reactivex.b.b<K, V>>, io.reactivex.Observable<io.reactivex.b.b<K, T>> */
    @SchedulerSupport("none")
    @CheckReturnValue
    public final <K> Observable<AbstractC68272b<K, T>> groupBy(Function<? super T, ? extends K> function) {
        return (Observable<AbstractC68272b<K, V>>) groupBy(function, C68326a.m265175a(), false, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> last(T t) {
        C68362b.m265229a((Object) t, "defaultItem is null");
        return RxJavaPlugins.onAssembly(new bs(this, t));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> lift(AbstractC68993o<? extends R, ? super T> oVar) {
        C68362b.m265229a((Object) oVar, "onLift is null");
        return RxJavaPlugins.onAssembly(new bt(this, oVar));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> map(Function<? super T, ? extends R> function) {
        C68362b.m265229a((Object) function, "mapper is null");
        return RxJavaPlugins.onAssembly(new bu(this, function));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> mergeWith(ObservableSource<? extends T> observableSource) {
        C68362b.m265229a((Object) observableSource, "other is null");
        return merge(this, observableSource);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> observeOn(Scheduler scheduler) {
        return observeOn(scheduler, false, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> onErrorResumeNext(ObservableSource<? extends T> observableSource) {
        C68362b.m265229a((Object) observableSource, "next is null");
        return onErrorResumeNext(C68326a.m265195b(observableSource));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> onErrorReturn(Function<? super Throwable, ? extends T> function) {
        C68362b.m265229a((Object) function, "valueSupplier is null");
        return RxJavaPlugins.onAssembly(new cd(this, function));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> onErrorReturnItem(T t) {
        C68362b.m265229a((Object) t, "item is null");
        return onErrorReturn(C68326a.m265195b((Object) t));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> publish(Function<? super Observable<T>, ? extends ObservableSource<R>> function) {
        C68362b.m265229a((Object) function, "selector is null");
        return RxJavaPlugins.onAssembly(new cf(this, function));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final AbstractC68988j<T> reduce(BiFunction<T, T, T> biFunction) {
        C68362b.m265229a((Object) biFunction, "reducer is null");
        return RxJavaPlugins.onAssembly(new ci(this, biFunction));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> repeatUntil(AbstractC68312d dVar) {
        C68362b.m265229a((Object) dVar, "stop is null");
        return RxJavaPlugins.onAssembly(new cn(this, dVar));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> repeatWhen(Function<? super Observable<Object>, ? extends ObservableSource<?>> function) {
        C68362b.m265229a((Object) function, "handler is null");
        return RxJavaPlugins.onAssembly(new co(this, function));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> replay(Function<? super Observable<T>, ? extends ObservableSource<R>> function) {
        C68362b.m265229a((Object) function, "selector is null");
        return cp.m265408a(C68711bm.m265378a(this), function);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> retryWhen(Function<? super Observable<Throwable>, ? extends ObservableSource<?>> function) {
        C68362b.m265229a((Object) function, "handler is null");
        return RxJavaPlugins.onAssembly(new cs(this, function));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> scan(BiFunction<T, T, T> biFunction) {
        C68362b.m265229a((Object) biFunction, "accumulator is null");
        return RxJavaPlugins.onAssembly(new cv(this, biFunction));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> single(T t) {
        C68362b.m265229a((Object) t, "defaultItem is null");
        return RxJavaPlugins.onAssembly(new C68799db(this, t));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U> Observable<T> skipUntil(ObservableSource<U> observableSource) {
        C68362b.m265229a((Object) observableSource, "other is null");
        return RxJavaPlugins.onAssembly(new df(this, observableSource));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> skipWhile(AbstractC68322n<? super T> nVar) {
        C68362b.m265229a((Object) nVar, "predicate is null");
        return RxJavaPlugins.onAssembly(new dg(this, nVar));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Disposable subscribe(Consumer<? super T> consumer) {
        return subscribe(consumer, C68326a.f171644f, C68326a.f171641c, C68326a.m265193b());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> switchIfEmpty(ObservableSource<? extends T> observableSource) {
        C68362b.m265229a((Object) observableSource, "other is null");
        return RxJavaPlugins.onAssembly(new C68809di(this, observableSource));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> switchMap(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return switchMap(function, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final AbstractC68259a switchMapCompletable(Function<? super T, ? extends AbstractC68293e> function) {
        C68362b.m265229a((Object) function, "mapper is null");
        return RxJavaPlugins.onAssembly(new C68418e(this, function, false));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final AbstractC68259a switchMapCompletableDelayError(Function<? super T, ? extends AbstractC68293e> function) {
        C68362b.m265229a((Object) function, "mapper is null");
        return RxJavaPlugins.onAssembly(new C68418e(this, function, true));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> switchMapDelayError(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return switchMapDelayError(function, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> switchMapMaybe(Function<? super T, ? extends AbstractC68990l<? extends R>> function) {
        C68362b.m265229a((Object) function, "mapper is null");
        return RxJavaPlugins.onAssembly(new C68421f(this, function, false));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> switchMapMaybeDelayError(Function<? super T, ? extends AbstractC68990l<? extends R>> function) {
        C68362b.m265229a((Object) function, "mapper is null");
        return RxJavaPlugins.onAssembly(new C68421f(this, function, true));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> switchMapSingle(Function<? super T, ? extends AbstractC69015w<? extends R>> function) {
        C68362b.m265229a((Object) function, "mapper is null");
        return RxJavaPlugins.onAssembly(new C68424g(this, function, false));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> switchMapSingleDelayError(Function<? super T, ? extends AbstractC69015w<? extends R>> function) {
        C68362b.m265229a((Object) function, "mapper is null");
        return RxJavaPlugins.onAssembly(new C68424g(this, function, true));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U> Observable<T> takeUntil(ObservableSource<U> observableSource) {
        C68362b.m265229a((Object) observableSource, "other is null");
        return RxJavaPlugins.onAssembly(new Cdo(this, observableSource));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> takeWhile(AbstractC68322n<? super T> nVar) {
        C68362b.m265229a((Object) nVar, "predicate is null");
        return RxJavaPlugins.onAssembly(new dq(this, nVar));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<List<T>> toList(int i) {
        C68362b.m265225a(i, "capacityHint");
        return RxJavaPlugins.onAssembly(new dy(this, i));
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> unsubscribeOn(Scheduler scheduler) {
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new dz(this, scheduler));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<Observable<T>> window(long j) {
        return window(j, j, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> concatArrayDelayError(ObservableSource<? extends T>... observableSourceArr) {
        if (observableSourceArr.length == 0) {
            return empty();
        }
        if (observableSourceArr.length == 1) {
            return wrap(observableSourceArr[0]);
        }
        return concatDelayError(fromArray(observableSourceArr));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> concatArrayEager(ObservableSource<? extends T>... observableSourceArr) {
        return concatArrayEager(bufferSize(), bufferSize(), observableSourceArr);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> concatArrayEagerDelayError(ObservableSource<? extends T>... observableSourceArr) {
        return concatArrayEagerDelayError(bufferSize(), bufferSize(), observableSourceArr);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> error(Callable<? extends Throwable> callable) {
        C68362b.m265229a((Object) callable, "errorSupplier is null");
        return RxJavaPlugins.onAssembly(new C68684at(callable));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> fromFuture(Future<? extends T> future) {
        C68362b.m265229a((Object) future, "future is null");
        return RxJavaPlugins.onAssembly(new bd(future, 0, null));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> generate(Consumer<Emitter<T>> consumer) {
        C68362b.m265229a((Object) consumer, "generator  is null");
        return generate(C68326a.m265201e(), C68711bm.m265372a(consumer), C68326a.m265193b());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> merge(ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        C68362b.m265229a((Object) observableSource, "sources is null");
        return RxJavaPlugins.onAssembly(new av(observableSource, C68326a.m265175a(), false, Integer.MAX_VALUE, bufferSize()));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> mergeArray(ObservableSource<? extends T>... observableSourceArr) {
        return fromArray(observableSourceArr).flatMap(C68326a.m265175a(), observableSourceArr.length);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> mergeArrayDelayError(ObservableSource<? extends T>... observableSourceArr) {
        return fromArray(observableSourceArr).flatMap(C68326a.m265175a(), true, observableSourceArr.length);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> mergeDelayError(ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        C68362b.m265229a((Object) observableSource, "sources is null");
        return RxJavaPlugins.onAssembly(new av(observableSource, C68326a.m265175a(), true, Integer.MAX_VALUE, bufferSize()));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> unsafeCreate(ObservableSource<T> observableSource) {
        C68362b.m265229a((Object) observableSource, "source is null");
        C68362b.m265229a((Object) observableSource, "onSubscribe is null");
        if (!(observableSource instanceof Observable)) {
            return RxJavaPlugins.onAssembly(new C68702bg(observableSource));
        }
        throw new IllegalArgumentException("unsafeCreate(Observable) should be upgraded");
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> wrap(ObservableSource<T> observableSource) {
        C68362b.m265229a((Object) observableSource, "source is null");
        if (observableSource instanceof Observable) {
            return RxJavaPlugins.onAssembly((Observable) observableSource);
        }
        return RxJavaPlugins.onAssembly(new C68702bg(observableSource));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> ambWith(ObservableSource<? extends T> observableSource) {
        C68362b.m265229a((Object) observableSource, "other is null");
        return ambArray(this, observableSource);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Iterable<T> blockingIterable(int i) {
        C68362b.m265225a(i, "bufferSize");
        return new C68696b(this, i);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> compose(AbstractC69007p<? super T, ? extends R> pVar) {
        return wrap(((AbstractC69007p) C68362b.m265229a((Object) pVar, "composer is null")).mo50572a(this));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> concatWith(AbstractC68293e eVar) {
        C68362b.m265229a((Object) eVar, "other is null");
        return RxJavaPlugins.onAssembly(new C68916w(this, eVar));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> dematerialize(Function<? super T, C68991m<R>> function) {
        C68362b.m265229a((Object) function, "selector is null");
        return RxJavaPlugins.onAssembly(new C68672ah(this, function));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <K> Observable<T> distinct(Function<? super T, K> function) {
        return distinct(function, C68326a.m265203g());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <K> Observable<T> distinctUntilChanged(Function<? super T, K> function) {
        C68362b.m265229a((Object) function, "keySelector is null");
        return RxJavaPlugins.onAssembly(new ak(this, function, C68362b.m265228a()));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> doAfterTerminate(AbstractC68309a aVar) {
        C68362b.m265229a((Object) aVar, "onFinally is null");
        return doOnEach(C68326a.m265193b(), C68326a.m265193b(), C68326a.f171641c, aVar);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> doOnEach(Consumer<? super C68991m<T>> consumer) {
        C68362b.m265229a((Object) consumer, "consumer is null");
        return doOnEach(C68326a.m265173a((Consumer) consumer), C68326a.m265194b((Consumer) consumer), C68326a.m265197c((Consumer) consumer), C68326a.f171641c);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> doOnTerminate(AbstractC68309a aVar) {
        C68362b.m265229a((Object) aVar, "onTerminate is null");
        return doOnEach(C68326a.m265193b(), C68326a.m265174a(aVar), aVar, C68326a.f171641c);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> mergeWith(AbstractC68293e eVar) {
        C68362b.m265229a((Object) eVar, "other is null");
        return RxJavaPlugins.onAssembly(new bx(this, eVar));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U> Observable<U> ofType(Class<U> cls) {
        C68362b.m265229a((Object) cls, "clazz is null");
        return filter(C68326a.m265196b((Class) cls)).cast(cls);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> onErrorResumeNext(Function<? super Throwable, ? extends ObservableSource<? extends T>> function) {
        C68362b.m265229a((Object) function, "resumeFunction is null");
        return RxJavaPlugins.onAssembly(new cc(this, function, false));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> onExceptionResumeNext(ObservableSource<? extends T> observableSource) {
        C68362b.m265229a((Object) observableSource, "next is null");
        return RxJavaPlugins.onAssembly(new cc(this, C68326a.m265195b(observableSource), true));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> retry(long j) {
        return retry(j, C68326a.m265198c());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> retryUntil(AbstractC68312d dVar) {
        C68362b.m265229a((Object) dVar, "stop is null");
        return retry(Long.MAX_VALUE, C68326a.m265190a(dVar));
    }

    @SchedulerSupport("none")
    public final void safeSubscribe(AbstractC69009q<? super T> qVar) {
        C68362b.m265229a((Object) qVar, "s is null");
        if (qVar instanceof C69003c) {
            subscribe(qVar);
        } else {
            subscribe(new C69003c(qVar));
        }
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> skip(long j) {
        if (j <= 0) {
            return RxJavaPlugins.onAssembly(this);
        }
        return RxJavaPlugins.onAssembly(new dc(this, j));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> startWith(ObservableSource<? extends T> observableSource) {
        C68362b.m265229a((Object) observableSource, "other is null");
        return concatArray(observableSource, this);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> startWithArray(T... tArr) {
        Observable fromArray = fromArray(tArr);
        if (fromArray == empty()) {
            return RxJavaPlugins.onAssembly(this);
        }
        return concatArray(fromArray, this);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> takeUntil(AbstractC68322n<? super T> nVar) {
        C68362b.m265229a((Object) nVar, "predicate is null");
        return RxJavaPlugins.onAssembly(new dp(this, nVar));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final C69005e<T> test(boolean z) {
        C69005e<T> eVar = new C69005e<>();
        if (z) {
            eVar.dispose();
        }
        subscribe(eVar);
        return eVar;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<C68288b<T>> timeInterval(TimeUnit timeUnit) {
        return timeInterval(timeUnit, C68279a.m265021a());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<C68288b<T>> timestamp(TimeUnit timeUnit) {
        return timestamp(timeUnit, C68279a.m265021a());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> R to(Function<? super Observable<T>, R> function) {
        try {
            return (R) ((Function) C68362b.m265229a((Object) function, "converter is null")).apply(this);
        } catch (Throwable th) {
            C68306a.m265071b(th);
            throw C68981f.m265557a(th);
        }
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U extends Collection<? super T>> Single<U> toList(Callable<U> callable) {
        C68362b.m265229a((Object) callable, "collectionSupplier is null");
        return RxJavaPlugins.onAssembly(new dy(this, callable));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <K> Single<Map<K, T>> toMap(Function<? super T, ? extends K> function) {
        C68362b.m265229a((Object) function, "keySelector is null");
        return collect(HashMapSupplier.asCallable(), C68326a.m265187a((Function) function));
    }

    /* JADX DEBUG: Type inference failed for r4v1. Raw type applied. Possible types: io.reactivex.Single<java.util.Map<K, java.util.Collection<V>>>, io.reactivex.Single<java.util.Map<K, java.util.Collection<T>>> */
    @SchedulerSupport("none")
    @CheckReturnValue
    public final <K> Single<Map<K, Collection<T>>> toMultimap(Function<? super T, ? extends K> function) {
        return (Single<Map<K, Collection<V>>>) toMultimap(function, C68326a.m265175a(), HashMapSupplier.asCallable(), ArrayListSupplier.asFunction());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<List<T>> toSortedList(int i) {
        return toSortedList(C68326a.m265202f(), i);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> ambArray(ObservableSource<? extends T>... observableSourceArr) {
        C68362b.m265229a((Object) observableSourceArr, "sources is null");
        int length = observableSourceArr.length;
        if (length == 0) {
            return empty();
        }
        if (length == 1) {
            return wrap(observableSourceArr[0]);
        }
        return RxJavaPlugins.onAssembly(new C68872h(observableSourceArr, null));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> concatArray(ObservableSource<? extends T>... observableSourceArr) {
        if (observableSourceArr.length == 0) {
            return empty();
        }
        if (observableSourceArr.length == 1) {
            return wrap(observableSourceArr[0]);
        }
        return RxJavaPlugins.onAssembly(new C68909u(fromArray(observableSourceArr), C68326a.m265175a(), bufferSize(), ErrorMode.BOUNDARY));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> concatDelayError(Iterable<? extends ObservableSource<? extends T>> iterable) {
        C68362b.m265229a((Object) iterable, "sources is null");
        return concatDelayError(fromIterable(iterable));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> concatEager(Iterable<? extends ObservableSource<? extends T>> iterable) {
        return concatEager(iterable, bufferSize(), bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> fromArray(T... tArr) {
        C68362b.m265229a((Object) tArr, "items is null");
        if (tArr.length == 0) {
            return empty();
        }
        if (tArr.length == 1) {
            return just(tArr[0]);
        }
        return RxJavaPlugins.onAssembly(new bb(tArr));
    }

    @SchedulerSupport("none")
    public final void blockingForEach(Consumer<? super T> consumer) {
        Iterator<T> it = blockingIterable().iterator();
        while (it.hasNext()) {
            try {
                consumer.accept(it.next());
            } catch (Throwable th) {
                C68306a.m265071b(th);
                ((Disposable) it).dispose();
                throw C68981f.m265557a(th);
            }
        }
    }

    @SchedulerSupport("none")
    public final void blockingSubscribe(AbstractC69009q<? super T> qVar) {
        C68879k.m265449a(this, qVar);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> concatWith(AbstractC68990l<? extends T> lVar) {
        C68362b.m265229a((Object) lVar, "other is null");
        return RxJavaPlugins.onAssembly(new C68918x(this, lVar));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U> Observable<T> debounce(Function<? super T, ? extends ObservableSource<U>> function) {
        C68362b.m265229a((Object) function, "debounceSelector is null");
        return RxJavaPlugins.onAssembly(new C68657ac(this, function));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U> Observable<T> delaySubscription(ObservableSource<U> observableSource) {
        C68362b.m265229a((Object) observableSource, "other is null");
        return RxJavaPlugins.onAssembly(new C68669ag(this, observableSource));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> distinctUntilChanged(AbstractC68311c<? super T, ? super T> cVar) {
        C68362b.m265229a((Object) cVar, "comparer is null");
        return RxJavaPlugins.onAssembly(new ak(this, C68326a.m265175a(), cVar));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> elementAtOrError(long j) {
        if (j >= 0) {
            return RxJavaPlugins.onAssembly(new ar(this, j, null));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> mergeWith(AbstractC68990l<? extends T> lVar) {
        C68362b.m265229a((Object) lVar, "other is null");
        return RxJavaPlugins.onAssembly(new C68737by(this, lVar));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> repeat(long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("times >= 0 required but it was " + j);
        } else if (i == 0) {
            return empty();
        } else {
            return RxJavaPlugins.onAssembly(new cm(this, j));
        }
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> skipLast(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("count >= 0 required but it was " + i);
        } else if (i == 0) {
            return RxJavaPlugins.onAssembly(this);
        } else {
            return RxJavaPlugins.onAssembly(new dd(this, i));
        }
    }

    /* JADX DEBUG: Type inference failed for r2v3. Raw type applied. Possible types: io.reactivex.Observable<U>, io.reactivex.Observable<T> */
    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> sorted(Comparator<? super T> comparator) {
        C68362b.m265229a((Object) comparator, "sortFunction is null");
        return (Observable<U>) toList().toObservable().map(C68326a.m265185a((Comparator) comparator)).flatMapIterable(C68326a.m265175a());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> startWith(Iterable<? extends T> iterable) {
        return concatArray(fromIterable(iterable), this);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> take(long j) {
        if (j >= 0) {
            return RxJavaPlugins.onAssembly(new dk(this, j));
        }
        throw new IllegalArgumentException("count >= 0 required but it was " + j);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> takeLast(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("count >= 0 required but it was " + i);
        } else if (i == 0) {
            return RxJavaPlugins.onAssembly(new bk(this));
        } else {
            if (i == 1) {
                return RxJavaPlugins.onAssembly(new dm(this));
            }
            return RxJavaPlugins.onAssembly(new dl(this, i));
        }
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @CheckReturnValue
    public final AbstractC68307f<T> toFlowable(BackpressureStrategy backpressureStrategy) {
        C68630x xVar = new C68630x(this);
        int i = C682541.f171538a[backpressureStrategy.ordinal()];
        if (i == 1) {
            return xVar.mo238027f();
        }
        if (i == 2) {
            return xVar.mo238030g();
        }
        if (i == 3) {
            return xVar;
        }
        if (i != 4) {
            return xVar.mo238024e();
        }
        return RxJavaPlugins.onAssembly(new C68535af(xVar));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<List<T>> toSortedList(Comparator<? super T> comparator) {
        C68362b.m265229a((Object) comparator, "comparator is null");
        return toList().map(C68326a.m265185a((Comparator) comparator));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> concatWith(AbstractC69015w<? extends T> wVar) {
        C68362b.m265229a((Object) wVar, "other is null");
        return RxJavaPlugins.onAssembly(new C68920y(this, wVar));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> doOnEach(AbstractC69009q<? super T> qVar) {
        C68362b.m265229a((Object) qVar, "observer is null");
        return doOnEach(C68711bm.m265374a(qVar), C68711bm.m265382b(qVar), C68711bm.m265385c(qVar), C68326a.f171641c);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final AbstractC68988j<T> elementAt(long j) {
        if (j >= 0) {
            return RxJavaPlugins.onAssembly(new aq(this, j));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> mergeWith(AbstractC69015w<? extends T> wVar) {
        C68362b.m265229a((Object) wVar, "other is null");
        return RxJavaPlugins.onAssembly(new bz(this, wVar));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> retry(AbstractC68311c<? super Integer, ? super Throwable> cVar) {
        C68362b.m265229a((Object) cVar, "predicate is null");
        return RxJavaPlugins.onAssembly(new cq(this, cVar));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> startWith(T t) {
        C68362b.m265229a((Object) t, "item is null");
        return concatArray(just(t), this);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> retry(AbstractC68322n<? super Throwable> nVar) {
        return retry(Long.MAX_VALUE, nVar);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U> Observable<T> sample(ObservableSource<U> observableSource) {
        C68362b.m265229a((Object) observableSource, "sampler is null");
        return RxJavaPlugins.onAssembly(new cu(this, observableSource, false));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> concat(Iterable<? extends ObservableSource<? extends T>> iterable) {
        C68362b.m265229a((Object) iterable, "sources is null");
        return fromIterable(iterable).concatMapDelayError(C68326a.m265175a(), bufferSize(), false);
    }

    /* JADX DEBUG: Type inference failed for r2v2. Raw type applied. Possible types: io.reactivex.Observable<R>, io.reactivex.Observable<T> */
    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U> Observable<T> delay(Function<? super T, ? extends ObservableSource<U>> function) {
        C68362b.m265229a((Object) function, "itemDelay is null");
        return (Observable<R>) flatMap(C68711bm.m265375a(function));
    }

    @Override // io.reactivex.ObservableSource
    @SchedulerSupport("none")
    public final void subscribe(AbstractC69009q<? super T> qVar) {
        C68362b.m265229a((Object) qVar, "observer is null");
        try {
            AbstractC69009q<? super T> onSubscribe = RxJavaPlugins.onSubscribe(this, qVar);
            C68362b.m265229a((Object) onSubscribe, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            subscribeActual(onSubscribe);
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

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Disposable forEachWhile(AbstractC68322n<? super T> nVar, Consumer<? super Throwable> consumer) {
        return forEachWhile(nVar, consumer, C68326a.f171641c);
    }

    @SchedulerSupport("io.reactivex:computation")
    @CheckReturnValue
    public final Observable<T> throttleLast(long j, TimeUnit timeUnit) {
        return sample(j, timeUnit);
    }

    @SchedulerSupport("io.reactivex:computation")
    @CheckReturnValue
    public final Observable<T> throttleWithTimeout(long j, TimeUnit timeUnit) {
        return debounce(j, timeUnit);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T, R> Observable<R> combineLatest(Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function) {
        return combineLatest(iterable, function, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T, R> Observable<R> combineLatestDelayError(Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function) {
        return combineLatestDelayError(iterable, function, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T, S> Observable<T> generate(Callable<S> callable, BiFunction<S, Emitter<T>, S> biFunction) {
        return generate(callable, biFunction, C68326a.m265193b());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Single<Boolean> sequenceEqual(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2) {
        return sequenceEqual(observableSource, observableSource2, C68362b.m265228a(), bufferSize());
    }

    @SchedulerSupport("io.reactivex:computation")
    @CheckReturnValue
    public static Observable<Long> timer(long j, TimeUnit timeUnit) {
        return timer(j, timeUnit, C68279a.m265021a());
    }

    @SchedulerSupport("none")
    public final void blockingSubscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        C68879k.m265448a(this, consumer, consumer2, C68326a.f171641c);
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: io.reactivex.Observable<U extends java.util.Collection<? super T>>, io.reactivex.Observable<java.util.List<T>> */
    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<List<T>> buffer(int i, int i2) {
        return (Observable<U>) buffer(i, i2, ArrayListSupplier.asCallable());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U> Single<U> collectInto(U u, AbstractC68310b<? super U, ? super T> bVar) {
        C68362b.m265229a((Object) u, "initialValue is null");
        return collect(C68326a.m265192a((Object) u), bVar);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final AbstractC68259a concatMapCompletableDelayError(Function<? super T, ? extends AbstractC68293e> function, boolean z) {
        return concatMapCompletableDelayError(function, z, 2);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> concatMapEagerDelayError(Function<? super T, ? extends ObservableSource<? extends R>> function, boolean z) {
        return concatMapEagerDelayError(function, Integer.MAX_VALUE, bufferSize(), z);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> concatMapMaybeDelayError(Function<? super T, ? extends AbstractC68990l<? extends R>> function, boolean z) {
        return concatMapMaybeDelayError(function, z, 2);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> concatMapSingleDelayError(Function<? super T, ? extends AbstractC69015w<? extends R>> function, boolean z) {
        return concatMapSingleDelayError(function, z, 2);
    }

    @SchedulerSupport("io.reactivex:computation")
    @CheckReturnValue
    public final Observable<T> debounce(long j, TimeUnit timeUnit) {
        return debounce(j, timeUnit, C68279a.m265021a());
    }

    @SchedulerSupport("io.reactivex:computation")
    @CheckReturnValue
    public final Observable<T> delay(long j, TimeUnit timeUnit) {
        return delay(j, timeUnit, C68279a.m265021a(), false);
    }

    @SchedulerSupport("io.reactivex:computation")
    @CheckReturnValue
    public final Observable<T> delaySubscription(long j, TimeUnit timeUnit) {
        return delaySubscription(j, timeUnit, C68279a.m265021a());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends R>> function, int i) {
        return flatMap((Function) function, false, i, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final AbstractC68259a flatMapCompletable(Function<? super T, ? extends AbstractC68293e> function, boolean z) {
        C68362b.m265229a((Object) function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ax(this, function, z));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> flatMapMaybe(Function<? super T, ? extends AbstractC68990l<? extends R>> function, boolean z) {
        C68362b.m265229a((Object) function, "mapper is null");
        return RxJavaPlugins.onAssembly(new ay(this, function, z));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> flatMapSingle(Function<? super T, ? extends AbstractC69015w<? extends R>> function, boolean z) {
        C68362b.m265229a((Object) function, "mapper is null");
        return RxJavaPlugins.onAssembly(new az(this, function, z));
    }

    @SchedulerSupport("io.reactivex:computation")
    @CheckReturnValue
    public final Observable<T> sample(long j, TimeUnit timeUnit) {
        return sample(j, timeUnit, C68279a.m265021a());
    }

    @SchedulerSupport("io.reactivex:computation")
    @CheckReturnValue
    public final Observable<T> skip(long j, TimeUnit timeUnit) {
        return skipUntil(timer(j, timeUnit));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> take(long j, TimeUnit timeUnit) {
        return takeUntil(timer(j, timeUnit));
    }

    @SchedulerSupport("io.reactivex:computation")
    @CheckReturnValue
    public final Observable<T> throttleFirst(long j, TimeUnit timeUnit) {
        return throttleFirst(j, timeUnit, C68279a.m265021a());
    }

    @SchedulerSupport("io.reactivex:computation")
    @CheckReturnValue
    public final Observable<T> throttleLatest(long j, TimeUnit timeUnit) {
        return throttleLatest(j, timeUnit, C68279a.m265021a(), false);
    }

    @SchedulerSupport("io.reactivex:computation")
    @CheckReturnValue
    public final Observable<T> timeout(long j, TimeUnit timeUnit) {
        return timeout0(j, timeUnit, null, C68279a.m265021a());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <K, V> Single<Map<K, Collection<V>>> toMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        return toMultimap(function, function2, HashMapSupplier.asCallable(), ArrayListSupplier.asFunction());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U, R> Observable<R> zipWith(ObservableSource<? extends U> observableSource, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        C68362b.m265229a((Object) observableSource, "other is null");
        return zip(this, observableSource, biFunction);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> concat(ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i) {
        C68362b.m265229a((Object) observableSource, "sources is null");
        C68362b.m265225a(i, "prefetch");
        return RxJavaPlugins.onAssembly(new C68909u(observableSource, C68326a.m265175a(), i, ErrorMode.IMMEDIATE));
    }

    @SchedulerSupport("io.reactivex:computation")
    @CheckReturnValue
    public static Observable<Long> interval(long j, TimeUnit timeUnit) {
        return interval(j, j, timeUnit, C68279a.m265021a());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> just(T t, T t2) {
        C68362b.m265229a((Object) t, "The first item is null");
        C68362b.m265229a((Object) t2, "The second item is null");
        return fromArray(t, t2);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> switchOnNext(ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i) {
        C68362b.m265229a((Object) observableSource, "sources is null");
        C68362b.m265225a(i, "bufferSize");
        return RxJavaPlugins.onAssembly(new dj(observableSource, C68326a.m265175a(), i, false));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> switchOnNextDelayError(ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i) {
        C68362b.m265229a((Object) observableSource, "sources is null");
        C68362b.m265225a(i, "prefetch");
        return RxJavaPlugins.onAssembly(new dj(observableSource, C68326a.m265175a(), i, true));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U> Single<U> collect(Callable<? extends U> callable, AbstractC68310b<? super U, ? super T> bVar) {
        C68362b.m265229a((Object) callable, "initialValueSupplier is null");
        C68362b.m265229a((Object) bVar, "collector is null");
        return RxJavaPlugins.onAssembly(new C68904s(this, callable, bVar));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final AbstractC68259a concatMapCompletable(Function<? super T, ? extends AbstractC68293e> function, int i) {
        C68362b.m265229a((Object) function, "mapper is null");
        C68362b.m265225a(i, "capacityHint");
        return RxJavaPlugins.onAssembly(new C68409b(this, function, ErrorMode.IMMEDIATE, i));
    }

    /* JADX DEBUG: Type inference failed for r2v2. Raw type applied. Possible types: io.reactivex.Observable<R>, io.reactivex.Observable<U> */
    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U> Observable<U> concatMapIterable(Function<? super T, ? extends Iterable<? extends U>> function, int i) {
        C68362b.m265229a((Object) function, "mapper is null");
        C68362b.m265225a(i, "prefetch");
        return (Observable<R>) concatMap(C68711bm.m265383b(function), i);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> concatMapMaybe(Function<? super T, ? extends AbstractC68990l<? extends R>> function, int i) {
        C68362b.m265229a((Object) function, "mapper is null");
        C68362b.m265225a(i, "prefetch");
        return RxJavaPlugins.onAssembly(new C68412c(this, function, ErrorMode.IMMEDIATE, i));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> concatMapSingle(Function<? super T, ? extends AbstractC69015w<? extends R>> function, int i) {
        C68362b.m265229a((Object) function, "mapper is null");
        C68362b.m265225a(i, "prefetch");
        return RxJavaPlugins.onAssembly(new C68415d(this, function, ErrorMode.IMMEDIATE, i));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> doOnLifecycle(Consumer<? super Disposable> consumer, AbstractC68309a aVar) {
        C68362b.m265229a((Object) consumer, "onSubscribe is null");
        C68362b.m265229a((Object) aVar, "onDispose is null");
        return RxJavaPlugins.onAssembly(new ao(this, consumer, aVar));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U, R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        return flatMap(function, biFunction, false, bufferSize(), bufferSize());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: io.reactivex.functions.BiFunction<? super T, ? super U, ? extends V> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r8v1. Raw type applied. Possible types: io.reactivex.Observable<R>, io.reactivex.Observable<V> */
    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U, V> Observable<V> flatMapIterable(Function<? super T, ? extends Iterable<? extends U>> function, BiFunction<? super T, ? super U, ? extends V> biFunction) {
        C68362b.m265229a((Object) function, "mapper is null");
        C68362b.m265229a((Object) biFunction, "resultSelector is null");
        return (Observable<R>) flatMap(C68711bm.m265383b(function), biFunction, false, bufferSize(), bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <K, V> Observable<AbstractC68272b<K, V>> groupBy(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        return groupBy(function, function2, false, bufferSize());
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> observeOn(Scheduler scheduler, boolean z) {
        return observeOn(scheduler, z, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Single<R> reduce(R r, BiFunction<R, ? super T, R> biFunction) {
        C68362b.m265229a((Object) r, "seed is null");
        C68362b.m265229a((Object) biFunction, "reducer is null");
        return RxJavaPlugins.onAssembly(new cj(this, r, biFunction));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Single<R> reduceWith(Callable<R> callable, BiFunction<R, ? super T, R> biFunction) {
        C68362b.m265229a((Object) callable, "seedSupplier is null");
        C68362b.m265229a((Object) biFunction, "reducer is null");
        return RxJavaPlugins.onAssembly(new ck(this, callable, biFunction));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> replay(Function<? super Observable<T>, ? extends ObservableSource<R>> function, int i) {
        C68362b.m265229a((Object) function, "selector is null");
        C68362b.m265225a(i, "bufferSize");
        return cp.m265408a(C68711bm.m265379a(this, i), function);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> scan(R r, BiFunction<R, ? super T, R> biFunction) {
        C68362b.m265229a((Object) r, "seed is null");
        return scanWith(C68326a.m265192a((Object) r), biFunction);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> scanWith(Callable<R> callable, BiFunction<R, ? super T, R> biFunction) {
        C68362b.m265229a((Object) callable, "seedSupplier is null");
        C68362b.m265229a((Object) biFunction, "accumulator is null");
        return RxJavaPlugins.onAssembly(new cw(this, callable, biFunction));
    }

    @SchedulerSupport("io.reactivex:trampoline")
    @CheckReturnValue
    public final Observable<T> skipLast(long j, TimeUnit timeUnit) {
        return skipLast(j, timeUnit, C68279a.m265024c(), false, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<Observable<T>> window(long j, long j2) {
        return window(j, j2, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U, R> Observable<R> withLatestFrom(ObservableSource<? extends U> observableSource, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        C68362b.m265229a((Object) observableSource, "other is null");
        C68362b.m265229a((Object) biFunction, "combiner is null");
        return RxJavaPlugins.onAssembly(new eg(this, biFunction, observableSource));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T, R> Observable<R> combineLatestDelayError(ObservableSource<? extends T>[] observableSourceArr, Function<? super Object[], ? extends R> function) {
        return combineLatestDelayError(observableSourceArr, function, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> concat(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2) {
        C68362b.m265229a((Object) observableSource, "source1 is null");
        C68362b.m265229a((Object) observableSource2, "source2 is null");
        return concatArray(observableSource, observableSource2);
    }

    public static Observable io_reactivex_Observable_com_ss_android_lark_integrator_lancet_RxObservableHook_subscribeOn(Observable observable, Scheduler scheduler) {
        if (observable instanceof C68654ab) {
            try {
                Field declaredField = observable.getClass().getDeclaredField(ShareHitPoint.f121868c);
                declaredField.setAccessible(true);
                Object obj = declaredField.get(observable);
                if (obj instanceof C26165s) {
                    ((C26165s) obj).f64628a = scheduler;
                }
            } catch (Exception e) {
                Log.e("RxObservableHook", "RxObservable Hook Fail:" + e.toString());
            }
        }
        return observable.Observable__subscribeOn$___twin___(scheduler);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> merge(ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i) {
        C68362b.m265229a((Object) observableSource, "sources is null");
        C68362b.m265225a(i, "maxConcurrency");
        return RxJavaPlugins.onAssembly(new av(observableSource, C68326a.m265175a(), false, i, bufferSize()));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> mergeDelayError(ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i) {
        C68362b.m265229a((Object) observableSource, "sources is null");
        C68362b.m265225a(i, "maxConcurrency");
        return RxJavaPlugins.onAssembly(new av(observableSource, C68326a.m265175a(), true, i, bufferSize()));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U extends Collection<? super T>> Observable<U> buffer(int i, Callable<U> callable) {
        return buffer(i, i, callable);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> concatMap(Function<? super T, ? extends ObservableSource<? extends R>> function, int i) {
        C68362b.m265229a((Object) function, "mapper is null");
        C68362b.m265225a(i, "prefetch");
        if (!(this instanceof AbstractCallableC68371h)) {
            return RxJavaPlugins.onAssembly(new C68909u(this, function, i, ErrorMode.IMMEDIATE));
        }
        Object call = ((AbstractCallableC68371h) this).call();
        if (call == null) {
            return empty();
        }
        return ObservableScalarXMap.m265360a(call, function);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <K> Observable<T> distinct(Function<? super T, K> function, Callable<? extends Collection<? super K>> callable) {
        C68362b.m265229a((Object) function, "keySelector is null");
        C68362b.m265229a((Object) callable, "collectionSupplier is null");
        return RxJavaPlugins.onAssembly(new aj(this, function, callable));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> elementAt(long j, T t) {
        if (j >= 0) {
            C68362b.m265229a((Object) t, "defaultItem is null");
            return RxJavaPlugins.onAssembly(new ar(this, j, t));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> retry(long j, AbstractC68322n<? super Throwable> nVar) {
        if (j >= 0) {
            C68362b.m265229a((Object) nVar, "predicate is null");
            return RxJavaPlugins.onAssembly(new cr(this, j, nVar));
        }
        throw new IllegalArgumentException("times >= 0 required but it was " + j);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        return subscribe(consumer, consumer2, C68326a.f171641c, C68326a.m265193b());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> switchMap(Function<? super T, ? extends ObservableSource<? extends R>> function, int i) {
        C68362b.m265229a((Object) function, "mapper is null");
        C68362b.m265225a(i, "bufferSize");
        if (!(this instanceof AbstractCallableC68371h)) {
            return RxJavaPlugins.onAssembly(new dj(this, function, i, false));
        }
        Object call = ((AbstractCallableC68371h) this).call();
        if (call == null) {
            return empty();
        }
        return ObservableScalarXMap.m265360a(call, function);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> switchMapDelayError(Function<? super T, ? extends ObservableSource<? extends R>> function, int i) {
        C68362b.m265229a((Object) function, "mapper is null");
        C68362b.m265225a(i, "bufferSize");
        if (!(this instanceof AbstractCallableC68371h)) {
            return RxJavaPlugins.onAssembly(new dj(this, function, i, true));
        }
        Object call = ((AbstractCallableC68371h) this).call();
        if (call == null) {
            return empty();
        }
        return ObservableScalarXMap.m265360a(call, function);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<C68288b<T>> timeInterval(TimeUnit timeUnit, Scheduler scheduler) {
        C68362b.m265229a((Object) timeUnit, "unit is null");
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new dt(this, timeUnit, scheduler));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<C68288b<T>> timestamp(TimeUnit timeUnit, Scheduler scheduler) {
        C68362b.m265229a((Object) timeUnit, "unit is null");
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        return map(C68326a.m265186a(timeUnit, scheduler));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <K, V> Single<Map<K, V>> toMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        C68362b.m265229a((Object) function, "keySelector is null");
        C68362b.m265229a((Object) function2, "valueSelector is null");
        return collect(HashMapSupplier.asCallable(), C68326a.m265188a(function, function2));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U, R> Observable<R> zipWith(Iterable<U> iterable, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        C68362b.m265229a((Object) iterable, "other is null");
        C68362b.m265229a((Object) biFunction, "zipper is null");
        return RxJavaPlugins.onAssembly(new ej(this, iterable, biFunction));
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public static <T> Observable<T> fromFuture(Future<? extends T> future, Scheduler scheduler) {
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        return fromFuture(future).subscribeOn(scheduler);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T, S> Observable<T> generate(Callable<S> callable, AbstractC68310b<S, Emitter<T>> bVar) {
        C68362b.m265229a((Object) bVar, "generator  is null");
        return generate(callable, C68711bm.m265373a(bVar), C68326a.m265193b());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> merge(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2) {
        C68362b.m265229a((Object) observableSource, "source1 is null");
        C68362b.m265229a((Object) observableSource2, "source2 is null");
        return fromArray(observableSource, observableSource2).flatMap(C68326a.m265175a(), false, 2);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> mergeDelayError(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2) {
        C68362b.m265229a((Object) observableSource, "source1 is null");
        C68362b.m265229a((Object) observableSource2, "source2 is null");
        return fromArray(observableSource, observableSource2).flatMap(C68326a.m265175a(), true, 2);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static Observable<Integer> range(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + i2);
        } else if (i2 == 0) {
            return empty();
        } else {
            if (i2 == 1) {
                return just(Integer.valueOf(i));
            }
            if (((long) i) + ((long) (i2 - 1)) <= 2147483647L) {
                return RxJavaPlugins.onAssembly(new cg(i, i2));
            }
            throw new IllegalArgumentException("Integer overflow");
        }
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static Observable<Long> rangeLong(long j, long j2) {
        int i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + j2);
        } else if (i == 0) {
            return empty();
        } else {
            if (j2 == 1) {
                return just(Long.valueOf(j));
            }
            long j3 = (j2 - 1) + j;
            if (j <= 0 || j3 >= 0) {
                return RxJavaPlugins.onAssembly(new ch(j, j2));
            }
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<List<T>> toSortedList(Comparator<? super T> comparator, int i) {
        C68362b.m265229a((Object) comparator, "comparator is null");
        return toList(i).map(C68326a.m265185a((Comparator) comparator));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<V>> */
    /* JADX WARN: Multi-variable type inference failed */
    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U, V> Observable<T> delay(ObservableSource<U> observableSource, Function<? super T, ? extends ObservableSource<V>> function) {
        return delaySubscription(observableSource).delay(function);
    }

    /* JADX DEBUG: Type inference failed for r3v1. Raw type applied. Possible types: io.reactivex.Observable<io.reactivex.b.b<K, V>>, io.reactivex.Observable<io.reactivex.b.b<K, T>> */
    @SchedulerSupport("none")
    @CheckReturnValue
    public final <K> Observable<AbstractC68272b<K, T>> groupBy(Function<? super T, ? extends K> function, boolean z) {
        return (Observable<AbstractC68272b<K, V>>) groupBy(function, C68326a.m265175a(), z, bufferSize());
    }

    @SchedulerSupport("io.reactivex:trampoline")
    @CheckReturnValue
    public final Observable<T> takeLast(long j, TimeUnit timeUnit) {
        return takeLast(j, timeUnit, C68279a.m265024c(), false, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U, V> Observable<T> timeout(ObservableSource<U> observableSource, Function<? super T, ? extends ObservableSource<V>> function) {
        C68362b.m265229a((Object) observableSource, "firstTimeoutIndicator is null");
        return timeout0(observableSource, function, null);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U> Observable<T> sample(ObservableSource<U> observableSource, boolean z) {
        C68362b.m265229a((Object) observableSource, "sampler is null");
        return RxJavaPlugins.onAssembly(new cu(this, observableSource, z));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> withLatestFrom(Iterable<? extends ObservableSource<?>> iterable, Function<? super Object[], R> function) {
        C68362b.m265229a((Object) iterable, "others is null");
        C68362b.m265229a((Object) function, "combiner is null");
        return RxJavaPlugins.onAssembly(new eh(this, iterable, function));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> merge(Iterable<? extends ObservableSource<? extends T>> iterable, int i) {
        return fromIterable(iterable).flatMap(C68326a.m265175a(), i);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> mergeDelayError(Iterable<? extends ObservableSource<? extends T>> iterable, int i) {
        return fromIterable(iterable).flatMap(C68326a.m265175a(), true, i);
    }

    @SchedulerSupport("io.reactivex:computation")
    @CheckReturnValue
    public final Observable<List<T>> buffer(long j, TimeUnit timeUnit) {
        return buffer(j, timeUnit, C68279a.m265021a(), Integer.MAX_VALUE);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <V> Observable<T> timeout(Function<? super T, ? extends ObservableSource<V>> function, ObservableSource<? extends T> observableSource) {
        C68362b.m265229a((Object) observableSource, "other is null");
        return timeout0(null, function, observableSource);
    }

    @SchedulerSupport("io.reactivex:computation")
    @CheckReturnValue
    public final Observable<Observable<T>> window(long j, TimeUnit timeUnit) {
        return window(j, timeUnit, C68279a.m265021a(), Long.MAX_VALUE, false);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> withLatestFrom(ObservableSource<?>[] observableSourceArr, Function<? super Object[], R> function) {
        C68362b.m265229a((Object) observableSourceArr, "others is null");
        C68362b.m265229a((Object) function, "combiner is null");
        return RxJavaPlugins.onAssembly(new eh(this, observableSourceArr, function));
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final <R> Observable<R> replay(Function<? super Observable<T>, ? extends ObservableSource<R>> function, Scheduler scheduler) {
        C68362b.m265229a((Object) function, "selector is null");
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        return cp.m265408a(C68711bm.m265378a(this), C68711bm.m265376a(function, scheduler));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T, R> Observable<R> combineLatest(Function<? super Object[], ? extends R> function, int i, ObservableSource<? extends T>... observableSourceArr) {
        return combineLatest(observableSourceArr, function, i);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T, R> Observable<R> combineLatestDelayError(Function<? super Object[], ? extends R> function, int i, ObservableSource<? extends T>... observableSourceArr) {
        return combineLatestDelayError(observableSourceArr, function, i);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T, D> Observable<T> using(Callable<? extends D> callable, Function<? super D, ? extends ObservableSource<? extends T>> function, Consumer<? super D> consumer) {
        return using(callable, function, consumer, true);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U, R> Observable<R> zipWith(ObservableSource<? extends U> observableSource, BiFunction<? super T, ? super U, ? extends R> biFunction, boolean z) {
        return zip(this, observableSource, biFunction, z);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> concatArrayEager(int i, int i2, ObservableSource<? extends T>... observableSourceArr) {
        return fromArray(observableSourceArr).concatMapEagerDelayError(C68326a.m265175a(), i, i2, false);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> concatArrayEagerDelayError(int i, int i2, ObservableSource<? extends T>... observableSourceArr) {
        return fromArray(observableSourceArr).concatMapEagerDelayError(C68326a.m265175a(), i, i2, true);
    }

    @SchedulerSupport("io.reactivex:computation")
    @CheckReturnValue
    public static Observable<Long> interval(long j, long j2, TimeUnit timeUnit) {
        return interval(j, j2, timeUnit, C68279a.m265021a());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> mergeArray(int i, int i2, ObservableSource<? extends T>... observableSourceArr) {
        return fromArray(observableSourceArr).flatMap(C68326a.m265175a(), false, i, i2);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> mergeArrayDelayError(int i, int i2, ObservableSource<? extends T>... observableSourceArr) {
        return fromArray(observableSourceArr).flatMap(C68326a.m265175a(), true, i, i2);
    }

    private <U, V> Observable<T> timeout0(ObservableSource<U> observableSource, Function<? super T, ? extends ObservableSource<V>> function, ObservableSource<? extends T> observableSource2) {
        C68362b.m265229a((Object) function, "itemTimeoutIndicator is null");
        return RxJavaPlugins.onAssembly(new du(this, observableSource, function, observableSource2));
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> skipLast(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return skipLast(j, timeUnit, scheduler, false, bufferSize());
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> throttleLast(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return sample(j, timeUnit, scheduler);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> throttleWithTimeout(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return debounce(j, timeUnit, scheduler);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T1, T2, R> Observable<R> combineLatest(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        C68362b.m265229a((Object) observableSource, "source1 is null");
        C68362b.m265229a((Object) observableSource2, "source2 is null");
        return combineLatest(C68326a.m265176a((BiFunction) biFunction), bufferSize(), observableSource, observableSource2);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T, R> Observable<R> combineLatestDelayError(Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i) {
        C68362b.m265229a((Object) iterable, "sources is null");
        C68362b.m265229a((Object) function, "combiner is null");
        C68362b.m265225a(i, "bufferSize");
        return RxJavaPlugins.onAssembly(new C68906t(null, iterable, function, i << 1, true));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> concatDelayError(ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i, boolean z) {
        ErrorMode errorMode;
        C68362b.m265229a((Object) observableSource, "sources is null");
        C68362b.m265225a(i, "prefetch is null");
        Function a = C68326a.m265175a();
        if (z) {
            errorMode = ErrorMode.END;
        } else {
            errorMode = ErrorMode.BOUNDARY;
        }
        return RxJavaPlugins.onAssembly(new C68909u(observableSource, a, i, errorMode));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> concatEager(ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i, int i2) {
        return wrap(observableSource).concatMapEager(C68326a.m265175a(), i, i2);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Single<Boolean> sequenceEqual(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, int i) {
        return sequenceEqual(observableSource, observableSource2, C68362b.m265228a(), i);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public static Observable<Long> timer(long j, TimeUnit timeUnit, Scheduler scheduler) {
        C68362b.m265229a((Object) timeUnit, "unit is null");
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new dw(Math.max(j, 0L), timeUnit, scheduler));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T1, T2, R> Observable<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        C68362b.m265229a((Object) observableSource, "source1 is null");
        C68362b.m265229a((Object) observableSource2, "source2 is null");
        return zipArray(C68326a.m265176a((BiFunction) biFunction), false, bufferSize(), observableSource, observableSource2);
    }

    @SchedulerSupport("none")
    public final void blockingSubscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, AbstractC68309a aVar) {
        C68879k.m265448a(this, consumer, consumer2, aVar);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U extends Collection<? super T>> Observable<U> buffer(int i, int i2, Callable<U> callable) {
        C68362b.m265225a(i, "count");
        C68362b.m265225a(i2, "skip");
        C68362b.m265229a((Object) callable, "bufferSupplier is null");
        return RxJavaPlugins.onAssembly(new C68880l(this, i, i2, callable));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final AbstractC68259a concatMapCompletableDelayError(Function<? super T, ? extends AbstractC68293e> function, boolean z, int i) {
        ErrorMode errorMode;
        C68362b.m265229a((Object) function, "mapper is null");
        C68362b.m265225a(i, "prefetch");
        if (z) {
            errorMode = ErrorMode.END;
        } else {
            errorMode = ErrorMode.BOUNDARY;
        }
        return RxJavaPlugins.onAssembly(new C68409b(this, function, errorMode, i));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> concatMapEager(Function<? super T, ? extends ObservableSource<? extends R>> function, int i, int i2) {
        C68362b.m265229a((Object) function, "mapper is null");
        C68362b.m265225a(i, "maxConcurrency");
        C68362b.m265225a(i2, "prefetch");
        return RxJavaPlugins.onAssembly(new C68914v(this, function, ErrorMode.IMMEDIATE, i, i2));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> concatMapMaybeDelayError(Function<? super T, ? extends AbstractC68990l<? extends R>> function, boolean z, int i) {
        ErrorMode errorMode;
        C68362b.m265229a((Object) function, "mapper is null");
        C68362b.m265225a(i, "prefetch");
        if (z) {
            errorMode = ErrorMode.END;
        } else {
            errorMode = ErrorMode.BOUNDARY;
        }
        return RxJavaPlugins.onAssembly(new C68412c(this, function, errorMode, i));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> concatMapSingleDelayError(Function<? super T, ? extends AbstractC69015w<? extends R>> function, boolean z, int i) {
        ErrorMode errorMode;
        C68362b.m265229a((Object) function, "mapper is null");
        C68362b.m265225a(i, "prefetch");
        if (z) {
            errorMode = ErrorMode.END;
        } else {
            errorMode = ErrorMode.BOUNDARY;
        }
        return RxJavaPlugins.onAssembly(new C68415d(this, function, errorMode, i));
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> debounce(long j, TimeUnit timeUnit, Scheduler scheduler) {
        C68362b.m265229a((Object) timeUnit, "unit is null");
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new C68660ad(this, j, timeUnit, scheduler));
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> delay(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return delay(j, timeUnit, scheduler, false);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> delaySubscription(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return delaySubscription(timer(j, timeUnit, scheduler));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Disposable forEachWhile(AbstractC68322n<? super T> nVar, Consumer<? super Throwable> consumer, AbstractC68309a aVar) {
        C68362b.m265229a((Object) nVar, "onNext is null");
        C68362b.m265229a((Object) consumer, "onError is null");
        C68362b.m265229a((Object) aVar, "onComplete is null");
        ForEachWhileObserver forEachWhileObserver = new ForEachWhileObserver(nVar, consumer, aVar);
        subscribe(forEachWhileObserver);
        return forEachWhileObserver;
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> sample(long j, TimeUnit timeUnit, Scheduler scheduler) {
        C68362b.m265229a((Object) timeUnit, "unit is null");
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ct(this, j, timeUnit, scheduler, false));
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> take(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return takeUntil(timer(j, timeUnit, scheduler));
    }

    @SchedulerSupport("io.reactivex:trampoline")
    @CheckReturnValue
    public final Observable<T> takeLast(long j, long j2, TimeUnit timeUnit) {
        return takeLast(j, j2, timeUnit, C68279a.m265024c(), false, bufferSize());
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> throttleFirst(long j, TimeUnit timeUnit, Scheduler scheduler) {
        C68362b.m265229a((Object) timeUnit, "unit is null");
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new C68821dr(this, j, timeUnit, scheduler));
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> throttleLatest(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return throttleLatest(j, timeUnit, scheduler, false);
    }

    @SchedulerSupport("io.reactivex:computation")
    @CheckReturnValue
    public final Observable<T> timeout(long j, TimeUnit timeUnit, ObservableSource<? extends T> observableSource) {
        C68362b.m265229a((Object) observableSource, "other is null");
        return timeout0(j, timeUnit, observableSource, C68279a.m265021a());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> fromFuture(Future<? extends T> future, long j, TimeUnit timeUnit) {
        C68362b.m265229a((Object) future, "future is null");
        C68362b.m265229a((Object) timeUnit, "unit is null");
        return RxJavaPlugins.onAssembly(new bd(future, j, timeUnit));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T, S> Observable<T> generate(Callable<S> callable, BiFunction<S, Emitter<T>, S> biFunction, Consumer<? super S> consumer) {
        C68362b.m265229a((Object) callable, "initialState is null");
        C68362b.m265229a((Object) biFunction, "generator  is null");
        C68362b.m265229a((Object) consumer, "disposeState is null");
        return RxJavaPlugins.onAssembly(new bh(callable, biFunction, consumer));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> just(T t, T t2, T t3) {
        C68362b.m265229a((Object) t, "The first item is null");
        C68362b.m265229a((Object) t2, "The second item is null");
        C68362b.m265229a((Object) t3, "The third item is null");
        return fromArray(t, t2, t3);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Single<Boolean> sequenceEqual(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, AbstractC68311c<? super T, ? super T> cVar) {
        return sequenceEqual(observableSource, observableSource2, cVar, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> concatMapDelayError(Function<? super T, ? extends ObservableSource<? extends R>> function, int i, boolean z) {
        ErrorMode errorMode;
        C68362b.m265229a((Object) function, "mapper is null");
        C68362b.m265225a(i, "prefetch");
        if (this instanceof AbstractCallableC68371h) {
            Object call = ((AbstractCallableC68371h) this).call();
            if (call == null) {
                return empty();
            }
            return ObservableScalarXMap.m265360a(call, function);
        }
        if (z) {
            errorMode = ErrorMode.END;
        } else {
            errorMode = ErrorMode.BOUNDARY;
        }
        return RxJavaPlugins.onAssembly(new C68909u(this, function, i, errorMode));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U, R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction, int i) {
        return flatMap(function, biFunction, false, i, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <K, V> Observable<AbstractC68272b<K, V>> groupBy(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, boolean z) {
        return groupBy(function, function2, z, bufferSize());
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> observeOn(Scheduler scheduler, boolean z, int i) {
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        C68362b.m265225a(i, "bufferSize");
        return RxJavaPlugins.onAssembly(new cb(this, scheduler, z, i));
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> skip(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return skipUntil(timer(j, timeUnit, scheduler));
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> timeout(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return timeout0(j, timeUnit, null, scheduler);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <K, V> Single<Map<K, Collection<V>>> toMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, Callable<Map<K, Collection<V>>> callable) {
        return toMultimap(function, function2, callable, ArrayListSupplier.asFunction());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<Observable<T>> window(long j, long j2, int i) {
        C68362b.m265227a(j, "count");
        C68362b.m265227a(j2, "skip");
        C68362b.m265225a(i, "bufferSize");
        return RxJavaPlugins.onAssembly(new eb(this, j, j2, i));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T, R> Observable<R> combineLatestDelayError(ObservableSource<? extends T>[] observableSourceArr, Function<? super Object[], ? extends R> function, int i) {
        C68362b.m265225a(i, "bufferSize");
        C68362b.m265229a((Object) function, "combiner is null");
        if (observableSourceArr.length == 0) {
            return empty();
        }
        return RxJavaPlugins.onAssembly(new C68906t(observableSourceArr, null, function, i << 1, true));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> concat(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, ObservableSource<? extends T> observableSource3) {
        C68362b.m265229a((Object) observableSource, "source1 is null");
        C68362b.m265229a((Object) observableSource2, "source2 is null");
        C68362b.m265229a((Object) observableSource3, "source3 is null");
        return concatArray(observableSource, observableSource2, observableSource3);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> concatEager(Iterable<? extends ObservableSource<? extends T>> iterable, int i, int i2) {
        return fromIterable(iterable).concatMapEagerDelayError(C68326a.m265175a(), i, i2, false);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public static Observable<Long> interval(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return interval(j, j, timeUnit, scheduler);
    }

    /* JADX DEBUG: Type inference failed for r9v1. Raw type applied. Possible types: io.reactivex.Observable<U extends java.util.Collection<? super T>>, io.reactivex.Observable<java.util.List<T>> */
    @SchedulerSupport("io.reactivex:computation")
    @CheckReturnValue
    public final Observable<List<T>> buffer(long j, long j2, TimeUnit timeUnit) {
        return (Observable<U>) buffer(j, j2, timeUnit, C68279a.m265021a(), ArrayListSupplier.asCallable());
    }

    @SchedulerSupport("io.reactivex:computation")
    @CheckReturnValue
    public final Observable<T> delay(long j, TimeUnit timeUnit, boolean z) {
        return delay(j, timeUnit, C68279a.m265021a(), z);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U, R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction, boolean z) {
        return flatMap(function, biFunction, z, bufferSize(), bufferSize());
    }

    @SchedulerSupport("io.reactivex:computation")
    @CheckReturnValue
    public final Observable<T> sample(long j, TimeUnit timeUnit, boolean z) {
        return sample(j, timeUnit, C68279a.m265021a(), z);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, AbstractC68309a aVar) {
        return subscribe(consumer, consumer2, aVar, C68326a.m265193b());
    }

    @SchedulerSupport("io.reactivex:computation")
    @CheckReturnValue
    public final Observable<T> throttleLatest(long j, TimeUnit timeUnit, boolean z) {
        return throttleLatest(j, timeUnit, C68279a.m265021a(), z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.concurrent.Callable<? extends java.util.Map<K, V>> */
    /* JADX WARN: Multi-variable type inference failed */
    @SchedulerSupport("none")
    @CheckReturnValue
    public final <K, V> Single<Map<K, V>> toMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, Callable<? extends Map<K, V>> callable) {
        C68362b.m265229a((Object) function, "keySelector is null");
        C68362b.m265229a((Object) function2, "valueSelector is null");
        C68362b.m265229a((Object) callable, "mapSupplier is null");
        return collect(callable, C68326a.m265188a(function, function2));
    }

    @SchedulerSupport("io.reactivex:computation")
    @CheckReturnValue
    public final Observable<Observable<T>> window(long j, long j2, TimeUnit timeUnit) {
        return window(j, j2, timeUnit, C68279a.m265021a(), bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T, S> Observable<T> generate(Callable<S> callable, AbstractC68310b<S, Emitter<T>> bVar, Consumer<? super S> consumer) {
        C68362b.m265229a((Object) bVar, "generator  is null");
        return generate(callable, C68711bm.m265373a(bVar), consumer);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> merge(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, ObservableSource<? extends T> observableSource3) {
        C68362b.m265229a((Object) observableSource, "source1 is null");
        C68362b.m265229a((Object) observableSource2, "source2 is null");
        C68362b.m265229a((Object) observableSource3, "source3 is null");
        return fromArray(observableSource, observableSource2, observableSource3).flatMap(C68326a.m265175a(), false, 3);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> mergeDelayError(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, ObservableSource<? extends T> observableSource3) {
        C68362b.m265229a((Object) observableSource, "source1 is null");
        C68362b.m265229a((Object) observableSource2, "source2 is null");
        C68362b.m265229a((Object) observableSource3, "source3 is null");
        return fromArray(observableSource, observableSource2, observableSource3).flatMap(C68326a.m265175a(), true, 3);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final <R> Observable<R> replay(Function<? super Observable<T>, ? extends ObservableSource<R>> function, int i, Scheduler scheduler) {
        C68362b.m265229a((Object) function, "selector is null");
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        C68362b.m265225a(i, "bufferSize");
        return cp.m265408a(C68711bm.m265379a(this, i), C68711bm.m265376a(function, scheduler));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: io.reactivex.Observable<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, R> Observable<R> withLatestFrom(ObservableSource<T1> observableSource, ObservableSource<T2> observableSource2, AbstractC68314f<? super T, ? super T1, ? super T2, R> fVar) {
        C68362b.m265229a((Object) observableSource, "o1 is null");
        C68362b.m265229a((Object) observableSource2, "o2 is null");
        C68362b.m265229a((Object) fVar, "combiner is null");
        return withLatestFrom(new ObservableSource[]{observableSource, observableSource2}, C68326a.m265177a((AbstractC68314f) fVar));
    }

    @SchedulerSupport("io.reactivex:computation")
    @CheckReturnValue
    public final <R> Observable<R> replay(Function<? super Observable<T>, ? extends ObservableSource<R>> function, long j, TimeUnit timeUnit) {
        return replay(function, j, timeUnit, C68279a.m265021a());
    }

    @SchedulerSupport("io.reactivex:trampoline")
    @CheckReturnValue
    public final Observable<T> skipLast(long j, TimeUnit timeUnit, boolean z) {
        return skipLast(j, timeUnit, C68279a.m265024c(), z, bufferSize());
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> takeLast(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return takeLast(j, timeUnit, scheduler, false, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U, V> Observable<T> timeout(ObservableSource<U> observableSource, Function<? super T, ? extends ObservableSource<V>> function, ObservableSource<? extends T> observableSource2) {
        C68362b.m265229a((Object) observableSource, "firstTimeoutIndicator is null");
        C68362b.m265229a((Object) observableSource2, "other is null");
        return timeout0(observableSource, function, observableSource2);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends R>> function, Function<? super Throwable, ? extends ObservableSource<? extends R>> function2, Callable<? extends ObservableSource<? extends R>> callable) {
        C68362b.m265229a((Object) function, "onNextMapper is null");
        C68362b.m265229a((Object) function2, "onErrorMapper is null");
        C68362b.m265229a((Object) callable, "onCompleteSupplier is null");
        return merge(new bv(this, function, function2, callable));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> merge(Iterable<? extends ObservableSource<? extends T>> iterable, int i, int i2) {
        return fromIterable(iterable).flatMap(C68326a.m265175a(), false, i, i2);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> mergeDelayError(Iterable<? extends ObservableSource<? extends T>> iterable, int i, int i2) {
        return fromIterable(iterable).flatMap(C68326a.m265175a(), true, i, i2);
    }

    @SchedulerSupport("io.reactivex:computation")
    @CheckReturnValue
    public final Observable<List<T>> buffer(long j, TimeUnit timeUnit, int i) {
        return buffer(j, timeUnit, C68279a.m265021a(), i);
    }

    @SchedulerSupport("io.reactivex:computation")
    @CheckReturnValue
    public final Observable<Observable<T>> window(long j, TimeUnit timeUnit, long j2) {
        return window(j, timeUnit, C68279a.m265021a(), j2, false);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public static <T> Observable<T> fromFuture(Future<? extends T> future, long j, TimeUnit timeUnit, Scheduler scheduler) {
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        return fromFuture(future, j, timeUnit).subscribeOn(scheduler);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> takeLast(long j, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        return takeLast(j, j2, timeUnit, scheduler, false, bufferSize());
    }

    private Observable<T> timeout0(long j, TimeUnit timeUnit, ObservableSource<? extends T> observableSource, Scheduler scheduler) {
        C68362b.m265229a((Object) timeUnit, "timeUnit is null");
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new dv(this, j, timeUnit, scheduler, observableSource));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T, D> Observable<T> using(Callable<? extends D> callable, Function<? super D, ? extends ObservableSource<? extends T>> function, Consumer<? super D> consumer, boolean z) {
        C68362b.m265229a((Object) callable, "resourceSupplier is null");
        C68362b.m265229a((Object) function, "sourceSupplier is null");
        C68362b.m265229a((Object) consumer, "disposer is null");
        return RxJavaPlugins.onAssembly(new ea(callable, function, consumer, z));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T, R> Observable<R> zipIterable(Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function, boolean z, int i) {
        C68362b.m265229a((Object) function, "zipper is null");
        C68362b.m265229a((Object) iterable, "sources is null");
        C68362b.m265225a(i, "bufferSize");
        return RxJavaPlugins.onAssembly(new ei(null, iterable, function, i, z));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U, R> Observable<R> zipWith(ObservableSource<? extends U> observableSource, BiFunction<? super T, ? super U, ? extends R> biFunction, boolean z, int i) {
        return zip(this, observableSource, biFunction, z, i);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    private Observable<T> doOnEach(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, AbstractC68309a aVar, AbstractC68309a aVar2) {
        C68362b.m265229a((Object) consumer, "onNext is null");
        C68362b.m265229a((Object) consumer2, "onError is null");
        C68362b.m265229a((Object) aVar, "onComplete is null");
        C68362b.m265229a((Object) aVar2, "onAfterTerminate is null");
        return RxJavaPlugins.onAssembly(new an(this, consumer, consumer2, aVar, aVar2));
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public static Observable<Long> interval(long j, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        C68362b.m265229a((Object) timeUnit, "unit is null");
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new bn(Math.max(0L, j), Math.max(0L, j2), timeUnit, scheduler));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T, R> Observable<R> zipArray(Function<? super Object[], ? extends R> function, boolean z, int i, ObservableSource<? extends T>... observableSourceArr) {
        if (observableSourceArr.length == 0) {
            return empty();
        }
        C68362b.m265229a((Object) function, "zipper is null");
        C68362b.m265225a(i, "bufferSize");
        return RxJavaPlugins.onAssembly(new ei(observableSourceArr, null, function, i, z));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> concatMapEagerDelayError(Function<? super T, ? extends ObservableSource<? extends R>> function, int i, int i2, boolean z) {
        ErrorMode errorMode;
        C68362b.m265229a((Object) function, "mapper is null");
        C68362b.m265225a(i, "maxConcurrency");
        C68362b.m265225a(i2, "prefetch");
        if (z) {
            errorMode = ErrorMode.END;
        } else {
            errorMode = ErrorMode.BOUNDARY;
        }
        return RxJavaPlugins.onAssembly(new C68914v(this, function, errorMode, i, i2));
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> delay(long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        C68362b.m265229a((Object) timeUnit, "unit is null");
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new C68664af(this, j, timeUnit, scheduler, z));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <TRight, TLeftEnd, TRightEnd, R> Observable<R> groupJoin(ObservableSource<? extends TRight> observableSource, Function<? super T, ? extends ObservableSource<TLeftEnd>> function, Function<? super TRight, ? extends ObservableSource<TRightEnd>> function2, BiFunction<? super T, ? super Observable<TRight>, ? extends R> biFunction) {
        C68362b.m265229a((Object) observableSource, "other is null");
        C68362b.m265229a((Object) function, "leftEnd is null");
        C68362b.m265229a((Object) function2, "rightEnd is null");
        C68362b.m265229a((Object) biFunction, "resultSelector is null");
        return RxJavaPlugins.onAssembly(new bi(this, observableSource, function, function2, biFunction));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <TRight, TLeftEnd, TRightEnd, R> Observable<R> join(ObservableSource<? extends TRight> observableSource, Function<? super T, ? extends ObservableSource<TLeftEnd>> function, Function<? super TRight, ? extends ObservableSource<TRightEnd>> function2, BiFunction<? super T, ? super TRight, ? extends R> biFunction) {
        C68362b.m265229a((Object) observableSource, "other is null");
        C68362b.m265229a((Object) function, "leftEnd is null");
        C68362b.m265229a((Object) function2, "rightEnd is null");
        C68362b.m265229a((Object) biFunction, "resultSelector is null");
        return RxJavaPlugins.onAssembly(new bp(this, observableSource, function, function2, biFunction));
    }

    @SchedulerSupport("io.reactivex:computation")
    @CheckReturnValue
    public final <R> Observable<R> replay(Function<? super Observable<T>, ? extends ObservableSource<R>> function, int i, long j, TimeUnit timeUnit) {
        return replay(function, i, j, timeUnit, C68279a.m265021a());
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> sample(long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        C68362b.m265229a((Object) timeUnit, "unit is null");
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ct(this, j, timeUnit, scheduler, z));
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> throttleLatest(long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        C68362b.m265229a((Object) timeUnit, "unit is null");
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ds(this, j, timeUnit, scheduler, z));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> just(T t, T t2, T t3, T t4) {
        C68362b.m265229a((Object) t, "The first item is null");
        C68362b.m265229a((Object) t2, "The second item is null");
        C68362b.m265229a((Object) t3, "The third item is null");
        C68362b.m265229a((Object) t4, "The fourth item is null");
        return fromArray(t, t2, t3, t4);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Single<Boolean> sequenceEqual(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, AbstractC68311c<? super T, ? super T> cVar, int i) {
        C68362b.m265229a((Object) observableSource, "source1 is null");
        C68362b.m265229a((Object) observableSource2, "source2 is null");
        C68362b.m265229a((Object) cVar, "isEqual is null");
        C68362b.m265225a(i, "bufferSize");
        return RxJavaPlugins.onAssembly(new cy(observableSource, observableSource2, cVar, i));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <K, V> Observable<AbstractC68272b<K, V>> groupBy(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, boolean z, int i) {
        C68362b.m265229a((Object) function, "keySelector is null");
        C68362b.m265229a((Object) function2, "valueSelector is null");
        C68362b.m265225a(i, "bufferSize");
        return RxJavaPlugins.onAssembly(new ObservableGroupBy(this, function, function2, i, z));
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> skipLast(long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        return skipLast(j, timeUnit, scheduler, z, bufferSize());
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> timeout(long j, TimeUnit timeUnit, Scheduler scheduler, ObservableSource<? extends T> observableSource) {
        C68362b.m265229a((Object) observableSource, "other is null");
        return timeout0(j, timeUnit, observableSource, scheduler);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.concurrent.Callable<? extends java.util.Map<K, java.util.Collection<V>>> */
    /* JADX WARN: Multi-variable type inference failed */
    @SchedulerSupport("none")
    @CheckReturnValue
    public final <K, V> Single<Map<K, Collection<V>>> toMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, Callable<? extends Map<K, Collection<V>>> callable, Function<? super K, ? extends Collection<? super V>> function3) {
        C68362b.m265229a((Object) function, "keySelector is null");
        C68362b.m265229a((Object) function2, "valueSelector is null");
        C68362b.m265229a((Object) callable, "mapSupplier is null");
        C68362b.m265229a((Object) function3, "collectionFactory is null");
        return collect(callable, C68326a.m265189a(function, function2, function3));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: io.reactivex.Observable<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, R> Observable<R> withLatestFrom(ObservableSource<T1> observableSource, ObservableSource<T2> observableSource2, ObservableSource<T3> observableSource3, AbstractC68315g<? super T, ? super T1, ? super T2, ? super T3, R> gVar) {
        C68362b.m265229a((Object) observableSource, "o1 is null");
        C68362b.m265229a((Object) observableSource2, "o2 is null");
        C68362b.m265229a((Object) observableSource3, "o3 is null");
        C68362b.m265229a((Object) gVar, "combiner is null");
        return withLatestFrom(new ObservableSource[]{observableSource, observableSource2, observableSource3}, C68326a.m265178a((AbstractC68315g) gVar));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> concat(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, ObservableSource<? extends T> observableSource3, ObservableSource<? extends T> observableSource4) {
        C68362b.m265229a((Object) observableSource, "source1 is null");
        C68362b.m265229a((Object) observableSource2, "source2 is null");
        C68362b.m265229a((Object) observableSource3, "source3 is null");
        C68362b.m265229a((Object) observableSource4, "source4 is null");
        return concatArray(observableSource, observableSource2, observableSource3, observableSource4);
    }

    /* JADX DEBUG: Type inference failed for r9v1. Raw type applied. Possible types: io.reactivex.Observable<U extends java.util.Collection<? super T>>, io.reactivex.Observable<java.util.List<T>> */
    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<List<T>> buffer(long j, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        return (Observable<U>) buffer(j, j2, timeUnit, scheduler, ArrayListSupplier.asCallable());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U, R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction, boolean z, int i) {
        return flatMap(function, biFunction, z, i, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, AbstractC68309a aVar, Consumer<? super Disposable> consumer3) {
        C68362b.m265229a((Object) consumer, "onNext is null");
        C68362b.m265229a((Object) consumer2, "onError is null");
        C68362b.m265229a((Object) aVar, "onComplete is null");
        C68362b.m265229a((Object) consumer3, "onSubscribe is null");
        LambdaObserver lambdaObserver = new LambdaObserver(consumer, consumer2, aVar, consumer3);
        subscribe(lambdaObserver);
        return lambdaObserver;
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<Observable<T>> window(long j, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        return window(j, j2, timeUnit, scheduler, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> merge(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, ObservableSource<? extends T> observableSource3, ObservableSource<? extends T> observableSource4) {
        C68362b.m265229a((Object) observableSource, "source1 is null");
        C68362b.m265229a((Object) observableSource2, "source2 is null");
        C68362b.m265229a((Object) observableSource3, "source3 is null");
        C68362b.m265229a((Object) observableSource4, "source4 is null");
        return fromArray(observableSource, observableSource2, observableSource3, observableSource4).flatMap(C68326a.m265175a(), false, 4);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> mergeDelayError(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, ObservableSource<? extends T> observableSource3, ObservableSource<? extends T> observableSource4) {
        C68362b.m265229a((Object) observableSource, "source1 is null");
        C68362b.m265229a((Object) observableSource2, "source2 is null");
        C68362b.m265229a((Object) observableSource3, "source3 is null");
        C68362b.m265229a((Object) observableSource4, "source4 is null");
        return fromArray(observableSource, observableSource2, observableSource3, observableSource4).flatMap(C68326a.m265175a(), true, 4);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final <R> Observable<R> replay(Function<? super Observable<T>, ? extends ObservableSource<R>> function, long j, TimeUnit timeUnit, Scheduler scheduler) {
        C68362b.m265229a((Object) function, "selector is null");
        C68362b.m265229a((Object) timeUnit, "unit is null");
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        return cp.m265408a(C68711bm.m265381a(this, j, timeUnit, scheduler), function);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> takeLast(long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        return takeLast(j, timeUnit, scheduler, z, bufferSize());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends R>> function, Function<Throwable, ? extends ObservableSource<? extends R>> function2, Callable<? extends ObservableSource<? extends R>> callable, int i) {
        C68362b.m265229a((Object) function, "onNextMapper is null");
        C68362b.m265229a((Object) function2, "onErrorMapper is null");
        C68362b.m265229a((Object) callable, "onCompleteSupplier is null");
        return merge(new bv(this, function, function2, callable), i);
    }

    @SchedulerSupport("io.reactivex:computation")
    @CheckReturnValue
    public static Observable<Long> intervalRange(long j, long j2, long j3, long j4, TimeUnit timeUnit) {
        return intervalRange(j, j2, j3, j4, timeUnit, C68279a.m265021a());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: io.reactivex.Observable<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, T4, R> Observable<R> withLatestFrom(ObservableSource<T1> observableSource, ObservableSource<T2> observableSource2, ObservableSource<T3> observableSource3, ObservableSource<T4> observableSource4, AbstractC68316h<? super T, ? super T1, ? super T2, ? super T3, ? super T4, R> hVar) {
        C68362b.m265229a((Object) observableSource, "o1 is null");
        C68362b.m265229a((Object) observableSource2, "o2 is null");
        C68362b.m265229a((Object) observableSource3, "o3 is null");
        C68362b.m265229a((Object) observableSource4, "o4 is null");
        C68362b.m265229a((Object) hVar, "combiner is null");
        return withLatestFrom(new ObservableSource[]{observableSource, observableSource2, observableSource3, observableSource4}, C68326a.m265179a((AbstractC68316h) hVar));
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final <R> Observable<R> replay(Function<? super Observable<T>, ? extends ObservableSource<R>> function, int i, long j, TimeUnit timeUnit, Scheduler scheduler) {
        C68362b.m265229a((Object) function, "selector is null");
        C68362b.m265225a(i, "bufferSize");
        C68362b.m265229a((Object) timeUnit, "unit is null");
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        return cp.m265408a(C68711bm.m265380a(this, i, j, timeUnit, scheduler), function);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> just(T t, T t2, T t3, T t4, T t5) {
        C68362b.m265229a((Object) t, "The first item is null");
        C68362b.m265229a((Object) t2, "The second item is null");
        C68362b.m265229a((Object) t3, "The third item is null");
        C68362b.m265229a((Object) t4, "The fourth item is null");
        C68362b.m265229a((Object) t5, "The fifth item is null");
        return fromArray(t, t2, t3, t4, t5);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> skipLast(long j, TimeUnit timeUnit, Scheduler scheduler, boolean z, int i) {
        C68362b.m265229a((Object) timeUnit, "unit is null");
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        C68362b.m265225a(i, "bufferSize");
        return RxJavaPlugins.onAssembly(new de(this, j, timeUnit, scheduler, i << 1, z));
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final <U extends Collection<? super T>> Observable<U> buffer(long j, long j2, TimeUnit timeUnit, Scheduler scheduler, Callable<U> callable) {
        C68362b.m265229a((Object) timeUnit, "unit is null");
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        C68362b.m265229a((Object) callable, "bufferSupplier is null");
        return RxJavaPlugins.onAssembly(new C68893p(this, j, j2, timeUnit, scheduler, callable, Integer.MAX_VALUE, false));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U, R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction, boolean z, int i, int i2) {
        C68362b.m265229a((Object) function, "mapper is null");
        C68362b.m265229a((Object) biFunction, "combiner is null");
        return flatMap(C68711bm.m265377a(function, biFunction), z, i, i2);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<Observable<T>> window(long j, long j2, TimeUnit timeUnit, Scheduler scheduler, int i) {
        C68362b.m265227a(j, "timespan");
        C68362b.m265227a(j2, "timeskip");
        C68362b.m265225a(i, "bufferSize");
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        C68362b.m265229a((Object) timeUnit, "unit is null");
        return RxJavaPlugins.onAssembly(new ef(this, j, j2, timeUnit, scheduler, Long.MAX_VALUE, i, false));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T1, T2, T3, T4, R> Observable<R> combineLatest(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, AbstractC68315g<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> gVar) {
        C68362b.m265229a((Object) observableSource, "source1 is null");
        C68362b.m265229a((Object) observableSource2, "source2 is null");
        C68362b.m265229a((Object) observableSource3, "source3 is null");
        C68362b.m265229a((Object) observableSource4, "source4 is null");
        return combineLatest(C68326a.m265178a((AbstractC68315g) gVar), bufferSize(), observableSource, observableSource2, observableSource3, observableSource4);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T1, T2, T3, T4, R> Observable<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, AbstractC68315g<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> gVar) {
        C68362b.m265229a((Object) observableSource, "source1 is null");
        C68362b.m265229a((Object) observableSource2, "source2 is null");
        C68362b.m265229a((Object) observableSource3, "source3 is null");
        C68362b.m265229a((Object) observableSource4, "source4 is null");
        return zipArray(C68326a.m265178a((AbstractC68315g) gVar), false, bufferSize(), observableSource, observableSource2, observableSource3, observableSource4);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> takeLast(long j, TimeUnit timeUnit, Scheduler scheduler, boolean z, int i) {
        return takeLast(Long.MAX_VALUE, j, timeUnit, scheduler, z, i);
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public static Observable<Long> intervalRange(long j, long j2, long j3, long j4, TimeUnit timeUnit, Scheduler scheduler) {
        int i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + j2);
        } else if (i == 0) {
            return empty().delay(j3, timeUnit, scheduler);
        } else {
            long j5 = j + (j2 - 1);
            if (j <= 0 || j5 >= 0) {
                C68362b.m265229a((Object) timeUnit, "unit is null");
                C68362b.m265229a((Object) scheduler, "scheduler is null");
                return RxJavaPlugins.onAssembly(new bo(j, j5, Math.max(0L, j3), Math.max(0L, j4), timeUnit, scheduler));
            }
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
    }

    @SchedulerSupport("custom")
    @CheckReturnValue
    public final Observable<T> takeLast(long j, long j2, TimeUnit timeUnit, Scheduler scheduler, boolean z, int i) {
        C68362b.m265229a((Object) timeUnit, "unit is null");
        C68362b.m265229a((Object) scheduler, "scheduler is null");
        C68362b.m265225a(i, "bufferSize");
        if (j >= 0) {
            return RxJavaPlugins.onAssembly(new dn(this, j, j2, timeUnit, scheduler, i, z));
        }
        throw new IndexOutOfBoundsException("count >= 0 required but it was " + j);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> just(T t, T t2, T t3, T t4, T t5, T t6) {
        C68362b.m265229a((Object) t, "The first item is null");
        C68362b.m265229a((Object) t2, "The second item is null");
        C68362b.m265229a((Object) t3, "The third item is null");
        C68362b.m265229a((Object) t4, "The fourth item is null");
        C68362b.m265229a((Object) t5, "The fifth item is null");
        C68362b.m265229a((Object) t6, "The sixth item is null");
        return fromArray(t, t2, t3, t4, t5, t6);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T1, T2, T3, T4, T5, R> Observable<R> combineLatest(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, AbstractC68316h<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> hVar) {
        C68362b.m265229a((Object) observableSource, "source1 is null");
        C68362b.m265229a((Object) observableSource2, "source2 is null");
        C68362b.m265229a((Object) observableSource3, "source3 is null");
        C68362b.m265229a((Object) observableSource4, "source4 is null");
        C68362b.m265229a((Object) observableSource5, "source5 is null");
        return combineLatest(C68326a.m265179a((AbstractC68316h) hVar), bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T1, T2, T3, T4, T5, R> Observable<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, AbstractC68316h<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> hVar) {
        C68362b.m265229a((Object) observableSource, "source1 is null");
        C68362b.m265229a((Object) observableSource2, "source2 is null");
        C68362b.m265229a((Object) observableSource3, "source3 is null");
        C68362b.m265229a((Object) observableSource4, "source4 is null");
        C68362b.m265229a((Object) observableSource5, "source5 is null");
        return zipArray(C68326a.m265179a((AbstractC68316h) hVar), false, bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T1, T2, T3, T4, T5, T6, R> Observable<R> combineLatest(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, ObservableSource<? extends T6> observableSource6, AbstractC68317i<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> iVar) {
        C68362b.m265229a((Object) observableSource, "source1 is null");
        C68362b.m265229a((Object) observableSource2, "source2 is null");
        C68362b.m265229a((Object) observableSource3, "source3 is null");
        C68362b.m265229a((Object) observableSource4, "source4 is null");
        C68362b.m265229a((Object) observableSource5, "source5 is null");
        C68362b.m265229a((Object) observableSource6, "source6 is null");
        return combineLatest(C68326a.m265180a((AbstractC68317i) iVar), bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T1, T2, T3, T4, T5, T6, R> Observable<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, ObservableSource<? extends T6> observableSource6, AbstractC68317i<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> iVar) {
        C68362b.m265229a((Object) observableSource, "source1 is null");
        C68362b.m265229a((Object) observableSource2, "source2 is null");
        C68362b.m265229a((Object) observableSource3, "source3 is null");
        C68362b.m265229a((Object) observableSource4, "source4 is null");
        C68362b.m265229a((Object) observableSource5, "source5 is null");
        C68362b.m265229a((Object) observableSource6, "source6 is null");
        return zipArray(C68326a.m265180a((AbstractC68317i) iVar), false, bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7) {
        C68362b.m265229a((Object) t, "The first item is null");
        C68362b.m265229a((Object) t2, "The second item is null");
        C68362b.m265229a((Object) t3, "The third item is null");
        C68362b.m265229a((Object) t4, "The fourth item is null");
        C68362b.m265229a((Object) t5, "The fifth item is null");
        C68362b.m265229a((Object) t6, "The sixth item is null");
        C68362b.m265229a((Object) t7, "The seventh item is null");
        return fromArray(t, t2, t3, t4, t5, t6, t7);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T1, T2, T3, T4, T5, T6, T7, R> Observable<R> combineLatest(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, ObservableSource<? extends T6> observableSource6, ObservableSource<? extends T7> observableSource7, AbstractC68318j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> jVar) {
        C68362b.m265229a((Object) observableSource, "source1 is null");
        C68362b.m265229a((Object) observableSource2, "source2 is null");
        C68362b.m265229a((Object) observableSource3, "source3 is null");
        C68362b.m265229a((Object) observableSource4, "source4 is null");
        C68362b.m265229a((Object) observableSource5, "source5 is null");
        C68362b.m265229a((Object) observableSource6, "source6 is null");
        C68362b.m265229a((Object) observableSource7, "source7 is null");
        return combineLatest(C68326a.m265181a((AbstractC68318j) jVar), bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T1, T2, T3, T4, T5, T6, T7, R> Observable<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, ObservableSource<? extends T6> observableSource6, ObservableSource<? extends T7> observableSource7, AbstractC68318j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> jVar) {
        C68362b.m265229a((Object) observableSource, "source1 is null");
        C68362b.m265229a((Object) observableSource2, "source2 is null");
        C68362b.m265229a((Object) observableSource3, "source3 is null");
        C68362b.m265229a((Object) observableSource4, "source4 is null");
        C68362b.m265229a((Object) observableSource5, "source5 is null");
        C68362b.m265229a((Object) observableSource6, "source6 is null");
        C68362b.m265229a((Object) observableSource7, "source7 is null");
        return zipArray(C68326a.m265181a((AbstractC68318j) jVar), false, bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Observable<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8) {
        C68362b.m265229a((Object) t, "The first item is null");
        C68362b.m265229a((Object) t2, "The second item is null");
        C68362b.m265229a((Object) t3, "The third item is null");
        C68362b.m265229a((Object) t4, "The fourth item is null");
        C68362b.m265229a((Object) t5, "The fifth item is null");
        C68362b.m265229a((Object) t6, "The sixth item is null");
        C68362b.m265229a((Object) t7, "The seventh item is null");
        C68362b.m265229a((Object) t8, "The eighth item is null");
        return fromArray(t, t2, t3, t4, t5, t6, t7, t8);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Observable<R> combineLatest(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, ObservableSource<? extends T6> observableSource6, ObservableSource<? extends T7> observableSource7, ObservableSource<? extends T8> observableSource8, AbstractC68319k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> kVar) {
        C68362b.m265229a((Object) observableSource, "source1 is null");
        C68362b.m265229a((Object) observableSource2, "source2 is null");
        C68362b.m265229a((Object) observableSource3, "source3 is null");
        C68362b.m265229a((Object) observableSource4, "source4 is null");
        C68362b.m265229a((Object) observableSource5, "source5 is null");
        C68362b.m265229a((Object) observableSource6, "source6 is null");
        C68362b.m265229a((Object) observableSource7, "source7 is null");
        C68362b.m265229a((Object) observableSource8, "source8 is null");
        return combineLatest(C68326a.m265182a((AbstractC68319k) kVar), bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7, observableSource8);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Observable<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, ObservableSource<? extends T6> observableSource6, ObservableSource<? extends T7> observableSource7, ObservableSource<? extends T8> observableSource8, AbstractC68319k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> kVar) {
        C68362b.m265229a((Object) observableSource, "source1 is null");
        C68362b.m265229a((Object) observableSource2, "source2 is null");
        C68362b.m265229a((Object) observableSource3, "source3 is null");
        C68362b.m265229a((Object) observableSource4, "source4 is null");
        C68362b.m265229a((Object) observableSource5, "source5 is null");
        C68362b.m265229a((Object) observableSource6, "source6 is null");
        C68362b.m265229a((Object) observableSource7, "source7 is null");
        C68362b.m265229a((Object) observableSource8, "source8 is null");
        return zipArray(C68326a.m265182a((AbstractC68319k) kVar), false, bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7, observableSource8);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Observable<R> combineLatest(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, ObservableSource<? extends T6> observableSource6, ObservableSource<? extends T7> observableSource7, ObservableSource<? extends T8> observableSource8, ObservableSource<? extends T9> observableSource9, AbstractC68320l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> lVar) {
        C68362b.m265229a((Object) observableSource, "source1 is null");
        C68362b.m265229a((Object) observableSource2, "source2 is null");
        C68362b.m265229a((Object) observableSource3, "source3 is null");
        C68362b.m265229a((Object) observableSource4, "source4 is null");
        C68362b.m265229a((Object) observableSource5, "source5 is null");
        C68362b.m265229a((Object) observableSource6, "source6 is null");
        C68362b.m265229a((Object) observableSource7, "source7 is null");
        C68362b.m265229a((Object) observableSource8, "source8 is null");
        C68362b.m265229a((Object) observableSource9, "source9 is null");
        return combineLatest(C68326a.m265183a((AbstractC68320l) lVar), bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7, observableSource8, observableSource9);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Observable<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, ObservableSource<? extends T6> observableSource6, ObservableSource<? extends T7> observableSource7, ObservableSource<? extends T8> observableSource8, ObservableSource<? extends T9> observableSource9, AbstractC68320l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> lVar) {
        C68362b.m265229a((Object) observableSource, "source1 is null");
        C68362b.m265229a((Object) observableSource2, "source2 is null");
        C68362b.m265229a((Object) observableSource3, "source3 is null");
        C68362b.m265229a((Object) observableSource4, "source4 is null");
        C68362b.m265229a((Object) observableSource5, "source5 is null");
        C68362b.m265229a((Object) observableSource6, "source6 is null");
        C68362b.m265229a((Object) observableSource7, "source7 is null");
        C68362b.m265229a((Object) observableSource8, "source8 is null");
        C68362b.m265229a((Object) observableSource9, "source9 is null");
        return zipArray(C68326a.m265183a((AbstractC68320l) lVar), false, bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7, observableSource8, observableSource9);
    }
}
