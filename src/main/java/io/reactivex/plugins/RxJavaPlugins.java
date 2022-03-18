package io.reactivex.plugins;

import io.reactivex.AbstractC68259a;
import io.reactivex.AbstractC68273c;
import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68988j;
import io.reactivex.AbstractC68989k;
import io.reactivex.AbstractC69009q;
import io.reactivex.AbstractC69012t;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.UndeliverableException;
import io.reactivex.functions.AbstractC68312d;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.schedulers.C68929b;
import io.reactivex.internal.schedulers.C68941f;
import io.reactivex.internal.schedulers.C68945g;
import io.reactivex.internal.schedulers.C68960l;
import io.reactivex.internal.util.C68981f;
import io.reactivex.p3452a.AbstractC68260a;
import io.reactivex.p3454b.AbstractC68271a;
import io.reactivex.parallel.AbstractC69008a;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadFactory;
import org.p3511d.AbstractC70021c;

public final class RxJavaPlugins {
    static volatile Consumer<? super Throwable> errorHandler;
    static volatile boolean failNonBlockingScheduler;
    static volatile boolean lockdown;
    static volatile AbstractC68312d onBeforeBlocking;
    static volatile Function<? super AbstractC68259a, ? extends AbstractC68259a> onCompletableAssembly;
    static volatile BiFunction<? super AbstractC68259a, ? super AbstractC68273c, ? extends AbstractC68273c> onCompletableSubscribe;
    static volatile Function<? super Scheduler, ? extends Scheduler> onComputationHandler;
    static volatile Function<? super AbstractC68260a, ? extends AbstractC68260a> onConnectableFlowableAssembly;
    static volatile Function<? super AbstractC68271a, ? extends AbstractC68271a> onConnectableObservableAssembly;
    static volatile Function<? super AbstractC68307f, ? extends AbstractC68307f> onFlowableAssembly;
    static volatile BiFunction<? super AbstractC68307f, ? super AbstractC70021c, ? extends AbstractC70021c> onFlowableSubscribe;
    static volatile Function<? super Callable<Scheduler>, ? extends Scheduler> onInitComputationHandler;
    static volatile Function<? super Callable<Scheduler>, ? extends Scheduler> onInitIoHandler;
    static volatile Function<? super Callable<Scheduler>, ? extends Scheduler> onInitNewThreadHandler;
    static volatile Function<? super Callable<Scheduler>, ? extends Scheduler> onInitSingleHandler;
    static volatile Function<? super Scheduler, ? extends Scheduler> onIoHandler;
    static volatile Function<? super AbstractC68988j, ? extends AbstractC68988j> onMaybeAssembly;
    static volatile BiFunction<? super AbstractC68988j, ? super AbstractC68989k, ? extends AbstractC68989k> onMaybeSubscribe;
    static volatile Function<? super Scheduler, ? extends Scheduler> onNewThreadHandler;
    static volatile Function<? super Observable, ? extends Observable> onObservableAssembly;
    static volatile BiFunction<? super Observable, ? super AbstractC69009q, ? extends AbstractC69009q> onObservableSubscribe;
    static volatile Function<? super AbstractC69008a, ? extends AbstractC69008a> onParallelAssembly;
    static volatile Function<? super Runnable, ? extends Runnable> onScheduleHandler;
    static volatile Function<? super Single, ? extends Single> onSingleAssembly;
    static volatile Function<? super Scheduler, ? extends Scheduler> onSingleHandler;
    static volatile BiFunction<? super Single, ? super AbstractC69012t, ? extends AbstractC69012t> onSingleSubscribe;

    public static void lockdown() {
        lockdown = true;
    }

    static void unlock() {
        lockdown = false;
    }

    public static Function<? super Scheduler, ? extends Scheduler> getComputationSchedulerHandler() {
        return onComputationHandler;
    }

    public static Consumer<? super Throwable> getErrorHandler() {
        return errorHandler;
    }

    public static Function<? super Callable<Scheduler>, ? extends Scheduler> getInitComputationSchedulerHandler() {
        return onInitComputationHandler;
    }

    public static Function<? super Callable<Scheduler>, ? extends Scheduler> getInitIoSchedulerHandler() {
        return onInitIoHandler;
    }

    public static Function<? super Callable<Scheduler>, ? extends Scheduler> getInitNewThreadSchedulerHandler() {
        return onInitNewThreadHandler;
    }

    public static Function<? super Callable<Scheduler>, ? extends Scheduler> getInitSingleSchedulerHandler() {
        return onInitSingleHandler;
    }

