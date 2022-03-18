package com.ss.android.lark.calendar.impl.framework.viewmodel;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a2\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u001a6\u0010\b\u001a\u00020\t\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\f0\u000b¨\u0006\r"}, d2 = {"live", "Lio/reactivex/Observable;", "T", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "minActiveState", "Landroidx/lifecycle/Lifecycle$State;", "subscribeOnUI", "Lio/reactivex/disposables/Disposable;", "onNext", "Lkotlin/Function1;", "", "calendar-impl_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.framework.viewmodel.b */
public final class C32508b {
    /* renamed from: a */
    public static final <T> Observable<T> m124447a(Observable<T> observable, LifecycleOwner lifecycleOwner, Lifecycle.State state) {
        Intrinsics.checkParameterIsNotNull(observable, "$this$live");
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        Intrinsics.checkParameterIsNotNull(state, "minActiveState");
        return new ObservableLive(observable, lifecycleOwner, state);
    }

    /* renamed from: a */
    public static final <T> Disposable m124448a(Observable<T> observable, LifecycleOwner lifecycleOwner, Function1<? super T, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(observable, "$this$subscribeOnUI");
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        Intrinsics.checkParameterIsNotNull(function1, "onNext");
        Observable<T> observeOn = observable.observeOn(AndroidSchedulers.mainThread());
        Intrinsics.checkExpressionValueIsNotNull(observeOn, "observeOn(AndroidSchedulers.mainThread())");
        Disposable subscribe = m124447a(observeOn, lifecycleOwner, Lifecycle.State.STARTED).subscribe(new C32509c(function1));
        Intrinsics.checkExpressionValueIsNotNull(subscribe, "observeOn(AndroidSchedul…D)\n    .subscribe(onNext)");
        return subscribe;
    }
}
