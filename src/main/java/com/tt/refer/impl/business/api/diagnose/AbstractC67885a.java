package com.tt.refer.impl.business.api.diagnose;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.refer.impl.business.api.diagnose.a */
public abstract class AbstractC67885a {
    /* renamed from: a */
    public abstract JSONObject mo235512a(IAppContext iAppContext, JSONObject jSONObject) throws JSONException;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public JSONObject mo235511a() {
        return mo235514a(true, (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public JSONObject mo235513a(String str) {
        return mo235514a(false, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public JSONObject mo235514a(boolean z, String str) {
        String str2;
        JSONObject jSONObject = new JSONObject();
        if (z) {
            str2 = "ok";
        } else {
            str2 = "fail";
        }
        try {
            jSONObject.put("result", str2);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("result_desc", str);
            }
            return jSONObject;
        } catch (JSONException e) {
            AppBrandLogger.m52829e("DiagnoseCommand", "success, make json error: " + e.getMessage(), e);
            return null;
        }
    }
}
