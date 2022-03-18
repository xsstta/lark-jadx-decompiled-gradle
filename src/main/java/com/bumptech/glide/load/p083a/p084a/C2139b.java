package com.bumptech.glide.load.p083a.p084a;

import android.net.Uri;

/* renamed from: com.bumptech.glide.load.a.a.b */
public final class C2139b {
    /* renamed from: a */
    public static boolean m9324a(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    /* renamed from: b */
    public static boolean m9326b(Uri uri) {
        if (!m9325a(uri) || !m9328d(uri)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m9327c(Uri uri) {
        if (!m9325a(uri) || m9328d(uri)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m9328d(Uri uri) {
        return uri.getPathSegments().contains("video");
    }

    /* renamed from: a */
    public static boolean m9325a(Uri uri) {
        if (uri == null || !"content".equals(uri.getScheme()) || !"media".equals(uri.getAuthority())) {
            return false;
        }
        return true;
    }
}
