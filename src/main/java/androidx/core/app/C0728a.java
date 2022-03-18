package androidx.core.app;

import android.app.ActivityManager;
import android.os.Build;

/* renamed from: androidx.core.app.a */
public final class C0728a {
    /* renamed from: a */
    public static boolean m3579a(ActivityManager activityManager) {
        if (Build.VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return false;
    }
}
