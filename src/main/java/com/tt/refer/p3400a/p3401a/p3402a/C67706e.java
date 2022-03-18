package com.tt.refer.p3400a.p3401a.p3402a;

import org.json.JSONObject;

/* renamed from: com.tt.refer.a.a.a.e */
public class C67706e {

    /* renamed from: a */
    private final boolean f170550a;

    /* renamed from: b */
    private final boolean f170551b;

    /* renamed from: c */
    private final int f170552c;

    /* renamed from: d */
    private final String f170553d;

    /* renamed from: e */
    private final JSONObject f170554e;

    /* renamed from: a */
    public boolean mo235003a() {
        return this.f170550a;
    }

    /* renamed from: b */
    public boolean mo235004b() {
        return this.f170551b;
    }

    /* renamed from: c */
    public int mo235005c() {
        return this.f170552c;
    }

    /* renamed from: d */
    public String mo235006d() {
        return this.f170553d;
    }

    /* renamed from: e */
    public JSONObject mo235007e() {
        return this.f170554e;
    }

    /* renamed from: com.tt.refer.a.a.a.e$a */
    public static class C67708a {

        /* renamed from: a */
        private boolean f170555a;

        /* renamed from: b */
        private boolean f170556b;

        /* renamed from: c */
        private int f170557c;

        /* renamed from: d */
        private String f170558d;

        /* renamed from: e */
        private JSONObject f170559e;

        /* renamed from: a */
        public C67706e mo235009a() {
            return new C67706e(this.f170558d, this.f170559e, this.f170555a, this.f170556b, this.f170557c);
        }

        /* renamed from: a */
        public C67708a mo235008a(boolean z) {
            this.f170556b = z;
            return this;
        }

        private C67708a(String str, JSONObject jSONObject) {
            this.f170558d = str;
            this.f170559e = jSONObject;
        }

        /* renamed from: a */
        public static C67708a m263377a(String str, JSONObject jSONObject) {
            return new C67708a(str, jSONObject);
        }
    }

    private C67706e(String str, JSONObject jSONObject, boolean z, boolean z2, int i) {
        this.f170553d = str;
        this.f170554e = jSONObject;
        this.f170551b = z2;
        this.f170550a = z;
        this.f170552c = i;
    }
}
