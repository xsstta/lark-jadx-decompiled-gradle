package com.ss.android.lark.appsetting.api.p1371b;

import java.util.Collection;

/* renamed from: com.ss.android.lark.appsetting.api.b.a */
public final class C29218a {
    /* renamed from: a */
    public static String m107472a(Collection<String> collection) {
        if (collection == null || collection.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str : collection) {
            sb.append(str);
            sb.append(" ");
        }
        return sb.toString();
    }
}
