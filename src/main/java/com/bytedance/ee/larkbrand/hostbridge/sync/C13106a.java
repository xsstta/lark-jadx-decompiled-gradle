package com.bytedance.ee.larkbrand.hostbridge.sync;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.ss.android.lark.littleapp.AbstractC41371j;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3378d.AbstractC67571b;

/* renamed from: com.bytedance.ee.larkbrand.hostbridge.sync.a */
public class C13106a implements AbstractC67571b {

    /* renamed from: a */
    private AbstractC41371j f34794a;

    @Override // com.tt.miniapphost.process.p3378d.AbstractC67571b
    /* renamed from: a */
    public String mo49139a() {
        return "get_blank_rate";
    }

    public C13106a(AbstractC41371j jVar) {
        this.f34794a = jVar;
    }

    @Override // com.tt.miniapphost.process.p3378d.AbstractC67571b
    /* renamed from: a */
    public CrossProcessDataEntity mo49138a(CrossProcessDataEntity crossProcessDataEntity) {
        if (crossProcessDataEntity == null) {
            AppBrandLogger.m52829e("GetBlankRateHandler", "call data = null , so return");
            return null;
        }
        Double valueOf = Double.valueOf(this.f34794a.mo149038o(crossProcessDataEntity.mo234744b("app_id")));
        AppBrandLogger.m52830i("GetBlankRateHandler", "get Blank rate = " + valueOf);
        return CrossProcessDataEntity.C67574a.m263013a().mo234760a("blank_rate", (Object) valueOf).mo234763b();
    }
}
