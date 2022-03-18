package com.tt.miniapp.net;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.AppbrandContext;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.net.f */
public class C66519f extends AbstractC67550j {
    @Override // com.tt.miniapphost.AbstractC67550j
    /* renamed from: a */
    public String mo49103a() {
        return "operateRequestTask";
    }

    public C66519f(AppbrandContext appbrandContext) {
        super(appbrandContext);
    }

    @Override // com.tt.miniapphost.AbstractC67550j
    /* renamed from: a */
    public <T> String mo49104a(String str, AbstractC67550j.AbstractC67551a<T> aVar) throws Exception {
        AppBrandLogger.m52830i("tma_OperateRequestTaskImpl", "operate request task impl invoke ........");
        JSONObject jSONObject = new JSONObject(str);
        int optInt = jSONObject.optInt("requestTaskId");
        String optString = jSONObject.optString("operationType");
        if (TextUtils.equals(optString, "abort")) {
            AppBrandLogger.m52830i("tma_OperateRequestTaskImpl", "abort request:", Integer.valueOf(optInt));
            C66522i.m259931a(this.f170359f).mo232087a(Integer.valueOf(optInt));
            C66528j.m259943a(this.f170359f).mo232096a(Integer.valueOf(optInt));
            return null;
        }
        AppBrandLogger.m52830i("tma_OperateRequestTaskImpl", "operateType:", optString);
        return null;
    }
}
