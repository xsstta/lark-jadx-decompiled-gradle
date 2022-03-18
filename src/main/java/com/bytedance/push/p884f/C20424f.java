package com.bytedance.push.p884f;

import android.os.Looper;
import com.bytedance.push.interfaze.AbstractC20449l;
import com.bytedance.push.utils.C20552c;
import com.ss.android.ug.bus.C60442b;
import org.json.JSONObject;

/* renamed from: com.bytedance.push.f.f */
class C20424f {

    /* renamed from: a */
    private static AbstractC20414a f49917a;

    /* renamed from: a */
    static Looper m74386a() {
        return Looper.getMainLooper();
    }

    /* renamed from: a */
    static void m74388a(AbstractC20414a aVar) {
        f49917a = aVar;
    }

    /* renamed from: a */
    private static JSONObject m74387a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new JSONObject(jSONObject.toString());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    static void m74389a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C20552c.m74845a("Monitor", "serviceName=" + str + ", category=" + jSONObject + ", metric=" + jSONObject2 + ", extraLog=" + jSONObject3);
        AbstractC20414a aVar = f49917a;
        if (aVar != null) {
            aVar.monitorEvent(str, jSONObject, jSONObject2, jSONObject3);
        } else {
            C20552c.m74850b("Monitor", "monitor impl is null when send event = " + str);
        }
        ((AbstractC20449l) C60442b.m234863a(AbstractC20449l.class)).mo68867a(str, m74387a(jSONObject), m74387a(jSONObject2), m74387a(jSONObject3));
    }
}
