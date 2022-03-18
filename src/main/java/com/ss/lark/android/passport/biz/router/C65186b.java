package com.ss.lark.android.passport.biz.router;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.component.universe_design.toast.UDToast;
import com.ss.android.lark.passport.infra.base.router.AbstractC49088b;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterAnno;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49202p;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.lark.android.passport.biz.entity.CloseAllStep;

@RouterAnno(name = "close_all")
/* renamed from: com.ss.lark.android.passport.biz.router.b */
public class C65186b extends AbstractC49088b {
    @Override // com.ss.android.lark.passport.infra.base.router.AbstractC49090d
    /* renamed from: c */
    public String mo171383c() {
        return "CloseAllAction";
    }

    @Override // com.ss.android.lark.passport.infra.base.router.AbstractC49088b, com.ss.android.lark.passport.infra.base.router.AbstractC49090d
    /* renamed from: a */
    public void mo171380a(Context context, String str, JSONObject jSONObject, int i, boolean z, UniContext uniContext, AbstractC49336a aVar) {
        CloseAllStep closeAllStep = (CloseAllStep) C49202p.m193967a(jSONObject, CloseAllStep.class);
        if (closeAllStep != null && !TextUtils.isEmpty(closeAllStep.getToastMsg())) {
            UDToast.build(context).mo91643a(closeAllStep.getToastMsg()).mo91656k();
        }
        boolean z2 = context instanceof Activity;
        if (z2) {
            ((Activity) context).finish();
        }
        if (z2 && C49092f.m193537d()) {
            C49092f.m193522a((Activity) context);
        } else if (!ServiceFinder.m193748c().isLogin()) {
            ServiceFinder.m193748c().openLogin(context, null);
        }
    }
}
