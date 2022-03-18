package com.bytedance.common.jato.util;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class ActivityLifeManager implements Application.ActivityLifecycleCallbacks {
    private boolean changingConfigActivity;
    private int frontActivityCount;
    private volatile boolean isFront;
    private final ArrayList<IActivityLifecycleObserver> observers;
    private String topActivityClassName;
    private WeakReference<Activity> topActivityRef;

    /* access modifiers changed from: private */
    public static final class SingletonHolder {
        public static final ActivityLifeManager instance = new ActivityLifeManager();
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public static ActivityLifeManager getInstance() {
        return SingletonHolder.instance;
    }

    private ActivityLifeManager() {
        this.observers = new ArrayList<>();
        this.topActivityClassName = null;
    }

    private Object[] collectObservers() {
        Object[] objArr;
        synchronized (this.observers) {
            if (this.observers.size() > 0) {
                objArr = this.observers.toArray();
            } else {
                objArr = null;
            }
        }
        if (objArr == null) {
            return new Object[0];
        }
        return objArr;
    }

    public void init(Application application) {
        application.unregisterActivityLifecycleCallbacks(this);
        application.registerActivityLifecycleCallbacks(this);
    }

    private void notifyBackground(Activity activity) {
        for (Object obj : collectObservers()) {
            ((IActivityLifecycleObserver) obj).onBackground(activity);
        }
    }

    private void notifyFront(Activity activity) {
        for (Object obj : collectObservers()) {
            ((IActivityLifecycleObserver) obj).onFront(activity);
        }
    }

    public void onActivityPaused(Activity activity) {
        for (Object obj : collectObservers()) {
            ((IActivityLifecycleObserver) obj).onActivityPause(activity);
        }
    }

    public void onActivityResumed(Activity activity) {
        this.topActivityRef = new WeakReference<>(activity);
        this.topActivityClassName = null;
        for (Object obj : collectObservers()) {
            ((IActivityLifecycleObserver) obj).onActivityResume(activity);
        }
    }

    public void onActivityStopped(Activity activity) {
        if (activity.isChangingConfigurations()) {
            this.changingConfigActivity = true;
            return;
        }
        int i = this.frontActivityCount - 1;
        this.frontActivityCount = i;
        if (i == 0) {
            this.isFront = false;
            notifyBackground(activity);
        }
    }

    public void onActivityStarted(Activity activity) {
        for (Object obj : collectObservers()) {
            ((IActivityLifecycleObserver) obj).onActivityStarted(activity);
        }
        if (this.changingConfigActivity) {
            this.changingConfigActivity = false;
            return;
        }
        int i = this.frontActivityCount + 1;
        this.frontActivityCount = i;
        if (i == 1) {
            this.isFront = true;
            notifyFront(activity);
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        for (Object obj : collectObservers()) {
            ((IActivityLifecycleObserver) obj).onActivityCreated(activity);
        }
    }
}
