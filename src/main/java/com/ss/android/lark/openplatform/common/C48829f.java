package com.ss.android.lark.openplatform.common;

import com.larksuite.framework.http.p1187b.AbstractC25990b;
import com.larksuite.framework.http.request.C26010a;
import com.larksuite.framework.http.request.RequestBody;
import com.larksuite.framework.http.response.BaseResponse;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.openplatform.common.f */
public final class C48829f {
    /* renamed from: a */
    private static String m192393a(AbstractC25990b bVar, String str, Map<String, String> map, JSONObject jSONObject) throws IOException {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        C26010a aVar = new C26010a();
        RequestBody create = RequestBody.create("application/json", jSONObject.toString());
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                aVar.mo92482d(entry.getKey());
                aVar.mo92473a(entry.getKey(), entry.getValue());
            }
        }
        BaseResponse baseResponse = (BaseResponse) bVar.mo92412a(aVar.mo92476b(create).mo92472a(str)).mo92407a(BaseResponse.class);
        if (baseResponse == null || baseResponse.body() == null) {
            return "";
        }
        return baseResponse.body().mo92409a();
    }

    /* renamed from: a */
    public static String m192394a(AbstractC25990b bVar, String str, Map<String, String> map, JSONObject jSONObject, long j) throws IOException {
        if (j <= 0) {
            return m192393a(bVar, str, map, jSONObject);
        }
        return m192395b(bVar, str, map, jSONObject, j);
    }

    /* renamed from: b */
    private static String m192395b(AbstractC25990b bVar, String str, Map<String, String> map, JSONObject jSONObject, long j) throws IOException {
        return m192393a(bVar.mo92413a().mo92417a(j, TimeUnit.MILLISECONDS).mo92422b(j, TimeUnit.MILLISECONDS).mo92423c(j, TimeUnit.MILLISECONDS).mo92421a(), str, map, jSONObject);
    }
}
