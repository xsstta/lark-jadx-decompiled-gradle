package com.bytedance.apm.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.bytedance.apm.util.i */
public class C3122i {

    /* renamed from: com.bytedance.apm.util.i$a */
    public interface AbstractC3123a<A, B> {
        /* renamed from: a */
        boolean mo12907a(A a, B b);
    }

    /* renamed from: a */
    public static boolean m13009a(List<?> list) {
        if (list == null || list.size() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String[] m13010a(Set<String> set) {
        String[] strArr = new String[set.size()];
        int i = 0;
        for (String str : set) {
            strArr[i] = str;
            i++;
        }
        return strArr;
    }

    /* renamed from: a */
    public static String m13006a(Collection collection, String str) {
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
    public static String m13007a(Object[] objArr, String str) {
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

    /* renamed from: a */
    public static <L, O> boolean m13008a(Collection<L> collection, O o, AbstractC3123a<? super L, O> aVar) {
        Iterator<L> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (aVar.mo12907a(it.next(), o)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }
}
