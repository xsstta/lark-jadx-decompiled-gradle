package com.bytedance.ug.sdk.share.impl.p921e;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.ug.sdk.share.impl.p919c.C20826a;
import com.bytedance.ug.sdk.share.impl.p928j.C20854e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ug.sdk.share.impl.e.b */
public class C20831b {
    /* renamed from: a */
    public static void m75869a(boolean z) {
        JSONObject jSONObject = new JSONObject();
        m75868a(jSONObject);
        C20830a.m75867a("ug_sdk_share_recognize_interface_request", !z ? 1 : 0, null, jSONObject, null, null);
    }

    /* renamed from: a */
    public static void m75868a(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            String e = C20826a.m75837a().mo70301e();
            if (!TextUtils.isEmpty(e)) {
                jSONObject.put("ug_share_did", e);
            }
            String d = C20826a.m75837a().mo70300d();
            if (!TextUtils.isEmpty(d)) {
                jSONObject.put("ug_share_aid", d);
            }
            jSONObject.put("tag", "ug_sdk_share");
            jSONObject.put("ug_share_v_code", String.valueOf(220008));
            jSONObject.put("ug_share_v_name", "2.2.0-rc.8");
            jSONObject.put("ug_share_os_api", String.valueOf(Build.VERSION.SDK_INT));
            jSONObject.put("ug_share_platform", "android");
        } catch (JSONException e2) {
            C20854e.m75914b(e2.toString());
        }
    }
}
