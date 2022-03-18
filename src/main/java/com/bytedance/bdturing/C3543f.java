package com.bytedance.bdturing;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.bytedance.bdturing.f */
public class C3543f implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private Activity f11189a;

    /* renamed from: b */
    private int f11190b = 1;

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    /* renamed from: a */
    public void mo14327a() {
        Activity activity = this.f11189a;
        if (activity != null) {
            activity.getApplication().registerActivityLifecycleCallbacks(this);
        }
    }

    /* renamed from: b */
    public void mo14328b() {
        Activity activity = this.f11189a;
        if (activity != null) {
            activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }

    C3543f(Activity activity) {
        this.f11189a = activity;
    }

    public void onActivityResumed(Activity activity) {
        if (activity == this.f11189a) {
            this.f11190b++;
        }
    }

    public void onActivityStopped(Activity activity) {
        if (activity == this.f11189a) {
            int i = this.f11190b - 1;
            this.f11190b = i;
            if (i == 0) {
                EventReport.m14815c();
            }
        }
    }
}
