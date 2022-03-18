package com.p943f.p944a;

import java.util.Collection;

/* access modifiers changed from: package-private */
/* renamed from: com.f.a.f */
public class C20971f {
    /* renamed from: a */
    static int m76383a(Collection<? extends AbstractC20966c> collection) {
        int i = 0;
        for (AbstractC20966c cVar : collection) {
            i += cVar.mo71008u();
        }
        return i;
    }

    /* renamed from: a */
    static AbstractC20975h m76384a(Collection<? extends AbstractC20966c> collection, int i) {
        int i2 = 0;
        for (AbstractC20966c cVar : collection) {
            int u = cVar.mo71008u() + i2;
            if (u > i) {
                return cVar.mo71004a(i - i2);
            }
            i2 = u;
        }
        throw new IndexOutOfBoundsException("Wanted item at " + i + " but there are only " + i2 + " items");
    }
}
