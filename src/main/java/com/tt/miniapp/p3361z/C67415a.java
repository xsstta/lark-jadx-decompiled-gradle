package com.tt.miniapp.p3361z;

import android.content.Context;
import android.net.Uri;
import com.tt.miniapphost.util.AppbrandUtil;

/* renamed from: com.tt.miniapp.z.a */
public class C67415a {
    /* renamed from: a */
    public static String m262297a(Context context, String str) {
        return m262296a(context, Uri.parse(str));
    }

    /* renamed from: a */
    public static String m262296a(Context context, Uri uri) {
        if (!"ttoffline".equals(uri.getScheme())) {
            return "";
        }
        String replace = uri.toString().replace("ttoffline:/", "");
        return Uri.fromFile(AppbrandUtil.getOfflineZipDir(context)).toString() + replace;
    }
}
