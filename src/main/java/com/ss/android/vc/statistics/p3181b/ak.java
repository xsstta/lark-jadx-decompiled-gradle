package com.ss.android.vc.statistics.p3181b;

import android.text.TextUtils;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.statistics.p3183d.C63728b;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.b.ak */
public class ak {

    /* renamed from: a */
    private static final List<String> f160820a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public static void m249761a(String str, VideoChat videoChat) {
        if (!TextUtils.isEmpty(str) && videoChat != null) {
            Participant c = ParticipantUtil.m248731c(videoChat.getParticipants());
            if (c != null) {
                List<String> list = f160820a;
                if (list.contains(c.getInteractiveId())) {
                    C60700b.m235851b("XiaoMiVoipEvent", "[sendPushClickEvent]", "duplicate: " + str);
                    return;
                }
                list.add(c.getInteractiveId());
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("click", str);
                C63728b.m249928a("vc_xiaomi_call_offline_push_click", jSONObject, videoChat);
            } catch (JSONException e) {
                C60700b.m235851b("XiaoMiVoipEvent", "[sendPushClickEvent2]", e.getMessage());
            }
        }
    }
}
