package androidx.core.os;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* renamed from: androidx.core.os.j */
public class C0805j {
    /* renamed from: a */
    public static boolean m3897a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
        return true;
    }
}
