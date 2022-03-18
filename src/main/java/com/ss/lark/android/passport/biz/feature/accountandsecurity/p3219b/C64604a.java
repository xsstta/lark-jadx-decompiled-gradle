package com.ss.lark.android.passport.biz.feature.accountandsecurity.p3219b;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.ss.android.lark.passport.infra.base.router.AbstractC49088b;
import com.ss.android.lark.passport.infra.base.router.RouterAnno;
import com.ss.android.lark.passport.infra.widget.p2450d.C49266a;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.lark.android.passport.biz.feature.accountandsecurity.C64606c;

@RouterAnno(name = "account_management")
/* renamed from: com.ss.lark.android.passport.biz.feature.accountandsecurity.b.a */
public class C64604a extends AbstractC49088b {
    @Override // com.ss.android.lark.passport.infra.base.router.AbstractC49090d
    /* renamed from: c */
    public String mo171383c() {
        return "ContactPointManagerAction";
    }

    @Override // com.ss.android.lark.passport.infra.base.router.AbstractC49088b, com.ss.android.lark.passport.infra.base.router.AbstractC49090d
    /* renamed from: a */
    public void mo171380a(Context context, String str, JSONObject jSONObject, int i, boolean z, UniContext uniContext, AbstractC49336a aVar) {
        this.f123291a.mo171465b("ContactPointManagerAction", "router to account Management");
        if (jSONObject != null && !TextUtils.isEmpty(jSONObject.getString("message"))) {
            C49266a.m194147a(context, jSONObject.getString("message"));
        }
        C64606c.m253859a(context);
        if (aVar != null) {
            aVar.onRouterResult(-100, str);
        }
    }
}
