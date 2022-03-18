package com.bytedance.ug.sdk.share.impl.p921e;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.ug.sdk.share.api.entity.TokenInfoBean;
import com.bytedance.ug.sdk.share.impl.p919c.C20826a;
import com.bytedance.ug.sdk.share.impl.p928j.C20852c;
import com.bytedance.ug.sdk.share.impl.p928j.C20854e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ug.sdk.share.impl.e.c */
public class C20832c {
    /* renamed from: a */
    public static void m75870a(TokenInfoBean tokenInfoBean) {
        JSONObject jSONObject = new JSONObject();
        if (tokenInfoBean != null) {
            try {
                jSONObject.put("show_from", tokenInfoBean.getTokenType());
                jSONObject.put("media_type", tokenInfoBean.getMediaType());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        m75871a(jSONObject);
        C20852c.m75908a("ug_sdk_share_recognize_popup_show", jSONObject);
    }

    /* renamed from: a */
    public static void m75871a(JSONObject jSONObject) {
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

    /* renamed from: a */
    public static void m75872a(boolean z, String str, String str2) {
        int i;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("recognize_type", str);
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("is_success", i);
            jSONObject.put("failed_reason", str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        m75871a(jSONObject);
        C20852c.m75908a("ug_sdk_share_recognize_interface_request", jSONObject);
    }
}
