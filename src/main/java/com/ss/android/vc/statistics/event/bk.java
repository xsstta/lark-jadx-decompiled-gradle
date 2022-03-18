package com.ss.android.vc.statistics.event;

import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.module.floatingwindow.IFloatWindowPresent;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

public class bk {
    /* renamed from: a */
    public static void m250182a(VideoChat videoChat, IFloatWindowPresent.FloatWindowType floatWindowType) {
        if (floatWindowType == IFloatWindowPresent.FloatWindowType.BUBBLE) {
            m250183a(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, "normal", null, videoChat);
        } else if (floatWindowType == IFloatWindowPresent.FloatWindowType.FAST_ENTRY) {
            m250183a(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, "inside_float_window", null, videoChat);
        }
    }

    /* renamed from: b */
    public static void m250184b(VideoChat videoChat, IFloatWindowPresent.FloatWindowType floatWindowType) {
        if (floatWindowType == IFloatWindowPresent.FloatWindowType.BUBBLE) {
            m250183a("click", "normal", null, videoChat);
        } else if (floatWindowType == IFloatWindowPresent.FloatWindowType.FAST_ENTRY) {
            m250183a("click", "inside_float_window", null, videoChat);
        }
    }

    /* renamed from: a */
    private static void m250183a(String str, String str2, JSONObject jSONObject, VideoChat videoChat) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("action_name", str);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject2.put("from_source", str2);
            }
            if (jSONObject != null) {
                jSONObject2.put("extend_value", jSONObject);
            }
            if (videoChat != null) {
                C63726b.m249915a("vc_meeting_window_onthecall", jSONObject2, videoChat);
            } else {
                C63726b.m249919c("vc_meeting_window_onthecall", jSONObject2);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
