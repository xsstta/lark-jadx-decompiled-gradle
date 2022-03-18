package com.ss.android.vc.statistics.event;

import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

public class am {
    /* renamed from: a */
    public static void m250021a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("reason_fail", "others");
            C63726b.m249917b("vc_meeting_fail", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m250022a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("reason_fail", str);
            C63726b.m249917b("vc_meeting_fail", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
