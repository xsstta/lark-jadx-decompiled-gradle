package com.ss.lark.android.passport.biz.feature.accountandsecurity.p3219b;

import android.app.Activity;
import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.component.dybrid.h5core.p1076d.C24212a;
import com.ss.android.lark.passport.infra.base.router.AbstractC49088b;
import com.ss.android.lark.passport.infra.base.router.RouterAnno;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.lark.android.passport.biz.C64356c;

@RouterAnno(name = "modify_contact")
/* renamed from: com.ss.lark.android.passport.biz.feature.accountandsecurity.b.b */
public class C64605b extends AbstractC49088b {
    @Override // com.ss.android.lark.passport.infra.base.router.AbstractC49090d
    /* renamed from: c */
    public String mo171383c() {
        return "ModifyContactAction";
    }

    @Override // com.ss.android.lark.passport.infra.base.router.AbstractC49088b, com.ss.android.lark.passport.infra.base.router.AbstractC49090d
    /* renamed from: a */
    public void mo171380a(Context context, String str, JSONObject jSONObject, int i, boolean z, UniContext uniContext, AbstractC49336a aVar) {
        this.f123291a.mo171465b("ModifyContactAction", "router to ModifyContact");
        if (jSONObject == null) {
            this.f123291a.mo171471d("ModifyContactAction", "modify contact error");
            return;
        }
        C24212a.m88455a().mo86744c().mo86742a(str, jSONObject.toJSONString());
        C64356c.f162622a.mo222897a(context);
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
        if (aVar != null) {
            aVar.onRouterResult(-100, str);
        }
    }
}
