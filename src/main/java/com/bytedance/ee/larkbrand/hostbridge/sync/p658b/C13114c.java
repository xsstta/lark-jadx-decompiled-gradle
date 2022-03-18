package com.bytedance.ee.larkbrand.hostbridge.sync.p658b;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.permission.C13288e;
import com.ss.android.lark.littleapp.entity.LittleAppPermissionData;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.p3362a.p3364b.C67440a;
import com.tt.miniapphost.p3362a.p3365c.C67448a;
import com.tt.miniapphost.p3362a.p3367e.C67462h;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3378d.AbstractC67571b;
import com.tt.refer.common.base.AppType;

/* renamed from: com.bytedance.ee.larkbrand.hostbridge.sync.b.c */
public class C13114c implements AbstractC67571b {
    @Override // com.tt.miniapphost.process.p3378d.AbstractC67571b
    /* renamed from: a */
    public String mo49139a() {
        return "lark_notify_permission";
    }

    /* renamed from: com.bytedance.ee.larkbrand.hostbridge.sync.b.c$1 */
    static /* synthetic */ class C131151 {

        /* renamed from: a */
        static final /* synthetic */ int[] f34801a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.tt.refer.common.base.AppType[] r0 = com.tt.refer.common.base.AppType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.larkbrand.hostbridge.sync.p658b.C13114c.C131151.f34801a = r0
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.WebAPP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.larkbrand.hostbridge.sync.p658b.C13114c.C131151.f34801a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.GadgetAPP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.larkbrand.hostbridge.sync.p658b.C13114c.C131151.<clinit>():void");
        }
    }

    @Override // com.tt.miniapphost.process.p3378d.AbstractC67571b
    /* renamed from: a */
    public CrossProcessDataEntity mo49138a(CrossProcessDataEntity crossProcessDataEntity) {
        if (crossProcessDataEntity == null) {
            return null;
        }
        String b = crossProcessDataEntity.mo234744b("permission");
        String b2 = crossProcessDataEntity.mo234744b("app_id");
        AppType appType = AppType.GadgetAPP;
        if (crossProcessDataEntity.mo234745c("app_type") != null) {
            appType = (AppType) crossProcessDataEntity.mo234745c("app_type");
        }
        IAppContext i = C67448a.m262353a().mo234190i();
        int i2 = C131151.f34801a[appType.ordinal()];
        if (i2 == 1) {
            i = new C67462h(AppbrandContext.getInst().getApplicationContext());
        } else if (i2 == 2 && (i = C67448a.m262353a().mo234181b(C67440a.m262344a(AppType.GadgetAPP, b2))) == null) {
            i = C67448a.m262353a().mo234190i();
        }
        if (TextUtils.isEmpty(b2)) {
            return null;
        }
        C13288e.m54115a().mo49527a(b2, (LittleAppPermissionData) JSON.parseObject(b, LittleAppPermissionData.class), i);
        return null;
    }
}
