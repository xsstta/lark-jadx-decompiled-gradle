package com.bytedance.ee.larkbrand.abtest.experiment;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.LarkHostDependManager;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.abtest.api.p1324a.C28491b;
import com.ss.android.vesdk.p3188b.C63954b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.abtest.experiment.h */
public class C12965h extends AbstractC28490a<String> {

    /* renamed from: a */
    private static Boolean f34513a;

    /* renamed from: b */
    private static Boolean f34514b;

    @Override // com.ss.android.lark.abtest.api.p1324a.AbstractC28490a
    public C28491b getLarkExperimentInfo() {
        return new C28491b("miniapp_preload", "preload abTest info", "yuanjian", "preload abTest info");
    }

    /* renamed from: a */
    public static boolean m53381a() {
        if (f34513a == null) {
            String str = (String) LarkHostDependManager.f34682b.mo49086a().mo48919b().mo148976a(C12965h.class, true);
            AppBrandLogger.m52830i("PreloadMiniAppExperiment", "result:" + str);
            if (!TextUtils.isEmpty(str)) {
                try {
                    Boolean valueOf = Boolean.valueOf(C63954b.f161494a.equals(new JSONObject(str).optString("preloadResult")));
                    f34513a = valueOf;
                    return valueOf.booleanValue();
                } catch (JSONException e) {
                    AppBrandLogger.m52829e("PreloadMiniAppExperiment", e);
                }
            }
            f34513a = false;
        }
        return f34513a.booleanValue();
    }

    /* renamed from: b */
    public static boolean m53382b() {
        if (f34514b == null) {
            String str = (String) LarkHostDependManager.f34682b.mo49086a().mo48919b().mo148976a(C12965h.class, true);
            AppBrandLogger.m52830i("PreloadMiniAppExperiment", "result:" + str);
            if (!TextUtils.isEmpty(str)) {
                try {
                    Boolean valueOf = Boolean.valueOf(C63954b.f161494a.equals(new JSONObject(str).optString("v8port")));
                    f34514b = valueOf;
                    return valueOf.booleanValue();
                } catch (JSONException e) {
                    AppBrandLogger.m52829e("PreloadMiniAppExperiment", e);
                }
            }
            f34514b = false;
        }
        return f34514b.booleanValue();
    }
}
