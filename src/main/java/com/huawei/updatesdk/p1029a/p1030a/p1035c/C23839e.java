package com.huawei.updatesdk.p1029a.p1030a.p1035c;

import java.util.List;

/* renamed from: com.huawei.updatesdk.a.a.c.e */
public class C23839e {
    /* renamed from: a */
    private static String m87130a(String str) {
        return str == null ? "" : str;
    }

    /* renamed from: a */
    public static String m87131a(List<String> list, String str) {
        return m87132a(list, str, (String) null, (String) null);
    }

    /* renamed from: a */
    public static String m87132a(List<String> list, String str, String str2, String str3) {
        return (list == null || list.isEmpty()) ? "" : m87134a((String[]) list.toArray(new String[0]), str, str2, str3);
    }

    /* renamed from: a */
    public static String m87133a(String[] strArr, String str) {
        return m87134a(strArr, str, (String) null, (String) null);
    }

    /* renamed from: a */
    public static String m87134a(String[] strArr, String str, String str2, String str3) {
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        String a = m87130a(str);
        String a2 = m87130a(str2);
        String a3 = m87130a(str3);
        StringBuilder sb = new StringBuilder();
        sb.append(a2);
        sb.append(strArr[0]);
        sb.append(a3);
        for (int i = 1; i < strArr.length; i++) {
            sb.append(a);
            sb.append(a2);
            sb.append(strArr[i]);
            sb.append(a3);
        }
        return sb.toString();
    }
}
