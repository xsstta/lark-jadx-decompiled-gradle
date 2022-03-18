package com.bytedance.ee.bear.drive.common;

import android.text.TextUtils;

/* renamed from: com.bytedance.ee.bear.drive.common.g */
public class C6894g {
    /* renamed from: a */
    public static boolean m27258a(String str) {
        if (TextUtils.isEmpty(str) || (!str.equalsIgnoreCase("ppt") && !str.equalsIgnoreCase("pptx"))) {
            return false;
        }
        return true;
    }
}
