package com.bytedance.geckox.policy.v4;

import com.bytedance.geckox.C14218d;
import com.bytedance.geckox.C14264e;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.geckox.p769e.AbstractC14267a;
import com.bytedance.geckox.policy.v4.model.V4RequestModel;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.geckox.policy.v4.a */
public class C14321a {

    /* renamed from: f */
    private static C14321a f37627f;

    /* renamed from: a */
    public Map<String, V4RequestModel> f37628a = new ConcurrentHashMap();

    /* renamed from: b */
    public Map<String, String> f37629b;

    /* renamed from: c */
    public C14218d f37630c;

    /* renamed from: d */
    public Map<AbstractC14267a, Set<String>> f37631d = new ConcurrentHashMap();

    /* renamed from: e */
    public AtomicBoolean f37632e = new AtomicBoolean(false);

    /* renamed from: g */
    private AtomicInteger f37633g = new AtomicInteger(0);

    /* renamed from: h */
    private AtomicBoolean f37634h = new AtomicBoolean(false);

    /* renamed from: a */
    public static C14321a m57717a() {
        if (f37627f == null) {
            synchronized (C14321a.class) {
                if (f37627f == null) {
                    f37627f = new C14321a();
                }
            }
        }
        return f37627f;
    }

    private C14321a() {
    }

    /* renamed from: a */
    public void mo52394a(C14218d dVar, Map<String, String> map) {
        if (this.f37630c == null) {
            this.f37629b = map;
            this.f37630c = dVar;
        }
        GeckoGlobalConfig h = C14264e.m57551a().mo52233h();
        if (h != null) {
            this.f37630c.mo52134a(h.mo52036d());
            this.f37630c.mo52135a(h.mo52034b());
        }
    }
}
