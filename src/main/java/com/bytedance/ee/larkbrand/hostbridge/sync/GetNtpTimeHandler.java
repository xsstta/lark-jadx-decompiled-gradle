package com.bytedance.ee.larkbrand.hostbridge.sync;

import com.ss.android.lark.littleapp.AbstractC41371j;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3378d.AbstractC67571b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/larkbrand/hostbridge/sync/GetNtpTimeHandler;", "Lcom/tt/miniapphost/process/handler/ISyncHostDataHandler;", "miniAppCallback", "Lcom/ss/android/lark/littleapp/MiniAppCallback;", "(Lcom/ss/android/lark/littleapp/MiniAppCallback;)V", "getMiniAppCallback", "()Lcom/ss/android/lark/littleapp/MiniAppCallback;", "setMiniAppCallback", "action", "Lcom/tt/miniapphost/process/data/CrossProcessDataEntity;", "callData", "getType", "", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkbrand.hostbridge.sync.c */
public final class GetNtpTimeHandler implements AbstractC67571b {

    /* renamed from: a */
    private AbstractC41371j f34804a;

    @Override // com.tt.miniapphost.process.p3378d.AbstractC67571b
    /* renamed from: a */
    public String mo49139a() {
        return "get_ntp_time";
    }

    public GetNtpTimeHandler(AbstractC41371j jVar) {
        Intrinsics.checkParameterIsNotNull(jVar, "miniAppCallback");
        this.f34804a = jVar;
    }

    @Override // com.tt.miniapphost.process.p3378d.AbstractC67571b
    /* renamed from: a */
    public CrossProcessDataEntity mo49138a(CrossProcessDataEntity crossProcessDataEntity) {
        CrossProcessDataEntity b = CrossProcessDataEntity.C67574a.m263013a().mo234760a("ntp_time", (Object) this.f34804a.mo149039o()).mo234763b();
        Intrinsics.checkExpressionValueIsNotNull(b, "CrossProcessDataEntity.B…\n                .build()");
        return b;
    }
}
