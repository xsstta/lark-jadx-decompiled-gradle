package com.ss.android.vc.common.p3083e;

import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.vc.common.e.af */
public class C60742af {

    /* renamed from: com.ss.android.vc.common.e.af$a */
    public interface AbstractC60743a<T> extends AbstractC60744b<T, T> {
    }

    /* renamed from: com.ss.android.vc.common.e.af$b */
    public interface AbstractC60744b<T1, T2> {
        boolean equals(T1 t1, T2 t2);
    }

    /* renamed from: a */
    private static <T> AbstractC60743a<T> m236057a(AbstractC60743a<T> aVar) {
        if (aVar == null) {
            return $$Lambda$af$BghKDW9cboXap4cGcmgJoNHE5k0.INSTANCE;
        }
        return aVar;
    }

    /* renamed from: a */
    public static boolean m236059a(Collection<?> collection) {
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final <T> boolean m236060a(List<T> list, List<T> list2) {
        return m236061a((List) list, (List) list2, (AbstractC60743a) null);
    }

    /* renamed from: b */
    public static <T> int m236062b(List<T> list, T t, AbstractC60743a<T> aVar) {
        int a = m236056a((List) list, (Object) t, (AbstractC60743a) aVar);
        if (a < 0) {
            return -1;
        }
        list.remove(a);
        list.add(a, t);
        return a;
    }

    /* renamed from: a */
    public static <T> int m236056a(List<T> list, T t, AbstractC60743a<T> aVar) {
        AbstractC60743a a = m236057a(aVar);
        int i = 0;
        for (T t2 : list) {
            if (a.equals(t2, t)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    public static final <T> boolean m236061a(List<T> list, List<T> list2, AbstractC60743a<T> aVar) {
        int i;
        int i2;
        boolean z;
        int i3 = 0;
        if (list == null) {
            i = 0;
        } else {
            i = list.size();
        }
        if (list2 == null) {
            i2 = 0;
        } else {
            i2 = list2.size();
        }
        if (i != i2) {
            return false;
        }
        if (list == null || i <= 0) {
            return true;
        }
        if (aVar != null) {
            z = false;
            while (i3 < list.size() && (z = aVar.equals(list.get(i3), list2.get(i3)))) {
                i3++;
            }
        } else {
            z = false;
            for (int i4 = 0; i4 < list.size(); i4++) {
                if (list.get(i4) != null) {
                    z = list.get(i4).equals(list2.get(i4));
                    if (!z) {
                        break;
                    }
                } else if (list2.get(i4) != null) {
                    return false;
                } else {
                    z = true;
                }
            }
        }
        return z;
    }
}
