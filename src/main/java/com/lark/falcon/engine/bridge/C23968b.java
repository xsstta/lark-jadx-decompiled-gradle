package com.lark.falcon.engine.bridge;

import androidx.core.util.Pools;

/* renamed from: com.lark.falcon.engine.bridge.b */
public class C23968b implements AbstractC23967a {

    /* renamed from: a */
    private static final Pools.SimplePool<C23968b> f59294a = new Pools.SimplePool<>(10);

    /* renamed from: b */
    private ReadableArray f59295b;

    /* renamed from: c */
    private int f59296c = -1;

    private C23968b() {
    }

    @Override // com.lark.falcon.engine.bridge.AbstractC23967a
    /* renamed from: a */
    public ReadableType mo86072a() {
        ReadableArray readableArray = this.f59295b;
        if (readableArray != null) {
            return readableArray.getType(this.f59296c);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    /* renamed from: a */
    public static C23968b m87614a(ReadableArray readableArray, int i) {
        C23968b acquire = f59294a.acquire();
        if (acquire == null) {
            acquire = new C23968b();
        }
        acquire.f59295b = readableArray;
        acquire.f59296c = i;
        return acquire;
    }
}
