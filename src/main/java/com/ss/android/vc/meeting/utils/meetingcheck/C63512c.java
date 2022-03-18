package com.ss.android.vc.meeting.utils.meetingcheck;

import android.text.TextUtils;
import com.ss.android.vc.meeting.framework.manager.MeetingUtil;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.statistics.C63685a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.meeting.utils.meetingcheck.c */
public class C63512c {
    /* renamed from: a */
    public static void m248917a(String str, String str2, C61303k kVar) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("from_source", "onthecall_join_meeting");
                jSONObject.put("action_name", str);
                JSONObject jSONObject2 = new JSONObject();
                if (kVar != null) {
                    jSONObject2.put("pre_conference_id", kVar.mo212055d());
                    jSONObject2.put("pre_interactive_id", MeetingUtil.m238372c(kVar.mo212056e()));
                }
                jSONObject.put("extend_value", jSONObject2);
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("env_id", str2);
                }
                C63685a.m249653a("vc_meeting_popup", jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
