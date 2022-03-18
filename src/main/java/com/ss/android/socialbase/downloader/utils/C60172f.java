package com.ss.android.socialbase.downloader.utils;

/* renamed from: com.ss.android.socialbase.downloader.utils.f */
public class C60172f {
    /* renamed from: a */
    public static StringBuilder m233885a(StringBuilder sb, String str) {
        sb.append('\"');
        sb.append(str);
        sb.append('\"');
        return sb;
    }

    /* renamed from: a */
    public static StringBuilder m233884a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 < i - 1) {
                sb.append("?,");
            } else {
                sb.append('?');
            }
        }
        return sb;
    }

    /* renamed from: b */
    public static StringBuilder m233889b(StringBuilder sb, String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            m233885a(sb, strArr[i]).append("=?");
            if (i < strArr.length - 1) {
                sb.append(',');
            }
        }
        return sb;
    }

    /* renamed from: a */
    public static String m233882a(String str, String[] strArr) {
        String str2 = '\"' + str + '\"';
        StringBuilder sb = new StringBuilder("DELETE FROM ");
        sb.append(str2);
        if (strArr != null && strArr.length > 0) {
            sb.append(" WHERE ");
            m233887a(sb, str2, strArr);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static StringBuilder m233888a(StringBuilder sb, String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            sb.append('\"');
            sb.append(strArr[i]);
            sb.append('\"');
            if (i < length - 1) {
                sb.append(',');
            }
        }
        return sb;
    }

    /* renamed from: a */
    public static String m233881a(String str, String str2, String[] strArr) {
        StringBuilder sb = new StringBuilder(str);
        sb.append('\"');
        sb.append(str2);
        sb.append('\"');
        sb.append(" (");
        m233888a(sb, strArr);
        sb.append(") VALUES (");
        m233884a(sb, strArr.length);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: a */
    public static String m233883a(String str, String[] strArr, String[] strArr2) {
        String str2 = '\"' + str + '\"';
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(str2);
        sb.append(" SET ");
        m233889b(sb, strArr);
        if (strArr2 != null && strArr2.length > 0) {
            sb.append(" WHERE ");
            m233887a(sb, str2, strArr2);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static StringBuilder m233886a(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(".\"");
        sb.append(str2);
        sb.append('\"');
        return sb;
    }

    /* renamed from: a */
    public static StringBuilder m233887a(StringBuilder sb, String str, String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            m233886a(sb, str, strArr[i]).append("=?");
            if (i < strArr.length - 1) {
                sb.append(',');
            }
        }
        return sb;
    }
}
