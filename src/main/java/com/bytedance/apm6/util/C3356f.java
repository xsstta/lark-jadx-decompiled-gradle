package com.bytedance.apm6.util;

import android.util.Pair;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.apm6.util.f */
public class C3356f {
    /* renamed from: a */
    public static boolean m13964a(List<?> list) {
        if (list == null || list.size() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String[] m13965a(Set<String> set) {
        String[] strArr = new String[set.size()];
        int i = 0;
        for (String str : set) {
            strArr[i] = str;
            i++;
        }
        return strArr;
    }

    /* renamed from: b */
    public static Map<String, String> m13966b(List<Pair<String, String>> list) {
        if (m13964a(list)) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (Pair<String, String> pair : list) {
            if (!(pair == null || pair.first == null)) {
                hashMap.put(pair.first, pair.second);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static String m13962a(Collection collection, String str) {
        if (collection == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Object obj : collection) {
            if (z) {
                z = false;
            } else {
                sb.append(str);
            }
            sb.append(obj.toString());
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m13963a(Object[] objArr, String str) {
        if (objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Object obj : objArr) {
            if (z) {
                z = false;
            } else {
                sb.append(str);
            }
            sb.append(obj.toString());
        }
        return sb.toString();
    }
}
