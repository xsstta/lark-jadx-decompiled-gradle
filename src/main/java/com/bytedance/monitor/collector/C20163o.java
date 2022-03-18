package com.bytedance.monitor.collector;

import android.text.TextUtils;

/* renamed from: com.bytedance.monitor.collector.o */
public class C20163o {

    /* renamed from: a */
    public static boolean f49270a;

    /* renamed from: a */
    public static String m73582a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            return "Invalid Stack\n";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            i++;
            sb.append("\tat " + stackTraceElement.getClassName());
            sb.append(".");
            sb.append(stackTraceElement.getMethodName());
            sb.append("(");
            sb.append(stackTraceElement.getFileName());
            sb.append(":");
            sb.append(stackTraceElement.getLineNumber());
            sb.append(")\n");
            if (i > 40) {
                break;
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m73583b(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            return "Invalid Stack\n";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            i++;
            sb.append("\\tat " + stackTraceElement.getClassName());
            sb.append(".");
            sb.append(stackTraceElement.getMethodName());
            sb.append("(");
            sb.append(stackTraceElement.getFileName());
            sb.append(":");
            sb.append(stackTraceElement.getLineNumber());
            sb.append(")\\n");
            if (i > 40) {
                break;
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m73581a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "unknown message";
        }
        try {
            String[] split = str.split(":");
            if (split.length == 2) {
                str2 = split[1];
            } else {
                str2 = "";
            }
            if (str.contains("{") && str.contains("}")) {
                String str3 = str.split("\\{")[0];
                try {
                    str = str3 + str.split("\\}")[1];
                } catch (Throwable unused) {
                    return str3;
                }
            }
            if (str.contains("@")) {
                String[] split2 = str.split("@");
                if (split2.length > 1) {
                    str = split2[0];
                }
            }
            if (str.contains("(") && str.contains(")") && !str.endsWith(" null")) {
                String[] split3 = str.split("\\(");
                if (split3.length > 1) {
                    str = split3[1];
                }
                str = str.replace(")", "");
            }
            if (str.startsWith(" ")) {
                str = str.replace(" ", "");
            }
            return str + str2;
        } catch (Throwable unused2) {
            return str;
        }
    }
}
