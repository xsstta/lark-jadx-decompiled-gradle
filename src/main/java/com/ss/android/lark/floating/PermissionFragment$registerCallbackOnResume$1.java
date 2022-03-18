package com.ss.android.lark.floating;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1168n;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.lark.floating.interfaces.OnPermissionResult;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "onStateChanged"}, mo238835k = 3, mv = {1, 1, 15})
public final class PermissionFragment$registerCallbackOnResume$1 implements AbstractC1168n {

    /* renamed from: a */
    final /* synthetic */ PermissionFragment f98415a;

    PermissionFragment$registerCallbackOnResume$1(PermissionFragment cVar) {
        this.f98415a = cVar;
    }

    @Override // androidx.lifecycle.AbstractC1168n
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        Intrinsics.checkParameterIsNotNull(event, "event");
        if (event == Lifecycle.Event.ON_RESUME) {
            FragmentActivity requireActivity = this.f98415a.requireActivity();
            Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
            boolean a = PermissionUtils.m150948a(requireActivity);
            Log.m165388i("PermissionFragment onActivityResult: " + a);
            try {
                OnPermissionResult hVar = PermissionFragment.f98478a;
                if (hVar != null) {
                    hVar.mo140140d(a);
                }
            } finally {
                PermissionFragment.f98478a = null;
                FragmentActivity requireActivity2 = this.f98415a.requireActivity();
                Intrinsics.checkExpressionValueIsNotNull(requireActivity2, "requireActivity()");
                requireActivity2.getSupportFragmentManager().beginTransaction().remove(this.f98415a).commitAllowingStateLoss();
            }
        }
    }
}