    public static Function<? super Scheduler, ? extends Scheduler> getIoSchedulerHandler() {
        return onIoHandler;
    }

    public static Function<? super Scheduler, ? extends Scheduler> getNewThreadSchedulerHandler() {
        return onNewThreadHandler;
    }

    public static AbstractC68312d getOnBeforeBlocking() {
        return onBeforeBlocking;
    }

    public static Function<? super AbstractC68259a, ? extends AbstractC68259a> getOnCompletableAssembly() {
        return onCompletableAssembly;
    }

    public static BiFunction<? super AbstractC68259a, ? super AbstractC68273c, ? extends AbstractC68273c> getOnCompletableSubscribe() {
        return onCompletableSubscribe;
    }

    public static Function<? super AbstractC68260a, ? extends AbstractC68260a> getOnConnectableFlowableAssembly() {
        return onConnectableFlowableAssembly;
    }

    public static Function<? super AbstractC68271a, ? extends AbstractC68271a> getOnConnectableObservableAssembly() {
        return onConnectableObservableAssembly;
    }

    public static Function<? super AbstractC68307f, ? extends AbstractC68307f> getOnFlowableAssembly() {
        return onFlowableAssembly;
    }

    public static BiFunction<? super AbstractC68307f, ? super AbstractC70021c, ? extends AbstractC70021c> getOnFlowableSubscribe() {
        return onFlowableSubscribe;
    }

    public static Function<? super AbstractC68988j, ? extends AbstractC68988j> getOnMaybeAssembly() {
        return onMaybeAssembly;
    }

    public static BiFunction<? super AbstractC68988j, ? super AbstractC68989k, ? extends AbstractC68989k> getOnMaybeSubscribe() {
        return onMaybeSubscribe;
    }

    public static Function<? super Observable, ? extends Observable> getOnObservableAssembly() {
        return onObservableAssembly;
    }

    public static BiFunction<? super Observable, ? super AbstractC69009q, ? extends AbstractC69009q> getOnObservableSubscribe() {
        return onObservableSubscribe;
    }

    public static Function<? super AbstractC69008a, ? extends AbstractC69008a> getOnParallelAssembly() {
        return onParallelAssembly;
    }

    public static Function<? super Single, ? extends Single> getOnSingleAssembly() {
        return onSingleAssembly;
    }

    public static BiFunction<? super Single, ? super AbstractC69012t, ? extends AbstractC69012t> getOnSingleSubscribe() {
        return onSingleSubscribe;
    }

    public static Function<? super Runnable, ? extends Runnable> getScheduleHandler() {
        return onScheduleHandler;
    }

    public static Function<? super Scheduler, ? extends Scheduler> getSingleSchedulerHandler() {
        return onSingleHandler;
    }

    public static boolean isFailOnNonBlockingScheduler() {
        return failNonBlockingScheduler;
    }

    public static boolean isLockdown() {
        return lockdown;
    }

    private RxJavaPlugins() {
        throw new IllegalStateException("No instances!");
    }

    public static boolean onBeforeBlocking() {
        AbstractC68312d dVar = onBeforeBlocking;
        if (dVar == null) {
            return false;
        }
        try {
            return dVar.mo238040a();
        } catch (Throwable th) {
            throw C68981f.m265557a(th);
        }
    }

    public static void reset() {
        setErrorHandler(null);
        setScheduleHandler(null);
        setComputationSchedulerHandler(null);
        setInitComputationSchedulerHandler(null);
        setIoSchedulerHandler(null);
        setInitIoSchedulerHandler(null);
        setSingleSchedulerHandler(null);
        setInitSingleSchedulerHandler(null);
        setNewThreadSchedulerHandler(null);
        setInitNewThreadSchedulerHandler(null);
        setOnFlowableAssembly(null);
        setOnFlowableSubscribe(null);
        setOnObservableAssembly(null);
        setOnObservableSubscribe(null);
        setOnSingleAssembly(null);
        setOnSingleSubscribe(null);
        setOnCompletableAssembly(null);
        setOnCompletableSubscribe(null);
        setOnConnectableFlowableAssembly(null);
        setOnConnectableObservableAssembly(null);
        setOnMaybeAssembly(null);
        setOnMaybeSubscribe(null);
        setOnParallelAssembly(null);
        setFailOnNonBlockingScheduler(false);
        setOnBeforeBlocking(null);
    }

    public static Scheduler createComputationScheduler(ThreadFactory threadFactory) {
        return new C68929b((ThreadFactory) C68362b.m265229a((Object) threadFactory, "threadFactory is null"));
    }

