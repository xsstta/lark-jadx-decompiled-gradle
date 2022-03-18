package com.ss.android.lark.littleapp.service.p2132a;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: com.ss.android.lark.littleapp.service.a.f */
public class C41456f {
    /* renamed from: a */
    public static boolean m164493a(String str) {
        return m164494a(str, "sslocal", "microapp");
    }

    /* renamed from: a */
    private static boolean m164494a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            if ((TextUtils.isEmpty(scheme) || str2.equalsIgnoreCase(scheme)) && (TextUtils.isEmpty(str3) || str3.equalsIgnoreCase(host))) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
