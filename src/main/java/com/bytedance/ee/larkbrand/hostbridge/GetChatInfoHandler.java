package com.bytedance.ee.larkbrand.hostbridge;

import com.ss.android.lark.littleapp.AbstractC41371j;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3378d.AbstractC67571b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/larkbrand/hostbridge/GetChatInfoHandler;", "Lcom/tt/miniapphost/process/handler/ISyncHostDataHandler;", "miniAppCallback", "Lcom/ss/android/lark/littleapp/MiniAppCallback;", "(Lcom/ss/android/lark/littleapp/MiniAppCallback;)V", "action", "Lcom/tt/miniapphost/process/data/CrossProcessDataEntity;", "callData", "getType", "", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkbrand.hostbridge.c */
public final class GetChatInfoHandler implements AbstractC67571b {

    /* renamed from: a */
    private final AbstractC41371j f34789a;

    @Override // com.tt.miniapphost.process.p3378d.AbstractC67571b
    /* renamed from: a */
    public String mo49139a() {
        return "lark_get_chat_info";
    }

    public GetChatInfoHandler(AbstractC41371j jVar) {
        Intrinsics.checkParameterIsNotNull(jVar, "miniAppCallback");
        this.f34789a = jVar;
    }

    @Override // com.tt.miniapphost.process.p3378d.AbstractC67571b
    /* renamed from: a */
    public CrossProcessDataEntity mo49138a(CrossProcessDataEntity crossProcessDataEntity) {
        if (crossProcessDataEntity != null) {
            CrossProcessDataEntity b = CrossProcessDataEntity.C67574a.m263013a().mo234760a("chat_info", (Object) this.f34789a.mo149033l(crossProcessDataEntity.mo234744b("chat_id"))).mo234763b();
            Intrinsics.checkExpressionValueIsNotNull(b, "CrossProcessDataEntity.B…ataKey.CHAT_ID))).build()");
            return b;
        }
        CrossProcessDataEntity b2 = CrossProcessDataEntity.C67574a.m263013a().mo234763b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "CrossProcessDataEntity.Builder.create().build()");
        return b2;
    }
}
