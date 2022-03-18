package com.tt.miniapphost.process.p3379e;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapphost.process.data.C67575a;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3375a.C67560a;

/* renamed from: com.tt.miniapphost.process.e.a */
public class C67577a {

    /* renamed from: a */
    private final C67575a.C67576a f170397a;

    /* renamed from: a */
    public C67575a.C67576a mo234766a() {
        return this.f170397a;
    }

    public C67577a(C67575a.C67576a aVar) {
        this.f170397a = aVar;
    }

    /* renamed from: a */
    public void mo234767a(CrossProcessDataEntity crossProcessDataEntity) {
        if (crossProcessDataEntity != null) {
            AppBrandLogger.m52828d("AsyncIpcHandler", "host process callback to miniapp process with data " + crossProcessDataEntity.toString());
        }
        mo234768a(crossProcessDataEntity, false);
    }

    /* renamed from: a */
    public void mo234768a(CrossProcessDataEntity crossProcessDataEntity, boolean z) {
        C67575a.C67576a aVar = this.f170397a;
        if (aVar == null) {
            AppBrandLogger.m52829e("AsyncIpcHandler", "mCallerProcess == null", crossProcessDataEntity);
            return;
        }
        C67560a.m262958a(aVar, crossProcessDataEntity, z);
    }
}
