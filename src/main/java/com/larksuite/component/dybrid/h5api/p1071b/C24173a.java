package com.larksuite.component.dybrid.h5api.p1071b;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;

/* renamed from: com.larksuite.component.dybrid.h5api.b.a */
public class C24173a {
    /* renamed from: a */
    public static boolean m88287a(File file) {
        if (file == null) {
            return false;
        }
        return file.exists();
    }

    /* renamed from: b */
    public static final boolean m88290b(File file) {
        if (file == null) {
            return false;
        }
        return file.isFile();
    }

    /* renamed from: a */
    public static boolean m88288a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return m88287a(new File(str));
    }

    /* renamed from: c */
    public static String m88291c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "*/*";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(m88289b(str));
        if (TextUtils.isEmpty(mimeTypeFromExtension)) {
            return "*/*";
        }
        return mimeTypeFromExtension;
    }

    /* renamed from: d */
    public static final boolean m88292d(String str) {
        if (!m88288a(str)) {
            return false;
        }
        return m88290b(new File(str));
    }

    /* renamed from: b */
    public static String m88289b(String str) {
        int lastIndexOf;
        if (!TextUtils.isEmpty(str) && (lastIndexOf = str.lastIndexOf(46)) >= 0 && lastIndexOf < str.length() - 1) {
            return str.substring(lastIndexOf + 1);
        }
        return "";
    }

    /* renamed from: e */
    public static final String m88293e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf <= 0 || lastIndexOf >= str.length() - 1) {
            return str;
        }
        return str.substring(lastIndexOf + 1, str.length());
    }
}
