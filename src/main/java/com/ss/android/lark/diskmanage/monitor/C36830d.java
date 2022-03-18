package com.ss.android.lark.diskmanage.monitor;

import android.content.Context;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.diskmanage.monitor.d */
public final class C36830d {

    /* renamed from: a */
    private static AbstractC36831a f94662a;

    /* renamed from: com.ss.android.lark.diskmanage.monitor.d$a */
    public interface AbstractC36831a {
        void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);
    }

    /* renamed from: a */
    static AbstractC36831a m145305a() {
        return f94662a;
    }

    /* renamed from: a */
    public static void m145307a(AbstractC36831a aVar) {
        f94662a = aVar;
    }

    /* renamed from: a */
    public static void m145306a(Context context) {
        try {
            new C36826c().mo135654a(context);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    static void m145308a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (m145305a() != null) {
            f94662a.monitorEvent(str, jSONObject, jSONObject2, jSONObject3);
        }
    }
}
