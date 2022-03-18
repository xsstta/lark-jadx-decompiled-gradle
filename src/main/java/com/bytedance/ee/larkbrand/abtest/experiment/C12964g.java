package com.bytedance.ee.larkbrand.abtest.experiment;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.LarkHostDependManager;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.abtest.api.p1324a.C28491b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.abtest.experiment.g */
public class C12964g extends AbstractC28490a<String> {
    @Override // com.ss.android.lark.abtest.api.p1324a.AbstractC28490a
    public boolean isEnable() {
        return true;
    }

    @Override // com.ss.android.lark.abtest.api.p1324a.AbstractC28490a
    public C28491b getLarkExperimentInfo() {
        return new C28491b("preload_case", "小程序bot click preload AB 实验", "wenpei.wei", "对小程序ot click preload AB 实验");
    }

    /* renamed from: a */
    public String getDefault() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("bot_click", true).put("bot_create", true).put("app_feed", true).put("qr_scan", true);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("PreloadCaseExperiment", "JSONException", e);
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public static boolean m53379a(int i) {
        String str = (String) LarkHostDependManager.f34682b.mo49086a().mo48919b().mo148976a(C12964g.class, true);
        if (!TextUtils.isEmpty(str)) {
            try {
                AppBrandLogger.m52828d("PreloadCaseExperiment", "micro app preload config:" + str);
                JSONObject jSONObject = new JSONObject(str);
                if (i == 3) {
                    return jSONObject.optBoolean("bot_click", true);
                }
                if (i == 4) {
                    return jSONObject.optBoolean("bot_create", true);
                }
                if (i == 5) {
                    return jSONObject.optBoolean("app_feed", true);
                }
                if (i != 6) {
                    return false;
                }
                return jSONObject.optBoolean("qr_scan", true);
            } catch (JSONException e) {
                AppBrandLogger.m52829e("PreloadCaseExperiment", "JSONException", e);
            }
        }
        AppBrandLogger.m52830i("PreloadCaseExperiment", "pull libra config fail! use default config.");
        return true;
    }
}
