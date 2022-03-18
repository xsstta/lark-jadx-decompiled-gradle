package com.bytedance.ee.webapp;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.webapp.h */
public class C13805h {

    /* renamed from: a */
    private Map<String, String> f36056a;

    /* renamed from: b */
    private Map<AbstractC13762b, AbstractC13762b> f36057b;

    /* renamed from: com.bytedance.ee.webapp.h$a */
    private static class C13807a {

        /* renamed from: a */
        public static final C13805h f36058a = new C13805h();
    }

    /* renamed from: a */
    public static C13805h m55929a() {
        return C13807a.f36058a;
    }

    /* renamed from: b */
    public Map<AbstractC13762b, AbstractC13762b> mo50869b() {
        return this.f36057b;
    }

    /* renamed from: c */
    public Map<String, String> mo50870c() {
        return this.f36056a;
    }

    private C13805h() {
        this.f36056a = new HashMap();
        this.f36057b = new HashMap();
    }

    /* renamed from: a */
    public void mo50867a(AbstractC13762b bVar) {
        this.f36057b.put(bVar, bVar);
    }

    /* renamed from: a */
    public void mo50868a(String str, String str2) {
        this.f36056a.put(str, str2);
    }
}
