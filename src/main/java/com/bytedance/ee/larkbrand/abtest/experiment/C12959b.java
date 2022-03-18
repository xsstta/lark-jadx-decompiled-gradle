package com.bytedance.ee.larkbrand.abtest.experiment;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.LarkHostDependManager;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.abtest.api.p1324a.C28491b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.abtest.experiment.b */
public class C12959b extends AbstractC28490a<String> {
    @Override // com.ss.android.lark.abtest.api.p1324a.AbstractC28490a
    public boolean isEnable() {
        return true;
    }

    /* renamed from: a */
    public String getDefault() {
        return m53366b().toString();
    }

    @Override // com.ss.android.lark.abtest.api.p1324a.AbstractC28490a
    public C28491b getLarkExperimentInfo() {
        return new C28491b("code_cache", "小程序code cache AB 实验", "wenpei.wei", "对小程序code cache config AB 实验");
    }

    /* renamed from: d */
    private static String m53368d() {
        return (String) LarkHostDependManager.f34682b.mo49086a().mo48919b().mo148976a(C12959b.class, true);
    }

    /* renamed from: b */
    public static JSONObject m53366b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("eager_open", false).put("size_limit", 32768);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("CodeCacheConfigExperiment", "JSONException", e);
        }
        return jSONObject;
    }

    /* renamed from: c */
    public static JSONObject m53367c() {
        try {
            String d = m53368d();
            if (!TextUtils.isEmpty(d)) {
                AppBrandLogger.m52828d("CodeCacheConfigExperiment", "micro app code cache config:" + d);
                return new JSONObject(d);
            }
        } catch (JSONException e) {
            AppBrandLogger.m52829e("CodeCacheConfigExperiment", "JSONException", e);
        }
        return m53366b();
    }
}
