package com.ss.android.vc.statistics.event;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.statistics.C63685a;
import org.json.JSONException;
import org.json.JSONObject;

public class cb {
    /* renamed from: a */
    public static void m250253a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", str);
            m250254a("vc_live_page_float_window", jSONObject);
        } catch (JSONException e) {
            C60700b.m235864f("VCLiveEvent", "sendLiveFloatPageEvent", e.getMessage());
        }
    }

    /* renamed from: a */
    private static void m250254a(String str, JSONObject jSONObject) {
        C63685a.m249653a(str, jSONObject);
    }
}
