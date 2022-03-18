package com.ss.android.lark.ug.dyflow.feat;

import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ug.C57345a;
import com.ss.android.lark.ug.dyflow.feat.ReminderManager;
import com.ss.android.lark.ug.p2859c.AbstractC57392a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"com/ss/android/lark/ug/dyflow/feat/ReminderManager$JoinTeamReminderController$onResumeEvent$1", "Landroidx/lifecycle/LifecycleObserver;", "onResume", "", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ReminderManager$JoinTeamReminderController$onResumeEvent$1 implements LifecycleObserver {

    /* renamed from: a */
    final /* synthetic */ ReminderManager.JoinTeamReminderController f141495a;

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        Lifecycle lifecycle;
        Log.m165389i("ReminderManager", "onResume");
        AbstractC57392a a = C57345a.m222261a();
        Intrinsics.checkExpressionValueIsNotNull(a, "UGModule.getDependency()");
        if (TextUtils.equals(this.f141495a.f141476d, a.mo194668b())) {
            this.f141495a.mo194929d();
        } else {
            this.f141495a.mo194922a();
        }
        FragmentActivity f = this.f141495a.mo194931f();
        if (f != null && (lifecycle = f.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    ReminderManager$JoinTeamReminderController$onResumeEvent$1(ReminderManager.JoinTeamReminderController joinTeamReminderController) {
        this.f141495a = joinTeamReminderController;
    }
}
