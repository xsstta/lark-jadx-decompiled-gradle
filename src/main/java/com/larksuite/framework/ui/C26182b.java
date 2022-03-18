package com.larksuite.framework.ui;

import android.app.Activity;

/* access modifiers changed from: package-private */
/* renamed from: com.larksuite.framework.ui.b */
public class C26182b {
    /* renamed from: a */
    public static boolean m94713a(Activity activity) {
        if (activity == null || !m94714b(activity)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m94714b(Activity activity) {
        if (activity.isDestroyed() || activity.isFinishing()) {
            return false;
        }
        return true;
    }
}
