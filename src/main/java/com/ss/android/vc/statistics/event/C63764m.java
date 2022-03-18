package com.ss.android.vc.statistics.event;

import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.p3182c.C63724a;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.event.m */
public class C63764m {

    /* renamed from: a */
    private boolean f160914a;

    /* renamed from: a */
    public void mo220406a(VideoChat videoChat) {
        if (videoChat != null && videoChat.getType() == VideoChat.Type.CALL && C63724a.m249907a(videoChat) && !this.f160914a) {
            try {
                this.f160914a = true;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("call_join_type", 1);
                C63726b.m249915a("vc_call_success", jSONObject, videoChat);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
