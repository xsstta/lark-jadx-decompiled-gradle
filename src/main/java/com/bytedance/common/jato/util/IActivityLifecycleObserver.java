package com.bytedance.common.jato.util;

import android.app.Activity;

public interface IActivityLifecycleObserver {
    void onActivityCreated(Activity activity);

    void onActivityPause(Activity activity);

    void onActivityResume(Activity activity);

    void onActivityStarted(Activity activity);

    void onBackground(Activity activity);

    void onFront(Activity activity);
}
