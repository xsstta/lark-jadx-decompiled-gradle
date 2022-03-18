package com.ss.android.vc.statistics.event;

import android.text.TextUtils;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

public class aj {
    /* renamed from: a */
    public static void m250013a(String str, VideoChat videoChat, String str2) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("from_source", str);
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("env_id", str2);
                }
                C63726b.m249915a("vc_meeting_lark_entry", jSONObject, videoChat);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m250014a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("from_source", str);
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("unique_id", str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    jSONObject.put("env_id", str3);
                }
                C63726b.m249919c("vc_meeting_lark_entry", jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m250015a(String str, boolean z, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("from_source", str);
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("conference_id", str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    jSONObject.put("env_id", str3);
                }
                if (z) {
                    C63726b.m249917b("vc_meeting_lark_entry", jSONObject);
                } else {
                    C63726b.m249919c("vc_meeting_lark_entry", jSONObject);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
