package com.lark.falcon.engine.bridge;

import androidx.core.util.Pools;

/* renamed from: com.lark.falcon.engine.bridge.c */
public class C23969c implements AbstractC23967a {

    /* renamed from: a */
    private static final Pools.SimplePool<C23969c> f59297a = new Pools.SimplePool<>(10);

    /* renamed from: b */
    private ReadableMap f59298b;

    /* renamed from: c */
    private String f59299c;

    private C23969c() {
    }

    @Override // com.lark.falcon.engine.bridge.AbstractC23967a
    /* renamed from: a */
    public ReadableType mo86072a() {
        String str;
        ReadableMap readableMap = this.f59298b;
        if (readableMap != null && (str = this.f59299c) != null) {
            return readableMap.getType(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    /* renamed from: a */
    public static C23969c m87616a(ReadableMap readableMap, String str) {
        C23969c acquire = f59297a.acquire();
        if (acquire == null) {
            acquire = new C23969c();
        }
        acquire.f59298b = readableMap;
        acquire.f59299c = str;
        return acquire;
    }
}
