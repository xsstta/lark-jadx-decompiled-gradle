package com.ss.lark.android.avatar.ui;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1168n;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/lark/android/avatar/ui/FragmentKtx$launchWhenStarted$1", "Landroidx/lifecycle/LifecycleEventObserver;", "onStateChanged", "", ShareHitPoint.f121868c, "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "core_avatar_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class FragmentKtx$launchWhenStarted$1 implements AbstractC1168n {

    /* renamed from: a */
    final /* synthetic */ Fragment f162372a;

    /* renamed from: b */
    final /* synthetic */ Function1 f162373b;

    FragmentKtx$launchWhenStarted$1(T t, Function1 function1) {
        this.f162372a = t;
        this.f162373b = function1;
    }

    @Override // androidx.lifecycle.AbstractC1168n
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, ShareHitPoint.f121868c);
        Intrinsics.checkParameterIsNotNull(event, "event");
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Intrinsics.checkExpressionValueIsNotNull(lifecycle, "source.lifecycle");
        if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            this.f162373b.invoke(this.f162372a);
            lifecycleOwner.getLifecycle().removeObserver(this);
        }
    }
}