    public static Scheduler createIoScheduler(ThreadFactory threadFactory) {
        return new C68941f((ThreadFactory) C68362b.m265229a((Object) threadFactory, "threadFactory is null"));
    }

    public static Scheduler createNewThreadScheduler(ThreadFactory threadFactory) {
        return new C68945g((ThreadFactory) C68362b.m265229a((Object) threadFactory, "threadFactory is null"));
    }

    public static Scheduler createSingleScheduler(ThreadFactory threadFactory) {
        return new C68960l((ThreadFactory) C68362b.m265229a((Object) threadFactory, "threadFactory is null"));
    }

    public static <T> Observable<T> onAssembly(Observable<T> observable) {
        Function<? super Observable, ? extends Observable> function = onObservableAssembly;
        if (function != null) {
            return (Observable) apply(function, observable);
        }
        return observable;
    }

    public static Scheduler onComputationScheduler(Scheduler scheduler) {
        Function<? super Scheduler, ? extends Scheduler> function = onComputationHandler;
        if (function == null) {
            return scheduler;
        }
        return (Scheduler) apply(function, scheduler);
    }

    public static Scheduler onIoScheduler(Scheduler scheduler) {
        Function<? super Scheduler, ? extends Scheduler> function = onIoHandler;
        if (function == null) {
            return scheduler;
        }
        return (Scheduler) apply(function, scheduler);
    }

    public static Scheduler onNewThreadScheduler(Scheduler scheduler) {
        Function<? super Scheduler, ? extends Scheduler> function = onNewThreadHandler;
        if (function == null) {
            return scheduler;
        }
        return (Scheduler) apply(function, scheduler);
    }

    public static Scheduler onSingleScheduler(Scheduler scheduler) {
        Function<? super Scheduler, ? extends Scheduler> function = onSingleHandler;
        if (function == null) {
            return scheduler;
        }
        return (Scheduler) apply(function, scheduler);
    }

