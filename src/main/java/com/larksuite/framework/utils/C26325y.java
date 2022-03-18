package com.larksuite.framework.utils;

/* renamed from: com.larksuite.framework.utils.y */
public class C26325y {
    /* renamed from: a */
    public static boolean m95335a(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m95336b(Object obj, Object obj2) {
        if (obj == null || (obj != obj2 && !obj.equals(obj2))) {
            return false;
        }
        return true;
    }
}
