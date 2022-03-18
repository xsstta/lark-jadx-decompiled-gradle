package com.lark.falcon.engine.p1061e;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.plugins.container.AbstractC25576a;
import com.larksuite.framework.apiplugin.LKEvent;
import com.ss.android.lark.sdk.C53241h;
import com.tt.miniapp.process.p3316a.C66612a;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.lark.falcon.engine.e.a */
public class C23973a {
    /* renamed from: a */
    public static void m87629a(AbstractC25576a aVar, String str) {
        AppBrandLogger.m52830i("WorkerCommonUtils", "notifyWorkerSessionChanged");
        if (aVar != null) {
            String a = C66612a.m260219a(str);
            if (!TextUtils.isEmpty(a)) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("mina_session", a);
                    jSONObject.put("session", Base64.encodeToString(jSONObject2.toString().getBytes(StandardCharsets.UTF_8), 2));
                    aVar.mo92179b(new LKEvent.C25888a().mo92168a("onAppSessionChanged").mo92169a(jSONObject).mo92171a());
                } catch (JSONException e) {
                    C53241h.m205898b("WorkerCommonUtils", "send session changed event fail with exception:" + e);
                }
            }
        } else {
            C53241h.m205898b("WorkerCommonUtils", "pm release");
        }
    }
}
