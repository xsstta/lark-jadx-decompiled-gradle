package com.bytedance.ee.bear.jsbridge;

import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Message {

    /* renamed from: a */
    private String f21352a;

    /* renamed from: b */
    private String f21353b;

    /* renamed from: c */
    private String f21354c;

    /* renamed from: d */
    private String f21355d;

    /* renamed from: e */
    private String f21356e;

    /* renamed from: f */
    private int f21357f = 2;

    @Retention(RetentionPolicy.SOURCE)
    public @interface MESSAGE_CHANNEL {
    }

    /* renamed from: a */
    public String mo30819a() {
        return this.f21353b;
    }

    /* renamed from: b */
    public String mo30821b() {
        return this.f21354c;
    }

    /* renamed from: c */
    public String mo30823c() {
        return this.f21352a;
    }

    /* renamed from: d */
    public String mo30825d() {
        return this.f21355d;
    }

    /* renamed from: e */
    public String mo30827e() {
        return this.f21356e;
    }

    /* renamed from: f */
    public String mo30829f() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("callbackId", mo30823c());
            jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, mo30825d());
            jSONObject.put("handlerName", mo30827e());
            jSONObject.put("responseData", mo30821b());
            jSONObject.put("responseId", mo30819a());
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public void mo30820a(String str) {
        this.f21353b = str;
    }

    /* renamed from: b */
    public void mo30822b(String str) {
        this.f21354c = str;
    }

    /* renamed from: c */
    public void mo30824c(String str) {
        this.f21352a = str;
    }

    /* renamed from: d */
    public void mo30826d(String str) {
        this.f21355d = str;
    }

    /* renamed from: e */
    public void mo30828e(String str) {
        this.f21356e = str;
    }

    /* renamed from: f */
    public static Message m31717f(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        Message message = new Message();
        try {
            JSONObject jSONObject = new JSONObject(str);
            String str6 = null;
            if (jSONObject.has("handlerName")) {
                str2 = jSONObject.getString("handlerName");
            } else {
                str2 = null;
            }
            message.mo30828e(str2);
            if (jSONObject.has("callbackId")) {
                str3 = jSONObject.getString("callbackId");
            } else {
                str3 = null;
            }
            message.mo30824c(str3);
            if (jSONObject.has("responseData")) {
                str4 = jSONObject.getString("responseData");
            } else {
                str4 = null;
            }
            message.mo30822b(str4);
            if (jSONObject.has("responseId")) {
                str5 = jSONObject.getString("responseId");
            } else {
                str5 = null;
            }
            message.mo30820a(str5);
            if (jSONObject.has(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) {
                str6 = jSONObject.getString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            }
            message.mo30826d(str6);
            return message;
        } catch (JSONException e) {
            e.printStackTrace();
            return message;
        }
    }

    /* renamed from: g */
    public static List<Message> m31718g(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                Message message = new Message();
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String str2 = null;
                message.mo30828e(jSONObject.has("handlerName") ? jSONObject.getString("handlerName") : null);
                message.mo30824c(jSONObject.has("callbackId") ? jSONObject.getString("callbackId") : null);
                message.mo30822b(jSONObject.has("responseData") ? jSONObject.getString("responseData") : null);
                message.mo30820a(jSONObject.has("responseId") ? jSONObject.getString("responseId") : null);
                if (jSONObject.has(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) {
                    str2 = jSONObject.getString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                }
                message.mo30826d(str2);
                C13479a.m54772d("jsbridge.Message", message.mo30827e());
                arrayList.add(message);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return arrayList;
    }
}
