package com.ss.android.vc.statistics.event;

import android.text.TextUtils;
import com.ss.android.lark.utils.C57859q;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.event.bg */
public class C63749bg {
    /* renamed from: a */
    public static void m250163a(String str, VideoChat videoChat) {
        int i;
        if (videoChat != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                Participant a = ParticipantUtil.m248703a(str, videoChat.getParticipants());
                if (a != null && !TextUtils.isEmpty(a.getId()) && !TextUtils.isEmpty(a.getInteractiveId())) {
                    if (!TextUtils.isEmpty(a.getDeviceId())) {
                        jSONObject.put("from_uuid", C57859q.m224565a(a.getId()));
                        jSONObject.put("from_device_id", a.getDeviceId());
                        jSONObject.put("from_interactive_id", a.getInteractiveId());
                        if (a.is_host()) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        jSONObject.put("is_host", i);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("extend_value", jSONObject);
                        C63726b.m249918b("vc_meeting_success", jSONObject2, videoChat);
                        return;
                    }
                }
                C60700b.m235864f("MeetingSuccessEvent", "[sendMeetingSuccessEvent]", "[vc_meeting_success] error!");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
