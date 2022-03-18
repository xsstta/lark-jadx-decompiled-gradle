package com.ss.android.vc.statistics.event;

import android.text.TextUtils;
import com.ss.android.lark.utils.C57859q;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.event.af */
public class C63736af {
    /* renamed from: a */
    public static void m249999a(String str, VideoChat videoChat, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action_name", str);
                jSONObject.put("extend_value", new JSONObject());
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("env_id", str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    jSONObject.put("context_id", str3);
                }
                C63726b.m249915a("vc_meeting_attend", jSONObject, videoChat);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m250000a(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action_name", str);
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("conference_id", str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    jSONObject.put("env_id", str3);
                }
                if (!TextUtils.isEmpty(str4)) {
                    jSONObject.put("context_id", str4);
                }
                jSONObject.put("extend_value", new JSONObject());
                C63726b.m249919c("vc_meeting_attend", jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public static void m250002b(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action_name", str);
                jSONObject.put("unique_id", str2);
                jSONObject.put("extend_value", new JSONObject());
                if (!TextUtils.isEmpty(str3)) {
                    jSONObject.put("env_id", str3);
                }
                if (!TextUtils.isEmpty(str4)) {
                    jSONObject.put("context_id", str4);
                }
                C63726b.m249919c("vc_meeting_attend", jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    public static void m250003c(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action_name", str);
                jSONObject.put("interview_unique_id", str2);
                jSONObject.put("extend_value", new JSONObject());
                if (!TextUtils.isEmpty(str3)) {
                    jSONObject.put("env_id", str3);
                }
                if (!TextUtils.isEmpty(str4)) {
                    jSONObject.put("context_id", str4);
                }
                C63726b.m249919c("vc_meeting_attend", jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    public static void m250004d(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action_name", str);
                jSONObject.put("meeting_num", C57859q.m224565a(str2));
                jSONObject.put("extend_value", new JSONObject());
                if (!TextUtils.isEmpty(str3)) {
                    jSONObject.put("env_id", str3);
                }
                if (!TextUtils.isEmpty(str4)) {
                    jSONObject.put("context_id", str4);
                }
                C63726b.m249919c("vc_meeting_attend", jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m250001a(String str, boolean z, String str2, String str3) {
        int i;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action_name", str);
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("env_id", str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    jSONObject.put("context_id", str3);
                }
                JSONObject jSONObject2 = new JSONObject();
                if (z) {
                    i = 1;
                } else {
                    i = 0;
                }
                jSONObject2.put("is_customize_title", i);
                jSONObject.put("extend_value", jSONObject2);
                C63726b.m249917b("vc_meeting_attend", jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
