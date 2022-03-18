package com.bytedance.ee.appstrategy.p240a;

import com.ss.android.lark.log.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.appstrategy.a.f */
public class C4148f {

    /* renamed from: a */
    public String f12604a;

    /* renamed from: b */
    public String f12605b;

    /* renamed from: c */
    public Map<String, Object> f12606c;

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("content", this.f12604a);
            jSONObject.putOpt("schema", this.f12605b);
            if (this.f12606c != null) {
                jSONObject.putOpt("extras", new JSONObject(this.f12606c));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.m165384e("TipsButton", "", e);
            return null;
        }
    }

    /* renamed from: a */
    public static C4148f m17249a(JSONObject jSONObject) {
        HashMap hashMap = null;
        if (jSONObject == null) {
            Log.m165397w("TipsButton", "json null");
            return null;
        }
        String optString = jSONObject.optString("content");
        String optString2 = jSONObject.optString("schema");
        JSONObject optJSONObject = jSONObject.optJSONObject("extras");
        if (optJSONObject != null && optJSONObject.length() > 0) {
            hashMap = new HashMap(optJSONObject.length());
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, optJSONObject.opt(next));
            }
        }
        return new C4148f(optString, optString2, hashMap);
    }

    public C4148f(String str, String str2, Map map) {
        this.f12604a = str;
        this.f12605b = str2;
        this.f12606c = map;
    }
}
