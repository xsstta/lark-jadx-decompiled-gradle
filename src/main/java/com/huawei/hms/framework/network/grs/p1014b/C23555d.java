package com.huawei.hms.framework.network.grs.p1014b;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.local.model.C23590a;
import com.huawei.hms.framework.network.grs.local.model.C23591b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.huawei.hms.framework.network.grs.b.d */
public class C23555d extends AbstractC23552a {
    public C23555d(Context context) {
        String appConfigName = GrsApp.getInstance().getAppConfigName();
        Logger.m85371i("LocalManagerV2", "appConfigName is" + appConfigName);
        if (mo82854a(TextUtils.isEmpty(appConfigName) ? "grs_app_global_route_config.json" : appConfigName, context, true) == 0) {
            this.f58054d = true;
        }
    }

    @Override // com.huawei.hms.framework.network.grs.p1014b.AbstractC23552a
    /* renamed from: a */
    public int mo82853a(String str) {
        this.f58051a = new C23590a();
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONArray("applications").getJSONObject(0);
            this.f58051a.mo82946b(jSONObject.getString("name"));
            JSONArray jSONArray = jSONObject.getJSONArray("services");
            if (jSONArray == null || jSONArray.length() == 0) {
                return -1;
            }
            if (jSONObject.has("customservices")) {
                mo82859a(jSONObject.getJSONArray("customservices"));
            }
            return 0;
        } catch (JSONException e) {
            Logger.m85376w("LocalManagerV2", "parse appbean failed maybe json style is wrong.", e);
            return -1;
        }
    }

    @Override // com.huawei.hms.framework.network.grs.p1014b.AbstractC23552a
    /* renamed from: a */
    public List<C23591b> mo82857a(JSONArray jSONArray, JSONObject jSONObject) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList();
        }
        try {
            ArrayList arrayList = new ArrayList(16);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                C23591b bVar = new C23591b();
                bVar.mo82951b(jSONObject2.getString("id"));
                bVar.mo82952c(jSONObject2.getString("name"));
                bVar.mo82948a(jSONObject2.getString("description"));
                JSONArray jSONArray2 = null;
                String str = "countries";
                if (jSONObject2.has("countriesOrAreas")) {
                    str = "countriesOrAreas";
                } else if (!jSONObject2.has(str)) {
                    Logger.m85375w("LocalManagerV2", "current country or area group has not config countries or areas.");
                    HashSet hashSet = new HashSet(16);
                    if (jSONArray2 != null || jSONArray2.length() == 0) {
                        return new ArrayList();
                    }
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        hashSet.add((String) jSONArray2.get(i2));
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
            Logger.m85376w("LocalManagerV2", "parse countrygroup failed maybe json style is wrong.", e);
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
        // Method dump skipped, instructions count: 182
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.p1014b.C23555d.mo82861b(java.lang.String):int");
    }

    @Override // com.huawei.hms.framework.network.grs.p1014b.AbstractC23552a
    /* renamed from: e */
    public int mo82865e(String str) {
        return mo82864d(str);
    }
}
