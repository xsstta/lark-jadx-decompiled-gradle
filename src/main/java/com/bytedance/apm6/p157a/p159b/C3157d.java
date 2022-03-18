package com.bytedance.apm6.p157a.p159b;

import com.bytedance.apm6.p183g.AbstractC3326b;
import com.bytedance.apm6.util.C3348b;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm6.a.b.d */
public class C3157d implements AbstractC3326b {

    /* renamed from: a */
    private JSONArray f10109a;

    @Override // com.bytedance.apm6.p183g.AbstractC3326b
    /* renamed from: g */
    public String mo13105g() {
        return "tracing";
    }

    @Override // com.bytedance.apm6.p183g.AbstractC3326b
    /* renamed from: h */
    public boolean mo13106h() {
        return true;
    }

    @Override // com.bytedance.apm6.p183g.AbstractC3326b
    /* renamed from: i */
    public final JSONObject mo13107i() {
        return C3348b.m13924a(mo13105g(), this.f10109a);
    }

    public C3157d(JSONArray jSONArray) {
        this.f10109a = jSONArray;
    }

    public C3157d(JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject);
        this.f10109a = jSONArray;
    }
}
