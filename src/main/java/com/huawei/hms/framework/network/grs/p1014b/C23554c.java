package com.huawei.hms.framework.network.grs.p1014b;

import android.content.Context;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.local.model.C23590a;
import com.huawei.hms.framework.network.grs.local.model.C23591b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.huawei.hms.framework.network.grs.b.c */
public class C23554c extends AbstractC23552a {
    public C23554c(Context context) {
        if (mo82854a("grs_sdk_global_route_config.json", context, false) == 0) {
            this.f58054d = true;
        }
    }

    @Override // com.huawei.hms.framework.network.grs.p1014b.AbstractC23552a
    /* renamed from: a */
    public int mo82853a(String str) {
        this.f58051a = new C23590a();
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("application");
            String string = jSONObject.getString("name");
            long j = jSONObject.getLong("cacheControl");
            JSONArray jSONArray = jSONObject.getJSONArray("services");
            this.f58051a.mo82946b(string);
            this.f58051a.mo82943a(j);
            return (jSONArray == null || jSONArray.length() == 0) ? -1 : 0;
        } catch (JSONException e) {
            Logger.m85376w("LocalManagerV1", "parse appbean failed maybe json style is wrong.", e);
            return -1;
        }
    }

    @Override // com.huawei.hms.framework.network.grs.p1014b.AbstractC23552a
    /* renamed from: a */
    public List<C23591b> mo82857a(JSONArray jSONArray, JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return new ArrayList();
        }
        try {
            ArrayList arrayList = new ArrayList(16);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                C23591b bVar = new C23591b();
                bVar.mo82951b(next);
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                bVar.mo82952c(jSONObject2.getString("name"));
                bVar.mo82948a(jSONObject2.getString("description"));
                JSONArray jSONArray2 = null;
                String str = "countries";
                if (jSONObject2.has("countriesOrAreas")) {
                    str = "countriesOrAreas";
                } else if (!jSONObject2.has(str)) {
                    Logger.m85375w("LocalManagerV1", "current country or area group has not config countries or areas.");
                    HashSet hashSet = new HashSet(16);
                    if (jSONArray2 != null || jSONArray2.length() == 0) {
                        return new ArrayList();
                    }
                    for (int i = 0; i < jSONArray2.length(); i++) {
                        hashSet.add((String) jSONArray2.get(i));
                    }
                    bVar.mo82949a(hashSet);
                    arrayList.add(bVar);
                }
                jSONArray2 = jSONObject2.getJSONArray(str);
                HashSet hashSet2 = new HashSet(16);
                if (jSONArray2 != null) {
                }
                return new ArrayList();
            }
            return arrayList;
        } catch (JSONException e) {
            Logger.m85376w("LocalManagerV1", "parse countryGroups failed maybe json style is wrong.", e);
            return new ArrayList();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    @Override // com.huawei.hms.framework.network.grs.p1014b.AbstractC23552a
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo82861b(java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 183
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.p1014b.C23554c.mo82861b(java.lang.String):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0097 A[LOOP:2: B:19:0x0091->B:21:0x0097, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ef  */
    @Override // com.huawei.hms.framework.network.grs.p1014b.AbstractC23552a
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo82865e(java.lang.String r19) {
        /*
        // Method dump skipped, instructions count: 266
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.p1014b.C23554c.mo82865e(java.lang.String):int");
    }
}
