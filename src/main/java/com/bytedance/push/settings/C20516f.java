package com.bytedance.push.settings;

import com.bytedance.push.p883e.C20403a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.push.settings.f */
public class C20516f {
    /* renamed from: a */
    public List<C20403a> mo69088a() {
        return new ArrayList();
    }

    /* renamed from: a */
    public String mo69087a(List<C20403a> list) {
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            for (C20403a aVar : list) {
                if (aVar != null) {
                    jSONArray.put(aVar.mo68807a());
                }
            }
        }
        return jSONArray.toString();
    }

    /* renamed from: a */
    public List<C20403a> mo69089a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    C20403a a = C20403a.m74324a(optJSONObject);
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return arrayList;
    }
}
