package com.bytedance.push.settings;

import com.bytedance.push.p883e.C20409d;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.bytedance.push.settings.l */
public class C20522l {
    /* renamed from: a */
    public List<C20409d> mo69094a() {
        return new ArrayList();
    }

    /* renamed from: a */
    public String mo69093a(List<C20409d> list) {
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            for (C20409d dVar : list) {
                if (dVar != null) {
                    jSONArray.put(dVar.mo68828a());
                }
            }
        }
        return jSONArray.toString();
    }

    /* renamed from: a */
    public List<C20409d> mo69095a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                C20409d a = C20409d.m74343a(jSONArray.optJSONObject(i));
                if (a != null) {
                    arrayList.add(a);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return arrayList;
    }
}
