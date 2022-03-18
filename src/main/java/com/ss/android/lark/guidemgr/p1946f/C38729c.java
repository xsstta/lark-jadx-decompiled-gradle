package com.ss.android.lark.guidemgr.p1946f;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.guidemgr.f.c */
public class C38729c extends BaseHitPoint {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.guidemgr.f.c$a */
    public static class C38731a {

        /* renamed from: a */
        public static final C38729c f99619a = new C38729c();
    }

    private C38729c() {
    }

    /* renamed from: a */
    public static C38729c m152954a() {
        return C38731a.f99619a;
    }

    /* renamed from: a */
    public void mo141910a(ErrorResult errorResult) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", errorResult.getErrorCode());
            jSONObject.put("error", errorResult.getDebugMsg());
        } catch (JSONException unused) {
        }
        Statistics.sendEvent("lark_guide_fetch_info_failed", jSONObject);
    }

    /* renamed from: a */
    public void mo141911a(String str, ErrorResult errorResult) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("keys", str);
            jSONObject.put("errorCode", errorResult.getErrorCode());
            jSONObject.put("error", errorResult.getDebugMsg());
        } catch (JSONException unused) {
        }
        Statistics.sendEvent("lark_guide_post_consuming_guide_failed", jSONObject);
    }
}
