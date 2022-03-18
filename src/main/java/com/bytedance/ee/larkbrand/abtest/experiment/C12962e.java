package com.bytedance.ee.larkbrand.abtest.experiment;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.abtest.api.p1324a.C28491b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.abtest.experiment.e */
public class C12962e extends AbstractC28490a<String> {
    @Override // com.ss.android.lark.abtest.api.p1324a.AbstractC28490a
    public boolean isEnable() {
        return true;
    }

    /* renamed from: a */
    public String getDefault() {
        return m53372b().toString();
    }

    @Override // com.ss.android.lark.abtest.api.p1324a.AbstractC28490a
    public C28491b getLarkExperimentInfo() {
        return new C28491b("oryx_refactor", "oryx AB test ", "xulei.rock", "compare render performance between webview and oryx");
    }

    /* renamed from: b */
    public static JSONObject m53372b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("key_oryx_enable", false);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("OryxRefactorExperiment", "can not get default oryx refactor default config", e);
        }
        return jSONObject;
    }
}
