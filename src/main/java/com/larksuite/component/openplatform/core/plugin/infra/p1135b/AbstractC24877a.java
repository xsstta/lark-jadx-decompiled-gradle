package com.larksuite.component.openplatform.core.plugin.infra.p1135b;

import android.os.Bundle;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.b.a */
public abstract class AbstractC24877a extends AbstractC65797c {
    /* renamed from: a */
    public abstract void mo87932a(int i, String str, JSONObject jSONObject);

    /* renamed from: b */
    public abstract void mo87934b();

    public AbstractC24877a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C67500a mo87930a(OPMonitorCode oPMonitorCode) {
        return new C67500a(oPMonitorCode, mo230473f());
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo87933a(com.tt.miniapphost.process.data.CrossProcessDataEntity r11) {
        /*
        // Method dump skipped, instructions count: 118
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.infra.p1135b.AbstractC24877a.mo87933a(com.tt.miniapphost.process.data.CrossProcessDataEntity):void");
    }

    public AbstractC24877a(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public CrossProcessDataEntity mo87931a(boolean z, int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("success", z);
        bundle.putInt("errorCode", i);
        bundle.putString("errorMsg", str);
        return new CrossProcessDataEntity(bundle);
    }
}
