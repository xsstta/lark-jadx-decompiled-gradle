package com.ss.android.vc.statistics.monitor;

import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.C63685a;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.monitor.c */
public class C63781c {
    /* renamed from: a */
    public static void m250415a(VideoChat.Type type, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error_type_alarm", "failCreate");
            jSONObject.put("fail_create_error_code", i);
            jSONObject.put("on_the_call", 0);
            C63685a.m249654a("vcex_meeting_error", jSONObject, (JSONObject) null);
            if (type == VideoChat.Type.CALL) {
                C63726b.m249914a("vcex_meeting_error", jSONObject);
            } else {
                C63726b.m249917b("vcex_meeting_error", jSONObject);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
