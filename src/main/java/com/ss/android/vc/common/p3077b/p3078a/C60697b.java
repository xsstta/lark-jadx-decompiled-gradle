package com.ss.android.vc.common.p3077b.p3078a;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.vc.common.b.a.b */
public class C60697b {

    /* renamed from: a */
    public String f151825a;

    /* renamed from: b */
    public String f151826b;

    /* renamed from: c */
    public String f151827c;

    /* renamed from: d */
    public String f151828d;

    /* renamed from: e */
    public String f151829e;

    /* renamed from: f */
    public String f151830f;

    /* renamed from: g */
    public Map<String, String> f151831g;

    /* renamed from: com.ss.android.vc.common.b.a.b$a */
    public static class C60699a {

        /* renamed from: a */
        private C60697b f151832a = new C60697b();

        /* renamed from: a */
        public C60697b mo208266a() {
            return this.f151832a;
        }

        /* renamed from: a */
        public C60699a mo208265a(String str) {
            this.f151832a.f151825a = str;
            return this;
        }

        /* renamed from: b */
        public C60699a mo208267b(String str) {
            this.f151832a.f151826b = str;
            return this;
        }

        /* renamed from: c */
        public C60699a mo208268c(String str) {
            this.f151832a.f151827c = str;
            return this;
        }

        /* renamed from: d */
        public C60699a mo208269d(String str) {
            this.f151832a.f151828d = str;
            return this;
        }

        /* renamed from: e */
        public C60699a mo208270e(String str) {
            this.f151832a.f151829e = str;
            return this;
        }

        /* renamed from: f */
        public C60699a mo208271f(String str) {
            this.f151832a.f151830f = str;
            return this;
        }
    }

    private C60697b() {
        this.f151825a = "";
        this.f151826b = "";
        this.f151827c = "";
        this.f151828d = "";
        this.f151829e = "";
        this.f151830f = "";
    }

    /* renamed from: a */
    public Map<String, String> mo208264a() {
        HashMap hashMap = new HashMap();
        hashMap.put("from", this.f151825a);
        hashMap.put("to", this.f151826b);
        hashMap.put("conference_id", this.f151827c);
        hashMap.put("log_content", this.f151828d);
        hashMap.put("action_name", this.f151829e);
        hashMap.put("log_level", this.f151830f);
        Map<String, String> map = this.f151831g;
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }
}
