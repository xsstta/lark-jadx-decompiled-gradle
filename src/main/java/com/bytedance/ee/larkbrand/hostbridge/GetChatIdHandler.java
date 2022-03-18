package com.bytedance.ee.larkbrand.hostbridge;

import com.ss.android.lark.littleapp.AbstractC41371j;
import com.ss.android.lark.littleapp.entity.ChatModel;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3378d.AbstractC67571b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/larkbrand/hostbridge/GetChatIdHandler;", "Lcom/tt/miniapphost/process/handler/ISyncHostDataHandler;", "miniAppCallback", "Lcom/ss/android/lark/littleapp/MiniAppCallback;", "(Lcom/ss/android/lark/littleapp/MiniAppCallback;)V", "action", "Lcom/tt/miniapphost/process/data/CrossProcessDataEntity;", "callData", "getType", "", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkbrand.hostbridge.b */
public final class GetChatIdHandler implements AbstractC67571b {

    /* renamed from: a */
    private final AbstractC41371j f34786a;

    @Override // com.tt.miniapphost.process.p3378d.AbstractC67571b
    /* renamed from: a */
    public String mo49139a() {
        return "get_chat_by_tc";
    }

    public GetChatIdHandler(AbstractC41371j jVar) {
        Intrinsics.checkParameterIsNotNull(jVar, "miniAppCallback");
        this.f34786a = jVar;
    }

    @Override // com.tt.miniapphost.process.p3378d.AbstractC67571b
    /* renamed from: a */
    public CrossProcessDataEntity mo49138a(CrossProcessDataEntity crossProcessDataEntity) {
        if (crossProcessDataEntity != null) {
            ChatModel m = this.f34786a.mo149034m(crossProcessDataEntity.mo234744b("triggerCode"));
            CrossProcessDataEntity.C67574a a = CrossProcessDataEntity.C67574a.m263013a();
            Intrinsics.checkExpressionValueIsNotNull(m, "chatModel");
            CrossProcessDataEntity b = a.mo234760a("chat_id", (Object) m.mo148774a()).mo234760a("chat_name", (Object) m.mo148775b()).mo234760a("chat_biz_type", (Object) m.mo148776c()).mo234763b();
            Intrinsics.checkExpressionValueIsNotNull(b, "CrossProcessDataEntity.B…                 .build()");
            return b;
        }
        CrossProcessDataEntity b2 = CrossProcessDataEntity.C67574a.m263013a().mo234763b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "CrossProcessDataEntity.Builder.create().build()");
        return b2;
    }
}
