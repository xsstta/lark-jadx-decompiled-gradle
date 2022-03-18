package com.bytedance.ee.bear.todocenter;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.todocenter.b */
public class C11688b {

    /* renamed from: a */
    private static final C10917c f31478a = new C10917c(new C10929e());

    /* renamed from: a */
    public static void m48499a(String str) {
        m48500a(str, null);
    }

    /* renamed from: a */
    public static void m48500a(String str, String str2) {
        try {
            AbstractC5233x b = C5234y.m21391b();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action", str);
            jSONObject.put("tab_status", "all");
            jSONObject.put(ShareHitPoint.f121868c, "home");
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("todo_id", str2);
            }
            b.mo21080a("client_todo_center", jSONObject);
        } catch (Exception e) {
            C13479a.m54761a("TodoReport", e);
        }
    }
}
