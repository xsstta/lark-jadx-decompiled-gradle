package com.ss.android.lark.passport.infra.util;

import android.util.SparseArray;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.ss.android.lark.passport.infra.util.h */
public class C49193h {
    /* renamed from: b */
    public static boolean m193950b(Collection collection) {
        return !m193948a(collection);
    }

    /* renamed from: a */
    public static boolean m193948a(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m193949a(Map map) {
        if (map == null || map.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static <T> void m193947a(SparseArray<T> sparseArray, SparseArray<T> sparseArray2) {
        if (!(sparseArray == null || sparseArray2 == null)) {
            for (int i = 0; i < sparseArray.size(); i++) {
                sparseArray2.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
            }
        }
    }
}
