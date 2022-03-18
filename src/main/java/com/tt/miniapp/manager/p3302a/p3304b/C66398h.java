package com.tt.miniapp.manager.p3302a.p3304b;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.ee.lark.infra.config.mina.keys.Settings;
import com.bytedance.ee.lark.infra.config.mina.p614a.C12738a;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.event.C66036d;
import com.tt.miniapp.manager.p3302a.C66377a;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.manager.a.b.h */
public class C66398h extends AbstractC66390a {
    @Override // com.tt.miniapp.manager.p3302a.p3304b.AbstractC66390a
    /* renamed from: a */
    public C66391b mo231908a(Context context, C66391b bVar) {
        m259606a(context, C12738a.m52729b(context, Settings.TMA_SDK_CONFIG), bVar);
        return bVar;
    }

    /* renamed from: a */
    private void m259606a(Context context, JSONObject jSONObject, C66391b bVar) {
        if (jSONObject == null) {
            try {
                AppBrandLogger.m52830i("UpdateSettingsHandler", "saveJsSdkInfo, tmaConfig is null");
            } catch (Exception e) {
                bVar.f167617e = false;
                AppBrandLogger.m52829e("UpdateSettingsHandler", e);
                C66036d.m262458a("mp_lib_request_result", "0", "0", bVar.f167615c, "fail", e.getMessage(), bVar.f167616d.getMillisAfterStart());
            }
        } else {
            SharedPreferences.Editor edit = C66377a.m259531a(context).edit();
            if (jSONObject.has("sdkVersion")) {
                edit.putString("sdk_version", jSONObject.optString("sdkVersion")).apply();
            }
            if (jSONObject.has("sdkUpdateVersion")) {
                edit.putString("sdk_update_version", jSONObject.optString("sdkUpdateVersion"));
            }
            edit.putString("greyHash", jSONObject.optString("greyHash"));
            if (jSONObject.has("latestSDKUrl")) {
                edit.putString("latest_sdk_url", jSONObject.optString("latestSDKUrl")).apply();
            }
            if (jSONObject.has("tmaSwitch")) {
                edit.putInt("tma_switch", jSONObject.optInt("tmaSwitch")).apply();
            }
        }
    }
}
