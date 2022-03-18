package com.ss.android.vc.statistics.event;

import android.text.TextUtils;
import com.ss.android.lark.utils.C57859q;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

public class bi {
    /* renamed from: a */
    public static void m250166a(VideoChat videoChat) {
        m250171a("all_mute", (JSONObject) null, videoChat);
    }

    /* renamed from: b */
    public static void m250174b(VideoChat videoChat) {
        m250171a("copy_join_info", (JSONObject) null, videoChat);
    }

    /* renamed from: a */
    public static void m250168a(String str, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("attendee_uuid", C57859q.m224565a(str));
            m250171a("calling", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m250175b(String str, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("attendee_uuid", C57859q.m224565a(str));
            m250171a("cancel", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m250172a(boolean z, VideoChat videoChat) {
        int i;
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                i = 0;
            } else {
                i = 1;
            }
            jSONObject.put("action_enabled", i);
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("action_name", "all_mute");
                jSONObject2.put("from_source", "userlist");
                jSONObject2.put("extend_value", jSONObject);
                if (videoChat.getVideoChatSettings().isOpenBreakoutRoom()) {
                    jSONObject2.put("is_breakoutroom_start", 1);
                } else {
                    jSONObject2.put("is_breakoutroom_start", 0);
                }
                Participant c = ParticipantUtil.m248731c(videoChat.getParticipants());
                if (c != null) {
                    if (TextUtils.isEmpty(c.getBreakoutRoomId())) {
                        str = "mainroom";
                    } else {
                        str = "inrooms";
                    }
                    jSONObject2.put("user_location", str);
                }
                C63726b.m249915a("vc_meeting_page_userlist", jSONObject2, videoChat);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: c */
    public static void m250178c(String str, String str2, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("attendee_uuid", C57859q.m224565a(str));
            jSONObject.put("attendee_device_id", str2);
            m250171a("reclaim_host", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    public static void m250180d(String str, String str2, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("attendee_uuid", C57859q.m224565a(str));
            jSONObject.put("attendee_device_id", str2);
            m250171a("stop_sharing", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m250169a(String str, String str2, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("attendee_uuid", C57859q.m224565a(str));
            jSONObject.put("attendee_device_id", str2);
            m250171a("remove_user", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m250176b(String str, String str2, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("attendee_uuid", C57859q.m224565a(str));
            jSONObject.put("attendee_device_id", str2);
            m250171a("assign_host", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m250171a(String str, JSONObject jSONObject, VideoChat videoChat) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("action_name", str);
            jSONObject2.put("from_source", "userlist");
            if (jSONObject != null) {
                jSONObject2.put("extend_value", jSONObject);
            }
            C63726b.m249915a("vc_meeting_page_userlist", jSONObject2, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public static void m250179c(boolean z, String str, String str2, VideoChat videoChat) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                i = 0;
            } else {
                i = 1;
            }
            jSONObject.put("action_enabled", i);
            jSONObject.put("attendee_uuid", C57859q.m224565a(str));
            jSONObject.put("attendee_device_id", str2);
            m250171a("mic", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m250177b(boolean z, String str, String str2, VideoChat videoChat) {
        if (z) {
            try {
                m250171a("self_lower_hand", (JSONObject) null, videoChat);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("attendee_uuid", C57859q.m224565a(str));
            jSONObject.put("attendee_device_id", str2);
            m250171a("lower_hand", jSONObject, videoChat);
        }
    }

    /* renamed from: a */
    public static void m250170a(String str, String str2, boolean z, VideoChat videoChat) {
        String str3;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("attendee_uuid", C57859q.m224565a(str));
            jSONObject.put("attendee_device_id", str2);
            if (z) {
                str3 = "assign_cohost";
            } else {
                str3 = "withdraw_cohost";
            }
            m250171a(str3, jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m250173a(boolean z, String str, String str2, VideoChat videoChat) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                i = 0;
            } else {
                i = 1;
            }
            jSONObject.put("action_enabled", i);
            jSONObject.put("attendee_uuid", C57859q.m224565a(str));
            jSONObject.put("attendee_device_id", str2);
            m250171a("camera", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m250167a(C61303k kVar, String str, String str2, JSONObject jSONObject, VideoChat videoChat) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("action_name", str);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject2.put("from_source", str2);
            }
            if (kVar.al().mo213181h()) {
                jSONObject2.put("is_breakoutroom_start", 1);
            } else {
                jSONObject2.put("is_breakoutroom_start", 0);
            }
            if (kVar.al().mo213182i()) {
                jSONObject2.put("user_location", "inrooms");
            } else {
                jSONObject2.put("user_location", "mainroom");
            }
            if (jSONObject != null) {
                jSONObject2.put("extend_value", jSONObject);
            }
            C63726b.m249915a("vc_meeting_page_userlist", jSONObject2, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
