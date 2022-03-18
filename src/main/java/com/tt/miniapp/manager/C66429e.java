package com.tt.miniapp.manager;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.entity.C66007a;
import com.tt.miniapp.manager.C66420d;
import com.tt.miniapp.util.C67018a;
import com.tt.miniapphost.data.C67485a;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.miniapphost.util.DebugUtil;
import java.lang.ref.WeakReference;

/* renamed from: com.tt.miniapp.manager.e */
public class C66429e {
    /* renamed from: a */
    public static synchronized Activity m259690a() {
        synchronized (C66429e.class) {
            for (int size = ContextSingletonInstance.getInstance().hostProcessActivityWrList.size() - 1; size >= 0; size--) {
                Activity a = m259691a(size, false);
                if (a != null) {
                    return a;
                }
            }
            AppBrandLogger.m52829e("HostActivityManager", "getNullHostTopActivity");
            return null;
        }
    }

    /* renamed from: b */
    public static void m259695b(Activity activity) {
        for (int size = ContextSingletonInstance.getInstance().hostProcessActivityWrList.size() - 1; size >= 0; size--) {
            if (m259691a(size, true) == activity) {
                ContextSingletonInstance.getInstance().hostProcessActivityWrList.remove(size);
                return;
            }
        }
    }

    /* renamed from: a */
    public static void m259693a(String str) {
        AppBrandLogger.m52830i("HostActivityManager", "tryMoveMiniAppActivityTaskToFront mTriggeredHomeOrRecentApp:", Boolean.valueOf(ContextSingletonInstance.getInstance().triggeredHomeOrRecentApp), "targetAppId:", str);
        if (!TextUtils.isEmpty(str)) {
            C67018a.m261205a(m259690a(), str);
        }
    }

    /* renamed from: a */
    public static boolean m259694a(Activity activity) {
        if (activity == null) {
            return true;
        }
        String name = activity.getClass().getName();
        if (TextUtils.isEmpty(name)) {
            return true;
        }
        return name.endsWith("MoveHostFrontActivity");
    }

    /* renamed from: a */
    public static void m259692a(Application application, IAppContext iAppContext) {
        application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
            /* class com.tt.miniapp.manager.C66429e.C664301 */

            public void onActivityCreated(Activity activity, Bundle bundle) {
            }

            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public void onActivityStopped(Activity activity) {
            }

            public void onActivityResumed(Activity activity) {
                ContextSingletonInstance.getInstance().triggeredHomeOrRecentApp = false;
            }

            public void onActivityDestroyed(Activity activity) {
                if (!C66429e.m259694a(activity)) {
                    try {
                        C66429e.m259695b(activity);
                    } catch (Exception e) {
                        DebugUtil.outputError("HostActivityManager", "onActivityDestroyed", e);
                    }
                }
            }

            public void onActivityPaused(Activity activity) {
                if (!C66429e.m259694a(activity) && ContextSingletonInstance.getInstance().hostProcessActivityWrList.size() == 0) {
                    ContextSingletonInstance.getInstance().hostProcessActivityWrList.add(new WeakReference<>(activity));
                }
            }

            public void onActivityStarted(Activity activity) {
                if (!C66429e.m259694a(activity)) {
                    try {
                        C66429e.m259695b(activity);
                        ContextSingletonInstance.getInstance().hostProcessActivityWrList.add(new WeakReference<>(activity));
                    } catch (Exception e) {
                        DebugUtil.outputError("HostActivityManager", "onActivityStarted", e);
                    }
                }
            }
        });
        C66420d foreBackgroundManager = C67485a.m262488a(iAppContext).mo234292m().getForeBackgroundManager();
        foreBackgroundManager.mo231957a();
        foreBackgroundManager.mo231958a(new C66420d.C66427b() {
            /* class com.tt.miniapp.manager.C66429e.C664312 */

            @Override // com.tt.miniapp.manager.C66420d.C66427b, com.tt.miniapp.manager.C66420d.AbstractC66428c
            /* renamed from: d */
            public void mo88043d() {
                ContextSingletonInstance.getInstance().triggeredHomeOrRecentApp = true;
                C66007a.m258496c();
            }
        });
    }

    /* renamed from: a */
    private static Activity m259691a(int i, boolean z) {
        WeakReference<Activity> weakReference = ContextSingletonInstance.getInstance().hostProcessActivityWrList.get(i);
        if (weakReference != null && weakReference.get() != null) {
            return weakReference.get();
        }
        if (!z) {
            return null;
        }
        ContextSingletonInstance.getInstance().hostProcessActivityWrList.remove(i);
        return null;
    }
}
