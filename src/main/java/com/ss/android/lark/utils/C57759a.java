package com.ss.android.lark.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.fragment.app.Fragment;

/* renamed from: com.ss.android.lark.utils.a */
public class C57759a {
    /* renamed from: a */
    public static boolean m224180a(Context context) {
        if (context != null && (context instanceof Activity)) {
            return m224179a((Activity) context);
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m224179a(Activity activity) {
        boolean z;
        if (activity == null) {
            return true;
        }
        if (Build.VERSION.SDK_INT < 17 || !activity.isDestroyed()) {
            z = false;
        } else {
            z = true;
        }
        if (z || activity.isFinishing()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m224181a(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return m224179a((Activity) fragment.getActivity());
    }
}
