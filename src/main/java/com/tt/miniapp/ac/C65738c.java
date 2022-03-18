package com.tt.miniapp.ac;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.p622a.p626b.C12810b;
import com.google.firebase.messaging.Constants;
import com.tt.miniapp.p3324r.C66718d;
import com.tt.miniapp.p3324r.p3325a.C66695a;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.ac.c */
public class C65738c {
    /* renamed from: a */
    public static C12810b m257721a(C66695a.C66696a aVar) {
        if (aVar == null) {
            return null;
        }
        C12810b bVar = new C12810b();
        bVar.f34201a = aVar.f168360a;
        bVar.f34203c = aVar.f168361b;
        if (C66718d.m260519a(bVar.f34203c)) {
            bVar.f34203c = "GET";
        }
        bVar.f34204d = aVar.f168362c;
        bVar.f34205e = aVar.f168363d;
        bVar.f34206f = aVar.f168364e;
        return bVar;
    }

    /* renamed from: a */
    public static C12810b m257722a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            C12810b bVar = new C12810b();
            bVar.f34201a = jSONObject.optString("url");
            bVar.f34202b = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            bVar.f34203c = jSONObject.optString("method");
            if (TextUtils.isEmpty(bVar.f34203c)) {
                bVar.f34203c = "GET";
            }
            bVar.f34204d = jSONObject.optJSONObject("header");
            bVar.f34205e = jSONObject.optJSONArray("protocols");
            bVar.f34206f = jSONObject.optBoolean("__skipDomainCheck__");
            return bVar;
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "tma_WSRequestUtil", e.getStackTrace());
            return null;
        }
    }
}
