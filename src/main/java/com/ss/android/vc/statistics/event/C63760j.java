package com.ss.android.vc.statistics.event;

import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.event.j */
public class C63760j {
    /* renamed from: a */
    public static void m250295a(int i, boolean z, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("call_fail_reason", i);
            if (z) {
                jSONObject.put("only_voice", 1);
            }
            jSONObject.put("env_id", str);
            C63726b.m249914a("vc_call_fail", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
