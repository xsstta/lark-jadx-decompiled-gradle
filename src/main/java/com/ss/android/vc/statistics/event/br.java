package com.ss.android.vc.statistics.event;

import android.text.TextUtils;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

public class br {
    /* renamed from: a */
    public static void m250212a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from_source", "vc_meeting_page_sharing");
            C63726b.m249919c("copy_meeting_link", jSONObject);
        } catch (JSONException e) {
            C60700b.m235864f("QRCodeScanEvent", "[sendCopyMeetingLink]", e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m250213a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("conference_id", str);
                C63726b.m249919c("vc_vr_qr_code_scan", jSONObject);
            } catch (JSONException e) {
                C60700b.m235864f("QRCodeScanEvent", "[sendScanEvent]", e.getMessage());
            }
        }
    }
}
