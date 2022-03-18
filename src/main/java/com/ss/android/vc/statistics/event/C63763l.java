package com.ss.android.vc.statistics.event;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.utils.C57859q;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.follow.FollowInfo;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.event.l */
public class C63763l {
    /* renamed from: f */
    public static void m250312f(VideoChat videoChat) {
        m250317k(videoChat);
    }

    /* renamed from: a */
    public static void m250299a(VideoChat videoChat) {
        m250302a("invite", (JSONObject) null, videoChat);
    }

    /* renamed from: b */
    public static void m250305b(VideoChat videoChat) {
        m250302a("share_screen", (JSONObject) null, videoChat);
    }

    /* renamed from: c */
    public static void m250308c(VideoChat videoChat) {
        m250302a("share_drive_files", (JSONObject) null, videoChat);
    }

    /* renamed from: d */
    public static void m250310d(VideoChat videoChat) {
        m250302a("stop_sharing", (JSONObject) null, videoChat);
    }

    /* renamed from: e */
    public static void m250311e(VideoChat videoChat) {
        m250302a("share_content", (JSONObject) null, videoChat);
    }

    /* renamed from: g */
    public static void m250313g(VideoChat videoChat) {
        m250302a("all_subtitles", (JSONObject) null, videoChat);
    }

    /* renamed from: h */
    public static void m250314h(VideoChat videoChat) {
        m250302a("annotate", (JSONObject) null, videoChat);
    }

    /* renamed from: i */
    public static void m250315i(VideoChat videoChat) {
        m250302a("click_agree", (JSONObject) null, videoChat);
    }

    /* renamed from: j */
    public static void m250316j(VideoChat videoChat) {
        m250302a("click_refuse", (JSONObject) null, videoChat);
    }

    /* renamed from: k */
    private static void m250317k(VideoChat videoChat) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
            if (VideoChatModule.getDependency().isNotificationUndisturbed()) {
                i = 0;
            } else {
                i = 1;
            }
            jSONObject.put("msg_notifications", i);
            C63726b.m249915a("vc_call_page_onthecall", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m250300a(VideoChat videoChat, boolean z) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("is_sharing", i);
            m250302a("switchview", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m250306b(VideoChat videoChat, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            int i = 1;
            jSONObject.put("action_enabled", 1);
            if (!z) {
                i = 0;
            }
            jSONObject.put("is_sharing", i);
            m250302a("minimize", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public static void m250309c(boolean z, VideoChat videoChat) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                str = "allow";
            } else {
                str = "deny";
            }
            jSONObject.put("action_name", str);
            C63726b.m249915a("vc_meeting_subtitle_popup", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m250307b(boolean z, VideoChat videoChat) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                str = "onthecall_page";
            } else {
                str = "calling_page";
            }
            jSONObject.put("from_source", str);
            C63726b.m249915a("vc_phone_call_interrupt", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m250303a(boolean z, VideoChat videoChat) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("action_enabled", i);
            m250302a("subtitle", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static void m250302a(String str, JSONObject jSONObject, VideoChat videoChat) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("action_name", str);
            if (jSONObject != null) {
                jSONObject2.put("extend_value", jSONObject);
            }
            C63726b.m249915a("vc_call_page_onthecall", jSONObject2, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m250301a(FollowInfo followInfo, Participant participant, VideoChat videoChat) {
        if (followInfo != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("file_token", C57859q.m224565a(followInfo.getToken()));
                jSONObject.put("sub_type", followInfo.getShareSubType().getNumber());
                jSONObject.put("follow_type", followInfo.getShareType().getNumber());
                jSONObject.put("attendee_uuid", C57859q.m224565a(participant.getId()));
                jSONObject.put("attendee_device_id", participant.getDeviceId());
                jSONObject.put("share_id", followInfo.getShareId());
                m250302a("assign_present", jSONObject, videoChat);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m250304a(boolean z, VideoChat videoChat, Boolean bool) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            int i2 = 0;
            if (z) {
                i = 0;
            } else {
                i = 1;
            }
            jSONObject.put("action_enabled", i);
            if (bool.booleanValue()) {
                i2 = 1;
            }
            jSONObject.put("is_sharing", i2);
            m250302a("camera", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
