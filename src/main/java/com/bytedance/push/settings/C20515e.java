package com.bytedance.push.settings;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.bytedance.push.settings.e */
public class C20515e {
    /* renamed from: a */
    public List<String> mo69085a() {
        return new ArrayList();
    }

    /* renamed from: a */
    public List<String> mo69086a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.optString(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }
}
