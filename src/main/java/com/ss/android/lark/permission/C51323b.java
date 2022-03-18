package com.ss.android.lark.permission;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.core.content.ContextCompat;

/* renamed from: com.ss.android.lark.permission.b */
public class C51323b {
    /* renamed from: a */
    public static boolean m199076a(Context context, String... strArr) {
        boolean z;
        if (Build.VERSION.SDK_INT < 23) {
            Log.w("EasyPermissions", "hasPermissions: API version < M, returning true by default");
            return true;
        }
        for (String str : strArr) {
            if (ContextCompat.checkSelfPermission(context, str) == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }
}
