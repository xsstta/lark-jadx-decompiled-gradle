package com.tt.miniapp.errorcode;

import com.tt.frontendapiinterface.ApiHandler;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.errorcode.a */
public class C66015a {
    /* renamed from: a */
    public static void m258507a(JSONObject jSONObject, ApiCode apiCode) throws JSONException {
        jSONObject.put("errCode", apiCode.code);
        jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, apiCode.msg);
    }

    /* renamed from: a */
    public static void m258508a(JSONObject jSONObject, ApiCode apiCode, String str) throws JSONException {
        jSONObject.put("errCode", apiCode.code);
        jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, str);
    }
}
