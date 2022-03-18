package com.ss.android.lark.jsbridge;

import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.jsbridge.g */
public class C40671g {

    /* renamed from: a */
    private String f103276a;

    /* renamed from: b */
    private String f103277b;

    /* renamed from: c */
    private String f103278c;

    /* renamed from: d */
    private String f103279d;

    /* renamed from: e */
    private String f103280e;

    /* renamed from: a */
    public String mo146784a() {
        return this.f103277b;
    }

    /* renamed from: b */
    public String mo146785b() {
        return this.f103278c;
    }

    /* renamed from: c */
    public String mo146787c() {
        return this.f103276a;
    }

    /* renamed from: d */
    public String mo146789d() {
        return this.f103279d;
    }

    /* renamed from: e */
    public String mo146791e() {
        return this.f103280e;
    }

    /* renamed from: f */
    public String mo146793f() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("callbackId", mo146787c());
            if (TextUtils.isEmpty(mo146791e())) {
                jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, mo146789d());
                jSONObject.put("handlerName", mo146791e());
            } else {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("name", mo146791e());
                if (!TextUtils.isEmpty(mo146789d())) {
                    jSONObject2.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, mo146789d());
                }
                jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONObject2);
                jSONObject.put("handlerName", "fireEvent");
            }
            jSONObject.put("responseData", mo146785b());
            jSONObject.put("responseId", mo146784a());
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.w("JSBridgeMessage", "to JSON failed", e);
            return null;
        }
    }

    /* renamed from: f */
    public void mo146794f(String str) {
        this.f103280e = str;
    }

    /* renamed from: b */
    public void mo146786b(String str) {
        this.f103277b = str;
    }

    /* renamed from: c */
    public void mo146788c(String str) {
        this.f103278c = str;
    }

    /* renamed from: d */
    public void mo146790d(String str) {
        this.f103276a = str;
    }

    /* renamed from: e */
    public void mo146792e(String str) {
        this.f103279d = str;
    }

    /* renamed from: a */
    public static List<C40671g> m160685a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                C40671g gVar = new C40671g();
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String str2 = null;
                gVar.mo146794f(jSONObject.has("handlerName") ? jSONObject.getString("handlerName") : null);
                gVar.mo146790d(jSONObject.has("callbackId") ? jSONObject.getString("callbackId") : null);
                gVar.mo146788c(jSONObject.has("responseData") ? jSONObject.getString("responseData") : null);
                gVar.mo146786b(jSONObject.has("responseId") ? jSONObject.getString("responseId") : null);
                if (jSONObject.has(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) {
                    str2 = jSONObject.getString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                }
                gVar.mo146792e(str2);
                arrayList.add(gVar);
            }
        } catch (JSONException e) {
            Log.w("JSBridgeMessage", "parse array failed", e);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static String m160684a(boolean z, String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("success", z);
            jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, str);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.w("JSBridgeMessage", "construct data failed", e);
            return null;
        }
    }
}
