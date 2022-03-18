package com.larksuite.framework.utils.p1203a;

import java.util.List;

/* renamed from: com.larksuite.framework.utils.a.a */
public class C26247a {
    /* renamed from: a */
    public static boolean m94981a(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static <T extends AbstractC26248b> boolean m94980a(AbstractC26248b<T> bVar, T t) {
        if (bVar == t) {
            return true;
        }
        if (bVar == null || t == null || bVar.getClass() != t.getClass()) {
            return false;
        }
        return bVar.isItemSame(t);
    }

    /* renamed from: b */
    public static <T extends AbstractC26248b> boolean m94983b(AbstractC26248b<T> bVar, T t) {
        if (bVar == null && t == null) {
            return true;
        }
        if (bVar == null || t == null || bVar.getClass() != t.getClass()) {
            return false;
        }
        return bVar.isContentSame(t);
    }

    /* renamed from: a */
    public static <T extends AbstractC26248b> boolean m94982a(List<T> list, List<T> list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        for (T t : list) {
            boolean z = false;
            for (T t2 : list2) {
                if (m94983b(t, t2)) {
                    z = true;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }
}
