package com.bytedance.apm6.util;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm6.util.b */
public class C3348b {
    /* renamed from: a */
    public static List<Object> m13923a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (jSONObject.optInt("wrapper_type_description", -1) != 1) {
            arrayList.add(jSONObject);
            return arrayList;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("wrapper_array_data");
        if (optJSONArray == null) {
            return null;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            try {
                arrayList.add(optJSONArray.get(i));
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static JSONObject m13924a(String str, JSONArray jSONArray) {
        try {
            JSONObject put = new JSONObject().put("wrapper_array_data", jSONArray);
            put.put("log_type", str);
            put.put("wrapper_type_description", 1);
            return put;
        } catch (Exception unused) {
            return null;
        }
    }
}
