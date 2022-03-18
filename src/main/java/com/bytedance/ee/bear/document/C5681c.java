package com.bytedance.ee.bear.document;

import android.text.TextUtils;
import com.bytedance.ee.bear.domain.C6313i;

/* renamed from: com.bytedance.ee.bear.document.c */
public class C5681c {
    /* renamed from: a */
    public static boolean m23038a(String str) {
        if (TextUtils.isEmpty(str) || !C6313i.m25327a().mo25392c(str)) {
            return false;
        }
        if (str.contains("/file/f") || str.contains("//file/f")) {
            return true;
        }
        return false;
    }
}
