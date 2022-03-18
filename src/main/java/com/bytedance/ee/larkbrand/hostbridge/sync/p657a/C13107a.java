package com.bytedance.ee.larkbrand.hostbridge.sync.p657a;

import android.text.TextUtils;
import com.ss.android.lark.littleapp.AbstractC41371j;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3378d.AbstractC67571b;

/* renamed from: com.bytedance.ee.larkbrand.hostbridge.sync.a.a */
public class C13107a implements AbstractC67571b {

    /* renamed from: a */
    private AbstractC41371j f34795a;

    @Override // com.tt.miniapphost.process.p3378d.AbstractC67571b
    /* renamed from: a */
    public String mo49139a() {
        return "lark_can_open_cloud_file";
    }

    public C13107a(AbstractC41371j jVar) {
        this.f34795a = jVar;
    }

    @Override // com.tt.miniapphost.process.p3378d.AbstractC67571b
    /* renamed from: a */
    public CrossProcessDataEntity mo49138a(CrossProcessDataEntity crossProcessDataEntity) {
        if (crossProcessDataEntity == null) {
            return null;
        }
        String b = crossProcessDataEntity.mo234744b("open_url");
        if (TextUtils.isEmpty(b) || !this.f34795a.mo149021f(b)) {
            return null;
        }
        return CrossProcessDataEntity.C67574a.m263013a().mo234763b();
    }
}
