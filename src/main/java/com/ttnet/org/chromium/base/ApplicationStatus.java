package com.ttnet.org.chromium.base;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@JNINamespace("base::android")
public class ApplicationStatus {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static Activity sActivity;
    private static final Map<Activity, ActivityInfo> sActivityInfo = Collections.synchronizedMap(new HashMap());
    private static final ObserverList<ApplicationStateListener> sApplicationStateListeners = new ObserverList<>();
    private static int sCurrentApplicationState = 0;
    private static final ObserverList<ActivityStateListener> sGeneralActivityStateListeners = new ObserverList<>();
    public static ApplicationStateListener sNativeApplicationStateListener;
    public static final ObserverList<WindowFocusChangedListener> sWindowFocusListeners = new ObserverList<>();

    public interface ActivityStateListener {
        void onActivityStateChange(Activity activity, int i);
    }

    public interface ApplicationStateListener {
        void onApplicationStateChange(int i);
    }

    public interface WindowFocusChangedListener {
        void onWindowFocusChanged(Activity activity, boolean z);
    }

    public static native void nativeOnApplicationStateChange(int i);

    /* access modifiers changed from: private */
    public static class ActivityInfo {
        private ObserverList<ActivityStateListener> mListeners;
        private int mStatus;

        public ObserverList<ActivityStateListener> getListeners() {
            return this.mListeners;
        }

        public int getStatus() {
            return this.mStatus;
        }

        private ActivityInfo() {
            this.mStatus = 6;
            this.mListeners = new ObserverList<>();
        }

        public void setStatus(int i) {
            this.mStatus = i;
        }
    }

    private ApplicationStatus() {
    }

    public static Activity getLastTrackedFocusedActivity() {
        return sActivity;
    }

    public static boolean isEveryActivityDestroyed() {
        return sActivityInfo.isEmpty();
    }

    public static int getStateForApplication() {
        int i;
        synchronized (sActivityInfo) {
            i = sCurrentApplicationState;
        }
        return i;
    }

    public static boolean hasVisibleActivities() {
        int stateForApplication = getStateForApplication();
        if (stateForApplication == 1 || stateForApplication == 2) {
            return true;
        }
        return false;
    }

