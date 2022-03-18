package com.ss.android.lark.mail.impl.utils;

import android.app.Activity;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.mail.impl.utils.b */
public class C43752b {
    /* renamed from: a */
    public static final void m173435a(final Activity activity) {
        Log.m165389i("ActivityUtil", "tryFinish");
        if (activity == null) {
            Log.m165383e("ActivityUtil", "tryFinish null");
        } else {
            C43849u.m173826a(new Runnable() {
                /* class com.ss.android.lark.mail.impl.utils.C43752b.RunnableC437531 */

                public void run() {
                    if (activity.isDestroyed() || activity.isFinishing()) {
                        Log.m165397w("ActivityUtil", "tryFinish no need to finish");
                        return;
                    }
                    Log.m165389i("ActivityUtil", "tryFinish do finish");
                    activity.finish();
                }
            });
        }
    }

    /* renamed from: b */
    public static final boolean m173436b(Activity activity) {
        if (activity.isFinishing() || activity.isDestroyed()) {
            return false;
        }
        return true;
    }
}
