package org.apache.commons.compress.p3493a;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: org.apache.commons.compress.a.h */
public class C69754h {
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Collection<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static <T> boolean m267726a(Collection<T> collection, Iterator<? extends T> it) {
        Objects.requireNonNull(collection);
        Objects.requireNonNull(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }
}
