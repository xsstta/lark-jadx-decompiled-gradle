package com.ss.android.lark.multitask.floating;

import androidx.lifecycle.AbstractC1168n;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/multitask/floating/ViewStateIdlePositionExclusionRectLifecycleInitializer$1", "Landroidx/lifecycle/LifecycleEventObserver;", "onStateChanged", "", ShareHitPoint.f121868c, "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ViewStateIdlePositionExclusionRectLifecycleInitializer$1 implements AbstractC1168n {

    /* renamed from: a */
    final /* synthetic */ ViewStateIdlePositionExclusionRectLifecycleInitializer f121609a;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    ViewStateIdlePositionExclusionRectLifecycleInitializer$1(ViewStateIdlePositionExclusionRectLifecycleInitializer mVar) {
        this.f121609a = mVar;
    }

    @Override // androidx.lifecycle.AbstractC1168n
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, ShareHitPoint.f121868c);
        Intrinsics.checkParameterIsNotNull(event, "event");
        Lifecycle.State state = null;
        int i = C48329n.f121707a[event.ordinal()];
        if (i == 1) {
            state = Lifecycle.State.CREATED;
        } else if (i != 2) {
            if (i == 5) {
                state = Lifecycle.State.CREATED;
            } else if (i == 6) {
                state = Lifecycle.State.DESTROYED;
            }
        } else if (this.f121609a.f121706b) {
            state = Lifecycle.State.STARTED;
        } else {
            state = Lifecycle.State.CREATED;
        }
        if (state != null) {
            this.f121609a.f121705a.setCurrentState(state);
        }
    }
}
