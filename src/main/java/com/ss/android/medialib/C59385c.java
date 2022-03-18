package com.ss.android.medialib;

import android.text.TextUtils;
import java.io.File;

/* renamed from: com.ss.android.medialib.c */
public class C59385c {
    /* renamed from: a */
    public static boolean m230538a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }
}
