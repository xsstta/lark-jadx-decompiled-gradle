package com.bytedance.ee.larkbrand.hostbridge.sync.p657a;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ee.larkbrand.C12941a;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3378d.AbstractC67571b;

/* renamed from: com.bytedance.ee.larkbrand.hostbridge.sync.a.e */
public class C13111e implements AbstractC67571b {
    @Override // com.tt.miniapphost.process.p3378d.AbstractC67571b
    /* renamed from: a */
    public String mo49139a() {
        return "lark_navigate_to_app";
    }

    @Override // com.tt.miniapphost.process.p3378d.AbstractC67571b
    /* renamed from: a */
    public CrossProcessDataEntity mo49138a(CrossProcessDataEntity crossProcessDataEntity) {
        if (crossProcessDataEntity == null) {
            return null;
        }
        String b = crossProcessDataEntity.mo234744b("app_url");
        int a = crossProcessDataEntity.mo234737a("scene", 1037);
        if (!TextUtils.isEmpty(b)) {
            try {
                C12941a.m53318a(AppbrandContext.getInst().getApplicationContext(), b, a);
            } catch (Exception unused) {
                return null;
            }
        }
        return new CrossProcessDataEntity((Bundle) null);
    }
}
