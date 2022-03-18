package com.ss.android.lark.multitask;

import androidx.lifecycle.AbstractC1168n;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.multitask.MultitaskHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/multitask/MultitaskHelper$scheduleDispatchRestoreInstanceState$1$1", "Landroidx/lifecycle/LifecycleEventObserver;", "onStateChanged", "", ShareHitPoint.f121868c, "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "features_multitask_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class MultitaskHelper$scheduleDispatchRestoreInstanceState$1$1 implements AbstractC1168n {

    /* renamed from: a */
    final /* synthetic */ MultitaskHelper.RunnableC48333c f121539a;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    MultitaskHelper$scheduleDispatchRestoreInstanceState$1$1(MultitaskHelper.RunnableC48333c cVar) {
        this.f121539a = cVar;
    }

    @Override // androidx.lifecycle.AbstractC1168n
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, ShareHitPoint.f121868c);
        Intrinsics.checkParameterIsNotNull(event, "event");
        if (C48334i.f121727c[event.ordinal()] == 1) {
            this.f121539a.f121723a.mo23786e().mo169154a(this.f121539a.f121724b, this.f121539a.f121723a.mo23782a());
            lifecycleOwner.getLifecycle().removeObserver(this);
        }
    }
}
