package com.ss.android.lark.mm.statistics.hitpoint;

import com.ss.android.lark.mm.depend.C45899c;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mm.statistics.hitpoint.j */
public class C47087j {
    /* renamed from: a */
    public static JSONObject m186456a() {
        return m186458a(null);
    }

    /* renamed from: a */
    public static JSONObject m186458a(JSONObject jSONObject) {
        String str;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        C47088k.m186461a(jSONObject, "os_name", "android");
        C47088k.m186461a(jSONObject, "sub_platform", "android_native");
        if (C45899c.m181859a().getLoginDepend().mo144653e()) {
            str = "1";
        } else {
            str = "0";
        }
        C47088k.m186461a(jSONObject, "is_login", str);
        return jSONObject;
    }

    /* renamed from: a */
    public static JSONObject m186457a(C47084f fVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = m186456a();
        }
        if (fVar != null) {
            C47088k.m186462a(jSONObject, "conference_id", fVar.f118569a, "0");
            C47088k.m186461a(jSONObject, "is_page_owner", fVar.f118570b + "");
            C47088k.m186460a(jSONObject, "object_type", fVar.f118571c);
            C47088k.m186461a(jSONObject, "token", fVar.mo165407a());
            C47088k.m186461a(jSONObject, "is_page_editor", fVar.f118572d + "");
        }
        return jSONObject;
    }
}
