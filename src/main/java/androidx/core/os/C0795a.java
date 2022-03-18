package androidx.core.os;

import android.os.Build;

/* renamed from: androidx.core.os.a */
public class C0795a {
    /* renamed from: a */
    public static boolean m3873a() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m3874b() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }
}
