package com.bytedance.ee.larkbrand.permission;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.refer.p3400a.p3412i.AbstractC67735c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.permission.h */
public class C13297h {
    /* renamed from: a */
    public static void m54140a(IAppContext iAppContext, String str, AbstractC13298i iVar) throws JSONException {
        ((AbstractC67735c) iAppContext.findServiceByInterface(AbstractC67735c.class)).mo49513b(str, iVar);
    }

    /* renamed from: a */
    public static void m54141a(String str, IAppContext iAppContext, AbstractC13298i iVar) {
        ((AbstractC67735c) iAppContext.findServiceByInterface(AbstractC67735c.class)).mo49508a(str, iVar);
    }

    /* renamed from: a */
    public static void m54142a(String str, JSONObject jSONObject, IAppContext iAppContext) {
        ((AbstractC67735c) iAppContext.findServiceByInterface(AbstractC67735c.class)).mo49510a(str, jSONObject);
    }
}
