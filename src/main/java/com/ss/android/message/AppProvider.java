package com.ss.android.message;

import android.app.Application;
import com.bytedance.common.push.ActivityLifecycleObserver;
import com.ss.android.message.p3002a.C59436a;
import java.util.concurrent.atomic.AtomicBoolean;

public class AppProvider {
    private static volatile Application app;
    private static final AtomicBoolean sRegisteredActivityLifecycleCallback = new AtomicBoolean(false);

    public static Application getApp() {
        return app;
    }

    public static int getTargetSdkVersion() {
        return app.getApplicationInfo().targetSdkVersion;
    }

    public static void initApp(Application application) {
        if (!sRegisteredActivityLifecycleCallback.getAndSet(true)) {
            app = application;
            if (C59436a.m230732b(application)) {
                app.registerActivityLifecycleCallbacks(ActivityLifecycleObserver.getIns());
            }
        }
    }
}
