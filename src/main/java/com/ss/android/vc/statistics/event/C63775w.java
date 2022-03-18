package com.ss.android.vc.statistics.event;

import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.event.w */
public class C63775w {
    /* renamed from: a */
    public static void m250397a() {
        C61303k kVar = (C61303k) MeetingManager.m238341a().mo211906j();
        if (kVar != null && kVar.mo212056e() != null) {
            C63726b.m249915a("vc_meeting_magic_share_popup_view", (JSONObject) null, kVar.mo212056e());
        }
    }

    /* renamed from: a */
    public static void m250398a(boolean z) {
        String str;
        C61303k kVar = (C61303k) MeetingManager.m238341a().mo211906j();
        if (kVar != null && kVar.mo212056e() != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (z) {
                    str = "confirm";
                } else {
                    str = "cancel";
                }
                jSONObject.put("click", str);
                C63726b.m249915a("vc_meeting_magic_share_popup_click", jSONObject, kVar.mo212056e());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
