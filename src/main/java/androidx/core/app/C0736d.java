package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;

/* renamed from: androidx.core.app.d */
public final class C0736d {
    /* renamed from: a */
    public static String m3593a(String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AppOpsManager.permissionToOp(str);
        }
        return null;
    }

    /* renamed from: a */
    public static int m3592a(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str, str2);
        }
        return 1;
    }
}
