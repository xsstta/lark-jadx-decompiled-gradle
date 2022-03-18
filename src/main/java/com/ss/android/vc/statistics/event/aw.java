package com.ss.android.vc.statistics.event;

import android.text.TextUtils;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

public class aw {
    /* renamed from: b */
    private static void m250125b(boolean z) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", "mic");
            JSONObject jSONObject2 = new JSONObject();
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject2.put("action_enabled", i);
            jSONObject.put("extend_value", jSONObject2);
            C63726b.m249917b("vc_meeting_root_check", jSONObject);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingPermissionEvent", "[sendMicEvent]", e.getMessage());
        }
    }

    /* renamed from: a */
    private static void m250124a(boolean z) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", "camera");
            JSONObject jSONObject2 = new JSONObject();
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject2.put("action_enabled", i);
            jSONObject.put("extend_value", jSONObject2);
            C63726b.m249917b("vc_meeting_root_check", jSONObject);
        } catch (JSONException e) {
            C60700b.m235864f("MeetingPermissionEvent", "[sendCameraEvent]", e.getMessage());
        }
    }

    /* renamed from: com.ss.android.vc.statistics.event.aw$a */
    public static class C63744a {

        /* renamed from: a */
        public static String f160890a = C57744a.m224104a().getString("meeting_permission_meeting_id", "");

        /* renamed from: b */
        public static boolean f160891b = C57744a.m224104a().getBoolean("meeting_permission_camera_permission", false);

        /* renamed from: c */
        public static boolean f160892c = C57744a.m224104a().getBoolean("meeting_permission_mic_permission", false);

        /* renamed from: a */
        public static void m250126a(String str, boolean z, boolean z2) {
            f160890a = str;
            f160891b = z;
            f160892c = z2;
            C57744a.m224104a().putString("meeting_permission_meeting_id", f160890a);
            C57744a.m224104a().putBoolean("meeting_permission_camera_permission", f160891b);
            C57744a.m224104a().putBoolean("meeting_permission_mic_permission", f160892c);
        }
    }

    /* renamed from: a */
    public static void m250123a(String str, boolean z, boolean z2) {
        if (!TextUtils.equals(str, C63744a.f160890a)) {
            m250124a(z);
            m250125b(z2);
            C63744a.m250126a(str, z, z2);
            return;
        }
        if (z != C63744a.f160891b) {
            m250124a(z);
            C63744a.m250126a(str, z, z2);
        }
        if (z2 != C63744a.f160892c) {
            m250125b(z2);
            C63744a.m250126a(str, z, z2);
        }
    }
}
