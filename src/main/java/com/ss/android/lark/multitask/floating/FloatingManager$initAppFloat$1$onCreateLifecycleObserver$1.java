package com.ss.android.lark.multitask.floating;

import android.app.Application;
import androidx.lifecycle.AbstractC1168n;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.lark.floating.PermissionUtils;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.multitask.floating.FloatingManager;
import com.ss.android.lark.multitask.task.GlobalTaskContainerImpl;
import com.ss.android.lark.utils.LarkContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", ShareHitPoint.f121868c, "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "onStateChanged"}, mo238835k = 3, mv = {1, 1, 16})
final class FloatingManager$initAppFloat$1$onCreateLifecycleObserver$1 implements AbstractC1168n {

    /* renamed from: a */
    final /* synthetic */ FloatingManager.C48319b f121602a;

    FloatingManager$initAppFloat$1$onCreateLifecycleObserver$1(FloatingManager.C48319b bVar) {
        this.f121602a = bVar;
    }

    @Override // androidx.lifecycle.AbstractC1168n
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, ShareHitPoint.f121868c);
        Intrinsics.checkParameterIsNotNull(event, "event");
        int i = C48326i.f121696a[event.ordinal()];
        if (i == 1) {
            FloatingManager hVar = FloatingManager.f121676a;
            FloatingManager.f121680e.mo168933a(this.f121602a.f121690a);
        } else if (i == 2) {
            FloatingManager hVar2 = FloatingManager.f121676a;
            if (!(FloatingManager.f121682g)) {
                Application application = LarkContext.getApplication();
                Intrinsics.checkExpressionValueIsNotNull(application, "LarkContext.getApplication()");
                if (PermissionUtils.m150948a(application)) {
                    GlobalTaskContainerImpl.m190809h();
                }
                FloatingManager hVar3 = FloatingManager.f121676a;
                FloatingManager.f121682g = true;
            }
        }
    }
}
