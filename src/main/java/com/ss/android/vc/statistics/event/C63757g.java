package com.ss.android.vc.statistics.event;

import android.text.TextUtils;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.event.g */
public class C63757g {
    /* renamed from: a */
    public static void m250286a(boolean z, String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("from_source", str);
            }
            if (z) {
                jSONObject.put("only_voice", 1);
                jSONObject.put("product_type", "voice_call");
            } else {
                jSONObject.put("product_type", "video_call");
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("env_id", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("context_id", str3);
            }
            C63726b.m249914a("vc_call_click", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
