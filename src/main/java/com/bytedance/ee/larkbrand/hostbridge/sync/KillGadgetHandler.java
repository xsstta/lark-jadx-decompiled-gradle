package com.bytedance.ee.larkbrand.hostbridge.sync;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.process.manager.C66645a;
import com.tt.miniapp.process.manager.IAppSandboxEnvProcessor;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3378d.AbstractC67571b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\tH\u0002¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/larkbrand/hostbridge/sync/KillGadgetHandler;", "Lcom/tt/miniapphost/process/handler/ISyncHostDataHandler;", "()V", "action", "Lcom/tt/miniapphost/process/data/CrossProcessDataEntity;", "callData", "getType", "", "isAppRunning", "", "appId", "result", "isRunning", "Companion", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkbrand.hostbridge.sync.e */
public final class KillGadgetHandler implements AbstractC67571b {

    /* renamed from: a */
    public static final Companion f34805a = new Companion(null);

    @Override // com.tt.miniapphost.process.p3378d.AbstractC67571b
    /* renamed from: a */
    public String mo49139a() {
        return "killGadget";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/larkbrand/hostbridge/sync/KillGadgetHandler$Companion;", "", "()V", "TAG", "", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkbrand.hostbridge.sync.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    private final CrossProcessDataEntity m53711a(boolean z) {
        CrossProcessDataEntity b = CrossProcessDataEntity.C67574a.m263013a().mo234760a("gadgetIsRunning", (Object) Boolean.valueOf(z)).mo234763b();
        Intrinsics.checkExpressionValueIsNotNull(b, "CrossProcessDataEntity.B…\n                .build()");
        return b;
    }

    /* renamed from: a */
    private final boolean m53712a(String str) {
        if (C66645a.m260337a().mo232354a(str) != null) {
            AppBrandLogger.m52830i("KillGadgetHandler", "appId: ", str, " is running!");
            return true;
        }
        AppBrandLogger.m52830i("KillGadgetHandler", "appId: ", str, " is not running!");
        return false;
    }

    @Override // com.tt.miniapphost.process.p3378d.AbstractC67571b
    /* renamed from: a */
    public CrossProcessDataEntity mo49138a(CrossProcessDataEntity crossProcessDataEntity) {
        if (crossProcessDataEntity == null) {
            return m53711a(false);
        }
        String b = crossProcessDataEntity.mo234744b("miniAppId");
        boolean a = m53712a(b);
        AppBrandLogger.m52830i("KillGadgetHandler", "appId: " + b + ", running: " + a);
        IAppSandboxEnvProcessor e = C66645a.m260337a().mo232363e(b);
        if (e == null) {
            AppBrandLogger.m52830i("KillGadgetHandler", "appId: " + b + ", sandboxEnvProcessor is null");
            return m53711a(false);
        }
        e.killSandBoxByAppId(b);
        AppBrandLogger.m52830i("KillGadgetHandler", "kill appId: " + b + " done");
        return m53711a(a);
    }
}
