package com.ss.android.lark.passport.infra.util;

import android.net.Uri;

/* renamed from: com.ss.android.lark.passport.infra.util.ah */
public class C49156ah {

    /* renamed from: a */
    private static final String[] f123437a = {"dingtalk://"};

    /* renamed from: a */
    public static boolean m193843a(String str) {
        if (str == null) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if ((parse.getPath() == null || !parse.getPath().contains("/passport/versions/download/file/")) && !str.endsWith(".apk")) {
            return false;
        }
        return true;
    }
}
