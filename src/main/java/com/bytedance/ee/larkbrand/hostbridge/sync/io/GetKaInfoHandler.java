package com.bytedance.ee.larkbrand.hostbridge.sync.io;

import com.ss.android.lark.littleapp.AbstractC41371j;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3378d.AbstractC67571b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/larkbrand/hostbridge/sync/io/GetKaInfoHandler;", "Lcom/tt/miniapphost/process/handler/ISyncHostDataHandler;", "miniAppCallback", "Lcom/ss/android/lark/littleapp/MiniAppCallback;", "(Lcom/ss/android/lark/littleapp/MiniAppCallback;)V", "getMiniAppCallback", "()Lcom/ss/android/lark/littleapp/MiniAppCallback;", "action", "Lcom/tt/miniapphost/process/data/CrossProcessDataEntity;", "callData", "getType", "", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkbrand.hostbridge.sync.b.a */
public final class GetKaInfoHandler implements AbstractC67571b {

    /* renamed from: a */
    private final AbstractC41371j f34799a;

    @Override // com.tt.miniapphost.process.p3378d.AbstractC67571b
    /* renamed from: a */
    public String mo49139a() {
        return "lak_getKaInfo";
    }

    public GetKaInfoHandler(AbstractC41371j jVar) {
        Intrinsics.checkParameterIsNotNull(jVar, "miniAppCallback");
        this.f34799a = jVar;
    }

    @Override // com.tt.miniapphost.process.p3378d.AbstractC67571b
    /* renamed from: a */
    public CrossProcessDataEntity mo49138a(CrossProcessDataEntity crossProcessDataEntity) {
        CrossProcessDataEntity b = CrossProcessDataEntity.C67574a.m263013a().mo234760a("channel", (Object) this.f34799a.mo149035m()).mo234763b();
        Intrinsics.checkExpressionValueIsNotNull(b, "CrossProcessDataEntity.B…Callback.channel).build()");
        return b;
    }
}
