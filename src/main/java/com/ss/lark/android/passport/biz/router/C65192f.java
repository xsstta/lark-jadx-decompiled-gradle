package com.ss.lark.android.passport.biz.router;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.passport.infra.base.router.AbstractC49088b;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterAnno;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.lark.android.passport.biz.compat.tenant.C64471a;

@RouterAnno(name = "idp_authentication")
/* renamed from: com.ss.lark.android.passport.biz.router.f */
public class C65192f extends AbstractC49088b {
    @Override // com.ss.android.lark.passport.infra.base.router.AbstractC49090d
    /* renamed from: c */
    public String mo171383c() {
        return "SwitchIDPAuthAction";
    }

    @Override // com.ss.android.lark.passport.infra.base.router.AbstractC49088b, com.ss.android.lark.passport.infra.base.router.AbstractC49090d
    /* renamed from: a */
    public void mo171380a(Context context, String str, JSONObject jSONObject, int i, boolean z, UniContext uniContext, AbstractC49336a aVar) {
        UICallbackExecutor.execute(new Runnable() {
            /* class com.ss.lark.android.passport.biz.router.C65192f.RunnableC651931 */

            public void run() {
                C64471a.f162788a.mo223063a(false);
            }
        });
        C49092f.m193532a(context, str, jSONObject, RouterScene.ALL.value, uniContext, this.f123291a, (AbstractC49336a) null);
    }
}
