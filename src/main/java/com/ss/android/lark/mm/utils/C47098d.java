package com.ss.android.lark.mm.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.Fragment;
import com.larksuite.framework.utils.UIUtils;

/* renamed from: com.ss.android.lark.mm.utils.d */
public final class C47098d {
    /* renamed from: b */
    public static boolean m186535b(Context context) {
        if (context == null || !(context instanceof Activity)) {
            return false;
        }
        return UIUtils.isActivityRunning((Activity) context);
    }

    /* renamed from: a */
    public static Activity m186533a(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m186534a(Fragment fragment) {
        if (fragment == null || fragment.isRemoving() || fragment.getActivity() == null || fragment.isDetached() || !fragment.isAdded() || fragment.getView() == null) {
            return false;
        }
        return true;
    }
}
