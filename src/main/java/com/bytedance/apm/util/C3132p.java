package com.bytedance.apm.util;

import android.text.TextUtils;
import android.util.Log;

/* renamed from: com.bytedance.apm.util.p */
public final class C3132p {
    /* renamed from: a */
    public static String m13026a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(str2 + " must not be empty");
    }

    /* renamed from: b */
    public static String m13027b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            Log.w("apm", str2 + " is empty, please make sure");
        }
        return str;
    }
}
