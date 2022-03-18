package com.ss.android.lark.mail.impl.utils;

import android.text.TextUtils;
import java.io.File;

/* renamed from: com.ss.android.lark.mail.impl.utils.h */
public class C43765h {
    /* renamed from: a */
    public static File m173483a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new File(str);
    }
}
