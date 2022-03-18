package com.ss.android.vc.statistics.event;

import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.event.b */
public class C63745b {
    /* renamed from: a */
    public static void m250134a(VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_sharer", 0);
            jSONObject.put("action_name", "send_request");
            C63726b.m249915a("vc_annotate_popup", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("AnnotateEvent", "[sendOnAccessibilityRequest]", e.getMessage());
        }
    }

    /* renamed from: b */
    public static void m250137b(VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_sharer", 0);
            jSONObject.put("action_name", "cancel");
            C63726b.m249915a("vc_annotate_popup", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("AnnotateEvent", "[sendOnAccessibilityCancel]", e.getMessage());
        }
    }

    /* renamed from: c */
    public static void m250138c(VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_sharer", 0);
            jSONObject.put("action_name", "annotate_onboarding_toast");
            C63726b.m249915a("vc_annotate_popup", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("AnnotateEvent", "[sendOnFirstOpenSketch]", e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m250136a(String str, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_sharer", 0);
            jSONObject.put("action_name", str);
            C63726b.m249915a("vc_annotate_control_bar", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("AnnotateEvent", "[sendOnControlBar]", e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m250135a(String str, int i, VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_sharer", 0);
            jSONObject.put("draw", str);
            String str2 = "";
            if (i == C60773o.m236126d(R.color.ud_B500)) {
                str2 = "blue";
            } else if (i == C60773o.m236126d(R.color.ud_R500)) {
                str2 = "red";
            } else if (i == C60773o.m236126d(R.color.ud_G500)) {
                str2 = "green";
            } else if (i == C60773o.m236126d(R.color.ud_Y500)) {
                str2 = "yellow";
            } else if (i == C60773o.m236126d(R.color.ud_P500)) {
                str2 = "purple";
            }
            jSONObject.put("color", str2);
            C63726b.m249915a("vc_annotate_usage_monitor", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("AnnotateEvent", "[sendOnDraw]", e.getMessage());
        }
    }
}
