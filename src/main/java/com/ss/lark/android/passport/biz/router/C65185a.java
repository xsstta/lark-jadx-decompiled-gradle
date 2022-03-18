package com.ss.lark.android.passport.biz.router;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.ss.android.lark.passport.infra.base.router.AbstractC49088b;
import com.ss.android.lark.passport.infra.base.router.RouterAnno;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.lark.android.passport.biz.utils.C65251f;

@RouterAnno(name = "account_appeal")
/* renamed from: com.ss.lark.android.passport.biz.router.a */
public class C65185a extends AbstractC49088b {
    @Override // com.ss.android.lark.passport.infra.base.router.AbstractC49090d
    /* renamed from: c */
    public String mo171383c() {
        return "AccountAppealAction";
    }

    @Override // com.ss.android.lark.passport.infra.base.router.AbstractC49088b, com.ss.android.lark.passport.infra.base.router.AbstractC49090d
    /* renamed from: a */
    public void mo171380a(Context context, String str, JSONObject jSONObject, int i, boolean z, UniContext uniContext, AbstractC49336a aVar) {
        if (jSONObject == null || context == null) {
            mo171379a().mo171471d("AccountAppealAction", "stepInfo or context is null!");
            return;
        }
        String string = jSONObject.getString("appeal_url");
        if (TextUtils.isEmpty(string)) {
            mo171379a().mo171471d("AccountAppealAction", "appealUrl is empty!");
            return;
        }
        C65251f.m256141a(context, string, this.f123291a);
        if (aVar != null) {
            aVar.onRouterResult(-102, null);
        }
    }
}
