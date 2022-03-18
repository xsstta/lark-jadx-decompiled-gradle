package com.ss.android.vc.statistics.event;

import android.text.TextUtils;
import com.ss.android.lark.utils.C57859q;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.event.ag */
public class C63737ag {
    /* renamed from: a */
    public static void m250005a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2)) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("fail_reason", str);
                }
                if (!TextUtils.isEmpty(str3)) {
                    jSONObject.put("env_id", str3);
                }
                jSONObject.put("attend_timestamp", System.currentTimeMillis());
                jSONObject.put("unique_id", str2);
                C63726b.m249919c("vc_meeting_attend_fail", jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public static void m250007b(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2)) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("fail_reason", str);
                }
                if (!TextUtils.isEmpty(str3)) {
                    jSONObject.put("env_id", str3);
                }
                jSONObject.put("attend_timestamp", System.currentTimeMillis());
                jSONObject.put("interview_unique_id", str2);
                C63726b.m249919c("vc_meeting_attend_fail", jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    public static void m250008c(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2)) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("fail_reason", str);
                }
                if (!TextUtils.isEmpty(str3)) {
                    jSONObject.put("env_id", str3);
                }
                jSONObject.put("attend_timestamp", System.currentTimeMillis());
                jSONObject.put("meeting_num", C57859q.m224565a(str2));
                C63726b.m249919c("vc_meeting_attend_fail", jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m250006a(String str, String str2, boolean z, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("conference_id", str2);
            }
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("fail_reason", str);
            }
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("env_id", str3);
            }
            jSONObject.put("attend_timestamp", System.currentTimeMillis());
            if (z) {
                C63726b.m249917b("vc_meeting_attend_fail", jSONObject);
            } else {
                C63726b.m249919c("vc_meeting_attend_fail", jSONObject);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
