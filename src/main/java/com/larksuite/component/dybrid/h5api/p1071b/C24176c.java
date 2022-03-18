package com.larksuite.component.dybrid.h5api.p1071b;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Set;

/* renamed from: com.larksuite.component.dybrid.h5api.b.c */
public class C24176c {
    /* renamed from: a */
    public static Set<String> m88306a(Uri uri) {
        if (uri == null || uri.isOpaque()) {
            return null;
        }
        return uri.getQueryParameterNames();
    }

    /* renamed from: a */
    public static Uri m88304a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Uri.parse(str);
        } catch (Exception e) {
            C24174b.m88297a("UrlHelper", "parse url exception.", e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m88305a(Uri uri, String str, String str2) {
        if (uri == null) {
            return str2;
        }
        String str3 = null;
        try {
            str3 = C24177d.m88307a(uri, str);
        } catch (Exception unused) {
        }
        return TextUtils.isEmpty(str3) ? str2 : str3;
    }
}
