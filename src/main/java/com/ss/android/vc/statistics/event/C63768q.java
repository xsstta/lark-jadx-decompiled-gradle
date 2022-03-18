package com.ss.android.vc.statistics.event;

import com.ss.android.lark.utils.C57859q;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.statistics.p3182c.C63726b;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.event.q */
public class C63768q {

    /* renamed from: a */
    private static HashMap<String, Boolean> f160916a = new HashMap<>();

    /* renamed from: a */
    public static void m250334a() {
        f160916a.clear();
    }

    /* renamed from: a */
    public static void m250335a(VideoChat videoChat, String str) {
        if (videoChat != null && f160916a.get(str) == null) {
            int i = 1;
            f160916a.put(str, true);
            Participant a = ParticipantUtil.m248703a(str, videoChat.getParticipants());
            if (a != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("action_name", "first_subscribe");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("from_uuid", C57859q.m224565a(a.getId()));
                    jSONObject2.put("from_device_id", a.getDeviceId());
                    jSONObject2.put("from_interactive_id", a.getInteractiveId());
                    if (!a.is_host()) {
                        i = 0;
                    }
                    jSONObject2.put("is_host", i);
                    jSONObject.put("extend_value", jSONObject2);
                    C63726b.m249918b("vc_monitor_sdk", jSONObject, videoChat);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
