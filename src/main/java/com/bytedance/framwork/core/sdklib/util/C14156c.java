package com.bytedance.framwork.core.sdklib.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.framwork.core.sdklib.util.c */
public class C14156c {

    /* renamed from: com.bytedance.framwork.core.sdklib.util.c$a */
    public interface AbstractC14157a<A, B> {
        /* renamed from: a */
        boolean mo51953a(A a, B b);
    }

    /* renamed from: a */
    public static boolean m57242a(List<?> list) {
        if (list == null || list.size() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static <L, O> boolean m57241a(Collection<L> collection, O o, AbstractC14157a<? super L, O> aVar) {
        Iterator<L> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (aVar.mo51953a(it.next(), o)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }
}
