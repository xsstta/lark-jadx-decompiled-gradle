package com.bytedance.ee.lark.oryxgadget.utils;

import android.content.Context;

/* renamed from: com.bytedance.ee.lark.oryxgadget.utils.b */
public class C12920b {
    /* renamed from: a */
    public static boolean m53269a(Context context) {
        if (context == null) {
            return false;
        }
        String packageName = context.getPackageName();
        if (packageName.contains("com.ss.android.lark") || packageName.contains("plugin")) {
            return true;
        }
        return false;
    }
}
