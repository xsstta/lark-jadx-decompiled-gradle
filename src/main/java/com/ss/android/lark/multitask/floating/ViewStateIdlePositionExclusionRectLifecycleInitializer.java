package com.ss.android.lark.multitask.floating;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/multitask/floating/ViewStateIdlePositionExclusionRectLifecycleInitializer;", "", "parent", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "isVisibleToUser", "", "lifecycle", "Landroidx/lifecycle/LifecycleRegistry;", "getLifecycle", "()Landroidx/lifecycle/LifecycleRegistry;", "lifecycleRegistry", "setUserVisibleHint", "", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.multitask.floating.m */
public final class ViewStateIdlePositionExclusionRectLifecycleInitializer {

    /* renamed from: a */
    public final LifecycleRegistry f121705a;

    /* renamed from: b */
    public boolean f121706b = true;

    /* renamed from: a */
    public final LifecycleRegistry mo169038a() {
        return this.f121705a;
    }

    public ViewStateIdlePositionExclusionRectLifecycleInitializer(Fragment fragment) {
        Intrinsics.checkParameterIsNotNull(fragment, "parent");
        this.f121705a = new LifecycleRegistry(fragment);
        fragment.getLifecycle().addObserver(new ViewStateIdlePositionExclusionRectLifecycleInitializer$1(this));
    }

    /* renamed from: a */
    public final void mo169039a(boolean z) {
        this.f121706b = z;
        if (this.f121705a.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            if (!z) {
                this.f121705a.setCurrentState(Lifecycle.State.CREATED);
            }
        } else if (this.f121705a.getCurrentState().isAtLeast(Lifecycle.State.CREATED) && z) {
            this.f121705a.setCurrentState(Lifecycle.State.STARTED);
        }
    }
}
