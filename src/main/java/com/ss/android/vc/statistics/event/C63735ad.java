package com.ss.android.vc.statistics.event;

import android.text.TextUtils;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.event.ad */
public class C63735ad {
    /* renamed from: a */
    public static void m249991a(boolean z, VideoChat videoChat) {
        String str;
        if (z) {
            str = "refuse_host_live";
        } else {
            str = "agree_host_live";
        }
        m249990a("vc_begin_live_popup", str, null, null, videoChat);
    }

    /* renamed from: a */
    private static void m249990a(String str, String str2, String str3, JSONObject jSONObject, VideoChat videoChat) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("action_name", str2);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject2.put("from_source", str3);
            }
            if (jSONObject != null) {
                jSONObject2.put("extend_value", jSONObject);
            }
            C63726b.m249915a(str, jSONObject2, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
