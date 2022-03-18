package com.bytedance.ttnet.p911b;

import android.content.Context;

/* renamed from: com.bytedance.ttnet.b.b */
public class C20743b {

    /* renamed from: a */
    private static String f50764a = "ttnet_debug_setting";

    /* renamed from: b */
    private static String f50765b = "log_switcher";

    /* renamed from: c */
    private static String f50766c = "x86_support";

    /* renamed from: b */
    public static boolean m75556b(Context context) {
        return "true".equals(m75554a(context, f50766c));
    }

    /* renamed from: a */
    public static boolean m75555a(Context context) {
        return "true".equals(m75554a(context, f50765b));
    }

    /* renamed from: a */
    private static String m75554a(Context context, String str) {
        if (context != null) {
            return context.getSharedPreferences(f50764a, 0).getString(str, null);
        }
        return null;
    }
}
