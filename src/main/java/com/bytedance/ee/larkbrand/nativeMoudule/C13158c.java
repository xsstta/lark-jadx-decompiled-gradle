package com.bytedance.ee.larkbrand.nativeMoudule;

import com.tt.miniapphost.AbstractC67550j;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.c */
public class C13158c extends AbstractC67550j {
    @Override // com.tt.miniapphost.AbstractC67550j
    /* renamed from: a */
    public String mo49103a() {
        return "previewImage";
    }

    @Override // com.tt.miniapphost.AbstractC67550j
    /* renamed from: a */
    public String mo49104a(String str, AbstractC67550j.AbstractC67551a aVar) throws Exception {
        return null;
    }

    /* renamed from: a */
    public static List<String> m53778a(JSONObject jSONObject, String str) {
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                String optString = optJSONArray.optString(i);
                if (!optString.startsWith("file://")) {
                    arrayList.add(optString);
                } else if (new File(optString.replace("file://", "")).exists()) {
                    arrayList.add(optString);
                }
            }
        }
        return arrayList;
    }
}
