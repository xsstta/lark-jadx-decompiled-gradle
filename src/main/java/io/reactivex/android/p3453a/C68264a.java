package io.reactivex.android.p3453a;

import io.reactivex.Scheduler;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Function;
import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: io.reactivex.android.a.a */
public final class C68264a {

    /* renamed from: a */
    private static volatile Function<Callable<Scheduler>, Scheduler> f171555a;

    /* renamed from: b */
    private static volatile Function<Scheduler, Scheduler> f171556b;

    /* renamed from: a */
    public static Scheduler m265000a(Scheduler scheduler) {
        Objects.requireNonNull(scheduler, "scheduler == null");
        Function<Scheduler, Scheduler> function = f171556b;
        if (function == null) {
            return scheduler;
        }
        return (Scheduler) m265003a(function, scheduler);
    }

    /* renamed from: b */
    static Scheduler m265004b(Callable<Scheduler> callable) {
        try {
            Scheduler call = callable.call();
            if (call != null) {
                return call;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw C68306a.m265070a(th);
        }
    }

    /* renamed from: a */
    public static Scheduler m265002a(Callable<Scheduler> callable) {
        Objects.requireNonNull(callable, "scheduler == null");
        Function<Callable<Scheduler>, Scheduler> function = f171555a;
        if (function == null) {
            return m265004b(callable);
        }
        return m265001a(function, callable);
    }

    /* renamed from: a */
    static Scheduler m265001a(Function<Callable<Scheduler>, Scheduler> function, Callable<Scheduler> callable) {
        Scheduler scheduler = (Scheduler) m265003a((Function) function, (Object) callable);
        Objects.requireNonNull(scheduler, "Scheduler Callable returned null");
        return scheduler;
    }

    /* renamed from: a */
    static <T, R> R m265003a(Function<T, R> function, T t) {
        try {
            return function.apply(t);
        } catch (Throwable th) {
            throw C68306a.m265070a(th);
        }
    }
}
