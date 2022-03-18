package com.larksuite.component.dybrid.router.p1088e;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;

/* renamed from: com.larksuite.component.dybrid.router.e.a */
public class C24274a {
    /* renamed from: a */
    public static String m88628a(String str) {
        String str2;
        String str3 = "";
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        Uri parse = Uri.parse(str);
        if (parse.getScheme() == null) {
            str2 = str3;
        } else {
            str2 = parse.getScheme() + "://";
        }
        if (str.startsWith("//")) {
            str3 = "//";
        }
        String str4 = str3 + str2 + parse.getHost() + parse.getPath();
        Log.d("ParseUtil", " getNoParamUrl " + str4);
        return str4;
    }

    /* renamed from: a */
    public static String m88627a(Uri uri, String str) {
        if (uri.isOpaque()) {
            return "";
        }
        return uri.getQueryParameter(str);
    }
}
