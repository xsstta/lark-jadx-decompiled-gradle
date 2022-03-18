package com.bytedance.ee.lark.component.p607a.p611d;

import com.alibaba.fastjson.JSONObject;

/* renamed from: com.bytedance.ee.lark.component.a.d.a */
public class C12723a {

    /* renamed from: a */
    private String f34070a;

    /* renamed from: b */
    private String f34071b;

    /* renamed from: c */
    private JSONObject f34072c;

    /* renamed from: d */
    private String f34073d;

    /* renamed from: e */
    private int f34074e;

    /* renamed from: f */
    private JSONObject f34075f;

    /* renamed from: g */
    private float f34076g;

    /* renamed from: h */
    private float f34077h;

    /* renamed from: a */
    public JSONObject mo48176a() {
        return this.f34072c;
    }

    /* renamed from: b */
    public int mo48179b() {
        return this.f34074e;
    }

    /* renamed from: c */
    public JSONObject mo48180c() {
        return this.f34075f;
    }

    /* renamed from: d */
    public float mo48181d() {
        return this.f34076g;
    }

    /* renamed from: e */
    public float mo48182e() {
        return this.f34077h;
    }

    public String toString() {
        return "id:" + this.f34070a + ",type:" + this.f34071b + ",data:" + this.f34072c;
    }

    /* renamed from: f */
    private void m52655f() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = this.f34072c;
        if (jSONObject2 != null && (jSONObject = jSONObject2.getJSONObject("style")) != null) {
            if (jSONObject.containsKey("backgroundColor")) {
                this.f34073d = jSONObject.getString("backgroundColor");
            }
            if (jSONObject.containsKey("zIndex")) {
                this.f34074e = jSONObject.getInteger("zIndex").intValue();
            }
            if (jSONObject.containsKey("width")) {
                this.f34076g = jSONObject.getFloatValue("width");
            }
            if (jSONObject.containsKey("height")) {
                this.f34077h = jSONObject.getFloatValue("height");
            }
        }
    }

    /* renamed from: a */
    public void mo48178a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f34072c = jSONObject;
        }
    }

    /* renamed from: a */
    public void mo48177a(float f, float f2) {
        this.f34076g = f;
        this.f34077h = f2;
    }

    public C12723a(String str, String str2, JSONObject jSONObject) {
        this.f34070a = str;
        this.f34071b = str2;
        this.f34072c = jSONObject;
        m52655f();
    }
}
