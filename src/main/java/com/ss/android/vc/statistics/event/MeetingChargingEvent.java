package com.ss.android.vc.statistics.event;

import android.text.TextUtils;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.module.admin.VideoChatAdminSettings;
import com.ss.android.vc.statistics.p3182c.C63726b;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class MeetingChargingEvent {

    public enum DurationPopType {
        TenMinutes,
        Ending
    }

    public enum Type {
        PRESETTING,
        LIVE,
        SETTING,
        PSTN,
        SUBTITLE,
        RECORD
    }

    /* renamed from: a */
    public static void m249930a() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("function_type", "videochat_participant_limit");
            if (VideoChatAdminSettings.m239429i()) {
                str = "true";
            } else {
                str = "false";
            }
            jSONObject.put("admin_flag", str);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingChargingEvent", "[sendParticipantLimitPopupEvent]", e.getMessage());
        }
        m249933a("common_pricing_popup_view", "", null, jSONObject, null);
    }

    /* renamed from: b */
    public static void m249934b() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("function_type", "videochat_participant_limit");
            jSONObject.put("click", "go_auth");
            jSONObject.put("target", "none");
            if (VideoChatAdminSettings.m239429i()) {
                str = "true";
            } else {
                str = "false";
            }
            jSONObject.put("admin_flag", str);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingChargingEvent", "[sendParticipantLimitUrlClickEvent]", e.getMessage());
        }
        m249933a("common_pricing_popup_click", "", null, jSONObject, null);
    }

    /* renamed from: c */
    public static void m249935c() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("function_type", "videochat_duration_limit");
            jSONObject.put("click", "go_upgrade");
            jSONObject.put("target", "none");
            if (VideoChatAdminSettings.m239429i()) {
                str = "true";
            } else {
                str = "false";
            }
            jSONObject.put("admin_flag", str);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingChargingEvent", "[sendDurationLimitUrlClickEvent]", e.getMessage());
        }
        m249933a("common_pricing_popup_click", "", null, jSONObject, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.statistics.event.MeetingChargingEvent$1 */
    public static /* synthetic */ class C637291 {

        /* renamed from: a */
        static final /* synthetic */ int[] f160865a;

        /* renamed from: b */
        static final /* synthetic */ int[] f160866b;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0059 */
        static {
            /*
            // Method dump skipped, instructions count: 101
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.statistics.event.MeetingChargingEvent.C637291.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static void m249931a(DurationPopType durationPopType) {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("function_type", "videochat_duration_limit");
            if (VideoChatAdminSettings.m239429i()) {
                str = "true";
            } else {
                str = "false";
            }
            jSONObject.put("admin_flag", str);
            if (durationPopType != null) {
                int i = C637291.f160866b[durationPopType.ordinal()];
                if (i == 1) {
                    str2 = "ten_minutes";
                } else if (i != 2) {
                    str2 = "";
                } else {
                    str2 = "ending";
                }
                jSONObject.put("pop_type", str2);
            }
        } catch (JSONException e) {
            C60700b.m235864f("MeetingChargingEvent", "[sendDurationLimitPopupEvent]", e.getMessage());
        }
        m249933a("common_pricing_popup_view", "", null, jSONObject, null);
    }

    /* renamed from: a */
    public static void m249932a(Type type, VideoChat videoChat) {
        String str;
        String str2;
        String str3;
        String str4;
        JSONObject jSONObject = new JSONObject();
        switch (C637291.f160865a[type.ordinal()]) {
            case 1:
                str4 = "broadcast_public_function";
                str2 = str4;
                str = "";
                str3 = str;
                break;
            case 2:
                str = "host_panel";
                str2 = "vc_waiting_room_function";
                str3 = "";
                break;
            case 3:
                str = "presetting";
                str2 = "vc_waiting_room_function";
                str3 = "";
                break;
            case 4:
                str2 = "vc_pstn_function";
                str3 = "during_meeting";
                str = "";
                break;
            case 5:
                str4 = "feishu_minutes_function";
                str2 = str4;
                str = "";
                str3 = str;
                break;
            case 6:
                str4 = "vc_subtitle_function";
                str2 = str4;
                str = "";
                str3 = str;
                break;
            default:
                str = "";
                str3 = str;
                str2 = str3;
                break;
        }
        try {
            jSONObject.put("function_type", str2);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("is_presetting_panel", str);
            }
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("present_time", str3);
            }
        } catch (JSONException e) {
            C60700b.m235864f("MeetingChargingEvent", "[sendPricingTipPopupEvent]", e.getMessage());
        }
        m249933a("common_pricing_popup_view", "", null, jSONObject, videoChat);
    }

    /* renamed from: a */
    private static void m249933a(String str, String str2, String str3, JSONObject jSONObject, VideoChat videoChat) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("action_name", str2);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject2.put("from_source", str3);
            }
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject2.put(next, jSONObject.get(next).toString());
                }
            }
            C63726b.m249915a(str, jSONObject2, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingChargingEvent", "[sendEvent]", e.getMessage());
        }
    }
}
