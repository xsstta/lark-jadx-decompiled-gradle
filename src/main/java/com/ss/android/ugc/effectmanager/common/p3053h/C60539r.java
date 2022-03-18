package com.ss.android.ugc.effectmanager.common.p3053h;

import android.text.TextUtils;

/* renamed from: com.ss.android.ugc.effectmanager.common.h.r */
public class C60539r {
    /* renamed from: a */
    public static boolean m235323a(String str, int i, int i2) {
        if (!TextUtils.isEmpty(str) && i >= 0 && i2 >= 0 && i < i2 && i < str.length() && i2 <= str.length()) {
            return true;
        }
        return false;
    }
}
