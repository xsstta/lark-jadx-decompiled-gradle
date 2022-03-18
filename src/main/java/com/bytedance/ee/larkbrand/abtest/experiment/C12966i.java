package com.bytedance.ee.larkbrand.abtest.experiment;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.LarkHostDependManager;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.abtest.api.p1324a.C28491b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.abtest.experiment.i */
public class C12966i extends AbstractC28490a<String> {
    /* renamed from: c */
    public static boolean m53385c() {
        JSONObject b = m53384b();
        if (b == null) {
            return false;
        }
        return m53383a(b);
    }

    /* renamed from: a */
    public String getDefault() {
        return m53386d().toString();
    }

    @Override // com.ss.android.lark.abtest.api.p1324a.AbstractC28490a
    public C28491b getLarkExperimentInfo() {
        return new C28491b("preloadSP", "小程序启动阶段的SharedPreferences 进行 Preload", "machao.mc", "对 app_info 和 tmaSession 的 SP 进行 Preload");
    }

    /* renamed from: d */
    private static JSONObject m53386d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("open", false);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("PreloadSPExperiment", "JSONException", e);
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static JSONObject m53384b() {
        String str = (String) LarkHostDependManager.f34682b.mo49086a().mo48919b().mo148976a(C12966i.class, true);
        if (!TextUtils.isEmpty(str)) {
            AppBrandLogger.m52828d("PreloadSPExperiment", "libra key = preloadSP config:" + str);
            try {
                return new JSONObject(str);
            } catch (JSONException e) {
                AppBrandLogger.m52829e("PreloadSPExperiment", "libraKey:preloadSP", e);
                return null;
            }
        } else {
            AppBrandLogger.m52828d("PreloadSPExperiment", "pull libra config fail!, use default config.");
            return m53386d();
        }
    }

    /* renamed from: a */
    public static boolean m53383a(JSONObject jSONObject) {
        return jSONObject.optBoolean("open", false);
    }
}
