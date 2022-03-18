package com.bytedance.ee.larkbrand.hostbridge.inner;

import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.service.ExtensionWrapper;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3378d.AbstractC67571b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/larkbrand/hostbridge/inner/GetUserInfoHandler;", "Lcom/tt/miniapphost/process/handler/ISyncHostDataHandler;", "()V", "action", "Lcom/tt/miniapphost/process/data/CrossProcessDataEntity;", "callData", "getType", "", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkbrand.hostbridge.b.d */
public final class GetUserInfoHandler implements AbstractC67571b {
    @Override // com.tt.miniapphost.process.p3378d.AbstractC67571b
    /* renamed from: a */
    public String mo49139a() {
        return "getUserInfo";
    }

    @Override // com.tt.miniapphost.process.p3378d.AbstractC67571b
    /* renamed from: a */
    public CrossProcessDataEntity mo49138a(CrossProcessDataEntity crossProcessDataEntity) {
        CrossProcessDataEntity.C67574a a = CrossProcessDataEntity.C67574a.m263013a();
        LarkExtensionManager instance = LarkExtensionManager.getInstance();
        Intrinsics.checkExpressionValueIsNotNull(instance, "LarkExtensionManager.getInstance()");
        ExtensionWrapper extension = instance.getExtension();
        Intrinsics.checkExpressionValueIsNotNull(extension, "LarkExtensionManager.getInstance().extension");
        CrossProcessDataEntity b = a.mo234760a("sessionId", (Object) extension.mo49565b()).mo234760a("isLogin", (Object) true).mo234763b();
        Intrinsics.checkExpressionValueIsNotNull(b, "CrossProcessDataEntity.B…\n                .build()");
        return b;
    }
}
