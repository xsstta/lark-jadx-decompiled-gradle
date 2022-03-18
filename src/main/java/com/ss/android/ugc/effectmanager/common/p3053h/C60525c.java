package com.ss.android.ugc.effectmanager.common.p3053h;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.effectmanager.common.h.c */
public class C60525c {
    /* renamed from: a */
    public static <T> boolean m235234a(List<T> list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m235235a(Map map) {
        if (map == null || map.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m235237b(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getClass().isArray() || (obj instanceof Collection)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static List<?> m235233a(Object obj) {
        ArrayList arrayList = new ArrayList();
        if (obj.getClass().isArray()) {
            return Arrays.asList((Object[]) obj);
        }
        if (obj instanceof Collection) {
            return new ArrayList((Collection) obj);
        }
        return arrayList;
    }

    /* renamed from: b */
    public static List<String> m235236b(List<?> list) {
        String str;
        if (m235234a((List) list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            if (obj != null) {
                str = obj.toString();
            } else {
                str = "";
            }
            arrayList.add(str);
        }
        return arrayList;
    }
}
