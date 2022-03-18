package com.ttnet.org.chromium.base;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.ttnet.org.chromium.base.WeakHandler;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LifeCycleMonitor implements Application.ActivityLifecycleCallbacks {
    public static boolean mAppAlive;
    private static WeakHandler sHandler = new WeakHandler(Looper.getMainLooper(), new WeakHandler.IHandler() {
        /* class com.ttnet.org.chromium.base.LifeCycleMonitor.C679871 */

        @Override // com.ttnet.org.chromium.base.WeakHandler.IHandler
        public void handleMsg(Message message) {
        }
    });
    private int mActivityCount;
    public AppStateListener mListener;
    private Runnable mRunnable = new Runnable() {
        /* class com.ttnet.org.chromium.base.LifeCycleMonitor.RunnableC679882 */

        public void run() {
            if (LifeCycleMonitor.mAppAlive) {
                LifeCycleMonitor.mAppAlive = false;
                if (LifeCycleMonitor.this.mListener != null) {
                    LifeCycleMonitor.this.mListener.onEnterToBackground();
                }
            }
        }
    };

    public interface AppStateListener {
        void onEnterToBackground();

        void onEnterToForeground();

        void onInstantEnterToBackground();

        void onInstantEnterToForeground();
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public LifeCycleMonitor() {
        if (getActivity() != null) {
            mAppAlive = true;
        }
        this.mActivityCount = 0;
        List<Activity> allActivities = getAllActivities();
        if (allActivities != null) {
            this.mActivityCount = allActivities.size();
        }
    }

    public static Activity getActivity() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            Map map = (Map) declaredField.get(invoke);
            if (map == null) {
                return null;
            }
            for (Object obj : map.values()) {
                Class<?> cls2 = obj.getClass();
                Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(obj)) {
                    Field declaredField3 = cls2.getDeclaredField("activity");
                    declaredField3.setAccessible(true);
                    return (Activity) declaredField3.get(obj);
                }
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static List<Activity> getAllActivities() {
        ArrayList arrayList = new ArrayList();
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            Map map = (Map) declaredField.get(invoke);
            if (map == null) {
                return null;
            }
            for (Map.Entry entry : map.entrySet()) {
                Object value = entry.getValue();
                Field declaredField2 = value.getClass().getDeclaredField("activity");
                declaredField2.setAccessible(true);
                arrayList.add((Activity) declaredField2.get(value));
            }
            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void setAppStateChangedListener(AppStateListener appStateListener) {
        this.mListener = appStateListener;
    }

    public void onActivityPaused(Activity activity) {
        if (mAppAlive) {
            sHandler.postDelayed(this.mRunnable, 30000);
        }
    }

    public void onActivityStopped(Activity activity) {
        AppStateListener appStateListener;
        int i = this.mActivityCount - 1;
        this.mActivityCount = i;
        if (i == 0 && (appStateListener = this.mListener) != null) {
            appStateListener.onInstantEnterToBackground();
        }
    }

    public void onActivityResumed(Activity activity) {
        if (!mAppAlive) {
            mAppAlive = true;
            AppStateListener appStateListener = this.mListener;
            if (appStateListener != null) {
                appStateListener.onEnterToForeground();
            }
        }
        sHandler.removeCallbacks(this.mRunnable);
    }

    public void onActivityStarted(Activity activity) {
        AppStateListener appStateListener;
        if (this.mActivityCount == 0 && (appStateListener = this.mListener) != null) {
            appStateListener.onInstantEnterToForeground();
        }
        this.mActivityCount++;
    }
}
