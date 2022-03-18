package com.bytedance.ee.larkbrand.permission;

import android.os.Process;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.littleapp.entity.LittleAppPermissionData;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3376b.AbstractC67565b;
import com.tt.miniapphost.process.p3376b.C67566c;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.larkbrand.permission.k */
public class C13301k implements AbstractC13281a {

    /* renamed from: a */
    private static volatile C13301k f35206a;

    /* renamed from: b */
    private Map<IAppContext, AbstractC67565b> f35207b = new HashMap();

    private C13301k() {
    }

    /* renamed from: a */
    public static C13301k m54149a() {
        if (f35206a == null) {
            synchronized (C13301k.class) {
                if (f35206a == null) {
                    f35206a = new C13301k();
                }
            }
        }
        return f35206a;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.larkbrand.permission.k$a */
    public static class C13302a extends AbstractC67565b {

        /* renamed from: a */
        private IAppContext f35208a;

        public C13302a(IAppContext iAppContext) {
            this.f35208a = iAppContext;
        }

        @Override // com.tt.miniapphost.process.p3376b.AbstractC67565b
        /* renamed from: a */
        public void mo48980a(CrossProcessDataEntity crossProcessDataEntity) {
            Integer valueOf = Integer.valueOf(crossProcessDataEntity.mo234739a().getInt("scene", 1));
            String string = crossProcessDataEntity.mo234739a().getString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            AppBrandLogger.m52830i("UpdatePermissionAction", "Update permission in MiniAppProcess data:" + string);
            C13290f.m54130a(this.f35208a.getApplicationContext(), this.f35208a.getAppId(), JSON.parseArray(string, LittleAppPermissionData.class), this.f35208a, ((AbstractC67709b.AbstractC67710a) ((AbstractC67709b) this.f35208a.findServiceByInterface(AbstractC67709b.class)).mo235130i()).mo235054g(this.f35208a.getAppId()), valueOf);
        }
    }

    @Override // com.bytedance.ee.larkbrand.permission.AbstractC13281a
    /* renamed from: c */
    public boolean mo49520c(IAppContext iAppContext) {
        return this.f35207b.containsKey(iAppContext);
    }

    /* renamed from: d */
    public AbstractC67565b mo49536d(IAppContext iAppContext) {
        AbstractC67565b bVar = this.f35207b.get(iAppContext);
        if (bVar != null) {
            return bVar;
        }
        mo49518a(iAppContext);
        return this.f35207b.get(iAppContext);
    }

    @Override // com.bytedance.ee.larkbrand.permission.AbstractC13281a
    /* renamed from: a */
    public void mo49518a(IAppContext iAppContext) {
        AbstractC67565b bVar = this.f35207b.get(iAppContext);
        if (bVar == null) {
            bVar = new C13302a(iAppContext);
            this.f35207b.put(iAppContext, bVar);
        }
        C67566c.m262973a().mo232256a(bVar);
    }

    @Override // com.bytedance.ee.larkbrand.permission.AbstractC13281a
    /* renamed from: b */
    public void mo49519b(IAppContext iAppContext) {
        AppBrandLogger.m52830i("UpdatePermissionAction", "Unregister permission update action for Pid:" + Process.myPid());
        if (this.f35207b.containsKey(iAppContext)) {
            this.f35207b.remove(iAppContext).mo234711d();
        }
    }
}
