package com.bytedance.bdturing;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class EventReport {

    /* renamed from: a */
    private static long f11112a;

    public enum CloseType {
        CLOSE_REASON_MASK("mask_click_close"),
        CLOSE_REASON_BACK("back_close"),
        CLOSE_REASON_APP("app_close"),
        CLOSE_FB_MASK("close_fb_mask"),
        CLOSE_FB_CLOSE("close_fb_close"),
        CLOSE_FB_FEEDBACK("close_fb_feedback"),
        CLOSE_FB_SYSTEM("close_fb_system");
        
        private String name;

        public String getName() {
            return this.name;
        }

        private CloseType(String str) {
            this.name = str;
        }
    }

    /* renamed from: a */
    public static void m14805a() {
        f11112a = System.currentTimeMillis();
    }

    /* renamed from: b */
    public static void m14812b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("key", "pop");
            m14811a("turing_verify_sdk", jSONObject);
        } catch (JSONException e) {
            LogUtil.m14894a(e);
        }
    }

    /* renamed from: c */
    public static void m14815c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("key", "background");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        m14811a("turing_verify_sdk", jSONObject);
    }

    /* renamed from: d */
    public static void m14818d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("key", "system_low");
            m14811a("turing_verify_sdk", jSONObject);
        } catch (JSONException e) {
            LogUtil.m14894a(e);
        }
    }

    /* renamed from: a */
    public static void m14808a(long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", j);
            jSONObject.put("key", "init");
            m14811a("turing_verify_sdk", jSONObject);
        } catch (JSONException e) {
            LogUtil.m14894a(e);
        }
    }

    /* renamed from: a */
    public static void m14806a(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", System.currentTimeMillis() - f11112a);
            jSONObject.put("result", i);
            jSONObject.put("key", "result");
            m14811a("turing_verify_sdk", jSONObject);
        } catch (JSONException e) {
            LogUtil.m14894a(e);
        }
    }

    /* renamed from: b */
    public static void m14813b(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("result", i);
            jSONObject.put("key", "orientation");
            m14811a("turing_verify_sdk", jSONObject);
        } catch (JSONException e) {
            LogUtil.m14894a(e);
        }
    }

    /* renamed from: c */
    public static void m14816c(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("result", i);
            jSONObject.put("key", "orientation_change");
            m14811a("turing_verify_sdk", jSONObject);
        } catch (JSONException e) {
            LogUtil.m14894a(e);
        }
    }

    /* renamed from: b */
    public static void m14814b(long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", j);
            jSONObject.put("key", "pre_create_success");
            m14811a("turing_verify_sdk", jSONObject);
        } catch (JSONException e) {
            LogUtil.m14894a(e);
        }
    }

    /* renamed from: c */
    public static void m14817c(long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", j);
            jSONObject.put("key", "pre_create_load_success");
            m14811a("turing_verify_sdk", jSONObject);
        } catch (JSONException e) {
            LogUtil.m14894a(e);
        }
    }

    /* renamed from: a */
    public static void m14810a(CloseType closeType) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", System.currentTimeMillis() - f11112a);
            jSONObject.put("result", closeType.getName());
            jSONObject.put("key", "close");
            m14811a("turing_verify_sdk", jSONObject);
        } catch (JSONException e) {
            LogUtil.m14894a(e);
        }
    }

    /* renamed from: a */
    public static void m14807a(int i, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", System.currentTimeMillis() - f11112a);
            jSONObject.put("result", i);
            jSONObject.put("custom", str);
            jSONObject.put("key", "load_webview");
            m14811a("turing_verify_sdk", jSONObject);
        } catch (JSONException e) {
            LogUtil.m14894a(e);
        }
    }

    /* renamed from: a */
    public static void m14809a(long j, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", j);
            jSONObject.put("result", i);
            jSONObject.put("key", "setting");
            m14811a("turing_verify_sdk", jSONObject);
        } catch (JSONException e) {
            LogUtil.m14894a(e);
        }
    }

    /* renamed from: a */
    public static void m14811a(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str)) {
            try {
                BdTuringConfig c = C3520a.m14831a().mo14275c();
                jSONObject.put("params_for_special", "turing");
                if (c != null) {
                    jSONObject.put("sdk_version", c.mo14218g());
                    jSONObject.put("host_app_id", c.mo14214c());
                }
                c.mo14230s().mo14301a(str, jSONObject);
                if (LogUtil.m14896a()) {
                    LogUtil.m14899d("event", jSONObject.toString());
                }
            } catch (Exception e) {
                LogUtil.m14894a(e);
            }
        }
    }
}
