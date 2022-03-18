package com.ss.android.lark.passport.infra.base.router;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.p2069j.p2070a.C40633aa;
import com.ss.android.lark.passport.infra.log.MonitorUtil;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;

/* renamed from: com.ss.android.lark.passport.infra.base.router.b */
public abstract class AbstractC49088b implements AbstractC49090d {

    /* renamed from: a */
    public PassportLog f123291a = PassportLog.m193684a(mo171382b());

    @Override // com.ss.android.lark.passport.infra.base.router.AbstractC49090d
    /* renamed from: a */
    public boolean mo171381a(String str, int i, UniContext uniContext) {
        return true;
    }

    /* renamed from: a */
    public PassportLog mo171379a() {
        return this.f123291a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public OPMonitorCode mo171382b() {
        return C40633aa.f103061a;
    }

    public AbstractC49088b() {
        RouterAnno routerAnno = (RouterAnno) getClass().getAnnotation(RouterAnno.class);
        if (routerAnno != null) {
            routerAnno.name();
        }
    }

    @Override // com.ss.android.lark.passport.infra.base.router.AbstractC49090d
    /* renamed from: a */
    public void mo171380a(Context context, String str, JSONObject jSONObject, int i, boolean z, UniContext uniContext, AbstractC49336a aVar) {
        String str2;
        RouterAnno routerAnno = (RouterAnno) getClass().getAnnotation(RouterAnno.class);
        if (routerAnno != null) {
            str2 = routerAnno.name();
        } else {
            str2 = getClass().getSimpleName();
        }
        MonitorUtil bVar = MonitorUtil.f123364a;
        MonitorUtil.m193720d(str2);
    }
}
