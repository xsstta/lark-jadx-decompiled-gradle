package com.ss.android.lark.slideback;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/slideback/SimpleActivityLifecycleCallbacks;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "()V", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "slideback_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.slideback.h */
public class SimpleActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
    }

    public void onActivityDestroyed(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
    }

    public void onActivityPaused(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
    }

    public void onActivityResumed(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
    }

    public void onActivityStarted(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
    }

    public void onActivityStopped(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
    }
}
