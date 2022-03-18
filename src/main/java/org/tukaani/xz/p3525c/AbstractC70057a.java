package org.tukaani.xz.p3525c;

import com.huawei.hms.feature.dynamic.DynamicModule;

/* renamed from: org.tukaani.xz.c.a */
abstract class AbstractC70057a {

    /* renamed from: a */
    final int f175083a;

    /* renamed from: b */
    final byte[] f175084b = new byte[DynamicModule.f58006b];

    /* renamed from: c */
    int f175085c;

    AbstractC70057a(int i) {
        if (i < 1 || i > 256) {
            throw new IllegalArgumentException();
        }
        this.f175083a = i;
    }
}
