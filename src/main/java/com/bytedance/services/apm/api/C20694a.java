package com.bytedance.services.apm.api;

import org.json.JSONObject;

/* renamed from: com.bytedance.services.apm.api.a */
public class C20694a {

    /* renamed from: a */
    private String f50657a;

    /* renamed from: b */
    private int f50658b;

    /* renamed from: c */
    private JSONObject f50659c;

    /* renamed from: d */
    private JSONObject f50660d;

    /* renamed from: e */
    private JSONObject f50661e;

    /* renamed from: f */
    private boolean f50662f;

    /* renamed from: com.bytedance.services.apm.api.a$a */
    public static final class C20696a {

        /* renamed from: a */
        public String f50663a;

        /* renamed from: b */
        public int f50664b;

        /* renamed from: c */
        public JSONObject f50665c;

        /* renamed from: d */
        public JSONObject f50666d;

        /* renamed from: e */
        public JSONObject f50667e;

        /* renamed from: f */
        public boolean f50668f;

        private C20696a() {
        }

        /* renamed from: a */
        public C20694a mo69899a() {
            return new C20694a(this);
        }

        /* renamed from: a */
        public C20696a mo69896a(String str) {
            this.f50663a = str;
            return this;
        }

        /* renamed from: a */
        public C20696a mo69897a(JSONObject jSONObject) {
            this.f50665c = jSONObject;
            return this;
        }

        /* renamed from: a */
        public C20696a mo69898a(boolean z) {
            this.f50668f = z;
            return this;
        }
    }

    /* renamed from: a */
    public String mo69890a() {
        return this.f50657a;
    }

    /* renamed from: b */
    public JSONObject mo69891b() {
        return this.f50659c;
    }

    /* renamed from: c */
    public JSONObject mo69892c() {
        return this.f50660d;
    }

    /* renamed from: d */
    public int mo69893d() {
        return this.f50658b;
    }

    /* renamed from: e */
    public JSONObject mo69894e() {
        return this.f50661e;
    }

    /* renamed from: f */
    public boolean mo69895f() {
        return this.f50662f;
    }

    /* renamed from: g */
    public static C20696a m75478g() {
        return new C20696a();
    }

    public C20694a(C20696a aVar) {
        this.f50657a = aVar.f50663a;
        this.f50658b = aVar.f50664b;
        this.f50659c = aVar.f50665c;
        this.f50660d = aVar.f50666d;
        this.f50661e = aVar.f50667e;
        this.f50662f = aVar.f50668f;
    }
}
