package com.huawei.hms.hatool;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.huawei.hms.hatool.i */
public final class C23606i {

    /* renamed from: b */
    public static Map<String, C23610m> f58214b = new HashMap();

    /* renamed from: c */
    public static C23606i f58215c;

    /* renamed from: a */
    public C23609l f58216a = new C23609l();

    /* renamed from: c */
    public static C23606i m85750c() {
        if (f58215c == null) {
            m85751d();
        }
        return f58215c;
    }

    /* renamed from: d */
    public static synchronized void m85751d() {
        synchronized (C23606i.class) {
            if (f58215c == null) {
                f58215c = new C23606i();
            }
        }
    }

    /* renamed from: a */
    public C23610m mo83022a(String str) {
        return f58214b.get(str);
    }

    /* renamed from: a */
    public Set<String> mo83023a() {
        return f58214b.keySet();
    }

    /* renamed from: a */
    public void mo83024a(String str, C23610m mVar) {
        f58214b.put(str, mVar);
    }

    /* renamed from: b */
    public C23609l mo83025b() {
        return this.f58216a;
    }
}
