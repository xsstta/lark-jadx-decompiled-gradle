package com.ss.android.vc.statistics.event;

import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.event.p */
public class C63767p {
    /* renamed from: b */
    public static void m250331b() {
        C63726b.m249915a("vc_tab_dial_view", new JSONObject(), (VideoChat) null);
    }

    /* renamed from: a */
    public static void m250330a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click", "phone");
            jSONObject.put("target", "vc_tab_dial_view");
            C63726b.m249915a("vc_tab_click", jSONObject, (VideoChat) null);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public static void m250332c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click", "phone");
            jSONObject.put("target", "none");
            C63726b.m249915a("vc_tab_dial_click", jSONObject, (VideoChat) null);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    public static void m250333d() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click", "office_call");
            jSONObject.put("target", "none");
            C63726b.m249915a("vc_tab_list_click", jSONObject, (VideoChat) null);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
