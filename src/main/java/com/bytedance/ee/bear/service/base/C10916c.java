package com.bytedance.ee.bear.service.base;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: com.bytedance.ee.bear.service.base.c */
public class C10916c {

    /* renamed from: a */
    private static String f29381a = "";

    /* renamed from: b */
    private static String f29382b;

    /* renamed from: c */
    private static boolean f29383c;

    /* renamed from: a */
    public static String m45406a(Context context) {
        return f29381a;
    }

    /* renamed from: a */
    public static void m45407a(String str) {
        f29381a = str;
    }

    /* renamed from: c */
    public static boolean m45410c(Context context) {
        boolean z = f29383c;
        if (z) {
            return z;
        }
        if (!TextUtils.isEmpty(f29381a) && !f29381a.contains(":")) {
            f29383c = true;
        }
        return f29383c;
    }

    /* renamed from: b */
    public static String m45409b(Context context) {
        int i;
        if (TextUtils.isEmpty(f29382b)) {
            int indexOf = f29381a.indexOf(":");
            if (indexOf < 0 || (i = indexOf + 1) >= f29381a.length()) {
                f29382b = "main";
            } else {
                String str = f29381a;
                f29382b = str.subSequence(i, str.length()).toString();
            }
        }
        return f29382b;
    }

    /* renamed from: a */
    public static boolean m45408a(Context context, String str) {
        return m45409b(context).equals(str);
    }
}
