package com.ss.android.lark.eetroublepet;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.ss.android.lark.eetroublepet.b */
public class C37001b implements Application.ActivityLifecycleCallbacks {
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public void onActivityStarted(Activity activity) {
        TroublePETTracker.onActivityStarted(activity);
    }
}
