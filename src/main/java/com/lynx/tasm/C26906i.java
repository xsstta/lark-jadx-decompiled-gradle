package com.lynx.tasm;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.lynx.tasm.i */
public class C26906i {

    /* renamed from: a */
    private int f66801a;

    /* renamed from: b */
    private String f66802b = "";

    /* renamed from: c */
    private JSONObject f66803c;

    /* renamed from: a */
    public int mo95711a() {
        return this.f66801a;
    }

    /* renamed from: b */
    public String mo95712b() {
        JSONObject jSONObject = this.f66803c;
        if (jSONObject == null) {
            return this.f66802b;
        }
        return jSONObject.toString();
    }

    public String toString() {
        return "{\"code\": " + this.f66801a + ",\"msg\":" + mo95712b() + "}";
    }

    public C26906i(String str, int i) {
        this.f66801a = i;
        this.f66802b = str;
    }

    public C26906i(JSONObject jSONObject, int i) {
        this.f66803c = jSONObject;
        this.f66801a = i;
        try {
            if (jSONObject.has("error")) {
                this.f66802b = this.f66803c.getString("error");
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
