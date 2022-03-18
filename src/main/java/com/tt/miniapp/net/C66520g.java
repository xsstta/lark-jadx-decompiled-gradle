package com.tt.miniapp.net;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.AppbrandContext;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.net.g */
public class C66520g extends AbstractC67550j {
    @Override // com.tt.miniapphost.AbstractC67550j
    /* renamed from: a */
    public String mo49103a() {
        return "operateUploadTask";
    }

    public C66520g(AppbrandContext appbrandContext) {
        super(appbrandContext);
    }

    @Override // com.tt.miniapphost.AbstractC67550j
    /* renamed from: a */
    public <T> String mo49104a(String str, AbstractC67550j.AbstractC67551a<T> aVar) throws Exception {
        AppBrandLogger.m52830i("OperateUploadTaskImpl", "operate upload task impl invoke ........");
        JSONObject jSONObject = new JSONObject(str);
        int optInt = jSONObject.optInt("uploadTaskId");
        String optString = jSONObject.optString("operationType");
        if (TextUtils.equals(optString, "abort")) {
            AppBrandLogger.m52830i("OperateUploadTaskImpl", "abort upload task:", Integer.valueOf(optInt));
            C66504b.m259895b(optInt, this.f170359f);
            return "";
        }
        AppBrandLogger.m52830i("OperateUploadTaskImpl", "operate upload task and type:", optString);
        return "";
    }
}
