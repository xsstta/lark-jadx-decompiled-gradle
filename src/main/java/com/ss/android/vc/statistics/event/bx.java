package com.ss.android.vc.statistics.event;

import com.google.firebase.messaging.Constants;
import com.huawei.hms.android.HwBuildEx;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

public class bx {
    /* renamed from: a */
    public static void m250225a(int i, VideoChat videoChat) {
        String str;
        switch (i) {
            case 0:
                str = Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION;
                break;
            case 1:
                str = "close";
                break;
            case 2:
                str = "to_bottom";
                break;
            case 3:
                str = "subtitle_setting";
                break;
            case 4:
                str = "search";
                break;
            case 5:
                str = "search_up";
                break;
            case 6:
                str = "search_down";
                break;
            case 7:
                str = "search_clear";
                break;
            case 8:
                str = "filter";
                break;
            case 9:
                str = "filter_user";
                break;
            case 10:
                str = "filter_clear";
                break;
            case 11:
                str = "subtitle_history";
                break;
            case HwBuildEx.VersionCodes.EMUI_5_1:
                str = "copy_subtitle";
                break;
            case 13:
                str = "docs_link";
                break;
            default:
                str = "";
                break;
        }
        m250226a(str, null, videoChat);
    }

    /* renamed from: a */
    public static void m250226a(String str, JSONObject jSONObject, VideoChat videoChat) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("action_name", str);
            if (jSONObject != null) {
                jSONObject2.put("extend_value", jSONObject);
            }
            C63726b.m249915a("vc_meeting_subtitle_page", jSONObject2, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
