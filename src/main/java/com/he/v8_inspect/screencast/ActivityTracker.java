package com.he.v8_inspect.screencast;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Looper;
import com.he.v8_inspect.utils.Util;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.Nullable;

public final class ActivityTracker {
    private static final ActivityTracker sInstance = new ActivityTracker();
    private final ArrayList<WeakReference<Activity>> mActivities;
    private final List<WeakReference<Activity>> mActivitiesUnmodifiable;
    @Nullable
    private AutomaticTracker mAutomaticTracker;
    private final List<Listener> mListeners = new CopyOnWriteArrayList();

    public interface Listener {
        void onActivityAdded(Activity activity);

        void onActivityRemoved(Activity activity);
    }

    private static abstract class AutomaticTracker {
        public abstract void register();

        public abstract void unregister();

        private AutomaticTracker() {
        }

        /* access modifiers changed from: private */
        public static class AutomaticTrackerICSAndBeyond extends AutomaticTracker {
            private final Application mApplication;
            private final Application.ActivityLifecycleCallbacks mLifecycleCallbacks = new Application.ActivityLifecycleCallbacks() {
                /* class com.he.v8_inspect.screencast.ActivityTracker.AutomaticTracker.AutomaticTrackerICSAndBeyond.C233921 */

                public void onActivityPaused(Activity activity) {
                }

                public void onActivityResumed(Activity activity) {
                }

                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                public void onActivityStarted(Activity activity) {
                }

                public void onActivityStopped(Activity activity) {
                }

                public void onActivityDestroyed(Activity activity) {
                    AutomaticTrackerICSAndBeyond.this.mTracker.remove(activity);
                }

                public void onActivityCreated(Activity activity, Bundle bundle) {
                    AutomaticTrackerICSAndBeyond.this.mTracker.add(activity);
                }
            };
            public final ActivityTracker mTracker;

            @Override // com.he.v8_inspect.screencast.ActivityTracker.AutomaticTracker
            public void register() {
                Application application = this.mApplication;
                if (application != null) {
                    application.registerActivityLifecycleCallbacks(this.mLifecycleCallbacks);
                }
            }

            @Override // com.he.v8_inspect.screencast.ActivityTracker.AutomaticTracker
            public void unregister() {
                Application application = this.mApplication;
                if (application != null) {
                    application.unregisterActivityLifecycleCallbacks(this.mLifecycleCallbacks);
                }
            }

            public AutomaticTrackerICSAndBeyond(Application application, ActivityTracker activityTracker) {
                super();
                this.mApplication = application;
                this.mTracker = activityTracker;
            }
        }

        public static AutomaticTracker newInstance(Application application, ActivityTracker activityTracker) {
            return new AutomaticTrackerICSAndBeyond(application, activityTracker);
        }
    }

    public static ActivityTracker get() {
        return sInstance;
    }

    public List<WeakReference<Activity>> getActivitiesView() {
        return this.mActivitiesUnmodifiable;
    }

    public boolean endTracking() {
        AutomaticTracker automaticTracker = this.mAutomaticTracker;
        if (automaticTracker == null) {
            return false;
        }
        automaticTracker.unregister();
        this.mAutomaticTracker = null;
        return true;
    }

    public ActivityTracker() {
        ArrayList<WeakReference<Activity>> arrayList = new ArrayList<>();
        this.mActivities = arrayList;
        this.mActivitiesUnmodifiable = Collections.unmodifiableList(arrayList);
    }

    @Nullable
    public Activity tryGetTopActivity() {
        if (this.mActivitiesUnmodifiable.isEmpty()) {
            return null;
        }
        for (int size = this.mActivitiesUnmodifiable.size() - 1; size >= 0; size--) {
            Activity activity = this.mActivitiesUnmodifiable.get(size).get();
            if (activity != null) {
                return activity;
            }
        }
        return null;
    }

    public void registerListener(Listener listener) {
        this.mListeners.add(listener);
    }

    public void unregisterListener(Listener listener) {
        this.mListeners.remove(listener);
    }

    public boolean beginTrackingIfPossible(Application application) {
        if (this.mAutomaticTracker != null) {
            return false;
        }
        AutomaticTracker newInstance = AutomaticTracker.newInstance(application, this);
        newInstance.register();
        this.mAutomaticTracker = newInstance;
        return true;
    }

    public void add(Activity activity) {
        boolean z;
        Util.throwIfNull(activity);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        Util.throwIfNot(z);
        this.mActivities.add(new WeakReference<>(activity));
        for (Listener listener : this.mListeners) {
            listener.onActivityAdded(activity);
        }
    }

    public void remove(Activity activity) {
        boolean z;
        Util.throwIfNull(activity);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        Util.throwIfNot(z);
        if (removeFromWeakList(this.mActivities, activity)) {
            for (Listener listener : this.mListeners) {
                listener.onActivityRemoved(activity);
            }
        }
    }

    private static <T> boolean removeFromWeakList(ArrayList<WeakReference<T>> arrayList, T t) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (arrayList.get(i).get() == t) {
                arrayList.remove(i);
                return true;
            }
        }
        return false;
    }
}
