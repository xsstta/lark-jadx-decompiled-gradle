package com.ss.android.vc.statistics.event;

import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.net.service.RtcRenderOptimizeService;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.event.z */
public class C63778z {
    /* renamed from: a */
    public static void m250404a(VideoChat videoChat) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", "join");
            if (RtcRenderOptimizeService.getInstance().isValidDevice()) {
                jSONObject.put("is_render_opt", RtcRenderOptimizeService.getInstance().isRenderOptimizeDevice());
            }
            jSONObject.put("is_render_valid_device", RtcRenderOptimizeService.getInstance().isValidDevice());
            C63726b.m249915a("vc_monitor_sdk", jSONObject, videoChat);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
