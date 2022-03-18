package com.tt.refer.impl.business.api.diagnose.p3430a;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.refer.impl.business.api.diagnose.AbstractC67885a;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.refer.impl.business.api.diagnose.a.g */
public class C67887g extends AbstractC67885a {
    @Override // com.tt.refer.impl.business.api.diagnose.AbstractC67885a
    /* renamed from: a */
    public JSONObject mo235512a(IAppContext iAppContext, JSONObject jSONObject) throws JSONException {
        int i;
        JSONObject jSONObject2 = new JSONObject();
        if (((AbstractC67709b.AbstractC67710a) ((AbstractC67709b) iAppContext.findServiceByInterface(AbstractC67709b.class)).mo235130i()).mo235056h()) {
            i = 1;
        } else {
            i = 2;
        }
        jSONObject2.put("network_channel", i);
        return jSONObject2;
    }
}