    public static void setComputationSchedulerHandler(Function<? super Scheduler, ? extends Scheduler> function) {
        if (!lockdown) {
            onComputationHandler = function;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setErrorHandler(Consumer<? super Throwable> consumer) {
        if (!lockdown) {
            errorHandler = consumer;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setFailOnNonBlockingScheduler(boolean z) {
        if (!lockdown) {
            failNonBlockingScheduler = z;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setInitComputationSchedulerHandler(Function<? super Callable<Scheduler>, ? extends Scheduler> function) {
        if (!lockdown) {
            onInitComputationHandler = function;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setInitIoSchedulerHandler(Function<? super Callable<Scheduler>, ? extends Scheduler> function) {
        if (!lockdown) {
            onInitIoHandler = function;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setInitNewThreadSchedulerHandler(Function<? super Callable<Scheduler>, ? extends Scheduler> function) {
        if (!lockdown) {
            onInitNewThreadHandler = function;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setInitSingleSchedulerHandler(Function<? super Callable<Scheduler>, ? extends Scheduler> function) {
        if (!lockdown) {
            onInitSingleHandler = function;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setIoSchedulerHandler(Function<? super Scheduler, ? extends Scheduler> function) {
        if (!lockdown) {
            onIoHandler = function;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setNewThreadSchedulerHandler(Function<? super Scheduler, ? extends Scheduler> function) {
        if (!lockdown) {
            onNewThreadHandler = function;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setOnBeforeBlocking(AbstractC68312d dVar) {
        if (!lockdown) {
            onBeforeBlocking = dVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setOnCompletableAssembly(Function<? super AbstractC68259a, ? extends AbstractC68259a> function) {
        if (!lockdown) {
            onCompletableAssembly = function;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setOnCompletableSubscribe(BiFunction<? super AbstractC68259a, ? super AbstractC68273c, ? extends AbstractC68273c> biFunction) {
        if (!lockdown) {
            onCompletableSubscribe = biFunction;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setOnConnectableFlowableAssembly(Function<? super AbstractC68260a, ? extends AbstractC68260a> function) {
        if (!lockdown) {
            onConnectableFlowableAssembly = function;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setOnConnectableObservableAssembly(Function<? super AbstractC68271a, ? extends AbstractC68271a> function) {
        if (!lockdown) {
            onConnectableObservableAssembly = function;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setOnFlowableAssembly(Function<? super AbstractC68307f, ? extends AbstractC68307f> function) {
        if (!lockdown) {
            onFlowableAssembly = function;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setOnFlowableSubscribe(BiFunction<? super AbstractC68307f, ? super AbstractC70021c, ? extends AbstractC70021c> biFunction) {
        if (!lockdown) {
            onFlowableSubscribe = biFunction;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setOnMaybeAssembly(Function<? super AbstractC68988j, ? extends AbstractC68988j> function) {
        if (!lockdown) {
            onMaybeAssembly = function;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setOnMaybeSubscribe(BiFunction<? super AbstractC68988j, AbstractC68989k, ? extends AbstractC68989k> biFunction) {
        if (!lockdown) {
            onMaybeSubscribe = biFunction;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setOnObservableAssembly(Function<? super Observable, ? extends Observable> function) {
        if (!lockdown) {
            onObservableAssembly = function;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setOnObservableSubscribe(BiFunction<? super Observable, ? super AbstractC69009q, ? extends AbstractC69009q> biFunction) {
        if (!lockdown) {
            onObservableSubscribe = biFunction;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setOnParallelAssembly(Function<? super AbstractC69008a, ? extends AbstractC69008a> function) {
        if (!lockdown) {
            onParallelAssembly = function;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setOnSingleAssembly(Function<? super Single, ? extends Single> function) {
        if (!lockdown) {
            onSingleAssembly = function;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setOnSingleSubscribe(BiFunction<? super Single, ? super AbstractC69012t, ? extends AbstractC69012t> biFunction) {
        if (!lockdown) {
            onSingleSubscribe = biFunction;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setScheduleHandler(Function<? super Runnable, ? extends Runnable> function) {
        if (!lockdown) {
            onScheduleHandler = function;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setSingleSchedulerHandler(Function<? super Scheduler, ? extends Scheduler> function) {
        if (!lockdown) {
            onSingleHandler = function;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    static void uncaught(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    static Scheduler callRequireNonNull(Callable<Scheduler> callable) {
        try {
            return (Scheduler) C68362b.m265229a((Object) callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th) {
            throw C68981f.m265557a(th);
        }
    }

    public static Scheduler initComputationScheduler(Callable<Scheduler> callable) {
        C68362b.m265229a((Object) callable, "Scheduler Callable can't be null");
        Function<? super Callable<Scheduler>, ? extends Scheduler> function = onInitComputationHandler;
        if (function == null) {
            return callRequireNonNull(callable);
        }
        return applyRequireNonNull(function, callable);
    }

    public static Scheduler initIoScheduler(Callable<Scheduler> callable) {
        C68362b.m265229a((Object) callable, "Scheduler Callable can't be null");
        Function<? super Callable<Scheduler>, ? extends Scheduler> function = onInitIoHandler;
        if (function == null) {
            return callRequireNonNull(callable);
        }
        return applyRequireNonNull(function, callable);
    }

    public static Scheduler initNewThreadScheduler(Callable<Scheduler> callable) {
        C68362b.m265229a((Object) callable, "Scheduler Callable can't be null");
        Function<? super Callable<Scheduler>, ? extends Scheduler> function = onInitNewThreadHandler;
        if (function == null) {
            return callRequireNonNull(callable);
        }
        return applyRequireNonNull(function, callable);
    }

    public static Scheduler initSingleScheduler(Callable<Scheduler> callable) {
        C68362b.m265229a((Object) callable, "Scheduler Callable can't be null");
        Function<? super Callable<Scheduler>, ? extends Scheduler> function = onInitSingleHandler;
        if (function == null) {
            return callRequireNonNull(callable);
        }
        return applyRequireNonNull(function, callable);
    }

    public static <T> Single<T> onAssembly(Single<T> single) {
        Function<? super Single, ? extends Single> function = onSingleAssembly;
        if (function != null) {
            return (Single) apply(function, single);
        }
        return single;
    }

    public static Runnable onSchedule(Runnable runnable) {
        C68362b.m265229a((Object) runnable, "run is null");
        Function<? super Runnable, ? extends Runnable> function = onScheduleHandler;
        if (function == null) {
            return runnable;
        }
        return (Runnable) apply(function, runnable);
    }

    static boolean isBug(Throwable th) {
        if (!(th instanceof OnErrorNotImplementedException) && !(th instanceof MissingBackpressureException) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof CompositeException)) {
            return false;
        }
        return true;
    }

    public static <T> AbstractC68260a<T> onAssembly(AbstractC68260a<T> aVar) {
        Function<? super AbstractC68260a, ? extends AbstractC68260a> function = onConnectableFlowableAssembly;
        if (function != null) {
            return (AbstractC68260a) apply(function, aVar);
        }
        return aVar;
    }

    public static void onError(Throwable th) {
        Consumer<? super Throwable> consumer = errorHandler;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!isBug(th)) {
            th = new UndeliverableException(th);
        }
        if (consumer != null) {
            try {
                consumer.accept(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                uncaught(th2);
            }
        }
        th.printStackTrace();
        uncaught(th);
    }

    public static AbstractC68259a onAssembly(AbstractC68259a aVar) {
        Function<? super AbstractC68259a, ? extends AbstractC68259a> function = onCompletableAssembly;
        if (function != null) {
            return (AbstractC68259a) apply(function, aVar);
        }
        return aVar;
    }

    public static <T> AbstractC68271a<T> onAssembly(AbstractC68271a<T> aVar) {
        Function<? super AbstractC68271a, ? extends AbstractC68271a> function = onConnectableObservableAssembly;
        if (function != null) {
            return (AbstractC68271a) apply(function, aVar);
        }
        return aVar;
    }

    public static <T> AbstractC68307f<T> onAssembly(AbstractC68307f<T> fVar) {
        Function<? super AbstractC68307f, ? extends AbstractC68307f> function = onFlowableAssembly;
        if (function != null) {
            return (AbstractC68307f) apply(function, fVar);
        }
        return fVar;
    }

    public static <T> AbstractC68988j<T> onAssembly(AbstractC68988j<T> jVar) {
        Function<? super AbstractC68988j, ? extends AbstractC68988j> function = onMaybeAssembly;
        if (function != null) {
            return (AbstractC68988j) apply(function, jVar);
        }
        return jVar;
    }

    public static <T> AbstractC69008a<T> onAssembly(AbstractC69008a<T> aVar) {
        Function<? super AbstractC69008a, ? extends AbstractC69008a> function = onParallelAssembly;
        if (function != null) {
            return (AbstractC69008a) apply(function, aVar);
        }
        return aVar;
    }

    static Scheduler applyRequireNonNull(Function<? super Callable<Scheduler>, ? extends Scheduler> function, Callable<Scheduler> callable) {
        return (Scheduler) C68362b.m265229a(apply(function, callable), "Scheduler Callable result can't be null");
    }

    public static AbstractC68273c onSubscribe(AbstractC68259a aVar, AbstractC68273c cVar) {
        BiFunction<? super AbstractC68259a, ? super AbstractC68273c, ? extends AbstractC68273c> biFunction = onCompletableSubscribe;
        if (biFunction != null) {
            return (AbstractC68273c) apply(biFunction, aVar, cVar);
        }
        return cVar;
    }

    static <T, R> R apply(Function<T, R> function, T t) {
        try {
            return function.apply(t);
        } catch (Throwable th) {
            throw C68981f.m265557a(th);
        }
    }

    public static <T> AbstractC68989k<? super T> onSubscribe(AbstractC68988j<T> jVar, AbstractC68989k<? super T> kVar) {
        BiFunction<? super AbstractC68988j, ? super AbstractC68989k, ? extends AbstractC68989k> biFunction = onMaybeSubscribe;
        if (biFunction != null) {
            return (AbstractC68989k) apply(biFunction, jVar, kVar);
        }
        return kVar;
    }

    public static <T> AbstractC69009q<? super T> onSubscribe(Observable<T> observable, AbstractC69009q<? super T> qVar) {
        BiFunction<? super Observable, ? super AbstractC69009q, ? extends AbstractC69009q> biFunction = onObservableSubscribe;
        if (biFunction != null) {
            return (AbstractC69009q) apply(biFunction, observable, qVar);
        }
        return qVar;
    }

    public static <T> AbstractC69012t<? super T> onSubscribe(Single<T> single, AbstractC69012t<? super T> tVar) {
        BiFunction<? super Single, ? super AbstractC69012t, ? extends AbstractC69012t> biFunction = onSingleSubscribe;
        if (biFunction != null) {
            return (AbstractC69012t) apply(biFunction, single, tVar);
        }
        return tVar;
    }

    public static <T> AbstractC70021c<? super T> onSubscribe(AbstractC68307f<T> fVar, AbstractC70021c<? super T> cVar) {
        BiFunction<? super AbstractC68307f, ? super AbstractC70021c, ? extends AbstractC70021c> biFunction = onFlowableSubscribe;
        if (biFunction != null) {
            return (AbstractC70021c) apply(biFunction, fVar, cVar);
        }
        return cVar;
    }

    static <T, U, R> R apply(BiFunction<T, U, R> biFunction, T t, U u) {
        try {
            return biFunction.apply(t, u);
        } catch (Throwable th) {
            throw C68981f.m265557a(th);
        }
    }
}
