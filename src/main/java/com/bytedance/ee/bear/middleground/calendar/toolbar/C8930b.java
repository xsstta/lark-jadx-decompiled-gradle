package com.bytedance.ee.bear.middleground.calendar.toolbar;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.middleground.calendar.toolbar.b */
public class C8930b {

    /* renamed from: a */
    private AbstractC7947h f24090a;

    public C8930b(AbstractC7947h hVar) {
        this.f24090a = hVar;
    }

    /* renamed from: a */
    public void mo34274a(String str) {
        C13479a.m54772d("ToolbarCallback", "handleCallback, id = " + str);
        if (this.f24090a == null) {
            C13479a.m54758a("ToolbarCallback", "handleCallback(): mCallbackFun == null");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", (Object) str);
        this.f24090a.mo17188a(jSONObject);
    }
}
