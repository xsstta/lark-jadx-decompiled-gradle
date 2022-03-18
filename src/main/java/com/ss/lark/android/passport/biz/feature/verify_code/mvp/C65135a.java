package com.ss.lark.android.passport.biz.feature.verify_code.mvp;

import com.ss.lark.android.passport.biz.base.p3210c.C64346a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.lark.android.passport.biz.feature.verify_code.mvp.a */
public class C65135a {
    /* renamed from: a */
    public static void m255829a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click", "change_method");
            jSONObject.put("target", "none");
            jSONObject.put("change_to", str);
            C64346a.m252967a("passport_verify_code_page_click", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
