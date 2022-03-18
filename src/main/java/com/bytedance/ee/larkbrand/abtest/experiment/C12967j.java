package com.bytedance.ee.larkbrand.abtest.experiment;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.LarkHostDependManager;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.abtest.api.p1324a.C28491b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.abtest.experiment.j */
public class C12967j extends AbstractC28490a<String> {
    /* renamed from: c */
    public static boolean m53390c() {
        return m53388a(m53389b());
    }

    @Override // com.ss.android.lark.abtest.api.p1324a.AbstractC28490a
    public C28491b getLarkExperimentInfo() {
        return new C28491b("snapshot_config", "snapshot启动", "ruanchenyu", "snapshot启动");
    }

    /* renamed from: d */
    private static JSONObject m53391d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("snapshot_config", false);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("SnapshotExperiment", "JSONException", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public String getDefault() {
        return m53391d().toString();
    }

    /* renamed from: b */
    public static JSONObject m53389b() {
        String str = (String) LarkHostDependManager.f34682b.mo49086a().mo48919b().mo148976a(C12967j.class, true);
        if (!TextUtils.isEmpty(str)) {
            try {
                AppBrandLogger.m52828d("SnapshotExperiment", "snapshot_config:" + str);
                return new JSONObject(str);
            } catch (JSONException e) {
                AppBrandLogger.m52829e("SnapshotExperiment", "JSONException", e);
            }
        }
        AppBrandLogger.m52830i("SnapshotExperiment", "pull libra config fail! use default config.");
        return m53391d();
    }

    /* renamed from: a */
    public static boolean m53388a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        return jSONObject.optBoolean("enable", false);
    }
}
