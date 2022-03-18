package com.bytedance.ee.larkbrand.hostbridge.sync.p657a;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.abtest.p646a.C12957a;
import com.ss.android.lark.littleapp.AbstractC41371j;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3378d.AbstractC67571b;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.hostbridge.sync.a.d */
public class C13110d implements AbstractC67571b {

    /* renamed from: a */
    private AbstractC41371j f34798a;

    @Override // com.tt.miniapphost.process.p3378d.AbstractC67571b
    /* renamed from: a */
    public String mo49139a() {
        return "lark_ab_experiment";
    }

    public C13110d(AbstractC41371j jVar) {
        this.f34798a = jVar;
    }

    @Override // com.tt.miniapphost.process.p3378d.AbstractC67571b
    /* renamed from: a */
    public CrossProcessDataEntity mo49138a(CrossProcessDataEntity crossProcessDataEntity) {
        JSONObject a;
        if (crossProcessDataEntity == null) {
            return null;
        }
        String b = crossProcessDataEntity.mo234744b("ab_experiment_key");
        if (TextUtils.isEmpty(b) || (a = C12957a.m53363a(b)) == null) {
            AppBrandLogger.m52829e("GetABExperimentHandler", "key is empty");
            return null;
        }
        AppBrandLogger.m52830i("GetABExperimentHandler", "handler ab experiment", a.toString());
        return CrossProcessDataEntity.C67574a.m263013a().mo234760a("ab_experiment_result", a).mo234763b();
    }
}
