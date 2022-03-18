package com.bytedance.ee.larkbrand.abtest.experiment;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.LarkHostDependManager;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.abtest.api.p1324a.C28491b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.abtest.experiment.f */
public class C12963f extends AbstractC28490a<String> {
    /* renamed from: c */
    public static boolean m53376c() {
        return m53374a(m53375b());
    }

    @Override // com.ss.android.lark.abtest.api.p1324a.AbstractC28490a
    public C28491b getLarkExperimentInfo() {
        return new C28491b("pre_render_config", "通过webview加载缓存数据，预先生成vdomtree", "ruanchenyu", "通过本地缓存预先渲染");
    }

    /* renamed from: d */
    private static JSONObject m53377d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pre_render_config", false);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("PreRenderExperiment", "JSONException", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public String getDefault() {
        return m53377d().toString();
    }

    /* renamed from: b */
    public static JSONObject m53375b() {
        String str = (String) LarkHostDependManager.f34682b.mo49086a().mo48919b().mo148976a(C12963f.class, true);
        if (!TextUtils.isEmpty(str)) {
            try {
                AppBrandLogger.m52828d("PreRenderExperiment", "pre render preload config:" + str);
                return new JSONObject(str);
            } catch (JSONException e) {
                AppBrandLogger.m52829e("PreRenderExperiment", "JSONException", e);
            }
        }
        AppBrandLogger.m52830i("PreRenderExperiment", "pull libra config fail! use default config.");
        return m53377d();
    }

    /* renamed from: a */
    public static boolean m53374a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        return jSONObject.optBoolean("enable", false);
    }
}
