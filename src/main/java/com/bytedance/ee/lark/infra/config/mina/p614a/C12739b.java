package com.bytedance.ee.lark.infra.config.mina.p614a;

import com.bytedance.ee.lark.infra.config.mina.C12740b;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.bytedance.ee.lark.infra.config.mina.a.b */
public class C12739b {

    /* renamed from: a */
    public static volatile C12740b f34104a;

    /* renamed from: b */
    private static final ConcurrentLinkedQueue<Object> f34105b = new ConcurrentLinkedQueue<>();

    /* renamed from: a */
    public static synchronized void m52731a(C12740b bVar) {
        synchronized (C12739b.class) {
            if (f34104a == null) {
                f34104a = bVar;
            } else {
                throw new IllegalArgumentException("Settings 只能初始化一次");
            }
        }
    }
}
