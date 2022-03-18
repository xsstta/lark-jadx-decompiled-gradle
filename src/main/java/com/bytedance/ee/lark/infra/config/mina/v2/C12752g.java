package com.bytedance.ee.lark.infra.config.mina.v2;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.config.mina.keys.Settings;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.lark.infra.config.mina.v2.g */
public final class C12752g {
    /* renamed from: a */
    public static JSONObject m52754a(JSONObject jSONObject, JSONObject jSONObject2) {
        Settings[] values = Settings.values();
        for (Settings settings : values) {
            JSONObject optJSONObject = jSONObject.optJSONObject(settings.toString());
            if (optJSONObject != null) {
                try {
                    jSONObject2.put(settings.toString(), optJSONObject);
                } catch (JSONException e) {
                    AppBrandLogger.m52829e("SettingInfoUtils", e);
                }
            }
        }
        return jSONObject2;
    }

    /* renamed from: a */
    public static boolean m52755a(String str, String str2, boolean z) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                JSONArray jSONArray = new JSONArray(str2);
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (str.equals(jSONArray.getString(i))) {
                        return true;
                    }
                }
                return z;
            } catch (JSONException e) {
                AppBrandLogger.m52829e("SettingInfoUtils", e);
            }
        }
        return z;
    }
}
