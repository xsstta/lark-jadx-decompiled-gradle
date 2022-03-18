package com.ss.android.vc.statistics.event;

import android.text.TextUtils;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.event.h */
public class C63758h {
    /* renamed from: a */
    public static void m250287a(VideoChat videoChat, String str) {
        if (videoChat != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("env_id", str);
                }
                C63726b.m249915a("vc_call_client_create", jSONObject, videoChat);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
