package com.bytedance.frameworks.core.thread;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.bytedance.frameworks.core.thread.a */
public class C14104a {

    /* renamed from: a */
    private static volatile C14104a f37058a;

    /* renamed from: b */
    private static volatile ThreadPoolExecutor f37059b;

    /* renamed from: c */
    private static volatile ThreadPoolExecutor f37060c;

    /* renamed from: d */
    private static volatile ScheduledExecutorService f37061d;

    /* renamed from: e */
    private static final ConcurrentHashMap<String, AbstractRunnableC14106c> f37062e = new ConcurrentHashMap<>();

    /* renamed from: f */
    private static final ConcurrentHashMap<String, AbstractRunnableC14106c> f37063f = new ConcurrentHashMap<>();

    private C14104a() {
        f37059b = C14108e.m57086a();
        f37060c = C14108e.m57087b();
        f37061d = C14108e.m57088c();
    }

    /* renamed from: a */
    public static C14104a m57077a() {
        if (f37058a == null) {
            synchronized (C14104a.class) {
                if (f37058a == null) {
                    f37058a = new C14104a();
                }
            }
        }
        return f37058a;
    }

    /* renamed from: b */
    public void mo51847b(AbstractRunnableC14106c cVar) {
        if (cVar == null) {
            throw new IllegalArgumentException("param is not be null");
        } else if (f37060c != null) {
            f37060c.execute(cVar);
        }
    }

    /* renamed from: a */
    public void mo51846a(AbstractRunnableC14106c cVar) {
        if (cVar == null) {
            throw new IllegalArgumentException("param is not be null");
        } else if (f37059b != null) {
            f37059b.execute(cVar);
        }
    }
}
