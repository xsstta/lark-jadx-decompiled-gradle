package com.huawei.hms.hatool;

import java.util.HashMap;
import java.util.Map;

public final class e0 {

    /* renamed from: b */
    public static e0 f58192b;

    /* renamed from: a */
    public volatile Map<String, f0> f58193a = new HashMap();

    /* renamed from: a */
    public static e0 m85682a() {
        if (f58192b == null) {
            m85683b();
        }
        return f58192b;
    }

    /* renamed from: b */
    public static synchronized void m85683b() {
        synchronized (e0.class) {
            if (f58192b == null) {
                f58192b = new e0();
            }
        }
    }

    /* renamed from: a */
    public final f0 mo82990a(String str) {
        if (!this.f58193a.containsKey(str)) {
            this.f58193a.put(str, new f0());
        }
        return this.f58193a.get(str);
    }

    /* renamed from: a */
    public f0 mo82991a(String str, long j) {
        f0 a = mo82990a(str);
        a.mo82996a(j);
        return a;
    }
}
