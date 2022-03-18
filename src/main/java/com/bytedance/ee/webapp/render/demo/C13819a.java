package com.bytedance.ee.webapp.render.demo;

import com.alibaba.fastjson.JSONObject;

/* renamed from: com.bytedance.ee.webapp.render.demo.a */
public class C13819a {

    /* renamed from: a */
    public int f36088a;

    /* renamed from: b */
    public int f36089b;

    /* renamed from: c */
    public int f36090c;

    /* renamed from: a */
    public static C13819a m55978a(JSONObject jSONObject) {
        C13819a aVar = new C13819a();
        if (jSONObject.containsKey("duration")) {
            aVar.f36088a = jSONObject.getInteger("duration").intValue();
        }
        if (jSONObject.containsKey("width")) {
            aVar.f36089b = jSONObject.getInteger("width").intValue();
        }
        if (jSONObject.containsKey("height")) {
            aVar.f36090c = jSONObject.getInteger("height").intValue();
        }
        return aVar;
    }
}
