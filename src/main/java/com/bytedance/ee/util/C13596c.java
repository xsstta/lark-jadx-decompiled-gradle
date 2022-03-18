package com.bytedance.ee.util;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: com.bytedance.ee.util.c */
public class C13596c {
    /* renamed from: a */
    public static String m55177a(String str, String str2, String str3) {
        return Locale.ENGLISH.getLanguage().equals(str) ? !TextUtils.isEmpty(str3) ? str3 : str2 : !TextUtils.isEmpty(str2) ? str2 : str3;
    }
}
