package com.tt.miniapp.p3324r.p3325a;

import com.tt.frontendapiinterface.IApiInputParam;
import com.tt.frontendapiinterface.IApiOutputParam;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.r.a.a */
public class C66695a {

    /* renamed from: com.tt.miniapp.r.a.a$b */
    public static class C66697b implements IApiOutputParam {

        /* renamed from: a */
        public int f168365a;

        /* renamed from: b */
        public String f168366b;

        /* renamed from: c */
        public Integer f168367c;
    }

    /* renamed from: com.tt.miniapp.r.a.a$a */
    public static class C66696a implements IApiInputParam {

        /* renamed from: a */
        public String f168360a;

        /* renamed from: b */
        public String f168361b;

        /* renamed from: c */
        public JSONObject f168362c;

        /* renamed from: d */
        public JSONArray f168363d;

        /* renamed from: e */
        public boolean f168364e;

        public C66696a(String str, String str2, JSONObject jSONObject, JSONArray jSONArray, boolean z) {
            this.f168360a = str;
            this.f168361b = str2;
            this.f168362c = jSONObject;
            this.f168363d = jSONArray;
            this.f168364e = z;
        }
    }
}
