package com.ss.android.vc.statistics.event;

import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.statistics.p3182c.C63726b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.event.i */
public class C63759i {

    /* renamed from: a */
    private static long f160911a;

    /* renamed from: b */
    private static long f160912b;

    /* renamed from: c */
    private static boolean f160913c;

    /* renamed from: d */
    public static boolean m250294d() {
        return f160913c;
    }

    /* renamed from: a */
    public static void m250288a() {
        f160911a = System.currentTimeMillis();
    }

    /* renamed from: b */
    public static void m250291b() {
        f160912b = System.currentTimeMillis();
    }

    /* renamed from: c */
    public static void m250293c() {
        f160911a = 0;
        f160912b = 0;
        f160913c = false;
    }

    /* renamed from: a */
    public static void m250290a(boolean z) {
        f160913c = z;
    }

    /* renamed from: a */
    public static void m250289a(VideoChat videoChat) {
        if (f160911a > 0) {
            try {
                long currentTimeMillis = System.currentTimeMillis() - f160911a;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("call_duration", currentTimeMillis);
                C63726b.m249915a("vc_call_dialingduration", jSONObject, videoChat);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public static void m250292b(VideoChat videoChat) {
        if (f160912b > 0) {
            try {
                long currentTimeMillis = System.currentTimeMillis() - f160912b;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("call_duration", currentTimeMillis);
                if (videoChat.isVoiceCall()) {
                    jSONObject.put("only_voice", 1);
                }
                C63726b.m249915a("vc_call_cancelduration", jSONObject, videoChat);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
