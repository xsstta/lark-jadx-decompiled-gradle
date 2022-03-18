package com.bytedance.feelgood.p735a;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.feelgood.ADFeelGoodManager;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.feelgood.a.c */
public class C13912c {
    /* renamed from: a */
    public static String m56343a(C13910a aVar, String str, Map<String, String> map) {
        if (aVar == null) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", aVar.mo51233a());
            jSONObject.put("language", aVar.mo51237c());
            jSONObject.put("survey_type", "100");
            jSONObject.put("client_env", "2");
            jSONObject.put("device", aVar.mo51238d());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("user_id", aVar.mo51240f());
            jSONObject2.put("user_name", aVar.mo51241g());
            jSONObject2.put("web_id", aVar.mo51239e());
            jSONObject2.put("os_name", "android");
            jSONObject2.put("os_version", Build.VERSION.RELEASE);
            jSONObject2.put("device_name", Build.MODEL);
            ADFeelGoodManager a = ADFeelGoodManager.m56278a();
            if (!(a == null || a.mo51187b() == null)) {
                jSONObject2.put("app_version", a.mo51187b().mo51243i());
            }
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject2.put(entry.getKey().toString(), entry.getValue().toString());
                }
            }
            jSONObject.put("user", jSONObject2);
            if (!TextUtils.isEmpty(str)) {
                LinkedList linkedList = new LinkedList();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(ShareHitPoint.f121869d, str);
                jSONObject3.put("cnt", 1);
                jSONObject3.put("is_custom", 1);
                linkedList.add(jSONObject3);
                jSONObject.put("events", linkedList);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }
}
