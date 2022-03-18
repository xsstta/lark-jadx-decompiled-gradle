package com.tt.miniapp.entity;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.google.firebase.messaging.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.entity.d */
public class C66013d {

    /* renamed from: a */
    public int f166664a;

    /* renamed from: b */
    public String f166665b;

    /* renamed from: c */
    public C66014a f166666c;

    /* renamed from: com.tt.miniapp.entity.d$a */
    public static class C66014a {

        /* renamed from: a */
        public String f166667a;

        /* renamed from: b */
        public String f166668b;

        /* renamed from: c */
        public String f166669c;

        /* renamed from: d */
        public String f166670d;

        /* renamed from: e */
        public String f166671e;

        /* renamed from: f */
        public String f166672f;

        /* renamed from: g */
        public String f166673g;
    }

    private C66013d() {
    }

    /* renamed from: a */
    public static C66013d m258505a(String str) {
        C66013d dVar = new C66013d();
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                dVar.f166664a = jSONObject.optInt("err_no");
                dVar.f166665b = jSONObject.optString("message");
                C66014a aVar = new C66014a();
                JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                if (optJSONObject != null) {
                    aVar.f166667a = optJSONObject.optString("token");
                    aVar.f166668b = optJSONObject.optString("ug_url");
                    aVar.f166669c = optJSONObject.optString("title");
                    aVar.f166670d = optJSONObject.optString("description");
                    aVar.f166671e = optJSONObject.optString("image_url");
                    aVar.f166672f = optJSONObject.optString("mini_image_url");
                    aVar.f166673g = optJSONObject.optString("share_extra");
                }
                dVar.f166666c = aVar;
            } catch (JSONException e) {
                AppBrandLogger.stacktrace(6, "ShareResp", e.getStackTrace());
            }
        }
        return dVar;
    }

    /* renamed from: b */
    public static C66013d m258506b(String str) {
        C66013d dVar = new C66013d();
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                dVar.f166664a = jSONObject.optInt("err_no");
                dVar.f166665b = jSONObject.optString("message");
                C66014a aVar = new C66014a();
                JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                if (optJSONObject != null) {
                    aVar.f166669c = optJSONObject.optString("title");
                    aVar.f166670d = optJSONObject.optString("description");
                    aVar.f166671e = optJSONObject.optString("image_url");
                    dVar.f166666c = aVar;
                }
            } catch (JSONException e) {
                AppBrandLogger.stacktrace(6, "ShareResp", e.getStackTrace());
            }
        }
        return dVar;
    }
}
