package com.bytedance.ee.larkbrand.abtest.experiment;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.LarkHostDependManager;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.abtest.api.p1324a.C28491b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.abtest.experiment.d */
public class C12961d extends AbstractC28490a<String> {
    @Override // com.ss.android.lark.abtest.api.p1324a.AbstractC28490a
    public boolean isEnable() {
        return true;
    }

    @Override // com.ss.android.lark.abtest.api.p1324a.AbstractC28490a
    public C28491b getLarkExperimentInfo() {
        return new C28491b("preload", "小程序预加载 AB 实验", "machao.mc", "对小程序框架的预加载进行 AB 实验");
    }

    /* renamed from: a */
    public String getDefault() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("use", true);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("MicroAppPreloadLibraExperiment", "JSONException", e);
        }
        return jSONObject.toString();
    }

    /* renamed from: b */
    public static boolean m53370b() {
        String str = (String) LarkHostDependManager.f34682b.mo49086a().mo48919b().mo148976a(C12961d.class, true);
        if (!TextUtils.isEmpty(str)) {
            try {
                AppBrandLogger.m52828d("MicroAppPreloadLibraExperiment", "micro app preload config:" + str);
                return new JSONObject(str).optBoolean("use", true);
            } catch (JSONException e) {
                AppBrandLogger.m52829e("MicroAppPreloadLibraExperiment", "JSONException", e);
            }
        }
        AppBrandLogger.m52830i("MicroAppPreloadLibraExperiment", "pull libra config fail! use default config.");
        return true;
    }
}
