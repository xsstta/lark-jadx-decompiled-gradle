package com.bytedance.android.monitor.p106c;

import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.android.monitor.webview.AbstractC2677a;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.c.a */
public class C2641a {

    /* renamed from: a */
    public String f8377a;

    /* renamed from: b */
    public String f8378b;

    /* renamed from: c */
    public String f8379c;

    /* renamed from: d */
    public JSONObject f8380d;

    /* renamed from: e */
    public JSONObject f8381e;

    /* renamed from: f */
    public JSONObject f8382f;

    /* renamed from: g */
    public JSONObject f8383g;

    /* renamed from: h */
    public JSONObject f8384h;

    /* renamed from: i */
    public String f8385i;

    /* renamed from: j */
    public boolean f8386j;

    /* renamed from: k */
    public AbstractC2677a f8387k;

    private C2641a() {
    }

    /* renamed from: a */
    public String mo11421a() {
        return this.f8377a;
    }

    /* renamed from: b */
    public String mo11424b() {
        return this.f8378b;
    }

    /* renamed from: c */
    public String mo11426c() {
        return this.f8379c;
    }

    /* renamed from: d */
    public JSONObject mo11428d() {
        return this.f8380d;
    }

    /* renamed from: e */
    public JSONObject mo11429e() {
        return this.f8381e;
    }

    /* renamed from: f */
    public JSONObject mo11430f() {
        return this.f8382f;
    }

    /* renamed from: g */
    public JSONObject mo11431g() {
        return this.f8383g;
    }

    /* renamed from: h */
    public JSONObject mo11432h() {
        return this.f8384h;
    }

    /* renamed from: i */
    public String mo11433i() {
        return this.f8385i;
    }

    /* renamed from: j */
    public boolean mo11434j() {
        return this.f8386j;
    }

    /* renamed from: k */
    public AbstractC2677a mo11435k() {
        return this.f8387k;
    }

    /* renamed from: com.bytedance.android.monitor.c.a$a */
    public static class C2643a {

        /* renamed from: a */
        private String f8388a;

        /* renamed from: b */
        private String f8389b;

        /* renamed from: c */
        private String f8390c;

        /* renamed from: d */
        private JSONObject f8391d;

        /* renamed from: e */
        private JSONObject f8392e;

        /* renamed from: f */
        private JSONObject f8393f;

        /* renamed from: g */
        private JSONObject f8394g;

        /* renamed from: h */
        private JSONObject f8395h;

        /* renamed from: i */
        private String f8396i;

        /* renamed from: j */
        private boolean f8397j;

        /* renamed from: k */
        private AbstractC2677a f8398k;

        /* renamed from: a */
        public C2641a mo11440a() {
            C2641a aVar = new C2641a();
            aVar.f8379c = this.f8390c;
            aVar.f8377a = this.f8388a;
            aVar.f8378b = this.f8389b;
            aVar.f8380d = this.f8391d;
            aVar.f8381e = this.f8392e;
            JSONObject jSONObject = this.f8393f;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            aVar.f8382f = jSONObject;
            aVar.f8383g = this.f8394g;
            JSONObject jSONObject2 = this.f8395h;
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            aVar.f8384h = jSONObject2;
            aVar.f8386j = this.f8397j;
            aVar.f8385i = this.f8396i;
            AbstractC2677a aVar2 = this.f8398k;
            if (aVar2 == null) {
                aVar2 = HybridMonitor.getInstance().getCustomReportMonitor();
            }
            aVar.f8387k = aVar2;
            return aVar;
        }

        /* renamed from: a */
        public C2643a mo11436a(AbstractC2677a aVar) {
            this.f8398k = aVar;
            return this;
        }

        /* renamed from: b */
        public C2643a mo11441b(String str) {
            this.f8389b = str;
            return this;
        }

        /* renamed from: c */
        public C2643a mo11443c(String str) {
            this.f8396i = str;
            return this;
        }

        /* renamed from: d */
        public C2643a mo11445d(JSONObject jSONObject) {
            this.f8394g = jSONObject;
            return this;
        }

        /* renamed from: e */
        public C2643a mo11446e(JSONObject jSONObject) {
            this.f8395h = jSONObject;
            return this;
        }

        public C2643a(String str) {
            this.f8390c = str;
        }

        /* renamed from: a */
        public C2643a mo11437a(String str) {
            this.f8388a = str;
            return this;
        }

        /* renamed from: b */
        public C2643a mo11442b(JSONObject jSONObject) {
            this.f8392e = jSONObject;
            return this;
        }

        /* renamed from: c */
        public C2643a mo11444c(JSONObject jSONObject) {
            this.f8393f = jSONObject;
            return this;
        }

        /* renamed from: a */
        public C2643a mo11438a(JSONObject jSONObject) {
            this.f8391d = jSONObject;
            return this;
        }

        /* renamed from: a */
        public C2643a mo11439a(boolean z) {
            this.f8397j = z;
            return this;
        }
    }

    /* renamed from: a */
    public void mo11422a(AbstractC2677a aVar) {
        this.f8387k = aVar;
    }

    /* renamed from: b */
    public void mo11425b(String str) {
        this.f8378b = str;
    }

    /* renamed from: c */
    public void mo11427c(String str) {
        this.f8385i = str;
    }

    /* renamed from: a */
    public void mo11423a(String str) {
        this.f8377a = str;
    }
}
