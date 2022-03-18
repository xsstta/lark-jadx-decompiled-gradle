package com.bytedance.ee.bear.drive.common;

import android.text.TextUtils;
import com.bytedance.ee.bear.drive.mimetype.AbstractC7095c;

/* renamed from: com.bytedance.ee.bear.drive.common.d */
public final class C6892d {
    /* renamed from: f */
    public static boolean m27248f(String str) {
        return "csv".equalsIgnoreCase(str);
    }

    /* renamed from: j */
    public static boolean m27252j(String str) {
        return "ogg".equalsIgnoreCase(str);
    }

    /* renamed from: l */
    public static boolean m27254l(String str) {
        return "pdf".equalsIgnoreCase(str);
    }

    /* renamed from: c */
    public static boolean m27245c(String str) {
        if (m27246d(str) || m27247e(str) || m27248f(str) || m27249g(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m27244b(String str) {
        if ("txt".equalsIgnoreCase(str) || "log".equalsIgnoreCase(str) || "csv".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m27246d(String str) {
        if ("doc".equalsIgnoreCase(str) || "docx".equalsIgnoreCase(str) || "docm".equalsIgnoreCase(str) || "dot".equalsIgnoreCase(str) || "dotx".equalsIgnoreCase(str) || "dotm".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m27247e(String str) {
        if ("xls".equalsIgnoreCase(str) || "xlsx".equalsIgnoreCase(str) || "xlsm".equalsIgnoreCase(str) || "xlt".equalsIgnoreCase(str) || "xltx".equalsIgnoreCase(str) || "xltm".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m27253k(String str) {
        if ("zip".equalsIgnoreCase(str) || "rar".equalsIgnoreCase(str) || "tar".equalsIgnoreCase(str) || "tar.gz".equalsIgnoreCase(str) || "tar.bz2".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m27249g(String str) {
        if ("ppt".equalsIgnoreCase(str) || "pptx".equalsIgnoreCase(str) || "pptm".equalsIgnoreCase(str) || "pps".equalsIgnoreCase(str) || "ppsx".equalsIgnoreCase(str) || "ppsm".equalsIgnoreCase(str) || "pot".equalsIgnoreCase(str) || "potx".equalsIgnoreCase(str) || "potm".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m27250h(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if ("png".equalsIgnoreCase(str) || "jpe".equalsIgnoreCase(str) || "jpg".equalsIgnoreCase(str) || "jpeg".equalsIgnoreCase(str) || "bmp".equalsIgnoreCase(str) || "wbmp".equalsIgnoreCase(str) || "gif".equalsIgnoreCase(str) || "heic".equalsIgnoreCase(str) || "webp".equalsIgnoreCase(str) || "ico".equalsIgnoreCase(str) || "heif".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m27251i(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if ("MP4".equalsIgnoreCase(str) || "MKV".equalsIgnoreCase(str) || "M4V".equalsIgnoreCase(str) || "MPG".equalsIgnoreCase(str) || "WEBM".equalsIgnoreCase(str) || "MOV".equalsIgnoreCase(str) || "3GP".equalsIgnoreCase(str) || "3G2".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String m27241a(String str) {
        if (str == null) {
            str = "";
        }
        str.hashCode();
        char c = 65535;
        String str2 = "message";
        switch (str.hashCode()) {
            case -907207068:
                if (str.equals("tab_link")) {
                    c = 0;
                    break;
                }
                break;
            case 136691587:
                if (str.equals("thirdparty_attachment")) {
                    c = 1;
                    break;
                }
                break;
            case 873376034:
                if (str.equals("docs_feed")) {
                    c = 2;
                    break;
                }
                break;
            case 926934164:
                if (str.equals("history")) {
                    c = 3;
                    break;
                }
                break;
            case 954925063:
                if (str.equals(str2)) {
                    c = 4;
                    break;
                }
                break;
            case 1666900169:
                if (str.equals("docs_attach")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                str2 = "doc_mention";
                break;
            case 1:
                str2 = "thirdparty_attachment";
                break;
            case 2:
                str2 = "docs_feed";
                break;
            case 3:
                str2 = "history";
                break;
            case 4:
                break;
            case 5:
                str2 = "doc_embed";
                break;
            default:
                str2 = str;
                break;
        }
        if (TextUtils.isEmpty(str)) {
            return "unknown";
        }
        return str2;
    }

    /* renamed from: a */
    public static boolean m27242a(AbstractC7095c cVar, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || cVar.mo27720i(str, null) || !cVar.mo27720i(str2, null)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m27243b(AbstractC7095c cVar, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str) || !cVar.mo27721j(str, null) || !cVar.mo27720i(str2, null)) {
            return false;
        }
        return true;
    }
}
