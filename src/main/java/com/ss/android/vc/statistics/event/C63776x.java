package com.ss.android.vc.statistics.event;

import com.bytedance.ee.bear.doc.follow.impl.rn.RNFollowEvent;
import com.google.firebase.messaging.Constants;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.service.impl.C63682b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.event.x */
public class C63776x {
    /* renamed from: a */
    public static void m250399a(RNFollowEvent rNFollowEvent) {
        if (rNFollowEvent == null) {
            C60700b.m235851b("FollowTrackEvent", "[process]", "rnFollowEvent is null");
        } else if (rNFollowEvent.dataJson == null) {
            C60700b.m235851b("FollowTrackEvent", "[process]", "rnFollowEvent.dataJson is null");
        } else {
            C60700b.m235851b("FollowTrackEvent", "[process]", "sendFollowTrackEvent");
            m250400a(rNFollowEvent.dataJson);
        }
    }

    /* renamed from: a */
    public static void m250400a(String str) {
        try {
            C63682b.m249642a("vc_meeting_magic_share_stat", (JSONObject) ((JSONObject) new JSONArray(str).get(0)).get(Constants.ScionAnalytics.MessageType.DATA_MESSAGE));
        } catch (JSONException e) {
            C60700b.m235864f("FollowTrackEvent", "[sendFollowTrackEvent]", "JSONException");
            e.printStackTrace();
        }
    }
}
