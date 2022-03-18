package com.ss.android.lark.passport.infra.util;

import android.app.Activity;
import com.larksuite.framework.utils.UIUtils;

/* renamed from: com.ss.android.lark.passport.infra.util.t */
public class C49217t {
    /* renamed from: a */
    public static void m194040a(Activity activity, int i) {
        int color = UIUtils.getColor(activity, i);
        activity.getWindow().addFlags(Integer.MIN_VALUE);
        activity.getWindow().clearFlags(134217728);
        activity.getWindow().setNavigationBarColor(color);
    }
}
