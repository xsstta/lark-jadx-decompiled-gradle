package com.zackratos.ultimatebarx.ultimatebarx;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\b"}, d2 = {"Lcom/zackratos/ultimatebarx/ultimatebarx/UltimateBarXObserver;", "Landroidx/lifecycle/LifecycleObserver;", "()V", "onDestroy", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onResume", "ultimatebarx_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class UltimateBarXObserver implements LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        UltimateBarXManager.f171319b.mo236993a().mo236978a(lifecycleOwner);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        if (lifecycleOwner instanceof Fragment) {
            boolean f = UltimateBarXManager.f171319b.mo236993a().mo236987f(lifecycleOwner);
            boolean g = UltimateBarXManager.f171319b.mo236993a().mo236988g(lifecycleOwner);
            if (f) {
                UltimateBarX.f171308a.mo236949a((Fragment) lifecycleOwner).mo236995a();
            }
            if (g) {
                UltimateBarX.f171308a.mo236949a((Fragment) lifecycleOwner).mo236996b();
            }
        }
    }
}
