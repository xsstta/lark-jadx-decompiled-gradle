package com.bytedance.ee.larkbrand.abtest.experiment;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.abtest.api.p1324a.C28491b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.abtest.experiment.a */
public class C12958a extends AbstractC28490a<String> {
    @Override // com.ss.android.lark.abtest.api.p1324a.AbstractC28490a
    public boolean isEnable() {
        return true;
    }

    /* renamed from: a */
    public String getDefault() {
        return m53364b().toString();
    }

    @Override // com.ss.android.lark.abtest.api.p1324a.AbstractC28490a
    public C28491b getLarkExperimentInfo() {
        return new C28491b("storage_cache", "gadget get storage cache AB experiment", "wenpei.wei", "gadget get storage api jssdk cache config AB experiment");
    }

    /* renamed from: b */
    public static JSONObject m53364b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cache_enable", false);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("APIStorageCacheExperiment", e);
        }
        return jSONObject;
    }
}
