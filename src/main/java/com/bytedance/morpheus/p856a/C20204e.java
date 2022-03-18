package com.bytedance.morpheus.p856a;

import java.util.HashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.morpheus.a.e */
public class C20204e {

    /* renamed from: c */
    private static volatile C20204e f49343c;

    /* renamed from: a */
    private final Map<String, String> f49344a = new HashMap();

    /* renamed from: b */
    private final Map<String, String> f49345b = new HashMap();

    private C20204e() {
    }

    /* renamed from: a */
    public static C20204e m73734a() {
        if (f49343c == null) {
            synchronized (C20204e.class) {
                if (f49343c == null) {
                    f49343c = new C20204e();
                }
            }
        }
        return f49343c;
    }

    /* renamed from: a */
    public String mo68372a(String str) {
        String str2 = this.f49344a.get(str);
        return str2 == null ? str : str2;
    }

    /* renamed from: b */
    public String mo68374b(String str) {
        String str2 = this.f49345b.get(str);
        return str2 == null ? str : str2;
    }

    /* renamed from: a */
    public void mo68373a(String str, String str2) {
        if (this.f49344a.containsKey(str)) {
            throw new IllegalArgumentException("duplicate config for package name " + str);
        } else if (!this.f49345b.containsKey(str2)) {
            this.f49344a.put(str, str2);
            this.f49345b.put(str2, str);
        } else {
            throw new IllegalArgumentException("duplicate config for aab name " + str2);
        }
    }
}
