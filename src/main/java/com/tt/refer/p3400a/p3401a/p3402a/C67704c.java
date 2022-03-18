package com.tt.refer.p3400a.p3401a.p3402a;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.refer.a.a.a.c */
public class C67704c {

    /* renamed from: a */
    private String f170546a;

    /* renamed from: b */
    private JSONObject f170547b;

    /* renamed from: c */
    private ReadableMap f170548c;

    /* renamed from: a */
    public String mo234999a() {
        return this.f170546a;
    }

    /* renamed from: b */
    public JSONObject mo235000b() {
        return this.f170547b;
    }

    /* renamed from: c */
    private void m263365c() {
        if (this.f170547b == null) {
            synchronized (this) {
                if (this.f170547b == null) {
                    try {
                        if (TextUtils.isEmpty(this.f170546a)) {
                            this.f170547b = new JSONObject();
                        } else {
                            this.f170547b = new JSONObject(this.f170546a);
                        }
                    } catch (JSONException e) {
                        this.f170547b = new JSONObject();
                        AppBrandLogger.m52829e("ApiInvokeParam", "ApiInvokeParam", e);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public <T> T mo234997a(String str) {
        m263365c();
        T t = (T) this.f170547b.opt(str);
        if (t == JSONObject.NULL) {
            return null;
        }
        return t;
    }

    public C67704c(ReadableMap readableMap) {
        this.f170548c = readableMap;
        if (readableMap != null) {
            JSONObject jSONObject = (JSONObject) m263364a(readableMap);
            this.f170547b = jSONObject;
            if (jSONObject != null) {
                this.f170546a = jSONObject.toString();
            }
        }
    }

    public C67704c(String str) {
        this.f170546a = str;
        try {
            this.f170547b = new JSONObject(this.f170546a);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("ApiInvokeParam", "JSONException", e);
            this.f170547b = new JSONObject();
        }
    }

    public C67704c(JSONObject jSONObject) {
        this.f170547b = jSONObject;
        if (jSONObject != null && jSONObject.length() > 0) {
            this.f170546a = this.f170547b.toString();
        }
    }

    /* renamed from: a */
    private Object m263364a(Object obj) {
        if (obj instanceof ReadableMap) {
            HashMap<String, Object> hashMap = ((ReadableMap) obj).toHashMap();
            JSONObject jSONObject = new JSONObject();
            if (hashMap != null) {
                for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                    try {
                        jSONObject.put(entry.getKey(), m263364a(entry.getValue()));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
            return jSONObject;
        } else if (!(obj instanceof ReadableArray)) {
            return obj;
        } else {
            ArrayList<Object> arrayList = ((ReadableArray) obj).toArrayList();
            JSONArray jSONArray = new JSONArray();
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    jSONArray.put(m263364a(arrayList.get(i)));
                }
            }
            return jSONArray;
        }
    }

    /* renamed from: a */
    public <T> T mo234998a(String str, T t) {
        T t2 = (T) mo234997a(str);
        if (t2 == null) {
            return t;
        }
        return t2;
    }
}
