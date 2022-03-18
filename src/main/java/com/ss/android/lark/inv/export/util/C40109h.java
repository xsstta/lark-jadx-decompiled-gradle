package com.ss.android.lark.inv.export.util;

import android.app.Activity;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.lark.inv.export.util.h */
public class C40109h {
    /* renamed from: b */
    public static int m159018b() {
        if (C40147z.m159160a().isLarkEnv()) {
            return 1;
        }
        return 86;
    }

    /* renamed from: a */
    public static String m159016a() {
        return "+" + m159018b();
    }

    /* renamed from: a */
    public static void m159017a(Activity activity) {
        C40147z.m159160a().getLoginDependency().mo145583a(activity, 10086, R.anim.inv_translate_from_bottom, R.anim.inv_translate_to_bottom);
    }
}
