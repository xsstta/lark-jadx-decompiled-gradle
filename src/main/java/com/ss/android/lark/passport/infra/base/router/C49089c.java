package com.ss.android.lark.passport.infra.base.router;

import android.app.Activity;
import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;

@RouterAnno(name = "clear_page_stack")
/* renamed from: com.ss.android.lark.passport.infra.base.router.c */
public class C49089c extends AbstractC49088b {
    @Override // com.ss.android.lark.passport.infra.base.router.AbstractC49090d
    /* renamed from: c */
    public String mo171383c() {
        return "ClearPageStackAction";
    }

    @Override // com.ss.android.lark.passport.infra.base.router.AbstractC49088b, com.ss.android.lark.passport.infra.base.router.AbstractC49090d
    /* renamed from: a */
    public void mo171380a(Context context, String str, JSONObject jSONObject, int i, boolean z, UniContext uniContext, AbstractC49336a aVar) {
        if (context instanceof Activity) {
            C49092f.m193522a((Activity) context);
        }
    }
}
