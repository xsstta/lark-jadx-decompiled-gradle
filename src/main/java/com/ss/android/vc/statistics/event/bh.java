package com.ss.android.vc.statistics.event;

import com.ss.android.lark.utils.C57859q;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

public class bh {
    /* renamed from: a */
    public static void m250164a(String str, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uuid", C57859q.m224565a(str));
            m250165a("calling", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static void m250165a(String str, JSONObject jSONObject, VideoChat videoChat) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("action_name", str);
            if (jSONObject != null) {
                jSONObject2.put("extend_value", jSONObject);
            }
            C63726b.m249915a("vc_meeting_page_suggest_list", jSONObject2, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
