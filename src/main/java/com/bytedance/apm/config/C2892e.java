package com.bytedance.apm.config;

import org.json.JSONObject;

/* renamed from: com.bytedance.apm.config.e */
public class C2892e {

    /* renamed from: a */
    private String f9336a;

    /* renamed from: b */
    private int f9337b;

    /* renamed from: c */
    private JSONObject f9338c;

    /* renamed from: d */
    private JSONObject f9339d;

    /* renamed from: e */
    private JSONObject f9340e;

    /* renamed from: f */
    private boolean f9341f;

    /* renamed from: com.bytedance.apm.config.e$a */
    public static final class C2894a {

        /* renamed from: a */
        public String f9342a;

        /* renamed from: b */
        public int f9343b;

        /* renamed from: c */
        public JSONObject f9344c;

        /* renamed from: d */
        public JSONObject f9345d;

        /* renamed from: e */
        public JSONObject f9346e;

        /* renamed from: f */
        public boolean f9347f;

        private C2894a() {
        }

        /* renamed from: a */
        public C2892e mo12481a() {
            return new C2892e(this);
        }

        /* renamed from: a */
        public C2894a mo12477a(int i) {
            this.f9343b = i;
            return this;
        }

        /* renamed from: b */
        public C2894a mo12482b(JSONObject jSONObject) {
            this.f9345d = jSONObject;
            return this;
        }

        /* renamed from: c */
        public C2894a mo12483c(JSONObject jSONObject) {
            this.f9346e = jSONObject;
            return this;
        }

        /* renamed from: a */
        public C2894a mo12478a(String str) {
            this.f9342a = str;
            return this;
        }

        /* renamed from: a */
        public C2894a mo12479a(JSONObject jSONObject) {
            this.f9344c = jSONObject;
            return this;
        }

        /* renamed from: a */
        public C2894a mo12480a(boolean z) {
            this.f9347f = z;
            return this;
        }
    }

    /* renamed from: a */
    public String mo12471a() {
        return this.f9336a;
    }

    /* renamed from: b */
    public JSONObject mo12472b() {
        return this.f9338c;
    }

    /* renamed from: c */
    public JSONObject mo12473c() {
        return this.f9339d;
    }

    /* renamed from: d */
    public int mo12474d() {
        return this.f9337b;
    }

    /* renamed from: e */
    public JSONObject mo12475e() {
        return this.f9340e;
    }

    /* renamed from: f */
    public boolean mo12476f() {
        return this.f9341f;
    }

    /* renamed from: g */
    public static C2894a m12235g() {
        return new C2894a();
    }

    public C2892e(C2894a aVar) {
        this.f9336a = aVar.f9342a;
        this.f9337b = aVar.f9343b;
        this.f9338c = aVar.f9344c;
        this.f9339d = aVar.f9345d;
        this.f9340e = aVar.f9346e;
        this.f9341f = aVar.f9347f;
    }
}
