package com.ss.android.vc.statistics.event;

import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.follow.FollowInfo;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.follow.common.C61806b;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.event.t */
public class C63771t {

    /* renamed from: a */
    public static int f160942a;

    /* renamed from: b */
    public static int f160943b;

    /* renamed from: a */
    public static void m250370a() {
        f160942a = 0;
        f160943b = 0;
    }

    /* renamed from: a */
    public static void m250371a(long j, long j2) {
        C61303k kVar = (C61303k) MeetingManager.m238341a().mo211906j();
        if (kVar != null && kVar.mo212056e() != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action_name", "init_sdk");
                jSONObject.put("check_init_time", j);
                jSONObject.put("preload_time", j2);
                C63726b.m249915a("vc_follow_docs_sdk", jSONObject, kVar.mo212056e());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m250372a(VideoChat videoChat, FollowInfo followInfo, int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (i != f160942a || i2 != f160943b) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("display_width", i);
                jSONObject.put("display_height", i2);
                jSONObject.put("ratio", 1);
                if (C61806b.m241471a(followInfo)) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                jSONObject.put("is_presenter", i3);
                if (followInfo == null) {
                    i4 = 0;
                } else {
                    i4 = followInfo.getShareId();
                }
                jSONObject.put("share_id", i4);
                jSONObject.put("is_main_display", 1);
                if (followInfo == null) {
                    i5 = 0;
                } else {
                    i5 = followInfo.getShareType();
                }
                jSONObject.put("follow_type", i5);
                C63726b.m249915a("vc_meeting_magic_share_display_size", jSONObject, videoChat);
                f160943b = i2;
                f160942a = i;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
