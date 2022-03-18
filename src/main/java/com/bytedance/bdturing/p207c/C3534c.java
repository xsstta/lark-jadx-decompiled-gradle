package com.bytedance.bdturing.p207c;

import com.bytedance.bdturing.LogUtil;
import com.google.firebase.messaging.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.bdturing.c.c */
public class C3534c {

    /* renamed from: a */
    int f11161a;

    /* renamed from: b */
    String f11162b;

    /* renamed from: c */
    String f11163c;

    /* renamed from: d */
    String f11164d;

    /* renamed from: e */
    String f11165e;

    /* renamed from: f */
    C3529b f11166f;

    /* renamed from: a */
    private void m14874a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        this.f11161a = jSONObject.getInt("JSSDK");
        this.f11162b = jSONObject.getString("func");
        this.f11163c = jSONObject.getString("params");
        this.f11164d = jSONObject.getString("__msg_type");
        this.f11165e = jSONObject.getString("__callback_id");
    }

    C3534c(C3529b bVar, String str) {
        this.f11166f = bVar;
        try {
            m14874a(str);
        } catch (JSONException e) {
            LogUtil.m14894a(e);
        }
    }

    /* renamed from: a */
    public void mo14311a(int i, JSONObject jSONObject) {
        C3529b bVar = this.f11166f;
        if (bVar != null) {
            try {
                bVar.mo14304a(m14873a(i, "callback", jSONObject, this).toString());
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public static JSONObject m14873a(int i, String str, JSONObject jSONObject, C3534c cVar) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", i);
        jSONObject2.put("func", cVar.f11162b);
        jSONObject2.put("__msg_type", str);
        Object obj = jSONObject;
        if (jSONObject == null) {
            obj = "{}";
        }
        jSONObject2.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, obj);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("__params", jSONObject2);
        jSONObject3.put("__callback_id", cVar.f11165e);
        return jSONObject3;
    }

    /* renamed from: a */
    public static String m14872a(int i, String str, String str2, JSONObject jSONObject, String str3) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", i);
            jSONObject2.put("func", str);
            jSONObject2.put("__msg_type", str2);
            jSONObject2.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONObject);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("__params", jSONObject2);
            jSONObject3.put("__callback_id", str3);
            return jSONObject3.toString();
        } catch (JSONException e) {
            LogUtil.m14894a(e);
            return null;
        }
    }
}
