package com.bytedance.ee.larkbrand.p651f.p652a;

import android.text.TextUtils;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.AppbrandContext;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.f.a.c */
public class C13059c extends AbstractC67550j {
    @Override // com.tt.miniapphost.AbstractC67550j
    /* renamed from: a */
    public String mo49103a() {
        return "operateRequestTask";
    }

    public C13059c(AppbrandContext appbrandContext) {
        super(appbrandContext);
    }

    @Override // com.tt.miniapphost.AbstractC67550j
    /* renamed from: a */
    public <T> String mo49104a(String str, AbstractC67550j.AbstractC67551a<T> aVar) throws Exception {
        JSONObject jSONObject = new JSONObject(str);
        int optInt = jSONObject.optInt("requestTaskId");
        if (!TextUtils.equals(jSONObject.optString("operationType"), "abort")) {
            return null;
        }
        AppbrandApplicationImpl inst = AppbrandApplicationImpl.getInst(this.f170359f);
        if (inst == null || !TextUtils.equals("v1", inst.getRequestVersion())) {
            C13055b.m53547a(this.f170359f).mo49098a(Integer.valueOf(optInt));
            return null;
        }
        C13051a.m53536a(this.f170359f).mo49090a(Integer.valueOf(optInt));
        return null;
    }
}
