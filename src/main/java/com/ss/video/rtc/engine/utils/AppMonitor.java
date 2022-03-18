package com.ss.video.rtc.engine.utils;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class AppMonitor implements Application.ActivityLifecycleCallbacks {
    private static AppMonitor INSTANCE;
    private List<Callback> mCallbacks = new CopyOnWriteArrayList();

    public interface Callback {
        void callback(int i);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        notifyCallback(0);
    }

    public void onActivityResumed(Activity activity) {
        notifyCallback(1);
    }

    private AppMonitor(Context context) {
        registerLifecycle(context);
    }

    private void registerLifecycle(Context context) {
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
    }

    public AppMonitor unRegister(Callback callback) {
        if (!this.mCallbacks.contains(callback)) {
            return this;
        }
        this.mCallbacks.remove(callback);
        return this;
    }

    public static AppMonitor get(Context context) {
        if (INSTANCE == null) {
            synchronized (AppMonitor.class) {
                if (INSTANCE == null) {
                    INSTANCE = new AppMonitor(context);
                }
            }
        }
        return INSTANCE;
    }

    /* access modifiers changed from: package-private */
    public void notifyCallback(int i) {
        for (Callback callback : this.mCallbacks) {
            callback.callback(i);
        }
    }

    public boolean release(Context context) {
        if (context == null) {
            return false;
        }
        ((Application) context.getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
        this.mCallbacks.clear();
        INSTANCE = null;
        return true;
    }

    public AppMonitor register(Context context, Callback callback) {
        if (!this.mCallbacks.contains(callback)) {
            this.mCallbacks.add(callback);
        }
        notifyCallback(CommonUtils.isInForeground(context) ? 1 : 0);
        return this;
    }
}