    public static boolean isInitialized() {
        boolean z;
        synchronized (sActivityInfo) {
            if (sCurrentApplicationState != 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    private static void registerThreadSafeNativeApplicationStateListener() {
        ThreadUtils.runOnUiThread(new Runnable() {
            /* class com.ttnet.org.chromium.base.ApplicationStatus.RunnableC679793 */

            public void run() {
                if (ApplicationStatus.sNativeApplicationStateListener == null) {
                    ApplicationStatus.sNativeApplicationStateListener = new ApplicationStateListener() {
                        /* class com.ttnet.org.chromium.base.ApplicationStatus.RunnableC679793.C679801 */

                        @Override // com.ttnet.org.chromium.base.ApplicationStatus.ApplicationStateListener
                        public void onApplicationStateChange(int i) {
                            ApplicationStatus.nativeOnApplicationStateChange(i);
                        }
                    };
                    ApplicationStatus.registerApplicationStateListener(ApplicationStatus.sNativeApplicationStateListener);
                }
            }
        });
    }

    public static List<Activity> getRunningActivities() {
        ArrayList arrayList;
        Map<Activity, ActivityInfo> map = sActivityInfo;
        synchronized (map) {
            arrayList = new ArrayList(map.keySet());
        }
        return arrayList;
    }

    public static void destroyForJUnitTests() {
        Map<Activity, ActivityInfo> map = sActivityInfo;
        synchronized (map) {
            sApplicationStateListeners.clear();
            sGeneralActivityStateListeners.clear();
            map.clear();
            sWindowFocusListeners.clear();
            sCurrentApplicationState = 0;
            sActivity = null;
            sNativeApplicationStateListener = null;
        }
    }

    private static int determineApplicationStateLocked() {
        boolean z = false;
        boolean z2 = false;
        for (ActivityInfo activityInfo : sActivityInfo.values()) {
            int status = activityInfo.getStatus();
            if (!(status == 4 || status == 5 || status == 6)) {
                return 1;
            }
            if (status == 4) {
                z = true;
            } else if (status == 5) {
                z2 = true;
            }
        }
        if (z) {
            return 2;
        }
        if (z2) {
            return 3;
        }
        return 4;
    }

    public static void registerApplicationStateListener(ApplicationStateListener applicationStateListener) {
        sApplicationStateListeners.addObserver(applicationStateListener);
    }

    public static void registerStateListenerForAllActivities(ActivityStateListener activityStateListener) {
        sGeneralActivityStateListeners.addObserver(activityStateListener);
    }

    public static void registerWindowFocusChangedListener(WindowFocusChangedListener windowFocusChangedListener) {
        sWindowFocusListeners.addObserver(windowFocusChangedListener);
    }

    public static void unregisterApplicationStateListener(ApplicationStateListener applicationStateListener) {
        sApplicationStateListeners.removeObserver(applicationStateListener);
    }

    public static void unregisterWindowFocusChangedListener(WindowFocusChangedListener windowFocusChangedListener) {
        sWindowFocusListeners.removeObserver(windowFocusChangedListener);
    }

    private static class WindowCallbackProxy implements InvocationHandler {
        private final Activity mActivity;
        private final Window.Callback mCallback;

        public void onWindowFocusChanged(boolean z) {
            this.mCallback.onWindowFocusChanged(z);
            Iterator<WindowFocusChangedListener> it = ApplicationStatus.sWindowFocusListeners.iterator();
            while (it.hasNext()) {
                it.next().onWindowFocusChanged(this.mActivity, z);
            }
        }

        public WindowCallbackProxy(Activity activity, Window.Callback callback) {
            this.mCallback = callback;
            this.mActivity = activity;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (!method.getName().equals("onWindowFocusChanged") || objArr.length != 1 || !(objArr[0] instanceof Boolean)) {
                try {
                    return method.invoke(this.mCallback, objArr);
                } catch (InvocationTargetException e) {
                    if (e.getCause() instanceof AbstractMethodError) {
                        throw e.getCause();
                    }
                    throw e;
                }
            } else {
                onWindowFocusChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            }
        }
    }

    public static int getStateForActivity(Activity activity) {
        ActivityInfo activityInfo;
        if (activity == null || (activityInfo = sActivityInfo.get(activity)) == null) {
            return 6;
        }
        return activityInfo.getStatus();
    }

    public static void initialize(Application application) {
        synchronized (sActivityInfo) {
            sCurrentApplicationState = 4;
        }
        registerWindowFocusChangedListener(new WindowFocusChangedListener() {
            /* class com.ttnet.org.chromium.base.ApplicationStatus.C679771 */

            @Override // com.ttnet.org.chromium.base.ApplicationStatus.WindowFocusChangedListener
            public void onWindowFocusChanged(Activity activity, boolean z) {
                int stateForActivity;
                if (z && activity != ApplicationStatus.sActivity && (stateForActivity = ApplicationStatus.getStateForActivity(activity)) != 6 && stateForActivity != 5) {
                    ApplicationStatus.sActivity = activity;
                }
            }
        });
        application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
            /* class com.ttnet.org.chromium.base.ApplicationStatus.C679782 */

            private void checkCallback(Activity activity) {
            }

            public void onActivityDestroyed(Activity activity) {
                ApplicationStatus.onStateChange(activity, 6);
                checkCallback(activity);
            }

            public void onActivityPaused(Activity activity) {
                ApplicationStatus.onStateChange(activity, 4);
                checkCallback(activity);
            }

            public void onActivityResumed(Activity activity) {
                ApplicationStatus.onStateChange(activity, 3);
                checkCallback(activity);
            }

            public void onActivityStarted(Activity activity) {
                ApplicationStatus.onStateChange(activity, 2);
                checkCallback(activity);
            }

            public void onActivityStopped(Activity activity) {
                ApplicationStatus.onStateChange(activity, 5);
                checkCallback(activity);
            }

            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                checkCallback(activity);
            }

            public void onActivityCreated(Activity activity, Bundle bundle) {
                ApplicationStatus.onStateChange(activity, 1);
            }
        });
    }

    public static void unregisterActivityStateListener(ActivityStateListener activityStateListener) {
        sGeneralActivityStateListeners.removeObserver(activityStateListener);
        Map<Activity, ActivityInfo> map = sActivityInfo;
        synchronized (map) {
            for (ActivityInfo activityInfo : map.values()) {
                activityInfo.getListeners().removeObserver(activityStateListener);
            }
        }
    }

    public static void onStateChangeForTesting(Activity activity, int i) {
        onStateChange(activity, i);
    }

    public static void registerStateListenerForActivity(ActivityStateListener activityStateListener, Activity activity) {
        sActivityInfo.get(activity).getListeners().addObserver(activityStateListener);
    }

    public static void onStateChange(Activity activity, int i) {
        ActivityInfo activityInfo;
        if (activity != null) {
            if (sActivity == null || i == 1 || i == 3 || i == 2) {
                sActivity = activity;
            }
            int stateForApplication = getStateForApplication();
            Map<Activity, ActivityInfo> map = sActivityInfo;
            synchronized (map) {
                if (!map.containsKey(activity)) {
                    map.put(activity, new ActivityInfo());
                }
                activityInfo = map.get(activity);
                activityInfo.setStatus(i);
                if (i == 6) {
                    map.remove(activity);
                    if (activity == sActivity) {
                        sActivity = null;
                    }
                }
                sCurrentApplicationState = determineApplicationStateLocked();
            }
            Iterator<ActivityStateListener> it = activityInfo.getListeners().iterator();
            while (it.hasNext()) {
                it.next().onActivityStateChange(activity, i);
            }
            Iterator<ActivityStateListener> it2 = sGeneralActivityStateListeners.iterator();
            while (it2.hasNext()) {
                it2.next().onActivityStateChange(activity, i);
            }
            int stateForApplication2 = getStateForApplication();
            if (stateForApplication2 != stateForApplication) {
                Iterator<ApplicationStateListener> it3 = sApplicationStateListeners.iterator();
                while (it3.hasNext()) {
                    it3.next().onApplicationStateChange(stateForApplication2);
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("null activity is not supported");
    }
}
