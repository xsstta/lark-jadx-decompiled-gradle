package com.ss.android.lark.calendar.impl.features.calendarview.days.data;

import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006J\u0013\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0002\u0010\u000fR \u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/MultiThreadLiveData;", "T", "", "()V", "observers", "Ljava/util/concurrent/ConcurrentHashMap;", "Landroidx/lifecycle/Observer;", "Landroidx/lifecycle/LifecycleOwner;", "value", "Ljava/lang/Object;", "observeInAnyThread", "", "owner", "observer", "setValueInCurrentThread", "(Ljava/lang/Object;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.a.f */
public final class MultiThreadLiveData<T> {

    /* renamed from: a */
    private final ConcurrentHashMap<AbstractC1178x<T>, LifecycleOwner> f77041a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private volatile T f77042b;

    /* renamed from: a */
    public final void mo110983a(T t) {
        this.f77042b = t;
        for (Map.Entry<AbstractC1178x<T>, LifecycleOwner> entry : this.f77041a.entrySet()) {
            AbstractC1178x<T> key = entry.getKey();
            LifecycleOwner value = entry.getValue();
            Lifecycle lifecycle = value.getLifecycle();
            Intrinsics.checkExpressionValueIsNotNull(lifecycle, "owner.lifecycle");
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                this.f77041a.remove(key);
            }
            Lifecycle lifecycle2 = value.getLifecycle();
            Intrinsics.checkExpressionValueIsNotNull(lifecycle2, "owner.lifecycle");
            if (lifecycle2.getCurrentState() == Lifecycle.State.STARTED) {
                key.onChanged(t);
            }
        }
    }

    /* renamed from: a */
    public final void mo110982a(LifecycleOwner lifecycleOwner, AbstractC1178x<T> xVar) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        Intrinsics.checkParameterIsNotNull(xVar, "observer");
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Intrinsics.checkExpressionValueIsNotNull(lifecycle, "owner.lifecycle");
        if (lifecycle.getCurrentState() == Lifecycle.State.STARTED) {
            this.f77041a.put(xVar, lifecycleOwner);
            T t = this.f77042b;
            if (t != null) {
                xVar.onChanged(t);
            }
        }
    }
}
