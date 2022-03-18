package com.ss.android.ad.splash.utils;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: com.ss.android.ad.splash.utils.m */
public final class C27485m {
    /* renamed from: b */
    public static boolean m100402b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("sslocal://");
    }

    /* renamed from: a */
    public static boolean m100401a(String str) {
        if (TextUtils.isEmpty(str) || (!str.startsWith("http://") && !str.startsWith("https://"))) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m100403c(String str) {
        if (!m100402b(str)) {
            return false;
        }
        String host = Uri.parse(str).getHost();
        if ("microapp".equals(host) || "microgame".equals(host)) {
            return true;
        }
        return false;
    }
}
