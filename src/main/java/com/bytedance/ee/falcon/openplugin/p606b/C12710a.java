package com.bytedance.ee.falcon.openplugin.p606b;

import com.lark.falcon.engine.bridge.JavaOnlyArray;
import com.lark.falcon.engine.bridge.JavaOnlyMap;
import com.lark.falcon.engine.bridge.WritableArray;
import com.lark.falcon.engine.bridge.WritableMap;
import com.ss.android.lark.log.Log;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.falcon.openplugin.b.a */
public class C12710a {
    /* renamed from: a */
    private static boolean m52619a(Object obj) {
        if ((obj instanceof Integer) || (obj instanceof Double) || (obj instanceof Long) || (obj instanceof String) || (obj instanceof Boolean)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static WritableArray m52617a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                Object obj = jSONArray.get(i);
                if (m52619a(obj)) {
                    javaOnlyArray.add(obj);
                } else {
                    javaOnlyArray.pushNull();
                }
            } catch (JSONException e) {
                Log.m165384e("ConvertUtils", "JSONException", e);
            }
        }
        return javaOnlyArray;
    }

    /* renamed from: a */
    public static WritableMap m52618a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                Object obj = jSONObject.get(next);
                if (obj instanceof JSONObject) {
                    javaOnlyMap.putMap(next, m52618a((JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    javaOnlyMap.putArray(next, m52617a((JSONArray) obj));
                } else if (m52619a(obj)) {
                    javaOnlyMap.put(next, obj);
                } else {
                    javaOnlyMap.putNull(next);
                }
            } catch (JSONException e) {
                Log.m165384e("ConvertUtils", "JSONException", e);
            }
        }
        return javaOnlyMap;
    }
}
