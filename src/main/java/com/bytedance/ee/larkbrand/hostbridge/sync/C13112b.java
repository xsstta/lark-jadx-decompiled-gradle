package com.bytedance.ee.larkbrand.hostbridge.sync;

import android.os.Bundle;
import com.bytedance.ee.larkbrand.AboutDebugActivity;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3378d.AbstractC67571b;

/* renamed from: com.bytedance.ee.larkbrand.hostbridge.sync.b */
public class C13112b implements AbstractC67571b {
    @Override // com.tt.miniapphost.process.p3378d.AbstractC67571b
    /* renamed from: a */
    public String mo49139a() {
        return "force_debug_log";
    }

    @Override // com.tt.miniapphost.process.p3378d.AbstractC67571b
    /* renamed from: a */
    public CrossProcessDataEntity mo49138a(CrossProcessDataEntity crossProcessDataEntity) {
        if (AboutDebugActivity.f34421a) {
            return new CrossProcessDataEntity((Bundle) null);
        }
        return null;
    }
}
