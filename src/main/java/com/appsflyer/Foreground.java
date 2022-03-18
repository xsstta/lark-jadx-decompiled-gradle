package com.appsflyer;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.Timer;
import java.util.TimerTask;

public class Foreground {
    public static AbstractC1998e listener = null;

    /* renamed from: Ι */
    static long f6835 = 500;

    /* renamed from: com.appsflyer.Foreground$e */
    interface AbstractC1998e {
        /* renamed from: ı */
        void mo9990(Activity activity);

        /* renamed from: ı */
        void mo9991(Context context);
    }

    /* renamed from: Ι */
    static void m8838(Context context, final AbstractC1998e eVar) {
        listener = eVar;
        C19965 r0 = new Application.ActivityLifecycleCallbacks() {
            /* class com.appsflyer.Foreground.C19965 */

            /* renamed from: ı */
            boolean f6836 = true;

            /* renamed from: ι */
            boolean f6838;

            public final void onActivityDestroyed(Activity activity) {
            }

            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public final void onActivityStarted(Activity activity) {
            }

            public final void onActivityStopped(Activity activity) {
            }

            public final void onActivityPaused(Activity activity) {
                this.f6836 = true;
                final Context applicationContext = activity.getApplicationContext();
                try {
                    new Timer().schedule(new TimerTask() {
                        /* class com.appsflyer.Foreground.C19965.C19975 */

                        public final void run() {
                            if (C19965.this.f6838 && C19965.this.f6836) {
                                C19965.this.f6838 = false;
                                try {
                                    eVar.mo9991(applicationContext);
                                } catch (Exception e) {
                                    AFLogger.afErrorLog("Listener threw exception! ", e);
                                }
                            }
                        }
                    }, Foreground.f6835);
                } catch (Throwable th) {
                    AFLogger.afErrorLog("Background task failed with a throwable: ", th);
                }
            }

            public final void onActivityResumed(Activity activity) {
                if (!this.f6838) {
                    try {
                        eVar.mo9990(activity);
                    } catch (Exception e) {
                        AFLogger.afErrorLog("Listener thrown an exception: ", e);
                    }
                }
                this.f6836 = false;
                this.f6838 = true;
            }

            public final void onActivityCreated(Activity activity, Bundle bundle) {
                AFDeepLinkManager.m8703().collectIntentsFromActivities(activity.getIntent());
            }
        };
        if (context instanceof Activity) {
            r0.onActivityResumed((Activity) context);
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(r0);
    }
}
