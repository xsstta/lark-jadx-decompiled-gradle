package com.huawei.hms.hatool;

import org.json.JSONObject;

public class c1 extends AbstractC23611n {

    /* renamed from: b */
    public String f58181b = "";

    /* renamed from: c */
    public String f58182c = "";

    /* renamed from: d */
    public String f58183d = "";

    /* renamed from: e */
    public String f58184e = "";

    /* renamed from: f */
    public String f58185f = "";

    /* renamed from: g */
    public String f58186g;

    @Override // com.huawei.hms.hatool.AbstractC23617s
    /* renamed from: a */
    public JSONObject mo82974a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("androidid", this.f58290a);
        jSONObject.put("oaid", this.f58186g);
        jSONObject.put("uuid", this.f58185f);
        jSONObject.put("upid", this.f58184e);
        jSONObject.put("imei", this.f58181b);
        jSONObject.put("sn", this.f58182c);
        jSONObject.put("udid", this.f58183d);
        return jSONObject;
    }

    /* renamed from: b */
    public void mo82975b(String str) {
        this.f58181b = str;
    }

    /* renamed from: c */
    public void mo82976c(String str) {
        this.f58186g = str;
    }

    /* renamed from: d */
    public void mo82977d(String str) {
        this.f58182c = str;
    }

    /* renamed from: e */
    public void mo82978e(String str) {
        this.f58183d = str;
    }

    /* renamed from: f */
    public void mo82979f(String str) {
        this.f58184e = str;
    }

    /* renamed from: g */
    public void mo82980g(String str) {
        this.f58185f = str;
    }
}
