package com.huawei.hms.site;

/* renamed from: com.huawei.hms.site.a */
public class C23738a {
    /* renamed from: a */
    public static StringBuilder m86922a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    /* renamed from: a */
    public static void m86923a(Exception exc, StringBuilder sb, String str, Throwable th, boolean z) {
        sb.append(exc.getMessage());
        C23761m.m86934a(str, sb.toString(), th, z);
    }
}
