package com.ss.android.agilelogger.formatter.p1255a;

/* renamed from: com.ss.android.agilelogger.formatter.a.b */
public class C27512b implements AbstractC27511a {
    /* renamed from: a */
    private static String m100440a(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 10);
        String[] split = str.split("\n");
        int length = split.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append("\n");
            }
            String str2 = split[i];
            sb.append((char) 9553);
            sb.append(str2);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public String mo98131a(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        String[] strArr2 = new String[strArr.length];
        int i = 0;
        for (String str : strArr) {
            if (str != null) {
                strArr2[i] = str;
                i++;
            }
        }
        if (i == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("╔═══════════════════════════════════════════════════════════════════════════════════════════════════");
        sb.append("\n");
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(m100440a(strArr2[i2]));
            if (i2 != i - 1) {
                sb.append("\n");
                sb.append("╟───────────────────────────────────────────────────────────────────────────────────────────────────");
                sb.append("\n");
            } else {
                sb.append("\n");
                sb.append("╚═══════════════════════════════════════════════════════════════════════════════════════════════════");
            }
        }
        return sb.toString();
    }
}
