package com.huawei.hms.support.common;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.huawei.hms.support.log.HMSLog;
import java.lang.ref.WeakReference;

public final class ActivityMgr implements Application.ActivityLifecycleCallbacks {
    public static final ActivityMgr INST = new ActivityMgr();
    public static final String TAG = "ActivityMgr";
    public WeakReference<Activity> mCurrentActivity;

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public Activity getCurrentActivity() {
        if (this.mCurrentActivity == null) {
            HMSLog.m86966i(TAG, "mCurrentActivity is " + this.mCurrentActivity);
            return null;
        }
        HMSLog.m86966i(TAG, "mCurrentActivity.get() is " + this.mCurrentActivity.get());
        return this.mCurrentActivity.get();
    }

    public void init(Application application) {
        HMSLog.m86961d(TAG, "init");
        if (application == null) {
            HMSLog.m86967w(TAG, "init failed for app is null");
            return;
        }
        ActivityMgr activityMgr = INST;
        application.unregisterActivityLifecycleCallbacks(activityMgr);
        application.registerActivityLifecycleCallbacks(activityMgr);
    }

    public static String objDesc(Object obj) {
        if (obj == null) {
            return "null";
        }
        return obj.getClass().getName() + '@' + Integer.toHexString(obj.hashCode());
    }

    public void onActivityResumed(Activity activity) {
        HMSLog.m86961d(TAG, "onResumed:" + objDesc(activity));
        this.mCurrentActivity = new WeakReference<>(activity);
    }

    public void onActivityStarted(Activity activity) {
        HMSLog.m86961d(TAG, "onStarted:" + objDesc(activity));
        this.mCurrentActivity = new WeakReference<>(activity);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        HMSLog.m86961d(TAG, "onCreated:" + objDesc(activity));
        this.mCurrentActivity = new WeakReference<>(activity);
    }
}
