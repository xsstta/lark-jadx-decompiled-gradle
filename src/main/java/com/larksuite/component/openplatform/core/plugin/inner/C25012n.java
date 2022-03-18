package com.larksuite.component.openplatform.core.plugin.inner;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.utils.C13377u;
import com.tt.miniapp.p3324r.p3326b.AbstractC66715a;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.inner.n */
public class C25012n extends AbstractC66715a {
    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: a */
    public String mo87633a() {
        return "reportAnalytics";
    }

    public C25012n() {
    }

    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: b */
    public String mo87634b() {
        String str;
        if (LarkExtensionManager.getInstance().getExtension().getFeatureGating("microapp.api.report_analytics")) {
            try {
                JSONObject jSONObject = new JSONObject(this.f168426a);
                String optString = jSONObject.optString("event");
                AppBrandLogger.m52830i("LarkApiReportAnalytics", "reportAnalytics, event: " + optString);
                if (TextUtils.equals("mp_page_tti", optString)) {
                    AppBrandLogger.m52828d("LarkApiReportAnalytics", "mp_page_tti happened");
                }
                if (TextUtils.isEmpty(optString)) {
                    AppBrandLogger.m52829e("LarkApiReportAnalytics", "invalid event param, eventName: " + optString);
                    return mo232447a(false, "invalid event param");
                } else if (optString.length() > 85) {
                    AppBrandLogger.m52829e("LarkApiReportAnalytics", "event name is too long, event: " + optString);
                    return mo232447a(false, "event name is too long");
                } else {
                    JSONObject optJSONObject = jSONObject.optJSONObject("value");
                    if (optJSONObject != null) {
                        str = optJSONObject.toString();
                    } else {
                        str = "";
                    }
                    if (str.length() > 294912) {
                        AppBrandLogger.m52829e("LarkApiReportAnalytics", "event data is too long, data: " + str);
                        return mo232447a(false, "event data is too long");
                    } else if (C13377u.m54420a(optString, optJSONObject, mo232455f())) {
                        return mo232447a(true, null);
                    } else {
                        AppBrandLogger.m52829e("LarkApiReportAnalytics", "mpReportAnalytics error");
                        return mo232447a(false, null);
                    }
                }
            } catch (Throwable th) {
                AppBrandLogger.eWithThrowable("LarkApiReportAnalytics", th.getMessage(), th);
                return mo232447a(false, null);
            }
        } else {
            AppBrandLogger.m52829e("LarkApiReportAnalytics", "feature gating is off");
            return CharacterUtils.empty();
        }
    }

    public C25012n(String str) {
        super(str);
    }
}
