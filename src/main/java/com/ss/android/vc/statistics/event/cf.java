package com.ss.android.vc.statistics.event;

import com.ss.android.lark.utils.C57859q;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

public class cf {
    /* renamed from: a */
    public static void m250279a(C61303k kVar, String str, String str2, String str3) {
        int i;
        String str4;
        if (kVar != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("attendee_uuid", C57859q.m224565a(str2));
                jSONObject.put("attendee_device_id", str3);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("action_name", str);
                if (kVar.mo212056e().getVideoChatSettings().isOpenBreakoutRoom()) {
                    i = 1;
                } else {
                    i = 0;
                }
                jSONObject2.put("is_breakoutroom_start", i);
                if (kVar.al().mo213182i()) {
                    str4 = "inrooms";
                } else {
                    str4 = "mainroom";
                }
                jSONObject2.put("user_location", str4);
                jSONObject2.put("extend_value", jSONObject);
                C63726b.m249915a("vc_waiting_rooms_popup", jSONObject2, kVar.mo212056e());
            } catch (JSONException e) {
                C60700b.m235864f("WaitingRoomPopupEvent", "[sendWaitingRoomPopupEvent]", e.getMessage());
            }
        }
    }
}
