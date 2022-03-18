package com.huawei.hms.framework.network.grs.p1015c.p1016a;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.p1015c.p1017b.C23565c;
import com.huawei.hms.framework.network.grs.p1018d.C23584c;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.huawei.hms.framework.network.grs.c.a.a */
public class C23560a {

    /* renamed from: a */
    private static final String f58063a = "a";

    /* renamed from: b */
    private static C23565c f58064b;

    /* renamed from: a */
    public static synchronized C23565c m85448a(Context context) {
        synchronized (C23560a.class) {
            C23565c cVar = f58064b;
            if (cVar != null) {
                return cVar;
            }
            String a = C23584c.m85559a("grs_sdk_server_config.json", context);
            ArrayList arrayList = null;
            if (TextUtils.isEmpty(a)) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(a).getJSONObject("grs_server");
                JSONArray jSONArray = jSONObject.getJSONArray("grs_base_url");
                if (jSONArray != null && jSONArray.length() > 0) {
                    arrayList = new ArrayList();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        arrayList.add(jSONArray.get(i).toString());
                    }
                }
                C23565c cVar2 = new C23565c();
                f58064b = cVar2;
                cVar2.mo82884a(arrayList);
                f58064b.mo82886b(jSONObject.getString("grs_query_endpoint_1.0"));
                f58064b.mo82883a(jSONObject.getString("grs_query_endpoint_2.0"));
                f58064b.mo82882a(jSONObject.getInt("grs_query_timeout"));
            } catch (JSONException e) {
                Logger.m85376w(f58063a, "getGrsServerBean catch JSONException", e);
            }
            return f58064b;
        }
    }
}
