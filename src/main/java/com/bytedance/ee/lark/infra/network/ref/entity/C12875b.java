package com.bytedance.ee.lark.infra.network.ref.entity;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.ee.lark.infra.network.ref.entity.b */
public class C12875b {

    /* renamed from: a */
    private static final AtomicInteger f34362a = new AtomicInteger(0);

    /* renamed from: a */
    public static String m53136a() {
        return UUID.randomUUID().toString() + f34362a.incrementAndGet();
    }
}
