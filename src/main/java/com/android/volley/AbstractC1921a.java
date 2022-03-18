package com.android.volley;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.android.volley.a */
public interface AbstractC1921a {
    /* renamed from: a */
    C1922a mo9780a(String str);

    /* renamed from: a */
    void mo9781a();

    /* renamed from: a */
    void mo9782a(String str, C1922a aVar);

    /* renamed from: com.android.volley.a$a */
    public static class C1922a {

        /* renamed from: a */
        public byte[] f6561a;

        /* renamed from: b */
        public String f6562b;

        /* renamed from: c */
        public long f6563c;

        /* renamed from: d */
        public long f6564d;

        /* renamed from: e */
        public long f6565e;

        /* renamed from: f */
        public long f6566f;

        /* renamed from: g */
        public Map<String, String> f6567g = Collections.emptyMap();

        /* renamed from: h */
        public List<C1930e> f6568h;

        /* renamed from: a */
        public boolean mo9783a() {
            if (this.f6565e < System.currentTimeMillis()) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public boolean mo9784b() {
            if (this.f6566f < System.currentTimeMillis()) {
                return true;
            }
            return false;
        }
    }
}
