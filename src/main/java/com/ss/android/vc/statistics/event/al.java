package com.ss.android.vc.statistics.event;

import android.text.TextUtils;
import com.ss.android.vc.statistics.C63685a;
import org.json.JSONException;
import org.json.JSONObject;

public class al {
    /* renamed from: a */
    public static void m250020a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("from_source", str);
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("env_id", str2);
                }
                jSONObject.put("fail_reason", str3);
                C63685a.m249653a("vc_meeting_lark_entry_fail", jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
