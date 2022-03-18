package com.ss.android.vc.statistics.event;

import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.event.ab */
public class C63731ab {

    /* renamed from: b */
    private static boolean f160869b;

    /* renamed from: c */
    private static boolean f160870c;

    /* renamed from: a */
    private long f160871a;

    /* renamed from: a */
    public void mo220386a() {
        this.f160871a = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void mo220387a(VideoChat videoChat) {
        if (this.f160871a > 0 && !f160869b) {
            try {
                f160869b = true;
                long currentTimeMillis = System.currentTimeMillis() - this.f160871a;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("video_duration", currentTimeMillis);
                C63726b.m249915a("vc_monitor_join_to_stream", jSONObject, videoChat);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public void mo220388b(VideoChat videoChat) {
        if (this.f160871a > 0 && !f160870c) {
            try {
                f160870c = true;
                long currentTimeMillis = System.currentTimeMillis() - this.f160871a;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("audio_duration", currentTimeMillis);
                C63726b.m249915a("vc_monitor_join_to_stream", jSONObject, videoChat);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
