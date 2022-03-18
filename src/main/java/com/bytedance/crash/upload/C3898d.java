package com.bytedance.crash.upload;

import com.bytedance.crash.entity.C3740a;
import com.bytedance.crash.entity.C3742b;
import com.bytedance.crash.util.C3955q;
import com.bytedance.crash.util.C3968x;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.upload.d */
public class C3898d {
    /* renamed from: a */
    public static boolean m16160a(JSONObject jSONObject, JSONArray jSONArray, C3740a.AbstractC3741a aVar) {
        JSONObject optJSONObject;
        if (C3955q.m16451a(jSONArray)) {
            C3968x.m16530a((Object) "uploadFromFile with empty aid Data ");
            return aVar.mo15109a(jSONObject);
        }
        int i = 0;
        boolean z = true;
        while (i < jSONArray.length() && (optJSONObject = jSONArray.optJSONObject(i)) != null) {
            JSONObject jSONObject2 = new JSONObject();
            C3742b.m15437b(jSONObject2, jSONObject);
            C3742b.m15437b(jSONObject2, optJSONObject);
            C3968x.m16530a((Object) ("uploadFromFile with aidData " + optJSONObject));
            z &= aVar.mo15109a(jSONObject2);
            i++;
        }
        return z;
    }
}
