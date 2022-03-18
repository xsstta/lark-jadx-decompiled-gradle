package com.ss.android.lark.mm.statistics.hitpoint;

import android.app.Activity;
import android.content.Context;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.utils.C47098d;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mm.statistics.hitpoint.e */
public final class C47083e {
    /* renamed from: a */
    public static void m186426a(String str) {
        C45855f.m181663b("MmHitPoint", "sendEvent " + str);
        C45899c.m181859a().getHitPointDepend().mo144605a(str);
    }

    /* renamed from: a */
    public static void m186424a(C47084f fVar, String str) {
        C45855f.m181663b("MmHitPoint", "sendEvent  " + str + " " + fVar);
        C45899c.m181859a().getHitPointDepend().mo144603a(fVar, str);
    }

    /* renamed from: a */
    public static void m186427a(String str, JSONObject jSONObject) {
        C45855f.m181663b("MmHitPoint", "sendEvent " + str + " " + jSONObject);
        C45899c.m181859a().getHitPointDepend().mo144606a(str, jSONObject);
    }

    /* renamed from: a */
    public static void m186423a(Context context, String str, JSONObject jSONObject) {
        Activity a = C47098d.m186533a(context);
        if (a != null && (a instanceof MmHitPointContextProvider)) {
            m186425a(((MmHitPointContextProvider) a).mo161231e(), str, jSONObject);
        }
    }

    /* renamed from: a */
    public static void m186425a(C47084f fVar, String str, JSONObject jSONObject) {
        C45855f.m181663b("MmHitPoint", "sendEvent " + str + " " + jSONObject + " " + fVar);
        C45899c.m181859a().getHitPointDepend().mo144604a(fVar, str, jSONObject);
    }
}
