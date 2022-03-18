package io.reactivex.p3454b;

import io.reactivex.Observable;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.operators.observable.cl;
import io.reactivex.plugins.RxJavaPlugins;

/* renamed from: io.reactivex.b.a */
public abstract class AbstractC68271a<T> extends Observable<T> {
    /* renamed from: a */
    public abstract void mo237900a(Consumer<? super Disposable> consumer);

    @SchedulerSupport("none")
    @CheckReturnValue
    /* renamed from: a */
    public Observable<T> mo237899a() {
        return RxJavaPlugins.onAssembly(new cl(this));
    }
}
