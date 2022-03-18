package com.bytedance.common.wschannel;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;

class LifeCycleMonitor implements Application.ActivityLifecycleCallbacks {
    public static boolean mAppAlive;
    private static WeakHandler sHandler = new WeakHandler(Looper.getMainLooper(), new WeakHandler.IHandler() {
        /* class com.bytedance.common.wschannel.LifeCycleMonitor.C36361 */

        @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
        public void handleMsg(Message message) {
        }
    });
    public AppStateListener mListener;
    private Runnable mRunnable = new Runnable() {
        /* class com.bytedance.common.wschannel.LifeCycleMonitor.RunnableC36372 */

        public void run() {
            if (Logger.debug()) {
                Logger.m15167d("WsChannelSdk", "sRunnable AppAlive = " + LifeCycleMonitor.mAppAlive);
            }
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

    LifeCycleMonitor() {
    }

    public void setAppStateChangedListener(AppStateListener appStateListener) {
        this.mListener = appStateListener;
    }

    public void onActivityPaused(Activity activity) {
        if (mAppAlive) {
            sHandler.postDelayed(this.mRunnable, 3000);
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
        if (Logger.debug()) {
            Logger.m15167d("WsChannelSdk", "onResume sAppAlive = " + mAppAlive);
        }
        sHandler.removeCallbacks(this.mRunnable);
    }
}
